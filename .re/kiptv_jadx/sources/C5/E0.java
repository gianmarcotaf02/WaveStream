package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class E0 implements p020c0.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f938b;

    public E0(android.view.View view, boolean z6) {
        this.f937a = view;
        this.f938b = z6;
    }

    @Override // p020c0.H
    public final void dispose() {
        this.f937a.setKeepScreenOn(this.f938b);
    }
}
