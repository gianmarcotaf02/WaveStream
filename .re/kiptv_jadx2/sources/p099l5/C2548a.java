package p099l5;

import Y6.f;
import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;
import p034d5.e;

public final class C2548a {

    public final int f24768a;

    public final String f24769b;

    public final String f24770c;

    public C2548a(int i3, String str, String str2) {
        this.f24768a = i3;
        this.f24769b = str;
        this.f24770c = str2;
    }

    public final String a() {
        Object obj = e.f21242a;
        String strC = e.c(this.f24769b, this.f24770c);
        return strC == null ? M0.l(this.f24768a + 1, "Audio ") : strC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2548a)) {
            return false;
        }
        C2548a c2548a = (C2548a) obj;
        return this.f24768a == c2548a.f24768a && m.a(this.f24769b, c2548a.f24769b) && m.a(this.f24770c, c2548a.f24770c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f24768a) * 31;
        String str = this.f24769b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24770c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTrack(id=");
        sb.append(this.f24768a);
        sb.append(", language=");
        sb.append(this.f24769b);
        sb.append(", title=");
        return f.m(sb, this.f24770c, ")");
    }
}
