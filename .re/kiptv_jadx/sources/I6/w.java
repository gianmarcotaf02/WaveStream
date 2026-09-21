package I6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends I6.x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5542e;

    public /* synthetic */ w(java.lang.reflect.Method method, boolean z6, int i3) {
        this(method, (i3 & 2) != 0 ? !java.lang.reflect.Modifier.isStatic(method.getModifiers()) : z6, method.getGenericParameterTypes());
    }

    public final java.lang.Object f(java.lang.Object[] args, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(args, "args");
        return this.f5542e ? p070h6.A.f22523a : ((java.lang.reflect.Method) this.f5543a).invoke(obj, java.util.Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(java.lang.reflect.Method method, boolean z6, java.lang.reflect.Type[] typeArr) {
        java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
        kotlin.jvm.internal.m.d(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z6 ? method.getDeclaringClass() : null, typeArr);
        this.f5542e = genericReturnType.equals(java.lang.Void.TYPE);
    }
}
