package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends androidx.media3.extractor.metadata.scte35.SpliceCommand {
    public final java.util.List<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event> events;

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int i3, long j) {
            this.componentTag = i3;
            this.utcSpliceTime = j;
        }
    }

    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final java.util.List<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j, boolean z6, boolean z9, boolean z10, java.util.List<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice> list, long j9, boolean z11, long j10, int i3, int i9, int i10) {
            this.spliceEventId = j;
            this.spliceEventCancelIndicator = z6;
            this.outOfNetworkIndicator = z9;
            this.programSpliceFlag = z10;
            this.componentSpliceList = java.util.Collections.unmodifiableList(list);
            this.utcSpliceTime = j9;
            this.autoReturn = z11;
            this.breakDurationUs = j10;
            this.uniqueProgramId = i3;
            this.availNum = i9;
            this.availsExpected = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
            java.util.ArrayList arrayList;
            boolean z6;
            boolean z9;
            long j;
            boolean z10;
            long j9;
            int i3;
            int i9;
            int unsignedByte;
            boolean z11;
            long unsignedInt;
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            boolean z12 = true;
            if ((parsableByteArray.readUnsignedByte() & 128) == 0) {
                z12 = false;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (z12) {
                arrayList = arrayList2;
                z6 = false;
                z9 = false;
                j = androidx.media3.common.C.TIME_UNSET;
                z10 = false;
                j9 = androidx.media3.common.C.TIME_UNSET;
                i3 = 0;
                i9 = 0;
                unsignedByte = 0;
            } else {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                boolean z13 = (unsignedByte2 & 128) != 0;
                boolean z14 = (unsignedByte2 & 64) != 0 ? z12 : false;
                boolean z15 = (unsignedByte2 & 32) != 0 ? z12 : false;
                long unsignedInt3 = z14 ? parsableByteArray.readUnsignedInt() : androidx.media3.common.C.TIME_UNSET;
                if (!z14) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(unsignedByte3);
                    int i10 = 0;
                    while (i10 < unsignedByte3) {
                        arrayList3.add(new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                        i10++;
                        unsignedByte3 = unsignedByte3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z15) {
                    long unsignedByte4 = parsableByteArray.readUnsignedByte();
                    boolean z16 = (128 & unsignedByte4) != 0;
                    unsignedInt = ((((unsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z11 = z16;
                } else {
                    z11 = false;
                    unsignedInt = androidx.media3.common.C.TIME_UNSET;
                }
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                boolean z17 = z13;
                z10 = z11;
                z6 = z17;
                unsignedByte = parsableByteArray.readUnsignedByte();
                long j10 = unsignedInt3;
                i3 = unsignedShort;
                i9 = unsignedByte5;
                long j11 = unsignedInt;
                arrayList = arrayList2;
                z9 = z14;
                j = j10;
                j9 = j11;
            }
            return new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event(unsignedInt2, z12, z6, z9, arrayList, j, z10, j9, i3, i9, unsignedByte);
        }
    }

    private SpliceScheduleCommand(java.util.List<androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event> list) {
        this.events = java.util.Collections.unmodifiableList(list);
    }

    public static androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand parseFromSection(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        java.util.ArrayList arrayList = new java.util.ArrayList(unsignedByte);
        for (int i3 = 0; i3 < unsignedByte; i3++) {
            arrayList.add(androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.Event.parseFromSection(parsableByteArray));
        }
        return new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand(arrayList);
    }
}
