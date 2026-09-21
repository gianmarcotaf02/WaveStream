package V7;

import S7.InterfaceC0891h0;

public final class m0 extends p117n6.c {

    public n0 f10482h;

    public InterfaceC0982h f10483i;
    public o0 j;

    public InterfaceC0891h0 f10484k;

    public Object f10485l;

    public Object f10486m;

    public final n0 f10487n;

    public int f10488o;

    public m0(n0 n0Var, p100l6.c cVar) {
        super(cVar);
        this.f10487n = n0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10486m = obj;
        this.f10488o |= Integer.MIN_VALUE;
        this.f10487n.collect(null, this);
        return p109m6.a.f25430h;
    }
}
