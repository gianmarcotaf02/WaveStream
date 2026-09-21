package androidx.media3.exoplayer.image;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.BitmapUtil;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.RendererCapabilities;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    private final Context context;
    private final int maxOutputSize;

    public static final class Factory implements ImageDecoder.Factory {
        private final Context context;
        private int maxOutputSize;

        @Deprecated
        public Factory() {
            this.context = null;
            this.maxOutputSize = -1;
        }

        public Factory setMaxOutputSize(int i3) {
            AbstractC1864o0.L(i3 == -1 || i3 > 0);
            this.maxOutputSize = i3;
            return this;
        }

        @Override
        public int supportsFormat(Format format) {
            String str = format.sampleMimeType;
            if (str == null || !MimeTypes.isImage(str)) {
                return RendererCapabilities.create(0);
            }
            return Util.isBitmapFactorySupportedMimeType(format.sampleMimeType) ? RendererCapabilities.create(4) : RendererCapabilities.create(1);
        }

        @Override
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.context, this.maxOutputSize);
        }

        public Factory(Context context) {
            context.getClass();
            this.context = context;
            this.maxOutputSize = -1;
        }
    }

    @Override
    public DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override
    public ImageOutputBuffer dequeueOutputBuffer() {
        return dequeueOutputBuffer();
    }

    @Override
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    private BitmapFactoryImageDecoder(Context context, int i3) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.context = context;
        this.maxOutputSize = i3;
    }

    @Override
    public ImageOutputBuffer createOutputBuffer() {
        return new ImageOutputBuffer() {
            @Override
            public void release() {
                BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
            }
        };
    }

    @Override
    public ImageDecoderException createUnexpectedDecodeException(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z6) {
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        byteBuffer.getClass();
        AbstractC1864o0.Y(byteBuffer.hasArray());
        AbstractC1864o0.L(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.maxOutputSize;
            if (iMax == -1) {
                Context context = this.context;
                if (context != null) {
                    Point currentDisplayModeSize = Util.getCurrentDisplayModeSize(context);
                    int i3 = currentDisplayModeSize.x;
                    int i9 = currentDisplayModeSize.y;
                    Format format = decoderInputBuffer.format;
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
                    iMax = (Math.max(i3, i9) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            imageOutputBuffer.bitmap = BitmapUtil.decode(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ParserException e6) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e6);
        } catch (IOException e9) {
            return new ImageDecoderException(e9);
        }
    }
}
