package R0;

/* JADX INFO: renamed from: R0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0850u extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8995i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0850u(int i3, int i9) {
        super(1);
        this.f8994h = i9;
        this.f8995i = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f8994h) {
            case 0:
                return java.lang.Boolean.valueOf(((p175v0.F) obj).U0(this.f8995i));
            case 1:
                return java.lang.Boolean.valueOf(((p175v0.F) obj).U0(this.f8995i));
            case 2:
                return java.lang.Boolean.valueOf(((p175v0.F) obj).U0(this.f8995i));
            case 3:
                return java.lang.Boolean.valueOf(((p175v0.F) obj).U0(this.f8995i));
            default:
                return java.lang.Boolean.valueOf(((p175v0.F) obj).N0(this.f8995i));
        }
    }
}
