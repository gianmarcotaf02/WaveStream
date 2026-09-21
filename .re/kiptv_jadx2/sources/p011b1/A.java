package p011b1;

import kotlin.jvm.internal.m;
import p188x0.C3098s;
import p188x0.z;
import p194x6.j;

public final class A implements j {

    public static final A f17709h = new A();

    @Override
    public final Object invoke(Object obj) {
        if (m.a(obj, Boolean.FALSE)) {
            return new C3098s(C3098s.g);
        }
        m.c(obj, "null cannot be cast to non-null type kotlin.Int");
        return new C3098s(z.c(((Integer) obj).intValue()));
    }
}
