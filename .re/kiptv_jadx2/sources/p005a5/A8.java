package p005a5;

import java.util.ArrayList;

public final class A8 {

    public final ArrayList f13146a;

    public final ArrayList f13147b;

    public final ArrayList f13148c;

    public A8(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f13146a = arrayList;
        this.f13147b = arrayList2;
        this.f13148c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A8)) {
            return false;
        }
        A8 a9 = (A8) obj;
        return this.f13146a.equals(a9.f13146a) && this.f13147b.equals(a9.f13147b) && this.f13148c.equals(a9.f13148c);
    }

    public final int hashCode() {
        return this.f13148c.hashCode() + ((this.f13147b.hashCode() + (this.f13146a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TraktImportDiff(inserts=" + this.f13146a + ", promotions=" + this.f13147b + ", traktFlags=" + this.f13148c + ")";
    }
}
