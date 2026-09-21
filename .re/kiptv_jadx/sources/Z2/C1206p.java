package Z2;

/* JADX INFO: renamed from: Z2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1206p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12909b;

    public C1206p(long j, int i3) {
        this.f12909b = j;
        this.f12908a = i3;
    }

    public static Z2.C1206p a(int i3, int i9, java.lang.String str) {
        if (i3 >= i9) {
            return null;
        }
        long j = 0;
        int i10 = i3;
        while (i10 < i9) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i10++;
        }
        if (i10 == i3) {
            return null;
        }
        return new Z2.C1206p(j, i10);
    }
}
