package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f8049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D6.g f8050b;

    public i(java.lang.String str, D6.g gVar) {
        this.f8049a = str;
        this.f8050b = gVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O7.i)) {
            return false;
        }
        O7.i iVar = (O7.i) obj;
        return kotlin.jvm.internal.m.a(this.f8049a, iVar.f8049a) && kotlin.jvm.internal.m.a(this.f8050b, iVar.f8050b);
    }

    public final int hashCode() {
        return this.f8050b.hashCode() + (this.f8049a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "MatchGroup(value=" + this.f8049a + ", range=" + this.f8050b + ')';
    }
}
