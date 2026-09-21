package X3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends X3.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f10842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X3.g
    public final boolean b0(int i3, android.os.Parcel parcel, android.os.Parcel parcel2) {
        com.google.android.gms.common.api.internal.BasePendingResult basePendingResult;
        com.google.android.gms.common.api.internal.BasePendingResult basePendingResult2;
        java.lang.String strD;
        java.lang.Object obj = this.f10842e;
        switch (this.f10841d) {
            case 0:
                if (i3 != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) X3.h.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                p148r3.i iVar = (p148r3.i) X3.h.a(parcel, p148r3.i.CREATOR);
                X3.h.b(parcel);
                C2.a.U(status, iVar, (p059g4.d) obj);
                return true;
            case 1:
                if (i3 != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) X3.h.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                p148r3.f fVar = (p148r3.f) X3.h.a(parcel, p148r3.f.CREATOR);
                X3.h.b(parcel);
                C2.a.U(status2, fVar, (p059g4.d) obj);
                return true;
            case 2:
                if (i3 != 1) {
                    return false;
                }
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) X3.h.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) X3.h.a(parcel, android.app.PendingIntent.CREATOR);
                X3.h.b(parcel);
                C2.a.U(status3, pendingIntent, (p059g4.d) obj);
                return true;
            default:
                com.google.android.gms.auth.api.signin.RevocationBoundService revocationBoundService = (com.google.android.gms.auth.api.signin.RevocationBoundService) obj;
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
                com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccountB = bVarA.b();
                com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptionsA = com.google.android.gms.auth.api.signin.GoogleSignInOptions.f18589r;
                if (googleSignInAccountB != null) {
                    java.lang.String strD2 = bVarA.d("defaultGoogleSignInAccount");
                    if (android.text.TextUtils.isEmpty(strD2) || (strD = bVarA.d(p166t3.b.f("googleSignInOptions", strD2))) == null) {
                        googleSignInOptionsA = null;
                    } else {
                        try {
                            googleSignInOptionsA = com.google.android.gms.auth.api.signin.GoogleSignInOptions.a(strD);
                        } catch (org.json.JSONException unused) {
                            googleSignInOptionsA = null;
                        }
                    }
                }
                com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = googleSignInOptionsA;
                H3.q.g(googleSignInOptions);
                com.google.android.gms.internal.cast.J j = new com.google.android.gms.internal.cast.J((com.google.android.gms.auth.api.signin.RevocationBoundService) obj, null, p139q3.a.f26623a, googleSignInOptions, new E3.e(new F3.C0361a(), android.os.Looper.getMainLooper()));
                F3.v vVar = j.f2835h;
                android.content.Context context = j.f2829a;
                if (googleSignInAccountB == null) {
                    boolean z6 = j.d() == 3;
                    B8.h hVar = p166t3.h.f27780a;
                    if (hVar.f861i <= 3) {
                        android.util.Log.d((java.lang.String) hVar.f862k, ((java.lang.String) hVar.j).concat("Signing out"));
                    }
                    p166t3.h.a(context);
                    if (z6) {
                        com.google.android.gms.common.api.Status status4 = com.google.android.gms.common.api.Status.f18685l;
                        F3.m mVar = new F3.m(vVar, 0);
                        mVar.n0(status4);
                        basePendingResult = mVar;
                    } else {
                        p166t3.g gVar = new p166t3.g(vVar, 0);
                        vVar.a(gVar);
                        basePendingResult = gVar;
                    }
                    basePendingResult.i0(new F3.o(basePendingResult, new p059g4.d(), new B3.o(12)));
                    return true;
                }
                boolean z9 = j.d() == 3;
                B8.h hVar2 = p166t3.h.f27780a;
                if (hVar2.f861i <= 3) {
                    android.util.Log.d((java.lang.String) hVar2.f862k, ((java.lang.String) hVar2.j).concat("Revoking access"));
                }
                java.lang.String strD3 = p166t3.b.a(context).d("refreshToken");
                p166t3.h.a(context);
                if (!z9) {
                    p166t3.g gVar2 = new p166t3.g(vVar, 1);
                    vVar.a(gVar2);
                    basePendingResult2 = gVar2;
                } else if (strD3 == null) {
                    B8.h hVar3 = p166t3.c.j;
                    com.google.android.gms.common.api.Status status5 = new com.google.android.gms.common.api.Status(4, null, null, null);
                    H3.q.a("Status code must not be SUCCESS", !status5.a());
                    E3.m mVar2 = new E3.m(status5);
                    mVar2.n0(status5);
                    basePendingResult2 = mVar2;
                } else {
                    p166t3.c cVar = new p166t3.c(strD3);
                    new java.lang.Thread(cVar).start();
                    basePendingResult2 = cVar.f27768i;
                }
                basePendingResult2.i0(new F3.o(basePendingResult2, new p059g4.d(), new B3.o(12)));
                return true;
        }
    }

    public void d0() {
        int callingUid = android.os.Binder.getCallingUid();
        com.google.android.gms.auth.api.signin.RevocationBoundService revocationBoundService = (com.google.android.gms.auth.api.signin.RevocationBoundService) this.f10842e;
        D3.j jVarA = N3.b.a(revocationBoundService);
        jVarA.getClass();
        try {
            android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) jVarA.f2115a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new java.lang.NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            try {
                android.content.pm.PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                D3.j jVarC = D3.j.c(revocationBoundService);
                jVarC.getClass();
                if (packageInfo != null) {
                    if (D3.j.d(packageInfo, false)) {
                        return;
                    }
                    if (D3.j.d(packageInfo, true)) {
                        android.content.Context context = jVarC.f2115a;
                        try {
                            if (!D3.i.f2111c) {
                                android.content.pm.PackageInfo packageInfo2 = N3.b.a(context).f2115a.getPackageManager().getPackageInfo("com.google.android.gms", android.os.Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                D3.j.c(context);
                                if (packageInfo2 == null || D3.j.d(packageInfo2, false) || !D3.j.d(packageInfo2, true)) {
                                    D3.i.f2110b = false;
                                } else {
                                    D3.i.f2110b = true;
                                }
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException e6) {
                            android.util.Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e6);
                        } finally {
                            D3.i.f2111c = true;
                        }
                        if (D3.i.f2110b || !io.sentry.SentryBaseEvent.JsonKeys.USER.equals(android.os.Build.TYPE)) {
                            return;
                        } else {
                            android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                if (android.util.Log.isLoggable("UidVerifier", 3)) {
                    android.util.Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
            throw new java.lang.SecurityException(Y6.f.f(android.os.Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        } catch (java.lang.SecurityException unused2) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.google.android.gms.auth.api.signin.RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f10841d = 3;
        this.f10842e = revocationBoundService;
    }
}
