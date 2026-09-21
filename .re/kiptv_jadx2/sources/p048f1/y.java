package p048f1;

import kotlin.jvm.internal.m;
import p121o0.p;

public final class y {

    public final int f21678a;

    public final s f21679b;

    public final r f21680c;

    public y(int i3, s sVar, r rVar) {
        this.f21678a = i3;
        this.f21679b = sVar;
        this.f21680c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f21678a == yVar.f21678a && m.a(this.f21679b, yVar.f21679b) && this.f21680c.equals(yVar.f21680c);
    }

    public final int hashCode() {
        return this.f21680c.f21665a.hashCode() + p.d(0, p.d(0, ((this.f21678a * 31) + this.f21679b.f21672h) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f21678a + ", weight=" + this.f21679b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
