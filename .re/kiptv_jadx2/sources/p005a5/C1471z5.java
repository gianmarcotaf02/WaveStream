package p005a5;

import p117n6.c;

public final class C1471z5 extends c {

    public Object f15401h;

    public final C5 f15402i;
    public int j;

    public C1471z5(C5 c9, c cVar) {
        super(cVar);
        this.f15402i = c9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15401h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f15402i.a(null, this);
    }
}
