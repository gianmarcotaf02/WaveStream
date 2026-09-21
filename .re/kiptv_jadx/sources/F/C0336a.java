package F;

/* JADX INFO: renamed from: F.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0336a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3403b;

    public long a() {
        if (this.f3402a) {
            return Long.MAX_VALUE;
        }
        return java.lang.Math.max(0L, this.f3403b - java.lang.System.nanoTime());
    }
}
