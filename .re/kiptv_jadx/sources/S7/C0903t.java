package S7;

/* JADX INFO: renamed from: S7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0903t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9619b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(S7.C0903t.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f9620a;

    public C0903t(java.lang.Throwable th, boolean z6) {
        this.f9620a = th;
        this._handled$volatile = z6 ? 1 : 0;
    }

    public final java.lang.String toString() {
        return getClass().getSimpleName() + '[' + this.f9620a + ']';
    }
}
