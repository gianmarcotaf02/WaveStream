package com.google.android.gms.common.internal;

import B3.r;
import D3.b;
import D3.d;
import D3.e;
import D3.f;
import E3.c;
import E3.h;
import F3.s;
import H3.C;
import H3.C0375d;
import H3.D;
import H3.InterfaceC0373b;
import H3.InterfaceC0376e;
import H3.g;
import H3.p;
import H3.q;
import H3.t;
import H3.u;
import H3.v;
import H3.w;
import H3.x;
import H3.y;
import H3.z;
import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p166t3.i;
import p179v4.o;

public abstract class a implements c {

    public static final d[] f18707F = new d[0];

    public b f18708A;

    public boolean f18709B;

    public volatile y f18710C;

    public final AtomicInteger f18711D;

    public final Set f18712E;

    public volatile String f18713h;

    public D f18714i;
    public final Context j;

    public final Looper f18715k;

    public final C f18716l;

    public final t f18717m;

    public final Object f18718n;

    public final Object f18719o;

    public p f18720p;

    public InterfaceC0373b f18721q;

    public IInterface f18722r;

    public final ArrayList f18723s;

    public v f18724t;

    public int f18725u;

    public final g f18726v;

    public final g f18727w;

    public final int f18728x;
    public final String y;

    public volatile String f18729z;

