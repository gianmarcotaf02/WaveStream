package p005a5;

import Y6.f;
import kotlin.jvm.internal.m;

public final class C1238c1 implements InterfaceC1268f1 {

    public final String f14289a;

    public C1238c1(String message) {
        m.e(message, "message");
        this.f14289a = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1238c1) && m.a(this.f14289a, ((C1238c1) obj).f14289a);
    }

    public final int hashCode() {
        return this.f14289a.hashCode();
    }

    public final String toString() {
        return f.m(new StringBuilder("Error(message="), this.f14289a, ")");
    }
}
