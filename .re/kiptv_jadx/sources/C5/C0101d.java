package C5;

/* JADX INFO: renamed from: C5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0101d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1298b;

    public C0101d(java.lang.String str, java.lang.String str2) {
        this.f1297a = str;
        this.f1298b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.C0101d)) {
            return false;
        }
        C5.C0101d c0101d = (C5.C0101d) obj;
        return kotlin.jvm.internal.m.a(this.f1297a, c0101d.f1297a) && kotlin.jvm.internal.m.a(this.f1298b, c0101d.f1298b);
    }

    public final int hashCode() {
        return this.f1298b.hashCode() + (this.f1297a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvExternalPlayer(packageName=");
        sb.append(this.f1297a);
        sb.append(", displayName=");
        return Y6.f.m(sb, this.f1298b, ")");
    }
}
