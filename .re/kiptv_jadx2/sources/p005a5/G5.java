package p005a5;

import p117n6.c;

public final class G5 extends c {

    public Object f13435h;

    public final I5 f13436i;
    public int j;

    public G5(I5 i9, p100l6.c cVar) {
        super(cVar);
        this.f13436i = i9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13435h = obj;
        this.j |= Integer.MIN_VALUE;
        return I5.a(this.f13436i, null, this);
    }
}
