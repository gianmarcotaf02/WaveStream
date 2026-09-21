package I6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x implements I6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Member f5543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Type f5544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Class f5545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f5546d;

    public x(java.lang.reflect.Member member, java.lang.reflect.Type type, java.lang.Class cls, java.lang.reflect.Type[] typeArr) {
        java.util.List listE0;
        this.f5543a = member;
        this.f5544b = type;
        this.f5545c = cls;
        if (cls != null) {
            D0.C0206g c0206g = new D0.C0206g(2);
            c0206g.a(cls);
            c0206g.b(typeArr);
            java.util.ArrayList arrayList = c0206g.f1884a;
            listE0 = p078i6.p.B0(arrayList.toArray(new java.lang.reflect.Type[arrayList.size()]));
        } else {
            listE0 = p078i6.m.E0(typeArr);
        }
        this.f5546d = listE0;
    }

    @Override // I6.g
    public final java.util.List a() {
        return this.f5546d;
    }

    @Override // I6.g
    public final java.lang.reflect.Member b() {
        return this.f5543a;
    }

    @Override // I6.g
    public final boolean c() {
        return false;
    }

    public void d(java.lang.Object[] objArr) {
        p199y3.e.k(this, objArr);
    }

    public final void e(java.lang.Object obj) {
        if (obj == null || !this.f5543a.getDeclaringClass().isInstance(obj)) {
            throw new java.lang.IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // I6.g
    public final java.lang.reflect.Type getReturnType() {
        return this.f5544b;
    }
}
