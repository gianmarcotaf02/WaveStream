package androidx.recyclerview.widget;

import Q0.w0;
import android.database.Observable;
import java.util.ArrayList;

public final class B extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((Q) ((C) ((Observable) this).mObservers.get(size))).f17249a;
            recyclerView.f(null);
            recyclerView.f17299m0.f17349e = true;
            recyclerView.R(true);
            if (!recyclerView.f17296l.j()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i3, int i9) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Q q9 = (Q) ((C) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = q9.f17249a;
            recyclerView.f(null);
            w0 w0Var = recyclerView.f17296l;
            w0Var.getClass();
            if (i3 != i9) {
                ArrayList arrayList = (ArrayList) w0Var.f8484c;
                arrayList.add(w0Var.m(8, i3, i9, null));
                w0Var.f8482a |= 8;
                if (arrayList.size() == 1) {
                    q9.a();
                }
            }
        }
    }

    public final void d(int i3, int i9, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Q q9 = (Q) ((C) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = q9.f17249a;
            recyclerView.f(null);
            w0 w0Var = recyclerView.f17296l;
            if (i9 < 1) {
                w0Var.getClass();
            } else {
                ArrayList arrayList = (ArrayList) w0Var.f8484c;
                arrayList.add(w0Var.m(4, i3, i9, obj));
                w0Var.f8482a = 4 | w0Var.f8482a;
                if (arrayList.size() == 1) {
                    q9.a();
                }
            }
        }
    }

    public final void e(int i3, int i9) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Q q9 = (Q) ((C) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = q9.f17249a;
            recyclerView.f(null);
            w0 w0Var = recyclerView.f17296l;
            if (i9 < 1) {
                w0Var.getClass();
            } else {
                ArrayList arrayList = (ArrayList) w0Var.f8484c;
                arrayList.add(w0Var.m(1, i3, i9, null));
                w0Var.f8482a |= 1;
                if (arrayList.size() == 1) {
                    q9.a();
                }
            }
        }
    }

    public final void f(int i3, int i9) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            Q q9 = (Q) ((C) ((Observable) this).mObservers.get(size));
            RecyclerView recyclerView = q9.f17249a;
            recyclerView.f(null);
            w0 w0Var = recyclerView.f17296l;
            if (i9 < 1) {
                w0Var.getClass();
            } else {
                ArrayList arrayList = (ArrayList) w0Var.f8484c;
                arrayList.add(w0Var.m(2, i3, i9, null));
                w0Var.f8482a |= 2;
                if (arrayList.size() == 1) {
                    q9.a();
                }
            }
        }
    }

    public final void g() {
        A a2;
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((Q) ((C) ((Observable) this).mObservers.get(size))).f17249a;
            if (recyclerView.f17294k != null && (a2 = recyclerView.f17312t) != null && a2.canRestoreState()) {
                recyclerView.requestLayout();
            }
        }
    }
}
