package androidx.media3.extractor.metadata.scte35;

import Y6.f;
import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;

public final class TimeSignalCommand extends SpliceCommand {
    public final long playbackPositionUs;
    public final long ptsTime;

    private TimeSignalCommand(long j, long j9) {
        this.ptsTime = j;
        this.playbackPositionUs = j9;
    }

    public static TimeSignalCommand parseFromSection(ParsableByteArray parsableByteArray, long j, TimestampAdjuster timestampAdjuster) {
        long spliceTime = parseSpliceTime(parsableByteArray, j);
        return new TimeSignalCommand(spliceTime, timestampAdjuster.adjustTsTimestamp(spliceTime));
    }

    public static long parseSpliceTime(ParsableByteArray parsableByteArray, long j) {
        long unsignedByte = parsableByteArray.readUnsignedByte();
        return (128 & unsignedByte) != 0 ? 8589934591L & ((((unsignedByte & 1) << 32) | parsableByteArray.readUnsignedInt()) + j) : C.TIME_UNSET;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.ptsTime);
        sb.append(", playbackPositionUs= ");
        return f.g(this.playbackPositionUs, " }", sb);
    }
}
