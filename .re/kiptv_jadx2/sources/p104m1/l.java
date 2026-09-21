package p104m1;

import Y6.f;
import java.util.ArrayList;
import p1.a;

public final class l {

    public static final l f25176b = new l(0);

    public static final l f25177c = new l(1);

    public static final l f25178d = new l(2);

    public final int f25179a;

    public l(int i3) {
        this.f25179a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f25179a == ((l) obj).f25179a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25179a;
    }

    public final String toString() {
        int i3 = this.f25179a;
        if (i3 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i3 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i3 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return f.l(new StringBuilder("TextDecoration["), a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
