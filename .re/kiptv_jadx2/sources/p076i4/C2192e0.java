package p076i4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C2192e0 {

    public Object[] f22888a;

    public int f22889b = 0;

    public C2190d0 f22890c;

    public C2192e0(int i3) {
        this.f22888a = new Object[i3 * 2];
    }

    public final X0 a(boolean z6) {
        C2190d0 c2190d0;
        C2190d0 c2190d1;
        if (z6 && (c2190d1 = this.f22890c) != null) {
            throw c2190d1.a();
        }
        X0 x0I = X0.i(this.f22889b, this.f22888a, this);
        if (!z6 || (c2190d0 = this.f22890c) == null) {
            return x0I;
        }
        throw c2190d0.a();
    }

    public AbstractC2194f0 b() {
        return a(false);
    }

    public C2192e0 c(Object obj, Object obj2) {
        int i3 = (this.f22889b + 1) * 2;
        Object[] objArr = this.f22888a;
        if (i3 > objArr.length) {
            this.f22888a = Arrays.copyOf(objArr, V.b(objArr.length, i3));
        }
        AbstractC2230y.c(obj, obj2);
        Object[] objArr2 = this.f22888a;
        int i9 = this.f22889b;
        int i10 = i9 * 2;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.f22889b = i9 + 1;
        return this;
    }

    public void d(Map.Entry entry) {
        c(entry.getKey(), entry.getValue());
    }

    public C2192e0 e(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.f22889b) * 2;
            Object[] objArr = this.f22888a;
            if (size > objArr.length) {
                this.f22888a = Arrays.copyOf(objArr, V.b(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d((Map.Entry) it.next());
        }
        return this;
    }
}
