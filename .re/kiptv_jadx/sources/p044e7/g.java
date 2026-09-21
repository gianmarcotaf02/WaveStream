package p044e7;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements A7.r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p169t7.b f21456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p169t7.b f21457i;
    public final S6.b j;

    public g(S6.b kotlinClass, p062g7.C packageProto, k7.g nameResolver, A7.q qVar) {
        kotlin.jvm.internal.m.e(kotlinClass, "kotlinClass");
        kotlin.jvm.internal.m.e(packageProto, "packageProto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        p169t7.b bVar = new p169t7.b(p169t7.b.e(T6.AbstractC0926d.a(kotlinClass.f9510a)));
        A8.t tVar = kotlinClass.f9511b;
        p169t7.b bVarC = null;
        java.lang.String str = ((p054f7.a) tVar.f453c) == p054f7.a.MULTIFILE_CLASS_PART ? (java.lang.String) tVar.f457h : null;
        if (str != null && str.length() > 0) {
            bVarC = p169t7.b.c(str);
        }
        this.f21456h = bVar;
        this.f21457i = bVarC;
        this.j = kotlinClass;
        p110m7.C2641n packageModuleName = j7.k.f24331m;
        kotlin.jvm.internal.m.d(packageModuleName, "packageModuleName");
        java.lang.Integer num = (java.lang.Integer) com.google.android.gms.internal.play_billing.AbstractC1853k0.v(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.n0(num.intValue());
        }
    }

    public final p101l7.b a() {
        p101l7.c cVar;
        p169t7.b bVar = this.f21456h;
        java.lang.String str = bVar.f28530a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = p101l7.c.f24828c;
            if (cVar == null) {
                p169t7.b.a(9);
                throw null;
            }
        } else {
            cVar = new p101l7.c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        java.lang.String strD = bVar.d();
        kotlin.jvm.internal.m.d(strD, "getInternalName(...)");
        return new p101l7.b(cVar, p101l7.e.e(O7.q.k1('/', strD, strD)));
    }

    public final java.lang.String toString() {
        return p044e7.g.class.getSimpleName() + ": " + this.f21456h;
    }
}
