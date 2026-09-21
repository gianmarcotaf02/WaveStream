package p060g5;

import android.graphics.Color;
import p188x0.z;

public abstract class a {

    public static final long f21871a = z.d(4294956800L);

    public static final long f21872b = z.d(4293046578L);

    public static final long f21873c = z.d(4279374354L);

    public static final long f21874d = z.d(4279966491L);

    public static final long f21875e = z.d(4278782217L);

    public static final long f21876f = z.d(4279571733L);
    public static final long g = z.d(4278190080L);

    public static final long f21877h;

    public static final long f21878i;
    public static final long j;

    static {
        z.d(4283354564L);
        z.d(4282759121L);
        z.d(4294929205L);
        z.d(4279286145L);
        z.d(4294286859L);
        f21877h = z.d(4293870660L);
        z.d(4282090230L);
        z.d(4294967295L);
        f21878i = z.d(4291611852L);
        z.d(4288256409L);
        z.d(4287137928L);
        j = z.d(4284900966L);
        z.d(4294920023L);
    }

    public static final long a() {
        e eVarA = g.a();
        return eVarA.b() ? z.d(4292138196L) : z.d(eVarA.f21886i);
    }

    public static final long b() {
        return g.a().a();
    }

    public static final long c() {
        return z.d(g.a().f21886i);
    }

    public static final long d() {
        return e(0.42f, 0.28f, c());
    }

    public static final long e(float f9, float f10, long j9) {
        float[] fArr = new float[3];
        Color.colorToHSV(z.H(j9), fArr);
        fArr[1] = Math.min(fArr[1], f9);
        fArr[2] = f10;
        return z.c(Color.HSVToColor(fArr));
    }
}
