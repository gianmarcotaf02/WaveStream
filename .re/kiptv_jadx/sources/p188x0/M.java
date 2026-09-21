package p188x0;

/* JADX INFO: loaded from: classes.dex */
public abstract class M extends p188x0.AbstractC3095o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p020c0.C1704s0 f31074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31075b = 9205357640488583168L;

    @Override // p188x0.AbstractC3095o
    public final void a(float f9, long j, F3.C0371k c0371k) {
        p020c0.C1704s0 c1704s0 = this.f31074a;
        if (c1704s0 == null || !p181w0.d.a(this.f31075b, j)) {
            if (p181w0.d.e(j)) {
                this.f31074a = null;
                this.f31075b = 9205357640488583168L;
                c1704s0 = null;
            } else {
                c1704s0 = this.f31074a;
                if (c1704s0 == null) {
                    c1704s0 = new p020c0.C1704s0(28, false);
                    this.f31074a = c1704s0;
                }
                c1704s0.f18362i = b(j);
                this.f31074a = c1704s0;
                this.f31075b = j;
            }
        }
        long jC = p188x0.z.c(((android.graphics.Paint) c0371k.f3601b).getColor());
        long j9 = p188x0.C3098s.f31123b;
        if (!p188x0.C3098s.d(jC, j9)) {
            c0371k.j(j9);
        }
        if (!kotlin.jvm.internal.m.a((android.graphics.Shader) c0371k.f3602c, c1704s0 != null ? (android.graphics.Shader) c1704s0.f18362i : null)) {
            c0371k.n(c1704s0 != null ? (android.graphics.Shader) c1704s0.f18362i : null);
        }
        if (((android.graphics.Paint) c0371k.f3601b).getAlpha() / 255.0f == f9) {
            return;
        }
        c0371k.h(f9);
    }

    public abstract android.graphics.Shader b(long j);
}
