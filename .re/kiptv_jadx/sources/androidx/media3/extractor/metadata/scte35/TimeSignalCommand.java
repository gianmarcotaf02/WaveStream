package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public final long playbackPositionUs;
    public final long ptsTime;

    private TimeSignalCommand(long j, long j9) {
        this.ptsTime = j;
        this.playbackPositionUs = j9;
    }

    public static androidx.media3.extractor.metadata.scte35.TimeSignalCommand parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        long spliceTime = parseSpliceTime(parsableByteArray, j);
        return new androidx.media3.extractor.metadata.scte35.TimeSignalCommand(spliceTime, timestampAdjuster.adjustTsTimestamp(spliceTime));
    }

    public static long parseSpliceTime(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) {
        long unsignedByte = parsableByteArray.readUnsignedByte();
        return (128 & unsignedByte) != 0 ? 8589934591L & ((((unsignedByte & 1) << 32) | parsableByteArray.readUnsignedInt()) + j) : androidx.media3.common.C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.ptsTime);
        sb.append(", playbackPositionUs= ");
        return Y6.f.g(this.playbackPositionUs, " }", sb);
    }
}
