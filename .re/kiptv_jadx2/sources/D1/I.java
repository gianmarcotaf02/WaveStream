package D1;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

public abstract class I {

    public int f1970h;

    public int f1971i;
    public int j;

    public Object f1972k;

    public I() {
        if (B3.o.f639i == null) {
            B3.o.f639i = new B3.o(29);
        }
    }

    public int a(int i3) {
        if (i3 < this.j) {
            return ((ByteBuffer) this.f1972k).getShort(this.f1971i + i3);
        }
        return 0;
    }

    public void b() {
        if (((p086j6.e) this.f1972k).f24247o != this.j) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i3 = this.f1970h;
            p086j6.e eVar = (p086j6.e) this.f1972k;
            if (i3 >= eVar.f24245m || eVar.j[i3] >= 0) {
                return;
            } else {
                this.f1970h = i3 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        C0213b c0213b;
        if (Build.VERSION.SDK_INT >= this.f1971i) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1971i) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f1970h);
            if (!((Class) this.f1972k).isInstance(tag)) {
                tag = null;
            }
        }
        if (i(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = U.d(view);
            if (accessibilityDelegateD == null) {
                c0213b = null;
            } else {
                c0213b = accessibilityDelegateD instanceof C0211a ? ((C0211a) accessibilityDelegateD).f1992a : new C0213b(accessibilityDelegateD);
            }
            if (c0213b == null) {
                c0213b = new C0213b();
            }
            U.j(view, c0213b);
            view.setTag(this.f1970h, obj);
            U.f(this.j, view);
        }
    }

    public boolean hasNext() {
        return this.f1970h < ((p086j6.e) this.f1972k).f24245m;
    }

    public abstract boolean i(Object obj, Object obj2);

    public void remove() {
        b();
        if (this.f1971i == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        p086j6.e eVar = (p086j6.e) this.f1972k;
        eVar.c();
        eVar.o(this.f1971i);
        this.f1971i = -1;
        this.j = eVar.f24247o;
    }
}
