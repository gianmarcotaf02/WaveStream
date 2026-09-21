package p050f3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p050f3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f21684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f21685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1.b f21686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f21687d;

    public b(android.content.Context context, V1.b bVar, V1.b bVar2, java.lang.String str) {
        if (context == null) {
            throw new java.lang.NullPointerException("Null applicationContext");
        }
        this.f21684a = context;
        if (bVar == null) {
            throw new java.lang.NullPointerException("Null wallClock");
        }
        this.f21685b = bVar;
        if (bVar2 == null) {
            throw new java.lang.NullPointerException("Null monotonicClock");
        }
        this.f21686c = bVar2;
        if (str == null) {
            throw new java.lang.NullPointerException("Null backendName");
        }
        this.f21687d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p050f3.c) {
            p050f3.c cVar = (p050f3.c) obj;
            if (this.f21684a.equals(((p050f3.b) cVar).f21684a)) {
                p050f3.b bVar = (p050f3.b) cVar;
                if (this.f21685b.equals(bVar.f21685b) && this.f21686c.equals(bVar.f21686c) && this.f21687d.equals(bVar.f21687d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f21684a.hashCode() ^ 1000003) * 1000003) ^ this.f21685b.hashCode()) * 1000003) ^ this.f21686c.hashCode()) * 1000003) ^ this.f21687d.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f21684a);
        sb.append(", wallClock=");
        sb.append(this.f21685b);
        sb.append(", monotonicClock=");
        sb.append(this.f21686c);
        sb.append(", backendName=");
        return Y6.f.m(sb, this.f21687d, "}");
    }
}
