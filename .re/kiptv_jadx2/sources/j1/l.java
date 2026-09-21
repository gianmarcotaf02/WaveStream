package j1;

import A4.N;
import A4.X;
import A4.Y;
import A4.Z;
import A4.f0;
import A4.g0;
import A4.r0;
import B3.AbstractC0088a;
import H3.q;
import Z2.M;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Parcel;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.media3.exoplayer.Renderer;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.AbstractC1818z;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.crypto.tink.shaded.protobuf.C1921p;
import com.google.crypto.tink.shaded.protobuf.D;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import p048f1.E;
import p103m.r;
import p105m2.C2608f;
import p131p4.m;
import p131p4.n;
import p131p4.p;
import p136q.H;
import p179v4.o;
import p184w3.C;
import p188x0.InterfaceC3097q;

public final class l implements p112n0.f, F3.l {

    public final int f23898h;

    public Object f23899i;
    public Object j;

    public Object f23900k;

    public l(int i3, boolean z6) {
        this.f23898h = i3;
    }

    public static final l h(g0 g0Var) throws GeneralSecurityException {
        if (g0Var.z() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        ArrayList arrayList = new ArrayList(g0Var.z());
        for (f0 f0Var : g0Var.A()) {
            f0Var.getClass();
            try {
                try {
                    o4.b bVarA = p179v4.i.f29169b.a(o.c(f0Var.A().B(), f0Var.A().C(), f0Var.A().A(), f0Var.C(), f0Var.C() == r0.RAW ? null : Integer.valueOf(f0Var.B())));
                    int iOrdinal = f0Var.D().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new o4.h(bVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e6) {
                throw new I3.b("Creating a protokey serialization failed", e6);
            }
        }
        return new l(g0Var, Collections.unmodifiableList(arrayList));
    }

    public static l s(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new l(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static final l t(o4.f fVar, p174u4.b bVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) fVar.f26119b;
        try {
            N nA = N.A(byteArrayInputStream, C1921p.a());
            byteArrayInputStream.close();
            if (nA.y().size() == 0) {
                throw new GeneralSecurityException("empty keyset");
            }
            try {
                g0 g0VarE = g0.E(bVar.b(nA.y().o(), bArr), C1921p.a());
                if (g0VarE.z() > 0) {
                    return h(g0VarE);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (D unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public void A(long j) {
        ((p203z0.b) this.f23900k).f32127h.f32126d = j;
    }

    public void B() {
        H h9 = (H) this.f23899i;
        String str = (String) this.j;
        List list = (List) h9.k(str);
        if (list != null) {
            list.remove((Function0) this.f23900k);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        h9.m(str, list);
    }

    public void C(int i3, String str, String str2) {
        ((HashMap) this.f23899i).put(str, str2);
        ((HashMap) this.j).put(str2, str);
        ((HashMap) this.f23900k).put(str, Integer.valueOf(i3));
    }

    @Override
    public void K(Object obj, Object obj2) {
        B3.D d4 = (B3.D) obj;
        p059g4.d dVar = (p059g4.d) obj2;
        switch (this.f23898h) {
            case 13:
                C c9 = (C) this.f23899i;
                q.i("Not connected to device", c9.f29799F == 3);
                B3.h hVar = (B3.h) d4.p();
                Parcel parcelY = hVar.Y();
                parcelY.writeString((String) this.j);
                AbstractC1818z.c(parcelY, (p184w3.i) this.f23900k);
                hVar.b0(parcelY, 13);
                synchronized (c9.f29807r) {
                    try {
                        if (c9.f29804o != null) {
                            c9.h(2477);
                        }
                        c9.f29804o = dVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                q.i("Not active connection", ((C) this.f23899i).f29799F != 1);
                if (((p184w3.f) this.j) != null) {
                    B3.h hVar2 = (B3.h) d4.p();
                    Parcel parcelY2 = hVar2.Y();
                    parcelY2.writeString((String) this.f23900k);
                    hVar2.b0(parcelY2, 12);
                }
                dVar.b(null);
                return;
        }
    }

    public p131p4.i a() throws GeneralSecurityException {
        A.a aVar;
        p131p4.k kVar = (p131p4.k) this.f23899i;
        if (kVar == null || (aVar = (A.a) this.j) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f26214b != ((C4.a) aVar.f9i).f889a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        p131p4.j jVar = p131p4.j.f26201e;
        p131p4.j jVar2 = kVar.f26217e;
        if (jVar2 != jVar && ((Integer) this.f23900k) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f23900k) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            C4.a.a(new byte[0]);
        } else if (jVar2 == p131p4.j.f26200d) {
            C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f23900k).intValue()).array());
        } else {
            if (jVar2 != p131p4.j.f26199c) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((p131p4.k) this.f23899i).f26217e);
            }
            C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f23900k).intValue()).array());
        }
        return new p131p4.i();
    }

    public m b() throws GeneralSecurityException {
        A.a aVar;
        n nVar = (n) this.f23899i;
        if (nVar == null || (aVar = (A.a) this.j) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (nVar.f26222b != ((C4.a) aVar.f9i).f889a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        p131p4.j jVar = p131p4.j.f26203h;
        p131p4.j jVar2 = nVar.f26225e;
        if (jVar2 != jVar && ((Integer) this.f23900k) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f23900k) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            C4.a.a(new byte[0]);
        } else if (jVar2 == p131p4.j.g) {
            C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f23900k).intValue()).array());
        } else {
            if (jVar2 != p131p4.j.f26202f) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((n) this.f23899i).f26225e);
            }
            C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f23900k).intValue()).array());
        }
        return new m();
    }

    public p c() throws GeneralSecurityException {
        A.a aVar;
        p131p4.q qVar = (p131p4.q) this.f23899i;
        if (qVar == null || (aVar = (A.a) this.j) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (qVar.f26230b != ((C4.a) aVar.f9i).f889a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        p131p4.j jVar = p131p4.j.f26205k;
        p131p4.j jVar2 = qVar.f26231c;
        if (jVar2 != jVar && ((Integer) this.f23900k) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (jVar2 == jVar && ((Integer) this.f23900k) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (jVar2 == jVar) {
            C4.a.a(new byte[0]);
        } else if (jVar2 == p131p4.j.j) {
            C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f23900k).intValue()).array());
        } else {
            if (jVar2 != p131p4.j.f26204i) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((p131p4.q) this.f23899i).f26231c);
            }
            C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f23900k).intValue()).array());
        }
        return new p();
    }

    public p185w4.a d() throws GeneralSecurityException {
        A.a aVar;
        C4.a aVarA;
        p185w4.e eVar = (p185w4.e) this.f23899i;
        if (eVar == null || (aVar = (A.a) this.j) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (eVar.f29971b != ((C4.a) aVar.f9i).f889a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        p185w4.d dVar = p185w4.d.f29961f;
        p185w4.d dVar2 = eVar.f29973d;
        if (dVar2 != dVar && ((Integer) this.f23900k) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar2 == dVar && ((Integer) this.f23900k) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar2 == dVar) {
            aVarA = C4.a.a(new byte[0]);
        } else if (dVar2 == p185w4.d.f29960e || dVar2 == p185w4.d.f29959d) {
            aVarA = C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f23900k).intValue()).array());
        } else {
            if (dVar2 != p185w4.d.f29958c) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((p185w4.e) this.f23899i).f29973d);
            }
            aVarA = C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f23900k).intValue()).array());
        }
        return new p185w4.a((p185w4.e) this.f23899i, aVarA);
    }

    public p185w4.e e() throws GeneralSecurityException {
        Integer num = (Integer) this.f23899i;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.j) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((p185w4.d) this.f23900k) != null) {
            return new p185w4.e(num.intValue(), ((Integer) this.j).intValue(), (p185w4.d) this.f23900k);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public p185w4.j f() throws GeneralSecurityException {
        A.a aVar;
        C4.a aVarA;
        p185w4.k kVar = (p185w4.k) this.f23899i;
        if (kVar == null || (aVar = (A.a) this.j) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (kVar.f29981b != ((C4.a) aVar.f9i).f889a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        p185w4.d dVar = p185w4.d.f29968o;
        p185w4.d dVar2 = kVar.f29983d;
        if (dVar2 != dVar && ((Integer) this.f23900k) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (dVar2 == dVar && ((Integer) this.f23900k) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (dVar2 == dVar) {
            aVarA = C4.a.a(new byte[0]);
        } else if (dVar2 == p185w4.d.f29967n || dVar2 == p185w4.d.f29966m) {
            aVarA = C4.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f23900k).intValue()).array());
        } else {
            if (dVar2 != p185w4.d.f29965l) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((p185w4.k) this.f23899i).f29983d);
            }
            aVarA = C4.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f23900k).intValue()).array());
        }
        return new p185w4.j((p185w4.k) this.f23899i, aVarA);
    }

    public void g() {
        android.support.v4.media.session.q qVar = (android.support.v4.media.session.q) this.f23899i;
        if (qVar != null) {
            int i3 = ((C2608f) this.f23900k).f25296k.f21821e;
            android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) qVar.f15617i;
            mVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i3);
            mVar.f15605a.setPlaybackToLocal(builder.build());
            this.j = null;
        }
    }

    public Object i() {
        long jC = p089k0.f.c();
        if (jC == p089k0.m.f24435a) {
            return this.j;
        }
        p089k0.l lVar = (p089k0.l) ((AtomicReference) this.f23899i).get();
        int iA = lVar.a(jC);
        if (iA >= 0) {
            return lVar.f24434c[iA];
        }
        return null;
    }

    public InterfaceC3097q j() {
        return ((p203z0.b) this.f23900k).f32127h.f32125c;
    }

    public ColorStateList k(int i3) {
        int resourceId;
        ColorStateList colorStateListX;
        TypedArray typedArray = (TypedArray) this.j;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (colorStateListX = AbstractC1903s.x((Context) this.f23899i, resourceId)) == null) ? typedArray.getColorStateList(i3) : colorStateListX;
    }

    public Drawable l(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.j;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : AbstractC1903s.y((Context) this.f23899i, resourceId);
    }

    public Drawable m(int i3) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.j).hasValue(i3) || (resourceId = ((TypedArray) this.j).getResourceId(i3, 0)) == 0) {
            return null;
        }
        r rVarA = r.a();
        Context context = (Context) this.f23899i;
        synchronized (rVarA) {
            drawableD = rVarA.f25109a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public Typeface n(int i3, int i9, M m8) {
        int resourceId = ((TypedArray) this.j).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f23900k) == null) {
            this.f23900k = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f23900k;
        ThreadLocal threadLocal = p176v1.j.f29136a;
        Context context = (Context) this.f23899i;
        if (context.isRestricted()) {
            return null;
        }
        return p176v1.j.a(context, resourceId, typedValue, i9, m8, true);
    }

    public Object o(Class cls) throws GeneralSecurityException {
        Class clsA;
        Object objC;
        Object objB;
        AtomicReference atomicReference = o4.n.f26131a;
        try {
            clsA = p179v4.h.f29167b.a(cls);
        } catch (GeneralSecurityException unused) {
            clsA = null;
        }
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        int i3 = o4.o.f26135a;
        g0 g0Var = (g0) this.f23899i;
        int iB = g0Var.B();
        Iterator it = g0Var.A().iterator();
        boolean z6 = true;
        int i9 = 0;
        boolean z9 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            Z z10 = Z.ENABLED;
            if (!zHasNext) {
                if (i9 == 0) {
                    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                }
                if (!z9 && !z6) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                A7.m mVar = new A7.m(clsA);
                if (((ConcurrentHashMap) mVar.j) == null) {
                    throw new IllegalStateException("setAnnotations cannot be called after build");
                }
                mVar.f323l = (p200y4.a) this.f23900k;
                for (int i10 = 0; i10 < g0Var.z(); i10++) {
                    f0 f0VarY = g0Var.y(i10);
                    if (f0VarY.D().equals(z10)) {
                        try {
                            Y yA = f0VarY.A();
                            AtomicReference atomicReference2 = o4.n.f26131a;
                            objC = o4.n.c(yA.B(), yA.C(), clsA);
                        } catch (GeneralSecurityException e6) {
                            if (!e6.getMessage().contains("No key manager found for key type ") && !e6.getMessage().contains(" not supported by key manager of type ")) {
                                throw e6;
                            }
                            objC = null;
                        }
                        List list = (List) this.j;
                        if (list.get(i10) != null) {
                            try {
                                objB = o4.n.b(((o4.h) list.get(i10)).f26121a, clsA);
                            } catch (GeneralSecurityException unused2) {
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
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mVar.j;
                if (concurrentHashMap == null) {
                    throw new IllegalStateException("build cannot be called twice");
                }
                o4.k kVar = (o4.k) mVar.f322k;
                p200y4.a aVar = (p200y4.a) mVar.f323l;
                Class cls2 = (Class) mVar.f321i;
                l lVar = new l(concurrentHashMap, kVar, aVar, cls2);
                mVar.j = null;
                AtomicReference atomicReference3 = o4.n.f26131a;
                HashMap map = ((p179v4.n) p179v4.h.f29167b.f29168a.get()).f29178b;
                if (!map.containsKey(cls)) {
                    throw new GeneralSecurityException("No wrapper found for " + cls);
                }
                o4.m mVar2 = (o4.m) map.get(cls);
                if (cls2.equals(mVar2.a()) && mVar2.a().equals(cls2)) {
                    return mVar2.c(lVar);
                }
                throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            f0 f0Var = (f0) it.next();
            if (f0Var.D() == z10) {
                if (!f0Var.E()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(f0Var.B())));
                }
                if (f0Var.C() == r0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(f0Var.B())));
                }
                if (f0Var.D() == Z.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(f0Var.B())));
                }
                if (f0Var.B() == iB) {
                    if (z9) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z9 = true;
                }
                if (f0Var.A().A() != X.ASYMMETRIC_PUBLIC) {
                    z6 = false;
                }
                i9++;
            }
        }
    }

    public List p(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f23899i).get(new o4.l(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public long q() {
        return ((p203z0.b) this.f23900k).f32127h.f32126d;
    }

    public boolean r() {
        if (((E) this.f23899i).getValue() != this.f23900k) {
            return true;
        }
        l lVar = (l) this.j;
        return lVar != null && lVar.r();
    }

    public String toString() {
        switch (this.f23898h) {
            case 6:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f23899i;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.j;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f23900k;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String string = sb.toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                return string;
            case 7:
                return o4.o.a((g0) this.f23899i).toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        ((TypedArray) this.j).recycle();
    }

    public void v(Object obj) {
        long jC = p089k0.f.c();
        if (jC == p089k0.m.f24435a) {
            this.j = obj;
            return;
        }
        synchronized (this.f23900k) {
            p089k0.l lVar = (p089k0.l) ((AtomicReference) this.f23899i).get();
            int iA = lVar.a(jC);
            if (iA < 0) {
                ((AtomicReference) this.f23899i).set(lVar.b(jC, obj));
            } else {
                lVar.f24434c[iA] = obj;
            }
        }
    }

    public void w(InterfaceC3097q interfaceC3097q) {
        ((p203z0.b) this.f23900k).f32127h.f32125c = interfaceC3097q;
    }

    public void x(p113n1.c cVar) {
        ((p203z0.b) this.f23900k).f32127h.f32123a = cVar;
    }

    public void y(int i3) throws InvalidAlgorithmParameterException {
        if (i3 != 16 && i3 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i3 * 8)));
        }
        this.f23899i = Integer.valueOf(i3);
    }

    public void z(p113n1.n nVar) {
        ((p203z0.b) this.f23900k).f32127h.f32124b = nVar;
    }

    public l(Object obj, Object obj2, Object obj3, int i3) {
        this.f23898h = i3;
        this.f23899i = obj;
        this.j = obj2;
        this.f23900k = obj3;
    }

    public l(CastDevice castDevice, p191x3.D d4) {
        this.f23898h = 12;
        q.h(castDevice, "CastDevice parameter cannot be null");
        this.f23899i = castDevice;
        this.j = d4;
    }

    public l(p199y3.g gVar) {
        this.f23898h = 19;
        this.f23900k = gVar;
        this.j = new AtomicLong((AbstractC0088a.f616b.nextLong() & 65535) * Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
    }

    public l(int i3) {
        this.f23898h = i3;
        switch (i3) {
            case 2:
                this.f23899i = new AtomicReference(p089k0.f.f24413c);
                this.f23900k = new Object();
                break;
            case 15:
                this.f23899i = new HashMap();
                this.j = new HashMap();
                this.f23900k = new HashMap();
                break;
            default:
                this.f23899i = new WeakHashMap();
                this.j = new WeakHashMap();
                this.f23900k = new WeakHashMap();
                break;
        }
    }

    public l(p203z0.b bVar) {
        this.f23898h = 20;
        this.f23900k = bVar;
        this.f23899i = new p191x3.C(this);
    }

    public l(Context context, TypedArray typedArray) {
        this.f23898h = 3;
        this.f23899i = context;
        this.j = typedArray;
    }

    public l(E e6, l lVar) {
        this.f23898h = 0;
        this.f23899i = e6;
        this.j = lVar;
        this.f23900k = e6.getValue();
    }

    public l(ConcurrentHashMap concurrentHashMap, o4.k kVar, p200y4.a aVar, Class cls) {
        this.f23898h = 8;
        this.f23899i = concurrentHashMap;
        this.j = kVar;
        this.f23900k = aVar;
    }

    public l(g0 g0Var, List list) {
        this.f23898h = 7;
        this.f23899i = g0Var;
        this.j = list;
        this.f23900k = p200y4.a.f31883b;
    }

    public l(C2608f c2608f, android.support.v4.media.session.q qVar) {
        this.f23898h = 4;
        this.f23900k = c2608f;
        this.f23899i = qVar;
    }
}
