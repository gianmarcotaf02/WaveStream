package B;

/* JADX INFO: renamed from: B.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0064b implements B.InterfaceC0068f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f512a;

    @Override // B.InterfaceC0068f
    public final void c(p113n1.c cVar, int i3, int[] iArr, p113n1.n nVar, int[] iArr2) {
        switch (this.f512a) {
            case 0:
                B.AbstractC0071i.b(iArr, iArr2, false);
                break;
            case 1:
                B.AbstractC0071i.c(i3, iArr, iArr2, false);
                break;
            case 2:
                if (nVar != p113n1.n.f25566h) {
                    B.AbstractC0071i.b(iArr, iArr2, true);
                } else {
                    B.AbstractC0071i.c(i3, iArr, iArr2, false);
                }
                break;
            default:
                if (nVar != p113n1.n.f25566h) {
                    B.AbstractC0071i.c(i3, iArr, iArr2, true);
                } else {
                    B.AbstractC0071i.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public final java.lang.String toString() {
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
