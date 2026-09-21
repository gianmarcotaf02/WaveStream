package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p099l5.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24789i;
    public final java.lang.String j;

    public o(java.lang.String str, java.lang.String str2) {
        super(str);
        this.f24789i = str;
        this.j = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p099l5.o)) {
            return false;
        }
        p099l5.o oVar = (p099l5.o) obj;
        return kotlin.jvm.internal.m.a(this.f24789i, oVar.f24789i) && kotlin.jvm.internal.m.a(this.j, oVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.f24789i.hashCode() * 31;
        java.lang.String str = this.j;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadFailed(msg=");
        sb.append(this.f24789i);
        sb.append(", underlyingError=");
        return Y6.f.m(sb, this.j, ")");
    }
}
