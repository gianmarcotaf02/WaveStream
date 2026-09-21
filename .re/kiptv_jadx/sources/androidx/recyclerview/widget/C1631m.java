package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1631m {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f17451C = {android.R.attr.state_pressed};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f17452D = new int[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f17453A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final androidx.recyclerview.widget.RunnableC1627i f17454B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f17457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f17458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17460f;
    public final android.graphics.drawable.StateListDrawable g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f17461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17462i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17463k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17464l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f17465m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17466n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17467o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f17468p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f17471s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final android.animation.ValueAnimator f17477z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17469q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17470r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17472t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17473u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17474v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17475w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f17476x = new int[2];
    public final int[] y = new int[2];

    public C1631m(androidx.recyclerview.widget.RecyclerView recyclerView, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i3, int i9, int i10) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f17477z = valueAnimatorOfFloat;
        this.f17453A = 0;
        androidx.recyclerview.widget.RunnableC1627i runnableC1627i = new androidx.recyclerview.widget.RunnableC1627i(0, this);
        this.f17454B = runnableC1627i;
        androidx.recyclerview.widget.C1628j c1628j = new androidx.recyclerview.widget.C1628j(this);
        this.f17457c = stateListDrawable;
        this.f17458d = drawable;
        this.g = stateListDrawable2;
        this.f17461h = drawable2;
        this.f17459e = java.lang.Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f17460f = java.lang.Math.max(i3, drawable.getIntrinsicWidth());
        this.f17462i = java.lang.Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.j = java.lang.Math.max(i3, drawable2.getIntrinsicWidth());
        this.f17455a = i9;
        this.f17456b = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new androidx.recyclerview.widget.C1629k(this));
        valueAnimatorOfFloat.addUpdateListener(new androidx.recyclerview.widget.C1630l(this));
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f17471s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            androidx.recyclerview.widget.I i11 = recyclerView2.f17314u;
            if (i11 != null) {
                i11.b("Cannot remove item decoration during a scroll  or layout");
            }
            java.util.ArrayList arrayList = recyclerView2.f17318w;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.K();
            recyclerView2.requestLayout();
            androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f17471s;
            recyclerView3.f17320x.remove(this);
            if (recyclerView3.y == this) {
                recyclerView3.y = null;
            }
            java.util.ArrayList arrayList2 = this.f17471s.f17303o0;
            if (arrayList2 != null) {
                arrayList2.remove(c1628j);
            }
            this.f17471s.removeCallbacks(runnableC1627i);
        }
        this.f17471s = recyclerView;
        androidx.recyclerview.widget.I i12 = recyclerView.f17314u;
        if (i12 != null) {
            i12.b("Cannot add item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList3 = recyclerView.f17318w;
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.K();
        recyclerView.requestLayout();
        this.f17471s.f17320x.add(this);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f17471s;
        if (recyclerView4.f17303o0 == null) {
            recyclerView4.f17303o0 = new java.util.ArrayList();
        }
        recyclerView4.f17303o0.add(c1628j);
    }

    public static int c(float f9, float f10, int[] iArr, int i3, int i9, int i10) {
        int i11 = iArr[1] - iArr[0];
        if (i11 != 0) {
            int i12 = i3 - i10;
            int i13 = (int) (((f10 - f9) / i11) * i12);
            int i14 = i9 + i13;
            if (i14 < i12 && i14 >= 0) {
                return i13;
            }
        }
        return 0;
    }

    public final boolean a(float f9, float f10) {
        if (f10 < this.f17470r - this.f17462i) {
            return false;
        }
        int i3 = this.f17467o;
        int i9 = this.f17466n;
        return f9 >= ((float) (i3 - (i9 / 2))) && f9 <= ((float) ((i9 / 2) + i3));
    }

    public final boolean b(float f9, float f10) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f17471s;
        java.util.WeakHashMap weakHashMap = D1.U.f1980a;
        boolean z6 = recyclerView.getLayoutDirection() == 1;
        int i3 = this.f17459e;
        if (!z6 ? f9 >= this.f17469q - i3 : f9 <= i3) {
            int i9 = this.f17464l;
            int i10 = this.f17463k / 2;
            if (f10 >= i9 - i10 && f10 <= i10 + i9) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i3) {
        androidx.recyclerview.widget.RunnableC1627i runnableC1627i = this.f17454B;
        android.graphics.drawable.StateListDrawable stateListDrawable = this.f17457c;
        if (i3 == 2 && this.f17474v != 2) {
            stateListDrawable.setState(f17451C);
            this.f17471s.removeCallbacks(runnableC1627i);
        }
        if (i3 == 0) {
            this.f17471s.invalidate();
        } else {
            e();
        }
        if (this.f17474v == 2 && i3 != 2) {
            stateListDrawable.setState(f17452D);
            this.f17471s.removeCallbacks(runnableC1627i);
            this.f17471s.postDelayed(runnableC1627i, 1200);
        } else if (i3 == 1) {
            this.f17471s.removeCallbacks(runnableC1627i);
            this.f17471s.postDelayed(runnableC1627i, 1500);
        }
        this.f17474v = i3;
    }

    public final void e() {
        int i3 = this.f17453A;
        android.animation.ValueAnimator valueAnimator = this.f17477z;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f17453A = 1;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
