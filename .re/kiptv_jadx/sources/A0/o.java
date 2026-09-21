package A0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends android.view.ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.Outline outline2;
        switch (this.f112a) {
            case 0:
                if (!(view instanceof A0.p) || (outline2 = ((A0.p) view).f117l) == null) {
                    return;
                }
                outline.set(outline2);
                return;
            case 1:
                kotlin.jvm.internal.m.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                B2.a.u(view);
                throw null;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            default:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
        }
    }
}
