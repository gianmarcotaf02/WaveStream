package E3;

/* JADX INFO: loaded from: classes.dex */
public final class m extends com.google.android.gms.common.api.internal.BasePendingResult {
    public final com.google.android.gms.common.api.Status y;

    public m(com.google.android.gms.common.api.Status status) {
        super(null);
        this.y = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final E3.k k0(com.google.android.gms.common.api.Status status) {
        return this.y;
    }
}
