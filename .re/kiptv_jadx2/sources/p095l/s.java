package p095l;

import R0.AbstractC0815c;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import p197y1.a;

public final class s extends AbstractC0815c implements MenuItem {

    public final a f24694c;

    public Method f24695d;

    public s(Context context, a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f24694c = aVar;
    }

    @Override
    public final boolean collapseActionView() {
        return this.f24694c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f24694c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        o oVarA = this.f24694c.a();
        if (oVarA != null) {
            return oVarA.f24687b;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f24694c.getActionView();
        return actionView instanceof p ? (View) ((p) actionView).f24689h : actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f24694c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f24694c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f24694c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f24694c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f24694c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f24694c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f24694c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f24694c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f24694c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f24694c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f24694c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f24694c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f24694c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f24694c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f24694c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f24694c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f24694c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f24694c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f24694c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f24694c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f24694c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f24694c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f24694c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f24694c.b(oVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f24694c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f24694c.setAlphabeticShortcut(c9);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z6) {
        this.f24694c.setCheckable(z6);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z6) {
        this.f24694c.setChecked(z6);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f24694c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z6) {
        this.f24694c.setEnabled(z6);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f24694c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24694c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24694c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f24694c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c9) {
        this.f24694c.setNumericShortcut(c9);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24694c.setOnActionExpandListener(onActionExpandListener != null ? new q(this, onActionExpandListener) : null);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24694c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new r(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c9, char c10) {
        this.f24694c.setShortcut(c9, c10);
        return this;
    }

    @Override
    public final void setShowAsAction(int i3) {
        this.f24694c.setShowAsAction(i3);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i3) {
        this.f24694c.setShowAsActionFlags(i3);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f24694c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24694c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f24694c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z6) {
        return this.f24694c.setVisible(z6);
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c9, int i3) {
        this.f24694c.setAlphabeticShortcut(c9, i3);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i3) {
        this.f24694c.setIcon(i3);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c9, int i3) {
        this.f24694c.setNumericShortcut(c9, i3);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c9, char c10, int i3, int i9) {
        this.f24694c.setShortcut(c9, c10, i3, i9);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i3) {
        this.f24694c.setTitle(i3);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i3) {
        a aVar = this.f24694c;
        aVar.setActionView(i3);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }
}
