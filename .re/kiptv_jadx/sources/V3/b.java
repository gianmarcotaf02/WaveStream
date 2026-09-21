package V3;

/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f10253b;

    public /* synthetic */ b(int i3, java.lang.Object obj) {
        this.f10252a = i3;
        this.f10253b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[Catch: Exception -> 0x00d5, TryCatch #3 {Exception -> 0x00d5, blocks: (B:41:0x009e, B:43:0x00b6, B:48:0x00e3, B:55:0x0104, B:59:0x010b, B:61:0x010f, B:65:0x011e, B:67:0x0136, B:70:0x0160, B:71:0x0179, B:68:0x0155, B:72:0x017c, B:74:0x0185, B:75:0x018e, B:49:0x00fa, B:46:0x00d8), top: B:129:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0193  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3 A[Catch: all -> 0x01d7, TryCatch #1 {all -> 0x01d7, blocks: (B:78:0x019d, B:80:0x01a3, B:82:0x01c8, B:85:0x01d9, B:86:0x01f5, B:88:0x021c, B:89:0x022a), top: B:126:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c8 A[Catch: all -> 0x01d7, TryCatch #1 {all -> 0x01d7, blocks: (B:78:0x019d, B:80:0x01a3, B:82:0x01c8, B:85:0x01d9, B:86:0x01f5, B:88:0x021c, B:89:0x022a), top: B:126:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f5 A[Catch: all -> 0x01d7, TryCatch #1 {all -> 0x01d7, blocks: (B:78:0x019d, B:80:0x01a3, B:82:0x01c8, B:85:0x01d9, B:86:0x01f5, B:88:0x021c, B:89:0x022a), top: B:126:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:88:0x021c A[Catch: all -> 0x01d7, TryCatch #1 {all -> 0x01d7, blocks: (B:78:0x019d, B:80:0x01a3, B:82:0x01c8, B:85:0x01d9, B:86:0x01f5, B:88:0x021c, B:89:0x022a), top: B:126:0x019d }] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        android.os.Bundle bundle;
        com.google.android.gms.internal.play_billing.InterfaceC1828c interfaceC1828c;
        int i3;
        int i9;
        java.lang.Long lA;
        com.google.android.gms.internal.play_billing.B1 b1P;
        com.google.android.gms.internal.play_billing.E1 e1P;
        switch (this.f10252a) {
            case 0:
                return ((android.content.Context) this.f10253b).getSharedPreferences("google_sdk_flags", 0);
            case 1:
                Y2.H h9 = (Y2.H) this.f10253b;
                Y2.C1033c c1033c = h9.f11380k;
                synchronized (c1033c.f11438a) {
                    try {
                        if (c1033c.f11439b != 3) {
                            boolean z6 = c1033c.f11439b == 1;
                            if (android.text.TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new android.os.Bundle();
                                bundle.putString("accountName", null);
                                com.google.android.gms.internal.play_billing.AbstractC1872t.b(bundle, c1033c.f11440c, c1033c.f11441d, c1033c.f11436F.longValue());
                            }
                            synchronized (c1033c.f11438a) {
                                interfaceC1828c = c1033c.f11445i;
                                break;
                            }
                            if (interfaceC1828c == null) {
                                Y2.C1033c c1033c2 = h9.f11380k;
                                c1033c2.A(0);
                                Y2.C1040j c1040j = Y2.S.j;
                                c1033c2.z(107, c1040j);
                                h9.c(c1040j);
                            } else {
                                Y2.C1033c c1033c3 = h9.f11380k;
                                java.lang.String packageName = c1033c3.g.getPackageName();
                                int iF0 = 3;
                                int i10 = 27;
                                while (true) {
                                    if (i10 >= 3) {
                                        try {
                                            com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "trying subs apiVersion: " + i10);
                                            if (bundle == null) {
                                                com.google.android.gms.internal.play_billing.C1822a c1822a = (com.google.android.gms.internal.play_billing.C1822a) interfaceC1828c;
                                                android.os.Parcel parcelC0 = c1822a.c0();
                                                parcelC0.writeInt(i10);
                                                parcelC0.writeString(packageName);
                                                parcelC0.writeString("subs");
                                                android.os.Parcel parcelD0 = c1822a.d0(parcelC0, 1);
                                                int i11 = parcelD0.readInt();
                                                parcelD0.recycle();
                                                iF0 = i11;
                                            } else {
                                                iF0 = ((com.google.android.gms.internal.play_billing.C1822a) interfaceC1828c).f0(i10, packageName, "subs", bundle);
                                            }
                                            if (iF0 == 0) {
                                                com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "highestLevelSupportedForSubs: " + i10);
                                            } else {
                                                i10--;
                                            }
                                        } catch (java.lang.Exception e6) {
                                            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e6);
                                            boolean z9 = e6 instanceof android.os.DeadObjectException;
                                            if (z9) {
                                                i3 = 91;
                                            } else if (e6 instanceof android.os.RemoteException) {
                                                i3 = 90;
                                            } else {
                                                i3 = e6 instanceof java.lang.SecurityException ? 92 : 42;
                                            }
                                            java.lang.String strA = Z.AbstractC1149h0.a(i3, 42) ? Y2.P.a(e6) : null;
                                            h9.f11380k.A(0);
                                            h9.b(z9 ? Y2.S.j : Y2.S.f11409h, i3, strA, z6);
                                            h9.c(z9 ? Y2.S.j : Y2.S.f11409h);
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                c1033c3.f11447l = i10 >= 5;
                                c1033c3.f11446k = i10 >= 3;
                                if (i10 < 3) {
                                    com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i9 = 9;
                                } else {
                                    i9 = 1;
                                }
                                for (int i12 = 27; i12 >= 3; i12--) {
                                    com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "trying inapp apiVersion: " + i12);
                                    if (bundle == null) {
                                        com.google.android.gms.internal.play_billing.C1822a c1822a2 = (com.google.android.gms.internal.play_billing.C1822a) interfaceC1828c;
                                        android.os.Parcel parcelC1 = c1822a2.c0();
                                        parcelC1.writeInt(i12);
                                        parcelC1.writeString(packageName);
                                        parcelC1.writeString("inapp");
                                        android.os.Parcel parcelD1 = c1822a2.d0(parcelC1, 1);
                                        int i13 = parcelD1.readInt();
                                        parcelD1.recycle();
                                        iF0 = i13;
                                    } else {
                                        iF0 = ((com.google.android.gms.internal.play_billing.C1822a) interfaceC1828c).f0(i12, packageName, "inapp", bundle);
                                    }
                                    if (iF0 == 0) {
                                        c1033c3.f11448m = i12;
                                        com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "mHighestLevelSupportedForInApp: " + i12);
                                        Y2.C1033c.q(c1033c3, c1033c3.f11448m);
                                        if (c1033c3.f11448m < 3) {
                                            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                            i9 = 36;
                                        }
                                        Y2.C1033c.r(c1033c3, iF0);
                                        if (iF0 != 0) {
                                            Y2.C1040j c1040j2 = Y2.S.f11404b;
                                            h9.b(c1040j2, i9, null, z6);
                                            h9.c(c1040j2);
                                        } else {
                                            try {
                                                lA = h9.a(z6);
                                                if (z6) {
                                                    com.google.android.gms.internal.play_billing.C1848i1 c1848i1Q = com.google.android.gms.internal.play_billing.C1854k1.q();
                                                    c1848i1Q.c();
                                                    com.google.android.gms.internal.play_billing.C1854k1.p((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.f19393i, 6);
                                                    e1P = com.google.android.gms.internal.play_billing.F1.p();
                                                    e1P.d(false);
                                                    e1P.e();
                                                    e1P.c();
                                                    com.google.android.gms.internal.play_billing.F1.t((com.google.android.gms.internal.play_billing.F1) e1P.f19393i);
                                                    if (lA != null) {
                                                        long jLongValue = lA.longValue();
                                                        e1P.c();
                                                        com.google.android.gms.internal.play_billing.F1.s((com.google.android.gms.internal.play_billing.F1) e1P.f19393i, jLongValue);
                                                    }
                                                    Y2.C1033c c1033c4 = h9.f11380k;
                                                    c1848i1Q.c();
                                                    com.google.android.gms.internal.play_billing.C1854k1.v((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.f19393i, (com.google.android.gms.internal.play_billing.F1) e1P.a());
                                                    c1033c4.y((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.a());
                                                } else {
                                                    b1P = com.google.android.gms.internal.play_billing.C1.p();
                                                    com.google.android.gms.internal.play_billing.C1857l1 c1857l1Q = com.google.android.gms.internal.play_billing.C1860m1.q();
                                                    c1857l1Q.e(0);
                                                    c1857l1Q.c();
                                                    com.google.android.gms.internal.play_billing.C1860m1.t((com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q.f19393i);
                                                    b1P.c();
                                                    com.google.android.gms.internal.play_billing.C1.q((com.google.android.gms.internal.play_billing.C1) b1P.f19393i, (com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q.a());
                                                    if (lA != null) {
                                                        long jLongValue2 = lA.longValue();
                                                        b1P.c();
                                                        com.google.android.gms.internal.play_billing.C1.r((com.google.android.gms.internal.play_billing.C1) b1P.f19393i, jLongValue2);
                                                    }
                                                    h9.f11380k.f11444h.Z((com.google.android.gms.internal.play_billing.C1) b1P.a());
                                                }
                                            } catch (java.lang.Throwable th) {
                                                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
                                            }
                                            h9.c(Y2.S.f11410i);
                                        }
                                    }
                                }
                                Y2.C1033c.q(c1033c3, c1033c3.f11448m);
                                if (c1033c3.f11448m < 3) {
                                    com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i9 = 36;
                                }
                                Y2.C1033c.r(c1033c3, iF0);
                                if (iF0 != 0) {
                                    Y2.C1040j c1040j3 = Y2.S.f11404b;
                                    h9.b(c1040j3, i9, null, z6);
                                    h9.c(c1040j3);
                                } else {
                                    lA = h9.a(z6);
                                    if (z6) {
                                        com.google.android.gms.internal.play_billing.C1848i1 c1848i1Q2 = com.google.android.gms.internal.play_billing.C1854k1.q();
                                        c1848i1Q2.c();
                                        com.google.android.gms.internal.play_billing.C1854k1.p((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q2.f19393i, 6);
                                        e1P = com.google.android.gms.internal.play_billing.F1.p();
                                        e1P.d(false);
                                        e1P.e();
                                        e1P.c();
                                        com.google.android.gms.internal.play_billing.F1.t((com.google.android.gms.internal.play_billing.F1) e1P.f19393i);
                                        if (lA != null) {
                                            long jLongValue3 = lA.longValue();
                                            e1P.c();
                                            com.google.android.gms.internal.play_billing.F1.s((com.google.android.gms.internal.play_billing.F1) e1P.f19393i, jLongValue3);
                                        }
                                        Y2.C1033c c1033c5 = h9.f11380k;
                                        c1848i1Q2.c();
                                        com.google.android.gms.internal.play_billing.C1854k1.v((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q2.f19393i, (com.google.android.gms.internal.play_billing.F1) e1P.a());
                                        c1033c5.y((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q2.a());
                                    } else {
                                        b1P = com.google.android.gms.internal.play_billing.C1.p();
                                        com.google.android.gms.internal.play_billing.C1857l1 c1857l1Q2 = com.google.android.gms.internal.play_billing.C1860m1.q();
                                        c1857l1Q2.e(0);
                                        c1857l1Q2.c();
                                        com.google.android.gms.internal.play_billing.C1860m1.t((com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q2.f19393i);
                                        b1P.c();
                                        com.google.android.gms.internal.play_billing.C1.q((com.google.android.gms.internal.play_billing.C1) b1P.f19393i, (com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q2.a());
                                        if (lA != null) {
                                            long jLongValue4 = lA.longValue();
                                            b1P.c();
                                            com.google.android.gms.internal.play_billing.C1.r((com.google.android.gms.internal.play_billing.C1) b1P.f19393i, jLongValue4);
                                        }
                                        h9.f11380k.f11444h.Z((com.google.android.gms.internal.play_billing.C1) b1P.a());
                                    }
                                    h9.c(Y2.S.f11410i);
                                }
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        throw th2;
                    }
                }
                return null;
            case 2:
                ((androidx.media3.exoplayer.RunnableC1546a) this.f10253b).run();
                return null;
            default:
                p075i2.a aVar = (p075i2.a) this.f10253b;
                aVar.f22756l.set(true);
                try {
                    android.os.Process.setThreadPriority(10);
                    aVar.f22758n.d();
                    android.os.Binder.flushPendingCommands();
                    aVar.a(null);
                    return null;
                } catch (java.lang.Throwable th3) {
                    try {
                        aVar.f22755k.set(true);
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        aVar.a(null);
                        throw th4;
                    }
                }
        }
    }
}
