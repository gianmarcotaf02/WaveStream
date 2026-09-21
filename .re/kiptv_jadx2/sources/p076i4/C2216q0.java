package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;

public final class C2216q0 extends AbstractC2186b0 {
    public final C2208m0 j;

    public C2216q0(C2208m0 c2208m0) {
        this.j = c2208m0;
    }

    @Override
    public final Object get(int i3) {
        C2208m0 c2208m0 = this.j;
        switch (c2208m0.f22921k) {
            case 0:
                N0 n3 = ((Y0) c2208m0.f22922l).f22853l;
                AbstractC1864o0.R(i3, n3.f22819c);
                return new M0(n3, i3);
            default:
                N0 n9 = ((Y0) c2208m0.f22922l).f22853l;
                AbstractC1864o0.R(i3, n9.f22819c);
                return n9.f22817a[i3];
        }
    }

    @Override
    public final boolean p() {
        return this.j.p();
    }

    @Override
    public final int size() {
        return this.j.size();
    }
}
