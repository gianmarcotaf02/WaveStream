package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class n implements p197y1.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p095l.o f24660A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public android.view.MenuItem.OnActionExpandListener f24661B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f24667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f24668f;
    public android.content.Intent g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f24669h;
    public char j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.graphics.drawable.Drawable f24672l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p095l.l f24674n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p095l.D f24675o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public android.view.MenuItem.OnMenuItemClickListener f24676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.lang.CharSequence f24677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence f24678r;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public android.view.View f24685z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24670i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24671k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24673m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public android.content.res.ColorStateList f24679s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f24680t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24681u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f24682v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24683w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24684x = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f24662C = false;

    public n(p095l.l lVar, int i3, int i9, int i10, int i11, java.lang.CharSequence charSequence, int i12) {
        this.f24674n = lVar;
        this.f24663a = i9;
        this.f24664b = i3;
        this.f24665c = i10;
        this.f24666d = i11;
        this.f24667e = charSequence;
        this.y = i12;
    }

    public static void c(java.lang.StringBuilder sb, int i3, int i9, java.lang.String str) {
        if ((i3 & i9) == i9) {
            sb.append(str);
        }
    }

    @Override // p197y1.a
    public final p095l.o a() {
        return this.f24660A;
    }

    @Override // p197y1.a
    public final p197y1.a b(p095l.o oVar) {
        this.f24685z = null;
        this.f24660A = oVar;
        this.f24674n.p(true);
        p095l.o oVar2 = this.f24660A;
        if (oVar2 != null) {
            oVar2.f24686a = new p020c0.C1704s0(11, this);
            oVar2.f24687b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f24685z == null) {
            return true;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.f24661B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f24674n.d(this);
        }
        return false;
    }

    public final android.graphics.drawable.Drawable d(android.graphics.drawable.Drawable drawable) {
        if (drawable != null && this.f24683w && (this.f24681u || this.f24682v)) {
            drawable = drawable.mutate();
            if (this.f24681u) {
                drawable.setTintList(this.f24679s);
            }
            if (this.f24682v) {
                drawable.setTintMode(this.f24680t);
            }
            this.f24683w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p095l.o oVar;
        if ((this.y & 8) != 0) {
            if (this.f24685z == null && (oVar = this.f24660A) != null) {
                this.f24685z = oVar.f24687b.onCreateActionView(this);
            }
            if (this.f24685z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        android.view.MenuItem.OnActionExpandListener onActionExpandListener = this.f24661B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f24674n.f(this);
        }
        return false;
    }

    public final void f(boolean z6) {
        if (z6) {
            this.f24684x |= 32;
        } else {
            this.f24684x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.View getActionView() {
        android.view.View view = this.f24685z;
        if (view != null) {
            return view;
        }
        p095l.o oVar = this.f24660A;
        if (oVar == null) {
            return null;
        }
        android.view.View viewOnCreateActionView = oVar.f24687b.onCreateActionView(this);
        this.f24685z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f24671k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final java.lang.CharSequence getContentDescription() {
        return this.f24677q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f24664b;
    }

    @Override // android.view.MenuItem
    public final android.graphics.drawable.Drawable getIcon() {
        android.graphics.drawable.Drawable drawable = this.f24672l;
        if (drawable != null) {
            return d(drawable);
        }
        int i3 = this.f24673m;
        if (i3 == 0) {
            return null;
        }
        android.graphics.drawable.Drawable drawableY = com.google.common.util.concurrent.AbstractC1903s.y(this.f24674n.f24636a, i3);
        this.f24673m = 0;
        this.f24672l = drawableY;
        return d(drawableY);
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.content.res.ColorStateList getIconTintList() {
        return this.f24679s;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.graphics.PorterDuff.Mode getIconTintMode() {
        return this.f24680t;
    }

    @Override // android.view.MenuItem
    public final android.content.Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f24663a;
    }

    @Override // android.view.MenuItem
    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f24670i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f24669h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f24665c;
    }

    @Override // android.view.MenuItem
    public final android.view.SubMenu getSubMenu() {
        return this.f24675o;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitle() {
        return this.f24667e;
    }

    @Override // android.view.MenuItem
    public final java.lang.CharSequence getTitleCondensed() {
        java.lang.CharSequence charSequence = this.f24668f;
        return charSequence != null ? charSequence : this.f24667e;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final java.lang.CharSequence getTooltipText() {
        return this.f24678r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f24675o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f24662C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f24684x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f24684x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f24684x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p095l.o oVar = this.f24660A;
        if (oVar == null || !oVar.f24687b.overridesItemVisibility()) {
            return (this.f24684x & 8) == 0;
        }
        return (this.f24684x & 8) == 0 && this.f24660A.f24687b.isVisible();
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new java.lang.UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(android.view.View view) {
        int i3;
        this.f24685z = view;
        this.f24660A = null;
        if (view != null && view.getId() == -1 && (i3 = this.f24663a) > 0) {
            view.setId(i3);
        }
        p095l.l lVar = this.f24674n;
        lVar.f24644k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c9) {
        if (this.j == c9) {
            return this;
        }
        this.j = java.lang.Character.toLowerCase(c9);
        this.f24674n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setCheckable(boolean z6) {
        int i3 = this.f24684x;
        int i9 = (z6 ? 1 : 0) | (i3 & (-2));
        this.f24684x = i9;
        if (i3 != i9) {
            this.f24674n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setChecked(boolean z6) {
        int i3 = this.f24684x;
        if ((i3 & 4) == 0) {
            int i9 = (i3 & (-3)) | (z6 ? 2 : 0);
            this.f24684x = i9;
            if (i3 != i9) {
                this.f24674n.p(false);
            }
            return this;
        }
        p095l.l lVar = this.f24674n;
        lVar.getClass();
        java.util.ArrayList arrayList = lVar.f24641f;
        int size = arrayList.size();
        lVar.w();
        for (int i10 = 0; i10 < size; i10++) {
            p095l.n nVar = (p095l.n) arrayList.get(i10);
            if (nVar.f24664b == this.f24664b && (nVar.f24684x & 4) != 0 && nVar.isCheckable()) {
                boolean z9 = nVar == this;
                int i11 = nVar.f24684x;
                int i12 = (z9 ? 2 : 0) | (i11 & (-3));
                nVar.f24684x = i12;
                if (i11 != i12) {
                    nVar.f24674n.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f24684x |= 16;
        } else {
            this.f24684x &= -17;
        }
        this.f24674n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(android.graphics.drawable.Drawable drawable) {
        this.f24673m = 0;
        this.f24672l = drawable;
        this.f24683w = true;
        this.f24674n.p(false);
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList) {
        this.f24679s = colorStateList;
        this.f24681u = true;
        this.f24683w = true;
        this.f24674n.p(false);
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f24680t = mode;
        this.f24682v = true;
        this.f24683w = true;
        this.f24674n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIntent(android.content.Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c9) {
        if (this.f24669h == c9) {
            return this;
        }
        this.f24669h = c9;
        this.f24674n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24661B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24676p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c9, char c10) {
        this.f24669h = c9;
        this.j = java.lang.Character.toLowerCase(c10);
        this.f24674n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i9 = i3 & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new java.lang.IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i3;
        p095l.l lVar = this.f24674n;
        lVar.f24644k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(java.lang.CharSequence charSequence) {
        this.f24667e = charSequence;
        this.f24674n.p(false);
        p095l.D d4 = this.f24675o;
        if (d4 != null) {
            d4.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitleCondensed(java.lang.CharSequence charSequence) {
        this.f24668f = charSequence;
        this.f24674n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setVisible(boolean z6) {
        int i3 = this.f24684x;
        int i9 = (z6 ? 0 : 8) | (i3 & (-9));
        this.f24684x = i9;
        if (i3 != i9) {
            p095l.l lVar = this.f24674n;
            lVar.f24642h = true;
            lVar.p(true);
        }
        return this;
    }

    public final java.lang.String toString() {
        java.lang.CharSequence charSequence = this.f24667e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final p197y1.a setContentDescription(java.lang.CharSequence charSequence) {
        this.f24677q = charSequence;
        this.f24674n.p(false);
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final p197y1.a setTooltipText(java.lang.CharSequence charSequence) {
        this.f24678r = charSequence;
        this.f24674n.p(false);
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setAlphabeticShortcut(char c9, int i3) {
        if (this.j == c9 && this.f24671k == i3) {
            return this;
        }
        this.j = java.lang.Character.toLowerCase(c9);
        this.f24671k = android.view.KeyEvent.normalizeMetaState(i3);
        this.f24674n.p(false);
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setNumericShortcut(char c9, int i3) {
        if (this.f24669h == c9 && this.f24670i == i3) {
            return this;
        }
        this.f24669h = c9;
        this.f24670i = android.view.KeyEvent.normalizeMetaState(i3);
        this.f24674n.p(false);
        return this;
    }

    @Override // p197y1.a, android.view.MenuItem
    public final android.view.MenuItem setShortcut(char c9, char c10, int i3, int i9) {
        this.f24669h = c9;
        this.f24670i = android.view.KeyEvent.normalizeMetaState(i3);
        this.j = java.lang.Character.toLowerCase(c10);
        this.f24671k = android.view.KeyEvent.normalizeMetaState(i9);
        this.f24674n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setIcon(int i3) {
        this.f24672l = null;
        this.f24673m = i3;
        this.f24683w = true;
        this.f24674n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setTitle(int i3) {
        setTitle(this.f24674n.f24636a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final android.view.MenuItem setActionView(int i3) {
        int i9;
        android.content.Context context = this.f24674n.f24636a;
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(i3, (android.view.ViewGroup) new android.widget.LinearLayout(context), false);
        this.f24685z = viewInflate;
        this.f24660A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i9 = this.f24663a) > 0) {
            viewInflate.setId(i9);
        }
        p095l.l lVar = this.f24674n;
        lVar.f24644k = true;
        lVar.p(true);
        return this;
    }
}
