package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1640w implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f17521i;

    public /* synthetic */ RunnableC1640w(androidx.recyclerview.widget.RecyclerView recyclerView, int i3) {
        this.f17520h = i3;
        this.f17521i = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17521i;
        switch (this.f17520h) {
            case 0:
                if (recyclerView.f17259B && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f17323z) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.f17265E) {
                        recyclerView.k();
                    } else {
                        recyclerView.f17263D = true;
                    }
                    break;
                }
                break;
            default:
                androidx.recyclerview.widget.F f9 = recyclerView.f17279S;
                if (f9 != null) {
                    androidx.recyclerview.widget.C1626h c1626h = (androidx.recyclerview.widget.C1626h) f9;
                    java.util.ArrayList arrayList = c1626h.f17431h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    java.util.ArrayList arrayList2 = c1626h.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    java.util.ArrayList arrayList3 = c1626h.f17433k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    java.util.ArrayList arrayList4 = c1626h.f17432i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        java.util.Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j = c1626h.f17189d;
                            if (zHasNext) {
                                androidx.recyclerview.widget.X x9 = (androidx.recyclerview.widget.X) it.next();
                                android.view.View view = x9.itemView;
                                android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c1626h.f17439q.add(x9);
                                viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new androidx.recyclerview.widget.C1621c(c1626h, x9, viewPropertyAnimatorAnimate, view)).start();
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1626h.f17435m.add(arrayList5);
                                    arrayList2.clear();
                                    androidx.recyclerview.widget.RunnableC1620b runnableC1620b = new androidx.recyclerview.widget.RunnableC1620b(c1626h, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC1620b.run();
                                    } else {
                                        android.view.View view2 = ((androidx.recyclerview.widget.C1625g) arrayList5.get(0)).f17420a.itemView;
                                        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                                        view2.postOnAnimationDelayed(runnableC1620b, j);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1626h.f17436n.add(arrayList6);
                                    arrayList3.clear();
                                    androidx.recyclerview.widget.RunnableC1620b runnableC1620b2 = new androidx.recyclerview.widget.RunnableC1620b(c1626h, arrayList6, 1);
                                    if (zIsEmpty) {
                                        runnableC1620b2.run();
                                    } else {
                                        android.view.View view3 = ((androidx.recyclerview.widget.C1624f) arrayList6.get(0)).f17408a.itemView;
                                        java.util.WeakHashMap weakHashMap2 = D1.U.f1980a;
                                        view3.postOnAnimationDelayed(runnableC1620b2, j);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1626h.f17434l.add(arrayList7);
                                    arrayList4.clear();
                                    androidx.recyclerview.widget.RunnableC1620b runnableC1620b3 = new androidx.recyclerview.widget.RunnableC1620b(c1626h, arrayList7, 2);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC1620b3.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j = 0;
                                        }
                                        long jMax = java.lang.Math.max(!zIsEmpty2 ? c1626h.f17190e : 0L, zIsEmpty3 ? 0L : c1626h.f17191f) + j;
                                        android.view.View view4 = ((androidx.recyclerview.widget.X) arrayList7.get(0)).itemView;
                                        java.util.WeakHashMap weakHashMap3 = D1.U.f1980a;
                                        view4.postOnAnimationDelayed(runnableC1620b3, jMax);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f17311s0 = false;
                break;
        }
    }
}
