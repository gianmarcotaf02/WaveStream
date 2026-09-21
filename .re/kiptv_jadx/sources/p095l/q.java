package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class q implements android.view.MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.MenuItem.OnActionExpandListener f24690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p095l.s f24691b;

    public q(p095l.s sVar, android.view.MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f24691b = sVar;
        this.f24690a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(android.view.MenuItem menuItem) {
        return this.f24690a.onMenuItemActionCollapse(this.f24691b.i(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(android.view.MenuItem menuItem) {
        return this.f24690a.onMenuItemActionExpand(this.f24691b.i(menuItem));
    }
}
