package p095l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.google.android.gms.internal.play_billing.M0;

public final class D extends l implements SubMenu {

    public final n f24577A;

    public final l f24578z;

    public D(Context context, l lVar, n nVar) {
        super(context);
        this.f24578z = lVar;
        this.f24577A = nVar;
    }

    @Override
    public final boolean d(n nVar) {
        return this.f24578z.d(nVar);
    }

    @Override
    public final boolean e(l lVar, MenuItem menuItem) {
        return super.e(lVar, menuItem) || this.f24578z.e(lVar, menuItem);
    }

    @Override
    public final boolean f(n nVar) {
        return this.f24578z.f(nVar);
    }

    @Override
    public final MenuItem getItem() {
        return this.f24577A;
    }

    @Override
    public final String j() {
        n nVar = this.f24577A;
        int i3 = nVar != null ? nVar.f24663a : 0;
        if (i3 == 0) {
            return null;
        }
        return M0.l(i3, "android:menu:actionviewstates:");
    }

    @Override
    public final l k() {
        return this.f24578z.k();
    }

    @Override
    public final boolean m() {
        return this.f24578z.m();
    }

    @Override
    public final boolean n() {
        return this.f24578z.n();
    }

    @Override
    public final boolean o() {
        return this.f24578z.o();
    }

    @Override
    public final void setGroupDividerEnabled(boolean z6) {
        this.f24578z.setGroupDividerEnabled(z6);
    }

    @Override
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override
    public final SubMenu setIcon(Drawable drawable) {
        this.f24577A.setIcon(drawable);
        return this;
    }

    @Override
    public final void setQwertyMode(boolean z6) {
        this.f24578z.setQwertyMode(z6);
    }

    @Override
    public final SubMenu setHeaderIcon(int i3) {
        u(0, null, i3, null, null);
        return this;
    }

    @Override
    public final SubMenu setHeaderTitle(int i3) {
        u(i3, null, 0, null, null);
        return this;
    }

    @Override
    public final SubMenu setIcon(int i3) {
        this.f24577A.setIcon(i3);
        return this;
    }
}
