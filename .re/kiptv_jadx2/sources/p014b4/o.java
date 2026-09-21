package p014b4;

import Y6.f;
import com.google.android.gms.internal.play_billing.M0;
import java.util.Iterator;

public final class o extends k {

    public final transient Object f17902k;

    public o(Object obj) {
        this.f17902k = obj;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f17902k.equals(obj);
    }

    @Override
    public final int d(Object[] objArr) {
        objArr[0] = this.f17902k;
        return 1;
    }

    @Override
    public final int hashCode() {
        return this.f17902k.hashCode();
    }

    @Override
    public final Iterator iterator() {
        Object obj = this.f17902k;
        l lVar = new l();
        lVar.f17892h = obj;
        return lVar;
    }

    @Override
    public final j q() {
        Object[] objArr = {this.f17902k};
        for (int i3 = 0; i3 < 1; i3++) {
            g gVar = j.f17889i;
            if (objArr[i3] == null) {
                throw new NullPointerException(M0.l(i3, "at index "));
            }
        }
        return j.p(objArr, 1);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return f.h("[", this.f17902k.toString(), "]");
    }
}
