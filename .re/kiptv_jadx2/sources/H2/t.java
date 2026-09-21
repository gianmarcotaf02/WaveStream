package H2;

import android.graphics.ImageDecoder;

public final class t implements ImageDecoder.OnPartialImageListener {
    @Override
    public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
        return true;
    }
}
