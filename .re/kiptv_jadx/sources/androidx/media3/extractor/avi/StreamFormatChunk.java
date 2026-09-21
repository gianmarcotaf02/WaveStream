package androidx.media3.extractor.avi;

/* JADX INFO: loaded from: classes.dex */
final class StreamFormatChunk implements androidx.media3.extractor.avi.AviChunk {
    private static final java.lang.String TAG = "StreamFormatChunk";
    public final androidx.media3.common.Format format;

    public StreamFormatChunk(androidx.media3.common.Format format) {
        this.format = format;
    }

    private static java.lang.String getMimeTypeFromCompression(int i3) {
        switch (i3) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return androidx.media3.common.MimeTypes.VIDEO_MP4V;
            case 826496577:
            case 828601953:
            case 875967048:
                return androidx.media3.common.MimeTypes.VIDEO_H264;
            case 842289229:
                return androidx.media3.common.MimeTypes.VIDEO_MP42;
            case 859066445:
                return androidx.media3.common.MimeTypes.VIDEO_MP43;
            case 1196444237:
            case 1735420525:
                return androidx.media3.common.MimeTypes.VIDEO_MJPEG;
            default:
                return null;
        }
    }

    private static java.lang.String getMimeTypeFromTag(int i3) {
        if (i3 == 1) {
            return androidx.media3.common.MimeTypes.AUDIO_RAW;
        }
        if (i3 == 85) {
            return androidx.media3.common.MimeTypes.AUDIO_MPEG;
        }
        if (i3 == 255) {
            return androidx.media3.common.MimeTypes.AUDIO_AAC;
        }
        if (i3 == 8192) {
            return androidx.media3.common.MimeTypes.AUDIO_AC3;
        }
        if (i3 != 8193) {
            return null;
        }
        return androidx.media3.common.MimeTypes.AUDIO_DTS;
    }

    private static androidx.media3.extractor.avi.AviChunk parseBitmapInfoHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        java.lang.String mimeTypeFromCompression = getMimeTypeFromCompression(littleEndianInt3);
        if (mimeTypeFromCompression == null) {
            Y6.f.p(littleEndianInt3, "Ignoring track with unsupported compression ", TAG);
            return null;
        }
        androidx.media3.common.Format.Builder builder = new androidx.media3.common.Format.Builder();
        builder.setWidth(littleEndianInt).setHeight(littleEndianInt2).setSampleMimeType(mimeTypeFromCompression);
        return new androidx.media3.extractor.avi.StreamFormatChunk(builder.build());
    }

    public static androidx.media3.extractor.avi.AviChunk parseFrom(int i3, androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        if (i3 == 2) {
            return parseBitmapInfoHeader(parsableByteArray);
        }
        if (i3 == 1) {
            return parseWaveFormatEx(parsableByteArray);
        }
        androidx.media3.common.util.Log.w(TAG, "Ignoring strf box for unsupported track type: " + androidx.media3.common.util.Util.getTrackTypeString(i3));
        return null;
    }

    private static androidx.media3.extractor.avi.AviChunk parseWaveFormatEx(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        java.lang.String mimeTypeFromTag = getMimeTypeFromTag(littleEndianUnsignedShort);
        if (mimeTypeFromTag == null) {
            Y6.f.p(littleEndianUnsignedShort, "Ignoring track with unsupported format tag ", TAG);
            return null;
        }
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(6);
        int pcmEncoding = androidx.media3.common.util.Util.getPcmEncoding(parsableByteArray.readLittleEndianUnsignedShort());
        int littleEndianUnsignedShort3 = parsableByteArray.bytesLeft() > 0 ? parsableByteArray.readLittleEndianUnsignedShort() : 0;
        androidx.media3.common.Format.Builder builder = new androidx.media3.common.Format.Builder();
        builder.setSampleMimeType(mimeTypeFromTag).setChannelCount(littleEndianUnsignedShort2).setSampleRate(littleEndianInt);
        if (mimeTypeFromTag.equals(androidx.media3.common.MimeTypes.AUDIO_RAW) && pcmEncoding != 0) {
            builder.setPcmEncoding(pcmEncoding);
        }
        if (mimeTypeFromTag.equals(androidx.media3.common.MimeTypes.AUDIO_AAC) && littleEndianUnsignedShort3 > 0) {
            byte[] bArr = new byte[littleEndianUnsignedShort3];
            parsableByteArray.readBytes(bArr, 0, littleEndianUnsignedShort3);
            builder.setInitializationData(p076i4.AbstractC2186b0.y(bArr));
        }
        return new androidx.media3.extractor.avi.StreamFormatChunk(builder.build());
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return androidx.media3.extractor.avi.AviExtractor.FOURCC_strf;
    }
}
