package p005a5;

/* JADX INFO: renamed from: a5.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1448x2 implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p005a5.C1448x2 f15287i = new p005a5.C1448x2(0);
    public static final p005a5.C1448x2 j = new p005a5.C1448x2(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p005a5.C1448x2 f15288k = new p005a5.C1448x2(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15289h;

    public /* synthetic */ C1448x2(int i3) {
        this.f15289h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f15289h) {
            case 0:
                p070h6.k it = (p070h6.k) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return p078i6.o.o1((java.lang.Iterable) it.f22540i, ",", null, null, new p005a5.C1438w2(it, 0), 30);
            case 1:
                p070h6.k it2 = (p070h6.k) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return p078i6.o.o1((java.lang.Iterable) it2.f22540i, ",", null, null, new p005a5.C1438w2(it2, 1), 30);
            default:
                p070h6.k it3 = (p070h6.k) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return p078i6.o.o1((java.lang.Iterable) it3.f22540i, ",", null, null, new p005a5.C1438w2(it3, 2), 30);
        }
    }
}
