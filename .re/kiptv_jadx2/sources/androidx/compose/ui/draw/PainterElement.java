package androidx.compose.ui.draw;

import O0.InterfaceC0719h;
import Q0.AbstractC0777k;
import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p121o0.p;
import p137q0.d;
import p137q0.o;
import p188x0.C3092l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LQ0/X;", "Landroidx/compose/ui/draw/PainterNode;", "LC0/a;", "painter", "LC0/a;", "getPainter", "()LC0/a;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class PainterElement extends X {

    public final d f15822b;

    public final InterfaceC0719h f15823c;

    public final float f15824d;

    public final C3092l f15825e;
    private final C0.a painter;

    public PainterElement(C0.a aVar, d dVar, InterfaceC0719h interfaceC0719h, float f9, C3092l c3092l) {
        this.painter = aVar;
        this.f15822b = dVar;
        this.f15823c = interfaceC0719h;
        this.f15824d = f9;
        this.f15825e = c3092l;
    }

    @Override
    public final o e() {
        return new PainterNode(this.painter, this.f15822b, this.f15823c, this.f15824d, this.f15825e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return m.a(this.painter, painterElement.painter) && m.a(this.f15822b, painterElement.f15822b) && m.a(this.f15823c, painterElement.f15823c) && Float.compare(this.f15824d, painterElement.f15824d) == 0 && m.a(this.f15825e, painterElement.f15825e);
    }

    @Override
    public final void f(o oVar) {
        PainterNode painterNode = (PainterNode) oVar;
        painterNode.getClass();
        boolean zA = p181w0.d.a(painterNode.getPainter().h(), this.painter.h());
        painterNode.S0(this.painter);
        painterNode.f15826v = this.f15822b;
        painterNode.f15827w = this.f15823c;
        painterNode.f15828x = this.f15824d;
        painterNode.y = this.f15825e;
        if (!zA) {
            AbstractC0777k.k(painterNode);
        }
        AbstractC0777k.j(painterNode);
    }

    public final int hashCode() {
        int iC = p.c(this.f15824d, (this.f15823c.hashCode() + ((this.f15822b.hashCode() + p.f(this.painter.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C3092l c3092l = this.f15825e;
        return iC + (c3092l == null ? 0 : c3092l.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.f15822b + ", contentScale=" + this.f15823c + ", alpha=" + this.f15824d + ", colorFilter=" + this.f15825e + ')';
    }
}
