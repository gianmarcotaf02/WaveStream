package W7;

/* JADX INFO: loaded from: classes4.dex */
public final class C implements p100l6.c, p117n6.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.c f10722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p100l6.h f10723i;

    public C(p100l6.c cVar, p100l6.h hVar) {
        this.f10722h = cVar;
        this.f10723i = hVar;
    }

    @Override // p117n6.d
    public final p117n6.d getCallerFrame() {
        p100l6.c cVar = this.f10722h;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    @Override // p100l6.c
    public final p100l6.h getContext() {
        return this.f10723i;
    }

    @Override // p100l6.c
    public final void resumeWith(java.lang.Object obj) {
        this.f10722h.resumeWith(obj);
    }
}
