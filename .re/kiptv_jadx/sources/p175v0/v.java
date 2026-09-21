package p175v0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.internal.InterfaceC2542g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f29101h;

    public v(p194x6.j jVar) {
        this.f29101h = jVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p175v0.v) || obj == null) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f29101h, ((kotlin.jvm.internal.InterfaceC2542g) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.InterfaceC2542g
    public final p070h6.e getFunctionDelegate() {
        return this.f29101h;
    }

    public final int hashCode() {
        return this.f29101h.hashCode();
    }
}
