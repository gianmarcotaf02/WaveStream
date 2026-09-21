package io.sentry.protocol;

import A4.B;
import A4.C0034b;
import A4.C0055x;
import A4.J;
import A4.Q;
import A4.r;
import A4.r0;
import A4.u0;
import A7.m;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.media.session.q;
import android.util.Base64;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.D;
import com.kiptv.tv.TvActivity;
import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.SentryUUID;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.TracingUtils;
import j1.l;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.List;
import p046f.b;
import p098l3.e;
import p131p4.j;
import p131p4.k;
import p131p4.n;
import p131p4.s;
import p131p4.w;
import p163t.InterfaceC2780y;
import p179v4.o;
import p185w4.d;
import p185w4.f;
import p196y0.i;

public final class a implements LazyEvaluator.Evaluator, HintUtils.SentryHintFallback, HintUtils.SentryConsumer, ScopeCallback, MediaCodecSelector, e, b, InterfaceC2780y, i {

    public final int f23530h;

    public a(int i3) {
        this.f23530h = i3;
    }

    private final o4.b f(o oVar) throws GeneralSecurityException {
        if (!((String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            C0034b c0034bD = C0034b.D((AbstractC1915j) oVar.f29181k, C1921p.a());
            if (c0034bD.B() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            l lVar = new l(17, false);
            lVar.f23899i = null;
            lVar.j = null;
            lVar.f23900k = d.f29961f;
            lVar.y(c0034bD.z().size());
            int iY = c0034bD.A().y();
            if (iY < 10 || 16 < iY) {
                throw new GeneralSecurityException(M0.l(iY, "Invalid tag size for AesCmacParameters: "));
            }
            lVar.j = Integer.valueOf(iY);
            lVar.f23900k = f.a((r0) oVar.f29183m);
            p185w4.e eVarE = lVar.e();
            l lVar2 = new l(16, false);
            lVar2.j = null;
            lVar2.f23900k = null;
            lVar2.f23899i = eVarE;
            lVar2.j = new A.a(3, C4.a.a(c0034bD.z().o()));
            lVar2.f23900k = (Integer) oVar.f29180i;
            return lVar2.d();
        } catch (D | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    @Override
    public void accept(Object obj) {
        HintUtils.lambda$runIfDoesNotHaveType$0(obj);
    }

    @Override
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                q qVarA = p041e3.i.a();
                qVarA.K(cursorRawQuery.getString(1));
                qVarA.f15618k = p124o3.a.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                qVarA.j = string == null ? null : Base64.decode(string, 0);
                arrayList.add(qVarA.j());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override
    public float b(float f9) {
        return f9;
    }

    @Override
    public double c(double d4) {
        switch (this.f23530h) {
            case 18:
                double d6 = d4 < 0.0d ? -d4 : d4;
                return Math.copySign(d6 >= 0.0031308049535603718d ? (Math.pow(d6, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d6 / 0.07739938080495357d, d4);
            case 19:
                double d9 = d4 < 0.0d ? -d4 : d4;
                return Math.copySign(d9 >= 0.04045d ? Math.pow((0.9478672985781991d * d9) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d9, d4);
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

    @Override
    public void d(Object obj) {
        ((Boolean) obj).booleanValue();
        int i3 = TvActivity.f21002Z;
    }

    public o4.b e(o oVar) throws GeneralSecurityException {
        j jVar;
        j jVar2;
        switch (this.f23530h) {
            case 7:
                if (!((String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    r rVarD = r.D((AbstractC1915j) oVar.f29181k, C1921p.a());
                    if (rVarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    j jVar3 = j.f26201e;
                    int size = rVarD.z().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iY = rVarD.A().y();
                    if (iY != 12 && iY != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iY)));
                    }
                    r0 r0Var = (r0) oVar.f29183m;
                    int iOrdinal = r0Var.ordinal();
                    if (iOrdinal == 1) {
                        jVar3 = j.f26199c;
                    } else if (iOrdinal == 2) {
                        jVar3 = j.f26200d;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                        }
                        jVar3 = j.f26200d;
                    }
                    k kVar = new k(size, iY, 16, jVar3);
                    l lVar = new l(9, false);
                    lVar.j = null;
                    lVar.f23900k = null;
                    lVar.f23899i = kVar;
                    lVar.j = new A.a(3, C4.a.a(rVarD.z().o()));
                    lVar.f23900k = (Integer) oVar.f29180i;
                    return lVar.a();
                } catch (D unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 8:
                if (!((String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    C0055x c0055xB = C0055x.B((AbstractC1915j) oVar.f29181k, C1921p.a());
                    if (c0055xB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    j jVar4 = j.f26203h;
                    int size2 = c0055xB.y().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    r0 r0Var2 = (r0) oVar.f29183m;
                    int iOrdinal2 = r0Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        jVar4 = j.f26202f;
                    } else if (iOrdinal2 == 2) {
                        jVar4 = j.g;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var2.b());
                        }
                        jVar4 = j.g;
                    }
                    n nVar = new n(size2, 12, 16, jVar4);
                    l lVar2 = new l(10, false);
                    lVar2.j = null;
                    lVar2.f23900k = null;
                    lVar2.f23899i = nVar;
                    lVar2.j = new A.a(3, C4.a.a(c0055xB.y().o()));
                    lVar2.f23900k = (Integer) oVar.f29180i;
                    return lVar2.b();
                } catch (D unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 9:
                if (!((String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    B B9 = B.B((AbstractC1915j) oVar.f29181k, C1921p.a());
                    if (B9.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    j jVar5 = j.f26205k;
                    int size3 = B9.y().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    r0 r0Var3 = (r0) oVar.f29183m;
                    int iOrdinal3 = r0Var3.ordinal();
                    if (iOrdinal3 == 1) {
                        jVar5 = j.f26204i;
                    } else if (iOrdinal3 == 2) {
                        jVar5 = j.j;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var3.b());
                        }
                        jVar5 = j.j;
                    }
                    p131p4.q qVar = new p131p4.q(size3, jVar5);
                    l lVar3 = new l(11, false);
                    lVar3.j = null;
                    lVar3.f23900k = null;
                    lVar3.f23899i = qVar;
                    lVar3.j = new A.a(3, C4.a.a(B9.y().o()));
                    lVar3.f23900k = (Integer) oVar.f29180i;
                    return lVar3.c();
                } catch (D unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 10:
                if (!((String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    J jB = J.B((AbstractC1915j) oVar.f29181k, C1921p.a());
                    if (jB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    r0 r0Var4 = (r0) oVar.f29183m;
                    int iOrdinal4 = r0Var4.ordinal();
                    if (iOrdinal4 == 1) {
                        jVar = j.f26206l;
                    } else if (iOrdinal4 == 2) {
                        jVar = j.f26207m;
                    } else if (iOrdinal4 == 3) {
                        jVar = j.f26208n;
                    } else {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var4.b());
                        }
                        jVar = j.f26207m;
                    }
                    return s.b(jVar, new A.a(3, C4.a.a(jB.y().o())), (Integer) oVar.f29180i);
                } catch (D unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 11:
                if (!((String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    u0 u0VarB = u0.B((AbstractC1915j) oVar.f29181k, C1921p.a());
                    if (u0VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    r0 r0Var5 = (r0) oVar.f29183m;
                    int iOrdinal5 = r0Var5.ordinal();
                    if (iOrdinal5 == 1) {
                        jVar2 = j.f26209o;
                    } else if (iOrdinal5 == 2) {
                        jVar2 = j.f26210p;
                    } else if (iOrdinal5 == 3) {
                        jVar2 = j.f26211q;
                    } else {
                        if (iOrdinal5 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var5.b());
                        }
                        jVar2 = j.f26210p;
                    }
                    return w.b(jVar2, new A.a(3, C4.a.a(u0VarB.y().o())), (Integer) oVar.f29180i);
                } catch (D unused5) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 12:
            case 13:
            default:
                if (!((String) oVar.f29179h).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    Q qE = Q.E((AbstractC1915j) oVar.f29181k, C1921p.a());
                    if (qE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    m mVar = new m(22, false);
                    mVar.f321i = null;
                    mVar.j = null;
                    mVar.f322k = null;
                    mVar.f323l = d.f29968o;
                    mVar.f321i = Integer.valueOf(qE.A().size());
                    mVar.j = Integer.valueOf(qE.B().A());
                    mVar.f322k = p185w4.l.a(qE.B().z());
                    mVar.f323l = p185w4.l.b((r0) oVar.f29183m);
                    p185w4.k kVarN = mVar.n();
                    l lVar4 = new l(18, false);
                    lVar4.j = null;
                    lVar4.f23900k = null;
                    lVar4.f23899i = kVarN;
                    lVar4.j = new A.a(3, C4.a.a(qE.A().o()));
                    lVar4.f23900k = (Integer) oVar.f29180i;
                    return lVar4.f();
                } catch (D | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            case 14:
                return f(oVar);
        }
    }

    @Override
    public Object evaluate() {
        return SentryUUID.generateSentryId();
    }

    @Override
    public List getDecoderInfos(String mimeType, boolean z6, boolean z9) {
        kotlin.jvm.internal.m.e(mimeType, "mimeType");
        List<MediaCodecInfo> decoderInfos = MediaCodecSelector.DEFAULT.getDecoderInfos(mimeType, z6, z9);
        kotlin.jvm.internal.m.d(decoderInfos, "getDecoderInfos(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : decoderInfos) {
            if (!((MediaCodecInfo) obj).hardwareAccelerated) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override
    public void run(IScope iScope) {
        TracingUtils.lambda$startNewTrace$1(iScope);
    }

    @Override
    public void accept(Object obj, Class cls) {
        HintUtils.lambda$runIfHasType$2(obj, cls);
    }
}
