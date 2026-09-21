package V7;

import V4.C0963f;

public final class C0996w extends p117n6.c {

    public Object f10524h;

    public int f10525i;
    public final C0963f j;

    public C0963f f10526k;

    public InterfaceC0982h f10527l;

    public C0996w(C0963f c0963f, p100l6.c cVar) {
        super(cVar);
        this.j = c0963f;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10524h = obj;
        this.f10525i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
