package F;

import O0.q0;
import Z.AbstractC1149h0;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class i0 {

    public boolean f3464a;

    public final Object f3465b;

    public Object f3466c;

    public Object f3467d;

    public i0() {
        this.f3465b = new Object();
        this.f3466c = new ArrayList();
        this.f3467d = new ArrayList();
        this.f3464a = true;
    }

    public static void a(N4.d[][][] dVarArr, int i3, N4.d dVar) {
        N4.d[] dVarArr2 = dVarArr[i3 + dVar.f7339d][dVar.f7338c];
        M4.b bVar = dVar.f7336a;
        int iOrdinal = bVar.ordinal();
        char c9 = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c9 = 1;
            } else if (iOrdinal == 4) {
                c9 = 3;
            } else {
                if (iOrdinal != 6) {
                    throw new IllegalStateException("Illegal mode " + bVar);
                }
                c9 = 0;
            }
        }
        N4.d dVar2 = dVarArr2[c9];
        if (dVar2 != null) {
            if (dVar2.f7341f <= dVar.f7341f) {
                return;
            }
        }
        dVarArr2[c9] = dVar;
    }

    public static boolean c(M4.b bVar, char c9) {
        int i3;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                if (c9 < '`') {
                    i3 = N4.b.f7330a[c9];
                } else {
                    int[] iArr = N4.b.f7330a;
                    i3 = -1;
                }
                if (i3 == -1) {
                    return false;
                }
            } else if (iOrdinal != 4) {
                if (iOrdinal != 6) {
                    return false;
                }
                return N4.b.b(String.valueOf(c9));
            }
        } else if (c9 < '0' || c9 > '9') {
            return false;
        }
        return true;
    }

    public static M4.c g(int i3) {
        int iC = AbstractC1149h0.c(i3);
        if (iC != 0) {
            return iC != 1 ? M4.c.a(40) : M4.c.a(26);
        }
        return M4.c.a(9);
    }

    public void b(M4.c cVar, N4.d[][][] dVarArr, int i3, N4.d dVar) {
        int i9;
        J4.d dVar2 = (J4.d) this.f3466c;
        int length = dVar2.f6024a.length;
        CharsetEncoder[] charsetEncoderArr = dVar2.f6024a;
        int i10 = dVar2.f6025b;
        String str = (String) this.f3465b;
        if (i10 >= 0) {
            char cCharAt = str.charAt(i3);
            if (charsetEncoderArr[i10].canEncode("" + cCharAt)) {
                length = i10 + 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        int i11 = length;
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt2 = str.charAt(i3);
            if (charsetEncoderArr[i12].canEncode("" + cCharAt2)) {
                a(dVarArr, i3, new N4.d(this, M4.b.BYTE, i3, i12, 1, dVar, cVar));
            }
        }
        M4.b bVar = M4.b.KANJI;
        if (c(bVar, str.charAt(i3))) {
            a(dVarArr, i3, new N4.d(this, bVar, i3, 0, 1, dVar, cVar));
        }
        int length2 = str.length();
        M4.b bVar2 = M4.b.ALPHANUMERIC;
        int i13 = 2;
        if (c(bVar2, str.charAt(i3))) {
            int i14 = i3 + 1;
            a(dVarArr, i3, new N4.d(this, bVar2, i3, 0, (i14 >= length2 || !c(bVar2, str.charAt(i14))) ? 1 : 2, dVar, cVar));
        }
        M4.b bVar3 = M4.b.NUMERIC;
        if (c(bVar3, str.charAt(i3))) {
            int i15 = i3 + 1;
            if (i15 >= length2 || !c(bVar3, str.charAt(i15))) {
                i9 = 1;
            } else {
                int i16 = i3 + 2;
                if (i16 < length2 && c(bVar3, str.charAt(i16))) {
                    i13 = 3;
                }
                i9 = i13;
            }
            a(dVarArr, i3, new N4.d(this, bVar3, i3, 0, i9, dVar, cVar));
        }
    }

    public void d(boolean z6) {
        I2.e eVar = (I2.e) this.f3467d;
        synchronized (eVar.f4590o) {
            try {
                if (this.f3464a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (kotlin.jvm.internal.m.a(((I2.a) this.f3465b).g, this)) {
                    I2.e.b(eVar, this, z6);
                }
                this.f3464a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public android.support.v4.media.session.q e(M4.c cVar) throws F6.a {
        CharsetEncoder[] charsetEncoderArr;
        int i3;
        String str = (String) this.f3465b;
        int length = str.length();
        J4.d dVar = (J4.d) this.f3466c;
        int i9 = 1;
        N4.d[][][] dVarArr = (N4.d[][][]) Array.newInstance((Class<?>) N4.d.class, length + 1, dVar.f6024a.length, 4);
        b(cVar, dVarArr, 0, null);
        while (true) {
            charsetEncoderArr = dVar.f6024a;
            if (i9 > length) {
                break;
            }
            for (int i10 = 0; i10 < charsetEncoderArr.length; i10++) {
                for (int i11 = 0; i11 < 4; i11++) {
                    N4.d dVar2 = dVarArr[i9][i10][i11];
                    if (dVar2 != null && i9 < length) {
                        b(cVar, dVarArr, i9, dVar2);
                    }
                }
            }
            i9++;
        }
        int i12 = -1;
        int i13 = Integer.MAX_VALUE;
        int i14 = -1;
        for (int i15 = 0; i15 < charsetEncoderArr.length; i15++) {
            for (int i16 = 0; i16 < 4; i16++) {
                N4.d dVar3 = dVarArr[length][i15][i16];
                if (dVar3 != null && (i3 = dVar3.f7341f) < i13) {
                    i12 = i15;
                    i14 = i16;
                    i13 = i3;
                }
            }
        }
        if (i12 >= 0) {
            return new android.support.v4.media.session.q(this, cVar, dVarArr[length][i12][i14]);
        }
        throw new F6.a(Y6.f.h("Internal error: failed to encode \"", str, "\""));
    }

    public M8.A f(int i3) {
        M8.A a2;
        I2.e eVar = (I2.e) this.f3467d;
        synchronized (eVar.f4590o) {
            if (this.f3464a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f3466c)[i3] = true;
            Object obj = ((I2.a) this.f3465b).f4576d.get(i3);
            p000a.a.n(eVar.f4599x, (M8.A) obj);
            a2 = (M8.A) obj;
        }
        return a2;
    }

    public i0(String str, Charset charset, boolean z6, M4.a aVar) {
        this.f3465b = str;
        this.f3464a = z6;
        this.f3466c = new J4.d(str, charset);
        this.f3467d = aVar;
    }

    public i0(C0359y c0359y, q0 q0Var, j0 j0Var) {
        this.f3465b = c0359y;
        this.f3466c = q0Var;
        this.f3467d = j0Var;
        this.f3464a = true;
    }

    public i0(List channels, Map map, boolean z6, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(channels, "channels");
        kotlin.jvm.internal.m.e(map, "map");
        this.f3465b = channels;
        this.f3466c = map;
        this.f3464a = z6;
        this.f3467d = arrayList;
    }

    public i0(I2.e eVar, I2.a aVar) {
        this.f3467d = eVar;
        this.f3465b = aVar;
        eVar.getClass();
        this.f3466c = new boolean[2];
    }
}
