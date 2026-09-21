package j1;

/* JADX INFO: loaded from: classes.dex */
public final class l implements p112n0.f, F3.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f23899i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f23900k;

    public /* synthetic */ l(int i3, boolean z6) {
        this.f23898h = i3;
    }

    public static final j1.l h(A4.g0 g0Var) throws java.security.GeneralSecurityException {
        if (g0Var.z() <= 0) {
            throw new java.security.GeneralSecurityException("empty keyset");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(g0Var.z());
        for (A4.f0 f0Var : g0Var.A()) {
            f0Var.getClass();
            try {
                try {
                    o4.b bVarA = p179v4.i.f29169b.a(p179v4.o.c(f0Var.A().B(), f0Var.A().C(), f0Var.A().A(), f0Var.C(), f0Var.C() == A4.r0.RAW ? null : java.lang.Integer.valueOf(f0Var.B())));
                    int iOrdinal = f0Var.D().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new java.security.GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new o4.h(bVarA));
                } catch (java.security.GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (java.security.GeneralSecurityException e6) {
                throw new I3.b("Creating a protokey serialization failed", e6);
            }
        }
        return new j1.l(g0Var, java.util.Collections.unmodifiableList(arrayList));
    }

    public static j1.l s(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i3) {
        return new j1.l(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static final j1.l t(o4.f fVar, p174u4.b bVar) throws java.security.GeneralSecurityException, java.io.IOException {
        byte[] bArr = new byte[0];
        java.io.ByteArrayInputStream byteArrayInputStream = (java.io.ByteArrayInputStream) fVar.f26119b;
        try {
            A4.N nA = A4.N.A(byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.C1921p.a());
            byteArrayInputStream.close();
            if (nA.y().size() == 0) {
                throw new java.security.GeneralSecurityException("empty keyset");
            }
            try {
                A4.g0 g0VarE = A4.g0.E(bVar.b(nA.y().o(), bArr), com.google.crypto.tink.shaded.protobuf.C1921p.a());
                if (g0VarE.z() > 0) {
                    return h(g0VarE);
                }
                throw new java.security.GeneralSecurityException("empty keyset");
            } catch (com.google.crypto.tink.shaded.protobuf.D unused) {
                throw new java.security.GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (java.lang.Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public void A(long j) {
        ((p203z0.b) this.f23900k).f32127h.f32126d = j;
    }

    public void B() {
        p136q.H h9 = (p136q.H) this.f23899i;
        java.lang.String str = (java.lang.String) this.j;
        java.util.List list = (java.util.List) h9.k(str);
        if (list != null) {
            list.remove((kotlin.jvm.functions.Function0) this.f23900k);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        h9.m(str, list);
    }

    public void C(int i3, java.lang.String str, java.lang.String str2) {
        ((java.util.HashMap) this.f23899i).put(str, str2);
        ((java.util.HashMap) this.j).put(str2, str);
        ((java.util.HashMap) this.f23900k).put(str, java.lang.Integer.valueOf(i3));
    }

    @Override // F3.l
    public void K(java.lang.Object obj, java.lang.Object obj2) {
        B3.D d4 = (B3.D) obj;
        p059g4.d dVar = (p059g4.d) obj2;
        switch (this.f23898h) {
            case 13:
                p184w3.C c9 = (p184w3.C) this.f23899i;
                H3.q.i("Not connected to device", c9.f29799F == 3);
                B3.h hVar = (B3.h) d4.p();
                android.os.Parcel parcelY = hVar.Y();
                parcelY.writeString((java.lang.String) this.j);
                com.google.android.gms.internal.cast.AbstractC1818z.c(parcelY, (p184w3.i) this.f23900k);
                hVar.b0(parcelY, 13);
                synchronized (c9.f29807r) {
                    try {
                        if (c9.f29804o != null) {
                            c9.h(2477);
                        }
                        c9.f29804o = dVar;
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                H3.q.i("Not active connection", ((p184w3.C) this.f23899i).f29799F != 1);
                if (((p184w3.f) this.j) != null) {
                    B3.h hVar2 = (B3.h) d4.p();
                    android.os.Parcel parcelY2 = hVar2.Y();
                    parcelY2.writeString((java.lang.String) this.f23900k);
                    hVar2.b0(parcelY2, 12);
                }
                dVar.b(null);
                return;
        }
    }

    public p131p4.i a() throws java.security.GeneralSecurityException {
        A.a aVar;
        p131p4.k kVar = (p131p4.k) this.f23899i;
        if (kVar == null || (aVar = (A.a) this.j) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f26214b != ((C4.a) aVar.f9i).f889a.length) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        p131p4.j jVar = p131p4.j.f26201e;
        p131p4.j jVar2 = kVar.f26217e;
        if (jVar2 != jVar && ((java.lang.Integer) this.f23900k) == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((java.lang.Integer) this.f23900k) != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            C4.a.a(new byte[0]);
        } else if (jVar2 == p131p4.j.f26200d) {
            C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        } else {
            if (jVar2 != p131p4.j.f26199c) {
                throw new java.lang.IllegalStateException("Unknown AesEaxParameters.Variant: " + ((p131p4.k) this.f23899i).f26217e);
            }
            C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        }
        return new p131p4.i();
    }

    public p131p4.m b() throws java.security.GeneralSecurityException {
        A.a aVar;
        p131p4.n nVar = (p131p4.n) this.f23899i;
        if (nVar == null || (aVar = (A.a) this.j) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nVar.f26222b != ((C4.a) aVar.f9i).f889a.length) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        p131p4.j jVar = p131p4.j.f26203h;
        p131p4.j jVar2 = nVar.f26225e;
        if (jVar2 != jVar && ((java.lang.Integer) this.f23900k) == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((java.lang.Integer) this.f23900k) != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            C4.a.a(new byte[0]);
        } else if (jVar2 == p131p4.j.g) {
            C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        } else {
            if (jVar2 != p131p4.j.f26202f) {
                throw new java.lang.IllegalStateException("Unknown AesGcmParameters.Variant: " + ((p131p4.n) this.f23899i).f26225e);
            }
            C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        }
        return new p131p4.m();
    }

    public p131p4.p c() throws java.security.GeneralSecurityException {
        A.a aVar;
        p131p4.q qVar = (p131p4.q) this.f23899i;
        if (qVar == null || (aVar = (A.a) this.j) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qVar.f26230b != ((C4.a) aVar.f9i).f889a.length) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        p131p4.j jVar = p131p4.j.f26205k;
        p131p4.j jVar2 = qVar.f26231c;
        if (jVar2 != jVar && ((java.lang.Integer) this.f23900k) == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((java.lang.Integer) this.f23900k) != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            C4.a.a(new byte[0]);
        } else if (jVar2 == p131p4.j.j) {
            C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        } else {
            if (jVar2 != p131p4.j.f26204i) {
                throw new java.lang.IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((p131p4.q) this.f23899i).f26231c);
            }
            C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        }
        return new p131p4.p();
    }

    public p185w4.a d() throws java.security.GeneralSecurityException {
        A.a aVar;
        C4.a aVarA;
        p185w4.e eVar = (p185w4.e) this.f23899i;
        if (eVar == null || (aVar = (A.a) this.j) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eVar.f29971b != ((C4.a) aVar.f9i).f889a.length) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        p185w4.d dVar = p185w4.d.f29961f;
        p185w4.d dVar2 = eVar.f29973d;
        if (dVar2 != dVar && ((java.lang.Integer) this.f23900k) == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar2 == dVar && ((java.lang.Integer) this.f23900k) != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar2 == dVar) {
            aVarA = C4.a.a(new byte[0]);
        } else if (dVar2 == p185w4.d.f29960e || dVar2 == p185w4.d.f29959d) {
            aVarA = C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        } else {
            if (dVar2 != p185w4.d.f29958c) {
                throw new java.lang.IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((p185w4.e) this.f23899i).f29973d);
            }
            aVarA = C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        }
        return new p185w4.a((p185w4.e) this.f23899i, aVarA);
    }

    public p185w4.e e() throws java.security.GeneralSecurityException {
        java.lang.Integer num = (java.lang.Integer) this.f23899i;
        if (num == null) {
            throw new java.security.GeneralSecurityException("key size not set");
        }
        if (((java.lang.Integer) this.j) == null) {
            throw new java.security.GeneralSecurityException("tag size not set");
        }
        if (((p185w4.d) this.f23900k) != null) {
            return new p185w4.e(num.intValue(), ((java.lang.Integer) this.j).intValue(), (p185w4.d) this.f23900k);
        }
        throw new java.security.GeneralSecurityException("variant not set");
    }

    public p185w4.j f() throws java.security.GeneralSecurityException {
        A.a aVar;
        C4.a aVarA;
        p185w4.k kVar = (p185w4.k) this.f23899i;
        if (kVar == null || (aVar = (A.a) this.j) == null) {
            throw new java.security.GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f29981b != ((C4.a) aVar.f9i).f889a.length) {
            throw new java.security.GeneralSecurityException("Key size mismatch");
        }
        p185w4.d dVar = p185w4.d.f29968o;
        p185w4.d dVar2 = kVar.f29983d;
        if (dVar2 != dVar && ((java.lang.Integer) this.f23900k) == null) {
            throw new java.security.GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar2 == dVar && ((java.lang.Integer) this.f23900k) != null) {
            throw new java.security.GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar2 == dVar) {
            aVarA = C4.a.a(new byte[0]);
        } else if (dVar2 == p185w4.d.f29967n || dVar2 == p185w4.d.f29966m) {
            aVarA = C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 0).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        } else {
            if (dVar2 != p185w4.d.f29965l) {
                throw new java.lang.IllegalStateException("Unknown HmacParameters.Variant: " + ((p185w4.k) this.f23899i).f29983d);
            }
            aVarA = C4.a.a(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(((java.lang.Integer) this.f23900k).intValue()).array());
        }
        return new p185w4.j((p185w4.k) this.f23899i, aVarA);
    }

    public void g() {
        android.support.v4.media.session.q qVar = (android.support.v4.media.session.q) this.f23899i;
        if (qVar != null) {
            int i3 = ((p105m2.C2608f) this.f23900k).f25296k.f21821e;
            android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) qVar.f15617i;
            mVar.getClass();
            android.media.AudioAttributes.Builder builder = new android.media.AudioAttributes.Builder();
            builder.setLegacyStreamType(i3);
            mVar.f15605a.setPlaybackToLocal(builder.build());
            this.j = null;
        }
    }

    public java.lang.Object i() {
        long jC = p089k0.f.c();
        if (jC == p089k0.m.f24435a) {
            return this.j;
        }
        p089k0.l lVar = (p089k0.l) ((java.util.concurrent.atomic.AtomicReference) this.f23899i).get();
        int iA = lVar.a(jC);
        if (iA >= 0) {
            return lVar.f24434c[iA];
        }
        return null;
    }

    public p188x0.InterfaceC3097q j() {
        return ((p203z0.b) this.f23900k).f32127h.f32125c;
    }

    public android.content.res.ColorStateList k(int i3) {
        int resourceId;
        android.content.res.ColorStateList colorStateListX;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.j;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (colorStateListX = com.google.common.util.concurrent.AbstractC1903s.x((android.content.Context) this.f23899i, resourceId)) == null) ? typedArray.getColorStateList(i3) : colorStateListX;
    }

    public android.graphics.drawable.Drawable l(int i3) {
        int resourceId;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) this.j;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : com.google.common.util.concurrent.AbstractC1903s.y((android.content.Context) this.f23899i, resourceId);
    }

    public android.graphics.drawable.Drawable m(int i3) {
        int resourceId;
        android.graphics.drawable.Drawable drawableD;
        if (!((android.content.res.TypedArray) this.j).hasValue(i3) || (resourceId = ((android.content.res.TypedArray) this.j).getResourceId(i3, 0)) == 0) {
            return null;
        }
        p103m.r rVarA = p103m.r.a();
        android.content.Context context = (android.content.Context) this.f23899i;
        synchronized (rVarA) {
            drawableD = rVarA.f25109a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public android.graphics.Typeface n(int i3, int i9, Z2.M m8) {
        int resourceId = ((android.content.res.TypedArray) this.j).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((android.util.TypedValue) this.f23900k) == null) {
            this.f23900k = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = (android.util.TypedValue) this.f23900k;
        java.lang.ThreadLocal threadLocal = p176v1.j.f29136a;
        android.content.Context context = (android.content.Context) this.f23899i;
        if (context.isRestricted()) {
            return null;
        }
        return p176v1.j.a(context, resourceId, typedValue, i9, m8, true);
    }

    public java.lang.Object o(java.lang.Class cls) throws java.security.GeneralSecurityException {
        java.lang.Class clsA;
        java.lang.Object objC;
        java.lang.Object objB;
        java.util.concurrent.atomic.AtomicReference atomicReference = o4.n.f26131a;
        try {
            clsA = p179v4.h.f29167b.a(cls);
        } catch (java.security.GeneralSecurityException unused) {
            clsA = null;
        }
        if (clsA == null) {
            throw new java.security.GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i3 = o4.o.f26135a;
        A4.g0 g0Var = (A4.g0) this.f23899i;
        int iB = g0Var.B();
        java.util.Iterator it = g0Var.A().iterator();
        boolean z6 = true;
        int i9 = 0;
        boolean z9 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            A4.Z z10 = A4.Z.ENABLED;
            if (!zHasNext) {
                if (i9 == 0) {
                    throw new java.security.GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z9 && !z6) {
                    throw new java.security.GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                A7.m mVar = new A7.m(clsA);
                if (((java.util.concurrent.ConcurrentHashMap) mVar.j) == null) {
                    throw new java.lang.IllegalStateException("setAnnotations cannot be called after build");
                }
                mVar.f323l = (p200y4.a) this.f23900k;
                for (int i10 = 0; i10 < g0Var.z(); i10++) {
                    A4.f0 f0VarY = g0Var.y(i10);
                    if (f0VarY.D().equals(z10)) {
                        try {
                            A4.Y yA = f0VarY.A();
                            java.util.concurrent.atomic.AtomicReference atomicReference2 = o4.n.f26131a;
                            objC = o4.n.c(yA.B(), yA.C(), clsA);
                        } catch (java.security.GeneralSecurityException e6) {
                            if (!e6.getMessage().contains("No key manager found for key type ") && !e6.getMessage().contains(" not supported by key manager of type ")) {
                                throw e6;
                            }
                            objC = null;
                        }
                        java.util.List list = (java.util.List) this.j;
                        if (list.get(i10) != null) {
                            try {
                                objB = o4.n.b(((o4.h) list.get(i10)).f26121a, clsA);
                            } catch (java.security.GeneralSecurityException unused2) {
                                objB = null;
                            }
                        } else {
                            objB = null;
                        }
                        if (f0VarY.B() == g0Var.B()) {
                            mVar.m(objB, objC, f0VarY, true);
                        } else {
                            mVar.m(objB, objC, f0VarY, false);
                        }
                    }
                }
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) mVar.j;
                if (concurrentHashMap == null) {
                    throw new java.lang.IllegalStateException("build cannot be called twice");
                }
                o4.k kVar = (o4.k) mVar.f322k;
                p200y4.a aVar = (p200y4.a) mVar.f323l;
                java.lang.Class cls2 = (java.lang.Class) mVar.f321i;
                j1.l lVar = new j1.l(concurrentHashMap, kVar, aVar, cls2);
                mVar.j = null;
                java.util.concurrent.atomic.AtomicReference atomicReference3 = o4.n.f26131a;
                java.util.HashMap map = ((p179v4.n) p179v4.h.f29167b.f29168a.get()).f29178b;
                if (!map.containsKey(cls)) {
                    throw new java.security.GeneralSecurityException("No wrapper found for " + cls);
                }
                o4.m mVar2 = (o4.m) map.get(cls);
                if (cls2.equals(mVar2.a()) && mVar2.a().equals(cls2)) {
                    return mVar2.c(lVar);
                }
                throw new java.security.GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            A4.f0 f0Var = (A4.f0) it.next();
            if (f0Var.D() == z10) {
                if (!f0Var.E()) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has no key data", java.lang.Integer.valueOf(f0Var.B())));
                }
                if (f0Var.C() == A4.r0.UNKNOWN_PREFIX) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown prefix", java.lang.Integer.valueOf(f0Var.B())));
                }
                if (f0Var.D() == A4.Z.UNKNOWN_STATUS) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("key %d has unknown status", java.lang.Integer.valueOf(f0Var.B())));
                }
                if (f0Var.B() == iB) {
                    if (z9) {
                        throw new java.security.GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z9 = true;
                }
                if (f0Var.A().A() != A4.X.ASYMMETRIC_PUBLIC) {
                    z6 = false;
                }
                i9++;
            }
        }
    }

    public java.util.List p(byte[] bArr) {
        java.util.List list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) this.f23899i).get(new o4.l(bArr));
        return list != null ? list : java.util.Collections.EMPTY_LIST;
    }

    public long q() {
        return ((p203z0.b) this.f23900k).f32127h.f32126d;
    }

    public boolean r() {
        if (((p048f1.E) this.f23899i).getValue() != this.f23900k) {
            return true;
        }
        j1.l lVar = (j1.l) this.j;
        return lVar != null && lVar.r();
    }

    public java.lang.String toString() {
        switch (this.f23898h) {
            case 6:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NavDeepLinkRequest{");
                android.net.Uri uri = (android.net.Uri) this.f23899i;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(java.lang.String.valueOf(uri));
                }
                java.lang.String str = (java.lang.String) this.j;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                java.lang.String str2 = (java.lang.String) this.f23900k;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                java.lang.String string = sb.toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                return string;
            case 7:
                return o4.o.a((A4.g0) this.f23899i).toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        ((android.content.res.TypedArray) this.j).recycle();
    }

    public void v(java.lang.Object obj) {
        long jC = p089k0.f.c();
        if (jC == p089k0.m.f24435a) {
            this.j = obj;
            return;
        }
        synchronized (this.f23900k) {
            p089k0.l lVar = (p089k0.l) ((java.util.concurrent.atomic.AtomicReference) this.f23899i).get();
            int iA = lVar.a(jC);
            if (iA < 0) {
                ((java.util.concurrent.atomic.AtomicReference) this.f23899i).set(lVar.b(jC, obj));
            } else {
                lVar.f24434c[iA] = obj;
            }
        }
    }

    public void w(p188x0.InterfaceC3097q interfaceC3097q) {
        ((p203z0.b) this.f23900k).f32127h.f32125c = interfaceC3097q;
    }

    public void x(p113n1.c cVar) {
        ((p203z0.b) this.f23900k).f32127h.f32123a = cVar;
    }

    public void y(int i3) throws java.security.InvalidAlgorithmParameterException {
        if (i3 != 16 && i3 != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i3 * 8)));
        }
        this.f23899i = java.lang.Integer.valueOf(i3);
    }

    public void z(p113n1.n nVar) {
        ((p203z0.b) this.f23900k).f32127h.f32124b = nVar;
    }

    public /* synthetic */ l(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f23898h = i3;
        this.f23899i = obj;
        this.j = obj2;
        this.f23900k = obj3;
    }

    public l(com.google.android.gms.cast.CastDevice castDevice, p191x3.D d4) {
        this.f23898h = 12;
        H3.q.h(castDevice, "CastDevice parameter cannot be null");
        this.f23899i = castDevice;
        this.j = d4;
    }

    public l(p199y3.g gVar) {
        this.f23898h = 19;
        this.f23900k = gVar;
        this.j = new java.util.concurrent.atomic.AtomicLong((B3.AbstractC0088a.f616b.nextLong() & 65535) * androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
    }

    public l(int i3) {
        this.f23898h = i3;
        switch (i3) {
            case 2:
                this.f23899i = new java.util.concurrent.atomic.AtomicReference(p089k0.f.f24413c);
                this.f23900k = new java.lang.Object();
                break;
            case 15:
                this.f23899i = new java.util.HashMap();
                this.j = new java.util.HashMap();
                this.f23900k = new java.util.HashMap();
                break;
            default:
                this.f23899i = new java.util.WeakHashMap();
                this.j = new java.util.WeakHashMap();
                this.f23900k = new java.util.WeakHashMap();
                break;
        }
    }

    public l(p203z0.b bVar) {
        this.f23898h = 20;
        this.f23900k = bVar;
        this.f23899i = new p191x3.C(this);
    }

    public l(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.f23898h = 3;
        this.f23899i = context;
        this.j = typedArray;
    }

    public l(p048f1.E e6, j1.l lVar) {
        this.f23898h = 0;
        this.f23899i = e6;
        this.j = lVar;
        this.f23900k = e6.getValue();
    }

    public l(java.util.concurrent.ConcurrentHashMap concurrentHashMap, o4.k kVar, p200y4.a aVar, java.lang.Class cls) {
        this.f23898h = 8;
        this.f23899i = concurrentHashMap;
        this.j = kVar;
        this.f23900k = aVar;
    }

    public l(A4.g0 g0Var, java.util.List list) {
        this.f23898h = 7;
        this.f23899i = g0Var;
        this.j = list;
        this.f23900k = p200y4.a.f31883b;
    }

    public l(p105m2.C2608f c2608f, android.support.v4.media.session.q qVar) {
        this.f23898h = 4;
        this.f23900k = c2608f;
        this.f23899i = qVar;
    }
}
