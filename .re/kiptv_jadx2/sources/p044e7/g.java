package p044e7;

import A7.q;
import A7.r;
import A8.t;
import T6.AbstractC0926d;
import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import j7.k;
import kotlin.jvm.internal.m;
import p054f7.a;
import p062g7.C;
import p101l7.c;
import p101l7.e;
import p110m7.C2641n;
import p169t7.b;

public final class g implements r {

    public final b f21456h;

    public final b f21457i;
    public final S6.b j;

    public g(S6.b kotlinClass, C packageProto, k7.g nameResolver, q qVar) {
        m.e(kotlinClass, "kotlinClass");
        m.e(packageProto, "packageProto");
        m.e(nameResolver, "nameResolver");
        b bVar = new b(b.e(AbstractC0926d.a(kotlinClass.f9510a)));
        t tVar = kotlinClass.f9511b;
        b bVarC = null;
        String str = ((a) tVar.f453c) == a.MULTIFILE_CLASS_PART ? (String) tVar.f457h : null;
        if (str != null && str.length() > 0) {
            bVarC = b.c(str);
        }
        this.f21456h = bVar;
        this.f21457i = bVarC;
        this.j = kotlinClass;
        C2641n packageModuleName = k.f24331m;
        m.d(packageModuleName, "packageModuleName");
        Integer num = (Integer) AbstractC1853k0.v(packageProto, packageModuleName);
        if (num != null) {
            nameResolver.n0(num.intValue());
        }
    }

    public final p101l7.b a() {
        c cVar;
        b bVar = this.f21456h;
        String str = bVar.f28530a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            cVar = c.f24828c;
            if (cVar == null) {
                b.a(9);
                throw null;
            }
        } else {
            cVar = new c(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strD = bVar.d();
        m.d(strD, "getInternalName(...)");
        return new p101l7.b(cVar, e.e(O7.q.k1('/', strD, strD)));
    }

    public final String toString() {
        return g.class.getSimpleName() + ": " + this.f21456h;
    }
}
