package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 implements p103m.InterfaceC2567h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.widget.Toolbar f24989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.view.View f24991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f24992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f24993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f24994f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.CharSequence f24995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.CharSequence f24996i;
    public java.lang.CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.view.Window.Callback f24997k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24998l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p103m.C2570j f24999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25000n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.Drawable f25001o;

    public final void a(int i3) {
        android.view.View view;
        int i9 = this.f24990b ^ i3;
        this.f24990b = i3;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i10 = this.f24990b & 4;
                androidx.appcompat.widget.Toolbar toolbar = this.f24989a;
                if (i10 != 0) {
                    android.graphics.drawable.Drawable drawable = this.f24994f;
                    if (drawable == null) {
                        drawable = this.f25001o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((android.graphics.drawable.Drawable) null);
                }
            }
            if ((i9 & 3) != 0) {
                c();
            }
            int i11 = i9 & 8;
            androidx.appcompat.widget.Toolbar toolbar2 = this.f24989a;
            if (i11 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.f24995h);
                    toolbar2.setSubtitle(this.f24996i);
                } else {
                    toolbar2.setTitle((java.lang.CharSequence) null);
                    toolbar2.setSubtitle((java.lang.CharSequence) null);
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
            boolean zIsEmpty = android.text.TextUtils.isEmpty(this.j);
            androidx.appcompat.widget.Toolbar toolbar = this.f24989a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f25000n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable;
        int i3 = this.f24990b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) == 0 || (drawable = this.f24993e) == null) {
            drawable = this.f24992d;
        }
        this.f24989a.setLogo(drawable);
    }
}
