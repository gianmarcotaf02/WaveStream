package p175v0;

/* JADX INFO: renamed from: v0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2910e extends p137q0.o implements p175v0.InterfaceC2913h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p194x6.j f29066v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p175v0.D f29067w;

    @Override // p175v0.InterfaceC2913h
    public final void v0(p175v0.D d4) {
        if (kotlin.jvm.internal.m.a(this.f29067w, d4)) {
            return;
        }
        this.f29067w = d4;
        this.f29066v.invoke(d4);
    }
}
