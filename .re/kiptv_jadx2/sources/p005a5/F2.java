package p005a5;

import p117n6.c;

public final class F2 extends c {

    public Object f13386h;

    public final J2 f13387i;
    public int j;

    public F2(J2 j9, c cVar) {
        super(cVar);
        this.f13387i = j9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13386h = obj;
        this.j |= Integer.MIN_VALUE;
        return J2.c(this.f13387i, null, this);
    }
}
