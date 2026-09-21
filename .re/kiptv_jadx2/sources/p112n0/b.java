package p112n0;

import j1.l;
import p020c0.C0;
import p020c0.C1676e;
import p077i5.C2237d;

public final class b implements C0 {

    public k f25527h;

    public g f25528i;
    public String j;

    public Object f25529k;

    public Object[] f25530l;

    public f f25531m;

    public final C2237d f25532n = new C2237d(11, this);

    public b(k kVar, g gVar, String str, Object obj, Object[] objArr) {
        this.f25527h = kVar;
        this.f25528i = gVar;
        this.j = str;
        this.f25529k = obj;
        this.f25530l = objArr;
    }

    @Override
    public final void a() {
        f fVar = this.f25531m;
        if (fVar != null) {
            ((l) fVar).B();
        }
    }

    public final void b() {
        String strA;
        g gVar = this.f25528i;
        if (this.f25531m != null) {
            throw new IllegalArgumentException(("entry(" + this.f25531m + ") is not null").toString());
        }
        if (gVar != null) {
            C2237d c2237d = this.f25532n;
            Object objInvoke = c2237d.invoke();
            if (objInvoke == null || gVar.b(objInvoke)) {
                this.f25531m = gVar.e(this.j, c2237d);
                return;
            }
            if (objInvoke instanceof p121o0.l) {
                p121o0.l lVar = (p121o0.l) objInvoke;
                if (lVar.b() == C1676e.f18240k || lVar.b() == C1676e.f18243n || lVar.b() == C1676e.f18241l) {
                    strA = "MutableState containing " + lVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = l.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override
    public final void c() {
        f fVar = this.f25531m;
        if (fVar != null) {
            ((l) fVar).B();
        }
    }

    @Override
    public final void d() {
        b();
    }
}
