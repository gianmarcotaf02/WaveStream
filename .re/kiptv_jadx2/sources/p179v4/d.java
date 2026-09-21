package p179v4;

import A4.X;
import D1.AbstractC0220e0;
import N6.P;
import Q6.z;
import com.google.crypto.tink.shaded.protobuf.AbstractC1906a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p079i7.e;
import p101l7.c;
import p131p4.f;

public abstract class d {

    public final int f29160a = 1;

    public final Object f29161b;

    public final Object f29162c;

    public final Object f29163d;

    public d(e eVar, z zVar, P p2) {
        this.f29161b = eVar;
        this.f29162c = zVar;
        this.f29163d = p2;
    }

    public abstract c a();

    public int b() {
        return 1;
    }

    public abstract String c();

    public Object d(AbstractC1906a abstractC1906a, Class cls) {
        f fVar = (f) ((Map) this.f29163d).get(cls);
        if (fVar != null) {
            return fVar.a(abstractC1906a);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract AbstractC0220e0 e();

    public abstract X f();

    public abstract AbstractC1906a g(AbstractC1915j abstractC1915j);

    public abstract void h(AbstractC1906a abstractC1906a);

    public String toString() {
        switch (this.f29160a) {
            case 1:
                return getClass().getSimpleName() + ": " + a();
            default:
                return super.toString();
        }
    }

    public d(Class cls, f[] fVarArr) {
        this.f29161b = cls;
        HashMap map = new HashMap();
        for (f fVar : fVarArr) {
            boolean zContainsKey = map.containsKey(fVar.f26195a);
            Class cls2 = fVar.f26195a;
            if (!zContainsKey) {
                map.put(cls2, fVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls2.getCanonicalName());
            }
        }
        if (fVarArr.length > 0) {
            this.f29162c = fVarArr[0].f26195a;
        } else {
            this.f29162c = Void.class;
        }
        this.f29163d = Collections.unmodifiableMap(map);
    }
}
