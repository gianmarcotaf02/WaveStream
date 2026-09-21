package io.sentry.android.replay.video;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lio/sentry/android/replay/video/SimpleVideoEncoder;", "", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/android/replay/video/MuxerConfig;", "muxerConfig", "Lkotlin/Function0;", "Lh6/A;", "onClose", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/video/MuxerConfig;Lkotlin/jvm/functions/Function0;)V", "", "endOfStream", "drainCodec", "(Z)V", androidx.media3.extractor.text.ttml.TtmlNode.START, "()V", "Landroid/graphics/Bitmap;", "image", "encode", "(Landroid/graphics/Bitmap;)V", "release", "Lio/sentry/SentryOptions;", "getOptions", "()Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/video/MuxerConfig;", "getMuxerConfig", "()Lio/sentry/android/replay/video/MuxerConfig;", "Lkotlin/jvm/functions/Function0;", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "hasExynosCodec$delegate", "Lh6/h;", "getHasExynosCodec", "()Z", "hasExynosCodec", "Landroid/media/MediaCodec;", "mediaCodec", "Landroid/media/MediaCodec;", "getMediaCodec$sentry_android_replay_release", "()Landroid/media/MediaCodec;", "Landroid/media/MediaFormat;", "mediaFormat$delegate", "getMediaFormat", "()Landroid/media/MediaFormat;", "mediaFormat", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "Lio/sentry/android/replay/video/SimpleMp4FrameMuxer;", "frameMuxer", "Lio/sentry/android/replay/video/SimpleMp4FrameMuxer;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "", "getDuration", "()J", "duration", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SimpleVideoEncoder {
    public static final int $stable = 8;
    private final android.media.MediaCodec.BufferInfo bufferInfo;
    private final io.sentry.android.replay.video.SimpleMp4FrameMuxer frameMuxer;

    /* JADX INFO: renamed from: hasExynosCodec$delegate, reason: from kotlin metadata */
    private final p070h6.h hasExynosCodec;
    private final android.media.MediaCodec mediaCodec;

    /* JADX INFO: renamed from: mediaFormat$delegate, reason: from kotlin metadata */
    private final p070h6.h mediaFormat;
    private final io.sentry.android.replay.video.MuxerConfig muxerConfig;
    private final kotlin.jvm.functions.Function0 onClose;
    private final io.sentry.SentryOptions options;
    private android.view.Surface surface;

    public SimpleVideoEncoder(io.sentry.SentryOptions options, io.sentry.android.replay.video.MuxerConfig muxerConfig, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(muxerConfig, "muxerConfig");
        this.options = options;
        this.muxerConfig = muxerConfig;
        this.onClose = function0;
        p070h6.i iVar = p070h6.i.j;
        this.hasExynosCodec = com.google.common.util.concurrent.D.A(iVar, io.sentry.android.replay.video.SimpleVideoEncoder$hasExynosCodec$2.INSTANCE);
        android.media.MediaCodec mediaCodecCreateByCodecName = getHasExynosCodec() ? android.media.MediaCodec.createByCodecName("c2.android.avc.encoder") : android.media.MediaCodec.createEncoderByType(muxerConfig.getMimeType());
        kotlin.jvm.internal.m.d(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …onfig.mimeType)\n        }");
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat = com.google.common.util.concurrent.D.A(iVar, new io.sentry.android.replay.video.SimpleVideoEncoder$mediaFormat$2(this));
        this.bufferInfo = new android.media.MediaCodec.BufferInfo();
        java.lang.String absolutePath = muxerConfig.getFile().getAbsolutePath();
        kotlin.jvm.internal.m.d(absolutePath, "muxerConfig.file.absolutePath");
        this.frameMuxer = new io.sentry.android.replay.video.SimpleMp4FrameMuxer(absolutePath, muxerConfig.getFrameRate());
    }

    private final void drainCodec(boolean endOfStream) {
        java.nio.ByteBuffer byteBuffer;
        io.sentry.ILogger logger = this.options.getLogger();
        io.sentry.SentryLevel sentryLevel = io.sentry.SentryLevel.DEBUG;
        logger.log(sentryLevel, "[Encoder]: drainCodec(" + endOfStream + ')', new java.lang.Object[0]);
        if (endOfStream) {
            this.options.getLogger().log(sentryLevel, "[Encoder]: sending EOS to encoder", new java.lang.Object[0]);
            this.mediaCodec.signalEndOfInputStream();
        }
        java.nio.ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(this.bufferInfo, androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
            if (iDequeueOutputBuffer == -1) {
                if (!endOfStream) {
                    return;
                } else {
                    this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "[Encoder]: no output available, spinning to await EOS", new java.lang.Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.mediaCodec.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.frameMuxer.getStarted()) {
                    throw new java.lang.RuntimeException("format changed twice");
                }
                android.media.MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                kotlin.jvm.internal.m.d(outputFormat, "mediaCodec.outputFormat");
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new java.lang.Object[0]);
                this.frameMuxer.start(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, com.google.android.gms.internal.play_billing.M0.l(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new java.lang.Object[0]);
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new java.lang.RuntimeException(Y6.f.f(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                }
                if ((this.bufferInfo.flags & 2) != 0) {
                    this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new java.lang.Object[0]);
                    this.bufferInfo.size = 0;
                }
                if (this.bufferInfo.size != 0) {
                    if (!this.frameMuxer.getStarted()) {
                        throw new java.lang.RuntimeException("muxer hasn't started");
                    }
                    this.frameMuxer.muxVideoFrame(byteBuffer, this.bufferInfo);
                    this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, Y6.f.k(new java.lang.StringBuilder("[Encoder]: sent "), this.bufferInfo.size, " bytes to muxer"), new java.lang.Object[0]);
                }
                this.mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.bufferInfo.flags & 4) != 0) {
                    if (endOfStream) {
                        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "[Encoder]: end of stream reached", new java.lang.Object[0]);
                        return;
                    } else {
                        this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "[Encoder]: reached end of stream unexpectedly", new java.lang.Object[0]);
                        return;
                    }
                }
            }
        }
    }

    private final boolean getHasExynosCodec() {
        return ((java.lang.Boolean) this.hasExynosCodec.getValue()).booleanValue();
    }

    private final android.media.MediaFormat getMediaFormat() {
        return (android.media.MediaFormat) this.mediaFormat.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    public final void encode(android.graphics.Bitmap image) {
        android.view.Surface surface;
        android.graphics.Canvas canvasLockCanvas;
        kotlin.jvm.internal.m.e(image, "image");
        java.lang.String MANUFACTURER = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.m.d(MANUFACTURER, "MANUFACTURER");
        if (O7.q.B0(MANUFACTURER, "xiaomi", true)) {
            surface = this.surface;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            kotlin.jvm.internal.m.d(MANUFACTURER, "MANUFACTURER");
            if (O7.q.B0(MANUFACTURER, "motorola", true)) {
                surface = this.surface;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                android.view.Surface surface2 = this.surface;
                if (surface2 != null) {
                    canvasLockCanvas = surface2.lockHardwareCanvas();
                } else {
                    canvasLockCanvas = null;
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(image, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        android.view.Surface surface3 = this.surface;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        drainCodec(false);
    }

    public final long getDuration() {
        return this.frameMuxer.getVideoTime();
    }

    /* JADX INFO: renamed from: getMediaCodec$sentry_android_replay_release, reason: from getter */
    public final android.media.MediaCodec getMediaCodec() {
        return this.mediaCodec;
    }

    public final io.sentry.android.replay.video.MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    public final kotlin.jvm.functions.Function0 getOnClose() {
        return this.onClose;
    }

    public final io.sentry.SentryOptions getOptions() {
        return this.options;
    }

    public final void release() {
        try {
            kotlin.jvm.functions.Function0 function0 = this.onClose;
            if (function0 != null) {
                function0.invoke();
            }
            drainCodec(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            android.view.Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.release();
        } catch (java.lang.Throwable th) {
            this.options.getLogger().log(io.sentry.SentryLevel.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    public final void start() {
        this.mediaCodec.configure(getMediaFormat(), (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        drainCodec(false);
    }

    public /* synthetic */ SimpleVideoEncoder(io.sentry.SentryOptions sentryOptions, io.sentry.android.replay.video.MuxerConfig muxerConfig, kotlin.jvm.functions.Function0 function0, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(sentryOptions, muxerConfig, (i3 & 4) != 0 ? null : function0);
    }
}
