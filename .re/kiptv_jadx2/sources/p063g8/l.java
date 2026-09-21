package p063g8;

import kotlin.jvm.internal.m;
import p045e8.X;
import p055f8.a;

public final class l extends a {

    public final r f22380a;

    public final String f22381b;

    public final Object f22382c;

    public l(r rVar, a aVar, int i3) {
        String name = rVar.f22391h.getName();
        aVar = (i3 & 4) != 0 ? null : aVar;
        m.e(name, "name");
        this.f22380a = rVar;
        this.f22381b = name;
        this.f22382c = aVar;
    }

    @Override
    public final r a() {
        return this.f22380a;
    }

    @Override
    public final Object b() {
        return this.f22382c;
    }

    @Override
    public final String c() {
        return this.f22381b;
    }

    @Override
    public final X d() {
        return null;
    }
}
