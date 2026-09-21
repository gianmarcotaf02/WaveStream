package p199y3;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends com.google.android.gms.common.api.internal.BasePendingResult {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ p199y3.g f31877A;
    public p008a8.c y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f31878z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p199y3.g gVar, boolean z6) {
        super(null);
        this.f31877A = gVar;
        this.f31878z = z6;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ E3.k k0(com.google.android.gms.common.api.Status status) {
        return new p199y3.k(status, 1);
    }

    public abstract void r0();

    public final B3.q s0() {
        if (this.y == null) {
            this.y = new p008a8.c(29, this);
        }
        return this.y;
    }

    public final void t0() {
        if (!this.f31878z) {
            java.util.Iterator it = this.f31877A.f31868h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new java.lang.ClassCastException();
            }
            java.util.Iterator it2 = this.f31877A.f31869i.iterator();
            while (it2.hasNext()) {
                ((p191x3.B) it2.next()).getClass();
            }
        }
        try {
            synchronized (this.f31877A.f31862a) {
                r0();
            }
        } catch (B3.n unused) {
            n0(new p199y3.k(new com.google.android.gms.common.api.Status(2100, null, null, null), 1));
        }
    }
}
