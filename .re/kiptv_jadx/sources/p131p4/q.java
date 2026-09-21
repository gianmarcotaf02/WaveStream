package p131p4;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p131p4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p131p4.j f26231c;

    public q(int i3, p131p4.j jVar) {
        this.f26230b = i3;
        this.f26231c = jVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p131p4.q)) {
            return false;
        }
        p131p4.q qVar = (p131p4.q) obj;
        return qVar.f26230b == this.f26230b && qVar.f26231c == this.f26231c;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f26230b), this.f26231c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f26231c);
        sb.append(", ");
        return Y6.f.k(sb, this.f26230b, "-byte key)");
    }
}
