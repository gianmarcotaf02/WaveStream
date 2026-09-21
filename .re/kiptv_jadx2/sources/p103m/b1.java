package p103m;

import D1.AbstractC0225j;
import D1.U;
import D1.V;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.media3.common.C;
import com.kiptv.tv.R;
import com.revenuecat.purchases.common.events.BackendEvent;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class b1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    public static b1 f25007r;

    public static b1 f25008s;

    public final View f25009h;

    public final CharSequence f25010i;
    public final int j;

    public final a1 f25011k;

    public final a1 f25012l;

    public int f25013m;

    public int f25014n;

    public c1 f25015o;

    public boolean f25016p;

    public boolean f25017q;

    public b1(View view, CharSequence charSequence) {
        final int i3 = 0;
        this.f25011k = new Runnable(this) {

            public final b1 f25004i;

            {
                this.f25004i = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f25004i.c(false);
                        break;
                    default:
                        this.f25004i.a();
                        break;
                }
            }
        };
        final int i9 = 1;
        this.f25012l = new Runnable(this) {

            public final b1 f25004i;

            {
                this.f25004i = this;
            }

            @Override
            public final void run() {
                switch (i9) {
                    case 0:
                        this.f25004i.c(false);
                        break;
                    default:
                        this.f25004i.a();
                        break;
                }
            }
        };
        this.f25009h = view;
        this.f25010i = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = V.f1985a;
        this.j = Build.VERSION.SDK_INT >= 28 ? AbstractC0225j.n(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f25017q = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(b1 b1Var) {
        b1 b1Var2 = f25007r;
        if (b1Var2 != null) {
            b1Var2.f25009h.removeCallbacks(b1Var2.f25011k);
        }
        f25007r = b1Var;
        if (b1Var != null) {
            b1Var.f25009h.postDelayed(b1Var.f25011k, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        b1 b1Var = f25008s;
        View view = this.f25009h;
        if (b1Var == this) {
            f25008s = null;
            c1 c1Var = this.f25015o;
            if (c1Var != null) {
                View view2 = (View) c1Var.f25019i;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) c1Var.f25018h).getSystemService("window")).removeView(view2);
                }
                this.f25015o = null;
                this.f25017q = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f25007r == this) {
            b(null);
        }
        view.removeCallbacks(this.f25012l);
    }

    public final void c(boolean z6) {
        int height;
        int i3;
        int i9;
        int i10;
        long longPressTimeout;
        long j;
        long j9;
        View view = this.f25009h;
        if (view.isAttachedToWindow()) {
            b(null);
            b1 b1Var = f25008s;
            if (b1Var != null) {
                b1Var.a();
            }
            f25008s = this;
            this.f25016p = z6;
            Context context = view.getContext();
            c1 c1Var = new c1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            c1Var.f25020k = layoutParams;
            c1Var.f25021l = new Rect();
            c1Var.f25022m = new int[2];
            c1Var.f25023n = new int[2];
            c1Var.f25018h = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            c1Var.f25019i = viewInflate;
            c1Var.j = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(c1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.f25015o = c1Var;
            int width = this.f25013m;
            int i11 = this.f25014n;
            boolean z9 = this.f25016p;
            View view2 = (View) c1Var.f25019i;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) c1Var.f25018h;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) c1Var.j).setText(this.f25010i);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) c1Var.f25020k;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i11 + dimensionPixelOffset2;
                i3 = i11 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z9 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i10 = 1;
            } else {
                Rect rect = (Rect) c1Var.f25021l;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i9 = 0;
                    i10 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i10 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i9 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) c1Var.f25023n;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) c1Var.f25022m;
                view.getLocationOnScreen(iArr2);
                int i12 = iArr2[i9] - iArr[i9];
                iArr2[i9] = i12;
                iArr2[i10] = iArr2[i10] - iArr[i10];
                layoutParams2.x = (i12 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, i9);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i13 = iArr2[i10];
                int i14 = ((i13 + i3) - dimensionPixelOffset3) - measuredHeight;
                int i15 = i13 + height + dimensionPixelOffset3;
                if (z9) {
                    if (i14 >= 0) {
                        layoutParams2.y = i14;
                    } else {
                        layoutParams2.y = i15;
                    }
                } else if (measuredHeight + i15 <= rect.height()) {
                    layoutParams2.y = i15;
                } else {
                    layoutParams2.y = i14;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f25016p) {
                j9 = 2500;
            } else {
                WeakHashMap weakHashMap = U.f1980a;
                if ((view.getWindowSystemUiVisibility() & 1) == i10) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j9 = j - longPressTimeout;
            }
            a1 a1Var = this.f25012l;
            view.removeCallbacks(a1Var);
            view.postDelayed(a1Var, j9);
        }
    }

    @Override
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f25015o == null || !this.f25016p) {
            View view2 = this.f25009h;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f25017q = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f25015o == null) {
                    int x9 = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.f25017q) {
                        this.f25013m = x9;
                        this.f25014n = y;
                        this.f25017q = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x9 - this.f25013m);
                        int i3 = this.j;
                        if (iAbs > i3 || Math.abs(y - this.f25014n) > i3) {
                            this.f25013m = x9;
                            this.f25014n = y;
                            this.f25017q = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f25013m = view.getWidth() / 2;
        this.f25014n = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
