package U;

/* JADX INFO: renamed from: U.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0928a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9957h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f9958i;
    public final /* synthetic */ boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9959k;

    public /* synthetic */ C0928a(U.InterfaceC0938k interfaceC0938k, boolean z6, boolean z9) {
        this.f9959k = interfaceC0938k;
        this.f9958i = z6;
        this.j = z9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f9957h) {
            case 0:
                Y0.x xVar = (Y0.x) obj;
                long jA = ((U.InterfaceC0938k) this.f9959k).a();
                xVar.d(U.K.f9921c, new U.J(this.f9958i ? J.L.f5652i : J.L.j, jA, this.j ? U.I.f9912h : U.I.j, (9223372034707292159L & jA) != 9205357640488583168L));
                return p070h6.A.f22523a;
            default:
                return io.ktor.http.CodecsKt.encodeURLQueryComponent$lambda$4$lambda$3(this.f9958i, (java.lang.StringBuilder) this.f9959k, this.j, ((java.lang.Byte) obj).byteValue());
        }
    }

    public /* synthetic */ C0928a(boolean z6, java.lang.StringBuilder sb, boolean z9) {
        this.f9958i = z6;
        this.f9959k = sb;
        this.j = z9;
    }
}
