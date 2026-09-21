package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config[] f10836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.graphics.Bitmap.Config f10837b;

    static {
        int i3 = android.os.Build.VERSION.SDK_INT;
        f10836a = i3 >= 26 ? new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888, android.graphics.Bitmap.Config.RGBA_F16} : new android.graphics.Bitmap.Config[]{android.graphics.Bitmap.Config.ARGB_8888};
        f10837b = i3 >= 26 ? android.graphics.Bitmap.Config.HARDWARE : android.graphics.Bitmap.Config.ARGB_8888;
    }

    public static final int a(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap bitmap;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int b(android.graphics.drawable.Drawable drawable) {
        android.graphics.Bitmap bitmap;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = drawable instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }
}
