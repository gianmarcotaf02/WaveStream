package p122o1;

import V1.b;
import java.util.Arrays;
import kotlin.jvm.internal.m;

public final class c implements a {

    public final float[] f26044a;

    public final float[] f26045b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f26044a = fArr;
        this.f26045b = fArr2;
    }

    @Override
    public final float a(float f9) {
        return b.a(f9, this.f26045b, this.f26044a);
    }

    @Override
    public final float b(float f9) {
        return b.a(f9, this.f26044a, this.f26045b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f26044a, cVar.f26044a) && Arrays.equals(this.f26045b, cVar.f26045b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26045b) + (Arrays.hashCode(this.f26044a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f26044a);
        m.d(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f26045b);
        m.d(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
