package T6;

/* JADX INFO: renamed from: T6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0927e extends T6.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.annotation.Annotation f9853a;

    public C0927e(java.lang.annotation.Annotation annotation) {
        kotlin.jvm.internal.m.e(annotation, "annotation");
        this.f9853a = annotation;
    }

    public final java.util.ArrayList b() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        p027c7.a pVar;
        java.lang.annotation.Annotation annotation = this.f9853a;
        java.lang.reflect.Method[] declaredMethods = com.google.android.gms.internal.play_billing.AbstractC1833d1.x(com.google.android.gms.internal.play_billing.AbstractC1833d1.u(annotation)).getDeclaredMethods();
        kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(declaredMethods.length);
        for (java.lang.reflect.Method method : declaredMethods) {
            java.lang.Object objInvoke = method.invoke(annotation, null);
            kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
            p101l7.e eVarE = p101l7.e.e(method.getName());
            java.lang.Class<?> cls = objInvoke.getClass();
            java.util.List list = T6.AbstractC0926d.f9849a;
            if (java.lang.Enum.class.isAssignableFrom(cls)) {
                pVar = new T6.t(eVarE, (java.lang.Enum) objInvoke);
            } else if (objInvoke instanceof java.lang.annotation.Annotation) {
                pVar = new T6.g(eVarE, (java.lang.annotation.Annotation) objInvoke);
            } else if (objInvoke instanceof java.lang.Object[]) {
                pVar = new T6.h(eVarE, (java.lang.Object[]) objInvoke);
            } else {
                pVar = objInvoke instanceof java.lang.Class ? new T6.p(eVarE, (java.lang.Class) objInvoke) : new T6.v(eVarE, objInvoke);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof T6.C0927e) {
            return this.f9853a == ((T6.C0927e) obj).f9853a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.f9853a);
    }

    public final java.lang.String toString() {
        return T6.C0927e.class.getName() + ": " + this.f9853a;
    }
}
