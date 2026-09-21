package Z;

/* JADX INFO: loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f12327i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f12328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f12329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f12330m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(int i3, float f9, kotlin.jvm.functions.Function0 function0, long j, long j9, p194x6.j jVar) {
        super(1);
        this.f12326h = i3;
        this.f12327i = f9;
        this.j = function0;
        this.f12328k = j;
        this.f12329l = j9;
        this.f12330m = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p203z0.d dVar = (p203z0.d) obj;
        float fB = p181w0.d.b(dVar.d());
        int i3 = this.f12326h;
        float fN = this.f12327i;
        if (i3 != 0 && p181w0.d.b(dVar.d()) <= p181w0.d.d(dVar.d())) {
            fN += dVar.N(fB);
        }
        float fN2 = fN / dVar.N(p181w0.d.d(dVar.d()));
        float fFloatValue = ((java.lang.Number) this.j.invoke()).floatValue();
        float fMin = java.lang.Math.min(fFloatValue, fN2) + fFloatValue;
        if (fMin <= 1.0f) {
            Z.Z.d(dVar, fMin, 1.0f, this.f12328k, fB, this.f12326h);
        }
        Z.Z.d(dVar, 0.0f, fFloatValue, this.f12329l, fB, this.f12326h);
        this.f12330m.invoke(dVar);
        return p070h6.A.f22523a;
    }
}
