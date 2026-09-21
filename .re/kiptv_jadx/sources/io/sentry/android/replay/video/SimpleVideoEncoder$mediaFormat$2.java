package io.sentry.android.replay.video;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/MediaFormat;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SimpleVideoEncoder$mediaFormat$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ io.sentry.android.replay.video.SimpleVideoEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleVideoEncoder$mediaFormat$2(io.sentry.android.replay.video.SimpleVideoEncoder simpleVideoEncoder) {
        super(0);
        this.this$0 = simpleVideoEncoder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final android.media.MediaFormat invoke() {
        int bitRate = this.this$0.getMuxerConfig().getBitRate();
        try {
            android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = this.this$0.getMediaCodec().getCodecInfo().getCapabilitiesForType(this.this$0.getMuxerConfig().getMimeType()).getVideoCapabilities();
            if (!videoCapabilities.getBitrateRange().contains(java.lang.Integer.valueOf(bitRate))) {
                this.this$0.getOptions().getLogger().log(io.sentry.SentryLevel.DEBUG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one", new java.lang.Object[0]);
                java.lang.Object objClamp = videoCapabilities.getBitrateRange().clamp(java.lang.Integer.valueOf(bitRate));
                kotlin.jvm.internal.m.d(objClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                bitRate = ((java.lang.Number) objClamp).intValue();
            }
        } catch (java.lang.Throwable th) {
            this.this$0.getOptions().getLogger().log(io.sentry.SentryLevel.DEBUG, "Could not retrieve MediaCodec info", th);
        }
        android.media.MediaFormat mediaFormatCreateVideoFormat = android.media.MediaFormat.createVideoFormat(this.this$0.getMuxerConfig().getMimeType(), this.this$0.getMuxerConfig().getRecordingWidth(), this.this$0.getMuxerConfig().getRecordingHeight());
        kotlin.jvm.internal.m.d(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
        mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.getMuxerConfig().getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
        return mediaFormatCreateVideoFormat;
    }
}
