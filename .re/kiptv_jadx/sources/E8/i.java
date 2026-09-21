package E8;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f3307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f3309c;

    public i(java.util.ArrayList arrayList) {
        this.f3307a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        kotlin.jvm.internal.m.e(proxy, "proxy");
        kotlin.jvm.internal.m.e(method, "method");
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        java.lang.String name = method.getName();
        java.lang.Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.m.a(name, "supports") && kotlin.jvm.internal.m.a(java.lang.Boolean.TYPE, returnType)) {
            return java.lang.Boolean.TRUE;
        }
        if (kotlin.jvm.internal.m.a(name, "unsupported") && kotlin.jvm.internal.m.a(java.lang.Void.TYPE, returnType)) {
            this.f3308b = true;
            return null;
        }
        boolean zA = kotlin.jvm.internal.m.a(name, "protocols");
        java.util.ArrayList arrayList = this.f3307a;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.m.a(name, "selectProtocol") || kotlin.jvm.internal.m.a(name, "select")) && java.lang.String.class.equals(returnType) && objArr.length == 1) {
            java.lang.Object obj = objArr[0];
            if (obj instanceof java.util.List) {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                java.util.List list = (java.util.List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        java.lang.Object obj2 = list.get(i3);
                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        java.lang.String str = (java.lang.String) obj2;
                        if (arrayList.contains(str)) {
                            this.f3309c = str;
                            return str;
                        }
                        if (i3 != size) {
                            i3++;
                        }
                    }
                }
                java.lang.String str2 = (java.lang.String) arrayList.get(0);
                this.f3309c = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.m.a(name, "protocolSelected") && !kotlin.jvm.internal.m.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, java.util.Arrays.copyOf(objArr, objArr.length));
        }
        java.lang.Object obj3 = objArr[0];
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.String");
        this.f3309c = (java.lang.String) obj3;
        return null;
    }
}
