package p138q1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p138q1.c f26499i = new p138q1.c(1, 0);
    public static final p138q1.c j = new p138q1.c(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p138q1.c f26500k = new p138q1.c(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p138q1.c f26501l = new p138q1.c(1, 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26502h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i3, int i9) {
        super(i3);
        this.f26502h = i9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f26502h) {
            case 0:
                p138q1.j jVar = (p138q1.j) obj;
                jVar.getHandler().post(new p138q1.a(1, jVar.y));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return p070h6.A.f22523a;
    }
}
