package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements kotlin.jvm.functions.Function0 {
    public static final H6.w0 j = new H6.w0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f4502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile java.lang.ref.SoftReference f4503i;

    public v0(N6.InterfaceC0689c interfaceC0689c, kotlin.jvm.functions.Function0 function0) {
        if (function0 == null) {
            throw new java.lang.IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f4503i = null;
        this.f4502h = function0;
        if (interfaceC0689c != null) {
            this.f4503i = new java.lang.ref.SoftReference(interfaceC0689c);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        java.lang.Object obj;
        java.lang.ref.SoftReference softReference = this.f4503i;
        java.lang.Object obj2 = j;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        java.lang.Object objInvoke = this.f4502h.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f4503i = new java.lang.ref.SoftReference(obj2);
        return objInvoke;
    }
}
