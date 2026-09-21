package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23260h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23261i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p080i8.o f23262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23263l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p080i8.v vVar, java.lang.String str, int i3, kotlin.jvm.internal.y yVar) {
        super(0);
        this.f23262k = vVar;
        this.f23261i = str;
        this.j = i3;
        this.f23263l = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f23260h) {
            case 0:
                return "Can not interpret the string '" + this.f23261i + "' as " + ((p080i8.d) ((p080i8.h) this.f23262k).f23264a.get(this.j)).f23258b + ": " + ((p080i8.f) this.f23263l).a();
            default:
                return "Expected " + ((p080i8.v) this.f23262k).f23288b + " but got " + this.f23261i.subSequence(this.j, ((kotlin.jvm.internal.y) this.f23263l).f24555h).toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, p080i8.h hVar, int i3, p080i8.f fVar) {
        super(0);
        this.f23261i = str;
        this.f23262k = hVar;
        this.j = i3;
        this.f23263l = fVar;
    }
}
