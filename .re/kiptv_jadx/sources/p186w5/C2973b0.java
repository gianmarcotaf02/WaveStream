package p186w5;

/* JADX INFO: renamed from: w5.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2973b0 implements p186w5.InterfaceC2983g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f30198a;

    public C2973b0(java.util.List list) {
        this.f30198a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p186w5.C2973b0) && kotlin.jvm.internal.m.a(this.f30198a, ((p186w5.C2973b0) obj).f30198a);
    }

    public final int hashCode() {
        return this.f30198a.hashCode();
    }

    public final java.lang.String toString() {
        return "Movies(items=" + this.f30198a + ")";
    }
}
