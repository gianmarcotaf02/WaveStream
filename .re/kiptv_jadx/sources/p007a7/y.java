package p007a7;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C7.AbstractC0191x f15512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f15513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f15514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f15515d;

    public y(C7.AbstractC0191x abstractC0191x, java.util.List list, java.util.ArrayList arrayList, java.util.List list2) {
        this.f15512a = abstractC0191x;
        this.f15513b = list;
        this.f15514c = arrayList;
        this.f15515d = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p007a7.y)) {
            return false;
        }
        p007a7.y yVar = (p007a7.y) obj;
        return this.f15512a.equals(yVar.f15512a) && this.f15513b.equals(yVar.f15513b) && this.f15514c.equals(yVar.f15514c) && this.f15515d.equals(yVar.f15515d);
    }

    public final int hashCode() {
        return this.f15515d.hashCode() + p121o0.p.f((this.f15514c.hashCode() + B2.a.b(this.f15512a.hashCode() * 961, 31, this.f15513b)) * 31, 31, false);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MethodSignatureData(returnType=");
        sb.append(this.f15512a);
        sb.append(", receiverType=null, valueParameters=");
        sb.append(this.f15513b);
        sb.append(", typeParameters=");
        sb.append(this.f15514c);
        sb.append(", hasStableParameterNames=false, errors=");
        return com.google.android.gms.internal.play_billing.M0.n(sb, this.f15515d, ')');
    }
}
