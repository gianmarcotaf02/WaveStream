package p020c0;

/* JADX INFO: renamed from: c0.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1695n0 implements p020c0.X, S7.A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f18288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p100l6.h f18289i;

    public C1695n0(p020c0.X x9, p100l6.h hVar) {
        this.f18288h = x9;
        this.f18289i = hVar;
    }

    @Override // S7.A
    public final p100l6.h getCoroutineContext() {
        return this.f18289i;
    }

    @Override // p020c0.e1
    public final java.lang.Object getValue() {
        return this.f18288h.getValue();
    }

    @Override // p020c0.X
    public final void setValue(java.lang.Object obj) {
        this.f18288h.setValue(obj);
    }
}
