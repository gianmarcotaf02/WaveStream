package I6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m extends I6.x {
    /* JADX WARN: Illegal instructions before constructor call */
    public m(java.lang.reflect.Field field, boolean z6) {
        java.lang.reflect.Type genericType = field.getGenericType();
        kotlin.jvm.internal.m.d(genericType, "getGenericType(...)");
        super(field, genericType, z6 ? field.getDeclaringClass() : null, new java.lang.reflect.Type[0]);
    }

    @Override // I6.g
    public java.lang.Object call(java.lang.Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        return ((java.lang.reflect.Field) this.f5543a).get(this.f5545c != null ? p078i6.m.m0(args) : null);
    }
}
