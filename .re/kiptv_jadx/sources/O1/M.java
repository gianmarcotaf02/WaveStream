package O1;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p117n6.i implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public kotlin.jvm.internal.y f7769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7770i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f7771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O1.N f7772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f7774n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(kotlin.jvm.internal.y yVar, O1.N n3, java.lang.Object obj, boolean z6, p100l6.c cVar) {
        super(2, cVar);
        this.f7771k = yVar;
        this.f7772l = n3;
        this.f7773m = obj;
        this.f7774n = z6;
    }

    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        O1.M m8 = new O1.M(this.f7771k, this.f7772l, this.f7773m, this.f7774n, cVar);
        m8.j = obj;
        return m8;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((O1.M) create((Q1.k) obj, (p100l6.c) obj2)).invokeSuspend(p070h6.A.f22523a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (r6.b(r3, r7) == r0) goto L16;
     */
    @Override // p117n6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        Q1.k kVar;
        kotlin.jvm.internal.y yVar;
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f7770i;
        kotlin.jvm.internal.y yVar2 = this.f7771k;
        java.lang.Object obj2 = this.f7773m;
        O1.N n3 = this.f7772l;
        if (i3 != 0) {
            if (i3 == 1) {
                yVar = this.f7769h;
                kVar = (Q1.k) this.j;
                com.google.common.util.concurrent.P.u0(obj);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            if (this.f7774n) {
                n3.f7781h.G(new O1.C0739c(obj2, obj2 != null ? obj2.hashCode() : 0, yVar2.f24555h));
            }
            return p070h6.A.f22523a;
        }
        com.google.common.util.concurrent.P.u0(obj);
        Q1.k kVar2 = (Q1.k) this.j;
        O1.X xG = n3.g();
        this.j = kVar2;
        this.f7769h = yVar2;
        this.f7770i = 1;
        java.lang.Integer num = new java.lang.Integer(((java.util.concurrent.atomic.AtomicInteger) xG.f7806b.f9i).incrementAndGet());
        if (num != aVar) {
            kVar = kVar2;
            obj = num;
            yVar = yVar2;
        }
        return aVar;
        yVar.f24555h = ((java.lang.Number) obj).intValue();
        this.j = null;
        this.f7769h = null;
        this.f7770i = 2;
    }
}
