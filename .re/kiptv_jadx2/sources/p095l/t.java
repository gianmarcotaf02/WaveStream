package p095l;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class t implements B, x, AdapterView.OnItemClickListener {

    public Rect f24696h;

    public static int m(ListAdapter listAdapter, Context context, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i9 = 0;
        int i10 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = listAdapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
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

    public static boolean u(l lVar) {
        int size = lVar.f24641f.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = lVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final boolean k(n nVar) {
        return false;
    }

    public abstract void l(l lVar);

    public abstract void n(View view);

    public abstract void o(boolean z6);

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (i) listAdapter).f24630a.q((MenuItem) listAdapter.getItem(i3), this, !(this instanceof f) ? 0 : 4);
    }

    public abstract void p(int i3);

    public abstract void q(int i3);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z6);

    public abstract void t(int i3);

    @Override
    public final void i(Context context, l lVar) {
    }
}
