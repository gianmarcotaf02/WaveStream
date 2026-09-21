package androidx.media3.extractor.flv;

/* JADX INFO: loaded from: classes.dex */
final class AudioTagPayloadReader extends androidx.media3.extractor.flv.TagPayloadReader {
    private static final int AAC_PACKET_TYPE_AAC_RAW = 1;
    private static final int AAC_PACKET_TYPE_SEQUENCE_HEADER = 0;
    private static final int AUDIO_FORMAT_AAC = 10;
    private static final int AUDIO_FORMAT_ALAW = 7;
    private static final int AUDIO_FORMAT_MP3 = 2;
    private static final int AUDIO_FORMAT_ULAW = 8;
    private static final int[] AUDIO_SAMPLING_RATE_TABLE = {5512, 11025, 22050, 44100};
    private int audioFormat;
    private boolean hasOutputFormat;
    private boolean hasParsedAudioDataHeader;

    public AudioTagPayloadReader(androidx.media3.extractor.TrackOutput trackOutput) {
        super(trackOutput);
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean parseHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) throws androidx.media3.extractor.flv.TagPayloadReader.UnsupportedFormatException {
        if (this.hasParsedAudioDataHeader) {
            parsableByteArray.skipBytes(1);
        } else {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int i3 = (unsignedByte >> 4) & 15;
            this.audioFormat = i3;
            if (i3 == 2) {
                this.output.format(new androidx.media3.common.Format.Builder().setContainerMimeType(androidx.media3.common.MimeTypes.VIDEO_FLV).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_MPEG).setChannelCount(1).setSampleRate(AUDIO_SAMPLING_RATE_TABLE[(unsignedByte >> 2) & 3]).build());
                this.hasOutputFormat = true;
            } else if (i3 == 7 || i3 == 8) {
                this.output.format(new androidx.media3.common.Format.Builder().setContainerMimeType(androidx.media3.common.MimeTypes.VIDEO_FLV).setSampleMimeType(i3 == 7 ? androidx.media3.common.MimeTypes.AUDIO_ALAW : androidx.media3.common.MimeTypes.AUDIO_MLAW).setChannelCount(1).setSampleRate(8000).build());
                this.hasOutputFormat = true;
            } else if (i3 != 10) {
                throw new androidx.media3.extractor.flv.TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.audioFormat);
            }
            this.hasParsedAudioDataHeader = true;
        }
        return true;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean parsePayload(androidx.media3.common.util.ParsableByteArray parsableByteArray, long j) {
        if (this.audioFormat == 2) {
            int iBytesLeft = parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, iBytesLeft);
            this.output.sampleMetadata(j, 1, iBytesLeft, 0, null);
            return true;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if (unsignedByte != 0 || this.hasOutputFormat) {
            if (this.audioFormat == 10 && unsignedByte != 1) {
                return false;
            }
            int iBytesLeft2 = parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, iBytesLeft2);
            this.output.sampleMetadata(j, 1, iBytesLeft2, 0, null);
            return true;
        }
        int iBytesLeft3 = parsableByteArray.bytesLeft();
        byte[] bArr = new byte[iBytesLeft3];
        parsableByteArray.readBytes(bArr, 0, iBytesLeft3);
        androidx.media3.extractor.AacUtil.Config audioSpecificConfig = androidx.media3.extractor.AacUtil.parseAudioSpecificConfig(bArr);
        this.output.format(new androidx.media3.common.Format.Builder().setContainerMimeType(androidx.media3.common.MimeTypes.VIDEO_FLV).setSampleMimeType(androidx.media3.common.MimeTypes.AUDIO_AAC).setCodecs(audioSpecificConfig.codecs).setChannelCount(audioSpecificConfig.channelCount).setSampleRate(audioSpecificConfig.sampleRateHz).setInitializationData(java.util.Collections.singletonList(bArr)).build());
        this.hasOutputFormat = true;
        return false;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public void seek() {
    }
}
