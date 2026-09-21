package H6;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2538c;

public abstract class o0 extends AbstractC0428s implements E6.u {

    public static final Object f4469t = new Object();

    public final G f4470n;

    public final String f4471o;

    public final String f4472p;

    public final Object f4473q;

    public final Object f4474r;

    public final v0 f4475s;

    public o0(G g, String str, String str2, Q6.I i3, Object obj) {
        this.f4470n = g;
        this.f4471o = str;
        this.f4472p = str2;
        this.f4473q = obj;
        this.f4474r = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new i0(this, 0));
        this.f4475s = p000a.a.A(i3, new i0(this, 1));
    }

    public final boolean equals(Object obj) {
        o0 o0VarC = B0.c(obj);
        return o0VarC != null && kotlin.jvm.internal.m.a(this.f4470n, o0VarC.f4470n) && kotlin.jvm.internal.m.a(this.f4471o, o0VarC.f4471o) && kotlin.jvm.internal.m.a(this.f4472p, o0VarC.f4472p) && kotlin.jvm.internal.m.a(this.f4473q, o0VarC.f4473q);
    }

    @Override
    public final String getName() {
        return this.f4471o;
    }

    public final int hashCode() {
        return this.f4472p.hashCode() + B2.a.a(this.f4470n.hashCode() * 31, 31, this.f4471o);
    }

    @Override
    public final boolean isConst() {
        return n().isConst();
    }

    @Override
    public final boolean isLateinit() {
        return n().b0();
    }

    @Override
    public final boolean isSuspend() {
        return false;
    }

    @Override
    public final I6.g k() {
        return u().k();
    }

    @Override
    public final G l() {
        return this.f4470n;
    }

    @Override
    public final I6.g m() {
        u().getClass();
        return null;
    }

    @Override
    public final boolean q() {
        return this.f4473q != AbstractC2538c.NO_RECEIVER;
    }

    public final Member r() {
        if (!n().F()) {
            return null;
        }
        p101l7.b bVar = z0.f4517a;
        P3.e eVarB = z0.b(n());
        if (eVarB instanceof C0425o) {
            C0425o c0425o = (C0425o) eVarB;
            j7.e eVar = c0425o.f4465p;
            if ((eVar.f24282i & 16) == 16) {
                j7.c cVar = eVar.f24286n;
                int i3 = cVar.f24270i;
                if ((i3 & 1) != 1 || (i3 & 2) != 2) {
                    return null;
                }
                int i9 = cVar.j;
                p079i7.e eVar2 = c0425o.f4466q;
                return this.f4470n.k(eVar2.n0(i9), eVar2.n0(cVar.f24271k));
            }
        }
        return (Field) this.f4474r.getValue();
    }

    public final Object s(Member member, Object obj) throws F6.a {
        Object objE;
        try {
            Object obj2 = f4469t;
            if (obj == obj2 && n().V() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            if (q()) {
                objE = C2.a.h(this.f4473q, n());
            } else {
                objE = obj;
            }
            if (objE == obj2) {
                objE = null;
            }
            if (!q()) {
                obj = null;
            }
            if (obj == obj2) {
                obj = null;
            }
            AccessibleObject accessibleObject = member instanceof AccessibleObject ? (AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(p199y3.e.z(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(objE);
            }
            if (!(member instanceof Method)) {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((Method) member).invoke(null, null);
            }
            if (length == 1) {
                Method method = (Method) member;
                if (objE == null) {
                    Class<?> cls = ((Method) member).getParameterTypes()[0];
                    kotlin.jvm.internal.m.d(cls, "get(...)");
                    objE = B0.e(cls);
                }
                return method.invoke(null, objE);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) member;
            if (obj == null) {
                Class<?> cls2 = ((Method) member).getParameterTypes()[1];
                kotlin.jvm.internal.m.d(cls2, "get(...)");
                obj = B0.e(cls2);
            }
            return method2.invoke(null, objE, obj);
        } catch (IllegalAccessException e6) {
            throw new F6.a("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e6);
        }
    }

    @Override
    public final N6.N n() {
        Object objInvoke = this.f4475s.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (N6.N) objInvoke;
    }

    public final String toString() {
        p118n7.g gVar = y0.f4516a;
        return y0.c(n());
    }

    public abstract l0 u();

    public o0(G container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
    }

    public o0(G container, Q6.I descriptor) {
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        String strB = descriptor.getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        this(container, strB, z0.b(descriptor).N(), descriptor, AbstractC2538c.NO_RECEIVER);
    }
}
