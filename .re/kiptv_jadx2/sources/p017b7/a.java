package p017b7;

import C7.B;
import C7.W;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class a {

    public final W f18010a;

    public final b f18011b;

    public final boolean f18012c;

    public final boolean f18013d;

    public final Set f18014e;

    public final B f18015f;

    public a(W w6, b bVar, boolean z6, boolean z9, Set set, B b9) {
        this.f18010a = w6;
        this.f18011b = bVar;
        this.f18012c = z6;
        this.f18013d = z9;
        this.f18014e = set;
        this.f18015f = b9;
    }

    public static a a(a aVar, b bVar, boolean z6, Set set, B b9, int i3) {
        W howThisTypeIsUsed = aVar.f18010a;
        if ((i3 & 2) != 0) {
            bVar = aVar.f18011b;
        }
        b flexibility = bVar;
        if ((i3 & 4) != 0) {
            z6 = aVar.f18012c;
        }
        boolean z9 = z6;
        boolean z10 = aVar.f18013d;
        if ((i3 & 16) != 0) {
            set = aVar.f18014e;
        }
        Set set2 = set;
        if ((i3 & 32) != 0) {
            b9 = aVar.f18015f;
        }
        aVar.getClass();
        m.e(howThisTypeIsUsed, "howThisTypeIsUsed");
        m.e(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z9, z10, set2, b9);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(aVar.f18015f, this.f18015f) && aVar.f18010a == this.f18010a && aVar.f18011b == this.f18011b && aVar.f18012c == this.f18012c && aVar.f18013d == this.f18013d;
    }

    public final int hashCode() {
        B b9 = this.f18015f;
        int iHashCode = b9 != null ? b9.hashCode() : 0;
        int iHashCode2 = this.f18010a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f18011b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i3 = (iHashCode3 * 31) + (this.f18012c ? 1 : 0) + iHashCode3;
        return (i3 * 31) + (this.f18013d ? 1 : 0) + i3;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f18010a + ", flexibility=" + this.f18011b + ", isRaw=" + this.f18012c + ", isForAnnotationParameter=" + this.f18013d + ", visitedTypeParameters=" + this.f18014e + ", defaultType=" + this.f18015f + ')';
    }

    public a(W w6, boolean z6, boolean z9, Set set, int i3) {
        this(w6, b.f18016h, (i3 & 4) != 0 ? false : z6, (i3 & 8) != 0 ? false : z9, (i3 & 16) != 0 ? null : set, null);
    }
}
