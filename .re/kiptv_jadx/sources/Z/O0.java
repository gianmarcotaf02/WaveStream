package Z;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O0.g0 f12290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z.Q0 f12291i;
    public final /* synthetic */ float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(O0.g0 g0Var, Z.Q0 q9, float f9) {
        super(1);
        this.f12290h = g0Var;
        this.f12291i = q9;
        this.j = f9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        O0.f0 f0Var = (O0.f0) obj;
        p163t.C2748c c2748c = this.f12291i.y;
        O0.f0.j(f0Var, this.f12290h, (int) (c2748c != null ? ((java.lang.Number) c2748c.d()).floatValue() : this.j), 0);
        return p070h6.A.f22523a;
    }
}
