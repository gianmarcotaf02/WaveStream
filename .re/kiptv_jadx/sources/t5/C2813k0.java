package t5;

/* JADX INFO: renamed from: t5.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2813k0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f28242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f28243i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f28244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f28245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f28246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f28247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f28248o;

    public C2813k0(kotlin.jvm.functions.Function0 function0, long j, kotlin.jvm.functions.Function0 function1, long j9, kotlin.jvm.functions.Function0 function2, kotlin.jvm.functions.Function0 function3, p020c0.X x9, p020c0.X x10) {
        this.f28242h = function0;
        this.f28243i = j;
        this.j = function1;
        this.f28244k = j9;
        this.f28245l = function2;
        this.f28246m = function3;
        this.f28247n = x9;
        this.f28248o = x10;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.view.KeyEvent event = ((I0.b) obj).f4568a;
        kotlin.jvm.internal.m.e(event, "event");
        kotlin.jvm.functions.Function0 function0 = this.f28242h;
        if (function0 != null && I0.a.a(I0.c.a(event.getKeyCode()), this.f28243i)) {
            if (I0.c.c(event) == 2) {
                function0.invoke();
            }
            return java.lang.Boolean.TRUE;
        }
        kotlin.jvm.functions.Function0 function1 = this.j;
        if (function1 != null && I0.a.a(I0.c.a(event.getKeyCode()), this.f28244k)) {
            if (I0.c.c(event) == 2) {
                function1.invoke();
            }
            return java.lang.Boolean.TRUE;
        }
        boolean z6 = false;
        if (I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4551i) || I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4560s) || I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4537G)) {
            kotlin.jvm.functions.Function0 function2 = this.f28245l;
            kotlin.jvm.functions.Function0 function3 = this.f28246m;
            if (function2 != null || function3 != null) {
                int iC = I0.c.c(event);
                p020c0.X x9 = this.f28247n;
                p020c0.X x10 = this.f28248o;
                if (iC == 2) {
                    if (event.getRepeatCount() == 0) {
                        x9.setValue(java.lang.Boolean.TRUE);
                        x10.setValue(java.lang.Boolean.FALSE);
                    }
                    if (function3 != null && ((java.lang.Boolean) x9.getValue()).booleanValue() && !((java.lang.Boolean) x10.getValue()).booleanValue() && event.getRepeatCount() >= 1) {
                        x10.setValue(java.lang.Boolean.TRUE);
                        function3.invoke();
                    }
                } else if (I0.c.c(event) == 1) {
                    if (((java.lang.Boolean) x9.getValue()).booleanValue()) {
                        if (((java.lang.Boolean) x10.getValue()).booleanValue()) {
                            x10.setValue(java.lang.Boolean.FALSE);
                        } else if (function2 != null) {
                            function2.invoke();
                        }
                    }
                    x9.setValue(java.lang.Boolean.FALSE);
                }
                z6 = true;
            }
        }
        return java.lang.Boolean.valueOf(z6);
    }
}
