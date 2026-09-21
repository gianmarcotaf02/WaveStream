package t5;

import java.util.List;

public final class C2785b {

    public final String f28128a;

    public final String f28129b;

    public final String f28130c;

    public final boolean f28131d;

    public final List f28132e;

    public C2785b(String str, String str2, String str3, List list, boolean z6) {
        this.f28128a = str;
        this.f28129b = str2;
        this.f28130c = str3;
        this.f28131d = z6;
        this.f28132e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2785b)) {
            return false;
        }
        C2785b c2785b = (C2785b) obj;
        return this.f28128a.equals(c2785b.f28128a) && kotlin.jvm.internal.m.a(this.f28129b, c2785b.f28129b) && this.f28130c.equals(c2785b.f28130c) && this.f28131d == c2785b.f28131d && this.f28132e.equals(c2785b.f28132e);
    }

    public final int hashCode() {
        int iHashCode = this.f28128a.hashCode() * 31;
        String str = this.f28129b;
        return this.f28132e.hashCode() + p121o0.p.f(B2.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f28130c), 31, this.f28131d);
    }

    public final String toString() {
        return "AvatarGroup(id=" + this.f28128a + ", titleKey=" + this.f28129b + ", titleLiteral=" + this.f28130c + ", isPremium=" + this.f28131d + ", names=" + this.f28132e + ")";
    }
}
