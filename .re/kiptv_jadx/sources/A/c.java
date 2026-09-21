package A;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(java.lang.String str, int i3) {
        super(str);
        this.f10h = i3;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        switch (this.f10h) {
            case 0:
                setStackTrace(A.d.f11a);
                break;
            case 1:
                setStackTrace(N0.b.f7297a);
                break;
            default:
                setStackTrace(p089k0.f.f24412b);
                break;
        }
        return this;
    }
}
