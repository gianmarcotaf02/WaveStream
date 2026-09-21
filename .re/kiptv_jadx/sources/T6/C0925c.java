package T6;

/* JADX INFO: renamed from: T6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0925c implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final T6.C0925c f9845i = new T6.C0925c(0);
    public static final T6.C0925c j = new T6.C0925c(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final T6.C0925c f9846k = new T6.C0925c(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final T6.C0925c f9847l = new T6.C0925c(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9848h;

    public /* synthetic */ C0925c(int i3) {
        this.f9848h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f9848h) {
            case 0:
                java.lang.reflect.ParameterizedType it = (java.lang.reflect.ParameterizedType) obj;
                java.util.List list = T6.AbstractC0926d.f9849a;
                kotlin.jvm.internal.m.e(it, "it");
                java.lang.reflect.Type ownerType = it.getOwnerType();
                if (ownerType instanceof java.lang.reflect.ParameterizedType) {
                    return (java.lang.reflect.ParameterizedType) ownerType;
                }
                return null;
            case 1:
                java.lang.reflect.ParameterizedType it2 = (java.lang.reflect.ParameterizedType) obj;
                java.util.List list2 = T6.AbstractC0926d.f9849a;
                kotlin.jvm.internal.m.e(it2, "it");
                java.lang.reflect.Type[] actualTypeArguments = it2.getActualTypeArguments();
                kotlin.jvm.internal.m.d(actualTypeArguments, "getActualTypeArguments(...)");
                return p078i6.m.T(actualTypeArguments);
            case 2:
                return java.lang.Boolean.valueOf(((java.lang.Class) obj).getSimpleName().length() == 0);
            default:
                java.lang.String simpleName = ((java.lang.Class) obj).getSimpleName();
                if (!p101l7.e.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return p101l7.e.e(simpleName);
                }
                return null;
        }
    }
}
