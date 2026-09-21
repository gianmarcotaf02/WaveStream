package V7;

import V4.C0963f;

public final class C0995v extends p117n6.c {

    public Object f10519h;

    public int f10520i;
    public final C0963f j;

    public C0963f f10521k;

    public InterfaceC0982h f10522l;

    public W7.y f10523m;

    public C0995v(C0963f c0963f, p100l6.c cVar) {
        super(cVar);
        this.j = c0963f;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10519h = obj;
        this.f10520i |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
