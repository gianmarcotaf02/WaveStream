package T6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class q extends B implements p027c7.d {

    public final Type f9867a;

    public final s f9868b;

    public q(Type reflectType) {
        s oVar;
        kotlin.jvm.internal.m.e(reflectType, "reflectType");
        this.f9867a = reflectType;
        if (reflectType instanceof Class) {
            oVar = new o((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            oVar = new C((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            kotlin.jvm.internal.m.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            oVar = new o((Class) rawType);
        }
        this.f9868b = oVar;
    }

    @Override
    public final C0927e a(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return null;
    }

    @Override
    public final Type b() {
        return this.f9867a;
    }

    public final ArrayList c() {
        B iVar;
        B zVar;
        List<Type> listC = AbstractC0926d.c(this.f9867a);
        ArrayList arrayList = new ArrayList(p078i6.q.I0(listC, 10));
        for (Type type : listC) {
            kotlin.jvm.internal.m.e(type, "type");
            boolean z6 = type instanceof Class;
            if (z6) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    zVar = new z(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z6 && ((Class) type).isArray())) {
                        iVar = new i(type);
                    } else {
                        iVar = type instanceof WildcardType ? new E((WildcardType) type) : new q(type);
                    }
                    zVar = iVar;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    iVar = new i(type);
                } else {
                    iVar = new i(type);
                }
                zVar = iVar;
            }
            arrayList.add(zVar);
        }
        return arrayList;
    }

    public final boolean d() {
        Type type = this.f9867a;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Collection getAnnotations() {
        return p078i6.w.f23205h;
    }
}
