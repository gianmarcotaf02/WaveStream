package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends S7.U {
    public final S7.C0895k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ S7.W f9555k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(S7.W w6, long j, S7.C0895k c0895k) {
        super(j);
        this.f9555k = w6;
        this.j = c0895k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.j.A(this.f9555k);
    }

    @Override // S7.U
    public final java.lang.String toString() {
        return super.toString() + this.j;
    }
}
