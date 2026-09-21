package E2;

/* JADX INFO: loaded from: classes.dex */
public final class m extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f2789b;

    public /* synthetic */ m(int i3, java.lang.Object obj) {
        this.f2788a = i3;
        this.f2789b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        switch (this.f2788a) {
            case 0:
                ((E2.l) this.f2789b).e(canvas);
                break;
            default:
                androidx.appcompat.widget.ActionBarContainer actionBarContainer = (androidx.appcompat.widget.ActionBarContainer) this.f2789b;
                if (actionBarContainer.f15667n) {
                    android.graphics.drawable.Drawable drawable = actionBarContainer.f15666m;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    android.graphics.drawable.Drawable drawable2 = actionBarContainer.f15664k;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    android.graphics.drawable.Drawable drawable3 = actionBarContainer.f15665l;
                    if (drawable3 != null && actionBarContainer.f15668o) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f2788a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        switch (this.f2788a) {
            case 1:
                androidx.appcompat.widget.ActionBarContainer actionBarContainer = (androidx.appcompat.widget.ActionBarContainer) this.f2789b;
                if (!actionBarContainer.f15667n) {
                    android.graphics.drawable.Drawable drawable = actionBarContainer.f15664k;
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

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        int i9 = this.f2788a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        int i3 = this.f2788a;
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(android.graphics.ColorFilter colorFilter) {
    }

    private final void d(android.graphics.ColorFilter colorFilter) {
    }
}
