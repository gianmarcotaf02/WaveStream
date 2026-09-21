package p146r1;

/* JADX INFO: loaded from: classes.dex */
public final class z extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z f26794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p146r1.A f26795i;
    public final /* synthetic */ p113n1.l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f26796k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f26797l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(kotlin.jvm.internal.z zVar, p146r1.A a2, p113n1.l lVar, long j, long j9) {
        super(0);
        this.f26794h = zVar;
        this.f26795i = a2;
        this.j = lVar;
        this.f26796k = j;
        this.f26797l = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        p146r1.A a2 = this.f26795i;
        this.f26794h.f24556h = a2.getPositionProvider().b(this.j, this.f26796k, a2.getParentLayoutDirection(), this.f26797l);
        return p070h6.A.f22523a;
    }
}
