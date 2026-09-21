package p197y1;

/* JADX INFO: loaded from: classes.dex */
public interface a extends android.view.MenuItem {
    p095l.o a();

    p197y1.a b(p095l.o oVar);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getContentDescription();

    @Override // android.view.MenuItem
    android.content.res.ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    android.graphics.PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    java.lang.CharSequence getTooltipText();

    @Override // android.view.MenuItem
    android.view.MenuItem setAlphabeticShortcut(char c9, int i3);

    @Override // android.view.MenuItem
    p197y1.a setContentDescription(java.lang.CharSequence charSequence);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintList(android.content.res.ColorStateList colorStateList);

    @Override // android.view.MenuItem
    android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    android.view.MenuItem setNumericShortcut(char c9, int i3);

    @Override // android.view.MenuItem
    android.view.MenuItem setShortcut(char c9, char c10, int i3, int i9);

    @Override // android.view.MenuItem
    p197y1.a setTooltipText(java.lang.CharSequence charSequence);
}
