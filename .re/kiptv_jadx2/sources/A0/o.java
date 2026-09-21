package A0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

public final class o extends ViewOutlineProvider {

    public final int f112a;

    @Override
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f112a) {
            case 0:
                if (!(view instanceof p) || (outline2 = ((p) view).f117l) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 1:
                kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                B2.a.u(view);
                throw null;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
