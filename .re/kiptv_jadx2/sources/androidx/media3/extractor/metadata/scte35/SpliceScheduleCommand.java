package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public final List<Event> events;

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
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j, boolean z6, boolean z9, boolean z10, List<ComponentSplice> list, long j9, boolean z11, long j10, int i3, int i9, int i10) {
            this.spliceEventId = j;
            this.spliceEventCancelIndicator = z6;
            this.outOfNetworkIndicator = z9;
            this.programSpliceFlag = z10;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j9;
            this.autoReturn = z11;
            this.breakDurationUs = j10;
            this.uniqueProgramId = i3;
            this.availNum = i9;
            this.availsExpected = i10;
        }

        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            ArrayList arrayList;
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
            ArrayList arrayList2 = new ArrayList();
            if (z12) {
                arrayList = arrayList2;
                z6 = false;
                z9 = false;
                j = C.TIME_UNSET;
                z10 = false;
                j9 = C.TIME_UNSET;
                i3 = 0;
                i9 = 0;
                unsignedByte = 0;
            } else {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                boolean z13 = (unsignedByte2 & 128) != 0;
                boolean z14 = (unsignedByte2 & 64) != 0 ? z12 : false;
                boolean z15 = (unsignedByte2 & 32) != 0 ? z12 : false;
                long unsignedInt3 = z14 ? parsableByteArray.readUnsignedInt() : C.TIME_UNSET;
                if (!z14) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte3);
                    int i10 = 0;
                    while (i10 < unsignedByte3) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
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
                    unsignedInt = C.TIME_UNSET;
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
            return new Event(unsignedInt2, z12, z6, z9, arrayList, j, z10, j9, i3, i9, unsignedByte);
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i3 = 0; i3 < unsignedByte; i3++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }
}
