package p186w5;

import java.util.ArrayList;

public final class Z implements InterfaceC2983g0 {

    public final ArrayList f30180a;

    public Z(ArrayList arrayList) {
        this.f30180a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z) && this.f30180a.equals(((Z) obj).f30180a);
    }

    public final int hashCode() {
        return this.f30180a.hashCode();
    }

    public final String toString() {
        return "Live(groups=" + this.f30180a + ")";
    }
}
