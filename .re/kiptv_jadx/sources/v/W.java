package v;

/* JADX INFO: loaded from: classes.dex */
public final class W extends android.widget.EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f28905b;

    public W(android.content.Context context) {
        super(context);
        this.f28904a = com.google.crypto.tink.shaded.protobuf.AbstractC1911f.a(context).f25550h * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i3) {
        this.f28905b = 0.0f;
        super.onAbsorb(i3);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f9, float f10) {
        this.f28905b = 0.0f;
        super.onPull(f9, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f28905b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f9) {
        this.f28905b = 0.0f;
        super.onPull(f9);
    }
}
