package p186w5;

/* JADX INFO: renamed from: w5.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2977d0 implements p186w5.InterfaceC2983g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f30212a;

    public C2977d0(java.util.List list) {
        this.f30212a = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p186w5.C2977d0) && kotlin.jvm.internal.m.a(this.f30212a, ((p186w5.C2977d0) obj).f30212a);
    }

    public final int hashCode() {
        return this.f30212a.hashCode();
    }

    public final java.lang.String toString() {
        return "Series(items=" + this.f30212a + ")";
    }
}
