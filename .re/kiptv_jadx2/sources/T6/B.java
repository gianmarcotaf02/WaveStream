package T6;

import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import java.lang.reflect.Type;
import java.util.Iterator;

public abstract class B implements p027c7.d {
    @Override
    public C0927e a(p101l7.c fqName) {
        Object next;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.m.a(AbstractC0926d.a(AbstractC1833d1.x(AbstractC1833d1.u(((C0927e) next).f9853a))).a(), fqName)) {
                return (C0927e) next;
            }
        }
        next = null;
        return (C0927e) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof B) && kotlin.jvm.internal.m.a(b(), ((B) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
