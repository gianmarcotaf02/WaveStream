package p186w5;

/* JADX INFO: loaded from: classes4.dex */
public final class X implements p186w5.InterfaceC2983g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f30174a;

    public X(java.util.ArrayList arrayList) {
        this.f30174a = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p186w5.X) && this.f30174a.equals(((p186w5.X) obj).f30174a);
    }

    public final int hashCode() {
        return this.f30174a.hashCode();
    }

    public final java.lang.String toString() {
        return "ContinueWatching(items=" + this.f30174a + ")";
    }
}
