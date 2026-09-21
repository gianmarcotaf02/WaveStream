package p095l;

import android.view.MenuItem;

public final class q implements MenuItem.OnActionExpandListener {

    public final MenuItem.OnActionExpandListener f24690a;

    public final s f24691b;

    public q(s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24691b = sVar;
        this.f24690a = onActionExpandListener;
    }

    @Override
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f24690a.onMenuItemActionCollapse(this.f24691b.i(menuItem));
    }

    @Override
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f24690a.onMenuItemActionExpand(this.f24691b.i(menuItem));
    }
}
