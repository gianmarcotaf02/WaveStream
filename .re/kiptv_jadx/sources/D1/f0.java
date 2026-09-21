package D1;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D1.m0 f2007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1.E0 f2008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D1.E0 f2009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f2011e;

    public f0(D1.m0 m0Var, D1.E0 e6, D1.E0 e9, int i3, android.view.View view) {
        this.f2007a = m0Var;
        this.f2008b = e6;
        this.f2009c = e9;
        this.f2010d = i3;
        this.f2011e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        D1.s0 p0Var;
        int i3;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        D1.m0 m0Var = this.f2007a;
        m0Var.f2041a.e(animatedFraction);
        float fC = m0Var.f2041a.c();
        android.view.animation.PathInterpolator pathInterpolator = D1.i0.f2028e;
        int i9 = android.os.Build.VERSION.SDK_INT;
        D1.E0 e6 = this.f2008b;
        if (i9 >= 34) {
            p0Var = new D1.r0(e6);
        } else if (i9 >= 30) {
            p0Var = new D1.q0(e6);
        } else {
            p0Var = i9 >= 29 ? new D1.p0(e6) : new D1.n0(e6);
        }
        int i10 = 1;
        while (i10 <= 512) {
            int i11 = this.f2010d & i10;
            D1.z0 z0Var = e6.f1967a;
            if (i11 == 0) {
                p0Var.c(i10, z0Var.g(i10));
                i3 = 1;
            } else {
                p182w1.b bVarG = z0Var.g(i10);
                p182w1.b bVarG2 = this.f2009c.f1967a.g(i10);
                float f9 = 1.0f - fC;
                i3 = 1;
                p0Var.c(i10, D1.E0.a(bVarG, (int) (((double) ((bVarG.f29760a - bVarG2.f29760a) * f9)) + 0.5d), (int) (((double) ((bVarG.f29761b - bVarG2.f29761b) * f9)) + 0.5d), (int) (((double) ((bVarG.f29762c - bVarG2.f29762c) * f9)) + 0.5d), (int) (((double) ((bVarG.f29763d - bVarG2.f29763d) * f9)) + 0.5d)));
            }
            i10 <<= i3;
            fC = fC;
        }
        D1.i0.h(this.f2011e, p0Var.b(), java.util.Collections.singletonList(m0Var));
    }
}
