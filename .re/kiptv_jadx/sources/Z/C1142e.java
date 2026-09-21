package Z;

/* JADX INFO: renamed from: Z.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142e extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f12385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O0.U f12386i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f12387k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142e(java.util.ArrayList arrayList, O0.U u6, int i3, java.util.ArrayList arrayList2) {
        super(1);
        float f9 = Z.AbstractC1154k.f12438a;
        this.f12385h = arrayList;
        this.f12386i = u6;
        this.j = i3;
        this.f12387k = arrayList2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        O0.U u6;
        O0.f0 f0Var = (O0.f0) obj;
        java.util.ArrayList arrayList = this.f12385h;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            java.util.List list = (java.util.List) arrayList.get(i3);
            int size2 = list.size();
            int[] iArr = new int[size2];
            int i9 = 0;
            while (true) {
                u6 = this.f12386i;
                if (i9 >= size2) {
                    break;
                }
                iArr[i9] = ((O0.g0) list.get(i9)).f7639h + (i9 < p078i6.p.A0(list) ? u6.k0(Z.AbstractC1154k.f12440c) : 0);
                i9++;
            }
            B.C0064b c0064b = B.AbstractC0071i.f537b;
            int[] iArr2 = new int[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                iArr2[i10] = 0;
            }
            c0064b.c(u6, this.j, iArr, u6.getLayoutDirection(), iArr2);
            int size3 = list.size();
            for (int i11 = 0; i11 < size3; i11++) {
                f0Var.g((O0.g0) list.get(i11), iArr2[i11], ((java.lang.Number) this.f12387k.get(i3)).intValue(), 0.0f);
            }
        }
        return p070h6.A.f22523a;
    }
}
