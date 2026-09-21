package p186w5;

/* JADX INFO: loaded from: classes4.dex */
public final class H implements p186w5.J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p159s5.C f30075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f30076c;

    public H(java.lang.String str, p159s5.C c9, java.lang.String title) {
        kotlin.jvm.internal.m.e(title, "title");
        this.f30074a = str;
        this.f30075b = c9;
        this.f30076c = title;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p186w5.H)) {
            return false;
        }
        p186w5.H h9 = (p186w5.H) obj;
        return kotlin.jvm.internal.m.a(this.f30074a, h9.f30074a) && kotlin.jvm.internal.m.a(this.f30075b, h9.f30075b) && kotlin.jvm.internal.m.a(this.f30076c, h9.f30076c);
    }

    public final int hashCode() {
        return this.f30076c.hashCode() + ((this.f30075b.hashCode() + (this.f30074a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Catalog(type=");
        sb.append(this.f30074a);
        sb.append(", source=");
        sb.append(this.f30075b);
        sb.append(", title=");
        return Y6.f.m(sb, this.f30076c, ")");
    }
}
