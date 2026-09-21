package p186w5;

import java.util.List;
import kotlin.jvm.internal.m;

public final class C2979e0 implements InterfaceC2983g0 {

    public final List f30219a;

    public C2979e0(List list) {
        this.f30219a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2979e0) && m.a(this.f30219a, ((C2979e0) obj).f30219a);
    }

    public final int hashCode() {
        return this.f30219a.hashCode();
    }

    public final String toString() {
        return "Tonight(entries=" + this.f30219a + ")";
    }
}
