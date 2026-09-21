package I6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A implements I6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f5499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f5500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Class f5501c;

    public A(java.lang.reflect.Method method, java.util.List list) {
        this.f5499a = method;
        this.f5500b = list;
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.m.d(returnType, "getReturnType(...)");
        this.f5501c = returnType;
    }

    @Override // I6.g
    public final java.util.List a() {
        return this.f5500b;
    }

    @Override // I6.g
    public final /* bridge */ /* synthetic */ java.lang.reflect.Member b() {
        return null;
    }

    @Override // I6.g
    public final boolean c() {
        return false;
    }

    @Override // I6.g
    public final java.lang.reflect.Type getReturnType() {
        return this.f5501c;
    }
}
