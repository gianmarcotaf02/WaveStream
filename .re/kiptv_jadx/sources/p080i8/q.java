package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p080i8.r f23277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23278i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f23279k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p080i8.r rVar, java.lang.String str, int i3, int i9) {
        super(0);
        this.f23277h = rVar;
        this.f23278i = str;
        this.j = i3;
        this.f23279k = i9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(this.f23277h.f23280a);
        sb.append(" but got ");
        int i3 = this.f23279k;
        int i9 = this.j;
        sb.append(this.f23278i.subSequence(i9, i3 + i9 + 1).toString());
        return sb.toString();
    }
}
