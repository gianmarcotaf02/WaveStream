package p076i4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class U extends V {

    public Object[] f22834a;

    public int f22835b;

    public boolean f22836c;

    public U(int i3) {
        AbstractC2230y.d(i3, "initialCapacity");
        this.f22834a = new Object[i3];
        this.f22835b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f22834a;
        int i3 = this.f22835b;
        this.f22835b = i3 + 1;
        objArr[i3] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof W) {
                this.f22835b = ((W) collection).e(this.f22834a, this.f22835b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i3) {
        Object[] objArr = this.f22834a;
        int iB = V.b(objArr.length, this.f22835b + i3);
        if (iB > objArr.length || this.f22836c) {
            this.f22834a = Arrays.copyOf(this.f22834a, iB);
            this.f22836c = false;
        }
    }
}
