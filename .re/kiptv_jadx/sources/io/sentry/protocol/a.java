package io.sentry.protocol;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements io.sentry.util.LazyEvaluator.Evaluator, io.sentry.util.HintUtils.SentryHintFallback, io.sentry.util.HintUtils.SentryConsumer, io.sentry.ScopeCallback, androidx.media3.exoplayer.mediacodec.MediaCodecSelector, p098l3.e, p046f.b, p163t.InterfaceC2780y, p196y0.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23530h;

    public /* synthetic */ a(int i3) {
        this.f23530h = i3;
    }

    private final o4.b f(p179v4.o oVar) throws java.security.GeneralSecurityException {
        if (!((java.lang.String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            A4.C0034b c0034bD = A4.C0034b.D((com.google.crypto.tink.shaded.protobuf.AbstractC1915j) oVar.f29181k, com.google.crypto.tink.shaded.protobuf.C1921p.a());
            if (c0034bD.B() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            }
            j1.l lVar = new j1.l(17, false);
            lVar.f23899i = null;
            lVar.j = null;
            lVar.f23900k = p185w4.d.f29961f;
            lVar.y(c0034bD.z().size());
            int iY = c0034bD.A().y();
            if (iY < 10 || 16 < iY) {
                throw new java.security.GeneralSecurityException(com.google.android.gms.internal.play_billing.M0.l(iY, "Invalid tag size for AesCmacParameters: "));
            }
            lVar.j = java.lang.Integer.valueOf(iY);
            lVar.f23900k = p185w4.f.a((A4.r0) oVar.f29183m);
            p185w4.e eVarE = lVar.e();
            j1.l lVar2 = new j1.l(16, false);
            lVar2.j = null;
            lVar2.f23900k = null;
            lVar2.f23899i = eVarE;
            lVar2.j = new A.a(3, C4.a.a(c0034bD.z().o()));
            lVar2.f23900k = (java.lang.Integer) oVar.f29180i;
            return lVar2.d();
        } catch (com.google.crypto.tink.shaded.protobuf.D | java.lang.IllegalArgumentException unused) {
            throw new java.security.GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(java.lang.Object obj) {
        io.sentry.util.HintUtils.lambda$runIfDoesNotHaveType$0(obj);
    }

    @Override // p098l3.e
    public java.lang.Object apply(java.lang.Object obj) {
        android.database.Cursor cursorRawQuery = ((android.database.sqlite.SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new java.lang.String[0]);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (cursorRawQuery.moveToNext()) {
                android.support.v4.media.session.q qVarA = p041e3.i.a();
                qVarA.K(cursorRawQuery.getString(1));
                qVarA.f15618k = p124o3.a.b(cursorRawQuery.getInt(2));
                java.lang.String string = cursorRawQuery.getString(3);
                qVarA.j = string == null ? null : android.util.Base64.decode(string, 0);
                arrayList.add(qVarA.j());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // p163t.InterfaceC2780y
    public float b(float f9) {
        return f9;
    }

    @Override // p196y0.i
    public double c(double d4) {
        switch (this.f23530h) {
            case 18:
                double d6 = d4 < 0.0d ? -d4 : d4;
                return java.lang.Math.copySign(d6 >= 0.0031308049535603718d ? (java.lang.Math.pow(d6, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d6 / 0.07739938080495357d, d4);
            case 19:
                double d9 = d4 < 0.0d ? -d4 : d4;
                return java.lang.Math.copySign(d9 >= 0.04045d ? java.lang.Math.pow((0.9478672985781991d * d9) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d9, d4);
            case 20:
                float[] fArr = p196y0.d.f31732a;
                return p196y0.d.b(p196y0.d.f31734c, d4);
            case 21:
                float[] fArr2 = p196y0.d.f31732a;
                return p196y0.d.a(p196y0.d.f31734c, d4);
            case 22:
                float[] fArr3 = p196y0.d.f31732a;
                return p196y0.d.d(p196y0.d.f31735d, d4);
            case 23:
                float[] fArr4 = p196y0.d.f31732a;
                return p196y0.d.c(p196y0.d.f31735d, d4);
            default:
                return d4;
        }
    }

    @Override // p046f.b
    public void d(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        int i3 = com.kiptv.tv.TvActivity.f21002Z;
    }

    public o4.b e(p179v4.o oVar) throws java.security.GeneralSecurityException {
        p131p4.j jVar;
        p131p4.j jVar2;
        switch (this.f23530h) {
            case 7:
                if (!((java.lang.String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    A4.r rVarD = A4.r.D((com.google.crypto.tink.shaded.protobuf.AbstractC1915j) oVar.f29181k, com.google.crypto.tink.shaded.protobuf.C1921p.a());
                    if (rVarD.B() != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p131p4.j jVar3 = p131p4.j.f26201e;
                    int size = rVarD.z().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(size)));
                    }
                    int iY = rVarD.A().y();
                    if (iY != 12 && iY != 16) {
                        throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", java.lang.Integer.valueOf(iY)));
                    }
                    A4.r0 r0Var = (A4.r0) oVar.f29183m;
                    int iOrdinal = r0Var.ordinal();
                    if (iOrdinal == 1) {
                        jVar3 = p131p4.j.f26199c;
                    } else if (iOrdinal == 2) {
                        jVar3 = p131p4.j.f26200d;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                        }
                        jVar3 = p131p4.j.f26200d;
                    }
                    p131p4.k kVar = new p131p4.k(size, iY, 16, jVar3);
                    j1.l lVar = new j1.l(9, false);
                    lVar.j = null;
                    lVar.f23900k = null;
                    lVar.f23899i = kVar;
                    lVar.j = new A.a(3, C4.a.a(rVarD.z().o()));
                    lVar.f23900k = (java.lang.Integer) oVar.f29180i;
                    return lVar.a();
                } catch (com.google.crypto.tink.shaded.protobuf.D unused) {
                    throw new java.security.GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 8:
                if (!((java.lang.String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    A4.C0055x c0055xB = A4.C0055x.B((com.google.crypto.tink.shaded.protobuf.AbstractC1915j) oVar.f29181k, com.google.crypto.tink.shaded.protobuf.C1921p.a());
                    if (c0055xB.z() != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p131p4.j jVar4 = p131p4.j.f26203h;
                    int size2 = c0055xB.y().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(size2)));
                    }
                    A4.r0 r0Var2 = (A4.r0) oVar.f29183m;
                    int iOrdinal2 = r0Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        jVar4 = p131p4.j.f26202f;
                    } else if (iOrdinal2 == 2) {
                        jVar4 = p131p4.j.g;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var2.b());
                        }
                        jVar4 = p131p4.j.g;
                    }
                    p131p4.n nVar = new p131p4.n(size2, 12, 16, jVar4);
                    j1.l lVar2 = new j1.l(10, false);
                    lVar2.j = null;
                    lVar2.f23900k = null;
                    lVar2.f23899i = nVar;
                    lVar2.j = new A.a(3, C4.a.a(c0055xB.y().o()));
                    lVar2.f23900k = (java.lang.Integer) oVar.f29180i;
                    return lVar2.b();
                } catch (com.google.crypto.tink.shaded.protobuf.D unused2) {
                    throw new java.security.GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 9:
                if (!((java.lang.String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    A4.B B9 = A4.B.B((com.google.crypto.tink.shaded.protobuf.AbstractC1915j) oVar.f29181k, com.google.crypto.tink.shaded.protobuf.C1921p.a());
                    if (B9.z() != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p131p4.j jVar5 = p131p4.j.f26205k;
                    int size3 = B9.y().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(size3)));
                    }
                    A4.r0 r0Var3 = (A4.r0) oVar.f29183m;
                    int iOrdinal3 = r0Var3.ordinal();
                    if (iOrdinal3 == 1) {
                        jVar5 = p131p4.j.f26204i;
                    } else if (iOrdinal3 == 2) {
                        jVar5 = p131p4.j.j;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var3.b());
                        }
                        jVar5 = p131p4.j.j;
                    }
                    p131p4.q qVar = new p131p4.q(size3, jVar5);
                    j1.l lVar3 = new j1.l(11, false);
                    lVar3.j = null;
                    lVar3.f23900k = null;
                    lVar3.f23899i = qVar;
                    lVar3.j = new A.a(3, C4.a.a(B9.y().o()));
                    lVar3.f23900k = (java.lang.Integer) oVar.f29180i;
                    return lVar3.c();
                } catch (com.google.crypto.tink.shaded.protobuf.D unused3) {
                    throw new java.security.GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 10:
                if (!((java.lang.String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    A4.J jB = A4.J.B((com.google.crypto.tink.shaded.protobuf.AbstractC1915j) oVar.f29181k, com.google.crypto.tink.shaded.protobuf.C1921p.a());
                    if (jB.z() != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    A4.r0 r0Var4 = (A4.r0) oVar.f29183m;
                    int iOrdinal4 = r0Var4.ordinal();
                    if (iOrdinal4 == 1) {
                        jVar = p131p4.j.f26206l;
                    } else if (iOrdinal4 == 2) {
                        jVar = p131p4.j.f26207m;
                    } else if (iOrdinal4 == 3) {
                        jVar = p131p4.j.f26208n;
                    } else {
                        if (iOrdinal4 != 4) {
                            throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var4.b());
                        }
                        jVar = p131p4.j.f26207m;
                    }
                    return p131p4.s.b(jVar, new A.a(3, C4.a.a(jB.y().o())), (java.lang.Integer) oVar.f29180i);
                } catch (com.google.crypto.tink.shaded.protobuf.D unused4) {
                    throw new java.security.GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 11:
                if (!((java.lang.String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    A4.u0 u0VarB = A4.u0.B((com.google.crypto.tink.shaded.protobuf.AbstractC1915j) oVar.f29181k, com.google.crypto.tink.shaded.protobuf.C1921p.a());
                    if (u0VarB.z() != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    A4.r0 r0Var5 = (A4.r0) oVar.f29183m;
                    int iOrdinal5 = r0Var5.ordinal();
                    if (iOrdinal5 == 1) {
                        jVar2 = p131p4.j.f26209o;
                    } else if (iOrdinal5 == 2) {
                        jVar2 = p131p4.j.f26210p;
                    } else if (iOrdinal5 == 3) {
                        jVar2 = p131p4.j.f26211q;
                    } else {
                        if (iOrdinal5 != 4) {
                            throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var5.b());
                        }
                        jVar2 = p131p4.j.f26210p;
                    }
                    return p131p4.w.b(jVar2, new A.a(3, C4.a.a(u0VarB.y().o())), (java.lang.Integer) oVar.f29180i);
                } catch (com.google.crypto.tink.shaded.protobuf.D unused5) {
                    throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 12:
            case 13:
            default:
                if (!((java.lang.String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new java.lang.IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    A4.Q qE = A4.Q.E((com.google.crypto.tink.shaded.protobuf.AbstractC1915j) oVar.f29181k, com.google.crypto.tink.shaded.protobuf.C1921p.a());
                    if (qE.C() != 0) {
                        throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    A7.m mVar = new A7.m(22, false);
                    mVar.f321i = null;
                    mVar.j = null;
                    mVar.f322k = null;
                    mVar.f323l = p185w4.d.f29968o;
                    mVar.f321i = java.lang.Integer.valueOf(qE.A().size());
                    mVar.j = java.lang.Integer.valueOf(qE.B().A());
                    mVar.f322k = p185w4.l.a(qE.B().z());
                    mVar.f323l = p185w4.l.b((A4.r0) oVar.f29183m);
                    p185w4.k kVarN = mVar.n();
                    j1.l lVar4 = new j1.l(18, false);
                    lVar4.j = null;
                    lVar4.f23900k = null;
                    lVar4.f23899i = kVarN;
                    lVar4.j = new A.a(3, C4.a.a(qE.A().o()));
                    lVar4.f23900k = (java.lang.Integer) oVar.f29180i;
                    return lVar4.f();
                } catch (com.google.crypto.tink.shaded.protobuf.D | java.lang.IllegalArgumentException unused6) {
                    throw new java.security.GeneralSecurityException("Parsing HmacKey failed");
                }
            case 14:
                return f(oVar);
        }
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public java.lang.Object evaluate() {
        return io.sentry.SentryUUID.generateSentryId();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    public java.util.List getDecoderInfos(java.lang.String mimeType, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(mimeType, "mimeType");
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = androidx.media3.exoplayer.mediacodec.MediaCodecSelector.DEFAULT.getDecoderInfos(mimeType, z6, z9);
        kotlin.jvm.internal.m.d(decoderInfos, "getDecoderInfos(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : decoderInfos) {
            if (!((androidx.media3.exoplayer.mediacodec.MediaCodecInfo) obj).hardwareAccelerated) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // io.sentry.ScopeCallback
    public void run(io.sentry.IScope iScope) {
        io.sentry.util.TracingUtils.lambda$startNewTrace$1(iScope);
    }

    @Override // io.sentry.util.HintUtils.SentryHintFallback
    public void accept(java.lang.Object obj, java.lang.Class cls) {
        io.sentry.util.HintUtils.lambda$runIfHasType$2(obj, cls);
    }
}
