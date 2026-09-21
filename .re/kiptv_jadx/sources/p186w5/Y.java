package p186w5;

/* JADX INFO: loaded from: classes4.dex */
public final class Y implements p186w5.InterfaceC2983g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f30177a;

    public Y(java.util.ArrayList arrayList) {
        this.f30177a = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p186w5.Y) && this.f30177a.equals(((p186w5.Y) obj).f30177a);
    }

    public final int hashCode() {
        return this.f30177a.hashCode();
    }

    public final java.lang.String toString() {
        return "Feed(items=" + this.f30177a + ")";
    }
}
