package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p095l.l implements android.view.SubMenu {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p095l.n f24577A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p095l.l f24578z;

    public D(android.content.Context context, p095l.l lVar, p095l.n nVar) {
        super(context);
        this.f24578z = lVar;
        this.f24577A = nVar;
    }

    @Override // p095l.l
    public final boolean d(p095l.n nVar) {
        return this.f24578z.d(nVar);
    }

    @Override // p095l.l
    public final boolean e(p095l.l lVar, android.view.MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f24578z.e(lVar, menuItem);
    }

    @Override // p095l.l
    public final boolean f(p095l.n nVar) {
        return this.f24578z.f(nVar);
    }

    @Override // android.view.SubMenu
    public final android.view.MenuItem getItem() {
        return this.f24577A;
    }

    @Override // p095l.l
    public final java.lang.String j() {
        p095l.n nVar = this.f24577A;
        int i3 = nVar != null ? nVar.f24663a : 0;
        if (i3 == 0) {
            return null;
        }
        return com.google.android.gms.internal.play_billing.M0.l(i3, "android:menu:actionviewstates:");
    }

    @Override // p095l.l
    public final p095l.l k() {
        return this.f24578z.k();
    }

    @Override // p095l.l
    public final boolean m() {
        return this.f24578z.m();
    }

    @Override // p095l.l
    public final boolean n() {
        return this.f24578z.n();
    }

    @Override // p095l.l
    public final boolean o() {
        return this.f24578z.o();
    }

    @Override // p095l.l, android.view.Menu
    public final void setGroupDividerEnabled(boolean z6) {
        this.f24578z.setGroupDividerEnabled(z6);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(android.graphics.drawable.Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(java.lang.CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderView(android.view.View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(android.graphics.drawable.Drawable drawable) {
        this.f24577A.setIcon(drawable);
        return this;
    }

    @Override // p095l.l, android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f24578z.setQwertyMode(z6);
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderIcon(int i3) {
        u(0, null, i3, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setHeaderTitle(int i3) {
        u(i3, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final android.view.SubMenu setIcon(int i3) {
        this.f24577A.setIcon(i3);
        return this;
    }
}
