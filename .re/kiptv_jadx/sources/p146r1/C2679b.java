package p146r1;

/* JADX INFO: renamed from: r1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2679b extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p146r1.y f26725i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2679b(p146r1.y yVar, int i3) {
        super(1);
        this.f26724h = i3;
        this.f26725i = yVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f26724h) {
            case 0:
                p146r1.y yVar = this.f26725i;
                yVar.show();
                return new C5.F0(14, yVar);
            default:
                p146r1.y yVar2 = this.f26725i;
                if (yVar2.f26790l.f26783a) {
                    yVar2.f26789k.invoke();
                }
                return p070h6.A.f22523a;
        }
    }
}
