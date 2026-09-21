package p110m7;

/* JADX INFO: renamed from: m7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2641n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p110m7.AbstractC2639l f25497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f25498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p110m7.o f25499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p110m7.C2640m f25500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f25501e;

    public C2641n(p110m7.AbstractC2639l abstractC2639l, java.lang.Object obj, p110m7.o oVar, p110m7.C2640m c2640m, java.lang.Class cls) {
        if (abstractC2639l == null) {
            throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c2640m.f25496i == p110m7.M.f25455m && oVar == null) {
            throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f25497a = abstractC2639l;
        this.f25498b = obj;
        this.f25499c = oVar;
        this.f25500d = c2640m;
        if (!p110m7.p.class.isAssignableFrom(cls)) {
            this.f25501e = null;
            return;
        }
        try {
            this.f25501e = cls.getMethod("valueOf", java.lang.Integer.TYPE);
        } catch (java.lang.NoSuchMethodException e6) {
            java.lang.String name = cls.getName();
            throw new java.lang.RuntimeException(B2.a.o(new java.lang.StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e6);
        }
    }

    public final java.lang.Object a(java.lang.Object obj) {
        if (this.f25500d.f25496i.f25458h != p110m7.N.ENUM) {
            return obj;
        }
        try {
            return this.f25501e.invoke(null, (java.lang.Integer) obj);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (java.lang.reflect.InvocationTargetException e9) {
            java.lang.Throwable cause = e9.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        return this.f25500d.f25496i.f25458h == p110m7.N.ENUM ? java.lang.Integer.valueOf(((p110m7.p) obj).a()) : obj;
    }
}
