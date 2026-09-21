package t0;

import K0.C0658f;
import Q0.AbstractC0777k;
import Q0.B0;
import android.view.DragEvent;
import android.view.View;
import kotlin.jvm.internal.w;
import p020c0.C1704s0;
import p136q.C2657a;
import p136q.C2662f;

public final class b implements View.OnDragListener, d {

    public final f f27743a;

    public final C2662f f27744b;

    public final a f27745c;

    public b() {
        f fVar = new f();
        fVar.f27752x = 0L;
        this.f27743a = fVar;
        this.f27744b = new C2662f(0);
        this.f27745c = new a(this);
    }

    @Override
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C1704s0 c1704s0 = new C1704s0(20, dragEvent);
        int action = dragEvent.getAction();
        f fVar = this.f27743a;
        C2662f c2662f = this.f27744b;
        switch (action) {
            case 1:
                w wVar = new w();
                C0658f c0658f = new C0658f(c1704s0, fVar, wVar);
                if (c0658f.invoke(fVar) == B0.f8207h) {
                    AbstractC0777k.y(fVar, c0658f);
                }
                boolean z6 = wVar.f24553h;
                c2662f.getClass();
                C2657a c2657a = new C2657a(c2662f);
                while (c2657a.hasNext()) {
                    ((f) c2657a.next()).R0(c1704s0);
                }
                return z6;
            case 2:
                fVar.Q0(c1704s0);
                return false;
            case 3:
                return fVar.N0(c1704s0);
            case 4:
                A0.b bVar = new A0.b(28, c1704s0);
                if (bVar.invoke(fVar) == B0.f8207h) {
                    AbstractC0777k.y(fVar, bVar);
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
