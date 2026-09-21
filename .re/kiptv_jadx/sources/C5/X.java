package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f1167d;

    public X(int i3, java.lang.String name, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f1164a = i3;
        this.f1165b = name;
        this.f1166c = str;
        this.f1167d = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.X)) {
            return false;
        }
        C5.X x9 = (C5.X) obj;
        return this.f1164a == x9.f1164a && kotlin.jvm.internal.m.a(this.f1165b, x9.f1165b) && kotlin.jvm.internal.m.a(this.f1166c, x9.f1166c) && kotlin.jvm.internal.m.a(this.f1167d, x9.f1167d);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f1164a) * 31, 31, this.f1165b);
        java.lang.String str = this.f1166c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f1167d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvPanelCastUi(personId=");
        sb.append(this.f1164a);
        sb.append(", name=");
        sb.append(this.f1165b);
        sb.append(", character=");
        sb.append(this.f1166c);
        sb.append(", imageUrl=");
        return Y6.f.m(sb, this.f1167d, ")");
    }
}
