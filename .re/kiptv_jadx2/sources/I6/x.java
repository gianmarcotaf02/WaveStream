package I6;

import D0.C0206g;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class x implements g {

    public final Member f5543a;

    public final Type f5544b;

    public final Class f5545c;

    public final List f5546d;

    public x(Member member, Type type, Class cls, Type[] typeArr) {
        List listE0;
        this.f5543a = member;
        this.f5544b = type;
        this.f5545c = cls;
        if (cls != null) {
            C0206g c0206g = new C0206g(2);
            c0206g.a(cls);
            c0206g.b(typeArr);
            ArrayList arrayList = c0206g.f1884a;
            listE0 = p078i6.p.B0(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listE0 = p078i6.m.E0(typeArr);
        }
        this.f5546d = listE0;
    }

    @Override
    public final List a() {
        return this.f5546d;
    }

    @Override
    public final Member b() {
        return this.f5543a;
    }

    @Override
    public final boolean c() {
        return false;
    }

    public void d(Object[] objArr) {
        p199y3.e.k(this, objArr);
    }

    public final void e(Object obj) {
        if (obj == null || !this.f5543a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override
    public final Type getReturnType() {
        return this.f5544b;
    }
}
