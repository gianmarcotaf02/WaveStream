package D5;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2305i;
    public final /* synthetic */ p194x6.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f2306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f2307l;

    public i0(long j, boolean z6, p194x6.j jVar, long j9, kotlin.jvm.functions.Function0 function0) {
        this.f2304h = j;
        this.f2305i = z6;
        this.j = jVar;
        this.f2306k = j9;
        this.f2307l = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.view.KeyEvent event = ((I0.b) obj).f4568a;
        kotlin.jvm.internal.m.e(event, "event");
        if (I0.c.c(event) != 2) {
            return java.lang.Boolean.FALSE;
        }
        long jA = I0.c.a(event.getKeyCode());
        boolean zA = I0.a.a(jA, this.f2304h);
        p194x6.j jVar = this.j;
        boolean z6 = this.f2305i;
        boolean z9 = false;
        if (zA) {
            if (z6) {
                jVar.invoke(-1);
                z9 = true;
            }
        } else if (I0.a.a(jA, this.f2306k)) {
            if (z6) {
                jVar.invoke(1);
                z9 = true;
            }
        } else if (I0.a.a(jA, I0.a.f4551i) || I0.a.a(jA, I0.a.f4560s)) {
            this.f2307l.invoke();
            z9 = true;
        }
        return java.lang.Boolean.valueOf(z9);
    }
}
