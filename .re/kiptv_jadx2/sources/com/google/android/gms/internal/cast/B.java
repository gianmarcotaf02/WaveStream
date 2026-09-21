package com.google.android.gms.internal.cast;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;

public final class B extends ConnectivityManager.NetworkCallback {

    public final C f18745a;

    public B(C c9) {
        this.f18745a = c9;
    }

    @Override
    public final void onAvailable(Network network) {
    }

    @Override
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.f18745a.a(network, linkProperties);
    }

    @Override
    public final void onLost(Network network) {
        C c9 = this.f18745a;
        synchronized (c9.f18753h) {
            try {
                if (c9.f18750d != null && c9.f18751e != null) {
                    C.j.b("the network is lost", new Object[0]);
                    if (c9.f18751e.remove(network)) {
                        c9.f18750d.remove(network);
                    }
                    c9.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void onUnavailable() {
        C c9 = this.f18745a;
        synchronized (c9.f18753h) {
            if (c9.f18750d != null && c9.f18751e != null) {
                C.j.b("all networks are unavailable.", new Object[0]);
                c9.f18750d.clear();
                c9.f18751e.clear();
                c9.b();
            }
        }
    }
}
