package com.google.android.gms.internal.cast;

import B3.C0089b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C {
    public static final C0089b j = new C0089b("ConnectivityMonitor", null);

    public final InterfaceExecutorServiceC1774n2 f18747a;

    public final ConnectivityManager f18749c;

    public boolean f18752f;
    public final Context g;

    public final Object f18753h = new Object();

    public final Set f18754i = Collections.synchronizedSet(new HashSet());

    public final Map f18750d = Collections.synchronizedMap(new HashMap());

    public final List f18751e = Collections.synchronizedList(new ArrayList());

    public final B f18748b = new B(this);

    public C(Context context, InterfaceExecutorServiceC1774n2 interfaceExecutorServiceC1774n2) {
        this.f18747a = interfaceExecutorServiceC1774n2;
        this.g = context;
        this.f18749c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.f18753h) {
            try {
                if (this.f18750d != null && this.f18751e != null) {
                    j.b("a new network is available", new Object[0]);
                    if (this.f18750d.containsKey(network)) {
                        this.f18751e.remove(network);
                    }
                    this.f18750d.put(network, linkProperties);
                    this.f18751e.add(network);
                    b();
                }
            } catch (Throwable th) {
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
                Iterator it = this.f18754i.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    if (!((C1778o2) this.f18747a).f19017h.isShutdown()) {
                        ((C1778o2) this.f18747a).execute(new RunnableC1802v(1, this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
