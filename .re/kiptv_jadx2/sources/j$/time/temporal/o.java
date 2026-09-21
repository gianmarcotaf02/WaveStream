package j$.time.temporal;

public final class o implements n {

    public final int f23800a;

    public final int f23801b;

    public o(int i3, int i9) {
        this.f23800a = i9;
        this.f23801b = i3;
    }

    @Override
    public final m c(m mVar) {
        switch (this.f23800a) {
            case 0:
                int iJ = mVar.j(a.DAY_OF_WEEK);
                int i3 = this.f23801b;
                if (iJ == i3) {
                    return mVar;
                }
                int i9 = iJ - i3;
                return mVar.i(i9 >= 0 ? 7 - i9 : -i9, b.DAYS);
            default:
                int iJ2 = mVar.j(a.DAY_OF_WEEK);
                int i10 = this.f23801b;
                if (iJ2 == i10) {
                    return mVar;
                }
                int i11 = i10 - iJ2;
                return mVar.a(i11 >= 0 ? 7 - i11 : -i11, b.DAYS);
        }
    }
}
