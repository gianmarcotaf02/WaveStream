package v5;

import kotlin.jvm.functions.Function0;

public final class C2915a {

    public final String f29389a;

    public final String f29390b;

    public final Function0 f29391c;

    public C2915a(String str, String str2, Function0 function0) {
        this.f29389a = str;
        this.f29390b = str2;
        this.f29391c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2915a)) {
            return false;
        }
        C2915a c2915a = (C2915a) obj;
        return kotlin.jvm.internal.m.a(this.f29389a, c2915a.f29389a) && kotlin.jvm.internal.m.a(this.f29390b, c2915a.f29390b) && kotlin.jvm.internal.m.a(this.f29391c, c2915a.f29391c);
    }

    public final int hashCode() {
        return this.f29391c.hashCode() + B2.a.a(this.f29389a.hashCode() * 31, 31, this.f29390b);
    }

    public final String toString() {
        return "EpgGroupConfirmation(title=" + this.f29389a + ", message=" + this.f29390b + ", action=" + this.f29391c + ")";
    }
}
