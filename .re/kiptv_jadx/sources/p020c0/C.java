package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class C extends p020c0.AbstractC1697o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18101b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f18102c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(kotlin.jvm.functions.Function0 function0) {
        super(function0);
        p020c0.C1676e c1676e = p020c0.C1676e.f18243n;
        this.f18102c = c1676e;
    }

    @Override // p020c0.AbstractC1697o0
    public final p020c0.C1699p0 a(java.lang.Object obj) {
        switch (this.f18101b) {
            case 0:
                return new p020c0.C1699p0(this, obj, obj == null, null, true);
            default:
                return new p020c0.C1699p0(this, obj, obj == null, (p020c0.S0) this.f18102c, true);
        }
    }

    @Override // p020c0.AbstractC1697o0
    public p020c0.h1 b() {
        switch (this.f18101b) {
            case 0:
                return (p020c0.D) this.f18102c;
            default:
                return super.b();
        }
    }

    public C(p194x6.j jVar) {
        super(new C5.r(28));
        this.f18102c = new p020c0.D(jVar);
    }
}
