package H1;

public final class a {

    public int f3841a;

    public int f3842b;

    public float f3843c;

    public float f3844d;

    public long f3845e;

    public long f3846f;
    public long g;

    public float f3847h;

    public int f3848i;

    public final float a(long j) {
        long j9 = this.f3845e;
        if (j < j9) {
            return 0.0f;
        }
        long j10 = this.g;
        if (j10 < 0 || j < j10) {
            return d.b((j - j9) / this.f3841a, 0.0f, 1.0f) * 0.5f;
        }
        float f9 = this.f3847h;
        return (d.b((j - j10) / this.f3848i, 0.0f, 1.0f) * f9) + (1.0f - f9);
    }
}
