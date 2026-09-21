package p095l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p197y1.a;

public final class C2544a implements a {

    public CharSequence f24579a;

    public CharSequence f24580b;

    public Intent f24581c;

    public char f24582d;

    public int f24583e;

    public char f24584f;
    public int g;

    public Drawable f24585h;

    public Context f24586i;
    public CharSequence j;

    public CharSequence f24587k;

    public ColorStateList f24588l;

    public PorterDuff.Mode f24589m;

    public boolean f24590n;

    public boolean f24591o;

    public int f24592p;

    @Override
    public final o a() {
        return null;
    }

    @Override
    public final a b(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f24585h;
        if (drawable != null) {
            if (this.f24590n || this.f24591o) {
                this.f24585h = drawable;
                Drawable drawableMutate = drawable.mutate();
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

    @Override
    public final boolean collapseActionView() {
        return false;
    }

    @Override
    public final boolean expandActionView() {
        return false;
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final View getActionView() {
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f24584f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override
    public final int getGroupId() {
        return 0;
    }

    @Override
    public final Drawable getIcon() {
        return this.f24585h;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f24588l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f24589m;
    }

    @Override
    public final Intent getIntent() {
        return this.f24581c;
    }

    @Override
    public final int getItemId() {
        return R.id.home;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f24583e;
    }

    @Override
    public final char getNumericShortcut() {
        return this.f24582d;
    }

    @Override
    public final int getOrder() {
        return 0;
    }

    @Override
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f24579a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24580b;
        return charSequence != null ? charSequence : this.f24579a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f24587k;
    }

    @Override
    public final boolean hasSubMenu() {
        return false;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override
    public final boolean isCheckable() {
        return (this.f24592p & 1) != 0;
    }

    @Override
    public final boolean isChecked() {
        return (this.f24592p & 2) != 0;
    }

    @Override
    public final boolean isEnabled() {
        return (this.f24592p & 16) != 0;
    }

    @Override
    public final boolean isVisible() {
        return (this.f24592p & 8) == 0;
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f24584f = Character.toLowerCase(c9);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z6) {
        this.f24592p = (z6 ? 1 : 0) | (this.f24592p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z6) {
        this.f24592p = (z6 ? 2 : 0) | (this.f24592p & (-3));
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z6) {
        this.f24592p = (z6 ? 16 : 0) | (this.f24592p & (-17));
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f24585h = drawable;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24588l = colorStateList;
        this.f24590n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24589m = mode;
        this.f24591o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f24581c = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c9) {
        this.f24582d = c9;
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setShortcut(char c9, char c10) {
        this.f24582d = c9;
        this.f24584f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f24579a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24580b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f24587k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z6) {
        this.f24592p = (this.f24592p & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c9, int i3) {
        this.f24584f = Character.toLowerCase(c9);
        this.g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override
    public final a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c9, int i3) {
        this.f24582d = c9;
        this.f24583e = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i3) {
        this.f24579a = this.f24586i.getResources().getString(i3);
        return this;
    }

    @Override
    public final a setTooltipText(CharSequence charSequence) {
        this.f24587k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setIcon(int i3) {
        this.f24585h = this.f24586i.getDrawable(i3);
        c();
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c9, char c10, int i3, int i9) {
        this.f24582d = c9;
        this.f24583e = KeyEvent.normalizeMetaState(i3);
        this.f24584f = Character.toLowerCase(c10);
        this.g = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override
    public final void setShowAsAction(int i3) {
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i3) {
        return this;
    }
}
