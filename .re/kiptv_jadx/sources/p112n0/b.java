package p112n0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p020c0.C0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p112n0.k f25527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p112n0.g f25528i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f25529k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object[] f25530l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p112n0.f f25531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p077i5.C2237d f25532n = new p077i5.C2237d(11, this);

    public b(p112n0.k kVar, p112n0.g gVar, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
        this.f25527h = kVar;
        this.f25528i = gVar;
        this.j = str;
        this.f25529k = obj;
        this.f25530l = objArr;
    }

    @Override // p020c0.C0
    public final void a() {
        p112n0.f fVar = this.f25531m;
        if (fVar != null) {
            ((j1.l) fVar).B();
        }
    }

    public final void b() {
        java.lang.String strA;
        p112n0.g gVar = this.f25528i;
        if (this.f25531m != null) {
            throw new java.lang.IllegalArgumentException(("entry(" + this.f25531m + ") is not null").toString());
        }
        if (gVar != null) {
            p077i5.C2237d c2237d = this.f25532n;
            java.lang.Object objInvoke = c2237d.invoke();
            if (objInvoke == null || gVar.b(objInvoke)) {
                this.f25531m = gVar.e(this.j, c2237d);
                return;
            }
            if (objInvoke instanceof p121o0.l) {
                p121o0.l lVar = (p121o0.l) objInvoke;
                if (lVar.b() == p020c0.C1676e.f18240k || lVar.b() == p020c0.C1676e.f18243n || lVar.b() == p020c0.C1676e.f18241l) {
                    strA = "MutableState containing " + lVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = p112n0.l.a(objInvoke);
            }
            throw new java.lang.IllegalArgumentException(strA);
        }
    }

    @Override // p020c0.C0
    public final void c() {
        p112n0.f fVar = this.f25531m;
        if (fVar != null) {
            ((j1.l) fVar).B();
        }
    }

    @Override // p020c0.C0
    public final void d() {
        b();
    }
}
