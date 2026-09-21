package F;

import B.C0073k;
import Q0.AbstractC0777k;
import Q0.InterfaceC0775i;
import Q0.InterfaceC0788w;
import x.EnumC3061p0;

public final class C0352q extends p137q0.o implements InterfaceC0788w, InterfaceC0775i {
    public static final C0350o y = new C0350o();

    public r f3486v;

    public C0347l f3487w;

    public EnumC3061p0 f3488x;

    public final boolean N0(C0346k c0346k, int i3) {
        if (i3 == 5 || i3 == 6) {
            if (this.f3488x == EnumC3061p0.f30979i) {
                return false;
            }
        } else if (i3 == 3 || i3 == 4) {
            if (this.f3488x == EnumC3061p0.f30978h) {
                return false;
            }
        } else if (i3 != 1 && i3 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (O0(i3)) {
            if (c0346k.f3471b >= this.f3486v.a() - 1) {
                return false;
            }
        } else if (c0346k.f3470a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean O0(int i3) {
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        if (i3 == 5) {
            return false;
        }
        if (i3 == 6) {
            return true;
        }
        if (i3 == 3) {
            int iOrdinal = AbstractC0777k.t(this).H.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new I3.b();
        }
        if (i3 != 4) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        int iOrdinal2 = AbstractC0777k.t(this).H.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new I3.b();
    }

    @Override
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        O0.g0 g0VarC = q9.C(j);
        return u6.q0(g0VarC.f7639h, g0VarC.f7640i, p078i6.x.f23206h, new C0073k(g0VarC, 5));
    }
}
