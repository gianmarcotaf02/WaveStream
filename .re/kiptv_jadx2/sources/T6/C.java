package T6;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

public final class C extends s implements p027c7.b {

    public final TypeVariable f9835a;

    public C(TypeVariable typeVariable) {
        kotlin.jvm.internal.m.e(typeVariable, "typeVariable");
        this.f9835a = typeVariable;
    }

    @Override
    public final C0927e a(p101l7.c fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        TypeVariable typeVariable = this.f9835a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C2.a.u(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            return kotlin.jvm.internal.m.a(this.f9835a, ((C) obj).f9835a);
        }
        return false;
    }

    @Override
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f9835a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? p078i6.w.f23205h : C2.a.v(declaredAnnotations);
    }

    public final int hashCode() {
        return this.f9835a.hashCode();
    }

    public final String toString() {
        return C.class.getName() + ": " + this.f9835a;
    }
}
