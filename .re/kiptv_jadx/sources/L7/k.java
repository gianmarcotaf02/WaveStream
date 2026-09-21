package L7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.i f7104a = new L7.i();

    public static final void a(java.util.AbstractCollection abstractCollection, java.lang.Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final java.util.List d(java.util.ArrayList arrayList) {
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return p078i6.w.f23205h;
        }
        if (size == 1) {
            return com.google.common.util.concurrent.P.i0(p078i6.o.h1(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static java.lang.Object e(java.util.List list, L7.b bVar, L7.k kVar) {
        A.a aVar = new A.a(14);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f(it.next(), bVar, aVar, kVar);
        }
        return kVar.i();
    }

    public static void f(java.lang.Object obj, L7.b bVar, A.a aVar, L7.k kVar) {
        if (obj != null) {
            if (((java.util.HashSet) aVar.f9i).add(obj) && kVar.c(obj)) {
                java.util.Iterator it = bVar.a(obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), bVar, aVar, kVar);
                }
                kVar.b(obj);
                return;
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = io.sentry.protocol.SentryThread.JsonKeys.CURRENT;
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static java.lang.Boolean g(java.util.List list, L7.b bVar, p194x6.j jVar) {
        return (java.lang.Boolean) e(list, bVar, new L7.a(jVar, new boolean[1], 0));
    }

    public static final boolean h(java.lang.Throwable th) {
        java.lang.Class<?> superclass = th.getClass();
        while (!kotlin.jvm.internal.m.a(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static void j(java.lang.Object obj) throws java.lang.Throwable {
        if (obj instanceof L7.j) {
            throw ((L7.j) obj).f7103a;
        }
    }

    public abstract boolean c(java.lang.Object obj);

    public abstract java.lang.Object i();

    public void b(java.lang.Object obj) {
    }
}
