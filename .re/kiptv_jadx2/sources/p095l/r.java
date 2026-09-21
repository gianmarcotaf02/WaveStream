package p095l;

import android.view.MenuItem;

public final class r implements MenuItem.OnMenuItemClickListener {

    public final MenuItem.OnMenuItemClickListener f24692a;

    public final s f24693b;

    public r(s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24693b = sVar;
        this.f24692a = onMenuItemClickListener;
    }

    @Override
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f24692a.onMenuItemClick(this.f24693b.i(menuItem));
    }
}
