package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class C {
    public static final B3.C0089b j = new B3.C0089b("ConnectivityMonitor", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.InterfaceExecutorServiceC1774n2 f18747a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.net.ConnectivityManager f18749c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18752f;
    public final android.content.Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f18753h = new java.lang.Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Set f18754i = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f18750d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f18751e = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.B f18748b = new com.google.android.gms.internal.cast.B(this);

    public C(android.content.Context context, com.google.android.gms.internal.cast.InterfaceExecutorServiceC1774n2 interfaceExecutorServiceC1774n2) {
        this.f18747a = interfaceExecutorServiceC1774n2;
        this.g = context;
        this.f18749c = (android.net.ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(android.net.Network network, android.net.LinkProperties linkProperties) {
        synchronized (this.f18753h) {
            try {
                if (this.f18750d != null && this.f18751e != null) {
                    j.b("a new network is available", new java.lang.Object[0]);
                    if (this.f18750d.containsKey(network)) {
                        this.f18751e.remove(network);
                    }
                    this.f18750d.put(network, linkProperties);
                    this.f18751e.add(network);
                    b();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.f18747a == null) {
            return;
        }
        synchronized (this.f18754i) {
            try {
                java.util.Iterator it = this.f18754i.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new java.lang.ClassCastException();
                    }
                    if (!((com.google.android.gms.internal.cast.C1778o2) this.f18747a).f19017h.isShutdown()) {
                        ((com.google.android.gms.internal.cast.C1778o2) this.f18747a).execute(new com.google.android.gms.internal.cast.RunnableC1802v(1, this));
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
