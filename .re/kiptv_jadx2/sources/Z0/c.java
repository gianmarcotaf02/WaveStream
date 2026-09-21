package Z0;

import F.C0339d;
import java.util.Arrays;
import p113n1.k;
import p121o0.p;

public final class c {

    public final long f12611a;

    public final long f12612b;

    public final long f12613c;

    public final long f12614d;

    public final long f12615e;

    public final float[] f12616f;
    public final C0339d g;

    public c(long j, long j9, long j10, long j11, long j12, float[] fArr, C0339d c0339d) {
        this.f12611a = j;
        this.f12612b = j9;
        this.f12613c = j10;
        this.f12614d = j11;
        this.f12615e = j12;
        this.f12616f = fArr;
        this.g = c0339d;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (this.f12611a == cVar.f12611a && this.f12612b == cVar.f12612b && this.f12615e == cVar.f12615e && k.a(this.f12613c, cVar.f12613c) && k.a(this.f12614d, cVar.f12614d)) {
                    float[] fArr = this.f12616f;
                    float[] fArr2 = cVar.f12616f;
                    if (fArr == null) {
                        if (fArr2 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr2 == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr.equals(fArr2);
                    }
                    if (zEquals && this.g.equals(cVar.g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iE = p.e(p.e(p.e(p.e(Long.hashCode(this.f12611a) * 31, 31, this.f12612b), 31, this.f12615e), 31, this.f12613c), 31, this.f12614d);
        float[] fArr = this.f12616f;
        return this.g.hashCode() + ((iE + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
