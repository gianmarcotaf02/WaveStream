package p199y3;

import B3.n;
import B3.q;
import E3.k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;
import p008a8.c;
import p191x3.B;

public abstract class l extends BasePendingResult {

    public final g f31877A;
    public c y;

    public final boolean f31878z;

    public l(g gVar, boolean z6) {
        super(null);
        this.f31877A = gVar;
        this.f31878z = z6;
    }

    @Override
    public final k k0(Status status) {
        return new k(status, 1);
    }

    public abstract void r0();

    public final q s0() {
        if (this.y == null) {
            this.y = new c(29, this);
        }
        return this.y;
    }

    public final void t0() {
        if (!this.f31878z) {
            Iterator it = this.f31877A.f31868h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = this.f31877A.f31869i.iterator();
            while (it2.hasNext()) {
                ((B) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.f31877A.f31862a) {
                r0();
            }
        } catch (n unused) {
            n0(new k(new Status(2100, null, null, null), 1));
        }
    }
}
