package p085j5;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p085j5.M f24023a = new p085j5.M();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f24024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final S7.Z f24025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f24026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static p085j5.K f24027e;

    static {
        java.util.concurrent.ExecutorService executor = java.util.concurrent.Executors.newSingleThreadExecutor(new p085j5.L(0));
        f24024b = executor;
        kotlin.jvm.internal.m.d(executor, "executor");
        f24025c = new S7.Z(executor);
        f24026d = new java.lang.Object();
    }

    public static boolean a(p085j5.K candidate) {
        boolean z6;
        kotlin.jvm.internal.m.e(candidate, "candidate");
        synchronized (f24026d) {
            z6 = f24027e == candidate;
        }
        return z6;
    }
}
