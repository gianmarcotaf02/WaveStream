package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class s extends R0.AbstractC0815c implements android.view.MenuItem {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p197y1.a f24694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.reflect.Method f24695d;

    public s(android.content.Context context, p197y1.a aVar) {
        super(context);
        if (aVar == null) {
            throw new java.lang.IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f24694c = aVar;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f24694c.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f24694c.expandActionView();
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        p095l.o oVarA = this.f24694c.a();
        if (oVarA != null) {
            return oVarA.f24687b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
        android.view.View actionView = this.f24694c.getActionView();
        return actionView instanceof p095l.p ? (android.view.View) ((p095l.p) actionView).f24689h : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f24694c.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f24694c.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.f24694c.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f24694c.getGroupId();
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        return this.f24694c.getIcon();
    }

    @Override // android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.f24694c.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f24694c.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.f24694c.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f24694c.getItemId();
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f24694c.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f24694c.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f24694c.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f24694c.getOrder();
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return this.f24694c.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.f24694c.getTitle();
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        return this.f24694c.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.f24694c.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f24694c.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f24694c.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f24694c.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f24694c.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f24694c.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f24694c.isVisible();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        p095l.o oVar = new p095l.o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f24694c.b(oVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new p095l.p(view);
        }
        this.f24694c.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c9) {
        this.f24694c.setAlphabeticShortcut(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z6) {
        this.f24694c.setCheckable(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z6) {
        this.f24694c.setChecked(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        this.f24694c.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z6) {
        this.f24694c.setEnabled(z6);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f24694c.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f24694c.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f24694c.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.f24694c.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c9) {
        this.f24694c.setNumericShortcut(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24694c.setOnActionExpandListener(onActionExpandListener != null ? new p095l.q(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24694c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new p095l.r(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c9, char c10) {
        this.f24694c.setShortcut(c9, c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        this.f24694c.setShowAsAction(i3);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int i3) {
        this.f24694c.setShowAsActionFlags(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f24694c.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f24694c.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        this.f24694c.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z6) {
        return this.f24694c.setVisible(z6);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c9, int i3) {
        this.f24694c.setAlphabeticShortcut(c9, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i3) {
        this.f24694c.setIcon(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c9, int i3) {
        this.f24694c.setNumericShortcut(c9, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c9, char c10, int i3, int i9) {
        this.f24694c.setShortcut(c9, c10, i3, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i3) {
        this.f24694c.setTitle(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int i3) {
        p197y1.a aVar = this.f24694c;
        aVar.setActionView(i3);
        android.view.View actionView = aVar.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            aVar.setActionView(new p095l.p(actionView));
        }
        return this;
    }
}
