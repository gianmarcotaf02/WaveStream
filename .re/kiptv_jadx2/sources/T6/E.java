package T6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class E extends B implements p027c7.d {

    public final WildcardType f9840a;

    public E(WildcardType wildcardType) {
        this.f9840a = wildcardType;
    }

    @Override
    public final Type b() {
        return this.f9840a;
    }

    public final B c() {
        WildcardType wildcardType = this.f9840a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objZ0 = p078i6.m.z0(lowerBounds);
            kotlin.jvm.internal.m.d(objZ0, "single(...)");
            Type type = (Type) objZ0;
            boolean z6 = type instanceof Class;
            if (z6) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new z(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z6 && ((Class) type).isArray())) {
                return new i(type);
            }
            return type instanceof WildcardType ? new E((WildcardType) type) : new q(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) p078i6.m.z0(upperBounds);
        if (kotlin.jvm.internal.m.a(type2, Object.class)) {
            return null;
        }
        kotlin.jvm.internal.m.b(type2);
        boolean z9 = type2 instanceof Class;
        if (z9) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new z(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z9 && ((Class) type2).isArray())) {
            return new i(type2);
        }
        return type2 instanceof WildcardType ? new E((WildcardType) type2) : new q(type2);
    }

    @Override
    public final Collection getAnnotations() {
        return p078i6.w.f23205h;
    }
}
