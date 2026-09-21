package p044e7;

import A7.q;
import A7.z;
import A8.t;
import N6.G;
import S6.b;
import T6.AbstractC0926d;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.Set;
import k7.f;
import k7.g;
import k7.h;
import p054f7.a;
import p062g7.C;
import p062g7.C2163j;
import p070h6.k;
import p078i6.m;
import p110m7.r;
import y7.C3162d;
import y7.j;

public final class e {

    public static final Set f21448b = AbstractC1909d.h0(a.CLASS);

    public static final Set f21449c = m.F0(new a[]{a.FILE_FACADE, a.MULTIFILE_CLASS_PART});

    public static final f f21450d;

    public static final f f21451e;

    public j f21452a;

    static {
        new f(new int[]{1, 1, 2}, false);
        f21450d = new f(new int[]{1, 1, 11}, false);
        f21451e = new f(new int[]{1, 1, 13}, false);
    }

    public final z a(G descriptor, b kotlinClass) {
        k kVarH;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(kotlinClass, "kotlinClass");
        t tVar = kotlinClass.f9511b;
        String[] strArr = (String[]) tVar.f455e;
        if (strArr == null) {
            strArr = (String[]) tVar.f456f;
        }
        if (strArr != null) {
            if (!f21449c.contains((a) tVar.f453c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            f fVar = (f) tVar.f454d;
            String[] strArr2 = (String[]) tVar.g;
            if (strArr2 != null) {
                try {
                    try {
                        kVarH = h.h(strArr, strArr2);
                    } catch (r e6) {
                        throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e6);
                    }
                } catch (Throwable th) {
                    c().f32048c.getClass();
                    kotlin.jvm.internal.m.e(c().f32048c, "<this>");
                    if (fVar.b(f.g)) {
                        throw th;
                    }
                    kVarH = null;
                }
                if (kVarH != null) {
                    g gVar = (g) kVarH.f22539h;
                    C c9 = (C) kVarH.f22540i;
                    d(kotlinClass);
                    e(kotlinClass);
                    g gVar2 = new g(kotlinClass, c9, gVar, b(kotlinClass));
                    return new z(descriptor, c9, gVar, fVar, gVar2, c(), "scope for " + gVar2 + " in " + descriptor, d.f21447h);
                }
            }
        }
        return null;
    }

    public final q b(b bVar) {
        c().f32048c.getClass();
        int i3 = bVar.f9511b.f452b;
        return ((i3 & 16) == 0 || (i3 & 32) != 0) ? q.f344h : q.f345i;
    }

    public final j c() {
        j jVar = this.f21452a;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.m.k("components");
        throw null;
    }

    public final y7.q d(b bVar) {
        c().f32048c.getClass();
        f fVar = (f) bVar.f9511b.f454d;
        kotlin.jvm.internal.m.e(c().f32048c, "<this>");
        f fVar2 = f.g;
        if (fVar.b(fVar2)) {
            return null;
        }
        f fVar3 = (f) bVar.f9511b.f454d;
        kotlin.jvm.internal.m.e(c().f32048c, "<this>");
        kotlin.jvm.internal.m.e(c().f32048c, "<this>");
        fVar2.getClass();
        f fVar4 = fVar3.f24503f ? fVar2 : f.f24502h;
        fVar4.getClass();
        int i3 = fVar2.f23211b;
        int i9 = fVar4.f23211b;
        return new y7.q(fVar3, fVar2, fVar2, (i9 <= i3 && (i9 < i3 || fVar4.f23212c <= fVar2.f23212c)) ? fVar2 : fVar4, bVar.a(), AbstractC0926d.a(bVar.f9510a));
    }

    public final boolean e(b bVar) {
        c().f32048c.getClass();
        c().f32048c.getClass();
        t tVar = bVar.f9511b;
        return ((tVar.f452b & 2) != 0) && ((f) tVar.f454d).equals(f21450d);
    }

    public final C3162d f(b bVar) {
        k kVarF;
        t tVar = bVar.f9511b;
        String[] strArr = (String[]) tVar.f455e;
        if (strArr == null) {
            strArr = (String[]) tVar.f456f;
        }
        if (strArr != null) {
            if (!f21448b.contains((a) tVar.f453c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            f fVar = (f) tVar.f454d;
            String[] strArr2 = (String[]) tVar.g;
            if (strArr2 != null) {
                try {
                    try {
                        kVarF = h.f(strArr, strArr2);
                    } catch (r e6) {
                        throw new IllegalStateException("Could not read data from " + bVar.a(), e6);
                    }
                } catch (Throwable th) {
                    c().f32048c.getClass();
                    kotlin.jvm.internal.m.e(c().f32048c, "<this>");
                    if (fVar.b(f.g)) {
                        throw th;
                    }
                    kVarF = null;
                }
                if (kVarF != null) {
                    g gVar = (g) kVarF.f22539h;
                    C2163j c2163j = (C2163j) kVarF.f22540i;
                    d(bVar);
                    e(bVar);
                    return new C3162d(gVar, c2163j, fVar, new n(bVar, b(bVar)));
                }
            }
        }
        return null;
    }
}
