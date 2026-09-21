package p186w5;

import java.util.ArrayList;

public final class Y implements InterfaceC2983g0 {

    public final ArrayList f30177a;

    public Y(ArrayList arrayList) {
        this.f30177a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y) && this.f30177a.equals(((Y) obj).f30177a);
    }

    public final int hashCode() {
        return this.f30177a.hashCode();
    }

    public final String toString() {
        return "Feed(items=" + this.f30177a + ")";
    }
}
