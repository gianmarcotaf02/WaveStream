package E2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public final class m extends Drawable {

    public final int f2788a;

    public final Object f2789b;

    public m(int i3, Object obj) {
        this.f2788a = i3;
        this.f2789b = obj;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f2788a) {
            case 0:
                ((l) this.f2789b).e(canvas);
                break;
            default:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2789b;
                if (actionBarContainer.f15667n) {
                    Drawable drawable = actionBarContainer.f15666m;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.f15664k;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.f15665l;
                    if (drawable3 != null && actionBarContainer.f15668o) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f2788a) {
        }
        return 0;
    }

    @Override
    public void getOutline(Outline outline) {
        switch (this.f2788a) {
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.f2789b;
                if (!actionBarContainer.f15667n) {
                    Drawable drawable = actionBarContainer.f15664k;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f15666m != null) {
                    actionBarContainer.f15664k.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        int i9 = this.f2788a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.f2788a;
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
