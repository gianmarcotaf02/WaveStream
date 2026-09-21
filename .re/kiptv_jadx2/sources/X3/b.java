package X3;

import F3.C0361a;
import F3.o;
import F3.v;
import H3.q;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.J;
import io.sentry.SentryBaseEvent;
import org.json.JSONException;

public final class b extends g {

    public final int f10841d;

    public final Object f10842e;

    public b(int i3, p059g4.d dVar) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 0);
        this.f10841d = i3;
        switch (i3) {
            case 1:
                this.f10842e = dVar;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 0);
                break;
            case 2:
                this.f10842e = dVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 0);
                break;
            default:
                this.f10842e = dVar;
                break;
        }
    }

    @Override
    public final boolean b0(int i3, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strD;
        Object obj = this.f10842e;
        switch (this.f10841d) {
            case 0:
                if (i3 != 1) {
                    return false;
                }
                Status status = (Status) h.a(parcel, Status.CREATOR);
                p148r3.i iVar = (p148r3.i) h.a(parcel, p148r3.i.CREATOR);
                h.b(parcel);
                C2.a.U(status, iVar, (p059g4.d) obj);
                return true;
            case 1:
                if (i3 != 1) {
                    return false;
                }
                Status status2 = (Status) h.a(parcel, Status.CREATOR);
                p148r3.f fVar = (p148r3.f) h.a(parcel, p148r3.f.CREATOR);
                h.b(parcel);
                C2.a.U(status2, fVar, (p059g4.d) obj);
                return true;
            case 2:
                if (i3 != 1) {
                    return false;
                }
                Status status3 = (Status) h.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) h.a(parcel, PendingIntent.CREATOR);
                h.b(parcel);
                C2.a.U(status3, pendingIntent, (p059g4.d) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i3 != 1) {
                    if (i3 != 2) {
                        return false;
                    }
                    d0();
                    p166t3.i.H(revocationBoundService).I();
                    return true;
                }
                d0();
                p166t3.b bVarA = p166t3.b.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = bVarA.b();
                GoogleSignInOptions googleSignInOptionsA = GoogleSignInOptions.f18589r;
                if (googleSignInAccountB != null) {
                    String strD2 = bVarA.d("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(p166t3.b.f("googleSignInOptions", strD2))) == null) {
                        googleSignInOptionsA = null;
                    } else {
                        try {
                            googleSignInOptionsA = GoogleSignInOptions.a(strD);
                        } catch (JSONException unused) {
                            googleSignInOptionsA = null;
                        }
                    }
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsA;
                q.g(googleSignInOptions);
                J j = new J((RevocationBoundService) obj, null, p139q3.a.f26623a, googleSignInOptions, new E3.e(new C0361a(), Looper.getMainLooper()));
                v vVar = j.f2835h;
                Context context = j.f2829a;
                if (googleSignInAccountB == null) {
                    boolean z6 = j.d() == 3;
                    B8.h hVar = p166t3.h.f27780a;
                    if (hVar.f861i <= 3) {
                        Log.d((String) hVar.f862k, ((String) hVar.j).concat("Signing out"));
                    }
                    p166t3.h.a(context);
                    if (z6) {
                        Status status4 = Status.f18685l;
                        F3.m mVar = new F3.m(vVar, 0);
                        mVar.n0(status4);
                        basePendingResult = mVar;
                    } else {
                        p166t3.g gVar = new p166t3.g(vVar, 0);
                        vVar.a(gVar);
                        basePendingResult = gVar;
                    }
                    basePendingResult.i0(new o(basePendingResult, new p059g4.d(), new B3.o(12)));
                    return true;
                }
                boolean z9 = j.d() == 3;
                B8.h hVar2 = p166t3.h.f27780a;
                if (hVar2.f861i <= 3) {
                    Log.d((String) hVar2.f862k, ((String) hVar2.j).concat("Revoking access"));
                }
                String strD3 = p166t3.b.a(context).d("refreshToken");
                p166t3.h.a(context);
                if (!z9) {
                    p166t3.g gVar2 = new p166t3.g(vVar, 1);
                    vVar.a(gVar2);
                    basePendingResult2 = gVar2;
                } else if (strD3 == null) {
                    B8.h hVar3 = p166t3.c.j;
                    Status status5 = new Status(4, null, null, null);
                    q.a("Status code must not be SUCCESS", !status5.a());
                    E3.m mVar2 = new E3.m(status5);
                    mVar2.n0(status5);
                    basePendingResult2 = mVar2;
                } else {
                    p166t3.c cVar = new p166t3.c(strD3);
                    new Thread(cVar).start();
                    basePendingResult2 = cVar.f27768i;
                }
                basePendingResult2.i0(new o(basePendingResult2, new p059g4.d(), new B3.o(12)));
                return true;
        }
    }

    public void d0() {
        int callingUid = Binder.getCallingUid();
        RevocationBoundService revocationBoundService = (RevocationBoundService) this.f10842e;
        D3.j jVarA = N3.b.a(revocationBoundService);
        jVarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) jVarA.f2115a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                D3.j jVarC = D3.j.c(revocationBoundService);
                jVarC.getClass();
                if (packageInfo != null) {
                    if (D3.j.d(packageInfo, false)) {
                        return;
                    }
                    if (D3.j.d(packageInfo, true)) {
                        Context context = jVarC.f2115a;
                        try {
                            if (!D3.i.f2111c) {
                                PackageInfo packageInfo2 = N3.b.a(context).f2115a.getPackageManager().getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                D3.j.c(context);
                                if (packageInfo2 == null || D3.j.d(packageInfo2, false) || !D3.j.d(packageInfo2, true)) {
                                    D3.i.f2110b = false;
                                } else {
                                    D3.i.f2110b = true;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e6) {
                            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e6);
                        } finally {
                            D3.i.f2111c = true;
                        }
                        if (D3.i.f2110b || !SentryBaseEvent.JsonKeys.USER.equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            throw new SecurityException(Y6.f.f(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        } catch (SecurityException unused2) {
        }
    }

    public b(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f10841d = 3;
        this.f10842e = revocationBoundService;
    }
}
