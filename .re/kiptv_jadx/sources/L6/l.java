package L6;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6.k f7087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7088b;

    public l(L6.k kVar, int i3) {
        this.f7087a = kVar;
        this.f7088b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L6.l)) {
            return false;
        }
        L6.l lVar = (L6.l) obj;
        return kotlin.jvm.internal.m.a(this.f7087a, lVar.f7087a) && this.f7088b == lVar.f7088b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f7088b) + (this.f7087a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KindWithArity(kind=");
        sb.append(this.f7087a);
        sb.append(", arity=");
        return Y6.f.j(sb, this.f7088b, ')');
    }
}
