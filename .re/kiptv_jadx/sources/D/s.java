package D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f1744i;
    public final /* synthetic */ java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1745k;

    public /* synthetic */ s(p020c0.X x9, java.util.ArrayList arrayList, java.util.List list, boolean z6, int i3) {
        this.f1743h = i3;
        this.f1744i = x9;
        this.j = arrayList;
        this.f1745k = list;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        O0.f0 f0Var = (O0.f0) obj;
        switch (this.f1743h) {
            case 0:
                java.util.ArrayList arrayList = this.j;
                ?? r9 = this.f1745k;
                f0Var.f7634h = true;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((D.u) arrayList.get(i3)).i(f0Var);
                }
                int size2 = r9.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    ((D.u) r9.get(i9)).i(f0Var);
                }
                f0Var.f7634h = false;
                this.f1744i.getValue();
                break;
            default:
                java.util.ArrayList arrayList2 = this.j;
                ?? r10 = this.f1745k;
                f0Var.f7634h = true;
                int size3 = arrayList2.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    ((E.q) arrayList2.get(i10)).i(f0Var);
                }
                int size4 = r10.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    ((E.q) r10.get(i11)).i(f0Var);
                }
                f0Var.f7634h = false;
                this.f1744i.getValue();
                break;
        }
        return p070h6.A.f22523a;
    }
}
