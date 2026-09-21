package Z0;

import p136q.AbstractC2669m;
import p136q.w;

public final class e {

    public final w f12624a;

    public d f12625b;

    public long f12626c;

    public long f12627d;

    public long f12628e;

    public long f12629f;
    public float[] g;

    public e() {
        w wVar = AbstractC2669m.f26402a;
        this.f12624a = new w();
        this.f12626c = -1L;
        this.f12627d = 0L;
        this.f12628e = 0L;
    }

    public final void a(d dVar, long j, long j9, float[] fArr, long j10) {
        long j11 = dVar.g;
        if (j10 - j11 > 0 || j11 == Long.MIN_VALUE) {
            dVar.g = j10;
            dVar.a(dVar.f12621e, dVar.f12622f, j, j9, fArr);
        }
    }
}
