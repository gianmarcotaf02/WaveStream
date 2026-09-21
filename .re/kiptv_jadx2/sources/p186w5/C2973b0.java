package p186w5;

import java.util.List;
import kotlin.jvm.internal.m;

public final class C2973b0 implements InterfaceC2983g0 {

    public final List f30198a;

    public C2973b0(List list) {
        this.f30198a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2973b0) && m.a(this.f30198a, ((C2973b0) obj).f30198a);
    }

    public final int hashCode() {
        return this.f30198a.hashCode();
    }

    public final String toString() {
        return "Movies(items=" + this.f30198a + ")";
    }
}
