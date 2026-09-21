package p188x0;

import F3.C0371k;
import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.m;
import p020c0.C1704s0;
import p181w0.d;

public abstract class M extends AbstractC3095o {

    public C1704s0 f31074a;

    public long f31075b = 9205357640488583168L;

    @Override
    public final void a(float f9, long j, C0371k c0371k) {
        C1704s0 c1704s0 = this.f31074a;
        if (c1704s0 == null || !d.a(this.f31075b, j)) {
            if (d.e(j)) {
                this.f31074a = null;
                this.f31075b = 9205357640488583168L;
                c1704s0 = null;
            } else {
                c1704s0 = this.f31074a;
                if (c1704s0 == null) {
                    c1704s0 = new C1704s0(28, false);
                    this.f31074a = c1704s0;
                }
                c1704s0.f18362i = b(j);
                this.f31074a = c1704s0;
                this.f31075b = j;
            }
        }
        long jC = z.c(((Paint) c0371k.f3601b).getColor());
        long j9 = C3098s.f31123b;
        if (!C3098s.d(jC, j9)) {
            c0371k.j(j9);
        }
        if (!m.a((Shader) c0371k.f3602c, c1704s0 != null ? (Shader) c1704s0.f18362i : null)) {
            c0371k.n(c1704s0 != null ? (Shader) c1704s0.f18362i : null);
        }
        if (((Paint) c0371k.f3601b).getAlpha() / 255.0f == f9) {
            return;
        }
        c0371k.h(f9);
    }

    public abstract Shader b(long j);
}
