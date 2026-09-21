package T6;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

public final class h extends f implements p027c7.a {

    public final Object[] f9856b;

    public h(p101l7.e eVar, Object[] objArr) {
        super(eVar);
        this.f9856b = objArr;
    }

    public final ArrayList a() {
        p027c7.a pVar;
        Object[] objArr = this.f9856b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            kotlin.jvm.internal.m.b(obj);
            Class<?> cls = obj.getClass();
            List list = AbstractC0926d.f9849a;
            if (Enum.class.isAssignableFrom(cls)) {
                pVar = new t(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                pVar = new g(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                pVar = new h(null, (Object[]) obj);
            } else {
                pVar = obj instanceof Class ? new p(null, (Class) obj) : new v(null, obj);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }
}
