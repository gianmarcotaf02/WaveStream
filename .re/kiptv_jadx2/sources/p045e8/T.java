package p045e8;

import D6.f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.A;
import p078i6.o;
import p078i6.p;

public final class T {

    public static final T f21520b;

    public final List f21521a;

    static {
        new T(p.B0("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        f21520b = new T(p.B0("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public T(List list) {
        this.f21521a = list;
        if (list.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        Iterator it = p.z0(list).iterator();
        while (((f) it).j) {
            int iA = ((A) it).a();
            if (((CharSequence) this.f21521a.get(iA)).length() <= 0) {
                throw new IllegalArgumentException("A month name can not be empty");
            }
            for (int i3 = 0; i3 < iA; i3++) {
                if (m.a(this.f21521a.get(iA), this.f21521a.get(i3))) {
                    throw new IllegalArgumentException(Y6.f.m(new StringBuilder("Month names must be unique, but '"), (String) this.f21521a.get(iA), "' was repeated").toString());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return m.a(this.f21521a, ((T) obj).f21521a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21521a.hashCode();
    }

    public final String toString() {
        return o.o1(this.f21521a, ", ", "MonthNames(", ")", S.f21519h, 24);
    }
}
