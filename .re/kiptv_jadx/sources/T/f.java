package T;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f9661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9662c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T.d f9663d = null;

    public f(java.lang.String str, java.lang.String str2) {
        this.f9660a = str;
        this.f9661b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.f)) {
            return false;
        }
        T.f fVar = (T.f) obj;
        return kotlin.jvm.internal.m.a(this.f9660a, fVar.f9660a) && kotlin.jvm.internal.m.a(this.f9661b, fVar.f9661b) && this.f9662c == fVar.f9662c && kotlin.jvm.internal.m.a(this.f9663d, fVar.f9663d);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(B2.a.a(this.f9660a.hashCode() * 31, 31, this.f9661b), 31, this.f9662c);
        T.d dVar = this.f9663d;
        return iF + (dVar == null ? 0 : dVar.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f9663d);
        sb.append(", isShowingSubstitution=");
        return v5.L.a(sb, this.f9662c, ')');
    }
}
