package p095l;

/* JADX INFO: loaded from: classes.dex */
public final class o implements android.view.ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p020c0.C1704s0 f24686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.view.ActionProvider f24687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p095l.s f24688c;

    public o(p095l.s sVar, android.view.ActionProvider actionProvider) {
        this.f24688c = sVar;
        this.f24687b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z6) {
        p020c0.C1704s0 c1704s0 = this.f24686a;
        if (c1704s0 != null) {
            p095l.l lVar = ((p095l.n) c1704s0.f18362i).f24674n;
            lVar.f24642h = true;
            lVar.p(true);
        }
    }
}
