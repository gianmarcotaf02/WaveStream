package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p099l5.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24790i;
    public final java.lang.Integer j;

    public p(java.lang.String str, java.lang.Integer num) {
        super(str);
        this.f24790i = str;
        this.j = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p099l5.p)) {
            return false;
        }
        p099l5.p pVar = (p099l5.p) obj;
        return kotlin.jvm.internal.m.a(this.f24790i, pVar.f24790i) && kotlin.jvm.internal.m.a(this.j, pVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.f24790i.hashCode() * 31;
        java.lang.Integer num = this.j;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return "NetworkError(msg=" + this.f24790i + ", statusCode=" + this.j + ")";
    }
}
