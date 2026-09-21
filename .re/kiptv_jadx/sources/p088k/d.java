package p088k;

/* JADX INFO: loaded from: classes.dex */
public final class d extends android.view.ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f24351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N6.i0 f24352b;

    public d(android.content.Context context, N6.i0 i0Var) {
        this.f24351a = context;
        this.f24352b = i0Var;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f24352b.b();
    }

    @Override // android.view.ActionMode
    public final android.view.View getCustomView() {
        return this.f24352b.c();
    }

    @Override // android.view.ActionMode
    public final android.view.Menu getMenu() {
        return new p095l.A(this.f24351a, this.f24352b.e());
    }

    @Override // android.view.ActionMode
    public final android.view.MenuInflater getMenuInflater() {
        return this.f24352b.f();
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getSubtitle() {
        return this.f24352b.g();
    }

    @Override // android.view.ActionMode
    public final java.lang.Object getTag() {
        return this.f24352b.j;
    }

    @Override // android.view.ActionMode
    public final java.lang.CharSequence getTitle() {
        return this.f24352b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f24352b.f7399i;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f24352b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f24352b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(android.view.View view) {
        this.f24352b.l(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(java.lang.CharSequence charSequence) {
        this.f24352b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(java.lang.Object obj) {
        this.f24352b.j = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(java.lang.CharSequence charSequence) {
        this.f24352b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z6) {
        this.f24352b.r(z6);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i3) {
        this.f24352b.n(i3);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i3) {
        this.f24352b.p(i3);
    }
}
