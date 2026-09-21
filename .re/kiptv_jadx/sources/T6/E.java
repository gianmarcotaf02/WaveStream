package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends T6.B implements p027c7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.WildcardType f9840a;

    public E(java.lang.reflect.WildcardType wildcardType) {
        this.f9840a = wildcardType;
    }

    @Override // T6.B
    public final java.lang.reflect.Type b() {
        return this.f9840a;
    }

    public final T6.B c() {
        java.lang.reflect.WildcardType wildcardType = this.f9840a;
        java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
        java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new java.lang.UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            java.lang.Object objZ0 = p078i6.m.z0(lowerBounds);
            kotlin.jvm.internal.m.d(objZ0, "single(...)");
            java.lang.reflect.Type type = (java.lang.reflect.Type) objZ0;
            boolean z6 = type instanceof java.lang.Class;
            if (z6) {
                java.lang.Class cls = (java.lang.Class) type;
                if (cls.isPrimitive()) {
                    return new T6.z(cls);
                }
            }
            if ((type instanceof java.lang.reflect.GenericArrayType) || (z6 && ((java.lang.Class) type).isArray())) {
                return new T6.i(type);
            }
            return type instanceof java.lang.reflect.WildcardType ? new T6.E((java.lang.reflect.WildcardType) type) : new T6.q(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        java.lang.reflect.Type type2 = (java.lang.reflect.Type) p078i6.m.z0(upperBounds);
        if (kotlin.jvm.internal.m.a(type2, java.lang.Object.class)) {
            return null;
        }
        kotlin.jvm.internal.m.b(type2);
        boolean z9 = type2 instanceof java.lang.Class;
        if (z9) {
            java.lang.Class cls2 = (java.lang.Class) type2;
            if (cls2.isPrimitive()) {
                return new T6.z(cls2);
            }
        }
        if ((type2 instanceof java.lang.reflect.GenericArrayType) || (z9 && ((java.lang.Class) type2).isArray())) {
            return new T6.i(type2);
        }
        return type2 instanceof java.lang.reflect.WildcardType ? new T6.E((java.lang.reflect.WildcardType) type2) : new T6.q(type2);
    }

    @Override // p027c7.b
    public final java.util.Collection getAnnotations() {
        return p078i6.w.f23205h;
    }
}
