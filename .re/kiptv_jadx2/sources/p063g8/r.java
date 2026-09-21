package p063g8;

import E6.l;
import kotlin.jvm.internal.m;
import p080i8.a;

public final class r implements a {

    public final l f22391h;

    public r(l property) {
        m.e(property, "property");
        this.f22391h = property;
    }

    public final Object a(Object obj) {
        l lVar = this.f22391h;
        Object obj2 = lVar.get(obj);
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Field " + lVar.getName() + " is not set");
    }

    @Override
    public final Object r(Object obj, Object obj2) {
        l lVar = this.f22391h;
        Object obj3 = lVar.get(obj);
        if (obj3 == null) {
            lVar.set(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }
}
