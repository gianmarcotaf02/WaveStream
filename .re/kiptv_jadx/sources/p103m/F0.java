package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends p103m.C2581o0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f24909t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f24910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p103m.C0 f24911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p095l.n f24912w;

    public F0(android.content.Context context, boolean z6) {
        super(context, z6);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f24909t = 21;
            this.f24910u = 22;
        } else {
            this.f24909t = 22;
            this.f24910u = 21;
        }
    }

    @Override // p103m.C2581o0, android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        p095l.i iVar;
        int headersCount;
        int iPointToPosition;
        int i3;
        if (this.f24911v != null) {
            android.widget.ListAdapter adapter = getAdapter();
            if (adapter instanceof android.widget.HeaderViewListAdapter) {
                android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (p095l.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (p095l.i) adapter;
                headersCount = 0;
            }
            p095l.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = iPointToPosition - headersCount) < 0 || i3 >= iVar.getCount()) ? null : iVar.getItem(i3);
            p095l.n nVar = this.f24912w;
            if (nVar != nVarB) {
                p095l.l lVar = iVar.f24630a;
                if (nVar != null) {
                    this.f24911v.g(lVar, nVar);
                }
                this.f24912w = nVarB;
                if (nVarB != null) {
                    this.f24911v.E(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, android.view.KeyEvent keyEvent) {
        androidx.appcompat.view.menu.ListMenuItemView listMenuItemView = (androidx.appcompat.view.menu.ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i3 == this.f24909t) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i3 != this.f24910u) {
            return super.onKeyDown(i3, keyEvent);
        }
        setSelection(-1);
        android.widget.ListAdapter adapter = getAdapter();
        (adapter instanceof android.widget.HeaderViewListAdapter ? (p095l.i) ((android.widget.HeaderViewListAdapter) adapter).getWrappedAdapter() : (p095l.i) adapter).f24630a.c(false);
        return true;
    }

    public void setHoverListener(p103m.C0 c9) {
        this.f24911v = c9;
    }

    @Override // p103m.C2581o0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable drawable) {
        super.setSelector(drawable);
    }
}
