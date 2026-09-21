package Y4;

public final class C1084j {
    public static final int a(C1084j c1084j, String str) {
        c1084j.getClass();
        long j = -3750763034362895579L;
        for (byte b9 : O7.x.p0(str)) {
            j = (j ^ (((long) b9) & 255)) * 1099511628211L;
        }
        return (int) (9007199254740991L & j);
    }
}
