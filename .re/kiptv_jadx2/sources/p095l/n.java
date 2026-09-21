package p095l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.common.util.concurrent.AbstractC1903s;
import java.util.ArrayList;
import p020c0.C1704s0;
import p197y1.a;

public final class n implements a {

    public o f24660A;

    public MenuItem.OnActionExpandListener f24661B;

    public final int f24663a;

    public final int f24664b;

    public final int f24665c;

    public final int f24666d;

    public CharSequence f24667e;

    public CharSequence f24668f;
    public Intent g;

    public char f24669h;
    public char j;

    public Drawable f24672l;

    public final l f24674n;

    public D f24675o;

    public MenuItem.OnMenuItemClickListener f24676p;

    public CharSequence f24677q;

    public CharSequence f24678r;
    public int y;

    public View f24685z;

    public int f24670i = 4096;

    public int f24671k = 4096;

    public int f24673m = 0;

    public ColorStateList f24679s = null;

    public PorterDuff.Mode f24680t = null;

    public boolean f24681u = false;

    public boolean f24682v = false;

    public boolean f24683w = false;

    public int f24684x = 16;

    public boolean f24662C = false;

    public n(l lVar, int i3, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.f24674n = lVar;
        this.f24663a = i9;
        this.f24664b = i3;
        this.f24665c = i10;
        this.f24666d = i11;
        this.f24667e = charSequence;
        this.y = i12;
    }

    public static void c(StringBuilder sb, int i3, int i9, String str) {
        if ((i3 & i9) == i9) {
            sb.append(str);
        }
    }

    @Override
    public final o a() {
        return this.f24660A;
    }

    @Override
    public final a b(o oVar) {
        this.f24685z = null;
        this.f24660A = oVar;
        this.f24674n.p(true);
        o oVar2 = this.f24660A;
        if (oVar2 != null) {
            oVar2.f24686a = new C1704s0(11, this);
            oVar2.f24687b.setVisibilityListener(oVar2);
        }
        return this;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.f24685z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f24661B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f24674n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
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
        o oVar;
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

    @Override
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f24661B;
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

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f24685z;
        if (view != null) {
            return view;
        }
        o oVar = this.f24660A;
        if (oVar == null) {
            return null;
        }
        View viewOnCreateActionView = oVar.f24687b.onCreateActionView(this);
        this.f24685z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f24671k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f24677q;
    }

    @Override
    public final int getGroupId() {
        return this.f24664b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.f24672l;
        if (drawable != null) {
            return d(drawable);
        }
        int i3 = this.f24673m;
        if (i3 == 0) {
            return null;
        }
        Drawable drawableY = AbstractC1903s.y(this.f24674n.f24636a, i3);
        this.f24673m = 0;
        this.f24672l = drawableY;
        return d(drawableY);
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f24679s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f24680t;
    }

    @Override
    public final Intent getIntent() {
        return this.g;
    }

    @Override
    public final int getItemId() {
        return this.f24663a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f24670i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.f24669h;
    }

    @Override
    public final int getOrder() {
        return this.f24665c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f24675o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f24667e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f24668f;
        return charSequence != null ? charSequence : this.f24667e;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f24678r;
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f24675o != null;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f24662C;
    }

    @Override
    public final boolean isCheckable() {
        return (this.f24684x & 1) == 1;
    }

    @Override
    public final boolean isChecked() {
        return (this.f24684x & 2) == 2;
    }

    @Override
    public final boolean isEnabled() {
        return (this.f24684x & 16) != 0;
    }

    @Override
    public final boolean isVisible() {
        o oVar = this.f24660A;
        if (oVar == null || !oVar.f24687b.overridesItemVisibility()) {
            return (this.f24684x & 8) == 0;
        }
        return (this.f24684x & 8) == 0 && this.f24660A.f24687b.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override
    public final MenuItem setActionView(View view) {
        int i3;
        this.f24685z = view;
        this.f24660A = null;
        if (view != null && view.getId() == -1 && (i3 = this.f24663a) > 0) {
            view.setId(i3);
        }
        l lVar = this.f24674n;
        lVar.f24644k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c9) {
        if (this.j == c9) {
            return this;
        }
        this.j = Character.toLowerCase(c9);
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z6) {
        int i3 = this.f24684x;
        int i9 = (z6 ? 1 : 0) | (i3 & (-2));
        this.f24684x = i9;
        if (i3 != i9) {
            this.f24674n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z6) {
        int i3 = this.f24684x;
        if ((i3 & 4) == 0) {
            int i9 = (i3 & (-3)) | (z6 ? 2 : 0);
            this.f24684x = i9;
            if (i3 != i9) {
                this.f24674n.p(false);
            }
            return this;
        }
        l lVar = this.f24674n;
        lVar.getClass();
        ArrayList arrayList = lVar.f24641f;
        int size = arrayList.size();
        lVar.w();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
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

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f24684x |= 16;
        } else {
            this.f24684x &= -17;
        }
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f24673m = 0;
        this.f24672l = drawable;
        this.f24683w = true;
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f24679s = colorStateList;
        this.f24681u = true;
        this.f24683w = true;
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f24680t = mode;
        this.f24682v = true;
        this.f24683w = true;
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c9) {
        if (this.f24669h == c9) {
            return this;
        }
        this.f24669h = c9;
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24661B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24676p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c9, char c10) {
        this.f24669h = c9;
        this.j = Character.toLowerCase(c10);
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i3) {
        int i9 = i3 & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.y = i3;
        l lVar = this.f24674n;
        lVar.f24644k = true;
        lVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f24667e = charSequence;
        this.f24674n.p(false);
        D d4 = this.f24675o;
        if (d4 != null) {
            d4.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24668f = charSequence;
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z6) {
        int i3 = this.f24684x;
        int i9 = (z6 ? 0 : 8) | (i3 & (-9));
        this.f24684x = i9;
        if (i3 != i9) {
            l lVar = this.f24674n;
            lVar.f24642h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f24667e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override
    public final a setContentDescription(CharSequence charSequence) {
        this.f24677q = charSequence;
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final a setTooltipText(CharSequence charSequence) {
        this.f24678r = charSequence;
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c9, int i3) {
        if (this.j == c9 && this.f24671k == i3) {
            return this;
        }
        this.j = Character.toLowerCase(c9);
        this.f24671k = KeyEvent.normalizeMetaState(i3);
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c9, int i3) {
        if (this.f24669h == c9 && this.f24670i == i3) {
            return this;
        }
        this.f24669h = c9;
        this.f24670i = KeyEvent.normalizeMetaState(i3);
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c9, char c10, int i3, int i9) {
        this.f24669h = c9;
        this.f24670i = KeyEvent.normalizeMetaState(i3);
        this.j = Character.toLowerCase(c10);
        this.f24671k = KeyEvent.normalizeMetaState(i9);
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i3) {
        this.f24672l = null;
        this.f24673m = i3;
        this.f24683w = true;
        this.f24674n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i3) {
        setTitle(this.f24674n.f24636a.getString(i3));
        return this;
    }

    @Override
    public final MenuItem setActionView(int i3) {
        int i9;
        Context context = this.f24674n.f24636a;
        View viewInflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f24685z = viewInflate;
        this.f24660A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i9 = this.f24663a) > 0) {
            viewInflate.setId(i9);
        }
        l lVar = this.f24674n;
        lVar.f24644k = true;
        lVar.p(true);
        return this;
    }
}
