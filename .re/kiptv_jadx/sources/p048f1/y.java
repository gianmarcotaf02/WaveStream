package p048f1;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p048f1.s f21679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p048f1.r f21680c;

    public y(int i3, p048f1.s sVar, p048f1.r rVar) {
        this.f21678a = i3;
        this.f21679b = sVar;
        this.f21680c = rVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p048f1.y)) {
            return false;
        }
        p048f1.y yVar = (p048f1.y) obj;
        return this.f21678a == yVar.f21678a && kotlin.jvm.internal.m.a(this.f21679b, yVar.f21679b) && this.f21680c.equals(yVar.f21680c);
    }

    public final int hashCode() {
        return this.f21680c.f21665a.hashCode() + p121o0.p.d(0, p121o0.p.d(0, ((this.f21678a * 31) + this.f21679b.f21672h) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "ResourceFont(resId=" + this.f21678a + ", weight=" + this.f21679b + ", style=" + ((java.lang.Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
