package D5;

import java.util.ArrayList;

public final class C0251f extends AbstractC0253g {

    public final String f2286a;

    public final String f2287b;

    public final ArrayList f2288c;

    public C0251f(String str, String currentValue, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(currentValue, "currentValue");
        this.f2286a = str;
        this.f2287b = currentValue;
        this.f2288c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0251f)) {
            return false;
        }
        C0251f c0251f = (C0251f) obj;
        return this.f2286a.equals(c0251f.f2286a) && kotlin.jvm.internal.m.a(this.f2287b, c0251f.f2287b) && this.f2288c.equals(c0251f.f2288c);
    }

    public final int hashCode() {
        return this.f2288c.hashCode() + B2.a.a(this.f2286a.hashCode() * 31, 31, this.f2287b);
    }

    public final String toString() {
        return "Submenu(label=" + this.f2286a + ", currentValue=" + this.f2287b + ", options=" + this.f2288c + ")";
    }
}
