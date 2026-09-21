package androidx.media3.extractor.ogg;

/* JADX INFO: loaded from: classes.dex */
final class VorbisReader extends androidx.media3.extractor.ogg.StreamReader {
    private androidx.media3.extractor.VorbisUtil.CommentHeader commentHeader;
    private int previousPacketBlockSize;
    private boolean seenFirstAudioPacket;
    private androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader;
    private androidx.media3.extractor.ogg.VorbisReader.VorbisSetup vorbisSetup;

    public static final class VorbisSetup {
        public final androidx.media3.extractor.VorbisUtil.CommentHeader commentHeader;
        public final int iLogModes;
        public final androidx.media3.extractor.VorbisUtil.VorbisIdHeader idHeader;
        public final androidx.media3.extractor.VorbisUtil.Mode[] modes;
        public final byte[] setupHeaderData;

        public VorbisSetup(androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader, androidx.media3.extractor.VorbisUtil.CommentHeader commentHeader, byte[] bArr, androidx.media3.extractor.VorbisUtil.Mode[] modeArr, int i3) {
            this.idHeader = vorbisIdHeader;
            this.commentHeader = commentHeader;
            this.setupHeaderData = bArr;
            this.modes = modeArr;
            this.iLogModes = i3;
        }
    }

    public static void appendNumberOfSamples(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) {
        if (parsableByteArray.capacity() < parsableByteArray.limit() + 4) {
            parsableByteArray.reset(java.util.Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit() + 4));
        } else {
            parsableByteArray.setLimit(parsableByteArray.limit() + 4);
        }
        byte[] data = parsableByteArray.getData();
        data[parsableByteArray.limit() - 4] = (byte) (j & 255);
        data[parsableByteArray.limit() - 3] = (byte) ((j >>> 8) & 255);
        data[parsableByteArray.limit() - 2] = (byte) ((j >>> 16) & 255);
        data[parsableByteArray.limit() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int decodeBlockSize(byte b9, androidx.media3.extractor.ogg.VorbisReader.VorbisSetup vorbisSetup) {
        return !vorbisSetup.modes[readBits(b9, vorbisSetup.iLogModes, 1)].blockFlag ? vorbisSetup.idHeader.blockSize0 : vorbisSetup.idHeader.blockSize1;
    }

    public static int readBits(byte b9, int i3, int i9) {
        return (b9 >> i9) & (255 >>> (8 - i3));
    }

    public static boolean verifyBitstreamType(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        try {
            return androidx.media3.extractor.VorbisUtil.verifyVorbisHeaderCapturePattern(1, parsableByteArray, true);
        } catch (androidx.media3.common.ParserException unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public void onSeekEnd(long j) {
        super.onSeekEnd(j);
        this.seenFirstAudioPacket = j != 0;
        androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        this.previousPacketBlockSize = vorbisIdHeader != null ? vorbisIdHeader.blockSize0 : 0;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public long preparePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if ((parsableByteArray.getData()[0] & 1) == 1) {
            return -1L;
        }
        byte b9 = parsableByteArray.getData()[0];
        androidx.media3.extractor.ogg.VorbisReader.VorbisSetup vorbisSetup = this.vorbisSetup;
        vorbisSetup.getClass();
        int iDecodeBlockSize = decodeBlockSize(b9, vorbisSetup);
        long j = this.seenFirstAudioPacket ? (this.previousPacketBlockSize + iDecodeBlockSize) / 4 : 0;
        appendNumberOfSamples(parsableByteArray, j);
        this.seenFirstAudioPacket = true;
        this.previousPacketBlockSize = iDecodeBlockSize;
        return j;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean readHeaders(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j, androidx.media3.extractor.ogg.StreamReader.SetupData setupData) throws androidx.media3.common.ParserException {
        if (this.vorbisSetup != null) {
            setupData.format.getClass();
            return false;
        }
        androidx.media3.extractor.ogg.VorbisReader.VorbisSetup setupHeaders = readSetupHeaders(parsableByteArray);
        this.vorbisSetup = setupHeaders;
        if (setupHeaders == null) {
            return true;
        }
        androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = setupHeaders.idHeader;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(vorbisIdHeader.data);
        arrayList.add(setupHeaders.setupHeaderData);
        setupData.format = new androidx.media3.common.Format.Builder().setContainerMimeType(androidx.media3.common.MimeTypes.AUDIO_OGG).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_VORBIS).setAverageBitrate(vorbisIdHeader.bitrateNominal).setPeakBitrate(vorbisIdHeader.bitrateMaximum).setChannelCount(vorbisIdHeader.channels).setSampleRate(vorbisIdHeader.sampleRate).setInitializationData(arrayList).setMetadata(androidx.media3.extractor.VorbisUtil.parseVorbisComments(p076i4.AbstractC2186b0.v(setupHeaders.commentHeader.comments))).build();
        return true;
    }

    public androidx.media3.extractor.ogg.VorbisReader.VorbisSetup readSetupHeaders(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.common.ParserException {
        androidx.media3.extractor.VorbisUtil.VorbisIdHeader vorbisIdHeader = this.vorbisIdHeader;
        if (vorbisIdHeader == null) {
            this.vorbisIdHeader = androidx.media3.extractor.VorbisUtil.readVorbisIdentificationHeader(parsableByteArray);
            return null;
        }
        androidx.media3.extractor.VorbisUtil.CommentHeader commentHeader = this.commentHeader;
        if (commentHeader == null) {
            this.commentHeader = androidx.media3.extractor.VorbisUtil.readVorbisCommentHeader(parsableByteArray);
            return null;
        }
        byte[] bArr = new byte[parsableByteArray.limit()];
        java.lang.System.arraycopy(parsableByteArray.getData(), 0, bArr, 0, parsableByteArray.limit());
        androidx.media3.extractor.VorbisUtil.Mode[] vorbisModes = androidx.media3.extractor.VorbisUtil.readVorbisModes(parsableByteArray, vorbisIdHeader.channels);
        return new androidx.media3.extractor.ogg.VorbisReader.VorbisSetup(vorbisIdHeader, commentHeader, bArr, vorbisModes, androidx.media3.extractor.VorbisUtil.iLog(vorbisModes.length - 1));
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public void reset(boolean z6) {
        super.reset(z6);
        if (z6) {
            this.vorbisSetup = null;
            this.vorbisIdHeader = null;
            this.commentHeader = null;
        }
        this.previousPacketBlockSize = 0;
        this.seenFirstAudioPacket = false;
    }
}
