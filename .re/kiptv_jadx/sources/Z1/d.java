package Z1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z1.c f12635a = Z1.c.f12634a;

    public static Z1.c a(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        while (abstractComponentCallbacksC1029n != null) {
            if (abstractComponentCallbacksC1029n.f11331z != null && abstractComponentCallbacksC1029n.f11324r) {
                abstractComponentCallbacksC1029n.n();
            }
            abstractComponentCallbacksC1029n = abstractComponentCallbacksC1029n.f11296B;
        }
        return f12635a;
    }

    public static void b(Z1.a aVar) {
        if (Y1.D.G(3)) {
            android.util.Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f12630h.getClass().getName()), aVar);
        }
    }

    public static final void c(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n, java.lang.String previousFragmentId) {
        kotlin.jvm.internal.m.e(previousFragmentId, "previousFragmentId");
        b(new Z1.a(abstractComponentCallbacksC1029n, "Attempting to reuse fragment " + abstractComponentCallbacksC1029n + " with previous ID " + previousFragmentId));
        a(abstractComponentCallbacksC1029n).getClass();
    }
}
