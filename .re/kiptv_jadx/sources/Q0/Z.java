package Q0;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p137q0.o f8379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p038e0.e f8381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p038e0.e f8382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q0.C0765b0 f8384f;

    public Z(Q0.C0765b0 c0765b0, p137q0.o oVar, int i3, p038e0.e eVar, p038e0.e eVar2, boolean z6) {
        this.f8384f = c0765b0;
        this.f8379a = oVar;
        this.f8380b = i3;
        this.f8381c = eVar;
        this.f8382d = eVar2;
        this.f8383e = z6;
    }

    public final boolean a(int i3, int i9) {
        p038e0.e eVar = this.f8381c;
        int i10 = this.f8380b;
        p137q0.n nVar = (p137q0.n) eVar.f21324h[i3 + i10];
        p137q0.n nVar2 = (p137q0.n) this.f8382d.f21324h[i10 + i9];
        return kotlin.jvm.internal.m.a(nVar, nVar2) || nVar.getClass() == nVar2.getClass();
    }
}
