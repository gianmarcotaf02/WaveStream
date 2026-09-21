package p159s5;

import B2.a;
import Y6.f;
import kotlin.jvm.internal.m;

public final class o {

    public final Integer f27313a;

    public final Integer f27314b;

    public final String f27315c;

    public final String f27316d;

    public o(Integer num, Integer num2, String title, String str) {
        m.e(title, "title");
        this.f27313a = num;
        this.f27314b = num2;
        this.f27315c = title;
        this.f27316d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return m.a(this.f27313a, oVar.f27313a) && m.a(this.f27314b, oVar.f27314b) && m.a(this.f27315c, oVar.f27315c) && m.a(this.f27316d, oVar.f27316d);
    }

    public final int hashCode() {
        Integer num = this.f27313a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f27314b;
        int iA = a.a((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f27315c);
        String str = this.f27316d;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TmdbLookup(override=");
        sb.append(this.f27313a);
        sb.append(", embedded=");
        sb.append(this.f27314b);
        sb.append(", title=");
        sb.append(this.f27315c);
        sb.append(", categoryName=");
        return f.m(sb, this.f27316d, ")");
    }
}
