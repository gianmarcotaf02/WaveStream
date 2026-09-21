package E1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends android.text.style.ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E1.f f2744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2745c;

    public a(int i3, E1.f fVar, int i9) {
        this.f2743a = i3;
        this.f2744b = fVar;
        this.f2745c = i9;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2743a);
        this.f2744b.f2755a.performAction(this.f2745c, bundle);
    }
}
