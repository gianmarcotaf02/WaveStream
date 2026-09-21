package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p099l5.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24791i;
    public final java.lang.String j;

    public q(java.lang.String str) {
        super(str);
        this.f24791i = str;
        this.j = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p099l5.q)) {
            return false;
        }
        p099l5.q qVar = (p099l5.q) obj;
        return kotlin.jvm.internal.m.a(this.f24791i, qVar.f24791i) && kotlin.jvm.internal.m.a(this.j, qVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.f24791i.hashCode() * 31;
        java.lang.String str = this.j;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaybackFailed(msg=");
        sb.append(this.f24791i);
        sb.append(", underlyingError=");
        return Y6.f.m(sb, this.j, ")");
    }

    public q(java.lang.String str, java.lang.String str2) {
        super(str);
        this.f24791i = str;
        this.j = str2;
    }
}
