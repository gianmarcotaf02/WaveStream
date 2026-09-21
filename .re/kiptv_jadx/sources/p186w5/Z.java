package p186w5;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements p186w5.InterfaceC2983g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f30180a;

    public Z(java.util.ArrayList arrayList) {
        this.f30180a = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p186w5.Z) && this.f30180a.equals(((p186w5.Z) obj).f30180a);
    }

    public final int hashCode() {
        return this.f30180a.hashCode();
    }

    public final java.lang.String toString() {
        return "Live(groups=" + this.f30180a + ")";
    }
}
