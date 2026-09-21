package Y4;

public final class C1119v extends p117n6.c {

    public C1131z f12111h;

    public int f12112i;
    public Object j;

    public final C1131z f12113k;

    public int f12114l;

    public C1119v(C1131z c1131z, p117n6.c cVar) {
        super(cVar);
        this.f12113k = c1131z;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f12114l |= Integer.MIN_VALUE;
        return this.f12113k.c(this);
    }
}
