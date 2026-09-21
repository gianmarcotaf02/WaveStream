package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends T6.B implements p027c7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Type f9867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T6.s f9868b;

    public q(java.lang.reflect.Type reflectType) {
        T6.s oVar;
        kotlin.jvm.internal.m.e(reflectType, "reflectType");
        this.f9867a = reflectType;
        if (reflectType instanceof java.lang.Class) {
            oVar = new T6.o((java.lang.Class) reflectType);
        } else if (reflectType instanceof java.lang.reflect.TypeVariable) {
            oVar = new T6.C((java.lang.reflect.TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof java.lang.reflect.ParameterizedType)) {
                throw new java.lang.IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) reflectType).getRawType();
            kotlin.jvm.internal.m.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            oVar = new T6.o((java.lang.Class) rawType);
        }
        this.f9868b = oVar;
    }

    @Override // T6.B, p027c7.b
    public final T6.C0927e a(p101l7.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return null;
    }

    @Override // T6.B
    public final java.lang.reflect.Type b() {
        return this.f9867a;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    public final java.util.ArrayList c() {
        T6.B iVar;
        T6.B zVar;
        java.util.List<java.lang.reflect.Type> listC = T6.AbstractC0926d.c(this.f9867a);
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(listC, 10));
        for (java.lang.reflect.Type type : listC) {
            kotlin.jvm.internal.m.e(type, "type");
            boolean z6 = type instanceof java.lang.Class;
            if (z6) {
                java.lang.Class cls = (java.lang.Class) type;
                if (cls.isPrimitive()) {
                    zVar = new T6.z(cls);
                } else {
                    if (!(type instanceof java.lang.reflect.GenericArrayType) || (z6 && ((java.lang.Class) type).isArray())) {
                        iVar = new T6.i(type);
                    } else {
                        iVar = type instanceof java.lang.reflect.WildcardType ? new T6.E((java.lang.reflect.WildcardType) type) : new T6.q(type);
                    }
                    zVar = iVar;
                }
            } else {
                if (type instanceof java.lang.reflect.GenericArrayType) {
                    iVar = new T6.i(type);
                } else {
                    iVar = new T6.i(type);
                }
                zVar = iVar;
            }
            arrayList.add(zVar);
        }
        return arrayList;
    }

    public final boolean d() {
        java.lang.reflect.Type type = this.f9867a;
        if (type instanceof java.lang.Class) {
            java.lang.reflect.TypeVariable[] typeParameters = ((java.lang.Class) type).getTypeParameters();
            kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p027c7.b
    public final java.util.Collection getAnnotations() {
        return p078i6.w.f23205h;
    }
}
