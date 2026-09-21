package p095l;

/* JADX INFO: renamed from: l.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2544a implements p197y1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f24579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f24580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.content.Intent f24581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f24582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f24584f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f24585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.content.Context f24586i;
    public java.lang.CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.CharSequence f24587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.content.res.ColorStateList f24588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f24589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24592p;

    @Override // p197y1.a
    public final p095l.o a() {
        return null;
    }

    @Override // p197y1.a
    public final p197y1.a b(p095l.o oVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void c() {
        android.graphics.drawable.Drawable drawable = this.f24585h;
        if (drawable != null) {
            if (this.f24590n || this.f24591o) {
                this.f24585h = drawable;
                android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                this.f24585h = drawableMutate;
                if (this.f24590n) {
                    drawableMutate.setTintList(this.f24588l);
                }
                if (this.f24591o) {
                    this.f24585h.setTintMode(this.f24589m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
        return null;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f24584f;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        return this.f24585h;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.f24588l;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f24589m;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.f24581c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return android.R.id.home;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f24583e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f24582d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.f24579a;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f24580b;
        return charSequence != null ? charSequence : this.f24579a;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.f24587k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f24592p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f24592p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f24592p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f24592p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View view) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c9) {
        this.f24584f = java.lang.Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z6) {
        this.f24592p = (z6 ? 1 : 0) | (this.f24592p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z6) {
        this.f24592p = (z6 ? 2 : 0) | (this.f24592p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z6) {
        this.f24592p = (z6 ? 16 : 0) | (this.f24592p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f24585h = drawable;
        c();
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f24588l = colorStateList;
        this.f24590n = true;
        c();
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f24589m = mode;
        this.f24591o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f24581c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c9) {
        this.f24582d = c9;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c9, char c10) {
        this.f24582d = c9;
        this.f24584f = java.lang.Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f24579a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f24580b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.f24587k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z6) {
        this.f24592p = (this.f24592p & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int i3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c9, int i3) {
        this.f24584f = java.lang.Character.toLowerCase(c9);
        this.g = android.view.KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final p197y1.a setContentDescription(java.lang.CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c9, int i3) {
        this.f24582d = c9;
        this.f24583e = android.view.KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i3) {
        this.f24579a = this.f24586i.getResources().getString(i3);
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final p197y1.a setTooltipText(java.lang.CharSequence charSequence) {
        this.f24587k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i3) {
        this.f24585h = this.f24586i.getDrawable(i3);
        c();
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c9, char c10, int i3, int i9) {
        this.f24582d = c9;
        this.f24583e = android.view.KeyEvent.normalizeMetaState(i3);
        this.f24584f = java.lang.Character.toLowerCase(c10);
        this.g = android.view.KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int i3) {
        return this;
    }
}
