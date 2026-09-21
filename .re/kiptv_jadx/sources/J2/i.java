package J2;

/* JADX INFO: loaded from: classes.dex */
public final class i implements J2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H2.q f6009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f6010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H2.h f6011c;

    public i(H2.q qVar, java.lang.String str, H2.h hVar) {
        this.f6009a = qVar;
        this.f6010b = str;
        this.f6011c = hVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J2.i)) {
            return false;
        }
        J2.i iVar = (J2.i) obj;
        return kotlin.jvm.internal.m.a(this.f6009a, iVar.f6009a) && kotlin.jvm.internal.m.a(this.f6010b, iVar.f6010b) && this.f6011c == iVar.f6011c;
    }

    public final int hashCode() {
        int iHashCode = this.f6009a.hashCode() * 31;
        java.lang.String str = this.f6010b;
        return this.f6011c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        return "SourceFetchResult(source=" + this.f6009a + ", mimeType=" + this.f6010b + ", dataSource=" + this.f6011c + ')';
    }
}
