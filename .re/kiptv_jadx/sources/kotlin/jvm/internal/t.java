package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements kotlin.jvm.internal.InterfaceC2539d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Class f24552h;

    public t(java.lang.Class jClass) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        this.f24552h = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC2539d
    public final java.lang.Class b() {
        return this.f24552h;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof kotlin.jvm.internal.t) {
            return kotlin.jvm.internal.m.a(this.f24552h, ((kotlin.jvm.internal.t) obj).f24552h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24552h.hashCode();
    }

    public final java.lang.String toString() {
        return this.f24552h + " (Kotlin reflection is not available)";
    }
}
