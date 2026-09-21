package T6;

import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class C0927e extends s {

    public final Annotation f9853a;

    public C0927e(Annotation annotation) {
        kotlin.jvm.internal.m.e(annotation, "annotation");
        this.f9853a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, InvocationTargetException {
        p027c7.a pVar;
        Annotation annotation = this.f9853a;
        Method[] declaredMethods = AbstractC1833d1.x(AbstractC1833d1.u(annotation)).getDeclaredMethods();
        kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
            p101l7.e eVarE = p101l7.e.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC0926d.f9849a;
            if (Enum.class.isAssignableFrom(cls)) {
                pVar = new t(eVarE, (Enum) objInvoke);
            } else if (objInvoke instanceof Annotation) {
                pVar = new g(eVarE, (Annotation) objInvoke);
            } else if (objInvoke instanceof Object[]) {
                pVar = new h(eVarE, (Object[]) objInvoke);
            } else {
                pVar = objInvoke instanceof Class ? new p(eVarE, (Class) objInvoke) : new v(eVarE, objInvoke);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0927e) {
            return this.f9853a == ((C0927e) obj).f9853a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9853a);
    }

    public final String toString() {
        return C0927e.class.getName() + ": " + this.f9853a;
    }
}
