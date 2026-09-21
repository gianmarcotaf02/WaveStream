package p007a7;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p007a7.o f15482i;

    public /* synthetic */ m(p007a7.o oVar, int i3) {
        this.f15481h = i3;
        this.f15482i = oVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p101l7.e it = (p101l7.e) obj;
        switch (this.f15481h) {
            case 0:
                kotlin.jvm.internal.m.e(it, "it");
                return this.f15482i.N(it);
            default:
                kotlin.jvm.internal.m.e(it, "it");
                return this.f15482i.O(it);
        }
    }
}
