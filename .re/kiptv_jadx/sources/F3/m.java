package F3;

/* JADX INFO: loaded from: classes.dex */
public final class m extends com.google.android.gms.common.api.internal.BasePendingResult {
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(F3.v vVar, int i3) {
        super(vVar);
        this.y = i3;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ E3.k k0(com.google.android.gms.common.api.Status status) {
        switch (this.y) {
            case 0:
                return status;
            default:
                return new p199y3.k(status, 0);
        }
    }
}
