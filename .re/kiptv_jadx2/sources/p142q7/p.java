package p142q7;

import C7.AbstractC0191x;
import kotlin.jvm.internal.m;

public final class p extends r {

    public final AbstractC0191x f26665a;

    public p(AbstractC0191x abstractC0191x) {
        this.f26665a = abstractC0191x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && m.a(this.f26665a, ((p) obj).f26665a);
    }

    public final int hashCode() {
        return this.f26665a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f26665a + ')';
    }
}
