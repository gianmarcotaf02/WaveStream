package p020c0;

import C5.r;
import kotlin.jvm.functions.Function0;
import p194x6.j;

public final class C extends AbstractC1697o0 {

    public final int f18101b = 1;

    public final Object f18102c;

    public C(Function0 function0) {
        super(function0);
        C1676e c1676e = C1676e.f18243n;
        this.f18102c = c1676e;
    }

    @Override
    public final C1699p0 a(Object obj) {
        switch (this.f18101b) {
            case 0:
                return new C1699p0(this, obj, obj == null, null, true);
            default:
                return new C1699p0(this, obj, obj == null, (S0) this.f18102c, true);
        }
    }

    @Override
    public h1 b() {
        switch (this.f18101b) {
            case 0:
                return (D) this.f18102c;
            default:
                return super.b();
        }
    }

    public C(j jVar) {
        super(new r(28));
        this.f18102c = new D(jVar);
    }
}
