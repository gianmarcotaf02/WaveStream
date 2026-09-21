package p166t3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.internal.BasePendingResult implements F3.InterfaceC0364d {
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(F3.v vVar, int i3) {
        super(vVar);
        this.y = i3;
        H3.q.h(vVar, "GoogleApiClient must not be null");
        H3.q.h(p139q3.a.f26623a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ E3.k k0(com.google.android.gms.common.api.Status status) {
        int i3 = this.y;
        return status;
    }

    public final void r0(E3.c cVar) {
        switch (this.y) {
            case 0:
                p166t3.e eVar = (p166t3.e) cVar;
                p166t3.k kVar = (p166t3.k) eVar.p();
                p166t3.f fVar = new p166t3.f(this, 0);
                android.os.Parcel parcelM = kVar.m();
                int i3 = X3.h.f10852a;
                parcelM.writeStrongBinder(fVar);
                X3.h.c(parcelM, eVar.f27777G);
                kVar.J(parcelM, 102);
                break;
            default:
                p166t3.e eVar2 = (p166t3.e) cVar;
                p166t3.k kVar2 = (p166t3.k) eVar2.p();
                p166t3.f fVar2 = new p166t3.f(this, 1);
                android.os.Parcel parcelM2 = kVar2.m();
                int i9 = X3.h.f10852a;
                parcelM2.writeStrongBinder(fVar2);
                X3.h.c(parcelM2, eVar2.f27777G);
                kVar2.J(parcelM2, 103);
                break;
        }
    }

    public final void s0(com.google.android.gms.common.api.Status status) {
        H3.q.a("Failed result must not be success", !status.a());
        n0(k0(status));
    }
}
