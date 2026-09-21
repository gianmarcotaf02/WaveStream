package V3;

import Y2.C1033c;
import Y2.C1040j;
import Y2.H;
import Y2.P;
import Y2.S;
import Z.AbstractC1149h0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.media3.exoplayer.RunnableC1546a;
import com.google.android.gms.internal.play_billing.AbstractC1872t;
import com.google.android.gms.internal.play_billing.B1;
import com.google.android.gms.internal.play_billing.C1;
import com.google.android.gms.internal.play_billing.C1822a;
import com.google.android.gms.internal.play_billing.C1848i1;
import com.google.android.gms.internal.play_billing.C1854k1;
import com.google.android.gms.internal.play_billing.C1857l1;
import com.google.android.gms.internal.play_billing.C1860m1;
import com.google.android.gms.internal.play_billing.E1;
import com.google.android.gms.internal.play_billing.F1;
import com.google.android.gms.internal.play_billing.InterfaceC1828c;
import java.util.concurrent.Callable;

public final class b implements Callable {

    public final int f10252a;

    public final Object f10253b;

    public b(int i3, Object obj) {
        this.f10252a = i3;
        this.f10253b = obj;
    }

    @Override
    public final Object call() {
        Bundle bundle;
        InterfaceC1828c interfaceC1828c;
        int i3;
        int i9;
        Long lA;
        B1 b1P;
        E1 e1P;
        switch (this.f10252a) {
            case 0:
                return ((Context) this.f10253b).getSharedPreferences("google_sdk_flags", 0);
            case 1:
                H h9 = (H) this.f10253b;
                C1033c c1033c = h9.f11380k;
                synchronized (c1033c.f11438a) {
                    try {
                        if (c1033c.f11439b != 3) {
                            boolean z6 = c1033c.f11439b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                AbstractC1872t.b(bundle, c1033c.f11440c, c1033c.f11441d, c1033c.f11436F.longValue());
                            }
                            synchronized (c1033c.f11438a) {
                                interfaceC1828c = c1033c.f11445i;
                                break;
                            }
                            if (interfaceC1828c == null) {
                                C1033c c1033c2 = h9.f11380k;
                                c1033c2.A(0);
                                C1040j c1040j = S.j;
                                c1033c2.z(107, c1040j);
                                h9.c(c1040j);
                            } else {
                                C1033c c1033c3 = h9.f11380k;
                                String packageName = c1033c3.g.getPackageName();
                                int iF0 = 3;
                                int i10 = 27;
                                while (true) {
                                    if (i10 >= 3) {
                                        try {
                                            AbstractC1872t.g("BillingClient", "trying subs apiVersion: " + i10);
                                            if (bundle == null) {
                                                C1822a c1822a = (C1822a) interfaceC1828c;
                                                Parcel parcelC0 = c1822a.c0();
                                                parcelC0.writeInt(i10);
                                                parcelC0.writeString(packageName);
                                                parcelC0.writeString("subs");
                                                Parcel parcelD0 = c1822a.d0(parcelC0, 1);
                                                int i11 = parcelD0.readInt();
                                                parcelD0.recycle();
                                                iF0 = i11;
                                            } else {
                                                iF0 = ((C1822a) interfaceC1828c).f0(i10, packageName, "subs", bundle);
                                            }
                                            if (iF0 == 0) {
                                                AbstractC1872t.g("BillingClient", "highestLevelSupportedForSubs: " + i10);
                                            } else {
                                                i10--;
                                            }
                                        } catch (Exception e6) {
                                            AbstractC1872t.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e6);
                                            boolean z9 = e6 instanceof DeadObjectException;
                                            if (z9) {
                                                i3 = 91;
                                            } else if (e6 instanceof RemoteException) {
                                                i3 = 90;
                                            } else {
                                                i3 = e6 instanceof SecurityException ? 92 : 42;
                                            }
                                            String strA = AbstractC1149h0.a(i3, 42) ? P.a(e6) : null;
                                            h9.f11380k.A(0);
                                            h9.b(z9 ? S.j : S.f11409h, i3, strA, z6);
                                            h9.c(z9 ? S.j : S.f11409h);
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                c1033c3.f11447l = i10 >= 5;
                                c1033c3.f11446k = i10 >= 3;
                                if (i10 < 3) {
                                    AbstractC1872t.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i9 = 9;
                                } else {
                                    i9 = 1;
                                }
                                for (int i12 = 27; i12 >= 3; i12--) {
                                    AbstractC1872t.g("BillingClient", "trying inapp apiVersion: " + i12);
                                    if (bundle == null) {
                                        C1822a c1822a2 = (C1822a) interfaceC1828c;
                                        Parcel parcelC1 = c1822a2.c0();
                                        parcelC1.writeInt(i12);
                                        parcelC1.writeString(packageName);
                                        parcelC1.writeString("inapp");
                                        Parcel parcelD1 = c1822a2.d0(parcelC1, 1);
                                        int i13 = parcelD1.readInt();
                                        parcelD1.recycle();
                                        iF0 = i13;
                                    } else {
                                        iF0 = ((C1822a) interfaceC1828c).f0(i12, packageName, "inapp", bundle);
                                    }
                                    if (iF0 == 0) {
                                        c1033c3.f11448m = i12;
                                        AbstractC1872t.g("BillingClient", "mHighestLevelSupportedForInApp: " + i12);
                                        C1033c.q(c1033c3, c1033c3.f11448m);
                                        if (c1033c3.f11448m < 3) {
                                            AbstractC1872t.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i9 = 36;
                                        }
                                        C1033c.r(c1033c3, iF0);
                                        if (iF0 != 0) {
                                            C1040j c1040j2 = S.f11404b;
                                            h9.b(c1040j2, i9, null, z6);
                                            h9.c(c1040j2);
                                        } else {
                                            try {
                                                lA = h9.a(z6);
                                                if (z6) {
                                                    C1848i1 c1848i1Q = C1854k1.q();
                                                    c1848i1Q.c();
                                                    C1854k1.p((C1854k1) c1848i1Q.f19393i, 6);
                                                    e1P = F1.p();
                                                    e1P.d(false);
                                                    e1P.e();
                                                    e1P.c();
                                                    F1.t((F1) e1P.f19393i);
                                                    if (lA != null) {
                                                        long jLongValue = lA.longValue();
                                                        e1P.c();
                                                        F1.s((F1) e1P.f19393i, jLongValue);
                                                    }
                                                    C1033c c1033c4 = h9.f11380k;
                                                    c1848i1Q.c();
                                                    C1854k1.v((C1854k1) c1848i1Q.f19393i, (F1) e1P.a());
                                                    c1033c4.y((C1854k1) c1848i1Q.a());
                                                } else {
                                                    b1P = C1.p();
                                                    C1857l1 c1857l1Q = C1860m1.q();
                                                    c1857l1Q.e(0);
                                                    c1857l1Q.c();
                                                    C1860m1.t((C1860m1) c1857l1Q.f19393i);
                                                    b1P.c();
                                                    C1.q((C1) b1P.f19393i, (C1860m1) c1857l1Q.a());
                                                    if (lA != null) {
                                                        long jLongValue2 = lA.longValue();
                                                        b1P.c();
                                                        C1.r((C1) b1P.f19393i, jLongValue2);
                                                    }
                                                    h9.f11380k.f11444h.Z((C1) b1P.a());
                                                }
                                            } catch (Throwable th) {
                                                AbstractC1872t.i("BillingClient", "Unable to log.", th);
                                            }
                                            h9.c(S.f11410i);
                                        }
                                    }
                                }
                                C1033c.q(c1033c3, c1033c3.f11448m);
                                if (c1033c3.f11448m < 3) {
                                    AbstractC1872t.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i9 = 36;
                                }
                                C1033c.r(c1033c3, iF0);
                                if (iF0 != 0) {
                                    C1040j c1040j3 = S.f11404b;
                                    h9.b(c1040j3, i9, null, z6);
                                    h9.c(c1040j3);
                                } else {
                                    lA = h9.a(z6);
                                    if (z6) {
                                        C1848i1 c1848i1Q2 = C1854k1.q();
                                        c1848i1Q2.c();
                                        C1854k1.p((C1854k1) c1848i1Q2.f19393i, 6);
                                        e1P = F1.p();
                                        e1P.d(false);
                                        e1P.e();
                                        e1P.c();
                                        F1.t((F1) e1P.f19393i);
                                        if (lA != null) {
                                            long jLongValue3 = lA.longValue();
                                            e1P.c();
                                            F1.s((F1) e1P.f19393i, jLongValue3);
                                        }
                                        C1033c c1033c5 = h9.f11380k;
                                        c1848i1Q2.c();
                                        C1854k1.v((C1854k1) c1848i1Q2.f19393i, (F1) e1P.a());
                                        c1033c5.y((C1854k1) c1848i1Q2.a());
                                    } else {
                                        b1P = C1.p();
                                        C1857l1 c1857l1Q2 = C1860m1.q();
                                        c1857l1Q2.e(0);
                                        c1857l1Q2.c();
                                        C1860m1.t((C1860m1) c1857l1Q2.f19393i);
                                        b1P.c();
                                        C1.q((C1) b1P.f19393i, (C1860m1) c1857l1Q2.a());
                                        if (lA != null) {
                                            long jLongValue4 = lA.longValue();
                                            b1P.c();
                                            C1.r((C1) b1P.f19393i, jLongValue4);
                                        }
                                        h9.f11380k.f11444h.Z((C1) b1P.a());
                                    }
                                    h9.c(S.f11410i);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            case 2:
                ((RunnableC1546a) this.f10253b).run();
                return null;
            default:
                p075i2.a aVar = (p075i2.a) this.f10253b;
                aVar.f22756l.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.f22758n.d();
                    Binder.flushPendingCommands();
                    aVar.a(null);
                    return null;
                } catch (Throwable th3) {
                    try {
                        aVar.f22755k.set(true);
                        throw th3;
                    } catch (Throwable th4) {
                        aVar.a(null);
                        throw th4;
                    }
                }
        }
    }
}
