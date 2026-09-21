package J2;

/* JADX INFO: loaded from: classes.dex */
public final class h implements J2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.l f6006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H2.h f6008c;

    public h(E2.l lVar, boolean z6, H2.h hVar) {
        this.f6006a = lVar;
        this.f6007b = z6;
        this.f6008c = hVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J2.h)) {
            return false;
        }
        J2.h hVar = (J2.h) obj;
        return kotlin.jvm.internal.m.a(this.f6006a, hVar.f6006a) && this.f6007b == hVar.f6007b && this.f6008c == hVar.f6008c;
    }

    public final int hashCode() {
        return this.f6008c.hashCode() + p121o0.p.f(this.f6006a.hashCode() * 31, 31, this.f6007b);
    }

    public final java.lang.String toString() {
        return "ImageFetchResult(image=" + this.f6006a + ", isSampled=" + this.f6007b + ", dataSource=" + this.f6008c + ')';
    }
}
