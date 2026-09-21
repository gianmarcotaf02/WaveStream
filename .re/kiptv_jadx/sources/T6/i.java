package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends T6.B implements p027c7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Type f9857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T6.B f9858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p078i6.w f9859c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(java.lang.reflect.Type type) {
        T6.B zVar;
        T6.B zVar2;
        this.f9857a = type;
        if (!(type instanceof java.lang.reflect.GenericArrayType)) {
            if (type instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) type;
                if (cls.isArray()) {
                    java.lang.Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.m.d(componentType, "getComponentType(...)");
                    zVar = componentType.isPrimitive() ? new T6.z(componentType) : ((componentType instanceof java.lang.reflect.GenericArrayType) || componentType.isArray()) ? new T6.i(componentType) : componentType instanceof java.lang.reflect.WildcardType ? new T6.E((java.lang.reflect.WildcardType) componentType) : new T6.q(componentType);
                }
            }
            throw new java.lang.IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        java.lang.reflect.Type genericComponentType = ((java.lang.reflect.GenericArrayType) type).getGenericComponentType();
        kotlin.jvm.internal.m.d(genericComponentType, "getGenericComponentType(...)");
        boolean z6 = genericComponentType instanceof java.lang.Class;
        if (z6) {
            java.lang.Class cls2 = (java.lang.Class) genericComponentType;
            zVar2 = cls2.isPrimitive() ? new T6.z(cls2) : zVar2;
            this.f9858b = zVar2;
            this.f9859c = p078i6.w.f23205h;
        }
        zVar = ((genericComponentType instanceof java.lang.reflect.GenericArrayType) || (z6 && ((java.lang.Class) genericComponentType).isArray())) ? new T6.i(genericComponentType) : genericComponentType instanceof java.lang.reflect.WildcardType ? new T6.E((java.lang.reflect.WildcardType) genericComponentType) : new T6.q(genericComponentType);
        zVar2 = zVar;
        this.f9858b = zVar2;
        this.f9859c = p078i6.w.f23205h;
    }

    @Override // T6.B
    public final java.lang.reflect.Type b() {
        return this.f9857a;
    }

    @Override // p027c7.b
    public final java.util.Collection getAnnotations() {
        return this.f9859c;
    }
}
