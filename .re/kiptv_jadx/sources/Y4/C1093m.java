package Y4;

/* JADX INFO: renamed from: Y4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1093m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f11987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f11988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f11989d;

    public C1093m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.ArrayList arrayList) {
        this.f11986a = str;
        this.f11987b = str2;
        this.f11988c = str3;
        this.f11989d = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4.C1093m)) {
            return false;
        }
        Y4.C1093m c1093m = (Y4.C1093m) obj;
        return this.f11986a.equals(c1093m.f11986a) && kotlin.jvm.internal.m.a(this.f11987b, c1093m.f11987b) && kotlin.jvm.internal.m.a(this.f11988c, c1093m.f11988c) && this.f11989d.equals(c1093m.f11989d);
    }

    public final int hashCode() {
        int iHashCode = this.f11986a.hashCode() * 31;
        java.lang.String str = this.f11987b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f11988c;
        return this.f11989d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f11987b;
        java.lang.String str2 = this.f11988c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SeriesGroup(baseName=");
        B2.a.x(sb, this.f11986a, ", logo=", str, ", groupTitle=");
        sb.append(str2);
        sb.append(", episodes=");
        sb.append(this.f11989d);
        sb.append(")");
        return sb.toString();
    }
}
