package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public interface MediaCodecSelector {
    public static final androidx.media3.exoplayer.mediacodec.MediaCodecSelector DEFAULT = new androidx.media3.exoplayer.mediacodec.e(3);
    public static final androidx.media3.exoplayer.mediacodec.MediaCodecSelector PREFER_SOFTWARE = new androidx.media3.exoplayer.mediacodec.e(4);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ java.util.List lambda$static$0(java.lang.String str, boolean z6, boolean z9) {
        return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(DEFAULT.getDecoderInfos(str, z6, z9));
    }

    java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(java.lang.String str, boolean z6, boolean z9);
}
