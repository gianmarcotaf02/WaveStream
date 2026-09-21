package p188x0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import p121o0.p;
import p181w0.a;

public final class D extends M {

    public final List f31043c;

    public final ArrayList f31044d;

    public final long f31045e;

    public final long f31046f;

    public D(List list, ArrayList arrayList, long j, long j9) {
        this.f31043c = list;
        this.f31044d = arrayList;
        this.f31045e = j;
        this.f31046f = j9;
    }

    @Override
    public final Shader b(long j) {
        long j9 = this.f31045e;
        int i3 = (int) (j9 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i3);
        int i9 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i9) == Float.POSITIVE_INFINITY) {
            i9 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i9);
        long j10 = this.f31046f;
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f31043c;
        ArrayList arrayList = this.f31044d;
        z.N(arrayList, list);
        int iL = z.l(list);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), z.z(iL, list), z.A(arrayList, list, iL), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        return this.f31043c.equals(d4.f31043c) && m.a(this.f31044d, d4.f31044d) && a.b(this.f31045e, d4.f31045e) && a.b(this.f31046f, d4.f31046f);
    }

    public final int hashCode() {
        int iHashCode = this.f31043c.hashCode() * 31;
        ArrayList arrayList = this.f31044d;
        return Integer.hashCode(0) + p.e(p.e((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31, this.f31045e), 31, this.f31046f);
    }

    public final String toString() {
        String str;
        long j = this.f31045e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) a.i(j)) + ", ";
        } else {
            str = "";
        }
        long j9 = this.f31046f;
        if (((((j9 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) a.i(j9)) + ", ";
        }
        return "LinearGradient(colors=" + this.f31043c + ", stops=" + this.f31044d + ", " + str + str2 + "tileMode=Clamp)";
    }
}
