package p146r1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p113n1.n;

public final class i extends o implements Function0 {

    public final A f26751h;

    public final Function0 f26752i;
    public final F j;

    public final String f26753k;

    public final n f26754l;

    public i(A a2, Function0 function0, F f9, String str, n nVar) {
        super(0);
        this.f26751h = a2;
        this.f26752i = function0;
        this.j = f9;
        this.f26753k = str;
        this.f26754l = nVar;
    }

    @Override
    public final Object invoke() {
        this.f26751h.j(this.f26752i, this.j, this.f26753k, this.f26754l);
        return A.f22523a;
    }
}
