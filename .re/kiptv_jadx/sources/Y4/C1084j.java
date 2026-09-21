package Y4;

/* JADX INFO: renamed from: Y4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1084j {
    public static final int a(Y4.C1084j c1084j, java.lang.String str) {
        c1084j.getClass();
        long j = -3750763034362895579L;
        for (byte b9 : O7.x.p0(str)) {
            j = (j ^ (((long) b9) & 255)) * 1099511628211L;
        }
        return (int) (9007199254740991L & j);
    }
}
