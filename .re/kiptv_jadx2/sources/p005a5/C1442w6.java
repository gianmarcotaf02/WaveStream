package p005a5;

import B2.a;
import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C1442w6 {

    public final String f15253a;

    public final String f15254b;

    public final String f15255c;

    public final String f15256d;

    public final Integer f15257e;

    public final Integer f15258f;
    public final boolean g;

    public final boolean f15259h;

    public C1442w6(String str, String str2, String name, String str3, Integer num, Integer num2, boolean z6, boolean z9) {
        m.e(name, "name");
        this.f15253a = str;
        this.f15254b = str2;
        this.f15255c = name;
        this.f15256d = str3;
        this.f15257e = num;
        this.f15258f = num2;
        this.g = z6;
        this.f15259h = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1442w6)) {
            return false;
        }
        C1442w6 c1442w6 = (C1442w6) obj;
        return m.a(this.f15253a, c1442w6.f15253a) && m.a(this.f15254b, c1442w6.f15254b) && m.a(this.f15255c, c1442w6.f15255c) && m.a(this.f15256d, c1442w6.f15256d) && m.a(this.f15257e, c1442w6.f15257e) && m.a(this.f15258f, c1442w6.f15258f) && this.g == c1442w6.g && this.f15259h == c1442w6.f15259h;
    }

    public final int hashCode() {
        int iA = a.a(a.a(this.f15253a.hashCode() * 31, 31, this.f15254b), 31, this.f15255c);
        String str = this.f15256d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f15257e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15258f;
        return Boolean.hashCode(this.f15259h) + p.f((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListRef(id=");
        sb.append(this.f15253a);
        sb.append(", owner=");
        sb.append(this.f15254b);
        sb.append(", name=");
        sb.append(this.f15255c);
        sb.append(", ownerName=");
        sb.append(this.f15256d);
        sb.append(", itemCount=");
        sb.append(this.f15257e);
        sb.append(", likes=");
        sb.append(this.f15258f);
        sb.append(", isOfficial=");
        sb.append(this.g);
        sb.append(", isMine=");
        return M0.o(sb, this.f15259h, ")");
    }
}
