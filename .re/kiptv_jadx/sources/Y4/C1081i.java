package Y4;

/* JADX INFO: renamed from: Y4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1081i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.M f11930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.EnumC1087k f11931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11932c;

    public C1081i(com.kiptv.core.model.M m8, Y4.EnumC1087k enumC1087k, java.lang.String reason) {
        kotlin.jvm.internal.m.e(reason, "reason");
        this.f11930a = m8;
        this.f11931b = enumC1087k;
        this.f11932c = reason;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4.C1081i)) {
            return false;
        }
        Y4.C1081i c1081i = (Y4.C1081i) obj;
        return kotlin.jvm.internal.m.a(this.f11930a, c1081i.f11930a) && this.f11931b == c1081i.f11931b && kotlin.jvm.internal.m.a(this.f11932c, c1081i.f11932c);
    }

    public final int hashCode() {
        return this.f11932c.hashCode() + ((this.f11931b.hashCode() + (this.f11930a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassifiedEntry(entry=");
        sb.append(this.f11930a);
        sb.append(", type=");
        sb.append(this.f11931b);
        sb.append(", reason=");
        return Y6.f.m(sb, this.f11932c, ")");
    }
}
