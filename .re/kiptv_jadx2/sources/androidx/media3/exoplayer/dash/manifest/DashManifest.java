package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.media3.common.C;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.offline.FilterableManifest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DashManifest implements FilterableManifest<DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;
    public final ProgramInformation programInformation;
    public final long publishTimeMs;
    public final ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;
    public final UtcTimingElement utcTiming;

    public DashManifest(long j, long j9, long j10, boolean z6, long j11, long j12, long j13, long j14, ProgramInformation programInformation, UtcTimingElement utcTimingElement, ServiceDescriptionElement serviceDescriptionElement, Uri uri, List<Period> list) {
        this.availabilityStartTimeMs = j;
        this.durationMs = j9;
        this.minBufferTimeMs = j10;
        this.dynamic = z6;
        this.minUpdatePeriodMs = j11;
        this.timeShiftBufferDepthMs = j12;
        this.suggestedPresentationDelayMs = j13;
        this.publishTimeMs = j14;
        this.programInformation = programInformation;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.serviceDescription = serviceDescriptionElement;
        this.periods = list == null ? Collections.EMPTY_LIST : list;
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i3 = streamKeyPoll.periodIndex;
        ArrayList<AdaptationSet> arrayList = new ArrayList<>();
        do {
            int i9 = streamKeyPoll.groupIndex;
            AdaptationSet adaptationSet = list.get(i9);
            List<Representation> list2 = adaptationSet.representations;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.streamIndex));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.periodIndex != i3) {
                    break;
                }
            } while (streamKeyPoll.groupIndex == i9);
            arrayList.add(new AdaptationSet(adaptationSet.id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.essentialProperties, adaptationSet.supplementalProperties));
        } while (streamKeyPoll.periodIndex == i3);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    @Override
    public DashManifest copy(List list) {
        return copy((List<StreamKey>) list);
    }

    public final Period getPeriod(int i3) {
        return this.periods.get(i3);
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final long getPeriodDurationMs(int i3) {
        long j;
        long j9;
        if (i3 == this.periods.size() - 1) {
            j = this.durationMs;
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j9 = this.periods.get(i3).startMs;
        } else {
            j = this.periods.get(i3 + 1).startMs;
            j9 = this.periods.get(i3).startMs;
        }
        return j - j9;
    }

    public final long getPeriodDurationUs(int i3) {
        return Util.msToUs(getPeriodDurationMs(i3));
    }

    @Override
    public final DashManifest copy(List<StreamKey> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        int i3 = 0;
        while (true) {
            int periodCount = getPeriodCount();
            j = C.TIME_UNSET;
            if (i3 >= periodCount) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i3) {
                long periodDurationMs = getPeriodDurationMs(i3);
                if (periodDurationMs != C.TIME_UNSET) {
                    j9 += periodDurationMs;
                }
            } else {
                Period period = getPeriod(i3);
                arrayList.add(new Period(period.id, period.startMs - j9, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i3++;
        }
        long j10 = this.durationMs;
        if (j10 != C.TIME_UNSET) {
            j = j10 - j9;
        }
        return new DashManifest(this.availabilityStartTimeMs, j, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.serviceDescription, this.location, arrayList);
    }
}
