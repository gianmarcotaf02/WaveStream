package Z;

/* JADX INFO: loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f12339i;
    public final /* synthetic */ p163t.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f12340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p163t.F f12341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f12342m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p163t.F f12343n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p163t.F f12344o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(int i3, float f9, p163t.F f10, long j, p163t.F f11, long j9, p163t.F f12, p163t.F f13) {
        super(1);
        this.f12338h = i3;
        this.f12339i = f9;
        this.j = f10;
        this.f12340k = j;
        this.f12341l = f11;
        this.f12342m = j9;
        this.f12343n = f12;
        this.f12344o = f13;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p203z0.d dVar = (p203z0.d) obj;
        float fB = p181w0.d.b(dVar.d());
        int i3 = this.f12338h;
        float fN = this.f12339i;
        if (i3 != 0 && p181w0.d.b(dVar.d()) <= p181w0.d.d(dVar.d())) {
            fN += dVar.N(fB);
        }
        float fN2 = fN / dVar.N(p181w0.d.d(dVar.d()));
        p163t.F f9 = this.j;
        float fFloatValue = ((java.lang.Number) f9.f27457k.getValue()).floatValue();
        float f10 = 1.0f - fN2;
        p020c0.C1681g0 c1681g0 = f9.f27457k;
        if (fFloatValue < f10) {
            Z.Z.d(dVar, ((java.lang.Number) c1681g0.getValue()).floatValue() > 0.0f ? ((java.lang.Number) c1681g0.getValue()).floatValue() + fN2 : 0.0f, 1.0f, this.f12340k, fB, this.f12338h);
        }
        float fFloatValue2 = ((java.lang.Number) c1681g0.getValue()).floatValue();
        p163t.F f11 = this.f12341l;
        float fFloatValue3 = fFloatValue2 - ((java.lang.Number) f11.f27457k.getValue()).floatValue();
        p020c0.C1681g0 c1681g1 = f11.f27457k;
        if (fFloatValue3 > 0.0f) {
            Z.Z.d(dVar, ((java.lang.Number) c1681g0.getValue()).floatValue(), ((java.lang.Number) c1681g1.getValue()).floatValue(), this.f12342m, fB, this.f12338h);
        }
        float fFloatValue4 = ((java.lang.Number) c1681g1.getValue()).floatValue();
        p163t.F f12 = this.f12343n;
        if (fFloatValue4 > fN2) {
            Z.Z.d(dVar, ((java.lang.Number) f12.f27457k.getValue()).floatValue() > 0.0f ? ((java.lang.Number) f12.f27457k.getValue()).floatValue() + fN2 : 0.0f, ((java.lang.Number) c1681g1.getValue()).floatValue() < 1.0f ? ((java.lang.Number) c1681g1.getValue()).floatValue() - fN2 : 1.0f, this.f12340k, fB, this.f12338h);
        }
        float fFloatValue5 = ((java.lang.Number) f12.f27457k.getValue()).floatValue();
        p163t.F f13 = this.f12344o;
        float fFloatValue6 = fFloatValue5 - ((java.lang.Number) f13.f27457k.getValue()).floatValue();
        p020c0.C1681g0 c1681g2 = f13.f27457k;
        if (fFloatValue6 > 0.0f) {
            Z.Z.d(dVar, ((java.lang.Number) f12.f27457k.getValue()).floatValue(), ((java.lang.Number) c1681g2.getValue()).floatValue(), this.f12342m, fB, this.f12338h);
        }
        if (((java.lang.Number) c1681g2.getValue()).floatValue() > fN2) {
            Z.Z.d(dVar, 0.0f, ((java.lang.Number) c1681g2.getValue()).floatValue() < 1.0f ? ((java.lang.Number) c1681g2.getValue()).floatValue() - fN2 : 1.0f, this.f12340k, fB, this.f12338h);
        }
        return p070h6.A.f22523a;
    }
}
