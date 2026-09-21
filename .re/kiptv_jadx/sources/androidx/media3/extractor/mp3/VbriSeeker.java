package androidx.media3.extractor.mp3;

/* JADX INFO: loaded from: classes.dex */
final class VbriSeeker implements androidx.media3.extractor.mp3.Seeker {
    private static final java.lang.String TAG = "VbriSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j, long j9, long j10, int i3) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j;
        this.dataStartPosition = j9;
        this.dataEndPosition = j10;
        this.bitrate = i3;
    }

    public static androidx.media3.extractor.mp3.VbriSeeker create(long j, long j9, androidx.media3.extractor.MpegAudioUtil.Header header, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int unsignedByte;
        parsableByteArray.skipBytes(6);
        int i3 = parsableByteArray.readInt();
        long j10 = j9 + ((long) header.frameSize);
        long jMax = ((long) i3) + j10;
        int i9 = parsableByteArray.readInt();
        if (i9 <= 0) {
            return null;
        }
        long jSampleCountToDurationUs = androidx.media3.common.util.Util.sampleCountToDurationUs((((long) i9) * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        int unsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        int i10 = unsignedShort2;
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i11 = 0;
        long j11 = j9 + ((long) header.frameSize);
        while (i11 < unsignedShort) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i11] = (((long) i11) * jSampleCountToDurationUs) / ((long) unsignedShort);
            jArr3[i11] = j11;
            if (unsignedShort3 == 1) {
                unsignedByte = parsableByteArray.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = parsableByteArray.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            int i12 = i11;
            int i13 = i10;
            j11 += ((long) unsignedByte) * ((long) i13);
            i10 = i13;
            i11 = i12 + 1;
            unsignedShort = unsignedShort;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j != -1 && j != jMax) {
            java.lang.StringBuilder sbU = p121o0.p.u(j, "VBRI data size mismatch: ", ", ");
            sbU.append(jMax);
            androidx.media3.common.util.Log.w(TAG, sbU.toString());
        }
        if (jMax != j11) {
            java.lang.StringBuilder sbU2 = p121o0.p.u(jMax, "VBRI bytes and ToC mismatch (using max): ", ", ");
            sbU2.append(j11);
            sbU2.append("\nSeeking will be inaccurate.");
            androidx.media3.common.util.Log.w(TAG, sbU2.toString());
            jMax = java.lang.Math.max(jMax, j11);
        }
        return new androidx.media3.extractor.mp3.VbriSeeker(jArr6, jArr5, jSampleCountToDurationUs, j10, jMax, header.bitrate);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return this.dataStartPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
        int iBinarySearchFloor = androidx.media3.common.util.Util.binarySearchFloor(this.timesUs, j, true, true);
        androidx.media3.extractor.SeekPoint seekPoint = new androidx.media3.extractor.SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs >= j || iBinarySearchFloor == this.timesUs.length - 1) {
            return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint);
        }
        int i3 = iBinarySearchFloor + 1;
        return new androidx.media3.extractor.SeekMap.SeekPoints(seekPoint, new androidx.media3.extractor.SeekPoint(this.timesUs[i3], this.positions[i3]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.timesUs[androidx.media3.common.util.Util.binarySearchFloor(this.positions, j, true, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
