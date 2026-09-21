package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p146r1.q f26770a = new p146r1.q();

    public final int a(android.view.Window window) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        android.graphics.Rect rect = new android.graphics.Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i9 = rect.top;
        int i10 = rect.bottom;
        return i3 - (i9 + (i10 > i3 ? i10 - i3 : 0));
    }
}
