package p063g8;

import com.google.common.util.concurrent.P;
import h8.a;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.w;
import p080i8.b;
import p080i8.h;
import p080i8.p;

public abstract class i implements j {

    public final l f22379a;

    public i(l field, List list) {
        m.e(field, "field");
        this.f22379a = field;
    }

    @Override
    public final a a() {
        r rVar = this.f22379a.f22380a;
        return new a();
    }

    @Override
    public final p b() {
        l lVar = this.f22379a;
        return new p(P.i0(new h(P.i0(new b(lVar.f22380a, lVar.f22381b)))), w.f23205h);
    }

    @Override
    public final a c() {
        return this.f22379a;
    }
}
