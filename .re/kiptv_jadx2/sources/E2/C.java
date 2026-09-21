package E2;

public final class C {

    public final String f2761a;

    public final String f2762b;

    public final String f2763c;

    public final String f2764d;

    public final String f2765e;

    public C(String str, String str2, String str3, String str4, String str5) {
        this.f2761a = str;
        this.f2762b = str2;
        this.f2763c = str3;
        this.f2764d = str4;
        this.f2765e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && kotlin.jvm.internal.m.a(((C) obj).f2761a, this.f2761a);
    }

    public final int hashCode() {
        return this.f2761a.hashCode();
    }

    public final String toString() {
        return this.f2761a;
    }
}
