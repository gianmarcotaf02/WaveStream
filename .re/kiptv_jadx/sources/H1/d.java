package H1;

/* JADX INFO: loaded from: classes.dex */
public final class d implements android.view.View.OnTouchListener {
    public static final int y = android.view.ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H1.a f3849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.view.animation.AccelerateInterpolator f3850i;
    public final android.widget.ListView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public B3.r f3851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f3852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float[] f3853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f3856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f3857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f3858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p103m.C2581o0 f3864x;

    public d(p103m.C2581o0 c2581o0) {
        H1.a aVar = new H1.a();
        aVar.f3845e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f3846f = 0L;
        this.f3849h = aVar;
        this.f3850i = new android.view.animation.AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f3852l = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3853m = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f3856p = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f3857q = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f3858r = fArr5;
        this.j = c2581o0;
        float f9 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f9) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f9 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f3854n = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f3855o = y;
        aVar.f3841a = 500;
        aVar.f3842b = 500;
        this.f3864x = c2581o0;
    }

    public static float b(float f9, float f10, float f11) {
        if (f9 > f11) {
            return f11;
        }
        return f9 < f10 ? f10 : f9;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(int i3, float f9, float f10, float f11) {
        float fB;
        float interpolation;
        float fB2 = b(this.f3852l[i3] * f10, 0.0f, this.f3853m[i3]);
        float fC = c(f10 - f9, fB2) - c(f9, fB2);
        android.view.animation.AccelerateInterpolator accelerateInterpolator = this.f3850i;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f12 = this.f3856p[i3];
            float f13 = this.f3857q[i3];
            float f14 = this.f3858r[i3];
            float f15 = f12 * f11;
            return fB > 0.0f ? b(fB * f15, f13, f14) : -b((-fB) * f15, f13, f14);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f16 = this.f3856p[i3];
        float f17 = this.f3857q[i3];
        float f18 = this.f3858r[i3];
        float f19 = f16 * f11;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f9, float f10) {
        if (f10 != 0.0f) {
            int i3 = this.f3854n;
            if (i3 == 0 || i3 == 1) {
                if (f9 < f10) {
                    if (f9 >= 0.0f) {
                        return 1.0f - (f9 / f10);
                    }
                    if (this.f3862v && i3 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i3 == 2 && f9 < 0.0f) {
                return f9 / (-f10);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i3 = 0;
        if (this.f3860t) {
            this.f3862v = false;
            return;
        }
        H1.a aVar = this.f3849h;
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        int i9 = (int) (jCurrentAnimationTimeMillis - aVar.f3845e);
        int i10 = aVar.f3842b;
        if (i9 > i10) {
            i3 = i10;
        } else if (i9 >= 0) {
            i3 = i9;
        }
        aVar.f3848i = i3;
        aVar.f3847h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        p103m.C2581o0 c2581o0;
        int count;
        H1.a aVar = this.f3849h;
        float f9 = aVar.f3844d;
        int iAbs = (int) (f9 / java.lang.Math.abs(f9));
        java.lang.Math.abs(aVar.f3843c);
        if (iAbs != 0 && (count = (c2581o0 = this.f3864x).getCount()) != 0) {
            int childCount = c2581o0.getChildCount();
            int firstVisiblePosition = c2581o0.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c2581o0.getChildAt(0).getTop() >= 0)) : !(i3 >= count && c2581o0.getChildAt(childCount - 1).getBottom() <= c2581o0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int i3;
        if (this.f3863w) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f3861u = true;
            this.f3859s = false;
            float x9 = motionEvent.getX();
            float width = view.getWidth();
            android.widget.ListView listView = this.j;
            float fA = a(0, x9, width, listView.getWidth());
            float fA2 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            H1.a aVar = this.f3849h;
            aVar.f3843c = fA;
            aVar.f3844d = fA2;
            if (!this.f3862v && e()) {
                if (this.f3851k == null) {
                    this.f3851k = new B3.r(4, this);
                }
                this.f3862v = true;
                this.f3860t = true;
                if (this.f3859s || (i3 = this.f3855o) <= 0) {
                    this.f3851k.run();
                } else {
                    B3.r rVar = this.f3851k;
                    long j = i3;
                    java.util.WeakHashMap weakHashMap = D1.U.f1980a;
                    listView.postOnAnimationDelayed(rVar, j);
                }
                this.f3859s = true;
            }
        }
        return false;
    }
}
