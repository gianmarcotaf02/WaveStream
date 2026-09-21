package G4;

/* JADX INFO: loaded from: classes.dex */
public final class g implements D4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3800a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3801b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D4.c f3802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G4.e f3803d;

    public g(G4.e eVar) {
        this.f3803d = eVar;
    }

    @Override // D4.g
    public final D4.g c(java.lang.String str) {
        if (this.f3800a) {
            throw new D4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3800a = true;
        this.f3803d.d(this.f3802c, str, this.f3801b);
        return this;
    }

    @Override // D4.g
    public final D4.g d(boolean z6) {
        if (this.f3800a) {
            throw new D4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3800a = true;
        this.f3803d.c(this.f3802c, z6 ? 1 : 0, this.f3801b);
        return this;
    }
}
