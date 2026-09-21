package p057g2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p057g2.c f21858a = new p057g2.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f21859b = new java.util.LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashSet f21860c = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f21861d;

    public static void a(java.lang.AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                com.google.android.gms.internal.play_billing.M0.v(autoCloseable);
            } catch (java.lang.Exception e6) {
                throw new java.lang.RuntimeException(e6);
            }
        }
    }
}
