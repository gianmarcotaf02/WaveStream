package p044e7;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.Set f21448b = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(p054f7.a.CLASS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.Set f21449c = p078i6.m.F0(new p054f7.a[]{p054f7.a.FILE_FACADE, p054f7.a.MULTIFILE_CLASS_PART});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k7.f f21450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k7.f f21451e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y7.j f21452a;

    static {
        new k7.f(new int[]{1, 1, 2}, false);
        f21450d = new k7.f(new int[]{1, 1, 11}, false);
        f21451e = new k7.f(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    public final A7.z a(N6.G descriptor, S6.b kotlinClass) {
        p070h6.k kVarH;
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(kotlinClass, "kotlinClass");
        A8.t tVar = kotlinClass.f9511b;
        java.lang.String[] strArr = (java.lang.String[]) tVar.f455e;
        if (strArr == null) {
            strArr = (java.lang.String[]) tVar.f456f;
        }
        if (strArr != null) {
            if (!f21449c.contains((p054f7.a) tVar.f453c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            k7.f fVar = (k7.f) tVar.f454d;
            java.lang.String[] strArr2 = (java.lang.String[]) tVar.g;
            if (strArr2 != null) {
                try {
                    try {
                        kVarH = k7.h.h(strArr, strArr2);
                    } catch (p110m7.r e6) {
                        throw new java.lang.IllegalStateException("Could not read data from " + kotlinClass.a(), e6);
                    }
                } catch (java.lang.Throwable th) {
                    c().f32048c.getClass();
                    kotlin.jvm.internal.m.e(c().f32048c, "<this>");
                    if (fVar.b(k7.f.g)) {
                        throw th;
                    }
                    kVarH = null;
                }
                if (kVarH != null) {
                    k7.g gVar = (k7.g) kVarH.f22539h;
                    p062g7.C c9 = (p062g7.C) kVarH.f22540i;
                    d(kotlinClass);
                    e(kotlinClass);
                    p044e7.g gVar2 = new p044e7.g(kotlinClass, c9, gVar, b(kotlinClass));
                    return new A7.z(descriptor, c9, gVar, fVar, gVar2, c(), "scope for " + gVar2 + " in " + descriptor, p044e7.d.f21447h);
                }
            }
        }
        return null;
    }

    public final A7.q b(S6.b bVar) {
        c().f32048c.getClass();
        int i3 = bVar.f9511b.f452b;
        return ((i3 & 16) == 0 || (i3 & 32) != 0) ? A7.q.f344h : A7.q.f345i;
    }

    public final y7.j c() {
        y7.j jVar = this.f21452a;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.m.k("components");
        throw null;
    }

    public final y7.q d(S6.b bVar) {
        c().f32048c.getClass();
        k7.f fVar = (k7.f) bVar.f9511b.f454d;
        kotlin.jvm.internal.m.e(c().f32048c, "<this>");
        k7.f fVar2 = k7.f.g;
        if (fVar.b(fVar2)) {
            return null;
        }
        k7.f fVar3 = (k7.f) bVar.f9511b.f454d;
        kotlin.jvm.internal.m.e(c().f32048c, "<this>");
        kotlin.jvm.internal.m.e(c().f32048c, "<this>");
        fVar2.getClass();
        k7.f fVar4 = fVar3.f24503f ? fVar2 : k7.f.f24502h;
        fVar4.getClass();
        int i3 = fVar2.f23211b;
        int i9 = fVar4.f23211b;
        return new y7.q(fVar3, fVar2, fVar2, (i9 <= i3 && (i9 < i3 || fVar4.f23212c <= fVar2.f23212c)) ? fVar2 : fVar4, bVar.a(), T6.AbstractC0926d.a(bVar.f9510a));
    }

    public final boolean e(S6.b bVar) {
        c().f32048c.getClass();
        c().f32048c.getClass();
        A8.t tVar = bVar.f9511b;
        return ((tVar.f452b & 2) != 0) && ((k7.f) tVar.f454d).equals(f21450d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    public final y7.C3162d f(S6.b bVar) {
        p070h6.k kVarF;
        A8.t tVar = bVar.f9511b;
        java.lang.String[] strArr = (java.lang.String[]) tVar.f455e;
        if (strArr == null) {
            strArr = (java.lang.String[]) tVar.f456f;
        }
        if (strArr != null) {
            if (!f21448b.contains((p054f7.a) tVar.f453c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            k7.f fVar = (k7.f) tVar.f454d;
            java.lang.String[] strArr2 = (java.lang.String[]) tVar.g;
            if (strArr2 != null) {
                try {
                    try {
                        kVarF = k7.h.f(strArr, strArr2);
                    } catch (p110m7.r e6) {
                        throw new java.lang.IllegalStateException("Could not read data from " + bVar.a(), e6);
                    }
                } catch (java.lang.Throwable th) {
                    c().f32048c.getClass();
                    kotlin.jvm.internal.m.e(c().f32048c, "<this>");
                    if (fVar.b(k7.f.g)) {
                        throw th;
                    }
                    kVarF = null;
                }
                if (kVarF != null) {
                    k7.g gVar = (k7.g) kVarF.f22539h;
                    p062g7.C2163j c2163j = (p062g7.C2163j) kVarF.f22540i;
                    d(bVar);
                    e(bVar);
                    return new y7.C3162d(gVar, c2163j, fVar, new p044e7.n(bVar, b(bVar)));
                }
            }
        }
        return null;
    }
}
