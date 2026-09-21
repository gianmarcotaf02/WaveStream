package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements p095l.x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p095l.l f24964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p095l.n f24965i;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar j;

    public T0(androidx.appcompat.widget.Toolbar toolbar) {
        this.j = toolbar;
    }

    @Override // p095l.x
    public final boolean b(p095l.n nVar) {
        androidx.appcompat.widget.Toolbar toolbar = this.j;
        toolbar.c();
        android.view.ViewParent parent = toolbar.f15766o.getParent();
        if (parent != toolbar) {
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(toolbar.f15766o);
            }
            toolbar.addView(toolbar.f15766o);
        }
        android.view.View actionView = nVar.getActionView();
        toolbar.f15767p = actionView;
        this.f24965i = nVar;
        android.view.ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent2).removeView(toolbar.f15767p);
            }
            p103m.U0 u0H = androidx.appcompat.widget.Toolbar.h();
            u0H.f24977a = (toolbar.f15772u & 112) | 8388611;
            u0H.f24978b = 2;
            toolbar.f15767p.setLayoutParams(u0H);
            toolbar.addView(toolbar.f15767p);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = toolbar.getChildAt(childCount);
            if (((p103m.U0) childAt.getLayoutParams()).f24978b != 2 && childAt != toolbar.f15760h) {
                toolbar.removeViewAt(childCount);
                toolbar.f15749L.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f24662C = true;
        nVar.f24674n.p(false);
        android.view.KeyEvent.Callback callback = toolbar.f15767p;
        if (callback instanceof p088k.a) {
            ((p095l.p) ((p088k.a) callback)).f24689h.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // p095l.x
    public final boolean d() {
        return false;
    }

    @Override // p095l.x
    public final void f() {
        if (this.f24965i != null) {
            p095l.l lVar = this.f24964h;
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

    @Override // p095l.x
    public final void i(android.content.Context context, p095l.l lVar) {
        p095l.n nVar;
        p095l.l lVar2 = this.f24964h;
        if (lVar2 != null && (nVar = this.f24965i) != null) {
            lVar2.d(nVar);
        }
        this.f24964h = lVar;
    }

    @Override // p095l.x
    public final boolean j(p095l.D d4) {
        return false;
    }

    @Override // p095l.x
    public final boolean k(p095l.n nVar) {
        androidx.appcompat.widget.Toolbar toolbar = this.j;
        android.view.KeyEvent.Callback callback = toolbar.f15767p;
        if (callback instanceof p088k.a) {
            ((p095l.p) ((p088k.a) callback)).f24689h.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f15767p);
        toolbar.removeView(toolbar.f15766o);
        toolbar.f15767p = null;
        java.util.ArrayList arrayList = toolbar.f15749L;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((android.view.View) arrayList.get(size));
        }
        arrayList.clear();
        this.f24965i = null;
        toolbar.requestLayout();
        nVar.f24662C = false;
        nVar.f24674n.p(false);
        toolbar.t();
        return true;
    }

    @Override // p095l.x
    public final void c(p095l.l lVar, boolean z6) {
    }
}
