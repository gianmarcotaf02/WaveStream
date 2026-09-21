package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class C0884e {

    public static final AtomicIntegerFieldUpdater f9575b = AtomicIntegerFieldUpdater.newUpdater(C0884e.class, "notCompletedCount$volatile");

    public final F[] f9576a;
    private volatile int notCompletedCount$volatile;

    public C0884e(F[] fArr) {
        this.f9576a = fArr;
        this.notCompletedCount$volatile = fArr.length;
    }
}
