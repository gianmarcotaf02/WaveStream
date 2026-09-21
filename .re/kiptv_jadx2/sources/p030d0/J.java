package p030d0;

import U.C0948v;
import kotlin.jvm.internal.B;
import p020c0.C1668a;
import p020c0.InterfaceC1672c;
import p020c0.N0;
import p079i7.b;
import p089k0.k;

public abstract class J {

    public final int f21110a;

    public final int f21111b;

    public final int f21112c;

    public J(int i3, int i9, int i10, byte b9) {
        this.f21110a = i10;
        this.f21111b = i3;
        this.f21112c = i9;
    }

    public static b a(J j) {
        return new b(j.f21111b + j.f21112c, 1, 1, (byte) 0);
    }

    public static b b() {
        return new b(0, 1, 1, (byte) 0);
    }

    public abstract void c(C0948v c0948v, InterfaceC1672c interfaceC1672c, N0 n3, k kVar, K k9);

    public C1668a d(C0948v c0948v) {
        return null;
    }

    public String toString() {
        switch (this.f21110a) {
            case 0:
                String strH = B.f24540a.b(getClass()).h();
                return strH == null ? "" : strH;
            default:
                return super.toString();
        }
    }

    public J(int i3, int i9, int i10) {
        this((i10 & 1) != 0 ? 0 : i3, (i10 & 2) != 0 ? 0 : i9, 0, (byte) 0);
        this.f21110a = 0;
    }
}
