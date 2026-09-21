package A0;

import F3.C0371k;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.AbstractC1903s;
import java.util.Locale;
import p136q.I;
import p136q.Q;
import p188x0.C3088h;
import p188x0.F;
import p188x0.G;
import p188x0.H;
import p188x0.z;

public final class d {

    public final f f21a;

    public Outline f26f;
    public float j;

    public z f29k;

    public C3088h f30l;

    public C3088h f31m;

    public boolean f32n;

    public p203z0.b f33o;

    public C0371k f34p;

    public int f35q;

    public boolean f37s;

    public long f38t;

    public long f39u;

    public long f40v;

    public boolean f41w;

    public RectF f42x;

    public p113n1.c f22b = p203z0.c.f32130a;

    public p113n1.n f23c = p113n1.n.f25566h;

    public kotlin.jvm.internal.o f24d = c.f19i;

    public final b f25e = new b(0, this);
    public boolean g = true;

    public long f27h = 0;

    public long f28i = 9205357640488583168L;

    public final a f36r = new a();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public d(f fVar) {
        this.f21a = fVar;
        fVar.C(false);
        this.f38t = 0L;
        this.f39u = 0L;
        this.f40v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z6 = this.f41w;
            f fVar = this.f21a;
            Outline outline2 = null;
            if (z6 || fVar.K() > 0.0f) {
                C3088h c3088h = this.f30l;
                if (c3088h != null) {
                    RectF rectF = this.f42x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f42x = rectF;
                    }
                    Path path = c3088h.f31111a;
                    path.computeBounds(rectF, false);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 > 28 || path.isConvex()) {
                        outline = this.f26f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f26f = outline;
                        }
                        if (i3 >= 30) {
                            outline.setPath(path);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f32n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f26f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f32n = true;
                        outline = null;
                    }
                    this.f30l = c3088h;
                    if (outline != null) {
                        outline.setAlpha(fVar.a());
                        outline2 = outline;
                    }
                    fVar.g(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f32n && this.f41w) {
                        fVar.C(false);
                        fVar.i();
                    } else {
                        fVar.C(this.f41w);
                    }
                } else {
                    fVar.C(this.f41w);
                    Outline outline4 = this.f26f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f26f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jK = AbstractC1903s.K(this.f39u);
                    long j = this.f27h;
                    long j9 = this.f28i;
                    if (j9 != 9205357640488583168L) {
                        jK = j9;
                    }
                    int i9 = (int) (j >> 32);
                    int i10 = (int) (j & 4294967295L);
                    int i11 = (int) (jK >> 32);
                    int i12 = (int) (jK & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i9)), Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i11) + Float.intBitsToFloat(i9)), Math.round(Float.intBitsToFloat(i12) + Float.intBitsToFloat(i10)), this.j);
                    outline5.setAlpha(fVar.a());
                    fVar.g(outline5, (((long) Math.round(Float.intBitsToFloat(i12))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat(i11))) << 32));
                }
            } else {
                fVar.C(false);
                fVar.g(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.f37s && this.f35q == 0) {
            a aVar = this.f36r;
            d dVar = (d) aVar.f13b;
            if (dVar != null) {
                dVar.e();
                aVar.f13b = null;
            }
            I i3 = (I) aVar.f15d;
            if (i3 != null) {
                Object[] objArr = i3.f26329b;
                long[] jArr = i3.f26328a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j = jArr[i9];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i9 != length) {
                                break;
                                break;
                            }
                            i9++;
                        } else {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j) < 128) {
                                    ((d) objArr[(i9 << 3) + i11]).e();
                                }
                                j >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            } else if (i9 != length) {
                                break;
                            } else {
                                i9++;
                            }
                        }
                    }
                }
                i3.b();
            }
            this.f21a.i();
        }
    }

    public final void c(p203z0.d dVar) {
        a aVar = this.f36r;
        aVar.f14c = (d) aVar.f13b;
        I i3 = (I) aVar.f15d;
        if (i3 != null && i3.h()) {
            I i9 = (I) aVar.f16e;
            if (i9 == null) {
                I i10 = Q.f26352a;
                i9 = new I();
                aVar.f16e = i9;
            }
            i9.k(i3);
            i3.b();
        }
        aVar.f12a = true;
        this.f24d.invoke(dVar);
        aVar.f12a = false;
        d dVar2 = (d) aVar.f14c;
        if (dVar2 != null) {
            dVar2.e();
        }
        I i11 = (I) aVar.f16e;
        if (i11 == null || !i11.h()) {
            return;
        }
        Object[] objArr = i11.f26329b;
        long[] jArr = i11.f26328a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j = jArr[i12];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i12 != length) {
                        break;
                        break;
                    }
                    i12++;
                } else {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j) < 128) {
                            ((d) objArr[(i12 << 3) + i14]).e();
                        }
                        j >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 != length) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        i11.b();
    }

    public final z d() {
        z g;
        z zVar = this.f29k;
        C3088h c3088h = this.f30l;
        if (zVar != null) {
            return zVar;
        }
        if (c3088h != null) {
            F f9 = new F(c3088h);
            this.f29k = f9;
            return f9;
        }
        long jK = AbstractC1903s.K(this.f39u);
        long j = this.f27h;
        long j9 = this.f28i;
        if (j9 != 9205357640488583168L) {
            jK = j9;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jK >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jK & 4294967295L)) + fIntBitsToFloat2;
        float f10 = this.j;
        if (f10 > 0.0f) {
            g = new H(AbstractC1833d1.e(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10)))));
        } else {
            g = new G(new p181w0.b(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f29k = g;
        return g;
    }

    public final void e() {
        this.f35q--;
        b();
    }

    public final void f(long j, long j9, float f9) {
        if (p181w0.a.b(this.f27h, j) && p181w0.d.a(this.f28i, j9) && this.j == f9 && this.f30l == null) {
            return;
        }
        this.f29k = null;
        this.f30l = null;
        this.g = true;
        this.f32n = false;
        this.f27h = j;
        this.f28i = j9;
        this.j = f9;
        a();
    }
}
