package p191x3;

import B3.A;
import B3.C0089b;
import B3.p;
import E2.d;
import F3.B;
import F3.C0366f;
import F3.C0368h;
import F3.C0369i;
import F3.C0371k;
import F3.F;
import H3.q;
import O3.a;
import android.content.Context;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.m;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.AbstractC1731d;
import com.google.android.gms.internal.cast.AbstractC1818z;
import com.google.android.gms.internal.cast.BinderC1783q;
import com.google.android.gms.internal.cast.C1739f;
import com.google.android.gms.internal.cast.C1817y2;
import j1.l;
import java.lang.reflect.Field;
import java.util.HashSet;
import p008a8.c;
import p184w3.C;
import p184w3.C2969d;
import p184w3.e;
import p184w3.x;
import p199y3.f;
import p199y3.g;
import p206z3.i;

public final class C3102c extends f {

    public static final C0089b f31183m = new C0089b("CastSession", null);

    public final Context f31184c;

    public final HashSet f31185d;

    public final o f31186e;

    public final C3101b f31187f;
    public final BinderC1783q g;

    public final i f31188h;

    public C f31189i;
    public g j;

    public CastDevice f31190k;

    public C1817y2 f31191l;

    public C3102c(Context context, String str, String str2, C3101b c3101b, BinderC1783q binderC1783q, i iVar) {
        super(context, str, str2);
        this.f31185d = new HashSet();
        this.f31184c = context.getApplicationContext();
        this.f31187f = c3101b;
        this.g = binderC1783q;
        this.f31188h = iVar;
        a aVarC = c();
        x xVar = new x(this);
        C0089b c0089b = AbstractC1731d.f18886a;
        o oVarF0 = null;
        if (aVarC != null) {
            try {
                oVarF0 = AbstractC1731d.b(context).f0(c3101b, aVarC, xVar);
            } catch (RemoteException | C3103d e6) {
                AbstractC1731d.f18886a.a(e6, "Unable to call %s on %s.", "newCastSessionImpl", C1739f.class.getSimpleName());
            }
        }
        this.f31186e = oVarF0;
    }

