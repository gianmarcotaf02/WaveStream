package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class C0903t {

    public static final AtomicIntegerFieldUpdater f9619b = AtomicIntegerFieldUpdater.newUpdater(C0903t.class, "_handled$volatile");
    private volatile int _handled$volatile;

    public final Throwable f9620a;

    public C0903t(Throwable th, boolean z6) {
        this.f9620a = th;
        this._handled$volatile = z6 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f9620a + ']';
    }
}
