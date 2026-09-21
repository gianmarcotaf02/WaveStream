package t0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends android.view.View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p113n1.d f27746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f27747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p194x6.j f27748c;

    public c(p113n1.d dVar, long j, p194x6.j jVar) {
        this.f27746a = dVar;
        this.f27747b = j;
        this.f27748c = jVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(android.graphics.Canvas canvas) {
        p203z0.b bVar = new p203z0.b();
        p113n1.n nVar = p113n1.n.f25566h;
        android.graphics.Canvas canvas2 = p188x0.AbstractC3083c.f31100a;
        p188x0.C3082b c3082b = new p188x0.C3082b();
        c3082b.f31097a = canvas;
        p203z0.a aVar = bVar.f32127h;
        p113n1.c cVar = aVar.f32123a;
        p113n1.n nVar2 = aVar.f32124b;
        p188x0.InterfaceC3097q interfaceC3097q = aVar.f32125c;
        long j = aVar.f32126d;
        aVar.f32123a = this.f27746a;
        aVar.f32124b = nVar;
        aVar.f32125c = c3082b;
        aVar.f32126d = this.f27747b;
        c3082b.e();
        this.f27748c.invoke(bVar);
        c3082b.p();
        aVar.f32123a = cVar;
        aVar.f32124b = nVar2;
        aVar.f32125c = interfaceC3097q;
        aVar.f32126d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(android.graphics.Point point, android.graphics.Point point2) {
        long j = this.f27747b;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        p113n1.d dVar = this.f27746a;
        point.set(dVar.k0(fIntBitsToFloat / dVar.getDensity()), dVar.k0(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / dVar.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
