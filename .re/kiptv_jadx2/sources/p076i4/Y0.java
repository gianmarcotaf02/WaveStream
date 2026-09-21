package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.crypto.tink.shaded.protobuf.q0;

public final class Y0 extends AbstractC2210n0 {

    public static final Y0 f22852o;

    public final transient N0 f22853l;

    public final transient int f22854m;

    public transient C2208m0 f22855n;

    static {
        N0 n3 = new N0();
        n3.d(3);
        f22852o = new Y0(n3);
    }

    public Y0(N0 n3) {
        this.f22853l = n3;
        long j = 0;
        int i3 = 0;
        while (true) {
            int i9 = n3.f22819c;
            if (i3 >= i9) {
                this.f22854m = q0.F(j);
                return;
            } else {
                AbstractC1864o0.R(i3, i9);
                j += (long) n3.f22818b[i3];
                i3++;
            }
        }
    }

    @Override
    public final boolean p() {
        throw null;
    }

    @Override
    public final AbstractC2214p0 r() {
        C2208m0 c2208m0 = this.f22855n;
        if (c2208m0 != null) {
            return c2208m0;
        }
        C2208m0 c2208m1 = new C2208m0(this, 1);
        this.f22855n = c2208m1;
        return c2208m1;
    }

    @Override
    public final int size() {
        return this.f22854m;
    }
}
