package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends T6.s implements p027c7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.TypeVariable f9835a;

    public C(java.lang.reflect.TypeVariable typeVariable) {
        kotlin.jvm.internal.m.e(typeVariable, "typeVariable");
        this.f9835a = typeVariable;
    }

    @Override // p027c7.b
    public final T6.C0927e a(p101l7.c fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.lang.reflect.TypeVariable typeVariable = this.f9835a;
        java.lang.reflect.AnnotatedElement annotatedElement = typeVariable instanceof java.lang.reflect.AnnotatedElement ? (java.lang.reflect.AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C2.a.u(declaredAnnotations, fqName);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof T6.C) {
            return kotlin.jvm.internal.m.a(this.f9835a, ((T6.C) obj).f9835a);
        }
        return false;
    }

    @Override // p027c7.b
    public final java.util.Collection getAnnotations() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.lang.reflect.TypeVariable typeVariable = this.f9835a;
        java.lang.reflect.AnnotatedElement annotatedElement = typeVariable instanceof java.lang.reflect.AnnotatedElement ? (java.lang.reflect.AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? p078i6.w.f23205h : C2.a.v(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f9835a.hashCode();
    }

    public final java.lang.String toString() {
        return T6.C.class.getName() + ": " + this.f9835a;
    }
}
