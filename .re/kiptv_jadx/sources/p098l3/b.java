package p098l3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p041e3.i f24724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p041e3.h f24725c;

    public b(long j, p041e3.i iVar, p041e3.h hVar) {
        this.f24723a = j;
        this.f24724b = iVar;
        this.f24725c = hVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p098l3.b) {
            p098l3.b bVar = (p098l3.b) obj;
            if (this.f24723a == bVar.f24723a && this.f24724b.equals(bVar.f24724b) && this.f24725c.equals(bVar.f24725c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24723a;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.f24724b.hashCode()) * 1000003) ^ this.f24725c.hashCode();
    }

    public final java.lang.String toString() {
        return "PersistedEvent{id=" + this.f24723a + ", transportContext=" + this.f24724b + ", event=" + this.f24725c + "}";
    }
}
