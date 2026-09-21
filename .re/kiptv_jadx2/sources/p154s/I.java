package p154s;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p188x0.L;
import p194x6.j;

public final class I extends o implements j {

    public final boolean f27065h;

    public final Function0 f27066i;

    public I(boolean z6, Function0 function0) {
        super(1);
        this.f27065h = z6;
        this.f27066i = function0;
    }

    @Override
    public final Object invoke(Object obj) {
        ((L) obj).g(!this.f27065h && ((Boolean) this.f27066i.invoke()).booleanValue());
        return A.f22523a;
    }
}
