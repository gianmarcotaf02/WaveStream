package p159s5;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f27313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f27314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f27315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f27316d;

    public o(java.lang.Integer num, java.lang.Integer num2, java.lang.String title, java.lang.String str) {
        kotlin.jvm.internal.m.e(title, "title");
        this.f27313a = num;
        this.f27314b = num2;
        this.f27315c = title;
        this.f27316d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p159s5.o)) {
            return false;
        }
        p159s5.o oVar = (p159s5.o) obj;
        return kotlin.jvm.internal.m.a(this.f27313a, oVar.f27313a) && kotlin.jvm.internal.m.a(this.f27314b, oVar.f27314b) && kotlin.jvm.internal.m.a(this.f27315c, oVar.f27315c) && kotlin.jvm.internal.m.a(this.f27316d, oVar.f27316d);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f27313a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f27314b;
        int iA = B2.a.a((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f27315c);
        java.lang.String str = this.f27316d;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TmdbLookup(override=");
        sb.append(this.f27313a);
        sb.append(", embedded=");
        sb.append(this.f27314b);
        sb.append(", title=");
        sb.append(this.f27315c);
        sb.append(", categoryName=");
        return Y6.f.m(sb, this.f27316d, ")");
    }
}
