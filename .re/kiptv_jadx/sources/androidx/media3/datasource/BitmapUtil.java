package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapUtil {
    private BitmapUtil() {
    }

    public static android.graphics.Bitmap decode(byte[] bArr, int i3, android.graphics.BitmapFactory.Options options, int i9) throws java.io.IOException {
        int i10 = 0;
        int iE = 1;
        if (i9 != -1) {
            if (options == null) {
                options = new android.graphics.BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeByteArray(bArr, 0, i3, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = java.lang.Math.max(options.outWidth, options.outHeight); iMax > i9; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        }
        android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, i3, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw androidx.media3.common.ParserException.createForMalformedContainer("Could not decode image data", new java.lang.IllegalStateException());
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            W1.g gVar = new W1.g(byteArrayInputStream);
            byteArrayInputStream.close();
            W1.c cVarC = gVar.c("Orientation");
            if (cVarC != null) {
                try {
                    iE = cVarC.e(gVar.f10589f);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            switch (iE) {
                case 3:
                case 4:
                    i10 = 180;
                    break;
                case 5:
                case 8:
                    i10 = org.videolan.libvlc.MediaPlayer.Event.PausableChanged;
                    break;
                case 6:
                case 7:
                    i10 = 90;
                    break;
            }
            if (i10 == 0) {
                return bitmapDecodeByteArray;
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postRotate(i10);
            return android.graphics.Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static android.graphics.Bitmap makeShared(android.graphics.Bitmap bitmap) {
        return android.os.Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }
}
