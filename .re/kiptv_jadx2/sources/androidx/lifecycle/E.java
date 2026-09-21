package androidx.lifecycle;

public abstract class E {

    public final H f16275h;

    public boolean f16276i;
    public int j = -1;

    public final F f16277k;

    public E(F f9, H h9) {
        this.f16277k = f9;
        this.f16275h = h9;
    }

    public final void a(boolean z6) {
        if (z6 == this.f16276i) {
            return;
        }
        this.f16276i = z6;
        int i3 = z6 ? 1 : -1;
        F f9 = this.f16277k;
        int i9 = f9.f16281c;
        f9.f16281c = i3 + i9;
        if (!f9.f16282d) {
            f9.f16282d = true;
            while (true) {
                try {
                    int i10 = f9.f16281c;
                    if (i9 == i10) {
                        break;
                    }
                    boolean z9 = i9 == 0 && i10 > 0;
                    boolean z10 = i9 > 0 && i10 == 0;
                    if (z9) {
                        f9.f();
                    } else if (z10) {
                        f9.g();
                    }
                    i9 = i10;
                } catch (Throwable th) {
                    f9.f16282d = false;
                    throw th;
                }
            }
            f9.f16282d = false;
        }
        if (this.f16276i) {
            f9.c(this);
        }
    }

    public void c() {
    }

    public boolean d(InterfaceC1540w interfaceC1540w) {
        return false;
    }

    public abstract boolean e();
}
