package B;

public final class C0064b implements InterfaceC0068f {

    public final int f512a;

    @Override
    public final void c(p113n1.c cVar, int i3, int[] iArr, p113n1.n nVar, int[] iArr2) {
        switch (this.f512a) {
            case 0:
                AbstractC0071i.b(iArr, iArr2, false);
                break;
            case 1:
                AbstractC0071i.c(i3, iArr, iArr2, false);
                break;
            case 2:
                if (nVar != p113n1.n.f25566h) {
                    AbstractC0071i.b(iArr, iArr2, true);
                } else {
                    AbstractC0071i.c(i3, iArr, iArr2, false);
                }
                break;
            default:
                if (nVar != p113n1.n.f25566h) {
                    AbstractC0071i.c(i3, iArr, iArr2, true);
                } else {
                    AbstractC0071i.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f512a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
