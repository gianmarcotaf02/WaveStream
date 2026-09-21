package androidx.media3.exoplayer.image;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapFactoryImageDecoder extends androidx.media3.decoder.SimpleDecoder<androidx.media3.decoder.DecoderInputBuffer, androidx.media3.exoplayer.image.ImageOutputBuffer, androidx.media3.exoplayer.image.ImageDecoderException> implements androidx.media3.exoplayer.image.ImageDecoder {
    private final android.content.Context context;
    private final int maxOutputSize;

    public static final class Factory implements androidx.media3.exoplayer.image.ImageDecoder.Factory {
        private final android.content.Context context;
        private int maxOutputSize;

        @java.lang.Deprecated
        public Factory() {
            this.context = null;
            this.maxOutputSize = -1;
        }

        public androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.Factory setMaxOutputSize(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 == -1 || i3 > 0);
            this.maxOutputSize = i3;
            return this;
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(androidx.media3.common.Format format) {
            java.lang.String str = format.sampleMimeType;
            if (str == null || !androidx.media3.common.MimeTypes.isImage(str)) {
                return androidx.media3.exoplayer.RendererCapabilities.create(0);
            }
            return androidx.media3.common.util.Util.isBitmapFactorySupportedMimeType(format.sampleMimeType) ? androidx.media3.exoplayer.RendererCapabilities.create(4) : androidx.media3.exoplayer.RendererCapabilities.create(1);
        }

        @Override // androidx.media3.exoplayer.image.ImageDecoder.Factory
        public androidx.media3.exoplayer.image.BitmapFactoryImageDecoder createImageDecoder() {
            return new androidx.media3.exoplayer.image.BitmapFactoryImageDecoder(this.context, this.maxOutputSize);
        }

        public Factory(android.content.Context context) {
            context.getClass();
            this.context = context;
            this.maxOutputSize = -1;
        }
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public androidx.media3.decoder.DecoderInputBuffer createInputBuffer() {
        return new androidx.media3.decoder.DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.SimpleDecoder, androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ androidx.media3.exoplayer.image.ImageOutputBuffer dequeueOutputBuffer() {
        return dequeueOutputBuffer();
    }

    @Override // androidx.media3.decoder.Decoder
    public java.lang.String getName() {
        return "BitmapFactoryImageDecoder";
    }

    private BitmapFactoryImageDecoder(android.content.Context context, int i3) {
        super(new androidx.media3.decoder.DecoderInputBuffer[1], new androidx.media3.exoplayer.image.ImageOutputBuffer[1]);
        this.context = context;
        this.maxOutputSize = i3;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public androidx.media3.exoplayer.image.ImageOutputBuffer createOutputBuffer() {
        return new androidx.media3.exoplayer.image.ImageOutputBuffer() { // from class: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.1
            @Override // androidx.media3.decoder.DecoderOutputBuffer
            public void release() {
                androidx.media3.exoplayer.image.BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public androidx.media3.exoplayer.image.ImageDecoderException createUnexpectedDecodeException(java.lang.Throwable th) {
        return new androidx.media3.exoplayer.image.ImageDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    public androidx.media3.exoplayer.image.ImageDecoderException decode(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, androidx.media3.exoplayer.image.ImageOutputBuffer imageOutputBuffer, boolean z6) {
        java.nio.ByteBuffer byteBuffer = decoderInputBuffer.data;
        byteBuffer.getClass();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(byteBuffer.hasArray());
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.maxOutputSize;
            if (iMax == -1) {
                android.content.Context context = this.context;
                if (context != null) {
                    android.graphics.Point currentDisplayModeSize = androidx.media3.common.util.Util.getCurrentDisplayModeSize(context);
                    int i3 = currentDisplayModeSize.x;
                    int i9 = currentDisplayModeSize.y;
                    androidx.media3.common.Format format = decoderInputBuffer.format;
                    if (format != null) {
                        int i10 = format.tileCountHorizontal;
                        if (i10 != -1) {
                            i3 *= i10;
                        }
                        int i11 = format.tileCountVertical;
                        if (i11 != -1) {
                            i9 *= i11;
                        }
                    }
                    iMax = (java.lang.Math.max(i3, i9) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            imageOutputBuffer.bitmap = androidx.media3.datasource.BitmapUtil.decode(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (androidx.media3.common.ParserException e6) {
            return new androidx.media3.exoplayer.image.ImageDecoderException("Could not decode image data with BitmapFactory.", e6);
        } catch (java.io.IOException e9) {
            return new androidx.media3.exoplayer.image.ImageDecoderException(e9);
        }
    }
}
