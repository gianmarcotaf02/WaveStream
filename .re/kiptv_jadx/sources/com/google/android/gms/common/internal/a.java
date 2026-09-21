package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements E3.c {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final D3.d[] f18707F = new D3.d[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public D3.b f18708A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f18709B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile H3.y f18710C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f18711D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.util.Set f18712E;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f18713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public H3.D f18714i;
    public final android.content.Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.os.Looper f18715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H3.C f18716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final H3.t f18717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.Object f18718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Object f18719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public H3.p f18720p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public H3.InterfaceC0373b f18721q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public android.os.IInterface f18722r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f18723s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public H3.v f18724t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18725u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final H3.g f18726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final H3.g f18727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f18728x;
    public final java.lang.String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile java.lang.String f18729z;

    public a(android.content.Context context, android.os.Looper looper, int i3, p179v4.o oVar, E3.g gVar, E3.h hVar) {
        synchronized (H3.C.g) {
            try {
                if (H3.C.f3932h == null) {
                    H3.C.f3932h = new H3.C(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        H3.C c9 = H3.C.f3932h;
        java.lang.Object obj = D3.e.f2105c;
        H3.q.g(gVar);
        H3.q.g(hVar);
        H3.g gVar2 = new H3.g(gVar);
        H3.g gVar3 = new H3.g(hVar);
        java.lang.String str = (java.lang.String) oVar.f29182l;
        this.f18713h = null;
        this.f18718n = new java.lang.Object();
        this.f18719o = new java.lang.Object();
        this.f18723s = new java.util.ArrayList();
        this.f18725u = 1;
        this.f18708A = null;
        this.f18709B = false;
        this.f18710C = null;
        this.f18711D = new java.util.concurrent.atomic.AtomicInteger(0);
        H3.q.h(context, "Context must not be null");
        this.j = context;
        H3.q.h(looper, "Looper must not be null");
        this.f18715k = looper;
        H3.q.h(c9, "Supervisor must not be null");
        this.f18716l = c9;
        this.f18717m = new H3.t(this, looper);
        this.f18728x = i3;
        this.f18726v = gVar2;
        this.f18727w = gVar3;
        this.y = str;
        java.util.Set set = (java.util.Set) oVar.f29181k;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((com.google.android.gms.common.api.Scope) it.next())) {
                throw new java.lang.IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f18712E = set;
    }

    @Override // E3.c
    public final java.util.Set a() {
        return k() ? this.f18712E : java.util.Collections.EMPTY_SET;
    }

    @Override // E3.c
    public final void b(java.lang.String str) {
        this.f18713h = str;
        disconnect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E3.c
    public final void c(H3.InterfaceC0376e interfaceC0376e, java.util.Set set) {
        android.os.Bundle bundleO = o();
        java.lang.String str = android.os.Build.VERSION.SDK_INT < 31 ? this.f18729z : this.f18729z;
        int i3 = this.f18728x;
        int i9 = D3.f.f2107a;
        com.google.android.gms.common.api.Scope[] scopeArr = H3.C0375d.f3949v;
        android.os.Bundle bundle = new android.os.Bundle();
        D3.d[] dVarArr = H3.C0375d.f3950w;
        H3.C0375d c0375d = new H3.C0375d(6, i3, i9, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0375d.f3953k = this.j.getPackageName();
        c0375d.f3956n = bundleO;
        if (set != null) {
            c0375d.f3955m = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[0]);
        }
        if (k()) {
            c0375d.f3957o = new android.accounts.Account("<<default account>>", "com.google");
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
                    H3.p pVar = this.f18720p;
                    if (pVar != null) {
                        pVar.m(new H3.u(this, this.f18711D.get()), c0375d);
                    } else {
                        android.util.Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (android.os.DeadObjectException e6) {
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            int i10 = this.f18711D.get();
            H3.t tVar = this.f18717m;
            tVar.sendMessage(tVar.obtainMessage(6, i10, 3));
        } catch (android.os.RemoteException e9) {
            e = e9;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.f18711D.get());
        } catch (java.lang.SecurityException e10) {
            throw e10;
        } catch (java.lang.RuntimeException e11) {
            e = e11;
            android.util.Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            u(8, null, null, this.f18711D.get());
        }
    }

    @Override // E3.c
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

    @Override // E3.c
    public void disconnect() {
        this.f18711D.incrementAndGet();
        java.util.ArrayList arrayList = this.f18723s;
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
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        synchronized (this.f18719o) {
            this.f18720p = null;
        }
        x(1, null);
    }

    @Override // E3.c
    public final void e() {
        if (!isConnected() || this.f18714i == null) {
            throw new java.lang.RuntimeException("Failed to connect when checking package");
        }
    }

    @Override // E3.c
    public final void f(p166t3.i iVar) {
        ((F3.s) iVar.f27782i).f3631o.f3596u.post(new B3.r(2, iVar));
    }

    @Override // E3.c
    public final void g(H3.InterfaceC0373b interfaceC0373b) {
        this.f18721q = interfaceC0373b;
        x(2, null);
    }

    @Override // E3.c
    public final D3.d[] i() {
        H3.y yVar = this.f18710C;
        if (yVar == null) {
            return null;
        }
        return yVar.f4012i;
    }

    @Override // E3.c
    public final boolean isConnected() {
        boolean z6;
        synchronized (this.f18718n) {
            z6 = this.f18725u == 4;
        }
        return z6;
    }

    @Override // E3.c
    public final java.lang.String j() {
        return this.f18713h;
    }

    @Override // E3.c
    public boolean k() {
        return false;
    }

    public abstract android.os.IInterface l(android.os.IBinder iBinder);

    public D3.d[] m() {
        return f18707F;
    }

    public android.os.Bundle n() {
        return null;
    }

    public android.os.Bundle o() {
        return new android.os.Bundle();
    }

    public final android.os.IInterface p() {
        android.os.IInterface iInterface;
        synchronized (this.f18718n) {
            try {
                if (this.f18725u == 5) {
                    throw new android.os.DeadObjectException();
                }
                if (!isConnected()) {
                    throw new java.lang.IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f18722r;
                H3.q.h(iInterface, "Client is connected but service is null");
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract java.lang.String q();

    public abstract java.lang.String r();

    public boolean s() {
        return h() >= 211700000;
    }

    public void t(D3.b bVar) {
        bVar.getClass();
        java.lang.System.currentTimeMillis();
    }

    public void u(int i3, android.os.IBinder iBinder, android.os.Bundle bundle, int i9) {
        H3.w wVar = new H3.w(this, i3, iBinder, bundle);
        H3.t tVar = this.f18717m;
        tVar.sendMessage(tVar.obtainMessage(1, i9, -1, wVar));
    }

    public boolean v() {
        return this instanceof p178v3.a;
    }

    public final /* synthetic */ boolean w(int i3, int i9, android.os.IInterface iInterface) {
        synchronized (this.f18718n) {
            try {
                if (this.f18725u != i3) {
                    return false;
                }
                x(i9, iInterface);
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void x(int i3, android.os.IInterface iInterface) {
        H3.D d4;
        H3.q.b((i3 == 4) == (iInterface != null));
        synchronized (this.f18718n) {
            try {
                this.f18725u = i3;
                this.f18722r = iInterface;
                android.os.Bundle bundle = null;
                if (i3 == 1) {
                    H3.v vVar = this.f18724t;
                    if (vVar != null) {
                        H3.C c9 = this.f18716l;
                        java.lang.String str = this.f18714i.f3941b;
                        H3.q.g(str);
                        this.f18714i.getClass();
                        if (this.y == null) {
                            this.j.getClass();
                        }
                        c9.b(str, vVar, this.f18714i.f3942c);
                        this.f18724t = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    H3.v vVar2 = this.f18724t;
                    if (vVar2 != null && (d4 = this.f18714i) != null) {
                        java.lang.String str2 = d4.f3941b;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        android.util.Log.e("GmsClient", sb.toString());
                        H3.C c10 = this.f18716l;
                        java.lang.String str3 = this.f18714i.f3941b;
                        H3.q.g(str3);
                        this.f18714i.getClass();
                        if (this.y == null) {
                            this.j.getClass();
                        }
                        c10.b(str3, vVar2, this.f18714i.f3942c);
                        this.f18711D.incrementAndGet();
                    }
                    H3.v vVar3 = new H3.v(this, this.f18711D.get());
                    this.f18724t = vVar3;
                    java.lang.String strR = r();
                    boolean zS = s();
                    this.f18714i = new H3.D(0, strR, zS);
                    if (zS && h() < 17895000) {
                        throw new java.lang.IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(java.lang.String.valueOf(this.f18714i.f3941b)));
                    }
                    H3.C c11 = this.f18716l;
                    java.lang.String str4 = this.f18714i.f3941b;
                    H3.q.g(str4);
                    this.f18714i.getClass();
                    java.lang.String name = this.y;
                    if (name == null) {
                        name = this.j.getClass().getName();
                    }
                    D3.b bVarA = c11.a(new H3.z(str4, this.f18714i.f3942c), vVar3, name);
                    if (!(bVarA.f2097i == 0)) {
                        java.lang.String str5 = this.f18714i.f3941b;
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        android.util.Log.w("GmsClient", sb2.toString());
                        int i9 = bVarA.f2097i;
                        if (i9 == -1) {
                            i9 = 16;
                        }
                        if (bVarA.j != null) {
                            bundle = new android.os.Bundle();
                            bundle.putParcelable("pendingIntent", bVarA.j);
                        }
                        int i10 = this.f18711D.get();
                        H3.x xVar = new H3.x(this, i9, bundle);
                        H3.t tVar = this.f18717m;
                        tVar.sendMessage(tVar.obtainMessage(7, i10, -1, xVar));
                    }
                } else if (i3 == 4) {
                    H3.q.g(iInterface);
                    java.lang.System.currentTimeMillis();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
