package J5;

import kotlin.jvm.functions.Function0;

public final class C0629s implements Function0 {

    public final int f6555h;

    public final boolean f6556i;
    public final Function0 j;

    public C0629s(boolean z6, Function0 function0, int i3) {
        this.f6555h = i3;
        this.f6556i = z6;
        this.j = function0;
    }

    @Override
    public final Object invoke() {
        switch (this.f6555h) {
            case 0:
                if (!this.f6556i) {
                    this.j.invoke();
                }
                break;
            default:
                if (this.f6556i) {
                    this.j.invoke();
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
