package D5;

/* JADX INFO: renamed from: D5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0266u implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f2413i;

    public /* synthetic */ C0266u(int i3, kotlin.jvm.functions.Function0 function0) {
        this.f2412h = i3;
        this.f2413i = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z6;
        switch (this.f2412h) {
            case 0:
                android.view.KeyEvent event = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event, "event");
                if (I0.c.c(event) == 2 && I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4548e)) {
                    this.f2413i.invoke();
                    z6 = true;
                } else {
                    z6 = false;
                }
                return java.lang.Boolean.valueOf(z6);
            case 1:
                android.view.KeyEvent event2 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event2, "event");
                boolean z9 = true;
                if (I0.c.c(event2) == 1 && (I0.a.a(I0.c.a(event2.getKeyCode()), I0.a.f4545b) || I0.a.a(I0.c.a(event2.getKeyCode()), I0.a.f4563v))) {
                    this.f2413i.invoke();
                } else {
                    z9 = false;
                }
                return java.lang.Boolean.valueOf(z9);
            case 2:
                android.view.KeyEvent event3 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event3, "event");
                boolean z10 = true;
                if (I0.c.c(event3) == 1 && (I0.a.a(I0.c.a(event3.getKeyCode()), I0.a.f4545b) || I0.a.a(I0.c.a(event3.getKeyCode()), I0.a.f4563v))) {
                    this.f2413i.invoke();
                } else {
                    z10 = false;
                }
                return java.lang.Boolean.valueOf(z10);
            case 3:
                android.view.KeyEvent event4 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event4, "event");
                boolean z11 = true;
                if (I0.c.c(event4) != 1) {
                    return java.lang.Boolean.FALSE;
                }
                long jA = I0.c.a(event4.getKeyCode());
                if (I0.a.a(jA, I0.a.f4562u) || I0.a.a(jA, I0.a.f4545b)) {
                    this.f2413i.invoke();
                } else {
                    z11 = false;
                }
                return java.lang.Boolean.valueOf(z11);
            case 4:
                android.view.KeyEvent event5 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event5, "event");
                boolean z12 = true;
                if (I0.c.c(event5) == 1 && (I0.a.a(I0.c.a(event5.getKeyCode()), I0.a.f4545b) || I0.a.a(I0.c.a(event5.getKeyCode()), I0.a.f4563v))) {
                    this.f2413i.invoke();
                } else {
                    z12 = false;
                }
                return java.lang.Boolean.valueOf(z12);
            default:
                android.view.KeyEvent event6 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event6, "event");
                boolean z13 = true;
                if (I0.c.c(event6) == 1 && (I0.a.a(I0.c.a(event6.getKeyCode()), I0.a.f4551i) || I0.a.a(I0.c.a(event6.getKeyCode()), I0.a.f4560s))) {
                    this.f2413i.invoke();
                } else {
                    z13 = false;
                }
                return java.lang.Boolean.valueOf(z13);
        }
    }
}
