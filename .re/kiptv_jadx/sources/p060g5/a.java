package p060g5;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f21871a = p188x0.z.d(4294956800L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f21872b = p188x0.z.d(4293046578L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f21873c = p188x0.z.d(4279374354L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f21874d = p188x0.z.d(4279966491L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f21875e = p188x0.z.d(4278782217L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f21876f = p188x0.z.d(4279571733L);
    public static final long g = p188x0.z.d(4278190080L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f21877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f21878i;
    public static final long j;

    static {
        p188x0.z.d(4283354564L);
        p188x0.z.d(4282759121L);
        p188x0.z.d(4294929205L);
        p188x0.z.d(4279286145L);
        p188x0.z.d(4294286859L);
        f21877h = p188x0.z.d(4293870660L);
        p188x0.z.d(4282090230L);
        p188x0.z.d(4294967295L);
        f21878i = p188x0.z.d(4291611852L);
        p188x0.z.d(4288256409L);
        p188x0.z.d(4287137928L);
        j = p188x0.z.d(4284900966L);
        p188x0.z.d(4294920023L);
    }

    public static final long a() {
        p060g5.e eVarA = p060g5.g.a();
        return eVarA.b() ? p188x0.z.d(4292138196L) : p188x0.z.d(eVarA.f21886i);
    }

    public static final long b() {
        return p060g5.g.a().a();
    }

    public static final long c() {
        return p188x0.z.d(p060g5.g.a().f21886i);
    }

    public static final long d() {
        return e(0.42f, 0.28f, c());
    }

    public static final long e(float f9, float f10, long j9) {
        float[] fArr = new float[3];
        android.graphics.Color.colorToHSV(p188x0.z.H(j9), fArr);
        fArr[1] = java.lang.Math.min(fArr[1], f9);
        fArr[2] = f10;
        return p188x0.z.c(android.graphics.Color.HSVToColor(fArr));
    }
}
