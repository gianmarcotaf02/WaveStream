package p186w5;

import java.util.ArrayList;

public final class C2971a0 implements InterfaceC2983g0 {

    public final ArrayList f30187a;

    public final ArrayList f30188b;

    public C2971a0(ArrayList arrayList, ArrayList arrayList2) {
        this.f30187a = arrayList;
        this.f30188b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2971a0)) {
            return false;
        }
        C2971a0 c2971a0 = (C2971a0) obj;
        return this.f30187a.equals(c2971a0.f30187a) && this.f30188b.equals(c2971a0.f30188b);
    }

    public final int hashCode() {
        return this.f30188b.hashCode() + (this.f30187a.hashCode() * 31);
    }

    public final String toString() {
        return "Mixed(movies=" + this.f30187a + ", series=" + this.f30188b + ")";
    }
}
