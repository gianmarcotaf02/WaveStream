package androidx.compose.ui.draw;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LQ0/X;", "Landroidx/compose/ui/draw/PainterNode;", "LC0/a;", "painter", "LC0/a;", "getPainter", "()LC0/a;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final /* data */ class PainterElement extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p137q0.d f15822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O0.InterfaceC0719h f15823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p188x0.C3092l f15825e;
    private final C0.a painter;

    public PainterElement(C0.a aVar, p137q0.d dVar, O0.InterfaceC0719h interfaceC0719h, float f9, p188x0.C3092l c3092l) {
        this.painter = aVar;
        this.f15822b = dVar;
        this.f15823c = interfaceC0719h;
        this.f15824d = f9;
        this.f15825e = c3092l;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        return new androidx.compose.ui.draw.PainterNode(this.painter, this.f15822b, this.f15823c, this.f15824d, this.f15825e);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.compose.ui.draw.PainterElement)) {
            return false;
        }
        androidx.compose.ui.draw.PainterElement painterElement = (androidx.compose.ui.draw.PainterElement) obj;
        return kotlin.jvm.internal.m.a(this.painter, painterElement.painter) && kotlin.jvm.internal.m.a(this.f15822b, painterElement.f15822b) && kotlin.jvm.internal.m.a(this.f15823c, painterElement.f15823c) && java.lang.Float.compare(this.f15824d, painterElement.f15824d) == 0 && kotlin.jvm.internal.m.a(this.f15825e, painterElement.f15825e);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        androidx.compose.ui.draw.PainterNode painterNode = (androidx.compose.ui.draw.PainterNode) oVar;
        painterNode.getClass();
        boolean zA = p181w0.d.a(painterNode.getPainter().h(), this.painter.h());
        painterNode.S0(this.painter);
        painterNode.f15826v = this.f15822b;
        painterNode.f15827w = this.f15823c;
        painterNode.f15828x = this.f15824d;
        painterNode.y = this.f15825e;
        if (!zA) {
            Q0.AbstractC0777k.k(painterNode);
        }
        Q0.AbstractC0777k.j(painterNode);
    }

    public final int hashCode() {
        int iC = p121o0.p.c(this.f15824d, (this.f15823c.hashCode() + ((this.f15822b.hashCode() + p121o0.p.f(this.painter.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        p188x0.C3092l c3092l = this.f15825e;
        return iC + (c3092l == null ? 0 : c3092l.hashCode());
    }

    public final java.lang.String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.f15822b + ", contentScale=" + this.f15823c + ", alpha=" + this.f15824d + ", colorFilter=" + this.f15825e + ')';
    }
}
