package p103m;

import p095l.B;

public final class F extends AbstractViewOnTouchListenerC2586r0 {

    public final L f24907q;

    public final O f24908r;

    public F(O o8, O o9, L l2) {
        super(o9);
        this.f24908r = o8;
        this.f24907q = l2;
    }

    @Override
    public final B b() {
        return this.f24907q;
    }

    @Override
    public final boolean c() {
        O o8 = this.f24908r;
        if (o8.getInternalPopup().a()) {
            return true;
        }
        o8.f24954m.m(o8.getTextDirection(), o8.getTextAlignment());
        return true;
    }
}
