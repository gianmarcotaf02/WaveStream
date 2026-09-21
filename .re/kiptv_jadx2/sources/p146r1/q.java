package p146r1;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

public final class q {

    public static final q f26770a = new q();

    public final int a(Window window) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i9 = rect.top;
        int i10 = rect.bottom;
        return i3 - (i9 + (i10 > i3 ? i10 - i3 : 0));
    }
}
