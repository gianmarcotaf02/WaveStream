package p005a5;

import B2.a;
import Y6.f;
import java.util.ArrayList;
import kotlin.jvm.internal.m;

public final class T2 {

    public final int f13919a;

    public final String f13920b;

    public final String f13921c;

    public final String f13922d;

    public final ArrayList f13923e;

    public final int f13924f;

    public T2(int i3, String name, String str, String str2, ArrayList arrayList, int i9) {
        m.e(name, "name");
        this.f13919a = i3;
        this.f13920b = name;
        this.f13921c = str;
        this.f13922d = str2;
        this.f13923e = arrayList;
        this.f13924f = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T2)) {
            return false;
        }
        T2 t9 = (T2) obj;
        return this.f13919a == t9.f13919a && m.a(this.f13920b, t9.f13920b) && m.a(this.f13921c, t9.f13921c) && m.a(this.f13922d, t9.f13922d) && this.f13923e.equals(t9.f13923e) && this.f13924f == t9.f13924f;
    }

    public final int hashCode() {
        int iA = a.a(Integer.hashCode(this.f13919a) * 31, 31, this.f13920b);
        String str = this.f13921c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13922d;
        return Integer.hashCode(this.f13924f) + ((this.f13923e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieCollectionGroup(id=");
        sb.append(this.f13919a);
        sb.append(", name=");
        sb.append(this.f13920b);
        sb.append(", posterPath=");
        sb.append(this.f13921c);
        sb.append(", backdropPath=");
        sb.append(this.f13922d);
        sb.append(", members=");
        sb.append(this.f13923e);
        sb.append(", partCount=");
        return f.k(sb, this.f13924f, ")");
    }
}
