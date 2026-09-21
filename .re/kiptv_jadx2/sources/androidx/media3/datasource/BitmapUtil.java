package androidx.media3.datasource;

import W1.g;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.videolan.libvlc.MediaPlayer;

public final class BitmapUtil {
    private BitmapUtil() {
    }

    public static Bitmap decode(byte[] bArr, int i3, BitmapFactory.Options options, int i9) throws IOException {
        int i10 = 0;
        int iE = 1;
        if (i9 != -1) {
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i3, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i9; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i3, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.createForMalformedContainer("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            g gVar = new g(byteArrayInputStream);
            byteArrayInputStream.close();
            W1.c cVarC = gVar.c("Orientation");
            if (cVarC != null) {
                try {
                    iE = cVarC.e(gVar.f10589f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (iE) {
                case 3:
                case 4:
                    i10 = 180;
                    break;
                case 5:
                case 8:
                    i10 = MediaPlayer.Event.PausableChanged;
                    break;
                case 6:
                case 7:
                    i10 = 90;
                    break;
            }
            if (i10 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i10);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static Bitmap makeShared(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }
}
