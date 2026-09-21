package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends T6.f implements p027c7.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f9856b;

    public h(p101l7.e eVar, java.lang.Object[] objArr) {
        super(eVar);
        this.f9856b = objArr;
    }

    public final java.util.ArrayList a() {
        p027c7.a pVar;
        java.lang.Object[] objArr = this.f9856b;
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            kotlin.jvm.internal.m.b(obj);
            java.lang.Class<?> cls = obj.getClass();
            java.util.List list = T6.AbstractC0926d.f9849a;
            if (java.lang.Enum.class.isAssignableFrom(cls)) {
                pVar = new T6.t(null, (java.lang.Enum) obj);
            } else if (obj instanceof java.lang.annotation.Annotation) {
                pVar = new T6.g(null, (java.lang.annotation.Annotation) obj);
            } else if (obj instanceof java.lang.Object[]) {
                pVar = new T6.h(null, (java.lang.Object[]) obj);
            } else {
                pVar = obj instanceof java.lang.Class ? new T6.p(null, (java.lang.Class) obj) : new T6.v(null, obj);
            }
            arrayList.add(pVar);
        }
        return arrayList;
    }
}
