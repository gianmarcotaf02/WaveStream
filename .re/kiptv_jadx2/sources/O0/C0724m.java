package O0;

public final class C0724m extends kotlin.jvm.internal.o implements p194x6.m {

    public final int f7657h;

    public final C0725n[] f7658i;

    public C0724m(C0725n[] c0725nArr, int i3) {
        super(2);
        this.f7657h = i3;
        this.f7658i = c0725nArr;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7657h) {
            case 0:
                return Float.valueOf(AbstractC0735y.d((f0) obj, true, this.f7658i, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(AbstractC0735y.d((f0) obj, false, this.f7658i, ((Number) obj2).floatValue()));
        }
    }
}
