package Z2;

import Z.AbstractC1149h0;
import io.sentry.profilemeasurements.ProfileMeasurement;

public final class F implements Cloneable {

    public final float f12668h;

    public final int f12669i;

    public F(float f9, int i3) {
        this.f12668h = f9;
        this.f12669i = i3;
    }

    public final float a(C0 c9) {
        float fSqrt;
        if (this.f12669i != 9) {
            return d(c9);
        }
        A0 a2 = (A0) c9.f12657c;
        C1209t c1209t = a2.g;
        if (c1209t == null) {
            c1209t = a2.f12645f;
        }
        float f9 = this.f12668h;
        if (c1209t == null) {
            return f9;
        }
        float f10 = c1209t.f12943d;
        float f11 = c1209t.f12944e;
        if (f10 == f11) {
            fSqrt = f9 * f10;
        } else {
            fSqrt = f9 * ((float) (Math.sqrt((f11 * f11) + (f10 * f10)) / 1.414213562373095d));
        }
        return fSqrt / 100.0f;
    }

    public final float b(C0 c9, float f9) {
        return this.f12669i == 9 ? (this.f12668h * f9) / 100.0f : d(c9);
    }

    public final float c() {
        float f9;
        float f10;
        int iC = AbstractC1149h0.c(this.f12669i);
        float f11 = this.f12668h;
        if (iC == 0) {
            return f11;
        }
        if (iC == 3) {
            return f11 * 96.0f;
        }
        if (iC == 4) {
            f9 = f11 * 96.0f;
            f10 = 2.54f;
        } else if (iC == 5) {
            f9 = f11 * 96.0f;
            f10 = 25.4f;
        } else if (iC == 6) {
            f9 = f11 * 96.0f;
            f10 = 72.0f;
        } else {
            if (iC != 7) {
                return f11;
            }
            f9 = f11 * 96.0f;
            f10 = 6.0f;
        }
        return f9 / f10;
    }

    public final float d(C0 c9) {
        float f9;
        float f10;
        int iC = AbstractC1149h0.c(this.f12669i);
        float f11 = this.f12668h;
        switch (iC) {
            case 1:
                return ((A0) c9.f12657c).f12643d.getTextSize() * f11;
            case 2:
                return (((A0) c9.f12657c).f12643d.getTextSize() / 2.0f) * f11;
            case 3:
                c9.getClass();
                return f11 * 96.0f;
            case 4:
                c9.getClass();
                f9 = f11 * 96.0f;
                f10 = 2.54f;
                break;
            case 5:
                c9.getClass();
                f9 = f11 * 96.0f;
                f10 = 25.4f;
                break;
            case 6:
                c9.getClass();
                f9 = f11 * 96.0f;
                f10 = 72.0f;
                break;
            case 7:
                c9.getClass();
                f9 = f11 * 96.0f;
                f10 = 6.0f;
                break;
            case 8:
                A0 a2 = (A0) c9.f12657c;
                C1209t c1209t = a2.g;
                if (c1209t == null) {
                    c1209t = a2.f12645f;
                }
                if (c1209t != null) {
                    f9 = f11 * c1209t.f12943d;
                    f10 = 100.0f;
                    break;
                }
            default:
                return f11;
        }
        return f9 / f10;
    }

    public final float e(C0 c9) {
        if (this.f12669i != 9) {
            return d(c9);
        }
        A0 a2 = (A0) c9.f12657c;
        C1209t c1209t = a2.g;
        if (c1209t == null) {
            c1209t = a2.f12645f;
        }
        float f9 = this.f12668h;
        return c1209t == null ? f9 : (f9 * c1209t.f12944e) / 100.0f;
    }

    public final boolean f() {
        return this.f12668h < 0.0f;
    }

    public final boolean g() {
        return this.f12668h == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f12668h));
        switch (this.f12669i) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = ProfileMeasurement.UNIT_PERCENT;
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public F(float f9) {
        this.f12668h = f9;
        this.f12669i = 1;
    }
}
