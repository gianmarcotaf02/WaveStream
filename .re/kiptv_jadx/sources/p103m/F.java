package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class F extends p103m.AbstractViewOnTouchListenerC2586r0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p103m.L f24907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p103m.O f24908r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(p103m.O o8, p103m.O o9, p103m.L l2) {
        super(o9);
        this.f24908r = o8;
        this.f24907q = l2;
    }

    @Override // p103m.AbstractViewOnTouchListenerC2586r0
    public final p095l.B b() {
        return this.f24907q;
    }

    @Override // p103m.AbstractViewOnTouchListenerC2586r0
    public final boolean c() {
        p103m.O o8 = this.f24908r;
        if (o8.getInternalPopup().a()) {
            return true;
        }
        o8.f24954m.m(o8.getTextDirection(), o8.getTextAlignment());
        return true;
    }
}
