package B;

/* JADX INFO: renamed from: B.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0067e implements B.InterfaceC0068f, B.InterfaceC0070h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f525b;

    public C0067e(int i3) {
        this.f524a = i3;
        switch (i3) {
            case 1:
                this.f525b = 0;
                break;
            case 2:
                this.f525b = 0;
                break;
            case 3:
                this.f525b = 0;
                break;
            default:
                this.f525b = 0;
                break;
        }
    }

    @Override // B.InterfaceC0068f, B.InterfaceC0070h
    public final float a() {
        switch (this.f524a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f525b;
    }

    @Override // B.InterfaceC0070h
    public final void b(int i3, O0.U u6, int[] iArr, int[] iArr2) {
        switch (this.f524a) {
            case 0:
                B.AbstractC0071i.a(i3, iArr, iArr2, false);
                break;
            case 1:
                B.AbstractC0071i.d(i3, iArr, iArr2, false);
                break;
            case 2:
                B.AbstractC0071i.e(i3, iArr, iArr2, false);
                break;
            default:
                B.AbstractC0071i.f(i3, iArr, iArr2, false);
                break;
        }
    }

    @Override // B.InterfaceC0068f
    public final void c(p113n1.c cVar, int i3, int[] iArr, p113n1.n nVar, int[] iArr2) {
        switch (this.f524a) {
            case 0:
                if (nVar != p113n1.n.f25566h) {
                    B.AbstractC0071i.a(i3, iArr, iArr2, true);
                } else {
                    B.AbstractC0071i.a(i3, iArr, iArr2, false);
                }
                break;
            case 1:
                if (nVar != p113n1.n.f25566h) {
                    B.AbstractC0071i.d(i3, iArr, iArr2, true);
                } else {
                    B.AbstractC0071i.d(i3, iArr, iArr2, false);
                }
                break;
            case 2:
                if (nVar != p113n1.n.f25566h) {
                    B.AbstractC0071i.e(i3, iArr, iArr2, true);
                } else {
                    B.AbstractC0071i.e(i3, iArr, iArr2, false);
                }
                break;
            default:
                if (nVar != p113n1.n.f25566h) {
                    B.AbstractC0071i.f(i3, iArr, iArr2, true);
                } else {
                    B.AbstractC0071i.f(i3, iArr, iArr2, false);
                }
                break;
        }
    }

    public final java.lang.String toString() {
        switch (this.f524a) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
