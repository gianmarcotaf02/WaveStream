package T6;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class i extends B implements p027c7.d {

    public final Type f9857a;

    public final B f9858b;

    public final p078i6.w f9859c;

    public i(Type type) {
        B zVar;
        B zVar2;
        this.f9857a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.m.d(componentType, "getComponentType(...)");
                    zVar = componentType.isPrimitive() ? new z(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new i(componentType) : componentType instanceof WildcardType ? new E((WildcardType) componentType) : new q(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        kotlin.jvm.internal.m.d(genericComponentType, "getGenericComponentType(...)");
        boolean z6 = genericComponentType instanceof Class;
        if (z6) {
            Class cls2 = (Class) genericComponentType;
            zVar2 = cls2.isPrimitive() ? new z(cls2) : zVar2;
            this.f9858b = zVar2;
            this.f9859c = p078i6.w.f23205h;
        }
        zVar = ((genericComponentType instanceof GenericArrayType) || (z6 && ((Class) genericComponentType).isArray())) ? new i(genericComponentType) : genericComponentType instanceof WildcardType ? new E((WildcardType) genericComponentType) : new q(genericComponentType);
        zVar2 = zVar;
        this.f9858b = zVar2;
        this.f9859c = p078i6.w.f23205h;
    }

    @Override
    public final Type b() {
        return this.f9857a;
    }

    @Override
    public final Collection getAnnotations() {
        return this.f9859c;
    }
}
