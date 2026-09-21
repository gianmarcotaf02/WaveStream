package t5;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f27843i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    public /* synthetic */ D(long j, kotlin.jvm.functions.Function0 function0, int i3) {
        this.f27842h = i3;
        this.f27843i = j;
        this.j = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z6;
        boolean z9;
        switch (this.f27842h) {
            case 0:
                android.view.KeyEvent event = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event, "event");
                long jA = I0.c.a(event.getKeyCode());
                if (I0.a.a(jA, I0.a.f4545b) || I0.a.a(jA, this.f27843i)) {
                    if (I0.c.c(event) == 2) {
                        this.j.invoke();
                    }
                    z6 = true;
                } else {
                    z6 = false;
                }
                return java.lang.Boolean.valueOf(z6);
            default:
                android.view.KeyEvent event2 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event2, "event");
                if (I0.a.a(I0.c.a(event2.getKeyCode()), I0.a.f4545b) || I0.a.a(I0.c.a(event2.getKeyCode()), this.f27843i)) {
                    if (I0.c.c(event2) == 2) {
                        this.j.invoke();
                    }
                    z9 = true;
                } else {
                    z9 = false;
                }
                return java.lang.Boolean.valueOf(z9);
        }
    }
}
