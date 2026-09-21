package v;

/* JADX INFO: loaded from: classes.dex */
public final class A extends Q0.AbstractC0776j implements Q0.x0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p188x0.O f28793A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p171u0.b f28794B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v.C2903x f28795x;
    public float y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p188x0.AbstractC3095o f28796z;

    public A(float f9, p188x0.AbstractC3095o abstractC3095o, p188x0.O o8) {
        this.y = f9;
        this.f28796z = abstractC3095o;
        this.f28793A = o8;
        p171u0.b bVar = new p171u0.b(new p171u0.c(), new p078i6.C2255f(25, this));
        N0(bVar);
        this.f28794B = bVar;
    }

    @Override // p137q0.o
    public final boolean C0() {
        return false;
    }

    @Override // Q0.x0
    public final boolean c() {
        return false;
    }

    @Override // Q0.x0
    public final void j0(Y0.x xVar) {
        Y0.v.d(xVar, this.f28793A);
    }
}
