package B;

public final class C0066d implements InterfaceC0070h {

    public final int f521a = 1;

    @Override
    public final void b(int i3, O0.U u6, int[] iArr, int[] iArr2) {
        switch (this.f521a) {
            case 0:
                AbstractC0071i.c(i3, iArr, iArr2, false);
                break;
            default:
                AbstractC0071i.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f521a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
