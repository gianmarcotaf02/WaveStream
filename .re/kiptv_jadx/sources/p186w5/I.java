package p186w5;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements p186w5.J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30088b;

    public I(java.lang.String sectionId, java.lang.String str) {
        kotlin.jvm.internal.m.e(sectionId, "sectionId");
        this.f30087a = sectionId;
        this.f30088b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p186w5.I)) {
            return false;
        }
        p186w5.I i3 = (p186w5.I) obj;
        return kotlin.jvm.internal.m.a(this.f30087a, i3.f30087a) && kotlin.jvm.internal.m.a(this.f30088b, i3.f30088b);
    }

    public final int hashCode() {
        return this.f30088b.hashCode() + (this.f30087a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Feed(sectionId=");
        sb.append(this.f30087a);
        sb.append(", title=");
        return Y6.f.m(sb, this.f30088b, ")");
    }
}
