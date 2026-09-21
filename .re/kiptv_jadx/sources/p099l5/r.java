package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p099l5.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24792i;
    public final int j;

    public r(java.lang.String str, int i3) {
        super(str);
        this.f24792i = str;
        this.j = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p099l5.r)) {
            return false;
        }
        p099l5.r rVar = (p099l5.r) obj;
        return kotlin.jvm.internal.m.a(this.f24792i, rVar.f24792i) && this.j == rVar.j;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.j) + (this.f24792i.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout(msg=");
        sb.append(this.f24792i);
        sb.append(", timeoutSeconds=");
        return Y6.f.k(sb, this.j, ")");
    }
}
