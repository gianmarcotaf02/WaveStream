package p104m1;

import p065h1.a;

public final class f {

    public static final float f25163b;

    public static final float f25164c;

    public static final float f25165d;

    public final float f25166a;

    static {
        a(0.0f);
        a(0.5f);
        f25163b = 0.5f;
        a(-1.0f);
        f25164c = -1.0f;
        a(1.0f);
        f25165d = 1.0f;
    }

    public static void a(float f9) {
        if ((0.0f > f9 || f9 > 1.0f) && f9 != -1.0f) {
            a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f9) {
        if (f9 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f9 == f25163b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f9 == f25164c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f9 == f25165d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f9 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f25166a, ((f) obj).f25166a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25166a);
    }

    public final String toString() {
        return b(this.f25166a);
    }
}
