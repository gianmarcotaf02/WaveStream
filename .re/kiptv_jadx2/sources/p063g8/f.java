package p063g8;

import com.google.android.gms.internal.play_billing.V0;
import h8.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import p078i6.o;
import p078i6.q;
import p080i8.p;

public class f implements k {

    public final ArrayList f22376a;

    public f(ArrayList formats) {
        m.e(formats, "formats");
        this.f22376a = formats;
    }

    @Override
    public a a() {
        ArrayList arrayList = this.f22376a;
        ArrayList arrayList2 = new ArrayList(q.I0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n) it.next()).a());
        }
        return arrayList2.size() == 1 ? (a) o.D1(arrayList2) : new a();
    }

    @Override
    public p b() {
        ArrayList arrayList = this.f22376a;
        ArrayList arrayList2 = new ArrayList(q.I0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n) it.next()).b());
        }
        return V0.k(arrayList2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return m.a(this.f22376a, ((f) obj).f22376a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22376a.hashCode();
    }

    public final String toString() {
        return Y6.f.l(new StringBuilder("ConcatenatedFormatStructure("), o.o1(this.f22376a, ", ", null, null, null, 62), ')');
    }
}
