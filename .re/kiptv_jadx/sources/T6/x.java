package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends T6.w implements p027c7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f9873a;

    public x(java.lang.reflect.Method member) {
        kotlin.jvm.internal.m.e(member, "member");
        this.f9873a = member;
    }

    @Override // T6.w
    public final java.lang.reflect.Member b() {
        return this.f9873a;
    }

    public final T6.B f() {
        java.lang.reflect.Type genericReturnType = this.f9873a.getGenericReturnType();
        kotlin.jvm.internal.m.d(genericReturnType, "getGenericReturnType(...)");
        boolean z6 = genericReturnType instanceof java.lang.Class;
        if (z6) {
            java.lang.Class cls = (java.lang.Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new T6.z(cls);
            }
        }
        if ((genericReturnType instanceof java.lang.reflect.GenericArrayType) || (z6 && ((java.lang.Class) genericReturnType).isArray())) {
            return new T6.i(genericReturnType);
        }
        return genericReturnType instanceof java.lang.reflect.WildcardType ? new T6.E((java.lang.reflect.WildcardType) genericReturnType) : new T6.q(genericReturnType);
    }

    public final java.util.List g() {
        java.lang.reflect.Method method = this.f9873a;
        java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
        java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        kotlin.jvm.internal.m.d(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // p027c7.e
    public final java.util.ArrayList getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeParameters = this.f9873a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Method> typeVariable : typeParameters) {
            arrayList.add(new T6.C(typeVariable));
        }
        return arrayList;
    }
}
