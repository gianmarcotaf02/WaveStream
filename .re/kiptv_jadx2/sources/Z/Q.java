package Z;

public final class Q extends kotlin.jvm.internal.o implements p194x6.j {

    public final int f12300h;

    public final int f12301i;
    public final Object j;

    public Q(Object obj, int i3, int i9) {
        super(1);
        this.f12300h = i9;
        this.j = obj;
        this.f12301i = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f12300h) {
            case 0:
                ((O0.f0) obj).g((O0.g0) this.j, 0, -this.f12301i, 0.0f);
                return p070h6.A.f22523a;
            default:
                Boolean boolValueOf = Boolean.valueOf(((p175v0.F) obj).U0(this.f12301i));
                ((kotlin.jvm.internal.A) this.j).f24539h = boolValueOf;
                return boolValueOf;
        }
    }
}