    public a(Context context, Looper looper, int i3, o oVar, E3.g gVar, h hVar) {
        synchronized (C.g) {
            try {
                if (C.f3932h == null) {
                    C.f3932h = new C(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C c9 = C.f3932h;
        Object obj = e.f2105c;
        q.g(gVar);
        q.g(hVar);
        g gVar2 = new g(gVar);
        g gVar3 = new g(hVar);
        String str = (String) oVar.f29182l;
        this.f18713h = null;
        this.f18718n = new Object();
        this.f18719o = new Object();
        this.f18723s = new ArrayList();
        this.f18725u = 1;
        this.f18708A = null;
        this.f18709B = false;
        this.f18710C = null;
        this.f18711D = new AtomicInteger(0);
        q.h(context, "Context must not be null");
        this.j = context;
        q.h(looper, "Looper must not be null");
        this.f18715k = looper;
        q.h(c9, "Supervisor must not be null");
        this.f18716l = c9;
        this.f18717m = new t(this, looper);
        this.f18728x = i3;
        this.f18726v = gVar2;
        this.f18727w = gVar3;
        this.y = str;
        Set set = (Set) oVar.f29181k;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f18712E = set;
    }

    @Override
    public final Set a() {
        return k() ? this.f18712E : Collections.EMPTY_SET;
    }

    @Override
    public final void b(String str) {
        this.f18713h = str;
        disconnect();
    }

    @Override
    public final void c(InterfaceC0376e interfaceC0376e, Set set) {
        Bundle bundleO = o();
        String str = Build.VERSION.SDK_INT < 31 ? this.f18729z : this.f18729z;
        int i3 = this.f18728x;
        int i9 = f.f2107a;
        Scope[] scopeArr = C0375d.f3949v;
        Bundle bundle = new Bundle();
        d[] dVarArr = C0375d.f3950w;
        C0375d c0375d = new C0375d(6, i3, i9, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0375d.f3953k = this.j.getPackageName();
        c0375d.f3956n = bundleO;
        if (set != null) {
            c0375d.f3955m = (Scope[]) set.toArray(new Scope[0]);
        }
        if (k()) {
            c0375d.f3957o = new Account("<<default account>>", "com.google");
            if (interfaceC0376e != 0) {
                c0375d.f3954l = ((X3.a) interfaceC0376e).f10839d;
            }
        }
        c0375d.f3958p = f18707F;
        c0375d.f3959q = m();
        if (v()) {
            c0375d.f3962t = true;
        }
        try {
            synchronized (this.f18719o) {
                try {
                    p pVar = this.f18720p;
                    if (pVar != null) {
                        pVar.m(new u(this, this.f18711D.get()), c0375d);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            int i10 = this.f18711D.get();
            t tVar = this.f18717m;
            tVar.sendMessage(tVar.obtainMessage(6, i10, 3));
        } catch (RemoteException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.f18711D.get());
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.f18711D.get());
        }
    }

    @Override
    public final boolean d() {
        boolean z6;
        synchronized (this.f18718n) {
            int i3 = this.f18725u;
            z6 = true;
            if (i3 != 2 && i3 != 3) {
                z6 = false;
            }
        }
        return z6;
    }

    @Override
    public void disconnect() {
        this.f18711D.incrementAndGet();
        ArrayList arrayList = this.f18723s;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    H3.o oVar = (H3.o) arrayList.get(i3);
                    synchronized (oVar) {
                        oVar.f3993a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f18719o) {
            this.f18720p = null;
        }
        x(1, null);
    }

    @Override
    public final void e() {
        if (!isConnected() || this.f18714i == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    @Override
    public final void f(i iVar) {
        ((s) iVar.f27782i).f3631o.f3596u.post(new r(2, iVar));
    }

    @Override
    public final void g(InterfaceC0373b interfaceC0373b) {
        this.f18721q = interfaceC0373b;
        x(2, null);
    }

    @Override
    public final d[] i() {
        y yVar = this.f18710C;
        if (yVar == null) {
            return null;
        }
        return yVar.f4012i;
    }

    @Override
    public final boolean isConnected() {
        boolean z6;
        synchronized (this.f18718n) {
            z6 = this.f18725u == 4;
        }
        return z6;
    }

    @Override
    public final String j() {
        return this.f18713h;
    }

    @Override
    public boolean k() {
        return false;
    }

    public abstract IInterface l(IBinder iBinder);

    public d[] m() {
        return f18707F;
    }

    public Bundle n() {
        return null;
    }

    public Bundle o() {
        return new Bundle();
    }

    public final IInterface p() {
        IInterface iInterface;
        synchronized (this.f18718n) {
            try {
                if (this.f18725u == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f18722r;
                q.h(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String q();

    public abstract String r();

    public boolean s() {
        return h() >= 211700000;
    }

    public void t(b bVar) {
        bVar.getClass();
        System.currentTimeMillis();
    }

    public void u(int i3, IBinder iBinder, Bundle bundle, int i9) {
        w wVar = new w(this, i3, iBinder, bundle);
        t tVar = this.f18717m;
        tVar.sendMessage(tVar.obtainMessage(1, i9, -1, wVar));
    }

    public boolean v() {
        return this instanceof p178v3.a;
    }

    public final boolean w(int i3, int i9, IInterface iInterface) {
        synchronized (this.f18718n) {
            try {
                if (this.f18725u != i3) {
                    return false;
                }
                x(i9, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(int i3, IInterface iInterface) {
        D d4;
        q.b((i3 == 4) == (iInterface != null));
        synchronized (this.f18718n) {
            try {
                this.f18725u = i3;
                this.f18722r = iInterface;
                Bundle bundle = null;
                if (i3 == 1) {
                    v vVar = this.f18724t;
                    if (vVar != null) {
                        C c9 = this.f18716l;
                        String str = this.f18714i.f3941b;
                        q.g(str);
                        this.f18714i.getClass();
                        if (this.y == null) {
                            this.j.getClass();
                        }
                        c9.b(str, vVar, this.f18714i.f3942c);
                        this.f18724t = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    v vVar2 = this.f18724t;
                    if (vVar2 != null && (d4 = this.f18714i) != null) {
                        String str2 = d4.f3941b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        C c10 = this.f18716l;
                        String str3 = this.f18714i.f3941b;
                        q.g(str3);
                        this.f18714i.getClass();
                        if (this.y == null) {
                            this.j.getClass();
                        }
                        c10.b(str3, vVar2, this.f18714i.f3942c);
                        this.f18711D.incrementAndGet();
                    }
                    v vVar3 = new v(this, this.f18711D.get());
                    this.f18724t = vVar3;
                    String strR = r();
                    boolean zS = s();
                    this.f18714i = new D(0, strR, zS);
                    if (zS && h() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f18714i.f3941b)));
                    }
                    C c11 = this.f18716l;
                    String str4 = this.f18714i.f3941b;
                    q.g(str4);
                    this.f18714i.getClass();
                    String name = this.y;
                    if (name == null) {
                        name = this.j.getClass().getName();
                    }
                    b bVarA = c11.a(new z(str4, this.f18714i.f3942c), vVar3, name);
                    if (!(bVarA.f2097i == 0)) {
                        String str5 = this.f18714i.f3941b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i9 = bVarA.f2097i;
                        if (i9 == -1) {
                            i9 = 16;
                        }
                        if (bVarA.j != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", bVarA.j);
                        }
                        int i10 = this.f18711D.get();
                        x xVar = new x(this, i9, bundle);
                        t tVar = this.f18717m;
                        tVar.sendMessage(tVar.obtainMessage(7, i10, -1, xVar));
                    }
                } else if (i3 == 4) {
                    q.g(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
