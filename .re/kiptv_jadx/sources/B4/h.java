package B4;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f700c;

    public h(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f698a = jArr;
        this.f699b = jArr2;
        this.f700c = jArr3;
    }

    public void a(long[] jArr, long[] jArr2) {
        java.lang.System.arraycopy(jArr2, 0, jArr, 0, 10);
    }
}
