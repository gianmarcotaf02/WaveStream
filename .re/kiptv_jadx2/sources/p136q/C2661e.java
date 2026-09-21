package p136q;

import androidx.datastore.preferences.protobuf.c0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class C2661e extends S implements Map {

    public c0 f26378k;

    public C2658b f26379l;

    public C2660d f26380m;

    @Override
    public final Set entrySet() {
        c0 c0Var = this.f26378k;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this, 2);
        this.f26378k = c0Var2;
        return c0Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i3 = this.j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i3 != this.j;
    }

    @Override
    public final Set keySet() {
        C2658b c2658b = this.f26379l;
        if (c2658b != null) {
            return c2658b;
        }
        C2658b c2658b2 = new C2658b(this);
        this.f26379l = c2658b2;
        return c2658b2;
    }

    @Override
    public final void putAll(Map map) {
        int size = map.size() + this.j;
        int i3 = this.j;
        int[] iArr = this.f26353h;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            m.d(iArrCopyOf, "copyOf(...)");
            this.f26353h = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f26354i, size * 2);
            m.d(objArrCopyOf, "copyOf(...)");
            this.f26354i = objArrCopyOf;
        }
        if (this.j != i3) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public final Collection values() {
        C2660d c2660d = this.f26380m;
        if (c2660d != null) {
            return c2660d;
        }
        C2660d c2660d2 = new C2660d(this);
        this.f26380m = c2660d2;
        return c2660d2;
    }
}
