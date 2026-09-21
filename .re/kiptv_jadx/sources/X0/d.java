package X0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final X0.d f10796i = new X0.d(1, 0);
    public static final X0.d j = new X0.d(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final X0.d f10797k = new X0.d(1, 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10798h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i3, int i9) {
        super(i3);
        this.f10798h = i9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f10798h) {
            case 0:
                ((java.lang.Number) obj).longValue();
                return p070h6.A.f22523a;
            case 1:
                return java.lang.Integer.valueOf(((X0.j) obj).f10814b);
            default:
                p113n1.l lVar = ((X0.j) obj).f10815c;
                return java.lang.Integer.valueOf(lVar.f25564d - lVar.f25562b);
        }
    }
}
