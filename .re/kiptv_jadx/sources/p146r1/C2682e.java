package p146r1;

/* JADX INFO: renamed from: r1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2682e extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p146r1.C2682e f26735i = new p146r1.C2682e(0, 0);
    public static final p146r1.C2682e j = new p146r1.C2682e(0, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p146r1.C2682e f26736k = new p146r1.C2682e(0, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p146r1.C2682e f26737l = new p146r1.C2682e(0, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26738h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2682e(int i3, int i9) {
        super(i3);
        this.f26738h = i9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f26738h) {
            case 0:
                return java.util.UUID.randomUUID();
            case 1:
                return java.lang.Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return java.util.UUID.randomUUID();
        }
    }
}
