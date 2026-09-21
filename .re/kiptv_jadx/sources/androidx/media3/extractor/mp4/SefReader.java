package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
final class SefReader {
    private static final int LENGTH_OF_ONE_SDR = 12;
    private static final int SAMSUNG_TAIL_SIGNATURE = 1397048916;
    private static final int STATE_CHECKING_FOR_SEF = 1;
    private static final int STATE_READING_SDRS = 2;
    private static final int STATE_READING_SEF_DATA = 3;
    private static final int STATE_SHOULD_CHECK_FOR_SEF = 0;
    private static final java.lang.String TAG = "SefReader";
    private static final int TAIL_FOOTER_LENGTH = 8;
    private static final int TAIL_HEADER_LENGTH = 12;
    private static final int TYPE_SLOW_MOTION_DATA = 2192;
    private static final int TYPE_SUPER_SLOW_DEFLICKERING_ON = 2820;
    private static final int TYPE_SUPER_SLOW_MOTION_BGM = 2817;
    private static final int TYPE_SUPER_SLOW_MOTION_DATA = 2816;
    private static final int TYPE_SUPER_SLOW_MOTION_EDIT_DATA = 2819;
    private final java.util.List<androidx.media3.extractor.mp4.SefReader.DataReference> dataReferences = new java.util.ArrayList();
    private int readerState = 0;
    private int tailLength;
    private static final p068h4.u COLON_SPLITTER = p068h4.u.a(':');
    private static final p068h4.u ASTERISK_SPLITTER = p068h4.u.a(io.ktor.util.date.GMTDateParser.ANY);

    public static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int i3, long j, int i9) {
            this.dataType = i3;
            this.startOffset = j;
            this.size = i9;
        }
    }

    private void checkForSefData(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.tailLength = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != SAMSUNG_TAIL_SIGNATURE) {
            positionHolder.position = 0L;
        } else {
            positionHolder.position = extractorInput.getPosition() - ((long) (this.tailLength - 12));
            this.readerState = 2;
        }
    }

    private static int nameToDataType(java.lang.String str) throws androidx.media3.common.ParserException {
        str.getClass();
        switch (str) {
            case "SlowMotion_Data":
                return TYPE_SLOW_MOTION_DATA;
            case "Super_SlowMotion_Edit_Data":
                return TYPE_SUPER_SLOW_MOTION_EDIT_DATA;
            case "Super_SlowMotion_Data":
                return TYPE_SUPER_SLOW_MOTION_DATA;
            case "Super_SlowMotion_Deflickering_On":
                return TYPE_SUPER_SLOW_DEFLICKERING_ON;
            case "Super_SlowMotion_BGM":
                return TYPE_SUPER_SLOW_MOTION_BGM;
            default:
                throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    private void readSdrs(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        long length = extractorInput.getLength();
        int i3 = this.tailLength - 20;
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(i3);
        extractorInput.readFully(parsableByteArray.getData(), 0, i3);
        for (int i9 = 0; i9 < i3 / 12; i9++) {
            parsableByteArray.skipBytes(2);
            short littleEndianShort = parsableByteArray.readLittleEndianShort();
            if (littleEndianShort == TYPE_SLOW_MOTION_DATA || littleEndianShort == TYPE_SUPER_SLOW_MOTION_DATA || littleEndianShort == TYPE_SUPER_SLOW_MOTION_BGM || littleEndianShort == TYPE_SUPER_SLOW_MOTION_EDIT_DATA || littleEndianShort == TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                this.dataReferences.add(new androidx.media3.extractor.mp4.SefReader.DataReference(littleEndianShort, (length - ((long) this.tailLength)) - ((long) parsableByteArray.readLittleEndianInt()), parsableByteArray.readLittleEndianInt()));
            } else {
                parsableByteArray.skipBytes(8);
            }
        }
        if (this.dataReferences.isEmpty()) {
            positionHolder.position = 0L;
        } else {
            this.readerState = 3;
            positionHolder.position = this.dataReferences.get(0).startOffset;
        }
    }

    private void readSefData(androidx.media3.extractor.ExtractorInput extractorInput, java.util.List<androidx.media3.common.Metadata.Entry> list) throws androidx.media3.common.ParserException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - ((long) this.tailLength));
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i3 = 0; i3 < this.dataReferences.size(); i3++) {
            androidx.media3.extractor.mp4.SefReader.DataReference dataReference = this.dataReferences.get(i3);
            parsableByteArray.setPosition((int) (dataReference.startOffset - position));
            parsableByteArray.skipBytes(4);
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int iNameToDataType = nameToDataType(parsableByteArray.readString(littleEndianInt));
            int i9 = dataReference.size - (littleEndianInt + 8);
            if (iNameToDataType == TYPE_SLOW_MOTION_DATA) {
                list.add(readSlowMotionData(parsableByteArray, i9));
            } else if (iNameToDataType != TYPE_SUPER_SLOW_MOTION_DATA && iNameToDataType != TYPE_SUPER_SLOW_MOTION_BGM && iNameToDataType != TYPE_SUPER_SLOW_MOTION_EDIT_DATA && iNameToDataType != TYPE_SUPER_SLOW_DEFLICKERING_ON) {
                throw new java.lang.IllegalStateException();
            }
        }
    }

    private static androidx.media3.extractor.metadata.mp4.SlowMotionData readSlowMotionData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i3) throws androidx.media3.common.ParserException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listC = ASTERISK_SPLITTER.c(parsableByteArray.readString(i3));
        for (int i9 = 0; i9 < listC.size(); i9++) {
            java.util.List listC2 = COLON_SPLITTER.c((java.lang.CharSequence) listC.get(i9));
            if (listC2.size() != 3) {
                throw androidx.media3.common.ParserException.createForMalformedContainer(null, null);
            }
            try {
                arrayList.add(new androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment(java.lang.Long.parseLong((java.lang.String) listC2.get(0)), java.lang.Long.parseLong((java.lang.String) listC2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) listC2.get(2)) - 1)));
            } catch (java.lang.NumberFormatException e6) {
                throw androidx.media3.common.ParserException.createForMalformedContainer(null, e6);
            }
        }
        return new androidx.media3.extractor.metadata.mp4.SlowMotionData(arrayList);
    }

    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder, java.util.List<androidx.media3.common.Metadata.Entry> list) {
        int i3 = this.readerState;
        long j = 0;
        if (i3 == 0) {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            positionHolder.position = j;
            this.readerState = 1;
        } else if (i3 == 1) {
            checkForSefData(extractorInput, positionHolder);
        } else if (i3 == 2) {
            readSdrs(extractorInput, positionHolder);
        } else {
            if (i3 != 3) {
                throw new java.lang.IllegalStateException();
            }
            readSefData(extractorInput, list);
            positionHolder.position = 0L;
        }
        return 1;
    }

    public void reset() {
        this.dataReferences.clear();
        this.readerState = 0;
    }
}
