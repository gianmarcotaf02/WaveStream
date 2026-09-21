package O0;

/* JADX INFO: renamed from: O0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0724m extends kotlin.jvm.internal.o implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O0.C0725n[] f7658i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0724m(O0.C0725n[] c0725nArr, int i3) {
        super(2);
        this.f7657h = i3;
        this.f7658i = c0725nArr;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f7657h) {
            case 0:
                return java.lang.Float.valueOf(O0.AbstractC0735y.d((O0.f0) obj, true, this.f7658i, ((java.lang.Number) obj2).floatValue()));
            default:
                return java.lang.Float.valueOf(O0.AbstractC0735y.d((O0.f0) obj, false, this.f7658i, ((java.lang.Number) obj2).floatValue()));
        }
    }
}
