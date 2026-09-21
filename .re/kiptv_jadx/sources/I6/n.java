package I6;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends I6.q implements I6.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f5535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.reflect.Field field, boolean z6, java.lang.Object obj) {
        super(field, z6, false);
        kotlin.jvm.internal.m.e(field, "field");
        this.f5535f = obj;
    }

    @Override // I6.q, I6.g
    public final java.lang.Object call(java.lang.Object[] args) throws java.lang.IllegalAccessException {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        ((java.lang.reflect.Field) this.f5543a).set(this.f5535f, p078i6.m.m0(args));
        return p070h6.A.f22523a;
    }
}
