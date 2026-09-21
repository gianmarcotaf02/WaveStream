package Z;

/* JADX INFO: loaded from: classes.dex */
public final class O extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f12283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p203z0.g f12284i;
    public final /* synthetic */ p163t.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p163t.F f12285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p163t.F f12286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p163t.F f12287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f12288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f12289o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(long j, p203z0.g gVar, p163t.F f9, p163t.F f10, p163t.F f11, p163t.F f12, float f13, long j9) {
        super(1);
        this.f12283h = j;
        this.f12284i = gVar;
        this.j = f9;
        this.f12285k = f10;
        this.f12286l = f11;
        this.f12287m = f12;
        this.f12288n = f13;
        this.f12289o = j9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        float f9;
        p203z0.d dVar = (p203z0.d) obj;
        p203z0.g gVar = this.f12284i;
        Z.Z.e(dVar, 0.0f, 360.0f, this.f12283h, gVar);
        float fFloatValue = (((java.lang.Number) this.j.f27457k.getValue()).floatValue() * 216.0f) % 360.0f;
        float fFloatValue2 = ((java.lang.Number) this.f12285k.f27457k.getValue()).floatValue();
        p163t.F f10 = this.f12286l;
        float fAbs = java.lang.Math.abs(fFloatValue2 - ((java.lang.Number) f10.f27457k.getValue()).floatValue());
        float fFloatValue3 = ((java.lang.Number) f10.f27457k.getValue()).floatValue() + ((java.lang.Number) this.f12287m.f27457k.getValue()).floatValue() + (fFloatValue - 90.0f);
        if (gVar.f32135d == 0) {
            f9 = 0.0f;
        } else {
            f9 = ((this.f12288n / (Z.Z.f12356e / 2)) * 57.29578f) / 2.0f;
        }
        Z.Z.e(dVar, fFloatValue3 + f9, java.lang.Math.max(fAbs, 0.1f), this.f12289o, gVar);
        return p070h6.A.f22523a;
    }
}
