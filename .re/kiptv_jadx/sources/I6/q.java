package I6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends I6.x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5537e;

    /* JADX WARN: Illegal instructions before constructor call */
    public q(java.lang.reflect.Field field, boolean z6, boolean z9) {
        java.lang.Class TYPE = java.lang.Void.TYPE;
        kotlin.jvm.internal.m.d(TYPE, "TYPE");
        super(field, TYPE, z9 ? field.getDeclaringClass() : null, new java.lang.reflect.Type[]{field.getGenericType()});
        this.f5537e = z6;
    }

    @Override // I6.g
    public java.lang.Object call(java.lang.Object[] args) throws java.lang.IllegalAccessException {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        ((java.lang.reflect.Field) this.f5543a).set(this.f5545c != null ? p078i6.m.m0(args) : null, p078i6.m.w0(args));
        return p070h6.A.f22523a;
    }

    @Override // I6.x
    public void d(java.lang.Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        p199y3.e.k(this, args);
        if (this.f5537e && p078i6.m.w0(args) == null) {
            throw new java.lang.IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }
}
