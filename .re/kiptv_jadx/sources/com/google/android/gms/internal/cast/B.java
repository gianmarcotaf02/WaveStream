package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class B extends android.net.ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.cast.C f18745a;

    public B(com.google.android.gms.internal.cast.C c9) {
        this.f18745a = c9;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
        this.f18745a.a(network, linkProperties);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        com.google.android.gms.internal.cast.C c9 = this.f18745a;
        synchronized (c9.f18753h) {
            try {
                if (c9.f18750d != null && c9.f18751e != null) {
                    com.google.android.gms.internal.cast.C.j.b("the network is lost", new java.lang.Object[0]);
                    if (c9.f18751e.remove(network)) {
                        c9.f18750d.remove(network);
                    }
                    c9.b();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        com.google.android.gms.internal.cast.C c9 = this.f18745a;
        synchronized (c9.f18753h) {
            if (c9.f18750d != null && c9.f18751e != null) {
                com.google.android.gms.internal.cast.C.j.b("all networks are unavailable.", new java.lang.Object[0]);
                c9.f18750d.clear();
                c9.f18751e.clear();
                c9.b();
            }
        }
    }
}
