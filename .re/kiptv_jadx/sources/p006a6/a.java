package p006a6;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p006a6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p006a6.d f15410a;

    public static void a(p006a6.d dVar, p006a6.d dVar2) {
        p006a6.a aVar = (p006a6.a) dVar;
        if (aVar.f15410a != null) {
            throw new java.lang.IllegalStateException();
        }
        aVar.f15410a = dVar2;
    }

    @Override // p061g6.a
    public final java.lang.Object get() {
        p006a6.d dVar = this.f15410a;
        if (dVar != null) {
            return dVar.get();
        }
        throw new java.lang.IllegalStateException();
    }
}
