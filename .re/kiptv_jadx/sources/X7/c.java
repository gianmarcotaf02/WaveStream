package X7;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements S7.A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.h f10906h;

    public c(p100l6.h hVar) {
        this.f10906h = hVar;
    }

    @Override // S7.A
    public final p100l6.h getCoroutineContext() {
        return this.f10906h;
    }

    public final java.lang.String toString() {
        return "CoroutineScope(coroutineContext=" + this.f10906h + ')';
    }
}
