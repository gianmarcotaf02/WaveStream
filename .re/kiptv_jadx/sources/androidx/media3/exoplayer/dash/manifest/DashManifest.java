package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public class DashManifest implements androidx.media3.exoplayer.offline.FilterableManifest<androidx.media3.exoplayer.dash.manifest.DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;
    public final android.net.Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final java.util.List<androidx.media3.exoplayer.dash.manifest.Period> periods;
    public final androidx.media3.exoplayer.dash.manifest.ProgramInformation programInformation;
    public final long publishTimeMs;
    public final androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement serviceDescription;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;
    public final androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTiming;

    public DashManifest(long j, long j9, long j10, boolean z6, long j11, long j12, long j13, long j14, androidx.media3.exoplayer.dash.manifest.ProgramInformation programInformation, androidx.media3.exoplayer.dash.manifest.UtcTimingElement utcTimingElement, androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement serviceDescriptionElement, android.net.Uri uri, java.util.List<androidx.media3.exoplayer.dash.manifest.Period> list) {
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
        this.periods = list == null ? java.util.Collections.EMPTY_LIST : list;
    }

    private static java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.AdaptationSet> copyAdaptationSets(java.util.List<androidx.media3.exoplayer.dash.manifest.AdaptationSet> list, java.util.LinkedList<androidx.media3.common.StreamKey> linkedList) {
        androidx.media3.common.StreamKey streamKeyPoll = linkedList.poll();
        int i3 = streamKeyPoll.periodIndex;
        java.util.ArrayList<androidx.media3.exoplayer.dash.manifest.AdaptationSet> arrayList = new java.util.ArrayList<>();
        do {
            int i9 = streamKeyPoll.groupIndex;
            androidx.media3.exoplayer.dash.manifest.AdaptationSet adaptationSet = list.get(i9);
            java.util.List<androidx.media3.exoplayer.dash.manifest.Representation> list2 = adaptationSet.representations;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.streamIndex));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.periodIndex != i3) {
                    break;
                }
            } while (streamKeyPoll.groupIndex == i9);
            arrayList.add(new androidx.media3.exoplayer.dash.manifest.AdaptationSet(adaptationSet.id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.essentialProperties, adaptationSet.supplementalProperties));
        } while (streamKeyPoll.periodIndex == i3);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.dash.manifest.DashManifest copy(java.util.List list) {
        return copy((java.util.List<androidx.media3.common.StreamKey>) list);
    }

    public final androidx.media3.exoplayer.dash.manifest.Period getPeriod(int i3) {
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
            if (j == androidx.media3.common.C.TIME_UNSET) {
                return androidx.media3.common.C.TIME_UNSET;
            }
            j9 = this.periods.get(i3).startMs;
        } else {
            j = this.periods.get(i3 + 1).startMs;
            j9 = this.periods.get(i3).startMs;
        }
        return j - j9;
    }

    public final long getPeriodDurationUs(int i3) {
        return androidx.media3.common.util.Util.msToUs(getPeriodDurationMs(i3));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public final androidx.media3.exoplayer.dash.manifest.DashManifest copy(java.util.List<androidx.media3.common.StreamKey> list) {
        long j;
        java.util.LinkedList linkedList = new java.util.LinkedList(list);
        java.util.Collections.sort(linkedList);
        linkedList.add(new androidx.media3.common.StreamKey(-1, -1, -1));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long j9 = 0;
        int i3 = 0;
        while (true) {
            int periodCount = getPeriodCount();
            j = androidx.media3.common.C.TIME_UNSET;
            if (i3 >= periodCount) {
                break;
            }
            if (((androidx.media3.common.StreamKey) linkedList.peek()).periodIndex != i3) {
                long periodDurationMs = getPeriodDurationMs(i3);
                if (periodDurationMs != androidx.media3.common.C.TIME_UNSET) {
                    j9 += periodDurationMs;
                }
            } else {
                androidx.media3.exoplayer.dash.manifest.Period period = getPeriod(i3);
                arrayList.add(new androidx.media3.exoplayer.dash.manifest.Period(period.id, period.startMs - j9, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i3++;
        }
        long j10 = this.durationMs;
        if (j10 != androidx.media3.common.C.TIME_UNSET) {
            j = j10 - j9;
        }
        return new androidx.media3.exoplayer.dash.manifest.DashManifest(this.availabilityStartTimeMs, j, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.serviceDescription, this.location, arrayList);
    }
}
