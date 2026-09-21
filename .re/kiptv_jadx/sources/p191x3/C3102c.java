package p191x3;

/* JADX INFO: renamed from: x3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3102c extends p191x3.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final B3.C0089b f31183m = new B3.C0089b("CastSession", null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.Context f31184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f31185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p191x3.o f31186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p191x3.C3101b f31187f;
    public final com.google.android.gms.internal.cast.BinderC1783q g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p206z3.i f31188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p184w3.C f31189i;
    public p199y3.g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.google.android.gms.cast.CastDevice f31190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.google.android.gms.internal.cast.C1817y2 f31191l;

    public C3102c(android.content.Context context, java.lang.String str, java.lang.String str2, p191x3.C3101b c3101b, com.google.android.gms.internal.cast.BinderC1783q binderC1783q, p206z3.i iVar) {
        super(context, str, str2);
        this.f31185d = new java.util.HashSet();
        this.f31184c = context.getApplicationContext();
        this.f31187f = c3101b;
        this.g = binderC1783q;
        this.f31188h = iVar;
        O3.a aVarC = c();
        p191x3.x xVar = new p191x3.x(this);
        B3.C0089b c0089b = com.google.android.gms.internal.cast.AbstractC1731d.f18886a;
        p191x3.o oVarF0 = null;
        if (aVarC != null) {
            try {
                oVarF0 = com.google.android.gms.internal.cast.AbstractC1731d.b(context).f0(c3101b, aVarC, xVar);
            } catch (android.os.RemoteException | p191x3.C3103d e6) {
                com.google.android.gms.internal.cast.AbstractC1731d.f18886a.a(e6, "Unable to call %s on %s.", "newCastSessionImpl", com.google.android.gms.internal.cast.C1739f.class.getSimpleName());
            }
        }
        this.f31186e = oVarF0;
    }

    public static void d(p191x3.C3102c c3102c, int i3) {
        p206z3.i iVar = c3102c.f31188h;
        if (iVar.f32383q) {
            iVar.f32383q = false;
            p199y3.g gVar = iVar.f32380n;
            if (gVar != null) {
                H3.q.d();
                p191x3.B b9 = iVar.f32379m;
                if (b9 != null) {
                    gVar.f31869i.remove(b9);
                }
            }
            iVar.f32371c.d0(null);
            E2.d dVar = iVar.f32375h;
            if (dVar != null) {
                dVar.B();
                dVar.f2774l = null;
            }
            E2.d dVar2 = iVar.f32376i;
            if (dVar2 != null) {
                dVar2.B();
                dVar2.f2774l = null;
            }
            android.support.v4.media.session.q qVar = iVar.f32382p;
            if (qVar != null) {
                qVar.L(null, null);
                iVar.f32382p.M(new android.support.v4.media.MediaMetadataCompat(new android.os.Bundle()));
                iVar.k(0, null);
            }
            android.support.v4.media.session.q qVar2 = iVar.f32382p;
            if (qVar2 != null) {
                qVar2.J(false);
                android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) iVar.f32382p.f15617i;
                mVar.f15609e.kill();
                int i9 = android.os.Build.VERSION.SDK_INT;
                android.media.session.MediaSession mediaSession = mVar.f15605a;
                if (i9 == 27) {
                    try {
                        java.lang.reflect.Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        android.os.Handler handler = (android.os.Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (java.lang.Exception e6) {
                        android.util.Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e6);
                    }
                }
                mediaSession.setCallback(null);
                mVar.f15606b.f15604c.set(null);
                mediaSession.release();
                iVar.f32382p = null;
            }
            iVar.f32380n = null;
            iVar.f32381o = null;
            iVar.i();
            if (i3 == 0) {
                iVar.j();
            }
        }
        p184w3.C c9 = c3102c.f31189i;
        if (c9 != null) {
            c9.i();
            c3102c.f31189i = null;
        }
        c3102c.f31190k = null;
        p199y3.g gVar2 = c3102c.j;
        if (gVar2 != null) {
            gVar2.s(null);
            c3102c.j = null;
        }
    }

    public static void e(p191x3.C3102c c3102c, java.lang.String str, A0.a aVar) {
        B3.C0089b c0089b = f31183m;
        if (c3102c.f31186e == null) {
            return;
        }
        try {
            boolean zH = aVar.h();
            p191x3.o oVar = c3102c.f31186e;
            if (!zH) {
                java.lang.Exception excE = aVar.e();
                if (!(excE instanceof E3.d)) {
                    p191x3.m mVar = (p191x3.m) oVar;
                    android.os.Parcel parcelY = mVar.Y();
                    parcelY.writeInt(2476);
                    mVar.a0(parcelY, 5);
                    return;
                }
                int i3 = ((E3.d) excE).f2825h.f18690h;
                p191x3.m mVar2 = (p191x3.m) oVar;
                android.os.Parcel parcelY2 = mVar2.Y();
                parcelY2.writeInt(i3);
                mVar2.a0(parcelY2, 5);
                return;
            }
            B3.A a2 = (B3.A) aVar.f();
            if (!a2.f587h.a()) {
                com.google.android.gms.common.api.Status status = a2.f587h;
                c0089b.b("%s() -> failure result", str);
                int i9 = status.f18690h;
                p191x3.m mVar3 = (p191x3.m) oVar;
                android.os.Parcel parcelY3 = mVar3.Y();
                parcelY3.writeInt(i9);
                mVar3.a0(parcelY3, 5);
                return;
            }
            c0089b.b("%s() -> success result", str);
            p199y3.g gVar = new p199y3.g(new B3.p());
            c3102c.j = gVar;
            gVar.s(c3102c.f31189i);
            p199y3.g gVar2 = c3102c.j;
            p191x3.B b9 = new p191x3.B(0, c3102c);
            gVar2.getClass();
            H3.q.d();
            gVar2.f31869i.add(b9);
            c3102c.j.r();
            p206z3.i iVar = c3102c.f31188h;
            p199y3.g gVar3 = c3102c.j;
            H3.q.d();
            iVar.a(gVar3, c3102c.f31190k);
            p184w3.C2969d c2969d = a2.f588i;
            H3.q.g(c2969d);
            java.lang.String str2 = a2.j;
            java.lang.String str3 = a2.f589k;
            H3.q.g(str3);
            boolean z6 = a2.f590l;
            p191x3.m mVar4 = (p191x3.m) oVar;
            android.os.Parcel parcelY4 = mVar4.Y();
            com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY4, c2969d);
            parcelY4.writeString(str2);
            parcelY4.writeString(str3);
            parcelY4.writeInt(z6 ? 1 : 0);
            mVar4.a0(parcelY4, 4);
        } catch (android.os.RemoteException e6) {
            c0089b.a(e6, "Unable to call %s on %s.", "methods", p191x3.o.class.getSimpleName());
        }
    }

    public final void f(android.os.Bundle bundle) {
        com.google.android.gms.cast.CastDevice castDeviceA = com.google.android.gms.cast.CastDevice.a(bundle);
        this.f31190k = castDeviceA;
        boolean z6 = true;
        boolean z9 = false;
        if (castDeviceA == null) {
            H3.q.d();
            p191x3.v vVar = this.f31194a;
            if (vVar != null) {
                try {
                    p191x3.t tVar = (p191x3.t) vVar;
                    android.os.Parcel parcelZ = tVar.Z(tVar.Y(), 9);
                    int i3 = com.google.android.gms.internal.cast.AbstractC1818z.f19179a;
                    if (parcelZ.readInt() == 0) {
                        z6 = false;
                    }
                    parcelZ.recycle();
                    z9 = z6;
                } catch (android.os.RemoteException e6) {
                    p191x3.f.f31193b.a(e6, "Unable to call %s on %s.", "isResuming", p191x3.v.class.getSimpleName());
                }
            }
            if (z9) {
                p191x3.v vVar2 = this.f31194a;
                if (vVar2 == null) {
                    return;
                }
                try {
                    p191x3.t tVar2 = (p191x3.t) vVar2;
                    android.os.Parcel parcelY = tVar2.Y();
                    parcelY.writeInt(2153);
                    tVar2.a0(parcelY, 15);
                    return;
                } catch (android.os.RemoteException e9) {
                    p191x3.f.f31193b.a(e9, "Unable to call %s on %s.", "notifyFailedToResumeSession", p191x3.v.class.getSimpleName());
                    return;
                }
            }
            p191x3.v vVar3 = this.f31194a;
            if (vVar3 == null) {
                return;
            }
            try {
                p191x3.t tVar3 = (p191x3.t) vVar3;
                android.os.Parcel parcelY2 = tVar3.Y();
                parcelY2.writeInt(2151);
                tVar3.a0(parcelY2, 12);
                return;
            } catch (android.os.RemoteException e10) {
                p191x3.f.f31193b.a(e10, "Unable to call %s on %s.", "notifyFailedToStartSession", p191x3.v.class.getSimpleName());
                return;
            }
        }
        p184w3.C c9 = this.f31189i;
        if (c9 != null) {
            c9.i();
            this.f31189i = null;
        }
        f31183m.b("Acquiring a connection to Google Play Services for %s", this.f31190k);
        com.google.android.gms.cast.CastDevice castDevice = this.f31190k;
        H3.q.g(castDevice);
        android.os.Bundle bundle2 = new android.os.Bundle();
        p191x3.C3101b c3101b = this.f31187f;
        p199y3.a aVar = c3101b == null ? null : c3101b.f31172m;
        p199y3.f fVar = aVar != null ? aVar.f31802k : null;
        boolean z10 = aVar != null && aVar.f31803l;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z10);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.f19025i);
        j1.l lVar = new j1.l(castDevice, new p191x3.D(this));
        lVar.f23900k = bundle2;
        p184w3.e eVar = new p184w3.e(lVar);
        android.content.Context context = this.f31184c;
        int i9 = p184w3.g.f29850a;
        p184w3.C c10 = new p184w3.C(context, eVar);
        c10.f29798E.add(new p191x3.E(this));
        this.f31189i = c10;
        F3.C0369i c0369iB = c10.b(c10.f29800k);
        F3.C0371k c0371k = new F3.C0371k();
        p008a8.c cVar = new p008a8.c(26, c10);
        q2.i iVar = new q2.i(12);
        c10.f29799F = 2;
        c0371k.f3603d = c0369iB;
        c0371k.f3601b = cVar;
        c0371k.f3602c = iVar;
        c0371k.f3604e = new D3.d[]{p184w3.x.f29944a};
        c0371k.f3600a = 8428;
        F3.C0368h c0368h = ((F3.C0369i) c0371k.f3603d).f3599a;
        H3.q.h(c0368h, "Key must not be null");
        F3.C0369i c0369i = (F3.C0369i) c0371k.f3603d;
        D3.d[] dVarArr = (D3.d[]) c0371k.f3604e;
        int i10 = c0371k.f3600a;
        android.support.v4.media.session.q qVar = new android.support.v4.media.session.q(c0371k, c0369i, dVarArr, i10);
        A.a aVar2 = new A.a(c0371k, c0368h);
        H3.q.h(c0369i.f3599a, "Listener has already been released.");
        F3.C0366f c0366f = c10.j;
        c0366f.getClass();
        p059g4.d dVar = new p059g4.d();
        c0366f.f(dVar, i10, c10);
        F3.A a2 = new F3.A(new F3.F(new F3.B(qVar, aVar2), dVar), c0366f.f3591p.get(), c10);
        Z3.d dVar2 = c0366f.f3596u;
        dVar2.sendMessage(dVar2.obtainMessage(8, a2));
    }
}
