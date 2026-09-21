package v5;

public final class C2962y implements p194x6.j {

    public final int f29640h;

    public final d1 f29641i;

    public C2962y(d1 d1Var, int i3) {
        this.f29640h = i3;
        this.f29641i = d1Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f29640h) {
            case 0:
                p020c0.I DisposableEffect = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                return new C5.F0(16, this.f29641i);
            default:
                Integer num = (Integer) obj;
                num.getClass();
                d1 d1Var = this.f29641i;
                return Boolean.valueOf((d1Var.f29451u.contains(num) || d1Var.f29450t.contains(num)) ? false : true);
        }
    }
}
