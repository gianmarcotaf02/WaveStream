package androidx.compose.material3;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "LQ0/j;", "LQ0/h;", "LQ0/j0;", "Lx0/t;", androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR, "Lx0/t;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class DelegatingThemeAwareRippleNode extends Q0.AbstractC0776j implements Q0.InterfaceC0774h, Q0.j0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public androidx.compose.material.ripple.RippleNode f15813A;
    private final p188x0.InterfaceC3099t color;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p202z.k f15814x;
    public final boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f15815z;

    public DelegatingThemeAwareRippleNode(p202z.k kVar, boolean z6, float f9, p188x0.InterfaceC3099t interfaceC3099t) {
        this.f15814x = kVar;
        this.y = z6;
        this.f15815z = f9;
        this.color = interfaceC3099t;
    }

    @Override // p137q0.o
    public final void F0() {
        Q0.AbstractC0777k.p(this, new androidx.compose.material3.b(this, 1));
    }

    @Override // Q0.j0
    public final void f0() {
        Q0.AbstractC0777k.p(this, new androidx.compose.material3.b(this, 1));
    }
}
