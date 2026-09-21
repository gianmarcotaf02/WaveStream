package p103m;

import A4.M;
import A4.N;
import A4.Z;
import A4.d0;
import A4.f0;
import A4.g0;
import A4.k0;
import B4.k;
import E2.d;
import N6.InterfaceC0691e;
import N6.P;
import O6.c;
import Y6.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.D;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import o4.g;
import o4.o;
import p044e7.l;
import p101l7.e;
import p142q7.i;
import p142q7.q;
import p142q7.s;
import p174u4.a;
import p174u4.b;

public final class c1 implements l {

    public Object f25018h = null;

    public Object f25019i = null;
    public Object j = null;

    public Object f25020k = null;

    public Object f25021l = null;

    public Object f25022m = null;

    public Object f25023n;

    public static byte[] d(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return k.e(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(f.h("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static o4.f e(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return new o4.f(3, (d0) ((g0) j1.l.h(g0.D(byteArrayInputStream, C1921p.a())).f23899i).v());
        } finally {
            byteArrayInputStream.close();
        }
    }

    public synchronized a a() {
        a aVar;
        try {
            if (((String) this.f25019i) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (a.f28677b) {
                try {
                    byte[] bArrD = d((Context) this.f25018h, (String) this.f25019i, (String) this.j);
                    if (bArrD == null) {
                        if (((String) this.f25020k) != null) {
                            this.f25021l = h();
                        }
                        this.f25023n = b();
                    } else if (((String) this.f25020k) != null) {
                        this.f25023n = f(bArrD);
                    } else {
                        this.f25023n = e(bArrD);
                    }
                    aVar = new a(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public o4.f b() throws GeneralSecurityException, IOException {
        if (((g) this.f25022m) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        o4.f fVar = new o4.f(3, g0.C());
        g gVar = (g) this.f25022m;
        synchronized (fVar) {
            fVar.a(gVar.f26120a);
        }
        int iA = o.a((g0) fVar.c().f23899i).y().A();
        synchronized (fVar) {
            for (int i3 = 0; i3 < ((g0) ((d0) fVar.f26119b).f19594i).z(); i3++) {
                try {
                    f0 f0VarY = ((g0) ((d0) fVar.f26119b).f19594i).y(i3);
                    if (f0VarY.B() == iA) {
                        if (!f0VarY.D().equals(Z.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iA);
                        }
                        d0 d0Var = (d0) fVar.f26119b;
                        d0Var.e();
                        g0.w((g0) d0Var.f19594i, iA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + iA);
        }
        Context context = (Context) this.f25018h;
        String str = (String) this.f25019i;
        String str2 = (String) this.j;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((b) this.f25021l) != null) {
            j1.l lVarC = fVar.c();
            b bVar = (b) this.f25021l;
            byte[] bArr = new byte[0];
            g0 g0Var = (g0) lVarC.f23899i;
            byte[] bArrA = bVar.a(g0Var.e(), bArr);
            try {
                if (!g0.E(bVar.b(bArrA, bArr), C1921p.a()).equals(g0Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                M mZ = N.z();
                C1914i c1914iF = AbstractC1915j.f(bArrA, 0, bArrA.length);
                mZ.e();
                N.w((N) mZ.f19594i, c1914iF);
                k0 k0VarA = o.a(g0Var);
                mZ.e();
                N.x((N) mZ.f19594i, k0VarA);
                if (!editorEdit.putString(str, k.f(((N) mZ.b()).e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (D unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, k.f(((g0) fVar.c().f23899i).e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return fVar;
    }

    @Override
    public void c() {
        HashMap arguments = (HashMap) this.f25019i;
        p179v4.o oVar = (p179v4.o) this.j;
        oVar.getClass();
        p101l7.b bVar = (p101l7.b) this.f25021l;
        m.e(arguments, "arguments");
        boolean zI = false;
        if (bVar.equals(J6.a.f6632b)) {
            Object obj = arguments.get(e.e("value"));
            s sVar = obj instanceof s ? (s) obj : null;
            if (sVar != null) {
                Object obj2 = sVar.f26656a;
                q qVar = obj2 instanceof q ? (q) obj2 : null;
                if (qVar != null) {
                    zI = oVar.i(qVar.f26666a.f26654a);
                }
            }
        }
        if (zI || oVar.i(bVar)) {
            return;
        }
        ((List) this.f25022m).add(new c(((InterfaceC0691e) this.f25020k).j(), arguments, (P) this.f25023n));
    }

    public o4.f f(byte[] bArr) {
        try {
            this.f25021l = new p174u4.c().c((String) this.f25020k);
            try {
                return new o4.f(3, (d0) ((g0) j1.l.t(new o4.f(1, new ByteArrayInputStream(bArr)), (b) this.f25021l).f23899i).v());
            } catch (IOException | GeneralSecurityException e6) {
                try {
                    return e(bArr);
                } catch (IOException unused) {
                    throw e6;
                }
            }
        } catch (GeneralSecurityException | ProviderException e9) {
            try {
                o4.f fVarE = e(bArr);
                Log.w(CmcdData.OBJECT_TYPE_AUDIO_ONLY, "cannot use Android Keystore, it'll be disabled", e9);
                return fVarE;
            } catch (IOException unused2) {
                throw e9;
            }
        }
    }

    @Override
    public p044e7.m g(e eVar) {
        return new A7.m((p179v4.o) this.f25018h, eVar, this);
    }

    public b h() throws KeyStoreException {
        p174u4.c cVar = new p174u4.c();
        try {
            boolean zA = p174u4.c.a((String) this.f25020k);
            try {
                return cVar.c((String) this.f25020k);
            } catch (GeneralSecurityException | ProviderException e6) {
                if (!zA) {
                    throw new KeyStoreException(f.h("the master key ", (String) this.f25020k, " exists but is unusable"), e6);
                }
                Log.w(CmcdData.OBJECT_TYPE_AUDIO_ONLY, "cannot use Android Keystore, it'll be disabled", e6);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e9) {
            Log.w(CmcdData.OBJECT_TYPE_AUDIO_ONLY, "cannot use Android Keystore, it'll be disabled", e9);
            return null;
        }
    }

    @Override
    public void i(e eVar, Object obj) {
        ((HashMap) this.f25019i).put(eVar, p179v4.o.b((p179v4.o) this.f25018h, eVar, obj));
    }

    @Override
    public void p(e eVar, p142q7.f fVar) {
        ((HashMap) this.f25019i).put(eVar, new s(new q(fVar)));
    }

    @Override
    public void s(e eVar, p101l7.b bVar, e eVar2) {
        ((HashMap) this.f25019i).put(eVar, new i(bVar, eVar2));
    }

    @Override
    public l t(p101l7.b bVar, e eVar) {
        ArrayList arrayList = new ArrayList();
        return new d(((p179v4.o) this.f25018h).j(bVar, P.f7377b, arrayList), this, eVar, arrayList);
    }
}