    public static void d(C3102c c3102c, int i3) {
        i iVar = c3102c.f31188h;
        if (iVar.f32383q) {
            iVar.f32383q = false;
            g gVar = iVar.f32380n;
            if (gVar != null) {
                q.d();
                B b9 = iVar.f32379m;
                if (b9 != null) {
                    gVar.f31869i.remove(b9);
                }
            }
            iVar.f32371c.d0(null);
            d dVar = iVar.f32375h;
            if (dVar != null) {
                dVar.B();
                dVar.f2774l = null;
            }
            d dVar2 = iVar.f32376i;
            if (dVar2 != null) {
                dVar2.B();
                dVar2.f2774l = null;
            }
            android.support.v4.media.session.q qVar = iVar.f32382p;
            if (qVar != null) {
                qVar.L(null, null);
                iVar.f32382p.M(new MediaMetadataCompat(new Bundle()));
                iVar.k(0, null);
            }
            android.support.v4.media.session.q qVar2 = iVar.f32382p;
            if (qVar2 != null) {
                qVar2.J(false);
                m mVar = (m) iVar.f32382p.f15617i;
                mVar.f15609e.kill();
                int i9 = Build.VERSION.SDK_INT;
                MediaSession mediaSession = mVar.f15605a;
                if (i9 == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception e6) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e6);
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
        C c9 = c3102c.f31189i;
        if (c9 != null) {
            c9.i();
            c3102c.f31189i = null;
        }
        c3102c.f31190k = null;
        g gVar2 = c3102c.j;
        if (gVar2 != null) {
            gVar2.s(null);
            c3102c.j = null;
        }
    }

    public static void e(C3102c c3102c, String str, A0.a aVar) {
        C0089b c0089b = f31183m;
        if (c3102c.f31186e == null) {
            return;
        }
        try {
            boolean zH = aVar.h();
            o oVar = c3102c.f31186e;
            if (!zH) {
                Exception excE = aVar.e();
                if (!(excE instanceof E3.d)) {
                    m mVar = (m) oVar;
                    Parcel parcelY = mVar.Y();
                    parcelY.writeInt(2476);
                    mVar.a0(parcelY, 5);
                    return;
                }
                int i3 = ((E3.d) excE).f2825h.f18690h;
                m mVar2 = (m) oVar;
                Parcel parcelY2 = mVar2.Y();
                parcelY2.writeInt(i3);
                mVar2.a0(parcelY2, 5);
                return;
            }
            A a2 = (A) aVar.f();
            if (!a2.f587h.a()) {
                Status status = a2.f587h;
                c0089b.b("%s() -> failure result", str);
                int i9 = status.f18690h;
                m mVar3 = (m) oVar;
                Parcel parcelY3 = mVar3.Y();
                parcelY3.writeInt(i9);
                mVar3.a0(parcelY3, 5);
                return;
            }
            c0089b.b("%s() -> success result", str);
            g gVar = new g(new p());
            c3102c.j = gVar;
            gVar.s(c3102c.f31189i);
            g gVar2 = c3102c.j;
            B b9 = new B(0, c3102c);
            gVar2.getClass();
            q.d();
            gVar2.f31869i.add(b9);
            c3102c.j.r();
            i iVar = c3102c.f31188h;
            g gVar3 = c3102c.j;
            q.d();
            iVar.a(gVar3, c3102c.f31190k);
            C2969d c2969d = a2.f588i;
            q.g(c2969d);
            String str2 = a2.j;
            String str3 = a2.f589k;
            q.g(str3);
            boolean z6 = a2.f590l;
            m mVar4 = (m) oVar;
            Parcel parcelY4 = mVar4.Y();
            AbstractC1818z.c(parcelY4, c2969d);
            parcelY4.writeString(str2);
            parcelY4.writeString(str3);
            parcelY4.writeInt(z6 ? 1 : 0);
            mVar4.a0(parcelY4, 4);
        } catch (RemoteException e6) {
            c0089b.a(e6, "Unable to call %s on %s.", "methods", o.class.getSimpleName());
        }
    }

    public final void f(Bundle bundle) {
        CastDevice castDeviceA = CastDevice.a(bundle);
        this.f31190k = castDeviceA;
        boolean z6 = true;
        boolean z9 = false;
        if (castDeviceA == null) {
            q.d();
            v vVar = this.f31194a;
            if (vVar != null) {
                try {
                    t tVar = (t) vVar;
                    Parcel parcelZ = tVar.Z(tVar.Y(), 9);
                    int i3 = AbstractC1818z.f19179a;
                    if (parcelZ.readInt() == 0) {
                        z6 = false;
                    }
                    parcelZ.recycle();
                    z9 = z6;
                } catch (RemoteException e6) {
                    f.f31193b.a(e6, "Unable to call %s on %s.", "isResuming", v.class.getSimpleName());
                }
            }
            if (z9) {
                v vVar2 = this.f31194a;
                if (vVar2 == null) {
                    return;
                }
                try {
                    t tVar2 = (t) vVar2;
                    Parcel parcelY = tVar2.Y();
                    parcelY.writeInt(2153);
                    tVar2.a0(parcelY, 15);
                    return;
                } catch (RemoteException e9) {
                    f.f31193b.a(e9, "Unable to call %s on %s.", "notifyFailedToResumeSession", v.class.getSimpleName());
                    return;
                }
            }
            v vVar3 = this.f31194a;
            if (vVar3 == null) {
                return;
            }
            try {
                t tVar3 = (t) vVar3;
                Parcel parcelY2 = tVar3.Y();
                parcelY2.writeInt(2151);
                tVar3.a0(parcelY2, 12);
                return;
            } catch (RemoteException e10) {
                f.f31193b.a(e10, "Unable to call %s on %s.", "notifyFailedToStartSession", v.class.getSimpleName());
                return;
            }
        }
        C c9 = this.f31189i;
        if (c9 != null) {
            c9.i();
            this.f31189i = null;
        }
        f31183m.b("Acquiring a connection to Google Play Services for %s", this.f31190k);
        CastDevice castDevice = this.f31190k;
        q.g(castDevice);
        Bundle bundle2 = new Bundle();
        C3101b c3101b = this.f31187f;
        p199y3.a aVar = c3101b == null ? null : c3101b.f31172m;
        f fVar = aVar != null ? aVar.f31802k : null;
        boolean z10 = aVar != null && aVar.f31803l;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", fVar != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z10);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", this.g.f19025i);
        l lVar = new l(castDevice, new D(this));
        lVar.f23900k = bundle2;
        e eVar = new e(lVar);
        Context context = this.f31184c;
        int i9 = p184w3.g.f29850a;
        C c10 = new C(context, eVar);
        c10.f29798E.add(new E(this));
        this.f31189i = c10;
        C0369i c0369iB = c10.b(c10.f29800k);
        C0371k c0371k = new C0371k();
        c cVar = new c(26, c10);
        q2.i iVar = new q2.i(12);
        c10.f29799F = 2;
        c0371k.f3603d = c0369iB;
        c0371k.f3601b = cVar;
        c0371k.f3602c = iVar;
        c0371k.f3604e = new D3.d[]{x.f29944a};
        c0371k.f3600a = 8428;
        C0368h c0368h = ((C0369i) c0371k.f3603d).f3599a;
        q.h(c0368h, "Key must not be null");
        C0369i c0369i = (C0369i) c0371k.f3603d;
        D3.d[] dVarArr = (D3.d[]) c0371k.f3604e;
        int i10 = c0371k.f3600a;
        android.support.v4.media.session.q qVar = new android.support.v4.media.session.q(c0371k, c0369i, dVarArr, i10);
        A.a aVar2 = new A.a(c0371k, c0368h);
        q.h(c0369i.f3599a, "Listener has already been released.");
        C0366f c0366f = c10.j;
        c0366f.getClass();
        p059g4.d dVar = new p059g4.d();
        c0366f.f(dVar, i10, c10);
        F3.A a2 = new F3.A(new F(new B(qVar, aVar2), dVar), c0366f.f3591p.get(), c10);
        Z3.d dVar2 = c0366f.f3596u;
        dVar2.sendMessage(dVar2.obtainMessage(8, a2));
    }
}
