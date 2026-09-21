package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;

public abstract class AbstractC1874u extends AbstractC1863o implements Set {

    public transient r f19391i;

    @Override
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override
    public r n() {
        r rVar = this.f19391i;
        if (rVar != null) {
            return rVar;
        }
        r rVarQ = q();
        this.f19391i = rVarQ;
        return rVarQ;
    }

    public r q() {
        Object[] array = toArray(AbstractC1863o.f19361h);
        C1865p c1865p = r.f19379i;
        return r.r(array, array.length);
    }
}
