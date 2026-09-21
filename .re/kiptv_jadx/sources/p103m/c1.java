package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements p044e7.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f25018h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f25019i = null;
    public java.lang.Object j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f25020k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f25021l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.Object f25022m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.Object f25023n;

    public static byte[] d(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.CharConversionException {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("keysetName cannot be null");
        }
        android.content.Context applicationContext = context.getApplicationContext();
        try {
            java.lang.String string = (str2 == null ? android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return B4.k.e(string);
        } catch (java.lang.ClassCastException | java.lang.IllegalArgumentException unused) {
            throw new java.io.CharConversionException(Y6.f.h("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static o4.f e(byte[] bArr) throws java.io.IOException {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        try {
            return new o4.f(3, (A4.d0) ((A4.g0) j1.l.h(A4.g0.D(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.C1921p.a())).f23899i).v());
        } finally {
            byteArrayInputStream.close();
        }
    }

    public synchronized p174u4.a a() {
        p174u4.a aVar;
        try {
            if (((java.lang.String) this.f25019i) == null) {
                throw new java.lang.IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (p174u4.a.f28677b) {
                try {
                    byte[] bArrD = d((android.content.Context) this.f25018h, (java.lang.String) this.f25019i, (java.lang.String) this.j);
                    if (bArrD == null) {
                        if (((java.lang.String) this.f25020k) != null) {
                            this.f25021l = h();
                        }
                        this.f25023n = b();
                    } else if (((java.lang.String) this.f25020k) != null) {
                        this.f25023n = f(bArrD);
                    } else {
                        this.f25023n = e(bArrD);
                    }
                    aVar = new p174u4.a(this);
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public o4.f b() throws java.security.GeneralSecurityException, java.io.IOException {
        if (((o4.g) this.f25022m) == null) {
            throw new java.security.GeneralSecurityException("cannot read or generate keyset");
        }
        o4.f fVar = new o4.f(3, A4.g0.C());
        o4.g gVar = (o4.g) this.f25022m;
        synchronized (fVar) {
            fVar.a(gVar.f26120a);
        }
        int iA = o4.o.a((A4.g0) fVar.c().f23899i).y().A();
        synchronized (fVar) {
            for (int i3 = 0; i3 < ((A4.g0) ((A4.d0) fVar.f26119b).f19594i).z(); i3++) {
                try {
                    A4.f0 f0VarY = ((A4.g0) ((A4.d0) fVar.f26119b).f19594i).y(i3);
                    if (f0VarY.B() == iA) {
                        if (!f0VarY.D().equals(A4.Z.ENABLED)) {
                            throw new java.security.GeneralSecurityException("cannot set key as primary because it's not enabled: " + iA);
                        }
                        A4.d0 d0Var = (A4.d0) fVar.f26119b;
                        d0Var.e();
                        A4.g0.w((A4.g0) d0Var.f19594i, iA);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            throw new java.security.GeneralSecurityException("key not found: " + iA);
        }
        android.content.Context context = (android.content.Context) this.f25018h;
        java.lang.String str = (java.lang.String) this.f25019i;
        java.lang.String str2 = (java.lang.String) this.j;
        if (str == null) {
            throw new java.lang.IllegalArgumentException("keysetName cannot be null");
        }
        android.content.Context applicationContext = context.getApplicationContext();
        android.content.SharedPreferences.Editor editorEdit = str2 == null ? android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((p174u4.b) this.f25021l) != null) {
            j1.l lVarC = fVar.c();
            p174u4.b bVar = (p174u4.b) this.f25021l;
            byte[] bArr = new byte[0];
            A4.g0 g0Var = (A4.g0) lVarC.f23899i;
            byte[] bArrA = bVar.a(g0Var.e(), bArr);
            try {
                if (!A4.g0.E(bVar.b(bArrA, bArr), com.google.crypto.tink.shaded.protobuf.C1921p.a()).equals(g0Var)) {
                    throw new java.security.GeneralSecurityException("cannot encrypt keyset");
                }
                A4.M mZ = A4.N.z();
                com.google.crypto.tink.shaded.protobuf.C1914i c1914iF = com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f(bArrA, 0, bArrA.length);
                mZ.e();
                A4.N.w((A4.N) mZ.f19594i, c1914iF);
                A4.k0 k0VarA = o4.o.a(g0Var);
                mZ.e();
                A4.N.x((A4.N) mZ.f19594i, k0VarA);
                if (!editorEdit.putString(str, B4.k.f(((A4.N) mZ.b()).e())).commit()) {
                    throw new java.io.IOException("Failed to write to SharedPreferences");
                }
            } catch (com.google.crypto.tink.shaded.protobuf.D unused) {
                throw new java.security.GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, B4.k.f(((A4.g0) fVar.c().f23899i).e())).commit()) {
            throw new java.io.IOException("Failed to write to SharedPreferences");
        }
        return fVar;
    }

    @Override // p044e7.l, p044e7.m
    public void c() {
        java.util.HashMap arguments = (java.util.HashMap) this.f25019i;
        p179v4.o oVar = (p179v4.o) this.j;
        oVar.getClass();
        p101l7.b bVar = (p101l7.b) this.f25021l;
        kotlin.jvm.internal.m.e(arguments, "arguments");
        boolean zI = false;
        if (bVar.equals(J6.a.f6632b)) {
            java.lang.Object obj = arguments.get(p101l7.e.e("value"));
            p142q7.s sVar = obj instanceof p142q7.s ? (p142q7.s) obj : null;
            if (sVar != null) {
                java.lang.Object obj2 = sVar.f26656a;
                p142q7.q qVar = obj2 instanceof p142q7.q ? (p142q7.q) obj2 : null;
                if (qVar != null) {
                    zI = oVar.i(qVar.f26666a.f26654a);
                }
            }
        }
        if (zI || oVar.i(bVar)) {
            return;
        }
        ((java.util.List) this.f25022m).add(new O6.c(((N6.InterfaceC0691e) this.f25020k).j(), arguments, (N6.P) this.f25023n));
    }

    public o4.f f(byte[] bArr) {
        try {
            this.f25021l = new p174u4.c().c((java.lang.String) this.f25020k);
            try {
                return new o4.f(3, (A4.d0) ((A4.g0) j1.l.t(new o4.f(1, new java.io.ByteArrayInputStream(bArr)), (p174u4.b) this.f25021l).f23899i).v());
            } catch (java.io.IOException | java.security.GeneralSecurityException e6) {
                try {
                    return e(bArr);
                } catch (java.io.IOException unused) {
                    throw e6;
                }
            }
        } catch (java.security.GeneralSecurityException | java.security.ProviderException e9) {
            try {
                o4.f fVarE = e(bArr);
                android.util.Log.w(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY, "cannot use Android Keystore, it'll be disabled", e9);
                return fVarE;
            } catch (java.io.IOException unused2) {
                throw e9;
            }
        }
    }

    @Override // p044e7.l
    public p044e7.m g(p101l7.e eVar) {
        return new A7.m((p179v4.o) this.f25018h, eVar, this);
    }

    public p174u4.b h() throws java.security.KeyStoreException {
        p174u4.c cVar = new p174u4.c();
        try {
            boolean zA = p174u4.c.a((java.lang.String) this.f25020k);
            try {
                return cVar.c((java.lang.String) this.f25020k);
            } catch (java.security.GeneralSecurityException | java.security.ProviderException e6) {
                if (!zA) {
                    throw new java.security.KeyStoreException(Y6.f.h("the master key ", (java.lang.String) this.f25020k, " exists but is unusable"), e6);
                }
                android.util.Log.w(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY, "cannot use Android Keystore, it'll be disabled", e6);
                return null;
            }
        } catch (java.security.GeneralSecurityException | java.security.ProviderException e9) {
            android.util.Log.w(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY, "cannot use Android Keystore, it'll be disabled", e9);
            return null;
        }
    }

    @Override // p044e7.l
    public void i(p101l7.e eVar, java.lang.Object obj) {
        ((java.util.HashMap) this.f25019i).put(eVar, p179v4.o.b((p179v4.o) this.f25018h, eVar, obj));
    }

    @Override // p044e7.l
    public void p(p101l7.e eVar, p142q7.f fVar) {
        ((java.util.HashMap) this.f25019i).put(eVar, new p142q7.s(new p142q7.q(fVar)));
    }

    @Override // p044e7.l
    public void s(p101l7.e eVar, p101l7.b bVar, p101l7.e eVar2) {
        ((java.util.HashMap) this.f25019i).put(eVar, new p142q7.i(bVar, eVar2));
    }

    @Override // p044e7.l
    public p044e7.l t(p101l7.b bVar, p101l7.e eVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        return new E2.d(((p179v4.o) this.f25018h).j(bVar, N6.P.f7377b, arrayList), this, eVar, arrayList);
    }
}
