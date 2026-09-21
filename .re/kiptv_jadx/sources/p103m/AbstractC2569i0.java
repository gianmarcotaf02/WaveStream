package p103m;

/* JADX INFO: renamed from: m.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2569i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25047a = {android.R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25048b = new int[0];

    static {
        new android.graphics.Rect();
    }

    public static void a(android.graphics.drawable.Drawable drawable) {
        java.lang.String name = drawable.getClass().getName();
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 29 || i3 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f25047a);
        } else {
            drawable.setState(f25048b);
        }
        drawable.setState(state);
    }

    public static android.graphics.PorterDuff.Mode b(int i3, android.graphics.PorterDuff.Mode mode) {
        if (i3 == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
