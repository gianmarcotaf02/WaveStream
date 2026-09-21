package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class RunnableC1640w implements Runnable {

    public final int f17520h;

    public final RecyclerView f17521i;

    public RunnableC1640w(RecyclerView recyclerView, int i3) {
        this.f17520h = i3;
        this.f17521i = recyclerView;
    }

    @Override
    public final void run() {
        RecyclerView recyclerView = this.f17521i;
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
                F f9 = recyclerView.f17279S;
                if (f9 != null) {
                    C1626h c1626h = (C1626h) f9;
                    ArrayList arrayList = c1626h.f17431h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1626h.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1626h.f17433k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1626h.f17432i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            long j = c1626h.f17189d;
                            if (zHasNext) {
                                X x9 = (X) it.next();
                                View view = x9.itemView;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c1626h.f17439q.add(x9);
                                viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C1621c(c1626h, x9, viewPropertyAnimatorAnimate, view)).start();
                                arrayList = arrayList;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1626h.f17435m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC1620b runnableC1620b = new RunnableC1620b(c1626h, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC1620b.run();
                                    } else {
                                        View view2 = ((C1625g) arrayList5.get(0)).f17420a.itemView;
                                        WeakHashMap weakHashMap = D1.U.f1980a;
                                        view2.postOnAnimationDelayed(runnableC1620b, j);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1626h.f17436n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC1620b runnableC1620b2 = new RunnableC1620b(c1626h, arrayList6, 1);
                                    if (zIsEmpty) {
                                        runnableC1620b2.run();
                                    } else {
                                        View view3 = ((C1624f) arrayList6.get(0)).f17408a.itemView;
                                        WeakHashMap weakHashMap2 = D1.U.f1980a;
                                        view3.postOnAnimationDelayed(runnableC1620b2, j);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1626h.f17434l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC1620b runnableC1620b3 = new RunnableC1620b(c1626h, arrayList7, 2);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC1620b3.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c1626h.f17190e : 0L, zIsEmpty3 ? 0L : c1626h.f17191f) + j;
                                        View view4 = ((X) arrayList7.get(0)).itemView;
                                        WeakHashMap weakHashMap3 = D1.U.f1980a;
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
