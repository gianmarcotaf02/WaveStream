package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f6230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f6231c;

    public P0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f6229a = str;
        this.f6230b = str2;
        this.f6231c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.P0)) {
            return false;
        }
        J5.P0 p2 = (J5.P0) obj;
        return kotlin.jvm.internal.m.a(this.f6229a, p2.f6229a) && kotlin.jvm.internal.m.a(this.f6230b, p2.f6230b) && kotlin.jvm.internal.m.a(this.f6231c, p2.f6231c);
    }

    public final int hashCode() {
        return this.f6231c.hashCode() + B2.a.a(this.f6229a.hashCode() * 31, 31, this.f6230b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvInfoLink(titleKey=");
        sb.append(this.f6229a);
        sb.append(", hintKey=");
        sb.append(this.f6230b);
        sb.append(", url=");
        return Y6.f.m(sb, this.f6231c, ")");
    }
}
