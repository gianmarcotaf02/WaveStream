package p019c;

/* JADX INFO: loaded from: classes.dex */
public final class t implements p019c.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p019c.n f18088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p019c.u f18089i;

    public t(p019c.u uVar, p019c.n onBackPressedCallback) {
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        this.f18089i = uVar;
        this.f18088h = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.j] */
    @Override // p019c.b
    public final void cancel() {
        p019c.u uVar = this.f18089i;
        p078i6.l lVar = uVar.f18091b;
        p019c.n nVar = this.f18088h;
        lVar.remove(nVar);
        if (kotlin.jvm.internal.m.a(uVar.f18092c, nVar)) {
            nVar.a();
            uVar.f18092c = null;
        }
        nVar.f18073b.remove(this);
        ?? r9 = nVar.f18074c;
        if (r9 != 0) {
            r9.invoke();
        }
        nVar.f18074c = null;
    }
}
