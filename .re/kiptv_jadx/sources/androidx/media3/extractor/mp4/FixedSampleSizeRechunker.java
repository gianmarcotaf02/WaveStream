package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
final class FixedSampleSizeRechunker {
    private static final int MAX_SAMPLE_SIZE = 8192;

    public static final class Results {
        public final long duration;
        public final int[] flags;
        public final int maximumSize;
        public final long[] offsets;
        public final int[] sizes;
        public final long[] timestamps;
        public final long totalSize;

        private Results(long[] jArr, int[] iArr, int i3, long[] jArr2, int[] iArr2, long j, long j9) {
            this.offsets = jArr;
            this.sizes = iArr;
            this.maximumSize = i3;
            this.timestamps = jArr2;
            this.flags = iArr2;
            this.duration = j;
            this.totalSize = j9;
        }
    }

    private FixedSampleSizeRechunker() {
    }

    public static androidx.media3.extractor.mp4.FixedSampleSizeRechunker.Results rechunk(int i3, long[] jArr, int[] iArr, long j) {
        int[] iArr2 = iArr;
        int i9 = 8192 / i3;
        int i10 = 0;
        int iCeilDivide = 0;
        for (int i11 : iArr2) {
            iCeilDivide += androidx.media3.common.util.Util.ceilDivide(i11, i9);
        }
        long[] jArr2 = new long[iCeilDivide];
        int[] iArr3 = new int[iCeilDivide];
        long[] jArr3 = new long[iCeilDivide];
        int[] iArr4 = new int[iCeilDivide];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        while (i10 < iArr2.length) {
            int i15 = iArr2[i10];
            long j9 = jArr[i10];
            while (i15 > 0) {
                int iMin = java.lang.Math.min(i9, i15);
                jArr2[i14] = j9;
                int i16 = i3 * iMin;
                iArr3[i14] = i16;
                i13 += i16;
                iMax = java.lang.Math.max(iMax, i16);
                jArr3[i14] = ((long) i12) * j;
                iArr4[i14] = 1;
                j9 += (long) iArr3[i14];
                i12 += iMin;
                i15 -= iMin;
                i14++;
                i9 = i9;
            }
            i10++;
            iArr2 = iArr;
        }
        return new androidx.media3.extractor.mp4.FixedSampleSizeRechunker.Results(jArr2, iArr3, iMax, jArr3, iArr4, j * ((long) i12), i13);
    }
}
