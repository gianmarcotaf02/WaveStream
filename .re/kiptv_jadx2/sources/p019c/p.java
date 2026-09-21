package p019c;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p070h6.A;

public final class p extends o implements Function0 {

    public final int f18077h;

    public final u f18078i;

    public p(u uVar, int i3) {
        super(0);
        this.f18077h = i3;
        this.f18078i = uVar;
    }

    @Override
    public final Object invoke() {
        switch (this.f18077h) {
            case 0:
                this.f18078i.c();
                break;
            case 1:
                this.f18078i.b();
                break;
            default:
                this.f18078i.c();
                break;
        }
        return A.f22523a;
    }
}
