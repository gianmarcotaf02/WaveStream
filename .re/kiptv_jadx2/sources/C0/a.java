package C0;

import F3.C0371k;
import Q0.H;
import com.google.android.gms.internal.play_billing.V0;
import kotlin.jvm.internal.m;
import p113n1.n;
import p188x0.C3092l;
import p188x0.InterfaceC3097q;
import p188x0.z;
import p191x3.C;
import p203z0.b;

public abstract class a {

    public C0371k f863h;

    public boolean f864i;
    public C3092l j;

    public float f865k = 1.0f;

    public n f866l = n.f25566h;

    public boolean b(float f9) {
        return false;
    }

    public boolean e(C3092l c3092l) {
        return false;
    }

    public final void g(H h9, long j, float f9, C3092l c3092l) {
        if (this.f865k != f9) {
            if (!b(f9)) {
                if (f9 == 1.0f) {
                    C0371k c0371k = this.f863h;
                    if (c0371k != null) {
                        c0371k.h(f9);
                    }
                    this.f864i = false;
                } else {
                    C0371k c0371kG = this.f863h;
                    if (c0371kG == null) {
                        c0371kG = z.g();
                        this.f863h = c0371kG;
                    }
                    c0371kG.h(f9);
                    this.f864i = true;
                }
            }
            this.f865k = f9;
        }
        if (!m.a(this.j, c3092l)) {
            if (!e(c3092l)) {
                if (c3092l == null) {
                    C0371k c0371k2 = this.f863h;
                    if (c0371k2 != null) {
                        c0371k2.k(null);
                    }
                    this.f864i = false;
                } else {
                    C0371k c0371kG2 = this.f863h;
                    if (c0371kG2 == null) {
                        c0371kG2 = z.g();
                        this.f863h = c0371kG2;
                    }
                    c0371kG2.k(c3092l);
                    this.f864i = true;
                }
            }
            this.j = c3092l;
        }
        n layoutDirection = h9.getLayoutDirection();
        if (this.f866l != layoutDirection) {
            f(layoutDirection);
            this.f866l = layoutDirection;
        }
        b bVar = h9.f8266h;
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - Float.intBitsToFloat(i3);
        int i9 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - Float.intBitsToFloat(i9);
        ((C) bVar.f32128i.f23899i).a(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f9 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i3) > 0.0f && Float.intBitsToFloat(i9) > 0.0f) {
                    if (this.f864i) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
                        p181w0.b bVarC = V0.c(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i9))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        InterfaceC3097q interfaceC3097qJ = h9.f8266h.f32128i.j();
                        C0371k c0371kG3 = this.f863h;
                        if (c0371kG3 == null) {
                            c0371kG3 = z.g();
                            this.f863h = c0371kG3;
                        }
                        try {
                            interfaceC3097qJ.n(bVarC, c0371kG3);
                            i(h9);
                            interfaceC3097qJ.p();
                        } catch (Throwable th) {
                            interfaceC3097qJ.p();
                            throw th;
                        }
                    } else {
                        i(h9);
                    }
                }
            } catch (Throwable th2) {
                ((C) bVar.f32128i.f23899i).a(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((C) bVar.f32128i.f23899i).a(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(H h9);

    public void f(n nVar) {
    }
}
