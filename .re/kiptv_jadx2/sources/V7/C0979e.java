package V7;

import E5.D0;

public final class C0979e extends p117n6.c {

    public Object f10455h;

    public final D0 f10456i;
    public int j;

    public C0979e(D0 d4, p100l6.c cVar) {
        super(cVar);
        this.f10456i = d4;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10455h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10456i.emit(null, this);
    }
}
