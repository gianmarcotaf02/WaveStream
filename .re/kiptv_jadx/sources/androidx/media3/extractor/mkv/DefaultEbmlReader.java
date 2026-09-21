package androidx.media3.extractor.mkv;

/* JADX INFO: loaded from: classes.dex */
final class DefaultEbmlReader implements androidx.media3.extractor.mkv.EbmlReader {
    private static final int ELEMENT_STATE_READ_CONTENT = 2;
    private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
    private static final int ELEMENT_STATE_READ_ID = 0;
    private static final int MAX_ID_BYTES = 4;
    private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
    private static final int MAX_LENGTH_BYTES = 8;
    private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
    private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
    private long elementContentSize;
    private int elementId;
    private int elementState;
    private androidx.media3.extractor.mkv.EbmlProcessor processor;
    private final byte[] scratch = new byte[8];
    private final java.util.ArrayDeque<androidx.media3.extractor.mkv.DefaultEbmlReader.MasterElement> masterElementsStack = new java.util.ArrayDeque<>();
    private final androidx.media3.extractor.mkv.VarintReader varintReader = new androidx.media3.extractor.mkv.VarintReader();

    public static final class MasterElement {
        private final long elementEndPosition;
        private final int elementId;

        private MasterElement(int i3, long j) {
            this.elementId = i3;
            this.elementEndPosition = j;
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"processor"})
    private long maybeResyncToNextLevel1Element(androidx.media3.extractor.ExtractorInput extractorInput) {
        extractorInput.resetPeekPosition();
        while (true) {
            extractorInput.peekFully(this.scratch, 0, 4);
            int unsignedVarintLength = androidx.media3.extractor.mkv.VarintReader.parseUnsignedVarintLength(this.scratch[0]);
            if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                int iAssembleVarint = (int) androidx.media3.extractor.mkv.VarintReader.assembleVarint(this.scratch, unsignedVarintLength, false);
                if (this.processor.isLevel1Element(iAssembleVarint)) {
                    extractorInput.skipFully(unsignedVarintLength);
                    return iAssembleVarint;
                }
            }
            extractorInput.skipFully(1);
        }
    }

    private double readFloat(androidx.media3.extractor.ExtractorInput extractorInput, int i3) {
        long integer = readInteger(extractorInput, i3);
        return i3 == 4 ? java.lang.Float.intBitsToFloat((int) integer) : java.lang.Double.longBitsToDouble(integer);
    }

    private long readInteger(androidx.media3.extractor.ExtractorInput extractorInput, int i3) {
        extractorInput.readFully(this.scratch, 0, i3);
        long j = 0;
        for (int i9 = 0; i9 < i3; i9++) {
            j = (j << 8) | ((long) (this.scratch[i9] & 255));
        }
        return j;
    }

    private static java.lang.String readString(androidx.media3.extractor.ExtractorInput extractorInput, int i3) {
        if (i3 == 0) {
            return "";
        }
        byte[] bArr = new byte[i3];
        extractorInput.readFully(bArr, 0, i3);
        while (i3 > 0 && bArr[i3 - 1] == 0) {
            i3--;
        }
        return new java.lang.String(bArr, 0, i3);
    }

    @Override // androidx.media3.extractor.mkv.EbmlReader
    public void init(androidx.media3.extractor.mkv.EbmlProcessor ebmlProcessor) {
        this.processor = ebmlProcessor;
    }

    @Override // androidx.media3.extractor.mkv.EbmlReader
    public boolean read(androidx.media3.extractor.ExtractorInput extractorInput) throws androidx.media3.common.ParserException {
        this.processor.getClass();
        while (true) {
            androidx.media3.extractor.mkv.DefaultEbmlReader.MasterElement masterElementPeek = this.masterElementsStack.peek();
            if (masterElementPeek != null && extractorInput.getPosition() >= masterElementPeek.elementEndPosition) {
                this.processor.endMasterElement(this.masterElementsStack.pop().elementId);
                return true;
            }
            if (this.elementState == 0) {
                long unsignedVarint = this.varintReader.readUnsignedVarint(extractorInput, true, false, 4);
                if (unsignedVarint == -2) {
                    unsignedVarint = maybeResyncToNextLevel1Element(extractorInput);
                }
                if (unsignedVarint == -1) {
                    return false;
                }
                this.elementId = (int) unsignedVarint;
                this.elementState = 1;
            }
            if (this.elementState == 1) {
                this.elementContentSize = this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
                this.elementState = 2;
            }
            int elementType = this.processor.getElementType(this.elementId);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = extractorInput.getPosition();
                    this.masterElementsStack.push(new androidx.media3.extractor.mkv.DefaultEbmlReader.MasterElement(this.elementId, this.elementContentSize + position));
                    this.processor.startMasterElement(this.elementId, position, this.elementContentSize);
                    this.elementState = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j = this.elementContentSize;
                    if (j <= 8) {
                        this.processor.integerElement(this.elementId, readInteger(extractorInput, (int) j));
                        this.elementState = 0;
                        return true;
                    }
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid integer size: " + this.elementContentSize, null);
                }
                if (elementType == 3) {
                    long j9 = this.elementContentSize;
                    if (j9 <= 2147483647L) {
                        this.processor.stringElement(this.elementId, readString(extractorInput, (int) j9));
                        this.elementState = 0;
                        return true;
                    }
                    throw androidx.media3.common.ParserException.createForMalformedContainer("String element size: " + this.elementContentSize, null);
                }
                if (elementType == 4) {
                    this.processor.binaryElement(this.elementId, (int) this.elementContentSize, extractorInput);
                    this.elementState = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j10 = this.elementContentSize;
                if (j10 == 4 || j10 == 8) {
                    this.processor.floatElement(this.elementId, readFloat(extractorInput, (int) j10));
                    this.elementState = 0;
                    return true;
                }
                throw androidx.media3.common.ParserException.createForMalformedContainer("Invalid float size: " + this.elementContentSize, null);
            }
            extractorInput.skipFully((int) this.elementContentSize);
            this.elementState = 0;
        }
    }

    @Override // androidx.media3.extractor.mkv.EbmlReader
    public void reset() {
        this.elementState = 0;
        this.masterElementsStack.clear();
        this.varintReader.reset();
    }
}
