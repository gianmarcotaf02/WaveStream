package R;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q0.C0778l f8720a;

    static {
        float f9 = 40;
        float f10 = 10;
        f8720a = new Q0.C0778l(f10, f9, f10, f9);
    }

    public static final p137q0.p a(boolean z6, boolean z9, kotlin.jvm.functions.Function0 function0) {
        p137q0.p j = p137q0.m.f26474b;
        if (!z6 || !R.e.f8727a) {
            return j;
        }
        if (z9) {
            j = new K0.J(f8720a);
        }
        return j.d(new R.a(function0));
    }
}
