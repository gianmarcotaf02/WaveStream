package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b1.E f17778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p011b1.E f17779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p011b1.E f17780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p011b1.E f17781d;

    public K(p011b1.E e6, p011b1.E e9, p011b1.E e10, p011b1.E e11) {
        this.f17778a = e6;
        this.f17779b = e9;
        this.f17780c = e10;
        this.f17781d = e11;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p011b1.K)) {
            return false;
        }
        p011b1.K k9 = (p011b1.K) obj;
        return kotlin.jvm.internal.m.a(this.f17778a, k9.f17778a) && kotlin.jvm.internal.m.a(this.f17779b, k9.f17779b) && kotlin.jvm.internal.m.a(this.f17780c, k9.f17780c) && kotlin.jvm.internal.m.a(this.f17781d, k9.f17781d);
    }

    public final int hashCode() {
        p011b1.E e6 = this.f17778a;
        int iHashCode = (e6 != null ? e6.hashCode() : 0) * 31;
        p011b1.E e9 = this.f17779b;
        int iHashCode2 = (iHashCode + (e9 != null ? e9.hashCode() : 0)) * 31;
        p011b1.E e10 = this.f17780c;
        int iHashCode3 = (iHashCode2 + (e10 != null ? e10.hashCode() : 0)) * 31;
        p011b1.E e11 = this.f17781d;
        return iHashCode3 + (e11 != null ? e11.hashCode() : 0);
    }
}
