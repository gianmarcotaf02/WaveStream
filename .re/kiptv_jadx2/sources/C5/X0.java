package C5;

public final class X0 extends p117n6.c {

    public Y0 f1168h;

    public Object f1169i;
    public final Y0 j;

    public int f1170k;

    public X0(Y0 y9, p100l6.c cVar) {
        super(cVar);
        this.j = y9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f1169i = obj;
        this.f1170k |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
