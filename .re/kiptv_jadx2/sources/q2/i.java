package q2;

import B3.C0089b;
import B7.m;
import F3.l;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p070h6.k;
import p163t.I0;
import p163t.r;
import p184w3.C;
import p188x0.C3098s;
import p188x0.D;

public final class i implements p147r2.b, I0, l {

    public final int f26622h;

    public i(int i3) {
        this.f26622h = i3;
    }

    public static D c(List list, float f9, float f10, int i3) {
        return new D(list, null, (((long) Float.floatToRawIntBits((i3 & 2) != 0 ? 0.0f : f9)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits((i3 & 4) != 0 ? Float.POSITIVE_INFINITY : f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static D f(k[] kVarArr) {
        return g((k[]) Arrays.copyOf(kVarArr, kVarArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static D g(k[] kVarArr, long j, long j9) {
        ArrayList arrayList = new ArrayList(kVarArr.length);
        for (k kVar : kVarArr) {
            arrayList.add(new C3098s(((C3098s) kVar.f22540i).f31129a));
        }
        ArrayList arrayList2 = new ArrayList(kVarArr.length);
        for (k kVar2 : kVarArr) {
            arrayList2.add(Float.valueOf(((Number) kVar2.f22539h).floatValue()));
        }
        return new D(arrayList, arrayList2, j, j9);
    }

    public static D j(int i3, List list) {
        return new D(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i3 & 4) != 0 ? Float.POSITIVE_INFINITY : 40.0f)) & 4294967295L));
    }

    public static D k(k[] kVarArr) {
        return g((k[]) Arrays.copyOf(kVarArr, kVarArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    @Override
    public int A() {
        return 0;
    }

    @Override
    public int G() {
        return 0;
    }

    @Override
    public void K(Object obj, Object obj2) {
        B3.D d4 = (B3.D) obj;
        p059g4.d dVar = (p059g4.d) obj2;
        switch (this.f26622h) {
            case 11:
                C0089b c0089b = C.f29793G;
                ((B3.h) d4.p()).f0();
                dVar.b(null);
                break;
            default:
                C0089b c0089b2 = C.f29793G;
                B3.h hVar = (B3.h) d4.p();
                hVar.b0(hVar.Y(), 19);
                dVar.b(Boolean.TRUE);
                break;
        }
    }

    @Override
    public void d(int i3, Serializable serializable) {
        String str;
        switch (this.f26622h) {
            case 2:
                break;
            default:
                switch (i3) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i3 == 6 || i3 == 7 || i3 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    @Override
    public r e(long j, r rVar, r rVar2, r rVar3) {
        return j < ((long) 0) * 1000000 ? rVar : rVar2;
    }

    @Override
    public void l() {
        switch (this.f26622h) {
            case 2:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    public i(m mVar) {
        this.f26622h = 7;
        String str = m.f841d;
        new ConcurrentHashMap(3, 1.0f, 2);
    }

    private final void h() {
    }

    private final void i(int i3, Serializable serializable) {
    }

    @Override
    public r u(long j, r rVar, r rVar2, r rVar3) {
        return rVar3;
    }
}
