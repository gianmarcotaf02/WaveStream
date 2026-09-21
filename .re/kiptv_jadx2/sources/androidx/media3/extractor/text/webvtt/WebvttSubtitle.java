package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class WebvttSubtitle implements Subtitle {
    private final List<WebvttCueInfo> cueInfos;
    private final long[] cueTimesUs;
    private final long[] sortedCueTimesUs;

    public WebvttSubtitle(List<WebvttCueInfo> list) {
        this.cueInfos = Collections.unmodifiableList(new ArrayList(list));
        this.cueTimesUs = new long[list.size() * 2];
        for (int i3 = 0; i3 < list.size(); i3++) {
            WebvttCueInfo webvttCueInfo = list.get(i3);
            int i9 = i3 * 2;
            long[] jArr = this.cueTimesUs;
            jArr[i9] = webvttCueInfo.startTimeUs;
            jArr[i9 + 1] = webvttCueInfo.endTimeUs;
        }
        long[] jArr2 = this.cueTimesUs;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.sortedCueTimesUs = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public static int lambda$getCues$0(WebvttCueInfo webvttCueInfo, WebvttCueInfo webvttCueInfo2) {
        return Long.compare(webvttCueInfo.startTimeUs, webvttCueInfo2.startTimeUs);
    }

    @Override
    public List<Cue> getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < this.cueInfos.size(); i3++) {
            long[] jArr = this.cueTimesUs;
            int i9 = i3 * 2;
            if (jArr[i9] <= j && j < jArr[i9 + 1]) {
                WebvttCueInfo webvttCueInfo = this.cueInfos.get(i3);
                Cue cue = webvttCueInfo.cue;
                if (cue.line == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        Collections.sort(arrayList2, new a(1));
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            arrayList.add(((WebvttCueInfo) arrayList2.get(i10)).cue.buildUpon().setLine((-1) - i10, 1).build());
        }
        return arrayList;
    }

    @Override
    public long getEventTime(int i3) {
        AbstractC1864o0.L(i3 >= 0);
        AbstractC1864o0.L(i3 < this.sortedCueTimesUs.length);
        return this.sortedCueTimesUs[i3];
    }

    @Override
    public int getEventTimeCount() {
        return this.sortedCueTimesUs.length;
    }

    @Override
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.sortedCueTimesUs, j, false, false);
        if (iBinarySearchCeil < this.sortedCueTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
