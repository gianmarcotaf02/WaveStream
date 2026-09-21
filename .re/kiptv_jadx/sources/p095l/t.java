package p095l;

/* JADX INFO: loaded from: classes.dex */
public abstract class t implements p095l.B, p095l.x, android.widget.AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f24696h;

    public static int m(android.widget.ListAdapter listAdapter, android.content.Context context, int i3) {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i9 = 0;
        int i10 = 0;
        android.widget.FrameLayout frameLayout = null;
        android.view.View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = listAdapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(context);
            }
            view = listAdapter.getView(i11, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i9) {
                i9 = measuredWidth;
            }
        }
        return i9;
    }

    public static boolean u(p095l.l lVar) {
        int size = lVar.f24641f.size();
        for (int i3 = 0; i3 < size; i3++) {
            android.view.MenuItem item = lVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p095l.x
    public final boolean b(p095l.n nVar) {
        return false;
    }

    @Override // p095l.x
    public final boolean k(p095l.n nVar) {
        return false;
    }

    public abstract void l(p095l.l lVar);

    public abstract void n(android.view.View view);

    public abstract void o(boolean z6);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i3, long j) {
        android.widget.ListAdapter listAdapter = (android.widget.ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof android.widget.HeaderViewListAdapter ? (p095l.i) ((android.widget.HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (p095l.i) listAdapter).f24630a.q((android.view.MenuItem) listAdapter.getItem(i3), this, !(this instanceof p095l.f) ? 0 : 4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(android.widget.PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z6);

    public abstract void t(int i3);

    @Override // p095l.x
    public final void i(android.content.Context context, p095l.l lVar) {
    }
}
