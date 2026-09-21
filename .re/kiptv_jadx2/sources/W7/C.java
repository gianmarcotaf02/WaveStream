package W7;

public final class C implements p100l6.c, p117n6.d {

    public final p100l6.c f10722h;

    public final p100l6.h f10723i;

    public C(p100l6.c cVar, p100l6.h hVar) {
        this.f10722h = cVar;
        this.f10723i = hVar;
    }

    @Override
    public final p117n6.d getCallerFrame() {
        p100l6.c cVar = this.f10722h;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    @Override
    public final p100l6.h getContext() {
        return this.f10723i;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f10722h.resumeWith(obj);
    }
}
