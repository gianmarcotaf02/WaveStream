package G4;

public final class g implements D4.g {

    public boolean f3800a = false;

    public boolean f3801b = false;

    public D4.c f3802c;

    public final e f3803d;

    public g(e eVar) {
        this.f3803d = eVar;
    }

    @Override
    public final D4.g c(String str) {
        if (this.f3800a) {
            throw new D4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3800a = true;
        this.f3803d.d(this.f3802c, str, this.f3801b);
        return this;
    }

    @Override
    public final D4.g d(boolean z6) {
        if (this.f3800a) {
            throw new D4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f3800a = true;
        this.f3803d.c(this.f3802c, z6 ? 1 : 0, this.f3801b);
        return this;
    }
}
