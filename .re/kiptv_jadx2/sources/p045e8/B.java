package p045e8;

import D6.f;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.A;
import p078i6.o;
import p078i6.p;

public final class B {

    public static final B f21481b;

    public final List f21482a;

    static {
        new B(p.B0("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        f21481b = new B(p.B0("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
    }

    public B(List list) {
        this.f21482a = list;
        if (list.size() != 7) {
            throw new IllegalArgumentException("Day of week names must contain exactly 7 elements");
        }
        Iterator it = p.z0(list).iterator();
        while (((f) it).j) {
            int iA = ((A) it).a();
            if (((CharSequence) this.f21482a.get(iA)).length() <= 0) {
                throw new IllegalArgumentException("A day-of-week name can not be empty");
            }
            for (int i3 = 0; i3 < iA; i3++) {
                if (m.a(this.f21482a.get(iA), this.f21482a.get(i3))) {
                    throw new IllegalArgumentException(Y6.f.m(new StringBuilder("Day-of-week names must be unique, but '"), (String) this.f21482a.get(iA), "' was repeated").toString());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof B) {
            return m.a(this.f21482a, ((B) obj).f21482a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21482a.hashCode();
    }

    public final String toString() {
        return o.o1(this.f21482a, ", ", "DayOfWeekNames(", ")", A.f21480h, 24);
    }
}
