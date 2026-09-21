package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final java.util.List<androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        private ComponentSplice(int i3, long j, long j9) {
            this.componentTag = i3;
            this.componentSplicePts = j;
            this.componentSplicePlaybackPositionUs = j9;
        }
    }

    private SpliceInsertCommand(long j, boolean z6, boolean z9, boolean z10, boolean z11, long j9, long j10, java.util.List<androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice> list, boolean z12, long j11, int i3, int i9, int i10) {
        this.spliceEventId = j;
        this.spliceEventCancelIndicator = z6;
        this.outOfNetworkIndicator = z9;
        this.programSpliceFlag = z10;
        this.spliceImmediateFlag = z11;
        this.programSplicePts = j9;
        this.programSplicePlaybackPositionUs = j10;
        this.componentSpliceList = java.util.Collections.unmodifiableList(list);
        this.autoReturn = z12;
        this.breakDurationUs = j11;
        this.uniqueProgramId = i3;
        this.availNum = i9;
        this.availsExpected = i10;
    }

    public static androidx.media3.extractor.metadata.scte35.SpliceInsertCommand parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        java.util.List list;
        long j9;
        boolean z6;
        boolean z9;
        boolean z10;
        boolean z11;
        int i3;
        int unsignedByte;
        int unsignedByte2;
        boolean z12;
        long unsignedInt = parsableByteArray.readUnsignedInt();
        boolean z13 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        java.util.List list2 = java.util.Collections.EMPTY_LIST;
        long unsignedInt2 = androidx.media3.common.C.TIME_UNSET;
        if (z13) {
            list = list2;
            j9 = -9223372036854775807L;
            z6 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            i3 = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            boolean z14 = (unsignedByte3 & 128) != 0;
            boolean z15 = (unsignedByte3 & 64) != 0;
            boolean z16 = (unsignedByte3 & 32) != 0;
            boolean z17 = (unsignedByte3 & 16) != 0;
            long spliceTime = (!z15 || z17) ? -9223372036854775807L : androidx.media3.extractor.metadata.scte35.TimeSignalCommand.parseSpliceTime(parsableByteArray, j);
            if (!z15) {
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                java.util.ArrayList arrayList = new java.util.ArrayList(unsignedByte4);
                int i9 = 0;
                while (i9 < unsignedByte4) {
                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                    long spliceTime2 = !z17 ? androidx.media3.extractor.metadata.scte35.TimeSignalCommand.parseSpliceTime(parsableByteArray, j) : -9223372036854775807L;
                    arrayList.add(new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.ComponentSplice(unsignedByte5, spliceTime2, timestampAdjuster.adjustTsTimestamp(spliceTime2)));
                    i9++;
                    unsignedByte4 = unsignedByte4;
                }
                list2 = arrayList;
            }
            if (z16) {
                long unsignedByte6 = parsableByteArray.readUnsignedByte();
                boolean z18 = (128 & unsignedByte6) != 0;
                unsignedInt2 = ((((unsignedByte6 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z12 = z18;
            } else {
                z12 = false;
            }
            int unsignedShort = parsableByteArray.readUnsignedShort();
            long j10 = spliceTime;
            j9 = unsignedInt2;
            unsignedInt2 = j10;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            i3 = unsignedShort;
            z11 = z12;
            z6 = z14;
            z9 = z15;
            list = list2;
            z10 = z17;
        }
        return new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand(unsignedInt, z13, z6, z9, z10, unsignedInt2, timestampAdjuster.adjustTsTimestamp(unsignedInt2), list, z11, j9, i3, unsignedByte, unsignedByte2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.programSplicePts);
        sb.append(", programSplicePlaybackPositionUs= ");
        return Y6.f.g(this.programSplicePlaybackPositionUs, " }", sb);
    }
}
