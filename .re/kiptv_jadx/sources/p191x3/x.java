package p191x3;

/* JADX INFO: loaded from: classes.dex */
public final class x extends X3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31204d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f31205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.google.android.gms.internal.cast.C1735e c1735e) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 3);
        this.f31205e = c1735e;
    }

    @Override // X3.g
    public final boolean c0(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        com.google.android.gms.cast.CastDevice castDevice;
        com.google.android.gms.cast.CastDevice castDevice2;
        java.lang.Object obj = this.f31205e;
        int i9 = 0;
        switch (this.f31204d) {
            case 0:
                p191x3.f fVar = (p191x3.f) obj;
                switch (i3) {
                    case 1:
                        O3.b bVar = new O3.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.AbstractC1818z.d(parcel2, bVar);
                        return true;
                    case 2:
                        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.cast.AbstractC1818z.a(parcel, android.os.Bundle.CREATOR);
                        com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                        ((p191x3.C3102c) fVar).f(bundle);
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.cast.AbstractC1818z.a(parcel, android.os.Bundle.CREATOR);
                        com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                        ((p191x3.C3102c) fVar).f(bundle2);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i10 = com.google.android.gms.internal.cast.AbstractC1818z.f19179a;
                        int i11 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                        p191x3.C3102c c3102c = (p191x3.C3102c) fVar;
                        p191x3.o oVar = c3102c.f31186e;
                        if (oVar != null) {
                            try {
                                p191x3.m mVar = (p191x3.m) oVar;
                                android.os.Parcel parcelY = mVar.Y();
                                parcelY.writeInt(i11);
                                parcelY.writeInt(0);
                                mVar.a0(parcelY, 6);
                            } catch (android.os.RemoteException e6) {
                                p191x3.C3102c.f31183m.a(e6, "Unable to call %s on %s.", "disconnectFromDevice", p191x3.o.class.getSimpleName());
                            }
                            c3102c.a(0);
                            break;
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        p191x3.C3102c c3102c2 = (p191x3.C3102c) fVar;
                        c3102c2.getClass();
                        H3.q.d();
                        p199y3.g gVar = c3102c2.j;
                        long jF = gVar == null ? 0L : gVar.f() - c3102c2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(jF);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        android.os.Bundle bundle3 = (android.os.Bundle) com.google.android.gms.internal.cast.AbstractC1818z.a(parcel, android.os.Bundle.CREATOR);
                        com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                        p191x3.C3102c c3102c3 = (p191x3.C3102c) fVar;
                        c3102c3.getClass();
                        c3102c3.f31190k = com.google.android.gms.cast.CastDevice.a(bundle3);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        android.os.Bundle bundle4 = (android.os.Bundle) com.google.android.gms.internal.cast.AbstractC1818z.a(parcel, android.os.Bundle.CREATOR);
                        com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                        p191x3.C3102c c3102c4 = (p191x3.C3102c) fVar;
                        c3102c4.getClass();
                        c3102c4.f31190k = com.google.android.gms.cast.CastDevice.a(bundle4);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        android.os.Bundle bundle5 = (android.os.Bundle) com.google.android.gms.internal.cast.AbstractC1818z.a(parcel, android.os.Bundle.CREATOR);
                        com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                        p191x3.C3102c c3102c5 = (p191x3.C3102c) fVar;
                        c3102c5.getClass();
                        com.google.android.gms.cast.CastDevice castDeviceA = com.google.android.gms.cast.CastDevice.a(bundle5);
                        if (castDeviceA != null && !castDeviceA.equals(c3102c5.f31190k)) {
                            java.lang.String str = castDeviceA.f18619k;
                            if (!android.text.TextUtils.isEmpty(str) && ((castDevice2 = c3102c5.f31190k) == null || !android.text.TextUtils.equals(castDevice2.f18619k, str))) {
                                i9 = 1;
                            }
                            c3102c5.f31190k = castDeviceA;
                            p191x3.C3102c.f31183m.b("update to device (%s) with name %s", castDeviceA, 1 != i9 ? "unchanged" : "changed");
                            if (i9 != 0 && (castDevice = c3102c5.f31190k) != null) {
                                p206z3.i iVar = c3102c5.f31188h;
                                if (iVar != null) {
                                    B3.C0089b c0089b = p206z3.i.f32368v;
                                    android.util.Log.i(c0089b.f617a, c0089b.d("update Cast device to %s", castDevice));
                                    iVar.f32381o = castDevice;
                                    iVar.c();
                                }
                                java.util.Iterator it = new java.util.HashSet(c3102c5.f31185d).iterator();
                                while (it.hasNext()) {
                                    ((p191x3.D) it.next()).getClass();
                                }
                                com.google.android.gms.internal.cast.C1817y2 c1817y2 = c3102c5.f31191l;
                                if (c1817y2 != null) {
                                    c1817y2.f19178h.D().f19002t++;
                                }
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            case 1:
                com.google.android.gms.internal.cast.C1735e c1735e = (com.google.android.gms.internal.cast.C1735e) obj;
                if (i3 == 1) {
                    java.lang.String string = parcel.readString();
                    com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                    c1735e.getClass();
                    O3.a aVarC = new p191x3.C3102c(c1735e.f18890a, c1735e.f18891b, string, c1735e.f18893d, c1735e.f18894e, new p206z3.i(c1735e.f18890a, c1735e.f18893d, c1735e.f18894e)).c();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.AbstractC1818z.d(parcel2, aVarC);
                    return true;
                }
                if (i3 == 2) {
                    boolean z6 = c1735e.f18893d.f31171l;
                    parcel2.writeNoException();
                    int i12 = com.google.android.gms.internal.cast.AbstractC1818z.f19179a;
                    parcel2.writeInt(z6 ? 1 : 0);
                    return true;
                }
                if (i3 == 3) {
                    java.lang.String str2 = c1735e.f18891b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    return true;
                }
                if (i3 != 4) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 2:
                p191x3.C3102c c3102c6 = (p191x3.C3102c) obj;
                if (i3 == 1) {
                    java.lang.String string2 = parcel.readString();
                    java.lang.String string3 = parcel.readString();
                    com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                    p184w3.C c9 = c3102c6.f31189i;
                    if (c9 != null && c9.f29799F == 3) {
                        F3.n nVarB = F3.n.b();
                        nVarB.f3608d = new p184w3.y(c9, string2, string3, i9);
                        nVarB.f3607c = 8407;
                        c9.c(1, nVarB.a()).a(new p191x3.C(this));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i3 == 2) {
                    java.lang.String string4 = parcel.readString();
                    p184w3.i iVar2 = (p184w3.i) com.google.android.gms.internal.cast.AbstractC1818z.a(parcel, p184w3.i.CREATOR);
                    com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                    p184w3.C c10 = c3102c6.f31189i;
                    if (c10 != null && c10.f29799F == 3) {
                        F3.n nVarB2 = F3.n.b();
                        nVarB2.f3608d = new j1.l(c10, string4, iVar2, 13);
                        nVarB2.f3607c = 8406;
                        c10.c(1, nVarB2.a()).a(new p008a8.c(28, this));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int i13 = parcel.readInt();
                    com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                    p191x3.C3102c.d(c3102c6, i13);
                    parcel2.writeNoException();
                    return true;
                }
                java.lang.String string5 = parcel.readString();
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                p184w3.C c11 = c3102c6.f31189i;
                if (c11 != null && c11.f29799F == 3) {
                    F3.n nVarB3 = F3.n.b();
                    nVarB3.f3608d = new p184w3.z(c11, string5);
                    nVarB3.f3607c = 8409;
                    c11.c(1, nVarB3.a());
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i3 != 1) {
                    if (i3 != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long j = parcel.readLong();
                long j9 = parcel.readLong();
                com.google.android.gms.internal.cast.AbstractC1818z.b(parcel);
                ((p206z3.b) obj).publishProgress(java.lang.Long.valueOf(j), java.lang.Long.valueOf(j9));
                parcel2.writeNoException();
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p191x3.C3102c c3102c) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 3);
        this.f31205e = c3102c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p191x3.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 3);
        this.f31205e = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p206z3.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 3);
        this.f31205e = bVar;
    }
}
