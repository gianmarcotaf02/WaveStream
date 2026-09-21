package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public final class Ac4Extractor implements androidx.media3.extractor.Extractor {
    public static final androidx.media3.extractor.ExtractorsFactory FACTORY = new androidx.media3.extractor.a(10);
    private static final int FRAME_HEADER_SIZE = 7;
    private static final int MAX_SNIFF_BYTES = 8192;
    private static final int READ_BUFFER_SIZE = 16384;
    private final androidx.media3.extractor.ts.Ac4Reader reader = new androidx.media3.extractor.ts.Ac4Reader(androidx.media3.common.MimeTypes.AUDIO_AC4);
    private final androidx.media3.common.util.ParsableByteArray sampleData = new androidx.media3.common.util.ParsableByteArray(16384);
    private boolean startedPacket;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.extractor.Extractor[] lambda$static$0() {
        return new androidx.media3.extractor.Extractor[]{new androidx.media3.extractor.ts.Ac4Extractor()};
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.reader.createTracks(extractorOutput, new androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.seekMap(new androidx.media3.extractor.SeekMap.Unseekable(androidx.media3.common.C.TIME_UNSET));
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(androidx.media3.extractor.ExtractorInput extractorInput, androidx.media3.extractor.PositionHolder positionHolder) {
        int i3 = extractorInput.read(this.sampleData.getData(), 0, 16384);
        if (i3 == -1) {
            return -1;
        }
        this.sampleData.setPosition(0);
        this.sampleData.setLimit(i3);
        if (!this.startedPacket) {
            this.reader.packetStarted(0L, 4);
            this.startedPacket = true;
        }
        this.reader.consume(this.sampleData);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j9) {
        this.startedPacket = false;
        this.reader.seek();
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(androidx.media3.extractor.ExtractorInput extractorInput) {
        androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray(10);
        int i3 = 0;
        while (true) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 10);
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readUnsignedInt24() != 4801587) {
                break;
            }
            parsableByteArray.skipBytes(3);
            int synchSafeInt = parsableByteArray.readSynchSafeInt();
            i3 += synchSafeInt + 10;
            extractorInput.advancePeekPosition(synchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i3);
        int i9 = 0;
        int i10 = i3;
        while (true) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 7);
            parsableByteArray.setPosition(0);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort == 44096 || unsignedShort == 44097) {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                int ac4SyncframeSize = androidx.media3.extractor.Ac4Util.parseAc4SyncframeSize(parsableByteArray.getData(), unsignedShort);
                if (ac4SyncframeSize == -1) {
                    return false;
                }
                extractorInput.advancePeekPosition(ac4SyncframeSize - 7);
            } else {
                extractorInput.resetPeekPosition();
                i10++;
                if (i10 - i3 >= 8192) {
                    return false;
                }
                extractorInput.advancePeekPosition(i10);
                i9 = 0;
            }
        }
    }
}
