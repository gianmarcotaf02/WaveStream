package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements V7.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10459a;

    public /* synthetic */ f0(int i3) {
        this.f10459a = i3;
    }

    @Override // V7.e0
    public final V7.InterfaceC0981g a(W7.D d4) {
        switch (this.f10459a) {
            case 0:
                V7.c0 c0Var = V7.c0.f10447h;
                return new V7.C0984j();
            default:
                return new O1.C0754s(new V7.h0(d4, null));
        }
    }

    public final java.lang.String toString() {
        switch (this.f10459a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
