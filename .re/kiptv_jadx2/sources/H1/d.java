package H1;

import B3.r;
import D1.U;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import p103m.C2581o0;

public final class d implements View.OnTouchListener {
    public static final int y = ViewConfiguration.getTapTimeout();

    public final a f3849h;

    public final AccelerateInterpolator f3850i;
    public final ListView j;

    public r f3851k;

    public final float[] f3852l;

    public final float[] f3853m;

    public final int f3854n;

    public final int f3855o;

    public final float[] f3856p;

    public final float[] f3857q;

    public final float[] f3858r;

    public boolean f3859s;

    public boolean f3860t;

    public boolean f3861u;

    public boolean f3862v;

    public boolean f3863w;

    public final C2581o0 f3864x;

    public d(C2581o0 c2581o0) {
        a aVar = new a();
        aVar.f3845e = Long.MIN_VALUE;
        aVar.g = -1L;
        aVar.f3846f = 0L;
        this.f3849h = aVar;
        this.f3850i = new AccelerateInterpolator();
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
        float f9 = Resources.getSystem().getDisplayMetrics().density;
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

    public final float a(int i3, float f9, float f10, float f11) {
        float fB;
        float interpolation;
        float fB2 = b(this.f3852l[i3] * f10, 0.0f, this.f3853m[i3]);
        float fC = c(f10 - f9, fB2) - c(f9, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f3850i;
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
        a aVar = this.f3849h;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
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
        C2581o0 c2581o0;
        int count;
        a aVar = this.f3849h;
        float f9 = aVar.f3844d;
        int iAbs = (int) (f9 / Math.abs(f9));
        Math.abs(aVar.f3843c);
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

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
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
            ListView listView = this.j;
            float fA = a(0, x9, width, listView.getWidth());
            float fA2 = a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            a aVar = this.f3849h;
            aVar.f3843c = fA;
            aVar.f3844d = fA2;
            if (!this.f3862v && e()) {
                if (this.f3851k == null) {
                    this.f3851k = new r(4, this);
                }
                this.f3862v = true;
                this.f3860t = true;
                if (this.f3859s || (i3 = this.f3855o) <= 0) {
                    this.f3851k.run();
                } else {
                    r rVar = this.f3851k;
                    long j = i3;
                    WeakHashMap weakHashMap = U.f1980a;
                    listView.postOnAnimationDelayed(rVar, j);
                }
                this.f3859s = true;
            }
        }
        return false;
    }
}
