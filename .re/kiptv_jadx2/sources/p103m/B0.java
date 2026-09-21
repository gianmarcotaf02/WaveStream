package p103m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.media3.common.util.Log;
import com.google.common.util.concurrent.AbstractC1903s;
import h.a;
import java.lang.reflect.Method;
import p095l.B;

public abstract class B0 implements B {

    public static final Method f24878G;
    public static final Method H;

    public final Handler f24880B;

    public Rect f24882D;

    public boolean f24883E;

    public final C2599y f24884F;

    public final Context f24885h;

    public ListAdapter f24886i;
    public C2581o0 j;

    public int f24889m;

    public int f24890n;

    public boolean f24892p;

    public boolean f24893q;

    public boolean f24894r;

    public C2600y0 f24897u;

    public View f24898v;

    public AdapterView.OnItemClickListener f24899w;

    public final int f24887k = -2;

    public int f24888l = -2;

    public final int f24891o = 1002;

    public int f24895s = 0;

    public final int f24896t = Log.LOG_LEVEL_OFF;

    public final RunnableC2598x0 f24900x = new RunnableC2598x0(this, 1);
    public final A0 y = new A0(this);

    public final C2602z0 f24901z = new C2602z0(this);

    public final RunnableC2598x0 f24879A = new RunnableC2598x0(this, 0);

    public final Rect f24881C = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f24878G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                android.util.Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                android.util.Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public B0(Context context, AttributeSet attributeSet, int i3) {
        int resourceId;
        this.f24885h = context;
        this.f24880B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f22417o, i3, 0);
        this.f24889m = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f24890n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f24892p = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2599y c2599y = new C2599y(context, attributeSet, i3, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f22421s, i3, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c2599y.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c2599y.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC1903s.y(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f24884F = c2599y;
        c2599y.setInputMethodMode(1);
    }

    @Override
    public final boolean a() {
        return this.f24884F.isShowing();
    }

    public final int b() {
        return this.f24889m;
    }

    public final void c(int i3) {
        this.f24889m = i3;
    }

    @Override
    public final void dismiss() {
        C2599y c2599y = this.f24884F;
        c2599y.dismiss();
        c2599y.setContentView(null);
        this.j = null;
        this.f24880B.removeCallbacks(this.f24900x);
    }

    @Override
    public final void e() {
        int i3;
        int iMakeMeasureSpec;
        int paddingBottom;
        C2581o0 c2581o0;
        C2581o0 c2581o1 = this.j;
        C2599y c2599y = this.f24884F;
        Context context = this.f24885h;
        if (c2581o1 == null) {
            C2581o0 c2581o0P = p(context, !this.f24883E);
            this.j = c2581o0P;
            c2581o0P.setAdapter(this.f24886i);
            this.j.setOnItemClickListener(this.f24899w);
            this.j.setFocusable(true);
            this.j.setFocusableInTouchMode(true);
            this.j.setOnItemSelectedListener(new C2592u0(this));
            this.j.setOnScrollListener(this.f24901z);
            c2599y.setContentView(this.j);
        }
        Drawable background = c2599y.getBackground();
        Rect rect = this.f24881C;
        if (background != null) {
            background.getPadding(rect);
            int i9 = rect.top;
            i3 = rect.bottom + i9;
            if (!this.f24892p) {
                this.f24890n = -i9;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int iA = AbstractC2594v0.a(c2599y, this.f24898v, this.f24890n, c2599y.getInputMethodMode() == 2);
        int i10 = this.f24887k;
        if (i10 == -1) {
            paddingBottom = iA + i3;
        } else {
            int i11 = this.f24888l;
            if (i11 != -2) {
                iMakeMeasureSpec = i11 != -1 ? View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA2 = this.j.a(iMakeMeasureSpec, iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.j.getPaddingBottom() + this.j.getPaddingTop() + i3 : 0);
        }
        boolean z6 = this.f24884F.getInputMethodMode() == 2;
        c2599y.setWindowLayoutType(this.f24891o);
        if (c2599y.isShowing()) {
            if (this.f24898v.isAttachedToWindow()) {
                int width = this.f24888l;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f24898v.getWidth();
                }
                if (i10 == -1) {
                    i10 = z6 ? paddingBottom : -1;
                    if (z6) {
                        c2599y.setWidth(this.f24888l == -1 ? -1 : 0);
                        c2599y.setHeight(0);
                    } else {
                        c2599y.setWidth(this.f24888l == -1 ? -1 : 0);
                        c2599y.setHeight(-1);
                    }
                } else if (i10 == -2) {
                    i10 = paddingBottom;
                }
                c2599y.setOutsideTouchable(true);
                View view = this.f24898v;
                int i12 = this.f24889m;
                int i13 = this.f24890n;
                if (width < 0) {
                    width = -1;
                }
                c2599y.update(view, i12, i13, width, i10 < 0 ? -1 : i10);
                return;
            }
            return;
        }
        int width2 = this.f24888l;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f24898v.getWidth();
        }
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = paddingBottom;
        }
        c2599y.setWidth(width2);
        c2599y.setHeight(i10);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f24878G;
            if (method != null) {
                try {
                    method.invoke(c2599y, Boolean.TRUE);
                } catch (Exception unused) {
                    android.util.Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC2596w0.b(c2599y, true);
        }
        c2599y.setOutsideTouchable(true);
        c2599y.setTouchInterceptor(this.y);
        if (this.f24894r) {
            c2599y.setOverlapAnchor(this.f24893q);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = H;
            if (method2 != null) {
                try {
                    method2.invoke(c2599y, this.f24882D);
                } catch (Exception e6) {
                    android.util.Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            AbstractC2596w0.a(c2599y, this.f24882D);
        }
        c2599y.showAsDropDown(this.f24898v, this.f24889m, this.f24890n, this.f24895s);
        this.j.setSelection(-1);
        if ((!this.f24883E || this.j.isInTouchMode()) && (c2581o0 = this.j) != null) {
            c2581o0.setListSelectionHidden(true);
            c2581o0.requestLayout();
        }
        if (this.f24883E) {
            return;
        }
        this.f24880B.post(this.f24879A);
    }

    public final Drawable f() {
        return this.f24884F.getBackground();
    }

    @Override
    public final C2581o0 h() {
        return this.j;
    }

    public final void j(Drawable drawable) {
        this.f24884F.setBackgroundDrawable(drawable);
    }

    public final void k(int i3) {
        this.f24890n = i3;
        this.f24892p = true;
    }

    public final int n() {
        if (this.f24892p) {
            return this.f24890n;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        C2600y0 c2600y0 = this.f24897u;
        if (c2600y0 == null) {
            this.f24897u = new C2600y0(this);
        } else {
            ListAdapter listAdapter2 = this.f24886i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2600y0);
            }
        }
        this.f24886i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f24897u);
        }
        C2581o0 c2581o0 = this.j;
        if (c2581o0 != null) {
            c2581o0.setAdapter(this.f24886i);
        }
    }

    public C2581o0 p(Context context, boolean z6) {
        return new C2581o0(context, z6);
    }

    public final void q(int i3) {
        Drawable background = this.f24884F.getBackground();
        if (background == null) {
            this.f24888l = i3;
            return;
        }
        Rect rect = this.f24881C;
        background.getPadding(rect);
        this.f24888l = rect.left + rect.right + i3;
    }
}
