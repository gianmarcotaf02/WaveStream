package p005a5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C1363o6 extends AbstractC1412t6 {

    public final String f14891a;

    public C1363o6(String str) {
        this.f14891a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1363o6) && m.a(this.f14891a, ((C1363o6) obj).f14891a);
    }

    public final int hashCode() {
        return this.f14891a.hashCode();
    }

    public final String toString() {
        return f.m(new StringBuilder("Failed(messageKey="), this.f14891a, ")");
    }
}
