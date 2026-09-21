package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
final class WebvttSubtitle implements androidx.media3.extractor.text.Subtitle {
    private final java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueInfo> cueInfos;
    private final long[] cueTimesUs;
    private final long[] sortedCueTimesUs;

    public WebvttSubtitle(java.util.List<androidx.media3.extractor.text.webvtt.WebvttCueInfo> list) {
        this.cueInfos = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        this.cueTimesUs = new long[list.size() * 2];
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.extractor.text.webvtt.WebvttCueInfo webvttCueInfo = list.get(i3);
            int i9 = i3 * 2;
            long[] jArr = this.cueTimesUs;
            jArr[i9] = webvttCueInfo.startTimeUs;
            jArr[i9 + 1] = webvttCueInfo.endTimeUs;
        }
        long[] jArr2 = this.cueTimesUs;
        long[] jArrCopyOf = java.util.Arrays.copyOf(jArr2, jArr2.length);
        this.sortedCueTimesUs = jArrCopyOf;
        java.util.Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getCues$0(androidx.media3.extractor.text.webvtt.WebvttCueInfo webvttCueInfo, androidx.media3.extractor.text.webvtt.WebvttCueInfo webvttCueInfo2) {
        return java.lang.Long.compare(webvttCueInfo.startTimeUs, webvttCueInfo2.startTimeUs);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public java.util.List<androidx.media3.common.text.Cue> getCues(long j) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i3 = 0; i3 < this.cueInfos.size(); i3++) {
            long[] jArr = this.cueTimesUs;
            int i9 = i3 * 2;
            if (jArr[i9] <= j && j < jArr[i9 + 1]) {
                androidx.media3.extractor.text.webvtt.WebvttCueInfo webvttCueInfo = this.cueInfos.get(i3);
                androidx.media3.common.text.Cue cue = webvttCueInfo.cue;
                if (cue.line == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
        }
        java.util.Collections.sort(arrayList2, new androidx.media3.extractor.text.webvtt.a(1));
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            arrayList.add(((androidx.media3.extractor.text.webvtt.WebvttCueInfo) arrayList2.get(i10)).cue.buildUpon().setLine((-1) - i10, 1).build());
        }
        return arrayList;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 >= 0);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 < this.sortedCueTimesUs.length);
        return this.sortedCueTimesUs[i3];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.sortedCueTimesUs.length;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int iBinarySearchCeil = androidx.media3.common.util.Util.binarySearchCeil(this.sortedCueTimesUs, j, false, false);
        if (iBinarySearchCeil < this.sortedCueTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }
}
