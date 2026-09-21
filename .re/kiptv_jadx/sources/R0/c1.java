package R0;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements android.view.View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f8886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p020c0.C1718z0 f8887i;

    public c1(android.view.View view, p020c0.C1718z0 c1718z0) {
        this.f8886h = view;
        this.f8887i = c1718z0;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        this.f8886h.removeOnAttachStateChangeListener(this);
        this.f8887i.x();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
