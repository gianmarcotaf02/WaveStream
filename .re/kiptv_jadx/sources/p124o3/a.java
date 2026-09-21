package p124o3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.util.SparseArray f26109a = new android.util.SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f26110b;

    static {
        java.util.HashMap map = new java.util.HashMap();
        f26110b = map;
        map.put(p013b3.c.f17869h, 0);
        map.put(p013b3.c.f17870i, 1);
        map.put(p013b3.c.j, 2);
        for (p013b3.c cVar : map.keySet()) {
            f26109a.append(((java.lang.Integer) f26110b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(p013b3.c cVar) {
        java.lang.Integer num = (java.lang.Integer) f26110b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new java.lang.IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static p013b3.c b(int i3) {
        p013b3.c cVar = (p013b3.c) f26109a.get(i3);
        if (cVar != null) {
            return cVar;
        }
        throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "Unknown Priority for value "));
    }
}
