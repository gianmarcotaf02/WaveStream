package p063g8;

import Y6.f;
import kotlin.jvm.internal.m;
import p045e8.X;

public final class u extends a {

    public final r f22395a;

    public final int f22396b;

    public final int f22397c;

    public final String f22398d;

    public final Integer f22399e;

    public final X f22400f;
    public final int g;

    public u(r rVar, int i3, int i9, X x9, int i10) {
        int i11;
        String name = rVar.f22391h.getName();
        Integer num = (i10 & 16) != 0 ? null : 0;
        x9 = (i10 & 32) != 0 ? null : x9;
        m.e(name, "name");
        this.f22395a = rVar;
        this.f22396b = i3;
        this.f22397c = i9;
        this.f22398d = name;
        this.f22399e = num;
        this.f22400f = x9;
        if (i9 < 10) {
            i11 = 1;
        } else if (i9 < 100) {
            i11 = 2;
        } else {
            if (i9 >= 1000) {
                throw new IllegalArgumentException(f.f(i9, "Max value ", " is too large"));
            }
            i11 = 3;
        }
        this.g = i11;
    }

    @Override
    public final r a() {
        return this.f22395a;
    }

    @Override
    public final Object b() {
        return this.f22399e;
    }

    @Override
    public final String c() {
        return this.f22398d;
    }

    @Override
    public final X d() {
        return this.f22400f;
    }
}
