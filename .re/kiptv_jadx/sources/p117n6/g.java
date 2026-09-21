package p117n6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends p117n6.a {
    public g(p100l6.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != p100l6.i.f24820h) {
            throw new java.lang.IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p100l6.c
    public final p100l6.h getContext() {
        return p100l6.i.f24820h;
    }
}
