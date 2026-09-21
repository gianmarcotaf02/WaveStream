package T6;

import C7.C0173e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class o extends s implements p027c7.b, p027c7.e {

    public final Class f9865a;

    public o(Class klass) {
        kotlin.jvm.internal.m.e(klass, "klass");
        this.f9865a = klass;
    }

    @Override
    public final C0927e a(p101l7.c fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        Class cls = this.f9865a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C2.a.u(declaredAnnotations, fqName);
    }

    public final List b() {
        Field[] declaredFields = this.f9865a.getDeclaredFields();
        kotlin.jvm.internal.m.d(declaredFields, "getDeclaredFields(...)");
        return N7.o.s0(N7.o.p0(new N7.i(p078i6.m.T(declaredFields), false, l.f9862h), m.f9863h));
    }

    public final p101l7.c c() {
        return AbstractC0926d.a(this.f9865a).a();
    }

    public final List d() {
        Method[] declaredMethods = this.f9865a.getDeclaredMethods();
        kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
        return N7.o.s0(N7.o.p0(N7.o.k0(p078i6.m.T(declaredMethods), new C0173e(9, this)), n.f9864h));
    }

    public final p101l7.e e() {
        Class cls = this.f9865a;
        if (!cls.isAnonymousClass()) {
            return p101l7.e.e(cls.getSimpleName());
        }
        String name = cls.getName();
        int iP0 = O7.q.P0(0, 6, name, ".");
        if (iP0 != -1) {
            name = name.substring(1 + iP0, name.length());
            kotlin.jvm.internal.m.d(name, "substring(...)");
        }
        return p101l7.e.e(name);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return kotlin.jvm.internal.m.a(this.f9865a, ((o) obj).f9865a);
        }
        return false;
    }

    public final ArrayList f() {
        Class clazz = this.f9865a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        A7.m mVar = O7.r.f8066e;
        Object[] objArr = null;
        if (mVar == null) {
            try {
                mVar = new A7.m(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                mVar = new A7.m(objArr, objArr, objArr, objArr, 7);
            }
            O7.r.f8066e = mVar;
        }
        Method method = (Method) mVar.f323l;
        objArr = method != null ? (Object[]) method.invoke(clazz, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new A(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f9865a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        A7.m mVar = O7.r.f8066e;
        Boolean bool = null;
        if (mVar == null) {
            try {
                mVar = new A7.m(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                mVar = new A7.m(bool, bool, bool, bool, 7);
            }
            O7.r.f8066e = mVar;
        }
        Method method = (Method) mVar.f322k;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.f9865a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? p078i6.w.f23205h : C2.a.v(declaredAnnotations);
    }

    @Override
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f9865a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C(typeVariable));
        }
        return arrayList;
    }

    public final boolean h() throws IllegalAccessException, InvocationTargetException {
        Class clazz = this.f9865a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        A7.m mVar = O7.r.f8066e;
        Boolean bool = null;
        if (mVar == null) {
            try {
                mVar = new A7.m(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 7);
            } catch (NoSuchMethodException unused) {
                mVar = new A7.m(bool, bool, bool, bool, 7);
            }
            O7.r.f8066e = mVar;
        }
        Method method = (Method) mVar.f321i;
        if (method != null) {
            Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.f9865a.hashCode();
    }

    public final String toString() {
        return o.class.getName() + ": " + this.f9865a;
    }
}
