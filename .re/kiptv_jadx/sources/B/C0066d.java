package B;

/* JADX INFO: renamed from: B.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0066d implements B.InterfaceC0070h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f521a = 1;

    @Override // B.InterfaceC0070h
    public final void b(int i3, O0.U u6, int[] iArr, int[] iArr2) {
        switch (this.f521a) {
            case 0:
                B.AbstractC0071i.c(i3, iArr, iArr2, false);
                break;
            default:
                B.AbstractC0071i.b(iArr, iArr2, false);
                break;
        }
    }

    public final java.lang.String toString() {
        switch (this.f521a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
