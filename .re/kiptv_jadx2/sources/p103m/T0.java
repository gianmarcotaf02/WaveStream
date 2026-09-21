package p103m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p088k.a;
import p095l.D;
import p095l.l;
import p095l.n;
import p095l.p;
import p095l.x;

public final class T0 implements x {

    public l f24964h;

    public n f24965i;
    public final Toolbar j;

    public T0(Toolbar toolbar) {
        this.j = toolbar;
    }

    @Override
    public final boolean b(n nVar) {
        Toolbar toolbar = this.j;
        toolbar.c();
        ViewParent parent = toolbar.f15766o.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f15766o);
            }
            toolbar.addView(toolbar.f15766o);
        }
        View actionView = nVar.getActionView();
        toolbar.f15767p = actionView;
        this.f24965i = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f15767p);
            }
            U0 u0H = Toolbar.h();
            u0H.f24977a = (toolbar.f15772u & 112) | 8388611;
            u0H.f24978b = 2;
            toolbar.f15767p.setLayoutParams(u0H);
            toolbar.addView(toolbar.f15767p);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((U0) childAt.getLayoutParams()).f24978b != 2 && childAt != toolbar.f15760h) {
                toolbar.removeViewAt(childCount);
                toolbar.f15749L.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f24662C = true;
        nVar.f24674n.p(false);
        KeyEvent.Callback callback = toolbar.f15767p;
        if (callback instanceof a) {
            ((p) ((a) callback)).f24689h.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void f() {
        if (this.f24965i != null) {
            l lVar = this.f24964h;
            if (lVar != null) {
                int size = lVar.f24641f.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f24964h.getItem(i3) == this.f24965i) {
                        return;
                    }
                }
            }
            k(this.f24965i);
        }
    }

    @Override
    public final void i(Context context, l lVar) {
        n nVar;
        l lVar2 = this.f24964h;
        if (lVar2 != null && (nVar = this.f24965i) != null) {
            lVar2.d(nVar);
        }
        this.f24964h = lVar;
    }

    @Override
    public final boolean j(D d4) {
        return false;
    }

    @Override
    public final boolean k(n nVar) {
        Toolbar toolbar = this.j;
        KeyEvent.Callback callback = toolbar.f15767p;
        if (callback instanceof a) {
            ((p) ((a) callback)).f24689h.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f15767p);
        toolbar.removeView(toolbar.f15766o);
        toolbar.f15767p = null;
        ArrayList arrayList = toolbar.f15749L;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f24965i = null;
        toolbar.requestLayout();
        nVar.f24662C = false;
        nVar.f24674n.p(false);
        toolbar.t();
        return true;
    }

    @Override
    public final void c(l lVar, boolean z6) {
    }
}
