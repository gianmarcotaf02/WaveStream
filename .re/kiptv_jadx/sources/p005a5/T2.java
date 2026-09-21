package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class T2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f13920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f13921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f13922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f13923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13924f;

    public T2(int i3, java.lang.String name, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, int i9) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f13919a = i3;
        this.f13920b = name;
        this.f13921c = str;
        this.f13922d = str2;
        this.f13923e = arrayList;
        this.f13924f = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.T2)) {
            return false;
        }
        p005a5.T2 t9 = (p005a5.T2) obj;
        return this.f13919a == t9.f13919a && kotlin.jvm.internal.m.a(this.f13920b, t9.f13920b) && kotlin.jvm.internal.m.a(this.f13921c, t9.f13921c) && kotlin.jvm.internal.m.a(this.f13922d, t9.f13922d) && this.f13923e.equals(t9.f13923e) && this.f13924f == t9.f13924f;
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f13919a) * 31, 31, this.f13920b);
        java.lang.String str = this.f13921c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f13922d;
        return java.lang.Integer.hashCode(this.f13924f) + ((this.f13923e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MovieCollectionGroup(id=");
        sb.append(this.f13919a);
        sb.append(", name=");
        sb.append(this.f13920b);
        sb.append(", posterPath=");
        sb.append(this.f13921c);
        sb.append(", backdropPath=");
        sb.append(this.f13922d);
        sb.append(", members=");
        sb.append(this.f13923e);
        sb.append(", partCount=");
        return Y6.f.k(sb, this.f13924f, ")");
    }
}
