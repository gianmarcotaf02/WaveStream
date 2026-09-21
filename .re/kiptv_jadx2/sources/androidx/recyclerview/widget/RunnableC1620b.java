package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

public final class RunnableC1620b implements Runnable {

    public final int f17376h;

    public final ArrayList f17377i;
    public final C1626h j;

    public RunnableC1620b(C1626h c1626h, ArrayList arrayList, int i3) {
        this.f17376h = i3;
        this.j = c1626h;
        this.f17377i = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17376h) {
            case 0:
                ArrayList arrayList = this.f17377i;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1626h c1626h = this.j;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1626h.f17435m.remove(arrayList);
                    } else {
                        C1625g c1625g = (C1625g) it.next();
                        X x9 = c1625g.f17420a;
                        c1626h.getClass();
                        View view = x9.itemView;
                        int i3 = c1625g.f17423d - c1625g.f17421b;
                        int i9 = c1625g.f17424e - c1625g.f17422c;
                        if (i3 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i9 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1626h.f17438p.add(x9);
                        viewPropertyAnimatorAnimate.setDuration(c1626h.f17190e).setListener(new C1622d(c1626h, x9, i3, view, i9, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f17377i;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C1626h c1626h2 = this.j;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c1626h2.f17436n.remove(arrayList2);
                        break;
                    } else {
                        C1624f c1624f = (C1624f) it2.next();
                        c1626h2.getClass();
                        X x10 = c1624f.f17408a;
                        View view2 = x10 == null ? null : x10.itemView;
                        X x11 = c1624f.f17409b;
                        View view3 = x11 != null ? x11.itemView : null;
                        ArrayList arrayList3 = c1626h2.f17440r;
                        long j = c1626h2.f17191f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c1624f.f17408a);
                            duration.translationX(c1624f.f17412e - c1624f.f17410c);
                            duration.translationY(c1624f.f17413f - c1624f.f17411d);
                            duration.alpha(0.0f).setListener(new C1623e(c1626h2, c1624f, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c1624f.f17409b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C1623e(c1626h2, c1624f, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f17377i;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C1626h c1626h3 = this.j;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c1626h3.f17434l.remove(arrayList4);
                    } else {
                        X x12 = (X) it3.next();
                        c1626h3.getClass();
                        View view4 = x12.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1626h3.f17437o.add(x12);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1626h3.f17188c).setListener(new C1621c(c1626h3, x12, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
