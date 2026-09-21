package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class Z implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4406h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H6.C0411b0 f4407i;

    public /* synthetic */ Z(H6.C0411b0 c0411b0, int i3) {
        this.f4406h = i3;
        this.f4407i = c0411b0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f4406h) {
            case 0:
                return new H6.C0409a0(this.f4407i);
            default:
                H6.C0411b0 c0411b0 = this.f4407i;
                return c0411b0.s(c0411b0.r(), null);
        }
    }
}
