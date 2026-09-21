package K;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J5.t2 f6637a = new J5.t2(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final K.a f6638b = new K.a(0);

    public static final void a(L.a aVar, android.content.Context context, final boolean z6, final java.lang.String str, final long j) {
        L.a aVar2 = aVar;
        if (p011b1.L.c(j) || str.length() == 0) {
            return;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        final android.content.Context context2 = context;
        java.util.List list = (java.util.List) f6637a.invoke(context2);
        if (list.isEmpty()) {
            return;
        }
        M.f fVar = M.f.f7117b;
        aVar2.f7037a.a(fVar);
        int size = list.size();
        int i3 = 0;
        while (true) {
            p136q.D d4 = aVar2.f7037a;
            if (i3 >= size) {
                d4.a(fVar);
                return;
            }
            final android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) list.get(i3);
            d4.a(new M.d(new M.a(i3), resolveInfo.loadLabel(packageManager).toString(), 0, new p194x6.j() { // from class: K.c
                @Override // p194x6.j
                public final java.lang.Object invoke(java.lang.Object obj) {
                    K.a aVar3 = K.b.f6638b;
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z6);
                    p011b1.L l2 = new p011b1.L(j);
                    aVar3.invoke(context2, resolveInfo, boolValueOf, str, l2);
                    ((M.g) obj).close();
                    return p070h6.A.f22523a;
                }
            }));
            i3++;
            aVar2 = aVar;
            context2 = context;
        }
    }
}
