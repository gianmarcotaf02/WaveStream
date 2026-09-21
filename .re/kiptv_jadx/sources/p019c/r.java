package p019c;

/* JADX INFO: loaded from: classes.dex */
public final class r implements android.window.OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p019c.o f18081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p019c.o f18082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p019c.p f18083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p019c.p f18084d;

    public r(p019c.o oVar, p019c.o oVar2, p019c.p pVar, p019c.p pVar2) {
        this.f18081a = oVar;
        this.f18082b = oVar2;
        this.f18083c = pVar;
        this.f18084d = pVar2;
    }

    public final void onBackCancelled() {
        this.f18084d.invoke();
    }

    public final void onBackInvoked() {
        this.f18083c.invoke();
    }

    public final void onBackProgressed(android.window.BackEvent backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
        this.f18082b.invoke(new p019c.a(backEvent));
    }

    public final void onBackStarted(android.window.BackEvent backEvent) {
        kotlin.jvm.internal.m.e(backEvent, "backEvent");
        this.f18081a.invoke(new p019c.a(backEvent));
    }
}
