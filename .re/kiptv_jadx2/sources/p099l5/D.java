package p099l5;

import Y6.f;
import com.google.android.gms.internal.play_billing.M0;
import kotlin.jvm.internal.m;
import p034d5.e;
import p121o0.p;

public final class D {

    public final int f24765a;

    public final String f24766b;

    public final String f24767c;

    public D(int i3, String str, String str2) {
        this.f24765a = i3;
        this.f24766b = str;
        this.f24767c = str2;
    }

    public final String a() {
        String strC = e.c(this.f24766b, this.f24767c);
        return strC == null ? M0.l(this.f24765a + 1, "Subtitle ") : strC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return this.f24765a == d4.f24765a && m.a(this.f24766b, d4.f24766b) && m.a(this.f24767c, d4.f24767c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f24765a) * 31;
        String str = this.f24766b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24767c;
        return p.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleTrack(id=");
        sb.append(this.f24765a);
        sb.append(", language=");
        sb.append(this.f24766b);
        sb.append(", title=");
        return f.m(sb, this.f24767c, ", isExternal=false, externalFileUrl=null)");
    }
}
