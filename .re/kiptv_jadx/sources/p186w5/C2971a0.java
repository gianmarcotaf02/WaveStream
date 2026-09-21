package p186w5;

/* JADX INFO: renamed from: w5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2971a0 implements p186w5.InterfaceC2983g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f30187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f30188b;

    public C2971a0(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f30187a = arrayList;
        this.f30188b = arrayList2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p186w5.C2971a0)) {
            return false;
        }
        p186w5.C2971a0 c2971a0 = (p186w5.C2971a0) obj;
        return this.f30187a.equals(c2971a0.f30187a) && this.f30188b.equals(c2971a0.f30188b);
    }

    public final int hashCode() {
        return this.f30188b.hashCode() + (this.f30187a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "Mixed(movies=" + this.f30187a + ", series=" + this.f30188b + ")";
    }
}
