package t5;

import kotlin.jvm.functions.Function0;

public final class P0 implements Function0 {

    public final int f28029h;

    public final p194x6.m f28030i;
    public final String j;

    public P0(p194x6.m mVar, String str, int i3) {
        this.f28029h = i3;
        this.f28030i = mVar;
        this.j = str;
    }

    @Override
    public final Object invoke() {
        switch (this.f28029h) {
            case 0:
                this.f28030i.invoke(this.j, Boolean.TRUE);
                break;
            default:
                this.f28030i.invoke(this.j, Boolean.FALSE);
                break;
        }
        return p070h6.A.f22523a;
    }
}
