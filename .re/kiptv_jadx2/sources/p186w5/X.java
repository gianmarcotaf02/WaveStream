package p186w5;

import java.util.ArrayList;

public final class X implements InterfaceC2983g0 {

    public final ArrayList f30174a;

    public X(ArrayList arrayList) {
        this.f30174a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X) && this.f30174a.equals(((X) obj).f30174a);
    }

    public final int hashCode() {
        return this.f30174a.hashCode();
    }

    public final String toString() {
        return "ContinueWatching(items=" + this.f30174a + ")";
    }
}
