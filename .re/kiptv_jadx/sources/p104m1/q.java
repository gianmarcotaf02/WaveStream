package p104m1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p104m1.q f25185c = new p104m1.q(com.google.common.util.concurrent.D.w(0), com.google.common.util.concurrent.D.w(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25187b;

    public q(long j, long j9) {
        this.f25186a = j;
        this.f25187b = j9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p104m1.q)) {
            return false;
        }
        p104m1.q qVar = (p104m1.q) obj;
        return p113n1.p.a(this.f25186a, qVar.f25186a) && p113n1.p.a(this.f25187b, qVar.f25187b);
    }

    public final int hashCode() {
        p113n1.q[] qVarArr = p113n1.p.f25569b;
        return java.lang.Long.hashCode(this.f25187b) + (java.lang.Long.hashCode(this.f25186a) * 31);
    }

    public final java.lang.String toString() {
        return "TextIndent(firstLine=" + ((java.lang.Object) p113n1.p.d(this.f25186a)) + ", restLine=" + ((java.lang.Object) p113n1.p.d(this.f25187b)) + ')';
    }
}
