package H5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E.w f4294i;

    public /* synthetic */ r(E.w wVar, int i3) {
        this.f4293h = i3;
        this.f4294i = wVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f4293h) {
            case 0:
                E.p pVarG = this.f4294i.g();
                E.q qVar = (E.q) p078i6.o.s1(pVarG.f2675m);
                boolean z6 = false;
                int i3 = qVar != null ? qVar.f2682a : 0;
                int i9 = pVarG.f2678p;
                if (i9 > 0 && i3 >= i9 - 13) {
                    z6 = true;
                }
                return java.lang.Boolean.valueOf(z6);
            default:
                E.p pVarG2 = this.f4294i.g();
                E.q qVar2 = (E.q) p078i6.o.s1(pVarG2.f2675m);
                boolean z9 = false;
                int i10 = qVar2 != null ? qVar2.f2682a : 0;
                int i11 = pVarG2.f2678p;
                if (i11 > 0 && i10 >= i11 - 13) {
                    z9 = true;
                }
                return java.lang.Boolean.valueOf(z9);
        }
    }
}
