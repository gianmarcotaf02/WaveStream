package p103m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public final class Y0 implements InterfaceC2567h0 {

    public Toolbar f24989a;

    public int f24990b;

    public View f24991c;

    public Drawable f24992d;

    public Drawable f24993e;

    public Drawable f24994f;
    public boolean g;

    public CharSequence f24995h;

    public CharSequence f24996i;
    public CharSequence j;

    public Window.Callback f24997k;

    public boolean f24998l;

    public C2570j f24999m;

    public int f25000n;

    public Drawable f25001o;

    public final void a(int i3) {
        View view;
        int i9 = this.f24990b ^ i3;
        this.f24990b = i3;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i10 = this.f24990b & 4;
                Toolbar toolbar = this.f24989a;
                if (i10 != 0) {
                    Drawable drawable = this.f24994f;
                    if (drawable == null) {
                        drawable = this.f25001o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i9 & 3) != 0) {
                c();
            }
            int i11 = i9 & 8;
            Toolbar toolbar2 = this.f24989a;
            if (i11 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.f24995h);
                    toolbar2.setSubtitle(this.f24996i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i9 & 16) == 0 || (view = this.f24991c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f24990b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f24989a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f25000n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f24990b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) == 0 || (drawable = this.f24993e) == null) {
            drawable = this.f24992d;
        }
        this.f24989a.setLogo(drawable);
    }
}
