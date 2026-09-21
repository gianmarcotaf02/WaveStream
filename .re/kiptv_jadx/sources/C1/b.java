package C1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f868b;

    public b(java.lang.Object obj, java.lang.Object obj2) {
        this.f867a = obj;
        this.f868b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C1.b)) {
            return false;
        }
        C1.b bVar = (C1.b) obj;
        return java.util.Objects.equals(bVar.f867a, this.f867a) && java.util.Objects.equals(bVar.f868b, this.f868b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f867a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.f868b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final java.lang.String toString() {
        return "Pair{" + this.f867a + io.ktor.sse.ServerSentEventKt.SPACE + this.f868b + "}";
    }
}
