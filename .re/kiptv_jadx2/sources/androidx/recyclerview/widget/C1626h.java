package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

public final class C1626h extends F {

    public static TimeInterpolator f17430s;
    public boolean g;

    public ArrayList f17431h;

    public ArrayList f17432i;
    public ArrayList j;

    public ArrayList f17433k;

    public ArrayList f17434l;

    public ArrayList f17435m;

    public ArrayList f17436n;

    public ArrayList f17437o;

    public ArrayList f17438p;

    public ArrayList f17439q;

    public ArrayList f17440r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((X) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override
    public final boolean a(X x9, X x10, D1.r rVar, D1.r rVar2) {
        int i3;
        int i9;
        int i10 = rVar.f2053a;
        int i11 = rVar.f2054b;
        if (x10.shouldIgnore()) {
            int i12 = rVar.f2053a;
            i9 = rVar.f2054b;
            i3 = i12;
        } else {
            i3 = rVar2.f2053a;
            i9 = rVar2.f2054b;
        }
        if (x9 == x10) {
            return g(x9, i10, i11, i3, i9);
        }
        float translationX = x9.itemView.getTranslationX();
        float translationY = x9.itemView.getTranslationY();
        float alpha = x9.itemView.getAlpha();
        l(x9);
        x9.itemView.setTranslationX(translationX);
        x9.itemView.setTranslationY(translationY);
        x9.itemView.setAlpha(alpha);
        l(x10);
        x10.itemView.setTranslationX(-((int) ((i3 - i10) - translationX)));
        x10.itemView.setTranslationY(-((int) ((i9 - i11) - translationY)));
        x10.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f17433k;
        C1624f c1624f = new C1624f();
        c1624f.f17408a = x9;
        c1624f.f17409b = x10;
        c1624f.f17410c = i10;
        c1624f.f17411d = i11;
        c1624f.f17412e = i3;
        c1624f.f17413f = i9;
        arrayList.add(c1624f);
        return true;
    }

    @Override
    public final void d(X x9) {
        View view = x9.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1625g) arrayList.get(size)).f17420a == x9) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(x9);
                arrayList.remove(size);
            }
        }
        j(this.f17433k, x9);
        if (this.f17431h.remove(x9)) {
            view.setAlpha(1.0f);
            c(x9);
        }
        if (this.f17432i.remove(x9)) {
            view.setAlpha(1.0f);
            c(x9);
        }
        ArrayList arrayList2 = this.f17436n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, x9);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f17435m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((C1625g) arrayList5.get(size4)).f17420a == x9) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(x9);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f17434l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(x9)) {
                view.setAlpha(1.0f);
                c(x9);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f17439q.remove(x9);
        this.f17437o.remove(x9);
        this.f17440r.remove(x9);
        this.f17438p.remove(x9);
        i();
    }

    @Override
    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1625g c1625g = (C1625g) arrayList.get(size);
            View view = c1625g.f17420a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c1625g.f17420a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f17431h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((X) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f17432i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            X x9 = (X) arrayList3.get(size3);
            x9.itemView.setAlpha(1.0f);
            c(x9);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f17433k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1624f c1624f = (C1624f) arrayList4.get(size4);
            X x10 = c1624f.f17408a;
            if (x10 != null) {
                k(c1624f, x10);
            }
            X x11 = c1624f.f17409b;
            if (x11 != null) {
                k(c1624f, x11);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f17435m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C1625g c1625g2 = (C1625g) arrayList6.get(size6);
                    View view2 = c1625g2.f17420a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(c1625g2.f17420a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f17434l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    X x12 = (X) arrayList8.get(size8);
                    x12.itemView.setAlpha(1.0f);
                    c(x12);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f17436n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1624f c1624f2 = (C1624f) arrayList10.get(size10);
                    X x13 = c1624f2.f17408a;
                    if (x13 != null) {
                        k(c1624f2, x13);
                    }
                    X x14 = c1624f2.f17409b;
                    if (x14 != null) {
                        k(c1624f2, x14);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f17439q);
            h(this.f17438p);
            h(this.f17437o);
            h(this.f17440r);
            ArrayList arrayList11 = this.f17187b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override
    public final boolean f() {
        return (this.f17432i.isEmpty() && this.f17433k.isEmpty() && this.j.isEmpty() && this.f17431h.isEmpty() && this.f17438p.isEmpty() && this.f17439q.isEmpty() && this.f17437o.isEmpty() && this.f17440r.isEmpty() && this.f17435m.isEmpty() && this.f17434l.isEmpty() && this.f17436n.isEmpty()) ? false : true;
    }

    public final boolean g(X x9, int i3, int i9, int i10, int i11) {
        View view = x9.itemView;
        int translationX = i3 + ((int) view.getTranslationX());
        int translationY = i9 + ((int) x9.itemView.getTranslationY());
        l(x9);
        int i12 = i10 - translationX;
        int i13 = i11 - translationY;
        if (i12 == 0 && i13 == 0) {
            c(x9);
            return false;
        }
        if (i12 != 0) {
            view.setTranslationX(-i12);
        }
        if (i13 != 0) {
            view.setTranslationY(-i13);
        }
        ArrayList arrayList = this.j;
        C1625g c1625g = new C1625g();
        c1625g.f17420a = x9;
        c1625g.f17421b = translationX;
        c1625g.f17422c = translationY;
        c1625g.f17423d = i10;
        c1625g.f17424e = i11;
        arrayList.add(c1625g);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f17187b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, X x9) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1624f c1624f = (C1624f) arrayList.get(size);
            if (k(c1624f, x9) && c1624f.f17408a == null && c1624f.f17409b == null) {
                arrayList.remove(c1624f);
            }
        }
    }

    public final boolean k(C1624f c1624f, X x9) {
        if (c1624f.f17409b == x9) {
            c1624f.f17409b = null;
        } else {
            if (c1624f.f17408a != x9) {
                return false;
            }
            c1624f.f17408a = null;
        }
        x9.itemView.setAlpha(1.0f);
        x9.itemView.setTranslationX(0.0f);
        x9.itemView.setTranslationY(0.0f);
        c(x9);
        return true;
    }

    public final void l(X x9) {
        if (f17430s == null) {
            f17430s = new ValueAnimator().getInterpolator();
        }
        x9.itemView.animate().setInterpolator(f17430s);
        d(x9);
    }
}
