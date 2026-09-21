package t0;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import p113n1.n;
import p188x0.AbstractC3083c;
import p188x0.C3082b;
import p188x0.InterfaceC3097q;
import p194x6.j;

public final class c extends View.DragShadowBuilder {

    public final p113n1.d f27746a;

    public final long f27747b;

    public final j f27748c;

    public c(p113n1.d dVar, long j, j jVar) {
        this.f27746a = dVar;
        this.f27747b = j;
        this.f27748c = jVar;
    }

    @Override
    public final void onDrawShadow(Canvas canvas) {
        p203z0.b bVar = new p203z0.b();
        n nVar = n.f25566h;
        Canvas canvas2 = AbstractC3083c.f31100a;
        C3082b c3082b = new C3082b();
        c3082b.f31097a = canvas;
        p203z0.a aVar = bVar.f32127h;
        p113n1.c cVar = aVar.f32123a;
        n nVar2 = aVar.f32124b;
        InterfaceC3097q interfaceC3097q = aVar.f32125c;
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

    @Override
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f27747b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        p113n1.d dVar = this.f27746a;
        point.set(dVar.k0(fIntBitsToFloat / dVar.getDensity()), dVar.k0(Float.intBitsToFloat((int) (j & 4294967295L)) / dVar.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
