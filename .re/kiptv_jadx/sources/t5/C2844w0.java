package t5;

/* JADX INFO: renamed from: t5.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2844w0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f28430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f28431i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f28432k;

    public C2844w0(boolean z6, long j, long j9, kotlin.jvm.functions.Function0 function0) {
        this.f28430h = z6;
        this.f28431i = j;
        this.j = j9;
        this.f28432k = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.view.KeyEvent event = ((I0.b) obj).f4568a;
        kotlin.jvm.internal.m.e(event, "event");
        if (!this.f28430h) {
            return java.lang.Boolean.FALSE;
        }
        long jA = I0.c.a(event.getKeyCode());
        boolean z6 = true;
        if (!I0.a.a(jA, this.f28431i)) {
            if (!I0.a.a(jA, this.j)) {
                z6 = false;
            } else if (I0.c.c(event) == 2) {
                this.f28432k.invoke();
            }
        }
        return java.lang.Boolean.valueOf(z6);
    }
}
