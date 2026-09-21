package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p078i6.AbstractC2251b {
    public final java.util.Iterator j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p194x6.j f7432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.HashSet f7433l;

    public b(java.util.Iterator source, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(source, "source");
        this.j = source;
        this.f7432k = jVar;
        this.f7433l = new java.util.HashSet();
    }

    @Override // p078i6.AbstractC2251b
    public final void a() {
        java.lang.Object next;
        do {
            java.util.Iterator it = this.j;
            if (!it.hasNext()) {
                this.f23191h = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f7433l.add(this.f7432k.invoke(next)));
        this.f23192i = next;
        this.f23191h = 1;
    }
}
