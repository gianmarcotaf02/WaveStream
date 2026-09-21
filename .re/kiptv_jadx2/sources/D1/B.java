package D1;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public final class B implements Iterator, p201y6.a {

    public final int f1958h;

    public Iterator f1959i;
    public final Object j;

    public B(X x9) {
        this.f1958h = 0;
        this.j = new ArrayList();
        this.f1959i = x9;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f1958h) {
            case 0:
                break;
        }
        return this.f1959i.hasNext();
    }

    @Override
    public final Object next() {
        switch (this.f1958h) {
            case 0:
                Object next = this.f1959i.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                X x9 = viewGroup != null ? new X(0, viewGroup) : null;
                ArrayList arrayList = (ArrayList) this.j;
                if (x9 == null || !x9.hasNext()) {
                    while (!this.f1959i.hasNext() && !arrayList.isEmpty()) {
                        this.f1959i = (Iterator) p078i6.o.q1(arrayList);
                        p078i6.u.T0(arrayList);
                    }
                } else {
                    arrayList.add(this.f1959i);
                    this.f1959i = x9;
                }
                return next;
            default:
                return ((N7.u) this.j).f7471b.invoke(this.f1959i.next());
        }
    }

    @Override
    public final void remove() {
        switch (this.f1958h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public B(N7.u uVar) {
        this.f1958h = 1;
        this.j = uVar;
        this.f1959i = uVar.f7470a.iterator();
    }
}
