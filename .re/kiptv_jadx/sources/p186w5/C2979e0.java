package p186w5;

/* JADX INFO: renamed from: w5.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2979e0 implements p186w5.InterfaceC2983g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f30219a;

    public C2979e0(java.util.List list) {
        this.f30219a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p186w5.C2979e0) && kotlin.jvm.internal.m.a(this.f30219a, ((p186w5.C2979e0) obj).f30219a);
    }

    public final int hashCode() {
        return this.f30219a.hashCode();
    }

    public final java.lang.String toString() {
        return "Tonight(entries=" + this.f30219a + ")";
    }
}
