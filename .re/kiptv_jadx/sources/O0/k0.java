package O0;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f7654i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i3, java.util.ArrayList arrayList) {
        super(1);
        this.f7653h = i3;
        this.f7654i = arrayList;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f7653h) {
            case 0:
                O0.f0 f0Var = (O0.f0) obj;
                java.util.ArrayList arrayList = this.f7654i;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    O0.f0.k(f0Var, (O0.g0) arrayList.get(i3), 0, 0);
                }
                break;
            case 1:
                O0.f0 f0Var2 = (O0.f0) obj;
                java.util.ArrayList arrayList2 = this.f7654i;
                int size2 = arrayList2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    O0.f0.j(f0Var2, (O0.g0) arrayList2.get(i9), 0, 0);
                }
                break;
            case 2:
                O0.f0 f0Var3 = (O0.f0) obj;
                java.util.ArrayList arrayList3 = this.f7654i;
                int iA0 = p078i6.p.A0(arrayList3);
                if (iA0 >= 0) {
                    int i10 = 0;
                    while (true) {
                        O0.f0.j(f0Var3, (O0.g0) arrayList3.get(i10), 0, 0);
                        if (i10 != iA0) {
                            i10++;
                        }
                    }
                }
                break;
            default:
                O0.f0 f0Var4 = (O0.f0) obj;
                java.util.ArrayList arrayList4 = this.f7654i;
                int size3 = arrayList4.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    f0Var4.g((O0.g0) arrayList4.get(i11), 0, 0, 0.0f);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
