package p103m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p095l.i;
import p095l.l;
import p095l.n;

public final class F0 extends C2581o0 {

    public final int f24909t;

    public final int f24910u;

    public C0 f24911v;

    public n f24912w;

    public F0(Context context, boolean z6) {
        super(context, z6);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f24909t = 21;
            this.f24910u = 22;
        } else {
            this.f24909t = 22;
            this.f24910u = 21;
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        i iVar;
        int headersCount;
        int iPointToPosition;
        int i3;
        if (this.f24911v != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (i) adapter;
                headersCount = 0;
            }
            n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i3 = iPointToPosition - headersCount) < 0 || i3 >= iVar.getCount()) ? null : iVar.getItem(i3);
            n nVar = this.f24912w;
            if (nVar != nVarB) {
                l lVar = iVar.f24630a;
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

    @Override
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
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
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (i) adapter).f24630a.c(false);
        return true;
    }

    public void setHoverListener(C0 c9) {
        this.f24911v = c9;
    }

    @Override
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
