package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends X7.p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9626l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(p100l6.h hVar, p100l6.c cVar, int i3) {
        super(cVar, hVar);
        this.f9626l = i3;
    }

    @Override // S7.p0
    public final boolean r(java.lang.Throwable th) {
        switch (this.f9626l) {
            case 0:
                return false;
            default:
                if (th instanceof W7.o) {
                    return true;
                }
                return l(th);
        }
    }
}
