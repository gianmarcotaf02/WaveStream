package W1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10556b;

    public e(long j, long j9) {
        if (j9 == 0) {
            this.f10555a = 0L;
            this.f10556b = 1L;
        } else {
            this.f10555a = j;
            this.f10556b = j9;
        }
    }

    public final java.lang.String toString() {
        return this.f10555a + "/" + this.f10556b;
    }
}
