package S7;

/* JADX INFO: renamed from: S7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0890h implements S7.InterfaceC0892i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f9586i;

    public /* synthetic */ C0890h(int i3, java.lang.Object obj) {
        this.f9585h = i3;
        this.f9586i = obj;
    }

    @Override // S7.InterfaceC0892i
    public final void b(java.lang.Throwable th) {
        switch (this.f9585h) {
            case 0:
                ((java.util.concurrent.ScheduledFuture) this.f9586i).cancel(false);
                break;
            case 1:
                ((p194x6.j) this.f9586i).invoke(th);
                break;
            default:
                ((S7.O) this.f9586i).dispose();
                break;
        }
    }

    public final java.lang.String toString() {
        switch (this.f9585h) {
            case 0:
                return "CancelFutureOnCancel[" + ((java.util.concurrent.ScheduledFuture) this.f9586i) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((p194x6.j) this.f9586i).getClass().getSimpleName() + '@' + S7.C.s(this) + ']';
            default:
                return "DisposeOnCancel[" + ((S7.O) this.f9586i) + ']';
        }
    }
}
