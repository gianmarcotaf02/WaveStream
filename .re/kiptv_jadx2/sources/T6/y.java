package T6;

import java.util.Collection;

public final class y extends s implements p027c7.b {

    public final p101l7.c f9874a;

    public y(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        this.f9874a = fqName;
    }

    @Override
    public final C0927e a(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return kotlin.jvm.internal.m.a(this.f9874a, ((y) obj).f9874a);
        }
        return false;
    }

    @Override
    public final Collection getAnnotations() {
        return p078i6.w.f23205h;
    }

    public final int hashCode() {
        return this.f9874a.hashCode();
    }

    public final String toString() {
        return y.class.getName() + ": " + this.f9874a;
    }
}
