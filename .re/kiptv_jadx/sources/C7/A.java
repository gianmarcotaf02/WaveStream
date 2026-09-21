package C7;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends C7.AbstractC0183o {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(C7.B b9, int i3) {
        super(b9);
        this.j = i3;
    }

    @Override // C7.AbstractC0182n
    public final C7.AbstractC0182n F0(C7.B b9) {
        switch (this.j) {
            case 0:
                return new C7.A(b9, 0);
            default:
                return new C7.A(b9, 1);
        }
    }

    @Override // C7.AbstractC0182n, C7.AbstractC0191x
    public final boolean v0() {
        switch (this.j) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
