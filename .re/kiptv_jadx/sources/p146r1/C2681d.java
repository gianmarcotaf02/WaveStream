package p146r1;

/* JADX INFO: renamed from: r1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2681d extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p146r1.C2681d f26729i = new p146r1.C2681d(1, 0);
    public static final p146r1.C2681d j = new p146r1.C2681d(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p146r1.C2681d f26730k = new p146r1.C2681d(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p146r1.C2681d f26731l = new p146r1.C2681d(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p146r1.C2681d f26732m = new p146r1.C2681d(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p146r1.C2681d f26733n = new p146r1.C2681d(1, 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2681d(int i3, int i9) {
        super(i3);
        this.f26734h = i9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p070h6.A a2 = p070h6.A.f22523a;
        switch (this.f26734h) {
            case 0:
                E6.u[] uVarArr = Y0.v.f11144a;
                ((Y0.x) obj).d(Y0.t.f11140x, a2);
                break;
            case 1:
                ((java.lang.Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                E6.u[] uVarArr2 = Y0.v.f11144a;
                ((Y0.x) obj).d(Y0.t.f11139w, a2);
                break;
            case 4:
                break;
            default:
                p146r1.A a9 = (p146r1.A) obj;
                if (a9.isAttachedToWindow()) {
                    a9.m();
                }
                break;
        }
        return a2;
    }
}
