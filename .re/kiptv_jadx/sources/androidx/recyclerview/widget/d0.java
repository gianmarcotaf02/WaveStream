package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements android.os.Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17393a;

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f17393a) {
            case 0:
                androidx.recyclerview.widget.e0 e0Var = new androidx.recyclerview.widget.e0();
                e0Var.f17399h = parcel.readInt();
                e0Var.f17400i = parcel.readInt();
                int i3 = parcel.readInt();
                e0Var.j = i3;
                if (i3 > 0) {
                    int[] iArr = new int[i3];
                    e0Var.f17401k = iArr;
                    parcel.readIntArray(iArr);
                }
                int i9 = parcel.readInt();
                e0Var.f17402l = i9;
                if (i9 > 0) {
                    int[] iArr2 = new int[i9];
                    e0Var.f17403m = iArr2;
                    parcel.readIntArray(iArr2);
                }
                e0Var.f17405o = parcel.readInt() == 1;
                e0Var.f17406p = parcel.readInt() == 1;
                e0Var.f17407q = parcel.readInt() == 1;
                e0Var.f17404n = parcel.readArrayList(androidx.recyclerview.widget.c0.class.getClassLoader());
                return e0Var;
            case 1:
                kotlin.jvm.internal.m.e(parcel, "parcel");
                return new p046f.a(parcel.readInt() == 0 ? null : (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 2:
                kotlin.jvm.internal.m.e(parcel, "inParcel");
                android.os.Parcelable parcelable = parcel.readParcelable(android.content.IntentSender.class.getClassLoader());
                kotlin.jvm.internal.m.b(parcelable);
                return new p046f.h((android.content.IntentSender) parcelable, (android.content.Intent) parcel.readParcelable(android.content.Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 3:
                int iB0 = C2.a.b0(parcel);
                android.content.Intent intent = null;
                int iO = 0;
                int iO2 = 0;
                while (parcel.dataPosition() < iB0) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        iO = C2.a.O(parcel, i10);
                    } else if (c9 == 2) {
                        iO2 = C2.a.O(parcel, i10);
                    } else if (c9 != 3) {
                        C2.a.V(parcel, i10);
                    } else {
                        intent = (android.content.Intent) C2.a.n(parcel, i10, android.content.Intent.CREATOR);
                    }
                }
                C2.a.t(parcel, iB0);
                return new p051f4.b(iO, iO2, intent);
            case 4:
                int iB1 = C2.a.b0(parcel);
                java.util.ArrayList arrayListP = null;
                java.lang.String strO = null;
                while (parcel.dataPosition() < iB1) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        arrayListP = C2.a.p(parcel, i11);
                    } else if (c10 != 2) {
                        C2.a.V(parcel, i11);
                    } else {
                        strO = C2.a.o(parcel, i11);
                    }
                }
                C2.a.t(parcel, iB1);
                return new p051f4.d(strO, arrayListP);
            case 5:
                int iB2 = C2.a.b0(parcel);
                D3.b bVar = null;
                int iO3 = 0;
                H3.n nVar = null;
                while (parcel.dataPosition() < iB2) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        iO3 = C2.a.O(parcel, i12);
                    } else if (c11 == 2) {
                        bVar = (D3.b) C2.a.n(parcel, i12, D3.b.CREATOR);
                    } else if (c11 != 3) {
                        C2.a.V(parcel, i12);
                    } else {
                        nVar = (H3.n) C2.a.n(parcel, i12, H3.n.CREATOR);
                    }
                }
                C2.a.t(parcel, iB2);
                return new p051f4.e(iO3, bVar, nVar);
            case 6:
                p103m.M m8 = new p103m.M(parcel);
                m8.f24942h = parcel.readByte() != 0;
                return m8;
            case 7:
                int iB3 = C2.a.b0(parcel);
                boolean zK = false;
                int iO4 = 0;
                boolean zK2 = false;
                p148r3.d dVar = null;
                p148r3.a aVar = null;
                java.lang.String strO2 = null;
                p148r3.c cVar = null;
                p148r3.b bVar2 = null;
                while (parcel.dataPosition() < iB3) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            dVar = (p148r3.d) C2.a.n(parcel, i13, p148r3.d.CREATOR);
                            break;
                        case 2:
                            aVar = (p148r3.a) C2.a.n(parcel, i13, p148r3.a.CREATOR);
                            break;
                        case 3:
                            strO2 = C2.a.o(parcel, i13);
                            break;
                        case 4:
                            zK = C2.a.K(parcel, i13);
                            break;
                        case 5:
                            iO4 = C2.a.O(parcel, i13);
                            break;
                        case 6:
                            cVar = (p148r3.c) C2.a.n(parcel, i13, p148r3.c.CREATOR);
                            break;
                        case 7:
                            bVar2 = (p148r3.b) C2.a.n(parcel, i13, p148r3.b.CREATOR);
                            break;
                        case '\b':
                            zK2 = C2.a.K(parcel, i13);
                            break;
                        default:
                            C2.a.V(parcel, i13);
                            break;
                    }
                }
                C2.a.t(parcel, iB3);
                return new p148r3.e(dVar, aVar, strO2, zK, iO4, cVar, bVar2, zK2);
            case 8:
                int iB4 = C2.a.b0(parcel);
                android.app.PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iB4) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        C2.a.V(parcel, i14);
                    } else {
                        pendingIntent = (android.app.PendingIntent) C2.a.n(parcel, i14, android.app.PendingIntent.CREATOR);
                    }
                }
                C2.a.t(parcel, iB4);
                return new p148r3.f(pendingIntent);
            case 9:
                int iB5 = C2.a.b0(parcel);
                int iO5 = 0;
                boolean zK3 = false;
                java.lang.String strO3 = null;
                java.lang.String strO4 = null;
                java.lang.String strO5 = null;
                java.lang.String strO6 = null;
                while (parcel.dataPosition() < iB5) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strO3 = C2.a.o(parcel, i15);
                            break;
                        case 2:
                            strO4 = C2.a.o(parcel, i15);
                            break;
                        case 3:
                            strO5 = C2.a.o(parcel, i15);
                            break;
                        case 4:
                            strO6 = C2.a.o(parcel, i15);
                            break;
                        case 5:
                            zK3 = C2.a.K(parcel, i15);
                            break;
                        case 6:
                            iO5 = C2.a.O(parcel, i15);
                            break;
                        default:
                            C2.a.V(parcel, i15);
                            break;
                    }
                }
                C2.a.t(parcel, iB5);
                return new p148r3.g(iO5, strO3, strO4, strO5, strO6, zK3);
            case 10:
                int iB6 = C2.a.b0(parcel);
                boolean zK4 = false;
                boolean zK5 = false;
                boolean zK6 = false;
                java.lang.String strO7 = null;
                java.lang.String strO8 = null;
                java.lang.String strO9 = null;
                java.util.ArrayList arrayListP2 = null;
                while (parcel.dataPosition() < iB6) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            zK4 = C2.a.K(parcel, i16);
                            break;
                        case 2:
                            strO7 = C2.a.o(parcel, i16);
                            break;
                        case 3:
                            strO8 = C2.a.o(parcel, i16);
                            break;
                        case 4:
                            zK5 = C2.a.K(parcel, i16);
                            break;
                        case 5:
                            strO9 = C2.a.o(parcel, i16);
                            break;
                        case 6:
                            arrayListP2 = C2.a.p(parcel, i16);
                            break;
                        case 7:
                            zK6 = C2.a.K(parcel, i16);
                            break;
                        default:
                            C2.a.V(parcel, i16);
                            break;
                    }
                }
                C2.a.t(parcel, iB6);
                return new p148r3.a(zK4, strO7, strO8, zK5, strO9, arrayListP2, zK6);
            case 11:
                int iB7 = C2.a.b0(parcel);
                java.lang.String strO10 = null;
                boolean zK7 = false;
                while (parcel.dataPosition() < iB7) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        zK7 = C2.a.K(parcel, i17);
                    } else if (c12 != 2) {
                        C2.a.V(parcel, i17);
                    } else {
                        strO10 = C2.a.o(parcel, i17);
                    }
                }
                C2.a.t(parcel, iB7);
                return new p148r3.b(zK7, strO10);
            case 12:
                int iB8 = C2.a.b0(parcel);
                byte[] bArrK = null;
                boolean zK8 = false;
                java.lang.String strO11 = null;
                while (parcel.dataPosition() < iB8) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        zK8 = C2.a.K(parcel, i18);
                    } else if (c13 == 2) {
                        bArrK = C2.a.k(parcel, i18);
                    } else if (c13 != 3) {
                        C2.a.V(parcel, i18);
                    } else {
                        strO11 = C2.a.o(parcel, i18);
                    }
                }
                C2.a.t(parcel, iB8);
                return new p148r3.c(strO11, zK8, bArrK);
            case 13:
                int iB9 = C2.a.b0(parcel);
                boolean zK9 = false;
                while (parcel.dataPosition() < iB9) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        C2.a.V(parcel, i19);
                    } else {
                        zK9 = C2.a.K(parcel, i19);
                    }
                }
                C2.a.t(parcel, iB9);
                return new p148r3.d(zK9);
            case 14:
                int iB10 = C2.a.b0(parcel);
                int iO6 = 0;
                p148r3.j jVar = null;
                java.lang.String strO12 = null;
                while (parcel.dataPosition() < iB10) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 1) {
                        jVar = (p148r3.j) C2.a.n(parcel, i20, p148r3.j.CREATOR);
                    } else if (c14 == 2) {
                        strO12 = C2.a.o(parcel, i20);
                    } else if (c14 != 3) {
                        C2.a.V(parcel, i20);
                    } else {
                        iO6 = C2.a.O(parcel, i20);
                    }
                }
                C2.a.t(parcel, iB10);
                return new p148r3.h(jVar, strO12, iO6);
            case 15:
                int iB11 = C2.a.b0(parcel);
                android.app.PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iB11) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        C2.a.V(parcel, i21);
                    } else {
                        pendingIntent2 = (android.app.PendingIntent) C2.a.n(parcel, i21, android.app.PendingIntent.CREATOR);
                    }
                }
                C2.a.t(parcel, iB11);
                return new p148r3.i(pendingIntent2);
            case 16:
                int iB12 = C2.a.b0(parcel);
                java.lang.String strO13 = null;
                java.lang.String strO14 = null;
                while (parcel.dataPosition() < iB12) {
                    int i22 = parcel.readInt();
                    char c15 = (char) i22;
                    if (c15 == 1) {
                        strO13 = C2.a.o(parcel, i22);
                    } else if (c15 != 2) {
                        C2.a.V(parcel, i22);
                    } else {
                        strO14 = C2.a.o(parcel, i22);
                    }
                }
                C2.a.t(parcel, iB12);
                return new p148r3.j(strO13, strO14);
            case 17:
                int iB13 = C2.a.b0(parcel);
                android.os.Bundle bundleJ = null;
                int iO7 = 0;
                int iO8 = 0;
                while (parcel.dataPosition() < iB13) {
                    int i23 = parcel.readInt();
                    char c16 = (char) i23;
                    if (c16 == 1) {
                        iO7 = C2.a.O(parcel, i23);
                    } else if (c16 == 2) {
                        iO8 = C2.a.O(parcel, i23);
                    } else if (c16 != 3) {
                        C2.a.V(parcel, i23);
                    } else {
                        bundleJ = C2.a.j(parcel, i23);
                    }
                }
                C2.a.t(parcel, iB13);
                return new p166t3.a(iO7, iO8, bundleJ);
            case 18:
                int iB14 = C2.a.b0(parcel);
                java.lang.String strO15 = null;
                com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iB14) {
                    int i24 = parcel.readInt();
                    char c17 = (char) i24;
                    if (c17 == 2) {
                        strO15 = C2.a.o(parcel, i24);
                    } else if (c17 != 5) {
                        C2.a.V(parcel, i24);
                    } else {
                        googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) C2.a.n(parcel, i24, com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR);
                    }
                }
                C2.a.t(parcel, iB14);
                return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration(strO15, googleSignInOptions);
            case 19:
                int iB15 = C2.a.b0(parcel);
                byte[] bArrK2 = null;
                java.lang.String strO16 = null;
                while (parcel.dataPosition() < iB15) {
                    int i25 = parcel.readInt();
                    char c18 = (char) i25;
                    if (c18 == 1) {
                        bArrK2 = C2.a.k(parcel, i25);
                    } else if (c18 != 2) {
                        C2.a.V(parcel, i25);
                    } else {
                        strO16 = C2.a.o(parcel, i25);
                    }
                }
                C2.a.t(parcel, iB15);
                return new p173u3.d(bArrK2, strO16);
            case 20:
                int iB16 = C2.a.b0(parcel);
                boolean zK10 = false;
                java.util.ArrayList arrayListP3 = null;
                while (parcel.dataPosition() < iB16) {
                    int i26 = parcel.readInt();
                    char c19 = (char) i26;
                    if (c19 == 1) {
                        arrayListP3 = C2.a.p(parcel, i26);
                    } else if (c19 != 2) {
                        C2.a.V(parcel, i26);
                    } else {
                        zK10 = C2.a.K(parcel, i26);
                    }
                }
                C2.a.t(parcel, iB16);
                return new p173u3.b(arrayListP3, zK10);
            case 21:
                int iB17 = C2.a.b0(parcel);
                boolean zK11 = false;
                java.util.ArrayList arrayListP4 = null;
                while (parcel.dataPosition() < iB17) {
                    int i27 = parcel.readInt();
                    char c20 = (char) i27;
                    if (c20 == 1) {
                        arrayListP4 = C2.a.p(parcel, i27);
                    } else if (c20 != 2) {
                        C2.a.V(parcel, i27);
                    } else {
                        zK11 = C2.a.K(parcel, i27);
                    }
                }
                C2.a.t(parcel, iB17);
                return new p173u3.c(arrayListP4, zK11);
            case 22:
                int iB18 = C2.a.b0(parcel);
                android.os.Bundle bundleJ2 = null;
                java.util.ArrayList arrayListR = null;
                while (parcel.dataPosition() < iB18) {
                    int i28 = parcel.readInt();
                    char c21 = (char) i28;
                    if (c21 == 1) {
                        bundleJ2 = C2.a.j(parcel, i28);
                    } else if (c21 != 2) {
                        C2.a.V(parcel, i28);
                    } else {
                        arrayListR = C2.a.r(parcel, i28, p173u3.d.CREATOR);
                    }
                }
                C2.a.t(parcel, iB18);
                return new p173u3.e(bundleJ2, arrayListR);
            case 23:
                int iB19 = C2.a.b0(parcel);
                java.lang.String strO17 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                boolean zK12 = false;
                byte[] bArrK3 = null;
                while (parcel.dataPosition() < iB19) {
                    int i29 = parcel.readInt();
                    char c22 = (char) i29;
                    if (c22 == 1) {
                        bArrK3 = C2.a.k(parcel, i29);
                    } else if (c22 == 2) {
                        zK12 = C2.a.K(parcel, i29);
                    } else if (c22 != 3) {
                        C2.a.V(parcel, i29);
                    } else {
                        strO17 = C2.a.o(parcel, i29);
                    }
                }
                C2.a.t(parcel, iB19);
                return new p173u3.f(strO17, zK12, bArrK3);
            case 24:
                int iB20 = C2.a.b0(parcel);
                java.lang.String strO18 = null;
                java.lang.String strO19 = null;
                java.lang.String strO20 = null;
                java.lang.String strO21 = null;
                java.lang.String strO22 = null;
                java.lang.String strO23 = null;
                java.lang.String strO24 = null;
                java.lang.String strO25 = null;
                java.lang.String strO26 = null;
                p184w3.t tVar = null;
                long jQ = 0;
                long jQ2 = 0;
                while (parcel.dataPosition() < iB20) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            strO18 = C2.a.o(parcel, i30);
                            break;
                        case 3:
                            strO19 = C2.a.o(parcel, i30);
                            break;
                        case 4:
                            jQ = C2.a.Q(parcel, i30);
                            break;
                        case 5:
                            strO20 = C2.a.o(parcel, i30);
                            break;
                        case 6:
                            strO21 = C2.a.o(parcel, i30);
                            break;
                        case 7:
                            strO22 = C2.a.o(parcel, i30);
                            break;
                        case '\b':
                            strO23 = C2.a.o(parcel, i30);
                            break;
                        case '\t':
                            strO24 = C2.a.o(parcel, i30);
                            break;
                        case '\n':
                            strO25 = C2.a.o(parcel, i30);
                            break;
                        case 11:
                            jQ2 = C2.a.Q(parcel, i30);
                            break;
                        case '\f':
                            strO26 = C2.a.o(parcel, i30);
                            break;
                        case '\r':
                            tVar = (p184w3.t) C2.a.n(parcel, i30, p184w3.t.CREATOR);
                            break;
                        default:
                            C2.a.V(parcel, i30);
                            break;
                    }
                }
                C2.a.t(parcel, iB20);
                return new p184w3.C2966a(strO18, strO19, jQ, strO20, strO21, strO22, strO23, strO24, strO25, jQ2, strO26, tVar);
            case 25:
                int iB21 = C2.a.b0(parcel);
                java.lang.String strO27 = null;
                java.lang.String strO28 = null;
                while (parcel.dataPosition() < iB21) {
                    int i31 = parcel.readInt();
                    char c23 = (char) i31;
                    if (c23 == 1) {
                        strO27 = C2.a.o(parcel, i31);
                    } else if (c23 != 2) {
                        C2.a.V(parcel, i31);
                    } else {
                        strO28 = C2.a.o(parcel, i31);
                    }
                }
                C2.a.t(parcel, iB21);
                return new p184w3.h(strO27, strO28);
            case 26:
                int iB22 = C2.a.b0(parcel);
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                while (parcel.dataPosition() < iB22) {
                    int i32 = parcel.readInt();
                    char c24 = (char) i32;
                    if (c24 == 2) {
                        C2.a.f0(parcel, i32, 4);
                        f9 = parcel.readFloat();
                    } else if (c24 == 3) {
                        C2.a.f0(parcel, i32, 4);
                        f10 = parcel.readFloat();
                    } else if (c24 != 4) {
                        C2.a.V(parcel, i32);
                    } else {
                        C2.a.f0(parcel, i32, 4);
                        f11 = parcel.readFloat();
                    }
                }
                C2.a.t(parcel, iB22);
                return new p184w3.v(f9, f10, f11);
            case 27:
                int iB23 = C2.a.b0(parcel);
                p184w3.v vVar = null;
                p184w3.v vVar2 = null;
                while (parcel.dataPosition() < iB23) {
                    int i33 = parcel.readInt();
                    char c25 = (char) i33;
                    if (c25 == 2) {
                        vVar = (p184w3.v) C2.a.n(parcel, i33, p184w3.v.CREATOR);
                    } else if (c25 != 3) {
                        C2.a.V(parcel, i33);
                    } else {
                        vVar2 = (p184w3.v) C2.a.n(parcel, i33, p184w3.v.CREATOR);
                    }
                }
                C2.a.t(parcel, iB23);
                return new p184w3.w(vVar, vVar2);
            case 28:
                int iB24 = C2.a.b0(parcel);
                boolean zK13 = false;
                boolean zK14 = false;
                boolean zK15 = false;
                java.lang.String strO29 = null;
                java.lang.String[] strArr = null;
                long jQ3 = 0;
                long jQ4 = 0;
                while (parcel.dataPosition() < iB24) {
                    int i34 = parcel.readInt();
                    switch ((char) i34) {
                        case 2:
                            jQ3 = C2.a.Q(parcel, i34);
                            break;
                        case 3:
                            strO29 = C2.a.o(parcel, i34);
                            break;
                        case 4:
                            jQ4 = C2.a.Q(parcel, i34);
                            break;
                        case 5:
                            zK13 = C2.a.K(parcel, i34);
                            break;
                        case 6:
                            int iR = C2.a.R(parcel, i34);
                            int iDataPosition = parcel.dataPosition();
                            if (iR != 0) {
                                java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
                                parcel.setDataPosition(iDataPosition + iR);
                                strArr = strArrCreateStringArray;
                            } else {
                                strArr = null;
                            }
                            break;
                        case 7:
                            zK14 = C2.a.K(parcel, i34);
                            break;
                        case '\b':
                            zK15 = C2.a.K(parcel, i34);
                            break;
                        default:
                            C2.a.V(parcel, i34);
                            break;
                    }
                }
                C2.a.t(parcel, iB24);
                return new p184w3.C2967b(jQ3, strO29, jQ4, zK13, strArr, zK14, zK15);
            default:
                int iB25 = C2.a.b0(parcel);
                java.lang.String strO30 = null;
                boolean zK16 = false;
                boolean zK17 = false;
                p184w3.h hVar = null;
                while (parcel.dataPosition() < iB25) {
                    int i35 = parcel.readInt();
                    char c26 = (char) i35;
                    if (c26 == 2) {
                        zK16 = C2.a.K(parcel, i35);
                    } else if (c26 == 3) {
                        strO30 = C2.a.o(parcel, i35);
                    } else if (c26 == 4) {
                        zK17 = C2.a.K(parcel, i35);
                    } else if (c26 != 5) {
                        C2.a.V(parcel, i35);
                    } else {
                        hVar = (p184w3.h) C2.a.n(parcel, i35, p184w3.h.CREATOR);
                    }
                }
                C2.a.t(parcel, iB25);
                return new p184w3.i(zK16, strO30, zK17, hVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i3) {
        switch (this.f17393a) {
            case 0:
                return new androidx.recyclerview.widget.e0[i3];
            case 1:
                return new p046f.a[i3];
            case 2:
                return new p046f.h[i3];
            case 3:
                return new p051f4.b[i3];
            case 4:
                return new p051f4.d[i3];
            case 5:
                return new p051f4.e[i3];
            case 6:
                return new p103m.M[i3];
            case 7:
                return new p148r3.e[i3];
            case 8:
                return new p148r3.f[i3];
            case 9:
                return new p148r3.g[i3];
            case 10:
                return new p148r3.a[i3];
            case 11:
                return new p148r3.b[i3];
            case 12:
                return new p148r3.c[i3];
            case 13:
                return new p148r3.d[i3];
            case 14:
                return new p148r3.h[i3];
            case 15:
                return new p148r3.i[i3];
            case 16:
                return new p148r3.j[i3];
            case 17:
                return new p166t3.a[i3];
            case 18:
                return new com.google.android.gms.auth.api.signin.internal.SignInConfiguration[i3];
            case 19:
                return new p173u3.d[i3];
            case 20:
                return new p173u3.b[i3];
            case 21:
                return new p173u3.c[i3];
            case 22:
                return new p173u3.e[i3];
            case 23:
                return new p173u3.f[i3];
            case 24:
                return new p184w3.C2966a[i3];
            case 25:
                return new p184w3.h[i3];
            case 26:
                return new p184w3.v[i3];
            case 27:
                return new p184w3.w[i3];
            case 28:
                return new p184w3.C2967b[i3];
            default:
                return new p184w3.i[i3];
        }
    }
}
