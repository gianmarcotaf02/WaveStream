package p205z2;

/* JADX INFO: loaded from: classes.dex */
public final class N extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f32203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O0.r0 f32204i;
    public final /* synthetic */ java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f32205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p089k0.e f32206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f32207m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f32209o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(java.util.ArrayList arrayList, O0.r0 r0Var, java.util.ArrayList arrayList2, int i3, p089k0.e eVar, p020c0.X x9, int i9, int i10) {
        super(1);
        this.f32203h = arrayList;
        this.f32204i = r0Var;
        this.j = arrayList2;
        this.f32205k = i3;
        this.f32206l = eVar;
        this.f32207m = x9;
        this.f32208n = i9;
        this.f32209o = i10;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        O0.r0 r0Var;
        O0.f0 f0Var = (O0.f0) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f32203h;
        int size = arrayList2.size();
        int i3 = 0;
        int i9 = 0;
        while (true) {
            r0Var = this.f32204i;
            if (i3 >= size) {
                break;
            }
            O0.g0 g0Var = (O0.g0) arrayList2.get(i3);
            O0.f0.j(f0Var, g0Var, i9, 0);
            arrayList.add(new p113n1.h(r0Var.K(i9), r0Var.K(0), r0Var.K(g0Var.f7639h + i9), r0Var.K(g0Var.f7640i)));
            int i10 = i9 + g0Var.f7639h;
            if (p078i6.p.A0(arrayList2) != i3) {
                O0.f0.j(f0Var, (O0.g0) this.j.get(i3), i10, 0);
            }
            i9 = i10 + this.f32205k;
            i3++;
        }
        java.util.List listC0 = r0Var.c0(p205z2.Q.f32214i, new p089k0.e(1938511990, new R0.N(this.f32206l, arrayList, this.f32207m), true));
        int size2 = listC0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            O0.Q q9 = (O0.Q) listC0.get(i11);
            int i12 = this.f32208n;
            boolean z6 = i12 >= 0;
            int i13 = this.f32209o;
            if (!(z6 & (i13 >= 0))) {
                p113n1.j.a("width and height must be >= 0");
            }
            O0.f0.j(f0Var, q9.C(p113n1.b.h(i12, i12, i13, i13)), 0, 0);
        }
        return p070h6.A.f22523a;
    }
}
