package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements j$.time.temporal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23801b;

    public /* synthetic */ o(int i3, int i9) {
        this.f23800a = i9;
        this.f23801b = i3;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        switch (this.f23800a) {
            case 0:
                int iJ = mVar.j(j$.time.temporal.a.DAY_OF_WEEK);
                int i3 = this.f23801b;
                if (iJ == i3) {
                    return mVar;
                }
                int i9 = iJ - i3;
                return mVar.i(i9 >= 0 ? 7 - i9 : -i9, j$.time.temporal.b.DAYS);
            default:
                int iJ2 = mVar.j(j$.time.temporal.a.DAY_OF_WEEK);
                int i10 = this.f23801b;
                if (iJ2 == i10) {
                    return mVar;
                }
                int i11 = i10 - iJ2;
                return mVar.a(i11 >= 0 ? 7 - i11 : -i11, j$.time.temporal.b.DAYS);
        }
    }
}
