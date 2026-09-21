package p095l;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f24698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p095l.l f24699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.view.View f24702e;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p095l.w f24704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p095l.t f24705i;
    public p095l.u j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24703f = 8388611;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p095l.u f24706k = new p095l.u(this);

    public v(int i3, android.content.Context context, android.view.View view, p095l.l lVar, boolean z6) {
        this.f24698a = context;
        this.f24699b = lVar;
        this.f24702e = view;
        this.f24700c = z6;
        this.f24701d = i3;
    }

    public final p095l.t a() {
        p095l.t c9;
        if (this.f24705i == null) {
            android.content.Context context = this.f24698a;
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            if (java.lang.Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(com.kiptv.tv.R.dimen.abc_cascading_menus_min_smallest_width)) {
                c9 = new p095l.f(context, this.f24702e, this.f24701d, this.f24700c);
            } else {
                android.view.View view = this.f24702e;
                android.content.Context context2 = this.f24698a;
                boolean z6 = this.f24700c;
                c9 = new p095l.C(this.f24701d, context2, view, this.f24699b, z6);
            }
            c9.l(this.f24699b);
            c9.r(this.f24706k);
            c9.n(this.f24702e);
            c9.g(this.f24704h);
            c9.o(this.g);
            c9.p(this.f24703f);
            this.f24705i = c9;
        }
        return this.f24705i;
    }

    public final boolean b() {
        p095l.t tVar = this.f24705i;
        return tVar != null && tVar.a();
    }

    public void c() {
        this.f24705i = null;
        p095l.u uVar = this.j;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    public final void d(int i3, int i9, boolean z6, boolean z9) {
        p095l.t tVarA = a();
        tVarA.s(z9);
        if (z6) {
            if ((android.view.Gravity.getAbsoluteGravity(this.f24703f, this.f24702e.getLayoutDirection()) & 7) == 5) {
                i3 -= this.f24702e.getWidth();
            }
            tVarA.q(i3);
            tVarA.t(i9);
            int i10 = (int) ((this.f24698a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            tVarA.f24696h = new android.graphics.Rect(i3 - i10, i9 - i10, i3 + i10, i9 + i10);
        }
        tVarA.e();
    }
}
