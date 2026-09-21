package q2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.InterfaceC1538u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f26592i;

    public /* synthetic */ d(int i3, java.lang.Object obj) {
        this.f26591h = i3;
        this.f26592i = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1538u
    public final void b(androidx.lifecycle.InterfaceC1540w interfaceC1540w, androidx.lifecycle.EnumC1532n enumC1532n) {
        switch (this.f26591h) {
            case 0:
                androidx.lifecycle.EnumC1533o enumC1533oA = enumC1532n.a();
                q2.f fVar = (q2.f) this.f26592i;
                fVar.f26609q = enumC1533oA;
                if (fVar.f26597c != null) {
                    for (p114n2.C2650i c2650i : p078i6.o.O1(fVar.f26600f)) {
                        c2650i.getClass();
                        q2.c cVar = c2650i.f25630o;
                        cVar.getClass();
                        cVar.f26583d = enumC1532n.a();
                        cVar.b();
                    }
                }
                break;
            default:
                androidx.lifecycle.EnumC1532n enumC1532n2 = androidx.lifecycle.EnumC1532n.ON_START;
                p177v2.a aVar = (p177v2.a) this.f26592i;
                if (enumC1532n == enumC1532n2) {
                    aVar.f29154h = true;
                } else if (enumC1532n == androidx.lifecycle.EnumC1532n.ON_STOP) {
                    aVar.f29154h = false;
                }
                break;
        }
    }
}
