package p020c0;

/* JADX INFO: renamed from: c0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1713x implements p129p0.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p020c0.InterfaceC1707u f18384h;

    public C1713x(p020c0.InterfaceC1707u interfaceC1707u) {
        this.f18384h = interfaceC1707u;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p020c0.C1713x) {
            return kotlin.jvm.internal.m.a(this.f18384h, ((p020c0.C1713x) obj).f18384h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18384h.hashCode() * 31;
    }
}
