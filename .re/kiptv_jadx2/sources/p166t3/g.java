package p166t3;

import E3.c;
import E3.k;
import F3.InterfaceC0364d;
import F3.v;
import H3.q;
import X3.h;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p139q3.a;

public final class g extends BasePendingResult implements InterfaceC0364d {
    public final int y;

    public g(v vVar, int i3) {
        super(vVar);
        this.y = i3;
        q.h(vVar, "GoogleApiClient must not be null");
        q.h(a.f26623a, "Api must not be null");
    }

    @Override
    public final k k0(Status status) {
        int i3 = this.y;
        return status;
    }

    public final void r0(c cVar) {
        switch (this.y) {
            case 0:
                e eVar = (e) cVar;
                k kVar = (k) eVar.p();
                f fVar = new f(this, 0);
                Parcel parcelM = kVar.m();
                int i3 = h.f10852a;
                parcelM.writeStrongBinder(fVar);
                h.c(parcelM, eVar.f27777G);
                kVar.J(parcelM, 102);
                break;
            default:
                e eVar2 = (e) cVar;
                k kVar2 = (k) eVar2.p();
                f fVar2 = new f(this, 1);
                Parcel parcelM2 = kVar2.m();
                int i9 = h.f10852a;
                parcelM2.writeStrongBinder(fVar2);
                h.c(parcelM2, eVar2.f27777G);
                kVar2.J(parcelM2, 103);
                break;
        }
    }

    public final void s0(Status status) {
        q.a("Failed result must not be success", !status.a());
        n0(k0(status));
    }
}
