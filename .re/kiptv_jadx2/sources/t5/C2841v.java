package t5;

public final class C2841v implements p020c0.H {

    public final int f28416a;

    public final p194x6.j f28417b;

    public final Object f28418c;

    public C2841v(p194x6.j jVar, int i3, Object obj) {
        this.f28416a = i3;
        this.f28417b = jVar;
        this.f28418c = obj;
    }

    @Override
    public final void dispose() {
        switch (this.f28416a) {
            case 0:
                p194x6.j jVar = this.f28417b;
                if (jVar != null) {
                    jVar.invoke(this.f28418c);
                }
                break;
            default:
                p194x6.j jVar2 = this.f28417b;
                if (jVar2 != null) {
                    jVar2.invoke(this.f28418c);
                }
                break;
        }
    }
}
