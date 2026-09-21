package B3;

/* JADX INFO: loaded from: classes.dex */
public final class e implements android.os.Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f629a;

    public /* synthetic */ e(int i3) {
        this.f629a = i3;
    }

    public static void a(H3.C0375d c0375d, android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 1, 4);
        parcel.writeInt(c0375d.f3951h);
        E6.G.e0(parcel, 2, 4);
        parcel.writeInt(c0375d.f3952i);
        E6.G.e0(parcel, 3, 4);
        parcel.writeInt(c0375d.j);
        E6.G.Z(parcel, 4, c0375d.f3953k);
        E6.G.U(parcel, 5, c0375d.f3954l);
        E6.G.b0(parcel, 6, c0375d.f3955m, i3);
        E6.G.S(parcel, 7, c0375d.f3956n);
        E6.G.Y(parcel, 8, c0375d.f3957o, i3);
        E6.G.b0(parcel, 10, c0375d.f3958p, i3);
        E6.G.b0(parcel, 11, c0375d.f3959q, i3);
        E6.G.e0(parcel, 12, 4);
        parcel.writeInt(c0375d.f3960r ? 1 : 0);
        E6.G.e0(parcel, 13, 4);
        parcel.writeInt(c0375d.f3961s);
        boolean z6 = c0375d.f3962t;
        E6.G.e0(parcel, 14, 4);
        parcel.writeInt(z6 ? 1 : 0);
        E6.G.Z(parcel, 15, c0375d.f3963u);
        E6.G.g0(parcel, iF0);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f629a) {
            case 0:
                int iB0 = C2.a.b0(parcel);
                int iO = 0;
                boolean zK = false;
                boolean zK2 = false;
                boolean zK3 = false;
                java.lang.String strO = null;
                java.lang.String strO2 = null;
                java.lang.String strO3 = null;
                java.lang.String strO4 = null;
                java.lang.String strO5 = null;
                while (parcel.dataPosition() < iB0) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            iO = C2.a.O(parcel, i3);
                            break;
                        case 3:
                            zK = C2.a.K(parcel, i3);
                            break;
                        case 4:
                            zK2 = C2.a.K(parcel, i3);
                            break;
                        case 5:
                            strO = C2.a.o(parcel, i3);
                            break;
                        case 6:
                            strO2 = C2.a.o(parcel, i3);
                            break;
                        case 7:
                            strO3 = C2.a.o(parcel, i3);
                            break;
                        case '\b':
                            strO4 = C2.a.o(parcel, i3);
                            break;
                        case '\t':
                            strO5 = C2.a.o(parcel, i3);
                            break;
                        case '\n':
                            zK3 = C2.a.K(parcel, i3);
                            break;
                        default:
                            C2.a.V(parcel, i3);
                            break;
                    }
                }
                C2.a.t(parcel, iB0);
                return new B3.C0091d(iO, zK, zK2, strO, strO2, strO3, strO4, strO5, zK3);
            case 1:
                int iB1 = C2.a.b0(parcel);
                double dM = 0.0d;
                p184w3.C2969d c2969d = null;
                p184w3.w wVar = null;
                boolean zK4 = false;
                int iO2 = 0;
                int iO3 = 0;
                double dM2 = 0.0d;
                while (parcel.dataPosition() < iB1) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            dM = C2.a.M(parcel, i9);
                            break;
                        case 3:
                            zK4 = C2.a.K(parcel, i9);
                            break;
                        case 4:
                            iO2 = C2.a.O(parcel, i9);
                            break;
                        case 5:
                            c2969d = (p184w3.C2969d) C2.a.n(parcel, i9, p184w3.C2969d.CREATOR);
                            break;
                        case 6:
                            iO3 = C2.a.O(parcel, i9);
                            break;
                        case 7:
                            wVar = (p184w3.w) C2.a.n(parcel, i9, p184w3.w.CREATOR);
                            break;
                        case '\b':
                            dM2 = C2.a.M(parcel, i9);
                            break;
                        default:
                            C2.a.V(parcel, i9);
                            break;
                    }
                }
                C2.a.t(parcel, iB1);
                B3.f fVar = new B3.f();
                fVar.f630h = dM;
                fVar.f631i = zK4;
                fVar.j = iO2;
                fVar.f632k = c2969d;
                fVar.f633l = iO3;
                fVar.f634m = wVar;
                fVar.f635n = dM2;
                return fVar;
            case 2:
                int iB2 = C2.a.b0(parcel);
                java.lang.String strO6 = null;
                while (parcel.dataPosition() < iB2) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 2) {
                        C2.a.V(parcel, i10);
                    } else {
                        strO6 = C2.a.o(parcel, i10);
                    }
                }
                C2.a.t(parcel, iB2);
                return new B3.C0090c(strO6);
            case 3:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
            case 4:
                int iB3 = C2.a.b0(parcel);
                android.app.PendingIntent pendingIntent = null;
                java.lang.String strO7 = null;
                java.lang.Integer numP = null;
                int iO4 = 0;
                int iO5 = 0;
                while (parcel.dataPosition() < iB3) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        iO4 = C2.a.O(parcel, i11);
                    } else if (c9 == 2) {
                        iO5 = C2.a.O(parcel, i11);
                    } else if (c9 == 3) {
                        pendingIntent = (android.app.PendingIntent) C2.a.n(parcel, i11, android.app.PendingIntent.CREATOR);
                    } else if (c9 == 4) {
                        strO7 = C2.a.o(parcel, i11);
                    } else if (c9 != 5) {
                        C2.a.V(parcel, i11);
                    } else {
                        numP = C2.a.P(parcel, i11);
                    }
                }
                C2.a.t(parcel, iB3);
                return new D3.b(iO4, iO5, pendingIntent, strO7, numP);
            case 5:
                int iB4 = C2.a.b0(parcel);
                int iO6 = 0;
                boolean zK5 = false;
                long jQ = -1;
                java.lang.String strO8 = null;
                while (parcel.dataPosition() < iB4) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        strO8 = C2.a.o(parcel, i12);
                    } else if (c10 == 2) {
                        iO6 = C2.a.O(parcel, i12);
                    } else if (c10 == 3) {
                        jQ = C2.a.Q(parcel, i12);
                    } else if (c10 != 4) {
                        C2.a.V(parcel, i12);
                    } else {
                        zK5 = C2.a.K(parcel, i12);
                    }
                }
                C2.a.t(parcel, iB4);
                return new D3.d(strO8, iO6, jQ, zK5);
            case 6:
                int iB5 = C2.a.b0(parcel);
                java.lang.String strO9 = null;
                int iO7 = 0;
                while (parcel.dataPosition() < iB5) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iO7 = C2.a.O(parcel, i13);
                    } else if (c11 != 2) {
                        C2.a.V(parcel, i13);
                    } else {
                        strO9 = C2.a.o(parcel, i13);
                    }
                }
                C2.a.t(parcel, iB5);
                return new com.google.android.gms.common.api.Scope(iO7, strO9);
            case 7:
                int iB6 = C2.a.b0(parcel);
                java.lang.String strO10 = null;
                D3.b bVar = null;
                int iO8 = 0;
                android.app.PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iB6) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        iO8 = C2.a.O(parcel, i14);
                    } else if (c12 == 2) {
                        strO10 = C2.a.o(parcel, i14);
                    } else if (c12 == 3) {
                        pendingIntent2 = (android.app.PendingIntent) C2.a.n(parcel, i14, android.app.PendingIntent.CREATOR);
                    } else if (c12 != 4) {
                        C2.a.V(parcel, i14);
                    } else {
                        bVar = (D3.b) C2.a.n(parcel, i14, D3.b.CREATOR);
                    }
                }
                C2.a.t(parcel, iB6);
                return new com.google.android.gms.common.api.Status(iO8, strO10, pendingIntent2, bVar);
            case 8:
                int iB7 = C2.a.b0(parcel);
                int iO9 = 0;
                int iO10 = 0;
                android.net.Uri uri = null;
                int iO11 = 0;
                while (parcel.dataPosition() < iB7) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        iO9 = C2.a.O(parcel, i15);
                    } else if (c13 == 2) {
                        uri = (android.net.Uri) C2.a.n(parcel, i15, android.net.Uri.CREATOR);
                    } else if (c13 == 3) {
                        iO11 = C2.a.O(parcel, i15);
                    } else if (c13 != 4) {
                        C2.a.V(parcel, i15);
                    } else {
                        iO10 = C2.a.O(parcel, i15);
                    }
                }
                C2.a.t(parcel, iB7);
                return new G3.a(iO9, uri, iO11, iO10);
            case 9:
                H1.h hVar = new H1.h(parcel);
                hVar.f3865h = parcel.readInt();
                return hVar;
            case 10:
                int iB8 = C2.a.b0(parcel);
                java.util.ArrayList arrayListR = null;
                int iO12 = 0;
                while (parcel.dataPosition() < iB8) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        iO12 = C2.a.O(parcel, i16);
                    } else if (c14 != 2) {
                        C2.a.V(parcel, i16);
                    } else {
                        arrayListR = C2.a.r(parcel, i16, H3.C0377f.CREATOR);
                    }
                }
                C2.a.t(parcel, iB8);
                return new H3.i(iO12, arrayListR);
            case 11:
                int iB9 = C2.a.b0(parcel);
                int iO13 = -1;
                int iO14 = 0;
                int iO15 = 0;
                int iO16 = 0;
                int iO17 = 0;
                java.lang.String strO11 = null;
                java.lang.String strO12 = null;
                long jQ2 = 0;
                long jQ3 = 0;
                while (parcel.dataPosition() < iB9) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            iO14 = C2.a.O(parcel, i17);
                            break;
                        case 2:
                            iO15 = C2.a.O(parcel, i17);
                            break;
                        case 3:
                            iO16 = C2.a.O(parcel, i17);
                            break;
                        case 4:
                            jQ2 = C2.a.Q(parcel, i17);
                            break;
                        case 5:
                            jQ3 = C2.a.Q(parcel, i17);
                            break;
                        case 6:
                            strO11 = C2.a.o(parcel, i17);
                            break;
                        case 7:
                            strO12 = C2.a.o(parcel, i17);
                            break;
                        case '\b':
                            iO17 = C2.a.O(parcel, i17);
                            break;
                        case '\t':
                            iO13 = C2.a.O(parcel, i17);
                            break;
                        default:
                            C2.a.V(parcel, i17);
                            break;
                    }
                }
                C2.a.t(parcel, iB9);
                return new H3.C0377f(iO14, iO15, iO16, jQ2, jQ3, strO11, strO12, iO17, iO13);
            case 12:
                int iB10 = C2.a.b0(parcel);
                android.accounts.Account account = null;
                int iO18 = 0;
                int iO19 = 0;
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iB10) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        iO18 = C2.a.O(parcel, i18);
                    } else if (c15 == 2) {
                        account = (android.accounts.Account) C2.a.n(parcel, i18, android.accounts.Account.CREATOR);
                    } else if (c15 == 3) {
                        iO19 = C2.a.O(parcel, i18);
                    } else if (c15 != 4) {
                        C2.a.V(parcel, i18);
                    } else {
                        googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) C2.a.n(parcel, i18, com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR);
                    }
                }
                C2.a.t(parcel, iB10);
                return new H3.m(iO18, account, iO19, googleSignInAccount);
            case 13:
                int iB11 = C2.a.b0(parcel);
                int iO20 = 0;
                boolean zK6 = false;
                boolean zK7 = false;
                android.os.IBinder iBinderN = null;
                D3.b bVar2 = null;
                while (parcel.dataPosition() < iB11) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 1) {
                        iO20 = C2.a.O(parcel, i19);
                    } else if (c16 == 2) {
                        iBinderN = C2.a.N(parcel, i19);
                    } else if (c16 == 3) {
                        bVar2 = (D3.b) C2.a.n(parcel, i19, D3.b.CREATOR);
                    } else if (c16 == 4) {
                        zK6 = C2.a.K(parcel, i19);
                    } else if (c16 != 5) {
                        C2.a.V(parcel, i19);
                    } else {
                        zK7 = C2.a.K(parcel, i19);
                    }
                }
                C2.a.t(parcel, iB11);
                return new H3.n(iO20, iBinderN, bVar2, zK6, zK7);
            case 14:
                int iB12 = C2.a.b0(parcel);
                int iO21 = 0;
                int iO22 = 0;
                int iO23 = 0;
                boolean zK8 = false;
                boolean zK9 = false;
                while (parcel.dataPosition() < iB12) {
                    int i20 = parcel.readInt();
                    char c17 = (char) i20;
                    if (c17 == 1) {
                        iO21 = C2.a.O(parcel, i20);
                    } else if (c17 == 2) {
                        zK8 = C2.a.K(parcel, i20);
                    } else if (c17 == 3) {
                        zK9 = C2.a.K(parcel, i20);
                    } else if (c17 == 4) {
                        iO22 = C2.a.O(parcel, i20);
                    } else if (c17 != 5) {
                        C2.a.V(parcel, i20);
                    } else {
                        iO23 = C2.a.O(parcel, i20);
                    }
                }
                C2.a.t(parcel, iB12);
                return new H3.h(iO21, iO22, iO23, zK8, zK9);
            case 15:
                return new com.google.android.gms.common.internal.BinderWrapper(parcel);
            case 16:
                int iB13 = C2.a.b0(parcel);
                android.os.Bundle bundleJ = null;
                H3.C0374c c0374c = null;
                int iO24 = 0;
                D3.d[] dVarArr = null;
                while (parcel.dataPosition() < iB13) {
                    int i21 = parcel.readInt();
                    char c18 = (char) i21;
                    if (c18 == 1) {
                        bundleJ = C2.a.j(parcel, i21);
                    } else if (c18 == 2) {
                        dVarArr = (D3.d[]) C2.a.q(parcel, i21, D3.d.CREATOR);
                    } else if (c18 == 3) {
                        iO24 = C2.a.O(parcel, i21);
                    } else if (c18 != 4) {
                        C2.a.V(parcel, i21);
                    } else {
                        c0374c = (H3.C0374c) C2.a.n(parcel, i21, H3.C0374c.CREATOR);
                    }
                }
                C2.a.t(parcel, iB13);
                H3.y yVar = new H3.y();
                yVar.f4011h = bundleJ;
                yVar.f4012i = dVarArr;
                yVar.j = iO24;
                yVar.f4013k = c0374c;
                return yVar;
            case 17:
                int iB14 = C2.a.b0(parcel);
                H3.h hVar2 = null;
                int[] iArrL = null;
                int[] iArrL2 = null;
                boolean zK10 = false;
                boolean zK11 = false;
                int iO25 = 0;
                while (parcel.dataPosition() < iB14) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 1:
                            hVar2 = (H3.h) C2.a.n(parcel, i22, H3.h.CREATOR);
                            break;
                        case 2:
                            zK10 = C2.a.K(parcel, i22);
                            break;
                        case 3:
                            zK11 = C2.a.K(parcel, i22);
                            break;
                        case 4:
                            iArrL = C2.a.l(parcel, i22);
                            break;
                        case 5:
                            iO25 = C2.a.O(parcel, i22);
                            break;
                        case 6:
                            iArrL2 = C2.a.l(parcel, i22);
                            break;
                        default:
                            C2.a.V(parcel, i22);
                            break;
                    }
                }
                C2.a.t(parcel, iB14);
                return new H3.C0374c(hVar2, zK10, zK11, iArrL, iO25, iArrL2);
            case 18:
                int iB15 = C2.a.b0(parcel);
                com.google.android.gms.common.api.Scope[] scopeArr = H3.C0375d.f3949v;
                android.os.Bundle bundle = new android.os.Bundle();
                D3.d[] dVarArr2 = H3.C0375d.f3950w;
                D3.d[] dVarArr3 = dVarArr2;
                java.lang.String strO13 = null;
                android.os.IBinder iBinderN2 = null;
                android.accounts.Account account2 = null;
                java.lang.String strO14 = null;
                int iO26 = 0;
                int iO27 = 0;
                int iO28 = 0;
                boolean zK12 = false;
                int iO29 = 0;
                boolean zK13 = false;
                while (parcel.dataPosition() < iB15) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            iO26 = C2.a.O(parcel, i23);
                            break;
                        case 2:
                            iO27 = C2.a.O(parcel, i23);
                            break;
                        case 3:
                            iO28 = C2.a.O(parcel, i23);
                            break;
                        case 4:
                            strO13 = C2.a.o(parcel, i23);
                            break;
                        case 5:
                            iBinderN2 = C2.a.N(parcel, i23);
                            break;
                        case 6:
                            scopeArr = (com.google.android.gms.common.api.Scope[]) C2.a.q(parcel, i23, com.google.android.gms.common.api.Scope.CREATOR);
                            break;
                        case 7:
                            bundle = C2.a.j(parcel, i23);
                            break;
                        case '\b':
                            account2 = (android.accounts.Account) C2.a.n(parcel, i23, android.accounts.Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            C2.a.V(parcel, i23);
                            break;
                        case '\n':
                            dVarArr2 = (D3.d[]) C2.a.q(parcel, i23, D3.d.CREATOR);
                            break;
                        case 11:
                            dVarArr3 = (D3.d[]) C2.a.q(parcel, i23, D3.d.CREATOR);
                            break;
                        case '\f':
                            zK12 = C2.a.K(parcel, i23);
                            break;
                        case '\r':
                            iO29 = C2.a.O(parcel, i23);
                            break;
                        case 14:
                            zK13 = C2.a.K(parcel, i23);
                            break;
                        case 15:
                            strO14 = C2.a.o(parcel, i23);
                            break;
                    }
                }
                C2.a.t(parcel, iB15);
                return new H3.C0375d(iO26, iO27, iO28, strO13, iBinderN2, scopeArr, bundle, account2, dVarArr2, dVarArr3, zK12, iO29, zK13, strO14);
            case 19:
                try {
                    return com.google.android.gms.fido.common.Transport.a(parcel.readString());
                } catch (R3.a e6) {
                    throw new java.lang.RuntimeException(e6);
                }
            case 20:
                try {
                    return T3.EnumC0912c.a(parcel.readString());
                } catch (T3.C0911b e9) {
                    throw new java.lang.RuntimeException(e9);
                }
            case 21:
                int iB16 = C2.a.b0(parcel);
                boolean zK14 = false;
                while (parcel.dataPosition() < iB16) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        C2.a.V(parcel, i24);
                    } else {
                        zK14 = C2.a.K(parcel, i24);
                    }
                }
                C2.a.t(parcel, iB16);
                return new T3.M(zK14);
            case 22:
                int iB17 = C2.a.b0(parcel);
                long jQ4 = 0;
                while (parcel.dataPosition() < iB17) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        C2.a.V(parcel, i25);
                    } else {
                        jQ4 = C2.a.Q(parcel, i25);
                    }
                }
                C2.a.t(parcel, iB17);
                return new T3.B(jQ4);
            case 23:
                int iB18 = C2.a.b0(parcel);
                boolean zK15 = false;
                while (parcel.dataPosition() < iB18) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        C2.a.V(parcel, i26);
                    } else {
                        zK15 = C2.a.K(parcel, i26);
                    }
                }
                C2.a.t(parcel, iB18);
                return new T3.C(zK15);
            case 24:
                int iB19 = C2.a.b0(parcel);
                boolean zK16 = false;
                while (parcel.dataPosition() < iB19) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        C2.a.V(parcel, i27);
                    } else {
                        zK16 = C2.a.K(parcel, i27);
                    }
                }
                C2.a.t(parcel, iB19);
                return new T3.C0921l(zK16);
            case 25:
                int iB20 = C2.a.b0(parcel);
                java.lang.String strO15 = null;
                while (parcel.dataPosition() < iB20) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        C2.a.V(parcel, i28);
                    } else {
                        strO15 = C2.a.o(parcel, i28);
                    }
                }
                C2.a.t(parcel, iB20);
                return new T3.D(strO15);
            case 26:
                int iB21 = C2.a.b0(parcel);
                int iO30 = 0;
                byte[] bArrK = null;
                byte[] bArrK2 = null;
                byte[] bArrK3 = null;
                while (parcel.dataPosition() < iB21) {
                    int i29 = parcel.readInt();
                    char c19 = (char) i29;
                    if (c19 == 1) {
                        bArrK = C2.a.k(parcel, i29);
                    } else if (c19 == 2) {
                        bArrK2 = C2.a.k(parcel, i29);
                    } else if (c19 == 3) {
                        bArrK3 = C2.a.k(parcel, i29);
                    } else if (c19 != 4) {
                        C2.a.V(parcel, i29);
                    } else {
                        iO30 = C2.a.O(parcel, i29);
                    }
                }
                C2.a.t(parcel, iB21);
                return new T3.E(bArrK == null ? null : p014b4.x.q(bArrK, bArrK.length), bArrK2 == null ? null : p014b4.x.q(bArrK2, bArrK2.length), bArrK3 != null ? p014b4.x.q(bArrK3, bArrK3.length) : null, iO30);
            case 27:
                int iB22 = C2.a.b0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iB22) {
                            C2.a.t(parcel, iB22);
                            return new T3.F(bArr);
                        }
                        int i30 = parcel.readInt();
                        if (((char) i30) != 1) {
                            C2.a.V(parcel, i30);
                        } else {
                            int iR = C2.a.R(parcel, i30);
                            int iDataPosition = parcel.dataPosition();
                            if (iR == 0) {
                            }
                            int i31 = parcel.readInt();
                            byte[][] bArr2 = new byte[i31][];
                            for (int i32 = 0; i32 < i31; i32++) {
                                bArr2[i32] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iR);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
            case 28:
                int iB23 = C2.a.b0(parcel);
                T3.p pVar = null;
                T3.s sVar = null;
                byte[] bArrK4 = null;
                java.util.ArrayList arrayListR2 = null;
                java.lang.Double dValueOf = null;
                java.util.ArrayList arrayListR3 = null;
                T3.C0916g c0916g = null;
                java.lang.Integer numP2 = null;
                T3.y yVar2 = null;
                java.lang.String strO16 = null;
                T3.C0915f c0915f = null;
                java.lang.String strO17 = null;
                android.os.ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iB23) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 2:
                            pVar = (T3.p) C2.a.n(parcel, i33, T3.p.CREATOR);
                            break;
                        case 3:
                            sVar = (T3.s) C2.a.n(parcel, i33, T3.s.CREATOR);
                            break;
                        case 4:
                            bArrK4 = C2.a.k(parcel, i33);
                            break;
                        case 5:
                            arrayListR2 = C2.a.r(parcel, i33, T3.o.CREATOR);
                            break;
                        case 6:
                            int iR2 = C2.a.R(parcel, i33);
                            if (iR2 == 0) {
                                dValueOf = null;
                            } else {
                                C2.a.g0(parcel, iR2, 8);
                                dValueOf = java.lang.Double.valueOf(parcel.readDouble());
                            }
                            break;
                        case 7:
                            arrayListR3 = C2.a.r(parcel, i33, T3.n.CREATOR);
                            break;
                        case '\b':
                            c0916g = (T3.C0916g) C2.a.n(parcel, i33, T3.C0916g.CREATOR);
                            break;
                        case '\t':
                            numP2 = C2.a.P(parcel, i33);
                            break;
                        case '\n':
                            yVar2 = (T3.y) C2.a.n(parcel, i33, T3.y.CREATOR);
                            break;
                        case 11:
                            strO16 = C2.a.o(parcel, i33);
                            break;
                        case '\f':
                            c0915f = (T3.C0915f) C2.a.n(parcel, i33, T3.C0915f.CREATOR);
                            break;
                        case '\r':
                            strO17 = C2.a.o(parcel, i33);
                            break;
                        case 14:
                            resultReceiver = (android.os.ResultReceiver) C2.a.n(parcel, i33, android.os.ResultReceiver.CREATOR);
                            break;
                        default:
                            C2.a.V(parcel, i33);
                            break;
                    }
                }
                C2.a.t(parcel, iB23);
                return new T3.C0922m(pVar, sVar, bArrK4, arrayListR2, dValueOf, arrayListR3, c0916g, numP2, yVar2, strO16, c0915f, strO17, resultReceiver);
            default:
                int iB24 = C2.a.b0(parcel);
                java.lang.String strO18 = null;
                byte[] bArrK5 = null;
                java.util.ArrayList arrayListR4 = null;
                while (parcel.dataPosition() < iB24) {
                    int i34 = parcel.readInt();
                    char c20 = (char) i34;
                    if (c20 == 2) {
                        strO18 = C2.a.o(parcel, i34);
                    } else if (c20 == 3) {
                        bArrK5 = C2.a.k(parcel, i34);
                    } else if (c20 != 4) {
                        C2.a.V(parcel, i34);
                    } else {
                        arrayListR4 = C2.a.r(parcel, i34, com.google.android.gms.fido.common.Transport.CREATOR);
                    }
                }
                C2.a.t(parcel, iB24);
                return new T3.n(strO18, bArrK5, arrayListR4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i3) {
        switch (this.f629a) {
            case 0:
                return new B3.C0091d[i3];
            case 1:
                return new B3.f[i3];
            case 2:
                return new B3.C0090c[i3];
            case 3:
                return new androidx.versionedparcelable.ParcelImpl[i3];
            case 4:
                return new D3.b[i3];
            case 5:
                return new D3.d[i3];
            case 6:
                return new com.google.android.gms.common.api.Scope[i3];
            case 7:
                return new com.google.android.gms.common.api.Status[i3];
            case 8:
                return new G3.a[i3];
            case 9:
                return new H1.h[i3];
            case 10:
                return new H3.i[i3];
            case 11:
                return new H3.C0377f[i3];
            case 12:
                return new H3.m[i3];
            case 13:
                return new H3.n[i3];
            case 14:
                return new H3.h[i3];
            case 15:
                return new com.google.android.gms.common.internal.BinderWrapper[i3];
            case 16:
                return new H3.y[i3];
            case 17:
                return new H3.C0374c[i3];
            case 18:
                return new H3.C0375d[i3];
            case 19:
                return new com.google.android.gms.fido.common.Transport[i3];
            case 20:
                return new T3.EnumC0912c[i3];
            case 21:
                return new T3.M[i3];
            case 22:
                return new T3.B[i3];
            case 23:
                return new T3.C[i3];
            case 24:
                return new T3.C0921l[i3];
            case 25:
                return new T3.D[i3];
            case 26:
                return new T3.E[i3];
            case 27:
                return new T3.F[i3];
            case 28:
                return new T3.C0922m[i3];
            default:
                return new T3.n[i3];
        }
    }
}
