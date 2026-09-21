package com.google.common.util.concurrent;

import B3.AbstractC0088a;
import B3.C0089b;
import B3.C0090c;
import F3.C0362b;
import F3.C0366f;
import H3.AbstractBinderC0372a;
import H3.InterfaceC0376e;
import S7.C0895k;
import S7.Z;
import Y2.C1033c;
import Y2.C1040j;
import Y2.InterfaceC1048s;
import Y2.InterfaceC1049t;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import android.widget.ProgressBar;
import androidx.core.app.AbstractC1483c;
import androidx.core.app.C1482b;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.C1865p;
import com.google.android.gms.internal.play_billing.C1876v;
import io.sentry.protocol.SentryStackFrame;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p184w3.C2969d;

public final class C implements Runnable {

    public final int f19404h;

    public Object f19405i;
    public final Object j;

    public C(int i3, Object obj, Object obj2, boolean z6) {
        this.f19404h = i3;
        this.j = obj;
        this.f19405i = obj2;
    }

    @Override
    public final void run() throws S7.J {
        Throwable thTryInternalFastPathGetFailure;
        boolean z6;
        boolean z9;
        InterfaceC0376e interfaceC0376e;
        InterfaceC0376e e6;
        Set set;
        boolean z10;
        boolean z11;
        int i3 = 0;
        boolean z12 = true;
        switch (this.f19404h) {
            case 0:
                J j = (J) this.f19405i;
                boolean z13 = j instanceof p115n4.a;
                B b9 = (B) this.j;
                if (z13 && (thTryInternalFastPathGetFailure = ((p115n4.a) j).tryInternalFastPathGetFailure()) != null) {
                    b9.onFailure(thTryInternalFastPathGetFailure);
                    return;
                }
                try {
                    b9.onSuccess(D.u(j));
                    return;
                } catch (ExecutionException e9) {
                    b9.onFailure(e9.getCause());
                    return;
                } catch (Throwable th) {
                    b9.onFailure(th);
                    return;
                }
            case 1:
                Z2.M m8 = (Z2.M) ((p008a8.c) this.f19405i).f15522i;
                if (m8 != null) {
                    m8.R((Typeface) this.j);
                    return;
                }
                return;
            case 2:
                ((A1.g) this.f19405i).accept(this.j);
                return;
            case 3:
                C0089b c0089b = B3.C.f593Z;
                B3.f fVar = (B3.f) this.j;
                C2969d c2969d = fVar.f632k;
                B3.C c9 = (B3.C) this.f19405i;
                boolean zE = AbstractC0088a.e(c2969d, c9.f596G);
                p191x3.D d4 = c9.f597I;
                if (!zE) {
                    c9.f596G = c2969d;
                    d4.c();
                }
                double d6 = fVar.f630h;
                if (Double.isNaN(d6) || Math.abs(d6 - c9.f606R) <= 1.0E-7d) {
                    z6 = false;
                } else {
                    c9.f606R = d6;
                    z6 = true;
                }
                boolean z14 = c9.f603O;
                boolean z15 = fVar.f631i;
                if (z15 != z14) {
                    c9.f603O = z15;
                    z6 = true;
                }
                Double.isNaN(fVar.f635n);
                Object[] objArr = {Boolean.valueOf(z6), Boolean.valueOf(c9.f605Q)};
                C0089b c0089b2 = B3.C.f593Z;
                c0089b2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr);
                if (d4 != null && (z6 || c9.f605Q)) {
                    d4.f();
                }
                int i9 = c9.f608T;
                int i10 = fVar.j;
                if (i10 != i9) {
                    c9.f608T = i10;
                    z9 = true;
                } else {
                    z9 = false;
                }
                c0089b2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z9), Boolean.valueOf(c9.f605Q));
                if (d4 != null && (z9 || c9.f605Q)) {
                    d4.a();
                }
                int i11 = c9.f609U;
                int i12 = fVar.f633l;
                if (i12 != i11) {
                    c9.f609U = i12;
                } else {
                    z12 = false;
                }
                c0089b2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(c9.f605Q));
                if (d4 != null && (z12 || c9.f605Q)) {
                    d4.e();
                }
                p184w3.w wVar = c9.f607S;
                p184w3.w wVar2 = fVar.f634m;
                if (!AbstractC0088a.e(wVar, wVar2)) {
                    c9.f607S = wVar2;
                }
                c9.f605Q = false;
                return;
            case 4:
                C0089b c0089b3 = B3.C.f593Z;
                String str = ((C0090c) this.j).f620h;
                B3.C c10 = (B3.C) this.f19405i;
                if (AbstractC0088a.e(str, c10.f602N)) {
                    z12 = false;
                } else {
                    c10.f602N = str;
                }
                B3.C.f593Z.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(c10.f604P));
                p191x3.D d9 = c10.f597I;
                if (d9 != null && (z12 || c10.f604P)) {
                    d9.d();
                }
                c10.f604P = false;
                return;
            case 5:
                F3.u uVar = (F3.u) this.j;
                F3.s sVar = (F3.s) ((C0366f) uVar.f3639f).f3592q.get((C0362b) uVar.f3636c);
                if (sVar == null) {
                    return;
                }
                D3.b bVar = (D3.b) this.f19405i;
                if ((bVar.f2097i == 0 ? 1 : 0) == 0) {
                    sVar.n(bVar, null);
                    return;
                }
                uVar.f3634a = true;
                E3.c cVar = (E3.c) uVar.f3635b;
                if (cVar.k()) {
                    if (!uVar.f3634a || (interfaceC0376e = (InterfaceC0376e) uVar.f3637d) == null) {
                        return;
                    }
                    cVar.c(interfaceC0376e, (Set) uVar.f3638e);
                    return;
                }
                try {
                    cVar.c(null, cVar.a());
                    return;
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    cVar.b("Failed to get service from broker.");
                    sVar.n(new D3.b(10, null, null), null);
                    return;
                }
            case 6:
                p051f4.e eVar = (p051f4.e) this.f19405i;
                D3.b bVar2 = eVar.f21707i;
                Object[] objArr2 = bVar2.f2097i == 0 ? 1 : 0;
                F3.D d10 = (F3.D) this.j;
                if (objArr2 != 0) {
                    H3.n nVar = eVar.j;
                    H3.q.g(nVar);
                    D3.b bVar3 = nVar.j;
                    if (bVar3.f2097i != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        d10.j.b(bVar3);
                        d10.f3558i.disconnect();
                        return;
                    }
                    F3.u uVar2 = d10.j;
                    IBinder iBinder = nVar.f3990i;
                    if (iBinder == null) {
                        e6 = null;
                    } else {
                        int i13 = AbstractBinderC0372a.f3943d;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        e6 = iInterfaceQueryLocalInterface instanceof InterfaceC0376e ? (InterfaceC0376e) iInterfaceQueryLocalInterface : new H3.E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    uVar2.getClass();
                    if (e6 == null || (set = d10.g) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        uVar2.b(new D3.b(4, null, null));
                    } else {
                        uVar2.f3637d = e6;
                        uVar2.f3638e = set;
                        if (uVar2.f3634a) {
                            ((E3.c) uVar2.f3635b).c(e6, set);
                        }
                    }
                } else {
                    d10.j.b(bVar2);
                }
                d10.f3558i.disconnect();
                return;
            case 7:
                if (((F3.p) this.j).f3613i) {
                    D3.b bVar4 = ((F3.I) this.f19405i).f3568b;
                    if (((bVar4.f2097i == 0 || bVar4.j == null) ? false : true) == true) {
                        F3.p pVar = (F3.p) this.j;
                        ?? r9 = pVar.f3612h;
                        Activity activityA = pVar.a();
                        PendingIntent pendingIntent = bVar4.j;
                        H3.q.g(pendingIntent);
                        int i14 = ((F3.I) this.f19405i).f3567a;
                        int i15 = GoogleApiActivity.f18681i;
                        Intent intent = new Intent(activityA, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i14);
                        intent.putExtra("notify_manager", false);
                        r9.startActivityForResult(intent, 1);
                        return;
                    }
                    F3.p pVar2 = (F3.p) this.j;
                    if (pVar2.f3615l.a(pVar2.a(), bVar4.f2097i, null) != null) {
                        F3.p pVar3 = (F3.p) this.j;
                        pVar3.f3615l.g(pVar3.a(), pVar3.f3612h, bVar4.f2097i, (F3.p) this.j);
                        return;
                    }
                    if (bVar4.f2097i != 18) {
                        F3.p pVar4 = (F3.p) this.j;
                        int i16 = ((F3.I) this.f19405i).f3567a;
                        pVar4.j.set(null);
                        pVar4.f3617n.h(bVar4, i16);
                        return;
                    }
                    F3.p pVar5 = (F3.p) this.j;
                    D3.e eVar2 = pVar5.f3615l;
                    Activity activityA2 = pVar5.a();
                    eVar2.getClass();
                    ProgressBar progressBar = new ProgressBar(activityA2, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activityA2);
                    builder.setView(progressBar);
                    builder.setMessage(H3.k.b(activityA2, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    D3.e.e(activityA2, alertDialogCreate, "GooglePlayServicesUpdatingDialog", pVar5);
                    F3.p pVar6 = (F3.p) this.j;
                    Context applicationContext = pVar6.a().getApplicationContext();
                    S.p pVar7 = new S.p(15, this, alertDialogCreate, i3);
                    pVar6.f3615l.getClass();
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme(SentryStackFrame.JsonKeys.PACKAGE);
                    F3.w wVar3 = new F3.w(pVar7);
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 33) {
                        applicationContext.registerReceiver(wVar3, intentFilter, i17 < 33 ? 0 : 2);
                    } else {
                        applicationContext.registerReceiver(wVar3, intentFilter);
                    }
                    wVar3.f3641a = applicationContext;
                    if (D3.i.a(applicationContext)) {
                        return;
                    }
                    F3.p pVar8 = (F3.p) this.j;
                    pVar8.j.set(null);
                    Z3.d dVar = pVar8.f3617n.f3596u;
                    dVar.sendMessage(dVar.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (wVar3) {
                        try {
                            Context context = wVar3.f3641a;
                            if (context != null) {
                                context.unregisterReceiver(wVar3);
                            }
                            wVar3.f3641a = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 8:
                B8.h hVar = (B8.h) this.j;
                int i18 = hVar.f861i;
                F3.p pVar9 = (F3.p) this.f19405i;
                if (i18 > 0) {
                    Bundle bundle = (Bundle) hVar.f862k;
                    pVar9.b(bundle != null ? bundle.getBundle("ConnectionlessLifecycleHelper") : null);
                }
                if (hVar.f861i >= 2) {
                    pVar9.f3613i = true;
                    pVar9.d();
                }
                if (hVar.f861i >= 3) {
                    pVar9.d();
                }
                if (hVar.f861i >= 4) {
                    pVar9.c();
                    return;
                }
                return;
            case 9:
                ((C0895k) this.j).A((Z) this.f19405i);
                return;
            case 10:
                break;
            case 11:
                C1040j c1040j = Y2.S.f11411k;
                ((C1033c) this.f19405i).J(24, 3, c1040j);
                ((com.revenuecat.purchases.google.usecase.a) this.j).c(c1040j);
                return;
            case 12:
                C1033c c1033c = (C1033c) this.f19405i;
                C1040j c1040j2 = (C1040j) this.j;
                if (((InterfaceC1049t) c1033c.f11443f.f3636c) != null) {
                    ((InterfaceC1049t) c1033c.f11443f.f3636c).onPurchasesUpdated(c1040j2, null);
                    return;
                } else {
                    AbstractC1872t.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 13:
                C1040j c1040j3 = Y2.S.f11411k;
                ((C1033c) this.f19405i).J(24, 13, c1040j3);
                ((com.revenuecat.purchases.google.usecase.b) this.j).a(c1040j3, null);
                return;
            case 14:
                Future future = (Future) this.f19405i;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                future.cancel(true);
                AbstractC1872t.h("BillingClient", "Async task is taking too long, cancel it!");
                Runnable runnable = (Runnable) this.j;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 15:
                C1040j c1040j4 = Y2.S.f11411k;
                ((C1033c) this.f19405i).J(24, 7, c1040j4);
                C1865p c1865p = com.google.android.gms.internal.play_billing.r.f19379i;
                C1876v c1876v = C1876v.f19394l;
                ((com.revenuecat.purchases.google.usecase.c) this.j).a(c1040j4, new Y2.x(c1876v, c1876v));
                return;
            case 16:
                C1040j c1040j5 = Y2.S.f11411k;
                ((C1033c) this.f19405i).J(24, 9, c1040j5);
                C1865p c1865p2 = com.google.android.gms.internal.play_billing.r.f19379i;
                ((InterfaceC1048s) this.j).b(c1040j5, C1876v.f19394l);
                return;
            case 17:
                ((C1482b) this.f19405i).f16011h = this.j;
                return;
            case 18:
                ((Application) this.f19405i).unregisterActivityLifecycleCallbacks((C1482b) this.j);
                return;
            case 19:
                try {
                    Method method = AbstractC1483c.f16019d;
                    Object obj = this.j;
                    Object obj2 = this.f19405i;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC1483c.f16020e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e11) {
                    if (e11.getClass() == RuntimeException.class && e11.getMessage() != null && e11.getMessage().startsWith("Unable to stop")) {
                        throw e11;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
            case 20:
                synchronized (((p059g4.f) this.j).f21868b) {
                    ((p059g4.a) ((p059g4.f) this.j).f21870d).p((A0.a) this.f19405i);
                    break;
                }
                return;
            case 21:
                synchronized (((p059g4.f) this.j).f21868b) {
                    p059g4.b bVar5 = (p059g4.b) ((p059g4.f) this.j).f21870d;
                    Exception excE = ((A0.a) this.f19405i).e();
                    H3.q.g(excE);
                    bVar5.onFailure(excE);
                    break;
                }
                return;
            case 22:
                synchronized (((p059g4.f) this.j).f21868b) {
                    ((p059g4.c) ((p059g4.f) this.j).f21870d).onSuccess(((A0.a) this.f19405i).f());
                    break;
                }
                return;
            case 23:
                LinkedHashSet linkedHashSet = p092k5.b.f24486a;
                boolean zIsEmpty = linkedHashSet.isEmpty();
                linkedHashSet.add((p077i5.P) this.f19405i);
                if (zIsEmpty || !p092k5.b.f24490e) {
                    p092k5.b.b((Context) this.j);
                    return;
                }
                return;
            case 24:
                p184w3.C c11 = ((p184w3.B) this.f19405i).f29792d;
                C0089b c0089b4 = p184w3.C.f29793G;
                B3.f fVar2 = (B3.f) this.j;
                C2969d c2969d2 = fVar2.f632k;
                boolean zE2 = AbstractC0088a.e(c2969d2, c11.f29809t);
                p191x3.D d11 = c11.f29797D;
                if (!zE2) {
                    c11.f29809t = c2969d2;
                    d11.c();
                }
                double d12 = fVar2.f630h;
                if (Double.isNaN(d12) || Math.abs(d12 - c11.f29811v) <= 1.0E-7d) {
                    z10 = false;
                } else {
                    c11.f29811v = d12;
                    z10 = true;
                }
                boolean z16 = c11.f29812w;
                boolean z17 = fVar2.f631i;
                if (z17 != z16) {
                    c11.f29812w = z17;
                    z10 = true;
                }
                Object[] objArr3 = {Boolean.valueOf(z10), Boolean.valueOf(c11.f29802m)};
                C0089b c0089b5 = p184w3.C.f29793G;
                c0089b5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr3);
                if (d11 != null && (z10 || c11.f29802m)) {
                    d11.f();
                }
                Double.isNaN(fVar2.f635n);
                int i19 = c11.f29813x;
                int i20 = fVar2.j;
                if (i20 != i19) {
                    c11.f29813x = i20;
                    z11 = true;
                } else {
                    z11 = false;
                }
                c0089b5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(c11.f29802m));
                if (d11 != null && (z11 || c11.f29802m)) {
                    d11.a();
                }
                int i21 = c11.y;
                int i22 = fVar2.f633l;
                if (i22 != i21) {
                    c11.y = i22;
                } else {
                    z12 = false;
                }
                c0089b5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(c11.f29802m));
                if (d11 != null && (z12 || c11.f29802m)) {
                    d11.e();
                }
                p184w3.w wVar4 = c11.f29814z;
                p184w3.w wVar5 = fVar2.f634m;
                if (!AbstractC0088a.e(wVar4, wVar5)) {
                    c11.f29814z = wVar5;
                }
                c11.f29802m = false;
                return;
            default:
                p184w3.C c12 = ((p184w3.B) this.f19405i).f29792d;
                C0089b c0089b6 = p184w3.C.f29793G;
                String str2 = ((C0090c) this.j).f620h;
                if (AbstractC0088a.e(str2, c12.f29810u)) {
                    z12 = false;
                } else {
                    c12.f29810u = str2;
                }
                p184w3.C.f29793G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(c12.f29803n));
                p191x3.D d13 = c12.f29797D;
                if (d13 != null && (z12 || c12.f29803n)) {
                    d13.d();
                }
                c12.f29803n = false;
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f19405i).run();
            } catch (Throwable th4) {
                S7.C.v(p100l6.i.f24820h, th4);
            }
            X7.g gVar = (X7.g) this.j;
            Runnable runnableZ = gVar.Z();
            if (runnableZ == null) {
                return;
            }
            this.f19405i = runnableZ;
            i3++;
            if (i3 >= 16 && X7.a.j(gVar.j, gVar)) {
                X7.a.i(gVar.j, gVar, this);
                return;
            }
        }
    }

    public String toString() {
        switch (this.f19404h) {
            case 0:
                android.support.v4.media.session.q qVar = new android.support.v4.media.session.q(C.class.getSimpleName(), 27);
                S2.a aVar = new S2.a(28, false);
                ((S2.a) qVar.f15618k).j = aVar;
                qVar.f15618k = aVar;
                aVar.f9211i = (B) this.j;
                return qVar.toString();
            default:
                return super.toString();
        }
    }

    public C(Object obj, Object obj2, int i3) {
        this.f19404h = i3;
        this.f19405i = obj;
        this.j = obj2;
    }

    public C(B8.h hVar, F3.p pVar) {
        this.f19404h = 8;
        this.f19405i = pVar;
        Objects.requireNonNull(hVar);
        this.j = hVar;
    }
}
