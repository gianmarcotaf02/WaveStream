package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends androidx.media3.decoder.DecoderException {
    public final androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo;
    public final java.lang.String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(java.lang.Throwable th, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Decoder failed: ");
        sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
        super(sb.toString(), th);
        this.codecInfo = mediaCodecInfo;
        this.diagnosticInfo = th instanceof android.media.MediaCodec.CodecException ? ((android.media.MediaCodec.CodecException) th).getDiagnosticInfo() : null;
        this.errorCode = getErrorCode(th);
    }

    private static int getErrorCode(java.lang.Throwable th) {
        if (th instanceof android.media.MediaCodec.CodecException) {
            return ((android.media.MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
