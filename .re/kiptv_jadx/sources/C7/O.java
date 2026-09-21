package C7;

/* JADX INFO: loaded from: classes4.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.U f1561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p017b7.a f1562b;

    public O(N6.U typeParameter, p017b7.a typeAttr) {
        kotlin.jvm.internal.m.e(typeParameter, "typeParameter");
        kotlin.jvm.internal.m.e(typeAttr, "typeAttr");
        this.f1561a = typeParameter;
        this.f1562b = typeAttr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C7.O)) {
            return false;
        }
        C7.O o8 = (C7.O) obj;
        return kotlin.jvm.internal.m.a(o8.f1561a, this.f1561a) && kotlin.jvm.internal.m.a(o8.f1562b, this.f1562b);
    }

    public final int hashCode() {
        int iHashCode = this.f1561a.hashCode();
        return this.f1562b.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final java.lang.String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f1561a + ", typeAttr=" + this.f1562b + ')';
    }
}
