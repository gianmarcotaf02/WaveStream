package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class r implements android.view.MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f24692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p095l.s f24693b;

    public r(p095l.s sVar, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f24693b = sVar;
        this.f24692a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
        return this.f24692a.onMenuItemClick(this.f24693b.i(menuItem));
    }
}
