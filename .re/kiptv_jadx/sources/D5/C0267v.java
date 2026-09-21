package D5;

/* JADX INFO: renamed from: D5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0267v implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f2418i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    public /* synthetic */ C0267v(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i3) {
        this.f2417h = i3;
        this.f2418i = function0;
        this.j = function1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        kotlin.jvm.functions.Function0 function0;
        switch (this.f2417h) {
            case 0:
                android.view.KeyEvent event = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event, "event");
                if (I0.c.c(event) != 2) {
                    return java.lang.Boolean.FALSE;
                }
                boolean z6 = true;
                kotlin.jvm.functions.Function0 function1 = this.f2418i;
                if (function1 == null || !I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4548e)) {
                    kotlin.jvm.functions.Function0 function2 = this.j;
                    if (function2 == null || !I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4549f)) {
                        z6 = false;
                    } else {
                        function2.invoke();
                    }
                } else {
                    function1.invoke();
                }
                return java.lang.Boolean.valueOf(z6);
            default:
                android.view.KeyEvent event2 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event2, "event");
                if (I0.c.c(event2) != 2) {
                    return java.lang.Boolean.FALSE;
                }
                long jA = I0.c.a(event2.getKeyCode());
                boolean z9 = true;
                if (I0.a.a(jA, I0.a.f4548e)) {
                    kotlin.jvm.functions.Function0 function3 = this.f2418i;
                    if (function3 != null) {
                        function3.invoke();
                    } else {
                        z9 = false;
                    }
                } else if (!I0.a.a(jA, I0.a.f4549f) || (function0 = this.j) == null) {
                    z9 = false;
                } else {
                    function0.invoke();
                }
                return java.lang.Boolean.valueOf(z9);
        }
    }
}
