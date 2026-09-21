package t0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements android.view.View.OnDragListener, t0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0.f f27743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p136q.C2662f f27744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0.a f27745c;

    public b() {
        t0.f fVar = new t0.f();
        fVar.f27752x = 0L;
        this.f27743a = fVar;
        this.f27744b = new p136q.C2662f(0);
        this.f27745c = new t0.a(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(android.view.View view, android.view.DragEvent dragEvent) {
        p020c0.C1704s0 c1704s0 = new p020c0.C1704s0(20, dragEvent);
        int action = dragEvent.getAction();
        t0.f fVar = this.f27743a;
        p136q.C2662f c2662f = this.f27744b;
        switch (action) {
            case 1:
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                K0.C0658f c0658f = new K0.C0658f(c1704s0, fVar, wVar);
                if (c0658f.invoke(fVar) == Q0.B0.f8207h) {
                    Q0.AbstractC0777k.y(fVar, c0658f);
                }
                boolean z6 = wVar.f24553h;
                c2662f.getClass();
                p136q.C2657a c2657a = new p136q.C2657a(c2662f);
                while (c2657a.hasNext()) {
                    ((t0.f) c2657a.next()).R0(c1704s0);
                }
                return z6;
            case 2:
                fVar.Q0(c1704s0);
                return false;
            case 3:
                return fVar.N0(c1704s0);
            case 4:
                A0.b bVar = new A0.b(28, c1704s0);
                if (bVar.invoke(fVar) == Q0.B0.f8207h) {
                    Q0.AbstractC0777k.y(fVar, bVar);
                }
                c2662f.clear();
                return false;
            case 5:
                fVar.O0(c1704s0);
                return false;
            case 6:
                fVar.P0(c1704s0);
                return false;
            default:
                return false;
        }
    }
}
