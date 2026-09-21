package p146r1;

import A0.o;
import D1.AbstractC0226k;
import I3.b;
import O7.r;
import Y1.v;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.X;
import com.google.common.util.concurrent.AbstractC1903s;
import com.kiptv.tv.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p019c.l;
import p019c.u;
import p113n1.c;
import p113n1.n;

public final class y extends l {

    public Function0 f26789k;

    public x f26790l;

    public final View f26791m;

    public final w f26792n;

    public boolean f26793o;

    public y(Function0 function0, x xVar, View view, n nVar, c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), xVar.f26787e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f26789k = function0;
        this.f26790l = xVar;
        this.f26791m = view;
        float f9 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        boolean z6 = this.f26790l.f26787e;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            AbstractC0226k.e(window, z6);
        } else if (i3 >= 30) {
            AbstractC0226k.d(window, z6);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
        window.setGravity(17);
        if (!this.f26790l.f26787e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (i3 >= 28) {
                r.f26771a.a(attributes);
            }
            if (i3 >= 30) {
                s sVar = s.f26772a;
                sVar.b(attributes, 0);
                sVar.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        w wVar = new w(getContext(), window);
        setTitle(this.f26790l.f26788f);
        wVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        wVar.setClipChildren(false);
        wVar.setElevation(cVar.Y(f9));
        wVar.setOutlineProvider(new o(2));
        this.f26792n = wVar;
        View decorView2 = window.getDecorView();
        ViewGroup viewGroup = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(wVar);
        X.i(wVar, X.d(view));
        wVar.setTag(R.id.view_tree_view_model_store_owner, X.e(view));
        AbstractC1903s.H(wVar, AbstractC1903s.v(view));
        e(this.f26789k, this.f26790l, nVar);
        u uVar = this.j;
        C2679b c2679b = new C2679b(this, 1);
        m.e(uVar, "<this>");
        uVar.a(this, new v(c2679b));
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof w) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(Function0 function0, x xVar, n nVar) {
        int i3;
        this.f26789k = function0;
        this.f26790l = xVar;
        G g = xVar.f26785c;
        boolean zC = p.c(this.f26791m);
        int iOrdinal = g.ordinal();
        int i9 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC = true;
            } else {
                if (iOrdinal != 2) {
                    throw new b();
                }
                zC = false;
            }
        }
        Window window = getWindow();
        m.b(window);
        window.setFlags(zC ? 8192 : -8193, 8192);
        int iOrdinal2 = nVar.ordinal();
        if (iOrdinal2 == 0) {
            i3 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new b();
            }
            i3 = 1;
        }
        w wVar = this.f26792n;
        wVar.setLayoutDirection(i3);
        boolean z6 = wVar.f26781t;
        boolean z9 = xVar.f26787e;
        boolean z10 = xVar.f26786d;
        boolean z11 = (z6 && z10 == wVar.f26779r && z9 == wVar.f26780s) ? false : true;
        wVar.f26779r = z10;
        wVar.f26780s = z9;
        if (z11) {
            Window window2 = wVar.f26777p;
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i10 = z10 ? -2 : -1;
            if (i10 != attributes.width || !wVar.f26781t) {
                window2.setLayout(i10, -2);
                wVar.f26781t = true;
            }
        }
        setCanceledOnTouchOutside(xVar.f26784b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z9) {
                i9 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i9);
        }
    }

    @Override
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (!this.f26790l.f26783a || !keyEvent.isTracking() || keyEvent.isCanceled() || i3 != 111) {
            return super.onKeyUp(i3, keyEvent);
        }
        this.f26789k.invoke();
        return true;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iQ;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f26790l.f26784b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.f26793o = false;
            return zOnTouchEvent;
        }
        w wVar = this.f26792n;
        wVar.getClass();
        float x9 = motionEvent.getX();
        if (!Float.isInfinite(x9) && !Float.isNaN(x9)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = wVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + wVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + wVar.getTop();
                int height = childAt.getHeight() + top;
                int iQ2 = r.Q(motionEvent.getX());
                if (left <= iQ2 && iQ2 <= width && top <= (iQ = r.Q(motionEvent.getY())) && iQ <= height) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                        this.f26793o = false;
                        return zOnTouchEvent;
                    }
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f26793o = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.f26793o = false;
                return zOnTouchEvent;
            }
        } else if (this.f26793o) {
            this.f26789k.invoke();
            this.f26793o = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override
    public final void cancel() {
    }
}
