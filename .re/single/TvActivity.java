package com.kiptv.tv;

import A.a;
import C5.AbstractC0113h;
import E5.C0310q0;
import O5.e;
import R0.C0842p0;
import S7.C;
import S7.w0;
import V7.n0;
import Y1.v;
import Y1.z;
import Z5.b;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.X;
import androidx.lifecycle.g0;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.AbstractC1903s;
import com.kiptv.core.model.LocalDeviceSettings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p005a5.C1245c8;
import p005a5.C1291h4;
import p005a5.C1296i;
import p005a5.C1326l;
import p005a5.C1366p;
import p005a5.C1379q2;
import p005a5.EnumC1224a7;
import p005a5.H;
import p005a5.I5;
import p005a5.M1;
import p006a6.c;
import p015b5.D;
import p015b5.t;
import p015b5.u;
import p019c.k;
import p046f.g;
import p077i5.AbstractC2235b;
import p077i5.C2236c;
import p077i5.P;
import p077i5.x;
import p079i7.f;
import p085j5.O;
import p116n5.A;
import p116n5.C2655a;
import p116n5.h;
import p116n5.p;
import p116n5.q;
import p116n5.y;
import p125o5.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0010²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/kiptv/tv/TvActivity;", "Lc/k;", "<init>", "()V", "Companion", "n5/p", "", "themeColorId", "backgroundStyle", "language", "La5/n;", "authState", "", "hasOnboarded", "LC5/S;", "floatingSession", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TvActivity extends k implements b {
    private static final p Companion = new p();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f21002Z = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public a f21003B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile X5.b f21004C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Object f21005D = new Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f21006E = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final v f21007F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public AlertDialog f21008G;
    public final g H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f21009I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public C1296i f21010J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public d f21011K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public D f21012L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C1291h4 f21013M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C1379q2 f21014N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public I5 f21015O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public H f21016P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public t f21017Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public M1 f21018R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C1366p f21019S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public C1245c8 f21020T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public O5.g f21021U;
    public e V;
    public Long W;
    public w0 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f21022Y;

    public TvActivity() {
        j(new h(this));
        this.f21007F = new v(3, this);
        this.H = l(new z(2), new io.sentry.protocol.a(6));
    }

    public static final void m(final TvActivity tvActivity) {
        if (tvActivity.isFinishing()) {
            return;
        }
        AlertDialog alertDialog = tvActivity.f21008G;
        if (alertDialog == null || !alertDialog.isShowing()) {
            AlertDialog alertDialogCreate = new AlertDialog.Builder(tvActivity).setTitle(u.a("common.returnToHomeTitle")).setNegativeButton(u.a("common.cancel"), (DialogInterface.OnClickListener) null).setPositiveButton(u.a("common.confirm"), new com.revenuecat.purchases.utils.a(3, tvActivity)).create();
            alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: n5.o
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f25811h.f21008G = null;
                }
            });
            tvActivity.f21008G = alertDialogCreate;
            alertDialogCreate.show();
        }
    }

    @Override // Z5.b
    public final Object b() {
        return n().b();
    }

    @Override // p019c.k, androidx.lifecycle.InterfaceC1528j
    public final g0 c() {
        g0 g0VarC = super.c();
        C2655a c2655a = (C2655a) ((W5.a) E8.d.O(this, W5.a.class));
        c cVarA = c2655a.a();
        f fVar = new f(c2655a.f25691a, c2655a.f25692b, 3);
        g0VarC.getClass();
        return new W5.f(cVarA, g0VarC, fVar);
    }

    public final X5.b n() {
        if (this.f21004C == null) {
            synchronized (this.f21005D) {
                try {
                    if (this.f21004C == null) {
                        this.f21004C = new X5.b(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f21004C;
    }

    public final C1379q2 o() {
        C1379q2 c1379q2 = this.f21014N;
        if (c1379q2 != null) {
            return c1379q2;
        }
        m.k("purchaseRepository");
        throw null;
    }

    @Override // p019c.k, androidx.core.app.AbstractActivityC1484d, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i3 = 1;
        p(bundle);
        a().a(this, this.f21007F);
        O5.g gVar = this.f21021U;
        if (gVar == null) {
            m.k("sideloadUpdateManager");
            throw null;
        }
        gVar.a();
        e eVar = this.V;
        if (eVar == null) {
            m.k("playUpdateManager");
            throw null;
        }
        eVar.d();
        C.A(X.f(this), null, new q(this, null), 3);
        p089k0.e eVar2 = new p089k0.e(965934585, new y(this, i3), true);
        ViewGroup.LayoutParams layoutParams = p029d.e.f21086a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        C0842p0 c0842p0 = childAt instanceof C0842p0 ? (C0842p0) childAt : null;
        if (c0842p0 != null) {
            c0842p0.setParentCompositionContext(null);
            c0842p0.setContent(eVar2);
            return;
        }
        C0842p0 c0842p1 = new C0842p0(this);
        c0842p1.setParentCompositionContext(null);
        c0842p1.setContent(eVar2);
        View decorView = getWindow().getDecorView();
        if (X.d(decorView) == null) {
            X.i(decorView, this);
        }
        if (X.e(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (AbstractC1903s.v(decorView) == null) {
            AbstractC1903s.H(decorView, this);
        }
        setContentView(c0842p1, p029d.e.f21086a);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f21003B;
        if (aVar != null) {
            aVar.f9i = null;
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        C1245c8 c1245c8 = this.f21020T;
        if (c1245c8 == null) {
            m.k("traktSyncRepository");
            throw null;
        }
        c1245c8.y(EnumC1224a7.j);
        O5.g gVar = this.f21021U;
        if (gVar == null) {
            m.k("sideloadUpdateManager");
            throw null;
        }
        gVar.a();
        e eVar = this.V;
        if (eVar == null) {
            m.k("playUpdateManager");
            throw null;
        }
        eVar.f7956b.getClass();
        eVar.d();
        if (o().d()) {
            ArrayList<P> arrayListA = AbstractC2235b.a();
            if (!arrayListA.isEmpty()) {
                Log.i("PlaybackSessionRegistry", "foreground — resuming " + arrayListA.size() + " session(s)");
            }
            for (P p2 : arrayListA) {
                Long l2 = p2.f22993B0;
                if (l2 != null) {
                    p2.f22993B0 = null;
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - l2.longValue();
                    C2236c c2236c = p2.f23035b;
                    if (!c2236c.f23089e || c2236c.f23096n || jElapsedRealtime <= 30000) {
                        Log.i("VideoPlayerCoordinator", "Foreground after " + (jElapsedRealtime / ((long) 1000)) + "s — resuming playback");
                        p2.v();
                    } else {
                        Log.i("VideoPlayerCoordinator", "Foreground after " + (jElapsedRealtime / ((long) 1000)) + "s — reconnecting live stream");
                        C.A(p2.f23070t0, null, new x(p2, null), 3);
                    }
                } else if (p2.f22995C0) {
                    p2.v();
                }
            }
        } else {
            Iterator it = AbstractC2235b.a().iterator();
            while (it.hasNext()) {
                ((P) it.next()).f22993B0 = null;
            }
            AbstractC0113h.b();
        }
        Long l9 = this.W;
        if (l9 != null) {
            long jLongValue = l9.longValue();
            this.W = null;
            if (SystemClock.elapsedRealtime() - jLongValue < 30000) {
                return;
            }
            C1296i c1296i = this.f21010J;
            if (c1296i == null) {
                m.k("authRepository");
                throw null;
            }
            if (c1296i.f14591b.getValue() instanceof C1326l) {
                w0 w0Var = this.X;
                if (w0Var == null || !w0Var.isActive()) {
                    this.X = C.A(X.f(this), null, new A(this, null), 3);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        O o8;
        C1291h4 c1291h4 = this.f21013M;
        if (c1291h4 == null) {
            m.k("settingsRepository");
            throw null;
        }
        if (!((LocalDeviceSettings) ((n0) c1291h4.f14557k.f10419h).getValue()).f19841u) {
            ArrayList<P> arrayListA = AbstractC2235b.a();
            if (!arrayListA.isEmpty()) {
                Log.i("PlaybackSessionRegistry", "background — suspending " + arrayListA.size() + " session(s)");
            }
            for (P p2 : arrayListA) {
                if (p2.f22993B0 == null && (p2.q() || (p2.f23065r.getValue() instanceof p099l5.e))) {
                    p2.f22993B0 = Long.valueOf(SystemClock.elapsedRealtime());
                    if (!((Boolean) p2.f23024S.getValue()).booleanValue() && (o8 = p2.f23036b0) != null) {
                        o8.pause();
                    }
                }
            }
        }
        this.W = Long.valueOf(SystemClock.elapsedRealtime());
        C0310q0 c0310q0 = C0310q0.f3129a;
        C0310q0.a();
        super.onStop();
    }

    public final void p(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            X5.b bVar = (X5.b) n().f10870k;
            a aVar = ((X5.d) X5.b.c(bVar.j, (k) bVar.f10870k).a(AbstractC1833d1.A(X5.d.class))).f10873c;
            this.f21003B = aVar;
            if (((p040e2.d) aVar.f9i) == null) {
                aVar.f9i = d();
            }
        }
    }
}
