package p186w5;

import java.util.List;
import kotlin.jvm.internal.m;

public final class C2977d0 implements InterfaceC2983g0 {

    public final List f30212a;

    public C2977d0(List list) {
        this.f30212a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2977d0) && m.a(this.f30212a, ((C2977d0) obj).f30212a);
    }

    public final int hashCode() {
        return this.f30212a.hashCode();
    }

    public final String toString() {
        return "Series(items=" + this.f30212a + ")";
    }
}
