package T4;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U4.a f9813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9814b;

    public b(U4.a aVar, long j) {
        this.f9813a = aVar;
        this.f9814b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T4.b)) {
            return false;
        }
        T4.b bVar = (T4.b) obj;
        return kotlin.jvm.internal.m.a(this.f9813a, bVar.f9813a) && this.f9814b == bVar.f9814b;
    }

    public final int hashCode() {
        U4.a aVar = this.f9813a;
        return java.lang.Long.hashCode(this.f9814b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Entry(value=");
        sb.append(this.f9813a);
        sb.append(", storedAtMillis=");
        return Y6.f.g(this.f9814b, ")", sb);
    }
}
