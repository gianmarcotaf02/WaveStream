package E5;

import kotlin.jvm.functions.Function0;

public final class C0291h implements Function0 {

    public final int f3052h;

    public final X0 f3053i;
    public final Function0 j;

    public C0291h(X0 x9, Function0 function0, int i3) {
        this.f3052h = i3;
        this.f3053i = x9;
        this.j = function0;
    }

    @Override
    public final Object invoke() {
        switch (this.f3052h) {
            case 0:
                this.f3053i.g();
                this.j.invoke();
                break;
            case 1:
                this.f3053i.g();
                this.j.invoke();
                break;
            default:
                if (this.f3053i.f()) {
                    this.j.invoke();
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
