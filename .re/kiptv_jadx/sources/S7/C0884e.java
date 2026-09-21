package S7;

/* JADX INFO: renamed from: S7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0884e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9575b = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(S7.C0884e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S7.F[] f9576a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0884e(S7.F[] fArr) {
        this.f9576a = fArr;
        this.notCompletedCount$volatile = fArr.length;
    }
}
