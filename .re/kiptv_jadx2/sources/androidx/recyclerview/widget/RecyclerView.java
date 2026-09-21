package androidx.recyclerview.widget;

import D1.AbstractC0229n;
import D1.C0230o;
import Q0.w0;
import R0.S0;
import U.C0948v;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.media3.common.util.Log;
import androidx.media3.extractor.ts.TsExtractor;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class RecyclerView extends ViewGroup implements ScrollingView {

    public static final int[] f17250F0 = {R.attr.nestedScrollingEnabled};

    public static final float f17251G0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    public static final boolean f17252H0 = true;

    public static final boolean f17253I0 = true;

    public static final boolean f17254J0 = true;

    public static final Class[] f17255K0;

    public static final InterpolatorC1641x f17256L0;
    public static final U M0;

    public boolean f17257A;

    public final RunnableC1640w f17258A0;

    public boolean f17259B;

    public boolean f17260B0;

    public int f17261C;

    public int f17262C0;

    public boolean f17263D;

    public int f17264D0;

    public boolean f17265E;

    public final C1642y f17266E0;

    public boolean f17267F;

    public int f17268G;
    public boolean H;

    public final AccessibilityManager f17269I;

    public boolean f17270J;

    public boolean f17271K;

    public int f17272L;

    public int f17273M;

    public E f17274N;

    public EdgeEffect f17275O;

    public EdgeEffect f17276P;

    public EdgeEffect f17277Q;

    public EdgeEffect f17278R;

    public F f17279S;

    public int f17280T;

    public int f17281U;
    public VelocityTracker V;
    public int W;

    public int f17282a0;

    public int f17283b0;

    public int f17284c0;

    public int f17285d0;

    public final int f17286e0;

    public final int f17287f0;

    public final float f17288g0;

    public final float f17289h;

    public final float f17290h0;

    public final Q f17291i;

    public boolean f17292i0;
    public final O j;

    public final W f17293j0;

    public S f17294k;

    public RunnableC1633o f17295k0;

    public final w0 f17296l;

    public final C0948v f17297l0;

    public final android.support.v4.media.session.q f17298m;

    public final T f17299m0;

    public final S2.a f17300n;

    public L f17301n0;

    public boolean f17302o;

    public ArrayList f17303o0;

    public final RunnableC1640w f17304p;

    public boolean f17305p0;

    public final Rect f17306q;

    public boolean f17307q0;

    public final Rect f17308r;

    public final C1642y f17309r0;

    public final RectF f17310s;

    public boolean f17311s0;

    public A f17312t;

    public Z f17313t0;

    public I f17314u;

    public final int[] f17315u0;

    public final ArrayList f17316v;

    public C0230o f17317v0;

    public final ArrayList f17318w;

    public final int[] f17319w0;

    public final ArrayList f17320x;

    public final int[] f17321x0;
    public C1631m y;

    public final int[] f17322y0;

    public boolean f17323z;

    public final ArrayList f17324z0;

    static {
        Class cls = Integer.TYPE;
        f17255K0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f17256L0 = new InterpolatorC1641x();
        M0 = new U();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        float fA;
        char c9;
        int i3;
        int i9;
        Constructor constructor;
        super(context, attributeSet, com.kiptv.tv.R.attr.recyclerViewStyle);
        int i10 = 1;
        int i11 = 2;
        this.f17291i = new Q(this);
        this.j = new O(this);
        this.f17300n = new S2.a(16);
        this.f17304p = new RunnableC1640w(this, 0);
        this.f17306q = new Rect();
        this.f17308r = new Rect();
        this.f17310s = new RectF();
        this.f17316v = new ArrayList();
        this.f17318w = new ArrayList();
        this.f17320x = new ArrayList();
        this.f17261C = 0;
        this.f17270J = false;
        this.f17271K = false;
        this.f17272L = 0;
        this.f17273M = 0;
        this.f17274N = M0;
        C1626h c1626h = new C1626h();
        Object[] objArr = null;
        c1626h.f17186a = null;
        c1626h.f17187b = new ArrayList();
        c1626h.f17188c = 120L;
        c1626h.f17189d = 120L;
        c1626h.f17190e = 250L;
        c1626h.f17191f = 250L;
        c1626h.g = true;
        c1626h.f17431h = new ArrayList();
        c1626h.f17432i = new ArrayList();
        c1626h.j = new ArrayList();
        c1626h.f17433k = new ArrayList();
        c1626h.f17434l = new ArrayList();
        c1626h.f17435m = new ArrayList();
        c1626h.f17436n = new ArrayList();
        c1626h.f17437o = new ArrayList();
        c1626h.f17438p = new ArrayList();
        c1626h.f17439q = new ArrayList();
        c1626h.f17440r = new ArrayList();
        this.f17279S = c1626h;
        this.f17280T = 0;
        this.f17281U = -1;
        this.f17288g0 = Float.MIN_VALUE;
        this.f17290h0 = Float.MIN_VALUE;
        this.f17292i0 = true;
        this.f17293j0 = new W(this);
        this.f17297l0 = f17254J0 ? new C0948v(i11) : null;
        T t9 = new T();
        t9.f17345a = 0;
        t9.f17346b = 0;
        t9.f17347c = 1;
        t9.f17348d = 0;
        t9.f17349e = false;
        t9.f17350f = false;
        t9.g = false;
        t9.f17351h = false;
        t9.f17352i = false;
        t9.j = false;
        this.f17299m0 = t9;
        this.f17305p0 = false;
        this.f17307q0 = false;
        C1642y c1642y = new C1642y(this);
        this.f17309r0 = c1642y;
        this.f17311s0 = false;
        this.f17315u0 = new int[2];
        this.f17319w0 = new int[2];
        this.f17321x0 = new int[2];
        this.f17322y0 = new int[2];
        this.f17324z0 = new ArrayList();
        this.f17258A0 = new RunnableC1640w(this, i10);
        this.f17262C0 = 0;
        this.f17264D0 = 0;
        this.f17266E0 = new C1642y(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f17285d0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = D1.V.f1985a;
            fA = AbstractC0229n.g(viewConfiguration);
        } else {
            fA = D1.V.a(viewConfiguration, context);
        }
        this.f17288g0 = fA;
        this.f17290h0 = i12 >= 26 ? AbstractC0229n.h(viewConfiguration) : D1.V.a(viewConfiguration, context);
        this.f17286e0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f17287f0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f17289h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f17279S.f17186a = c1642y;
        C1642y c1642y2 = new C1642y(this);
        w0 w0Var = new w0();
        w0Var.f8483b = new Y2.L(30);
        w0Var.f8484c = new ArrayList();
        w0Var.f8485d = new ArrayList();
        w0Var.f8482a = 0;
        w0Var.f8486e = c1642y2;
        w0Var.f8487f = new G(2, w0Var);
        this.f17296l = w0Var;
        this.f17298m = new android.support.v4.media.session.q(new C1642y(this));
        WeakHashMap weakHashMap = D1.U.f1980a;
        if ((i12 >= 26 ? D1.N.a(this) : 0) == 0 && i12 >= 26) {
            D1.N.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f17269I = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new Z(this));
        int[] iArr = p156s2.a.f27253a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.kiptv.tv.R.attr.recyclerViewStyle, 0);
        D1.U.i(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.kiptv.tv.R.attr.recyclerViewStyle);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f17302o = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + w());
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.fastscroll_default_thickness);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.kiptv.tv.R.dimen.fastscroll_minimum_range);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.kiptv.tv.R.dimen.fastscroll_margin);
            i9 = 4;
            c9 = 3;
            i3 = com.kiptv.tv.R.attr.recyclerViewStyle;
            new C1631m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            c9 = 3;
            i3 = com.kiptv.tv.R.attr.recyclerViewStyle;
            i9 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(I.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f17255K0);
                        Object[] objArr2 = new Object[i9];
                        objArr2[0] = context;
                        objArr2[1] = attributeSet;
                        objArr2[2] = Integer.valueOf(i3);
                        objArr2[c9] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e6) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e9) {
                            e9.initCause(e6);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e9);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((I) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                }
            }
        }
        int[] iArr2 = f17250F0;
        int i13 = i3;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i13, 0);
        D1.U.i(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i13);
        boolean z6 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z6);
        setTag(com.kiptv.tv.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView B(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView recyclerViewB = B(viewGroup.getChildAt(i3));
            if (recyclerViewB != null) {
                return recyclerViewB;
            }
        }
        return null;
    }

    public static X G(View view) {
        if (view == null) {
            return null;
        }
        return ((J) view.getLayoutParams()).f17217a;
    }

    public static void g(X x9) {
        WeakReference<RecyclerView> weakReference = x9.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == x9.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            x9.mNestedRecyclerView = null;
        }
    }

    private C0230o getScrollingChildHelper() {
        if (this.f17317v0 == null) {
            this.f17317v0 = new C0230o(this);
        }
        return this.f17317v0;
    }

    public static int j(int i3, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i9) {
        if (i3 > 0 && edgeEffect != null && E8.d.P(edgeEffect) != 0.0f) {
            int iRound = Math.round(E8.d.U(edgeEffect, ((-i3) * 4.0f) / i9, 0.5f) * ((-i9) / 4.0f));
            if (iRound != i3) {
                edgeEffect.finish();
            }
            return i3 - iRound;
        }
        if (i3 >= 0 || edgeEffect2 == null || E8.d.P(edgeEffect2) == 0.0f) {
            return i3;
        }
        float f9 = i9;
        int iRound2 = Math.round(E8.d.U(edgeEffect2, (i3 * 4.0f) / f9, 0.5f) * (f9 / 4.0f));
        if (iRound2 != i3) {
            edgeEffect2.finish();
        }
        return i3 - iRound2;
    }

    public final void A(int[] iArr) {
        int iT = this.f17298m.t();
        if (iT == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = Log.LOG_LEVEL_OFF;
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < iT; i10++) {
            X xG = G(this.f17298m.s(i10));
            if (!xG.shouldIgnore()) {
                int layoutPosition = xG.getLayoutPosition();
                if (layoutPosition < i3) {
                    i3 = layoutPosition;
                }
                if (layoutPosition > i9) {
                    i9 = layoutPosition;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i9;
    }

    public final X C(int i3) {
        X x9 = null;
        if (this.f17270J) {
            return null;
        }
        int iB = this.f17298m.B();
        for (int i9 = 0; i9 < iB; i9++) {
            X xG = G(this.f17298m.A(i9));
            if (xG != null && !xG.isRemoved() && D(xG) == i3) {
                android.support.v4.media.session.q qVar = this.f17298m;
                if (!((ArrayList) qVar.f15618k).contains(xG.itemView)) {
                    return xG;
                }
                x9 = xG;
            }
        }
        return x9;
    }

    public final int D(X x9) {
        if (x9.hasAnyOfTheFlags(524) || !x9.isBound()) {
            return -1;
        }
        w0 w0Var = this.f17296l;
        int i3 = x9.mPosition;
        ArrayList arrayList = (ArrayList) w0Var.f8484c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1619a c1619a = (C1619a) arrayList.get(i9);
            int i10 = c1619a.f17366a;
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = c1619a.f17367b;
                    if (i11 <= i3) {
                        int i12 = c1619a.f17369d;
                        if (i11 + i12 > i3) {
                            return -1;
                        }
                        i3 -= i12;
                    } else {
                        continue;
                    }
                } else if (i10 == 8) {
                    int i13 = c1619a.f17367b;
                    if (i13 == i3) {
                        i3 = c1619a.f17369d;
                    } else {
                        if (i13 < i3) {
                            i3--;
                        }
                        if (c1619a.f17369d <= i3) {
                            i3++;
                        }
                    }
                }
            } else if (c1619a.f17367b <= i3) {
                i3 += c1619a.f17369d;
            }
        }
        return i3;
    }

    public final long E(X x9) {
        return this.f17312t.hasStableIds() ? x9.getItemId() : x9.mPosition;
    }

    public final X F(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return G(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect H(View view) {
        J j = (J) view.getLayoutParams();
        boolean z6 = j.f17219c;
        Rect rect = j.f17218b;
        if (!z6 || (this.f17299m0.f17350f && (j.f17217a.isUpdated() || j.f17217a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f17318w;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Rect rect2 = this.f17306q;
            rect2.set(0, 0, 0, 0);
            ((C1631m) arrayList.get(i3)).getClass();
            ((J) view.getLayoutParams()).f17217a.getLayoutPosition();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        j.f17219c = false;
        return rect;
    }

    public final boolean I() {
        return !this.f17259B || this.f17270J || this.f17296l.j();
    }

    public final boolean J() {
        return this.f17272L > 0;
    }

    public final void K() {
        int iB = this.f17298m.B();
        for (int i3 = 0; i3 < iB; i3++) {
            ((J) this.f17298m.A(i3).getLayoutParams()).f17219c = true;
        }
        ArrayList arrayList = this.j.f17244c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            J j = (J) ((X) arrayList.get(i9)).itemView.getLayoutParams();
            if (j != null) {
                j.f17219c = true;
            }
        }
    }

    public final void L(int i3, int i9, boolean z6) {
        int i10 = i3 + i9;
        int iB = this.f17298m.B();
        for (int i11 = 0; i11 < iB; i11++) {
            X xG = G(this.f17298m.A(i11));
            if (xG != null && !xG.shouldIgnore()) {
                int i12 = xG.mPosition;
                T t9 = this.f17299m0;
                if (i12 >= i10) {
                    xG.offsetPosition(-i9, z6);
                    t9.f17349e = true;
                } else if (i12 >= i3) {
                    xG.flagRemovedAndOffsetPosition(i3 - 1, -i9, z6);
                    t9.f17349e = true;
                }
            }
        }
        O o8 = this.j;
        ArrayList arrayList = o8.f17244c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            X x9 = (X) arrayList.get(size);
            if (x9 != null) {
                int i13 = x9.mPosition;
                if (i13 >= i10) {
                    x9.offsetPosition(-i9, z6);
                } else if (i13 >= i3) {
                    x9.addFlags(8);
                    o8.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void M() {
        this.f17272L++;
    }

    public final void N(boolean z6) {
        int i3;
        AccessibilityManager accessibilityManager;
        int i9 = this.f17272L - 1;
        this.f17272L = i9;
        if (i9 < 1) {
            this.f17272L = 0;
            if (z6) {
                int i10 = this.f17268G;
                this.f17268G = 0;
                if (i10 != 0 && (accessibilityManager = this.f17269I) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i10);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f17324z0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    X x9 = (X) arrayList.get(size);
                    if (x9.itemView.getParent() == this && !x9.shouldIgnore() && (i3 = x9.mPendingAccessibilityState) != -1) {
                        View view = x9.itemView;
                        WeakHashMap weakHashMap = D1.U.f1980a;
                        view.setImportantForAccessibility(i3);
                        x9.mPendingAccessibilityState = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void O(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f17281U) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f17281U = motionEvent.getPointerId(i3);
            int x9 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f17283b0 = x9;
            this.W = x9;
            int y = (int) (motionEvent.getY(i3) + 0.5f);
            this.f17284c0 = y;
            this.f17282a0 = y;
        }
    }

    public final void P() {
        if (this.f17311s0 || !this.f17323z) {
            return;
        }
        WeakHashMap weakHashMap = D1.U.f1980a;
        postOnAnimation(this.f17258A0);
        this.f17311s0 = true;
    }

    public final void Q() {
        boolean z6;
        boolean z9 = false;
        if (this.f17270J) {
            w0 w0Var = this.f17296l;
            w0Var.r((ArrayList) w0Var.f8484c);
            w0Var.r((ArrayList) w0Var.f8485d);
            w0Var.f8482a = 0;
            if (this.f17271K) {
                this.f17314u.T();
            }
        }
        if (this.f17279S == null || !this.f17314u.s0()) {
            this.f17296l.d();
        } else {
            this.f17296l.q();
        }
        boolean z10 = this.f17305p0 || this.f17307q0;
        boolean z11 = this.f17259B && this.f17279S != null && ((z6 = this.f17270J) || z10 || this.f17314u.f17209e) && (!z6 || this.f17312t.hasStableIds());
        T t9 = this.f17299m0;
        t9.f17352i = z11;
        if (z11 && z10 && !this.f17270J && this.f17279S != null && this.f17314u.s0()) {
            z9 = true;
        }
        t9.j = z9;
    }

    public final void R(boolean z6) {
        this.f17271K = z6 | this.f17271K;
        this.f17270J = true;
        int iB = this.f17298m.B();
        for (int i3 = 0; i3 < iB; i3++) {
            X xG = G(this.f17298m.A(i3));
            if (xG != null && !xG.shouldIgnore()) {
                xG.addFlags(6);
            }
        }
        K();
        O o8 = this.j;
        ArrayList arrayList = o8.f17244c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            X x9 = (X) arrayList.get(i9);
            if (x9 != null) {
                x9.addFlags(6);
                x9.addChangePayload(null);
            }
        }
        A a2 = o8.f17248h.f17312t;
        if (a2 == null || !a2.hasStableIds()) {
            o8.f();
        }
    }

    public final void S(X x9, D1.r rVar) {
        x9.setFlags(0, 8192);
        boolean z6 = this.f17299m0.g;
        S2.a aVar = this.f17300n;
        if (z6 && x9.isUpdated() && !x9.isRemoved() && !x9.shouldIgnore()) {
            ((p136q.r) aVar.j).d(E(x9), x9);
        }
        p136q.S s9 = (p136q.S) aVar.f9211i;
        h0 h0VarA = (h0) s9.get(x9);
        if (h0VarA == null) {
            h0VarA = h0.a();
            s9.put(x9, h0VarA);
        }
        h0VarA.f17443b = rVar;
        h0VarA.f17442a |= 4;
    }

    public final int T(float f9, int i3) {
        float height = f9 / getHeight();
        float width = i3 / getWidth();
        EdgeEffect edgeEffect = this.f17275O;
        float f10 = 0.0f;
        if (edgeEffect == null || E8.d.P(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f17277Q;
            if (edgeEffect2 != null && E8.d.P(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f17277Q.onRelease();
                } else {
                    float fU = E8.d.U(this.f17277Q, width, height);
                    if (E8.d.P(this.f17277Q) == 0.0f) {
                        this.f17277Q.onRelease();
                    }
                    f10 = fU;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f17275O.onRelease();
            } else {
                float f11 = -E8.d.U(this.f17275O, -width, 1.0f - height);
                if (E8.d.P(this.f17275O) == 0.0f) {
                    this.f17275O.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getWidth());
    }

    public final int U(float f9, int i3) {
        float width = f9 / getWidth();
        float height = i3 / getHeight();
        EdgeEffect edgeEffect = this.f17276P;
        float f10 = 0.0f;
        if (edgeEffect == null || E8.d.P(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f17278R;
            if (edgeEffect2 != null && E8.d.P(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f17278R.onRelease();
                } else {
                    float fU = E8.d.U(this.f17278R, height, 1.0f - width);
                    if (E8.d.P(this.f17278R) == 0.0f) {
                        this.f17278R.onRelease();
                    }
                    f10 = fU;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f17276P.onRelease();
            } else {
                float f11 = -E8.d.U(this.f17276P, -height, width);
                if (E8.d.P(this.f17276P) == 0.0f) {
                    this.f17276P.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        }
        return Math.round(f10 * getHeight());
    }

    public final void V(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f17306q;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof J) {
            J j = (J) layoutParams;
            if (!j.f17219c) {
                int i3 = rect.left;
                Rect rect2 = j.f17218b;
                rect.left = i3 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f17314u.g0(this, view, this.f17306q, !this.f17259B, view2 == null);
    }

    public final void W() {
        VelocityTracker velocityTracker = this.V;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        d0(0);
        EdgeEffect edgeEffect = this.f17275O;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f17275O.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f17276P;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f17276P.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17277Q;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f17277Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17278R;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f17278R.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = D1.U.f1980a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean X(int i3, int i9, MotionEvent motionEvent, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z6;
        boolean z9;
        k();
        A a2 = this.f17312t;
        int[] iArr = this.f17322y0;
        if (a2 != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            Y(i3, i9, iArr);
            i11 = iArr[0];
            i12 = iArr[1];
            i13 = i3 - i11;
            i14 = i9 - i12;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (!this.f17318w.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        q(i11, i12, i13, i14, this.f17319w0, i10, iArr);
        int i15 = iArr[0];
        int i16 = i13 - i15;
        int i17 = iArr[1];
        int i18 = i14 - i17;
        boolean z10 = (i15 == 0 && i17 == 0) ? false : true;
        int i19 = this.f17283b0;
        int[] iArr2 = this.f17319w0;
        int i20 = iArr2[0];
        this.f17283b0 = i19 - i20;
        int i21 = this.f17284c0;
        int i22 = iArr2[1];
        this.f17284c0 = i21 - i22;
        int[] iArr3 = this.f17321x0;
        iArr3[0] = iArr3[0] + i20;
        iArr3[1] = iArr3[1] + i22;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z6 = true;
            } else {
                float x9 = motionEvent.getX();
                float f9 = i16;
                float y = motionEvent.getY();
                float f10 = i18;
                if (f9 < 0.0f) {
                    t();
                    z6 = true;
                    E8.d.U(this.f17275O, (-f9) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z6 = true;
                    if (f9 > 0.0f) {
                        u();
                        E8.d.U(this.f17277Q, f9 / getWidth(), y / getHeight());
                    } else {
                        z9 = false;
                    }
                    if (f10 < 0.0f) {
                        v();
                        E8.d.U(this.f17276P, (-f10) / getHeight(), x9 / getWidth());
                    } else if (f10 > 0.0f) {
                        s();
                        E8.d.U(this.f17278R, f10 / getHeight(), 1.0f - (x9 / getWidth()));
                    } else if (z9 || f9 != 0.0f || f10 != 0.0f) {
                        WeakHashMap weakHashMap = D1.U.f1980a;
                        postInvalidateOnAnimation();
                    }
                    z9 = z6;
                    if (z9) {
                        WeakHashMap weakHashMap2 = D1.U.f1980a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = D1.U.f1980a;
                        postInvalidateOnAnimation();
                    }
                }
                z9 = z6;
                if (f10 < 0.0f) {
                    v();
                    E8.d.U(this.f17276P, (-f10) / getHeight(), x9 / getWidth());
                } else if (f10 > 0.0f) {
                    s();
                    E8.d.U(this.f17278R, f10 / getHeight(), 1.0f - (x9 / getWidth()));
                } else if (z9) {
                    WeakHashMap weakHashMap4 = D1.U.f1980a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = D1.U.f1980a;
                    postInvalidateOnAnimation();
                }
                z9 = z6;
                if (z9) {
                    WeakHashMap weakHashMap6 = D1.U.f1980a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = D1.U.f1980a;
                    postInvalidateOnAnimation();
                }
            }
            i(i3, i9);
        } else {
            z6 = true;
        }
        if (i11 != 0 || i12 != 0) {
            r(i11, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z10 && i11 == 0 && i12 == 0) {
            return false;
        }
        return z6;
    }

    public final void Y(int i3, int i9, int[] iArr) {
        X x9;
        android.support.v4.media.session.q qVar = this.f17298m;
        b0();
        M();
        int i10 = p204z1.d.f32142a;
        Trace.beginSection("RV Scroll");
        T t9 = this.f17299m0;
        x(t9);
        O o8 = this.j;
        int iI0 = i3 != 0 ? this.f17314u.i0(i3, o8, t9) : 0;
        int iJ0 = i9 != 0 ? this.f17314u.j0(i9, o8, t9) : 0;
        Trace.endSection();
        int iT = qVar.t();
        for (int i11 = 0; i11 < iT; i11++) {
            View viewS = qVar.s(i11);
            X xF = F(viewS);
            if (xF != null && (x9 = xF.mShadowingHolder) != null) {
                View view = x9.itemView;
                int left = viewS.getLeft();
                int top = viewS.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        N(true);
        c0(false);
        if (iArr != null) {
            iArr[0] = iI0;
            iArr[1] = iJ0;
        }
    }

    public final boolean Z(EdgeEffect edgeEffect, int i3, int i9) {
        if (i3 > 0) {
            return true;
        }
        float fP = E8.d.P(edgeEffect) * i9;
        float fAbs = Math.abs(-i3) * 0.35f;
        float f9 = this.f17289h * 0.015f;
        double dLog = Math.log(fAbs / f9);
        double d4 = f17251G0;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * dLog) * ((double) f9))) < fP;
    }

    public final void a0(int i3, int i9, boolean z6) {
        I i10 = this.f17314u;
        if (i10 == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f17265E) {
            return;
        }
        int i11 = !i10.c() ? 0 : i3;
        int i12 = !this.f17314u.d() ? 0 : i9;
        if (i11 == 0 && i12 == 0) {
            return;
        }
        if (z6) {
            int i13 = i11 != 0 ? 1 : 0;
            if (i12 != 0) {
                i13 |= 2;
            }
            getScrollingChildHelper().g(i13, 1);
        }
        W w6 = this.f17293j0;
        RecyclerView recyclerView = w6.f17361n;
        int iAbs = Math.abs(i11);
        int iAbs2 = Math.abs(i12);
        boolean z9 = iAbs > iAbs2;
        int width = z9 ? recyclerView.getWidth() : recyclerView.getHeight();
        if (!z9) {
            iAbs = iAbs2;
        }
        int iMin = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        Interpolator interpolator = w6.f17358k;
        InterpolatorC1641x interpolatorC1641x = f17256L0;
        if (interpolator != interpolatorC1641x) {
            w6.f17358k = interpolatorC1641x;
            w6.j = new OverScroller(recyclerView.getContext(), interpolatorC1641x);
        }
        w6.f17357i = 0;
        w6.f17356h = 0;
        recyclerView.setScrollState(2);
        w6.j.startScroll(0, 0, i11, i12, iMin);
        if (w6.f17359l) {
            w6.f17360m = true;
            return;
        }
        RecyclerView recyclerView2 = w6.f17361n;
        recyclerView2.removeCallbacks(w6);
        WeakHashMap weakHashMap = D1.U.f1980a;
        recyclerView2.postOnAnimation(w6);
    }

    @Override
    public final void addFocusables(ArrayList arrayList, int i3, int i9) {
        I i10 = this.f17314u;
        if (i10 != null) {
            i10.getClass();
        }
        super.addFocusables(arrayList, i3, i9);
    }

    public final void b0() {
        int i3 = this.f17261C + 1;
        this.f17261C = i3;
        if (i3 != 1 || this.f17265E) {
            return;
        }
        this.f17263D = false;
    }

    public final void c0(boolean z6) {
        if (this.f17261C < 1) {
            this.f17261C = 1;
        }
        if (!z6 && !this.f17265E) {
            this.f17263D = false;
        }
        if (this.f17261C == 1) {
            if (z6 && this.f17263D && !this.f17265E && this.f17314u != null && this.f17312t != null) {
                m();
            }
            if (!this.f17265E) {
                this.f17263D = false;
            }
        }
        this.f17261C--;
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof J) && this.f17314u.e((J) layoutParams);
    }

    @Override
    public final int computeHorizontalScrollExtent() {
        I i3 = this.f17314u;
        if (i3 != null && i3.c()) {
            return this.f17314u.i(this.f17299m0);
        }
        return 0;
    }

    @Override
    public final int computeHorizontalScrollOffset() {
        I i3 = this.f17314u;
        if (i3 != null && i3.c()) {
            return this.f17314u.j(this.f17299m0);
        }
        return 0;
    }

    @Override
    public final int computeHorizontalScrollRange() {
        I i3 = this.f17314u;
        if (i3 != null && i3.c()) {
            return this.f17314u.k(this.f17299m0);
        }
        return 0;
    }

    @Override
    public final int computeVerticalScrollExtent() {
        I i3 = this.f17314u;
        if (i3 != null && i3.d()) {
            return this.f17314u.l(this.f17299m0);
        }
        return 0;
    }

    @Override
    public final int computeVerticalScrollOffset() {
        I i3 = this.f17314u;
        if (i3 != null && i3.d()) {
            return this.f17314u.m(this.f17299m0);
        }
        return 0;
    }

    @Override
    public final int computeVerticalScrollRange() {
        I i3 = this.f17314u;
        if (i3 != null && i3.d()) {
            return this.f17314u.n(this.f17299m0);
        }
        return 0;
    }

    public final void d0(int i3) {
        getScrollingChildHelper().h(i3);
    }

    @Override
    public final boolean dispatchNestedFling(float f9, float f10, boolean z6) {
        return getScrollingChildHelper().a(f9, f10, z6);
    }

    @Override
    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return getScrollingChildHelper().b(f9, f10);
    }

    @Override
    public final boolean dispatchNestedPreScroll(int i3, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i9, 0, iArr, iArr2);
    }

    @Override
    public final boolean dispatchNestedScroll(int i3, int i9, int i10, int i11, int[] iArr) {
        return getScrollingChildHelper().d(i3, i9, i10, i11, iArr, 0, null);
    }

    @Override
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z6;
        super.draw(canvas);
        ArrayList arrayList = this.f17318w;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C1631m c1631m = (C1631m) arrayList.get(i3);
            if (c1631m.f17469q != c1631m.f17471s.getWidth() || c1631m.f17470r != c1631m.f17471s.getHeight()) {
                c1631m.f17469q = c1631m.f17471s.getWidth();
                c1631m.f17470r = c1631m.f17471s.getHeight();
                c1631m.d(0);
            } else if (c1631m.f17453A != 0) {
                if (c1631m.f17472t) {
                    int i9 = c1631m.f17469q;
                    int i10 = c1631m.f17459e;
                    int i11 = i9 - i10;
                    int i12 = c1631m.f17464l;
                    int i13 = c1631m.f17463k;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable = c1631m.f17457c;
                    stateListDrawable.setBounds(0, 0, i10, i13);
                    int i15 = c1631m.f17470r;
                    Drawable drawable = c1631m.f17458d;
                    drawable.setBounds(0, 0, c1631m.f17460f, i15);
                    RecyclerView recyclerView = c1631m.f17471s;
                    WeakHashMap weakHashMap = D1.U.f1980a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i10, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i10, -i14);
                    } else {
                        canvas.translate(i11, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i11, -i14);
                    }
                }
                if (c1631m.f17473u) {
                    int i16 = c1631m.f17470r;
                    int i17 = c1631m.f17462i;
                    int i18 = i16 - i17;
                    int i19 = c1631m.f17467o;
                    int i20 = c1631m.f17466n;
                    int i21 = i19 - (i20 / 2);
                    StateListDrawable stateListDrawable2 = c1631m.g;
                    stateListDrawable2.setBounds(0, 0, i20, i17);
                    int i22 = c1631m.f17469q;
                    Drawable drawable2 = c1631m.f17461h;
                    drawable2.setBounds(0, 0, i22, c1631m.j);
                    canvas.translate(0.0f, i18);
                    drawable2.draw(canvas);
                    canvas.translate(i21, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i21, -i18);
                }
            }
        }
        EdgeEffect edgeEffect = this.f17275O;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z6 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f17302o ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f17275O;
            z6 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f17276P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f17302o) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f17276P;
            z6 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f17277Q;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f17302o ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f17277Q;
            z6 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f17278R;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f17302o) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f17278R;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z9 = true;
            }
            z6 |= z9;
            canvas.restoreToCount(iSave4);
        }
        if ((z6 || this.f17279S == null || arrayList.size() <= 0 || !this.f17279S.f()) ? z6 : true) {
            WeakHashMap weakHashMap2 = D1.U.f1980a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e(X x9) {
        View view = x9.itemView;
        boolean z6 = view.getParent() == this;
        this.j.l(F(view));
        if (x9.isTmpDetached()) {
            this.f17298m.i(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z6) {
            this.f17298m.h(view, -1, true);
            return;
        }
        android.support.v4.media.session.q qVar = this.f17298m;
        int iIndexOfChild = ((C1642y) qVar.f15617i).f17522a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C8.a) qVar.j).k(iIndexOfChild);
            qVar.D(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void f(String str) {
        if (J()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + w());
        }
        if (this.f17273M > 0) {
            android.util.Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + w()));
        }
    }

    @Override
    public final View focusSearch(View view, int i3) {
        View viewN;
        int i9;
        byte b9;
        boolean z6;
        this.f17314u.getClass();
        boolean z9 = true;
        boolean z10 = (this.f17312t == null || this.f17314u == null || J() || this.f17265E) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        T t9 = this.f17299m0;
        O o8 = this.j;
        if (z10 && (i3 == 2 || i3 == 1)) {
            if (this.f17314u.d()) {
                if (focusFinder.findNextFocus(this, view, i3 == 2 ? TsExtractor.TS_STREAM_TYPE_HDMV_DTS : 33) == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (!z6 && this.f17314u.c()) {
                RecyclerView recyclerView = this.f17314u.f17206b;
                WeakHashMap weakHashMap = D1.U.f1980a;
                z6 = focusFinder.findNextFocus(this, view, (recyclerView.getLayoutDirection() == 1) ^ (i3 == 2) ? 66 : 17) == null;
            }
            if (z6) {
                k();
                if (y(view) != null) {
                    b0();
                    this.f17314u.N(view, i3, o8, t9);
                    c0(false);
                }
                return null;
            }
            viewN = focusFinder.findNextFocus(this, view, i3);
            if (viewN == null) {
            }
            if (viewN != null) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                return viewN;
            }
            return super.focusSearch(view, i3);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i3);
        if (viewFindNextFocus == null && z10) {
            k();
            if (y(view) != null) {
                b0();
                viewN = this.f17314u.N(view, i3, o8, t9);
                c0(false);
            }
            return null;
        }
        viewN = viewFindNextFocus;
        if (viewN == null && !viewN.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i3);
            }
            V(viewN, null);
            return view;
        }
        if (viewN != null || viewN == this || viewN == view) {
            z9 = false;
        } else if (y(viewN) == null) {
            z9 = false;
        } else if (view != null && y(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f17306q;
            rect.set(0, 0, width, height);
            int width2 = viewN.getWidth();
            int height2 = viewN.getHeight();
            Rect rect2 = this.f17308r;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewN, rect2);
            RecyclerView recyclerView2 = this.f17314u.f17206b;
            WeakHashMap weakHashMap2 = D1.U.f1980a;
            int i10 = recyclerView2.getLayoutDirection() == 1 ? -1 : 1;
            int i11 = rect.left;
            int i12 = rect2.left;
            if ((i11 < i12 || rect.right <= i12) && rect.right < rect2.right) {
                i9 = 1;
            } else {
                int i13 = rect.right;
                int i14 = rect2.right;
                i9 = ((i13 > i14 || i11 >= i14) && i11 > i12) ? -1 : 0;
            }
            int i15 = rect.top;
            int i16 = rect2.top;
            if ((i15 < i16 || rect.bottom <= i16) && rect.bottom < rect2.bottom) {
                b9 = 1;
            } else {
                int i17 = rect.bottom;
                int i18 = rect2.bottom;
                b9 = ((i17 > i18 || i15 >= i18) && i15 > i16) ? (byte) -1 : (byte) 0;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 17) {
                        if (i3 != 33) {
                            if (i3 != 66) {
                                if (i3 != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i3 + w());
                                }
                                if (b9 <= 0) {
                                    z9 = false;
                                }
                            } else if (i9 <= 0) {
                                z9 = false;
                            }
                        } else if (b9 >= 0) {
                            z9 = false;
                        }
                    } else if (i9 >= 0) {
                        z9 = false;
                    }
                } else if (b9 <= 0 && (b9 != 0 || i9 * i10 <= 0)) {
                    z9 = false;
                }
            } else if (b9 >= 0 && (b9 != 0 || i9 * i10 >= 0)) {
                z9 = false;
            }
        }
        if (z9) {
            return viewN;
        }
        return super.focusSearch(view, i3);
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        I i3 = this.f17314u;
        if (i3 != null) {
            return i3.q();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w());
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        I i3 = this.f17314u;
        if (i3 != null) {
            return i3.r(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w());
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public A getAdapter() {
        return this.f17312t;
    }

    @Override
    public int getBaseline() {
        I i3 = this.f17314u;
        if (i3 == null) {
            return super.getBaseline();
        }
        i3.getClass();
        return -1;
    }

    @Override
    public final int getChildDrawingOrder(int i3, int i9) {
        return super.getChildDrawingOrder(i3, i9);
    }

    @Override
    public boolean getClipToPadding() {
        return this.f17302o;
    }

    public Z getCompatAccessibilityDelegate() {
        return this.f17313t0;
    }

    public E getEdgeEffectFactory() {
        return this.f17274N;
    }

    public F getItemAnimator() {
        return this.f17279S;
    }

    public int getItemDecorationCount() {
        return this.f17318w.size();
    }

    public I getLayoutManager() {
        return this.f17314u;
    }

    public int getMaxFlingVelocity() {
        return this.f17287f0;
    }

    public int getMinFlingVelocity() {
        return this.f17286e0;
    }

    public long getNanoTime() {
        if (f17254J0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public K getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f17292i0;
    }

    public N getRecycledViewPool() {
        return this.j.c();
    }

    public int getScrollState() {
        return this.f17280T;
    }

    public final void h() {
        int iB = this.f17298m.B();
        for (int i3 = 0; i3 < iB; i3++) {
            X xG = G(this.f17298m.A(i3));
            if (!xG.shouldIgnore()) {
                xG.clearOldPosition();
            }
        }
        O o8 = this.j;
        ArrayList arrayList = o8.f17244c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((X) arrayList.get(i9)).clearOldPosition();
        }
        ArrayList arrayList2 = o8.f17242a;
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((X) arrayList2.get(i10)).clearOldPosition();
        }
        ArrayList arrayList3 = o8.f17243b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i11 = 0; i11 < size3; i11++) {
                ((X) o8.f17243b.get(i11)).clearOldPosition();
            }
        }
    }

    @Override
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(int i3, int i9) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f17275O;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            zIsFinished = false;
        } else {
            this.f17275O.onRelease();
            zIsFinished = this.f17275O.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f17277Q;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f17277Q.onRelease();
            zIsFinished |= this.f17277Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f17276P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i9 > 0) {
            this.f17276P.onRelease();
            zIsFinished |= this.f17276P.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f17278R;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i9 < 0) {
            this.f17278R.onRelease();
            zIsFinished |= this.f17278R.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = D1.U.f1980a;
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean isAttachedToWindow() {
        return this.f17323z;
    }

    @Override
    public final boolean isLayoutSuppressed() {
        return this.f17265E;
    }

    @Override
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2050d;
    }

    public final void k() {
        android.support.v4.media.session.q qVar = this.f17298m;
        w0 w0Var = this.f17296l;
        if (!this.f17259B || this.f17270J) {
            int i3 = p204z1.d.f32142a;
            Trace.beginSection("RV FullInvalidate");
            m();
            Trace.endSection();
            return;
        }
        if (w0Var.j()) {
            int i9 = w0Var.f8482a;
            if ((i9 & 4) == 0 || (i9 & 11) != 0) {
                if (w0Var.j()) {
                    int i10 = p204z1.d.f32142a;
                    Trace.beginSection("RV FullInvalidate");
                    m();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i11 = p204z1.d.f32142a;
            Trace.beginSection("RV PartialInvalidate");
            b0();
            M();
            w0Var.q();
            if (!this.f17263D) {
                int iT = qVar.t();
                for (int i12 = 0; i12 < iT; i12++) {
                    X xG = G(qVar.s(i12));
                    if (xG != null && !xG.shouldIgnore() && xG.isUpdated()) {
                        m();
                    }
                }
                w0Var.c();
            }
            c0(true);
            N(true);
            Trace.endSection();
        }
    }

    public final void l(int i3, int i9) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = D1.U.f1980a;
        setMeasuredDimension(I.f(i3, paddingRight, getMinimumWidth()), I.f(i9, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void m() {
        boolean z6;
        X x9;
        int i3;
        int iB;
        int i9;
        int iMin;
        X xC;
        X xC2;
        int i10;
        View viewFindViewById;
        D1.r rVar;
        ?? r9;
        boolean zG;
        boolean z9;
        if (this.f17312t == null) {
            android.util.Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f17314u == null) {
            android.util.Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        T t9 = this.f17299m0;
        boolean z10 = false;
        t9.f17351h = false;
        boolean z11 = true;
        boolean z12 = this.f17260B0 && !(this.f17262C0 == getWidth() && this.f17264D0 == getHeight());
        this.f17262C0 = 0;
        this.f17264D0 = 0;
        this.f17260B0 = false;
        if (t9.f17347c == 1) {
            n();
            this.f17314u.k0(this);
            o();
        } else {
            w0 w0Var = this.f17296l;
            if ((((ArrayList) w0Var.f8485d).isEmpty() || ((ArrayList) w0Var.f8484c).isEmpty()) && !z12 && this.f17314u.f17215m == getWidth() && this.f17314u.f17216n == getHeight()) {
                this.f17314u.k0(this);
            } else {
                this.f17314u.k0(this);
                o();
            }
        }
        t9.a(4);
        b0();
        M();
        t9.f17347c = 1;
        boolean z13 = t9.f17352i;
        O o8 = this.j;
        S2.a aVar = this.f17300n;
        if (z13) {
            int iT = this.f17298m.t() - 1;
            while (iT >= 0) {
                X xG = G(this.f17298m.s(iT));
                if (xG.shouldIgnore()) {
                    z9 = z11;
                } else {
                    long jE = E(xG);
                    this.f17279S.getClass();
                    D1.r rVar2 = new D1.r();
                    rVar2.a(xG);
                    X x10 = (X) ((p136q.r) aVar.j).b(jE);
                    if (x10 == null || x10.shouldIgnore()) {
                        z9 = z11;
                        aVar.i(xG, rVar2);
                    } else {
                        p136q.S s9 = (p136q.S) aVar.f9211i;
                        z9 = z11;
                        h0 h0Var = (h0) s9.get(x10);
                        boolean z14 = (h0Var == null || (h0Var.f17442a & 1) == 0) ? false : z9;
                        h0 h0Var2 = (h0) s9.get(xG);
                        boolean z15 = (h0Var2 == null || (h0Var2.f17442a & 1) == 0) ? false : z9;
                        if (z14 && x10 == xG) {
                            aVar.i(xG, rVar2);
                        } else {
                            D1.r rVarL = aVar.L(x10, 4);
                            aVar.i(xG, rVar2);
                            D1.r rVarL2 = aVar.L(xG, 8);
                            if (rVarL == null) {
                                int iT2 = this.f17298m.t();
                                for (int i11 = 0; i11 < iT2; i11++) {
                                    X xG2 = G(this.f17298m.s(i11));
                                    if (xG2 != xG && E(xG2) == jE) {
                                        A a2 = this.f17312t;
                                        if (a2 == null || !a2.hasStableIds()) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + xG2 + " \n View Holder 2:" + xG + w());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + xG2 + " \n View Holder 2:" + xG + w());
                                    }
                                }
                                android.util.Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + x10 + " cannot be found but it is necessary for " + xG + w());
                            } else {
                                x10.setIsRecyclable(false);
                                if (z14) {
                                    e(x10);
                                }
                                if (x10 != xG) {
                                    if (z15) {
                                        e(xG);
                                    }
                                    x10.mShadowedHolder = xG;
                                    e(x10);
                                    o8.l(x10);
                                    xG.setIsRecyclable(false);
                                    xG.mShadowingHolder = x10;
                                }
                                if (this.f17279S.a(x10, xG, rVarL, rVarL2)) {
                                    P();
                                }
                            }
                        }
                    }
                }
                iT--;
                z11 = z9;
            }
            z6 = z11;
            p136q.S s10 = (p136q.S) aVar.f9211i;
            int i12 = s10.j - 1;
            while (i12 >= 0) {
                X x11 = (X) s10.e(i12);
                h0 h0Var3 = (h0) s10.g(i12);
                int i13 = h0Var3.f17442a;
                int i14 = i13 & 3;
                C1642y c1642y = this.f17266E0;
                if (i14 == 3) {
                    RecyclerView recyclerView = c1642y.f17522a;
                    recyclerView.f17314u.e0(x11.itemView, recyclerView.j);
                    r9 = z10;
                } else if ((i13 & 1) != 0) {
                    D1.r rVar3 = h0Var3.f17443b;
                    if (rVar3 == null) {
                        RecyclerView recyclerView2 = c1642y.f17522a;
                        recyclerView2.f17314u.e0(x11.itemView, recyclerView2.j);
                        r9 = z10;
                    } else {
                        c1642y.g(x11, rVar3, h0Var3.f17444c);
                        r9 = z10;
                    }
                } else if ((i13 & 14) == 14) {
                    c1642y.f(x11, h0Var3.f17443b, h0Var3.f17444c);
                    r9 = z10;
                } else {
                    if ((i13 & 12) == 12) {
                        D1.r rVar4 = h0Var3.f17443b;
                        D1.r rVar5 = h0Var3.f17444c;
                        c1642y.getClass();
                        x11.setIsRecyclable(z10);
                        RecyclerView recyclerView3 = c1642y.f17522a;
                        if (!recyclerView3.f17270J) {
                            C1626h c1626h = (C1626h) recyclerView3.f17279S;
                            c1626h.getClass();
                            int i15 = rVar4.f2053a;
                            int i16 = rVar5.f2053a;
                            if (i15 == i16 && rVar4.f2054b == rVar5.f2054b) {
                                c1626h.c(x11);
                                zG = false;
                            } else {
                                zG = c1626h.g(x11, i15, rVar4.f2054b, i16, rVar5.f2054b);
                            }
                            if (zG) {
                                recyclerView3.P();
                            }
                        } else if (recyclerView3.f17279S.a(x11, x11, rVar4, rVar5)) {
                            recyclerView3.P();
                        }
                        r9 = 0;
                    } else {
                        if ((i13 & 4) != 0) {
                            rVar = null;
                            c1642y.g(x11, h0Var3.f17443b, null);
                        } else {
                            rVar = null;
                            if ((i13 & 8) != 0) {
                                c1642y.f(x11, h0Var3.f17443b, h0Var3.f17444c);
                            }
                        }
                        r9 = 0;
                    }
                    h0Var3.f17442a = r9;
                    h0Var3.f17443b = rVar;
                    h0Var3.f17444c = rVar;
                    h0.f17441d.i(h0Var3);
                    i12--;
                    z10 = false;
                }
                rVar = null;
                h0Var3.f17442a = r9;
                h0Var3.f17443b = rVar;
                h0Var3.f17444c = rVar;
                h0.f17441d.i(h0Var3);
                i12--;
                z10 = false;
            }
        } else {
            z6 = true;
        }
        View view = null;
        this.f17314u.d0(o8);
        t9.f17345a = t9.f17348d;
        this.f17270J = false;
        this.f17271K = false;
        t9.f17352i = false;
        t9.j = false;
        this.f17314u.f17209e = false;
        ArrayList arrayList = o8.f17243b;
        if (arrayList != null) {
            arrayList.clear();
        }
        I i17 = this.f17314u;
        if (i17.j) {
            i17.f17212i = 0;
            i17.j = false;
            o8.m();
        }
        this.f17314u.Y(t9);
        N(z6);
        c0(false);
        ((p136q.S) aVar.f9211i).clear();
        ((p136q.r) aVar.j).a();
        int[] iArr = this.f17315u0;
        int i18 = iArr[0];
        int i19 = iArr[1];
        A(iArr);
        if ((iArr[0] == i18 && iArr[1] == i19) ? false : true) {
            r(0, 0);
        }
        if (this.f17292i0 && this.f17312t != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                if (t9.f17354l == -1) {
                    x9 = null;
                } else {
                    x9 = null;
                }
                if (x9 != null) {
                    if (this.f17298m.t() > 0) {
                        int i20 = t9.f17353k;
                        if (i20 != -1) {
                        }
                        iB = t9.b();
                        i9 = i3;
                        while (true) {
                            if (i9 < iB) {
                                xC2 = C(i9);
                                if (xC2 != null) {
                                    if (xC2.itemView.hasFocusable()) {
                                        view = xC2.itemView;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            for (iMin = Math.min(iB, i3) - 1; iMin >= 0; iMin--) {
                                xC = C(iMin);
                                if (xC == null) {
                                    break;
                                    break;
                                } else {
                                    if (xC.itemView.hasFocusable()) {
                                        view = xC.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (((ArrayList) this.f17298m.f15618k).contains(x9.itemView)) {
                    if (this.f17298m.t() > 0) {
                        int i21 = t9.f17353k;
                        if (i21 != -1) {
                        }
                        iB = t9.b();
                        i9 = i3;
                        while (true) {
                            if (i9 < iB) {
                                xC2 = C(i9);
                                if (xC2 != null) {
                                    if (xC2.itemView.hasFocusable()) {
                                        view = xC2.itemView;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                xC = C(iMin);
                                if (xC == null) {
                                    break;
                                    break;
                                } else {
                                    if (xC.itemView.hasFocusable()) {
                                        view = xC.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (this.f17298m.t() > 0) {
                    int i22 = t9.f17353k;
                    if (i22 != -1) {
                    }
                    iB = t9.b();
                    i9 = i3;
                    while (true) {
                        if (i9 < iB) {
                            xC2 = C(i9);
                            if (xC2 != null) {
                                if (xC2.itemView.hasFocusable()) {
                                    view = xC2.itemView;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            xC = C(iMin);
                            if (xC == null) {
                                break;
                                break;
                            } else {
                                if (xC.itemView.hasFocusable()) {
                                    view = xC.itemView;
                                    break;
                                }
                            }
                        }
                    }
                }
                if (view != null) {
                    i10 = t9.f17355m;
                    if (i10 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (((ArrayList) this.f17298m.f15618k).contains(getFocusedChild())) {
                if (t9.f17354l == -1 && this.f17312t.hasStableIds()) {
                    long j = t9.f17354l;
                    A a9 = this.f17312t;
                    if (a9 == null || !a9.hasStableIds()) {
                        x9 = null;
                    } else {
                        int iB2 = this.f17298m.B();
                        x9 = null;
                        for (int i23 = 0; i23 < iB2; i23++) {
                            X xG3 = G(this.f17298m.A(i23));
                            if (xG3 != null && !xG3.isRemoved() && xG3.getItemId() == j) {
                                if (!((ArrayList) this.f17298m.f15618k).contains(xG3.itemView)) {
                                    x9 = xG3;
                                    break;
                                }
                                x9 = xG3;
                            }
                        }
                    }
                } else {
                    x9 = null;
                }
                if (x9 != null) {
                    if (this.f17298m.t() > 0) {
                        int i24 = t9.f17353k;
                        if (i24 != -1) {
                        }
                        iB = t9.b();
                        i9 = i3;
                        while (true) {
                            if (i9 < iB) {
                                xC2 = C(i9);
                                if (xC2 != null) {
                                    if (xC2.itemView.hasFocusable()) {
                                        view = xC2.itemView;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                xC = C(iMin);
                                if (xC == null) {
                                    break;
                                    break;
                                } else {
                                    if (xC.itemView.hasFocusable()) {
                                        view = xC.itemView;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } else if (((ArrayList) this.f17298m.f15618k).contains(x9.itemView) && x9.itemView.hasFocusable()) {
                    view = x9.itemView;
                } else if (this.f17298m.t() > 0) {
                    int i25 = t9.f17353k;
                    i3 = i25 != -1 ? i25 : 0;
                    iB = t9.b();
                    i9 = i3;
                    while (true) {
                        if (i9 < iB) {
                            xC2 = C(i9);
                            if (xC2 != null) {
                                if (xC2.itemView.hasFocusable()) {
                                    view = xC2.itemView;
                                } else {
                                    i9++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            xC = C(iMin);
                            if (xC == null) {
                                break;
                            }
                            if (xC.itemView.hasFocusable()) {
                                view = xC.itemView;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i10 = t9.f17355m;
                    if (i10 != -1 && (viewFindViewById = view.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        t9.f17354l = -1L;
        t9.f17353k = -1;
        t9.f17355m = -1;
    }

    public final void n() {
        h0 h0Var;
        View viewY;
        T t9 = this.f17299m0;
        t9.a(1);
        x(t9);
        t9.f17351h = false;
        b0();
        S2.a aVar = this.f17300n;
        ((p136q.S) aVar.f9211i).clear();
        p136q.r rVar = (p136q.r) aVar.j;
        rVar.a();
        M();
        Q();
        X xF = null;
        View focusedChild = (this.f17292i0 && hasFocus() && this.f17312t != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewY = y(focusedChild)) != null) {
            xF = F(viewY);
        }
        if (xF == null) {
            t9.f17354l = -1L;
            t9.f17353k = -1;
            t9.f17355m = -1;
        } else {
            t9.f17354l = this.f17312t.hasStableIds() ? xF.getItemId() : -1L;
            t9.f17353k = this.f17270J ? -1 : xF.isRemoved() ? xF.mOldPosition : xF.getAbsoluteAdapterPosition();
            View focusedChild2 = xF.itemView;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            t9.f17355m = id;
        }
        t9.g = t9.f17352i && this.f17307q0;
        this.f17307q0 = false;
        this.f17305p0 = false;
        t9.f17350f = t9.j;
        t9.f17348d = this.f17312t.getItemCount();
        A(this.f17315u0);
        boolean z6 = t9.f17352i;
        p136q.S s9 = (p136q.S) aVar.f9211i;
        if (z6) {
            int iT = this.f17298m.t();
            for (int i3 = 0; i3 < iT; i3++) {
                X xG = G(this.f17298m.s(i3));
                if (!xG.shouldIgnore() && (!xG.isInvalid() || this.f17312t.hasStableIds())) {
                    F f9 = this.f17279S;
                    F.b(xG);
                    xG.getUnmodifiedPayloads();
                    f9.getClass();
                    D1.r rVar2 = new D1.r();
                    rVar2.a(xG);
                    h0 h0VarA = (h0) s9.get(xG);
                    if (h0VarA == null) {
                        h0VarA = h0.a();
                        s9.put(xG, h0VarA);
                    }
                    h0VarA.f17443b = rVar2;
                    h0VarA.f17442a |= 4;
                    if (t9.g && xG.isUpdated() && !xG.isRemoved() && !xG.shouldIgnore() && !xG.isInvalid()) {
                        rVar.d(E(xG), xG);
                    }
                }
            }
        }
        if (t9.j) {
            int iB = this.f17298m.B();
            for (int i9 = 0; i9 < iB; i9++) {
                X xG2 = G(this.f17298m.A(i9));
                if (!xG2.shouldIgnore()) {
                    xG2.saveOldPosition();
                }
            }
            boolean z9 = t9.f17349e;
            t9.f17349e = false;
            this.f17314u.X(this.j, t9);
            t9.f17349e = z9;
            for (int i10 = 0; i10 < this.f17298m.t(); i10++) {
                X xG3 = G(this.f17298m.s(i10));
                if (!xG3.shouldIgnore() && ((h0Var = (h0) s9.get(xG3)) == null || (h0Var.f17442a & 4) == 0)) {
                    F.b(xG3);
                    boolean zHasAnyOfTheFlags = xG3.hasAnyOfTheFlags(8192);
                    F f10 = this.f17279S;
                    xG3.getUnmodifiedPayloads();
                    f10.getClass();
                    D1.r rVar3 = new D1.r();
                    rVar3.a(xG3);
                    if (zHasAnyOfTheFlags) {
                        S(xG3, rVar3);
                    } else {
                        h0 h0VarA2 = (h0) s9.get(xG3);
                        if (h0VarA2 == null) {
                            h0VarA2 = h0.a();
                            s9.put(xG3, h0VarA2);
                        }
                        h0VarA2.f17442a |= 2;
                        h0VarA2.f17443b = rVar3;
                    }
                }
            }
            h();
        } else {
            h();
        }
        N(true);
        c0(false);
        t9.f17347c = 2;
    }

    public final void o() {
        b0();
        M();
        T t9 = this.f17299m0;
        t9.a(6);
        this.f17296l.d();
        t9.f17348d = this.f17312t.getItemCount();
        t9.f17346b = 0;
        if (this.f17294k != null && this.f17312t.canRestoreState()) {
            Parcelable parcelable = this.f17294k.j;
            if (parcelable != null) {
                this.f17314u.Z(parcelable);
            }
            this.f17294k = null;
        }
        t9.f17350f = false;
        this.f17314u.X(this.j, t9);
        t9.f17349e = false;
        t9.f17352i = t9.f17352i && this.f17279S != null;
        t9.f17347c = 4;
        N(true);
        c0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f17272L = 0;
        this.f17323z = true;
        this.f17259B = this.f17259B && !isLayoutRequested();
        this.j.d();
        I i3 = this.f17314u;
        if (i3 != null) {
            i3.f17210f = true;
        }
        this.f17311s0 = false;
        if (f17254J0) {
            ThreadLocal threadLocal = RunnableC1633o.f17483l;
            RunnableC1633o runnableC1633o = (RunnableC1633o) threadLocal.get();
            this.f17295k0 = runnableC1633o;
            if (runnableC1633o == null) {
                RunnableC1633o runnableC1633o2 = new RunnableC1633o();
                runnableC1633o2.f17485h = new ArrayList();
                runnableC1633o2.f17487k = new ArrayList();
                this.f17295k0 = runnableC1633o2;
                WeakHashMap weakHashMap = D1.U.f1980a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                RunnableC1633o runnableC1633o3 = this.f17295k0;
                runnableC1633o3.j = (long) (1.0E9f / refreshRate);
                threadLocal.set(runnableC1633o3);
            }
            this.f17295k0.f17485h.add(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        O o8;
        RunnableC1633o runnableC1633o;
        super.onDetachedFromWindow();
        F f9 = this.f17279S;
        if (f9 != null) {
            f9.e();
        }
        int i3 = 0;
        setScrollState(0);
        W w6 = this.f17293j0;
        w6.f17361n.removeCallbacks(w6);
        w6.j.abortAnimation();
        this.f17323z = false;
        I i9 = this.f17314u;
        if (i9 != null) {
            i9.f17210f = false;
            i9.M(this);
        }
        this.f17324z0.clear();
        removeCallbacks(this.f17258A0);
        this.f17300n.getClass();
        while (h0.f17441d.a() != null) {
        }
        int i10 = 0;
        while (true) {
            o8 = this.j;
            ArrayList arrayList = o8.f17244c;
            if (i10 >= arrayList.size()) {
                break;
            }
            p000a.a.l(((X) arrayList.get(i10)).itemView);
            i10++;
        }
        o8.e(o8.f17248h.f17312t, false);
        while (i3 < getChildCount()) {
            int i11 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = p000a.a.u(childAt).f7120a;
            for (int iA0 = p078i6.p.A0(arrayList2); -1 < iA0; iA0--) {
                ((S0) arrayList2.get(iA0)).f8845a.c();
            }
            i3 = i11;
        }
        if (!f17254J0 || (runnableC1633o = this.f17295k0) == null) {
            return;
        }
        runnableC1633o.f17485h.remove(this);
        this.f17295k0 = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f17318w;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C1631m) arrayList.get(i3)).getClass();
        }
    }

    @Override
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f9;
        float axisValue;
        if (this.f17314u != null && !this.f17265E && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f9 = this.f17314u.d() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f17314u.c() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f17314u.d()) {
                    f9 = -axisValue2;
                } else if (this.f17314u.c()) {
                    axisValue = axisValue2;
                    f9 = 0.0f;
                } else {
                    f9 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f9 = 0.0f;
                axisValue = 0.0f;
            }
            if (f9 != 0.0f || axisValue != 0.0f) {
                int i3 = (int) (axisValue * this.f17288g0);
                int i9 = (int) (f9 * this.f17290h0);
                I i10 = this.f17314u;
                if (i10 == null) {
                    android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.f17265E) {
                    int[] iArr = this.f17322y0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zC = i10.c();
                    boolean zD = this.f17314u.d();
                    int i11 = zD ? (zC ? 1 : 0) | 2 : zC ? 1 : 0;
                    float y = motionEvent.getY();
                    float x9 = motionEvent.getX();
                    int iT = i3 - T(y, i3);
                    int iU = i9 - U(x9, i9);
                    getScrollingChildHelper().g(i11, 1);
                    if (p(zC ? iT : 0, zD ? iU : 0, 1, this.f17322y0, this.f17319w0)) {
                        iT -= iArr[0];
                        iU -= iArr[1];
                    }
                    X(zC ? iT : 0, zD ? iU : 0, motionEvent, 1);
                    RunnableC1633o runnableC1633o = this.f17295k0;
                    if (runnableC1633o != null && (iT != 0 || iU != 0)) {
                        runnableC1633o.a(this, iT, iU);
                    }
                    d0(1);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z9;
        if (!this.f17265E) {
            this.y = null;
            if (z(motionEvent)) {
                W();
                setScrollState(0);
                return true;
            }
            I i3 = this.f17314u;
            if (i3 != null) {
                boolean zC = i3.c();
                boolean zD = this.f17314u.d();
                if (this.V == null) {
                    this.V = VelocityTracker.obtain();
                }
                this.V.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f17267F) {
                        this.f17267F = false;
                    }
                    this.f17281U = motionEvent.getPointerId(0);
                    int x9 = (int) (motionEvent.getX() + 0.5f);
                    this.f17283b0 = x9;
                    this.W = x9;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f17284c0 = y;
                    this.f17282a0 = y;
                    EdgeEffect edgeEffect = this.f17275O;
                    if (edgeEffect == null || E8.d.P(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z6 = false;
                    } else {
                        E8.d.U(this.f17275O, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z6 = true;
                    }
                    EdgeEffect edgeEffect2 = this.f17277Q;
                    boolean z10 = z6;
                    if (edgeEffect2 != null && E8.d.P(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z10 = z6;
                        z10 = z6;
                        E8.d.U(this.f17277Q, 0.0f, motionEvent.getY() / getHeight());
                        z10 = true;
                    }
                    z10 = z6;
                    z10 = z6;
                    z10 = z6;
                    EdgeEffect edgeEffect3 = this.f17276P;
                    boolean z11 = z10;
                    if (edgeEffect3 != null && E8.d.P(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z11 = z10;
                        z11 = z10;
                        E8.d.U(this.f17276P, 0.0f, motionEvent.getX() / getWidth());
                        z11 = true;
                    }
                    z11 = z10;
                    z11 = z10;
                    z11 = z10;
                    EdgeEffect edgeEffect4 = this.f17278R;
                    boolean z12 = z11;
                    if (edgeEffect4 != null && E8.d.P(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z12 = z11;
                        z12 = z11;
                        E8.d.U(this.f17278R, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z12 = true;
                    }
                    if (z12 || this.f17280T == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        d0(1);
                    }
                    int[] iArr = this.f17321x0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i9 = zC;
                    if (zD) {
                        i9 = (zC ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i9, 0);
                } else if (actionMasked == 1) {
                    this.V.clear();
                    d0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f17281U);
                    if (iFindPointerIndex < 0) {
                        android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f17281U + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y9 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f17280T != 1) {
                        int i10 = x10 - this.W;
                        int i11 = y9 - this.f17282a0;
                        if (!zC || Math.abs(i10) <= this.f17285d0) {
                            z9 = false;
                        } else {
                            this.f17283b0 = x10;
                            z9 = true;
                        }
                        if (zD && Math.abs(i11) > this.f17285d0) {
                            this.f17284c0 = y9;
                            z9 = true;
                        }
                        if (z9) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    W();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f17281U = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f17283b0 = x11;
                    this.W = x11;
                    int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f17284c0 = y10;
                    this.f17282a0 = y10;
                } else if (actionMasked == 6) {
                    O(motionEvent);
                }
                if (this.f17280T == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        int i12 = p204z1.d.f32142a;
        Trace.beginSection("RV OnLayout");
        m();
        Trace.endSection();
        this.f17259B = true;
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        I i10 = this.f17314u;
        if (i10 == null) {
            l(i3, i9);
            return;
        }
        boolean zG = i10.G();
        boolean z6 = false;
        T t9 = this.f17299m0;
        if (zG) {
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i9);
            this.f17314u.f17206b.l(i3, i9);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z6 = true;
            }
            this.f17260B0 = z6;
            if (z6 || this.f17312t == null) {
                return;
            }
            if (t9.f17347c == 1) {
                n();
            }
            this.f17314u.l0(i3, i9);
            t9.f17351h = true;
            o();
            this.f17314u.n0(i3, i9);
            if (this.f17314u.q0()) {
                this.f17314u.l0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                t9.f17351h = true;
                o();
                this.f17314u.n0(i3, i9);
            }
            this.f17262C0 = getMeasuredWidth();
            this.f17264D0 = getMeasuredHeight();
            return;
        }
        if (this.f17257A) {
            this.f17314u.f17206b.l(i3, i9);
            return;
        }
        if (this.H) {
            b0();
            M();
            Q();
            N(true);
            if (t9.j) {
                t9.f17350f = true;
            } else {
                this.f17296l.d();
                t9.f17350f = false;
            }
            this.H = false;
            c0(false);
        } else if (t9.j) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        A a2 = this.f17312t;
        if (a2 != null) {
            t9.f17348d = a2.getItemCount();
        } else {
            t9.f17348d = 0;
        }
        b0();
        this.f17314u.f17206b.l(i3, i9);
        c0(false);
        t9.f17350f = false;
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (J()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof S)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        S s9 = (S) parcelable;
        this.f17294k = s9;
        super.onRestoreInstanceState(s9.f7299h);
        requestLayout();
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        S s9 = new S(super.onSaveInstanceState());
        S s10 = this.f17294k;
        if (s10 != null) {
            s9.j = s10.j;
            return s9;
        }
        I i3 = this.f17314u;
        if (i3 != null) {
            s9.j = i3.a0();
            return s9;
        }
        s9.j = null;
        return s9;
    }

    @Override
    public final void onSizeChanged(int i3, int i9, int i10, int i11) {
        super.onSizeChanged(i3, i9, i10, i11);
        if (i3 == i10 && i9 == i11) {
            return;
        }
        this.f17278R = null;
        this.f17276P = null;
        this.f17277Q = null;
        this.f17275O = null;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        int i3;
        int iMax;
        int i9;
        boolean z9;
        if (!this.f17265E && !this.f17267F) {
            C1631m c1631m = this.y;
            if (c1631m == null) {
                z6 = motionEvent.getAction() == 0 ? false : z(motionEvent);
            } else {
                if (c1631m.f17474v != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zB = c1631m.b(motionEvent.getX(), motionEvent.getY());
                        boolean zA = c1631m.a(motionEvent.getX(), motionEvent.getY());
                        if (zB || zA) {
                            if (zA) {
                                c1631m.f17475w = 1;
                                c1631m.f17468p = (int) motionEvent.getX();
                            } else if (zB) {
                                c1631m.f17475w = 2;
                                c1631m.f17465m = (int) motionEvent.getY();
                            }
                            c1631m.d(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c1631m.f17474v == 2) {
                        c1631m.f17465m = 0.0f;
                        c1631m.f17468p = 0.0f;
                        c1631m.d(1);
                        c1631m.f17475w = 0;
                    } else if (motionEvent.getAction() == 2 && c1631m.f17474v == 2) {
                        c1631m.e();
                        int i10 = c1631m.f17475w;
                        int i11 = c1631m.f17456b;
                        if (i10 == 1) {
                            float x9 = motionEvent.getX();
                            int[] iArr = c1631m.y;
                            iArr[0] = i11;
                            int i12 = c1631m.f17469q - i11;
                            iArr[1] = i12;
                            float fMax = Math.max(i11, Math.min(i12, x9));
                            if (Math.abs(c1631m.f17467o - fMax) >= 2.0f) {
                                int iC = C1631m.c(c1631m.f17468p, fMax, iArr, c1631m.f17471s.computeHorizontalScrollRange(), c1631m.f17471s.computeHorizontalScrollOffset(), c1631m.f17469q);
                                if (iC != 0) {
                                    c1631m.f17471s.scrollBy(iC, 0);
                                }
                                c1631m.f17468p = fMax;
                            }
                        }
                        if (c1631m.f17475w == 2) {
                            float y = motionEvent.getY();
                            int[] iArr2 = c1631m.f17476x;
                            iArr2[0] = i11;
                            int i13 = c1631m.f17470r - i11;
                            iArr2[1] = i13;
                            float fMax2 = Math.max(i11, Math.min(i13, y));
                            if (Math.abs(c1631m.f17464l - fMax2) >= 2.0f) {
                                int iC2 = C1631m.c(c1631m.f17465m, fMax2, iArr2, c1631m.f17471s.computeVerticalScrollRange(), c1631m.f17471s.computeVerticalScrollOffset(), c1631m.f17470r);
                                if (iC2 != 0) {
                                    c1631m.f17471s.scrollBy(0, iC2);
                                }
                                c1631m.f17465m = fMax2;
                            }
                        }
                    }
                }
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.y = null;
                }
                z6 = true;
            }
            if (z6) {
                W();
                setScrollState(0);
                return true;
            }
            I i14 = this.f17314u;
            if (i14 != null) {
                boolean zC = i14.c();
                boolean zD = this.f17314u.d();
                if (this.V == null) {
                    this.V = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr3 = this.f17321x0;
                if (actionMasked == 0) {
                    iArr3[1] = 0;
                    iArr3[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.V.addMovement(motionEventObtain);
                        VelocityTracker velocityTracker = this.V;
                        int i15 = this.f17287f0;
                        velocityTracker.computeCurrentVelocity(1000, i15);
                        float f9 = zC ? -this.V.getXVelocity(this.f17281U) : 0.0f;
                        float f10 = zD ? -this.V.getYVelocity(this.f17281U) : 0.0f;
                        if (f9 == 0.0f && f10 == 0.0f) {
                            setScrollState(0);
                        } else {
                            int i16 = (int) f9;
                            int iMax2 = (int) f10;
                            I i17 = this.f17314u;
                            if (i17 == null) {
                                android.util.Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                            } else if (!this.f17265E) {
                                boolean zC2 = i17.c();
                                boolean zD2 = this.f17314u.d();
                                int i18 = this.f17286e0;
                                if (!zC2 || Math.abs(i16) < i18) {
                                    i16 = 0;
                                }
                                if (!zD2 || Math.abs(iMax2) < i18) {
                                    iMax2 = 0;
                                }
                                if (i16 != 0 || iMax2 != 0) {
                                    if (i16 == 0) {
                                        iMax = 0;
                                    } else {
                                        EdgeEffect edgeEffect = this.f17275O;
                                        if (edgeEffect == null || E8.d.P(edgeEffect) == 0.0f) {
                                            EdgeEffect edgeEffect2 = this.f17277Q;
                                            if (edgeEffect2 == null || E8.d.P(edgeEffect2) == 0.0f) {
                                                iMax = 0;
                                            } else if (Z(this.f17277Q, i16, getWidth())) {
                                                this.f17277Q.onAbsorb(i16);
                                                i16 = 0;
                                            }
                                        } else {
                                            int i19 = -i16;
                                            if (Z(this.f17275O, i19, getWidth())) {
                                                this.f17275O.onAbsorb(i19);
                                                i16 = 0;
                                            }
                                        }
                                        iMax = i16;
                                        i16 = 0;
                                    }
                                    if (iMax2 == 0) {
                                        i9 = iMax2;
                                        iMax2 = 0;
                                    } else {
                                        EdgeEffect edgeEffect3 = this.f17276P;
                                        if (edgeEffect3 == null || E8.d.P(edgeEffect3) == 0.0f) {
                                            EdgeEffect edgeEffect4 = this.f17278R;
                                            if (edgeEffect4 == null || E8.d.P(edgeEffect4) == 0.0f) {
                                                i9 = iMax2;
                                                iMax2 = 0;
                                            } else if (Z(this.f17278R, iMax2, getHeight())) {
                                                this.f17278R.onAbsorb(iMax2);
                                                iMax2 = 0;
                                            }
                                        } else {
                                            int i20 = -iMax2;
                                            if (Z(this.f17276P, i20, getHeight())) {
                                                this.f17276P.onAbsorb(i20);
                                                iMax2 = 0;
                                            }
                                        }
                                        i9 = 0;
                                    }
                                    W w6 = this.f17293j0;
                                    if (iMax != 0 || iMax2 != 0) {
                                        int i21 = -i15;
                                        iMax = Math.max(i21, Math.min(iMax, i15));
                                        iMax2 = Math.max(i21, Math.min(iMax2, i15));
                                        w6.a(iMax, iMax2);
                                    }
                                    if (i16 != 0 || i9 != 0) {
                                        float f11 = i16;
                                        float f12 = i9;
                                        if (!dispatchNestedPreFling(f11, f12)) {
                                            boolean z10 = zC2 || zD2;
                                            dispatchNestedFling(f11, f12, z10);
                                            int i22 = zC2;
                                            if (z10) {
                                                if (zD2) {
                                                    i22 = (zC2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i22, 1);
                                                int i23 = -i15;
                                                w6.a(Math.max(i23, Math.min(i16, i15)), Math.max(i23, Math.min(i9, i15)));
                                            }
                                        }
                                    } else if (iMax == 0 && iMax2 == 0) {
                                    }
                                }
                            }
                            setScrollState(0);
                        }
                        W();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.f17281U);
                        if (iFindPointerIndex < 0) {
                            android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f17281U + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y9 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax3 = this.f17283b0 - x10;
                        int iMax4 = this.f17284c0 - y9;
                        if (this.f17280T != 1) {
                            if (zC) {
                                iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f17285d0) : Math.min(0, iMax3 + this.f17285d0);
                                if (iMax3 != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                            } else {
                                z9 = false;
                            }
                            if (zD) {
                                iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - this.f17285d0) : Math.min(0, iMax4 + this.f17285d0);
                                if (iMax4 != 0) {
                                    z9 = true;
                                }
                            }
                            if (z9) {
                                setScrollState(1);
                            }
                        }
                        if (this.f17280T == 1) {
                            int[] iArr4 = this.f17322y0;
                            iArr4[0] = 0;
                            iArr4[1] = 0;
                            int iT = iMax3 - T(motionEvent.getY(), iMax3);
                            int iU = iMax4 - U(motionEvent.getX(), iMax4);
                            boolean zP = p(zC ? iT : 0, zD ? iU : 0, 0, this.f17322y0, this.f17319w0);
                            int[] iArr5 = this.f17319w0;
                            if (zP) {
                                iT -= iArr4[0];
                                iU -= iArr4[1];
                                iArr3[0] = iArr3[0] + iArr5[0];
                                iArr3[1] = iArr3[1] + iArr5[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i24 = iT;
                            int i25 = iU;
                            this.f17283b0 = x10 - iArr5[0];
                            this.f17284c0 = y9 - iArr5[1];
                            if (X(zC ? i24 : 0, zD ? i25 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            RunnableC1633o runnableC1633o = this.f17295k0;
                            if (runnableC1633o != null && (i24 != 0 || i25 != 0)) {
                                runnableC1633o.a(this, i24, i25);
                            }
                        }
                    } else if (actionMasked == 3) {
                        W();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.f17281U = motionEvent.getPointerId(actionIndex);
                        int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.f17283b0 = x11;
                        this.W = x11;
                        int y10 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.f17284c0 = y10;
                        this.f17282a0 = y10;
                    } else if (actionMasked == 6) {
                        O(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.f17281U = motionEvent.getPointerId(0);
                int x12 = (int) (motionEvent.getX() + 0.5f);
                this.f17283b0 = x12;
                this.W = x12;
                int y11 = (int) (motionEvent.getY() + 0.5f);
                this.f17284c0 = y11;
                this.f17282a0 = y11;
                if (zD) {
                    i3 = zC;
                    i3 = (zC ? 1 : 0) | 2;
                }
                i3 = zC;
                getScrollingChildHelper().g(i3, 0);
                this.V.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final boolean p(int i3, int i9, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i9, i10, iArr, iArr2);
    }

    public final void q(int i3, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        getScrollingChildHelper().d(i3, i9, i10, i11, iArr, i12, iArr2);
    }

    public final void r(int i3, int i9) {
        this.f17273M++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i3, scrollY - i9);
        L l2 = this.f17301n0;
        if (l2 != null) {
            l2.a(this);
        }
        ArrayList arrayList = this.f17303o0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f17303o0.get(size)).a(this);
            }
        }
        this.f17273M--;
    }

    @Override
    public final void removeDetachedView(View view, boolean z6) {
        X xG = G(view);
        if (xG != null) {
            if (xG.isTmpDetached()) {
                xG.clearTmpDetachFlag();
            } else if (!xG.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + xG + w());
            }
        }
        view.clearAnimation();
        X xG2 = G(view);
        A a2 = this.f17312t;
        if (a2 != null && xG2 != null) {
            a2.onViewDetachedFromWindow(xG2);
        }
        super.removeDetachedView(view, z6);
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        this.f17314u.getClass();
        if (!J() && view2 != null) {
            V(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        return this.f17314u.g0(this, view, rect, z6, false);
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        ArrayList arrayList = this.f17320x;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C1631m) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override
    public final void requestLayout() {
        if (this.f17261C != 0 || this.f17265E) {
            this.f17263D = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        if (this.f17278R != null) {
            return;
        }
        ((U) this.f17274N).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f17278R = edgeEffect;
        if (this.f17302o) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override
    public final void scrollBy(int i3, int i9) {
        I i10 = this.f17314u;
        if (i10 == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f17265E) {
            return;
        }
        boolean zC = i10.c();
        boolean zD = this.f17314u.d();
        if (zC || zD) {
            if (!zC) {
                i3 = 0;
            }
            if (!zD) {
                i9 = 0;
            }
            X(i3, i9, null, 0);
        }
    }

    @Override
    public final void scrollTo(int i3, int i9) {
        android.util.Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!J()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f17268G |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(Z z6) {
        this.f17313t0 = z6;
        D1.U.j(this, z6);
    }

    public void setAdapter(A a2) {
        setLayoutFrozen(false);
        A a9 = this.f17312t;
        Q q9 = this.f17291i;
        if (a9 != null) {
            a9.unregisterAdapterDataObserver(q9);
            this.f17312t.onDetachedFromRecyclerView(this);
        }
        F f9 = this.f17279S;
        if (f9 != null) {
            f9.e();
        }
        I i3 = this.f17314u;
        O o8 = this.j;
        if (i3 != null) {
            i3.c0(o8);
            this.f17314u.d0(o8);
        }
        o8.f17242a.clear();
        o8.f();
        w0 w0Var = this.f17296l;
        w0Var.r((ArrayList) w0Var.f8484c);
        w0Var.r((ArrayList) w0Var.f8485d);
        w0Var.f8482a = 0;
        A a10 = this.f17312t;
        this.f17312t = a2;
        if (a2 != null) {
            a2.registerAdapterDataObserver(q9);
            a2.onAttachedToRecyclerView(this);
        }
        I i9 = this.f17314u;
        if (i9 != null) {
            i9.L();
        }
        A a11 = this.f17312t;
        o8.f17242a.clear();
        o8.f();
        o8.e(a10, true);
        N nC = o8.c();
        if (a10 != null) {
            nC.f17240b--;
        }
        if (nC.f17240b == 0) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = nC.f17239a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                M m8 = (M) sparseArray.valueAt(i10);
                Iterator it = m8.f17235a.iterator();
                while (it.hasNext()) {
                    p000a.a.l(((X) it.next()).itemView);
                }
                m8.f17235a.clear();
                i10++;
            }
        }
        if (a11 != null) {
            nC.f17240b++;
        }
        o8.d();
        this.f17299m0.f17349e = true;
        R(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(D d4) {
        if (d4 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override
    public void setClipToPadding(boolean z6) {
        if (z6 != this.f17302o) {
            this.f17278R = null;
            this.f17276P = null;
            this.f17277Q = null;
            this.f17275O = null;
        }
        this.f17302o = z6;
        super.setClipToPadding(z6);
        if (this.f17259B) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(E e6) {
        e6.getClass();
        this.f17274N = e6;
        this.f17278R = null;
        this.f17276P = null;
        this.f17277Q = null;
        this.f17275O = null;
    }

    public void setHasFixedSize(boolean z6) {
        this.f17257A = z6;
    }

    public void setItemAnimator(F f9) {
        F f10 = this.f17279S;
        if (f10 != null) {
            f10.e();
            this.f17279S.f17186a = null;
        }
        this.f17279S = f9;
        if (f9 != null) {
            f9.f17186a = this.f17309r0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        O o8 = this.j;
        o8.f17246e = i3;
        o8.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z6) {
        suppressLayout(z6);
    }

    public void setLayoutManager(I i3) {
        RecyclerView recyclerView;
        if (i3 == this.f17314u) {
            return;
        }
        setScrollState(0);
        W w6 = this.f17293j0;
        w6.f17361n.removeCallbacks(w6);
        w6.j.abortAnimation();
        I i9 = this.f17314u;
        O o8 = this.j;
        if (i9 != null) {
            F f9 = this.f17279S;
            if (f9 != null) {
                f9.e();
            }
            this.f17314u.c0(o8);
            this.f17314u.d0(o8);
            o8.f17242a.clear();
            o8.f();
            if (this.f17323z) {
                I i10 = this.f17314u;
                i10.f17210f = false;
                i10.M(this);
            }
            this.f17314u.o0(null);
            this.f17314u = null;
        } else {
            o8.f17242a.clear();
            o8.f();
        }
        android.support.v4.media.session.q qVar = this.f17298m;
        ((C8.a) qVar.j).j();
        ArrayList arrayList = (ArrayList) qVar.f15618k;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C1642y) qVar.f15617i).f17522a;
            if (size < 0) {
                break;
            }
            X xG = G((View) arrayList.get(size));
            if (xG != null) {
                xG.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            X xG2 = G(childAt);
            A a2 = recyclerView.f17312t;
            if (a2 != null && xG2 != null) {
                a2.onViewDetachedFromWindow(xG2);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f17314u = i3;
        if (i3 != null) {
            if (i3.f17206b != null) {
                throw new IllegalArgumentException("LayoutManager " + i3 + " is already attached to a RecyclerView:" + i3.f17206b.w());
            }
            i3.o0(this);
            if (this.f17323z) {
                this.f17314u.f17210f = true;
            }
        }
        o8.m();
        requestLayout();
    }

    @Override
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override
    public void setNestedScrollingEnabled(boolean z6) {
        C0230o scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2050d) {
            WeakHashMap weakHashMap = D1.U.f1980a;
            D1.L.i(scrollingChildHelper.f2049c);
        }
        scrollingChildHelper.f2050d = z6;
    }

    public void setOnFlingListener(K k9) {
    }

    @Deprecated
    public void setOnScrollListener(L l2) {
        this.f17301n0 = l2;
    }

    public void setPreserveFocusAfterLayout(boolean z6) {
        this.f17292i0 = z6;
    }

    public void setRecycledViewPool(N n3) {
        O o8 = this.j;
        RecyclerView recyclerView = o8.f17248h;
        o8.e(recyclerView.f17312t, false);
        N n9 = o8.g;
        if (n9 != null) {
            n9.f17240b--;
        }
        o8.g = n3;
        if (n3 != null && recyclerView.getAdapter() != null) {
            o8.g.f17240b++;
        }
        o8.d();
    }

    @Deprecated
    public void setRecyclerListener(P p2) {
    }

    public void setScrollState(int i3) {
        if (i3 == this.f17280T) {
            return;
        }
        this.f17280T = i3;
        if (i3 != 2) {
            W w6 = this.f17293j0;
            w6.f17361n.removeCallbacks(w6);
            w6.j.abortAnimation();
        }
        I i9 = this.f17314u;
        if (i9 != null) {
            i9.b0(i3);
        }
        ArrayList arrayList = this.f17303o0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((L) this.f17303o0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.f17285d0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            android.util.Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.f17285d0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(V v6) {
        this.j.getClass();
    }

    @Override
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    @Override
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override
    public final void suppressLayout(boolean z6) {
        if (z6 != this.f17265E) {
            f("Do not suppressLayout in layout or scroll");
            if (!z6) {
                this.f17265E = false;
                if (this.f17263D && this.f17314u != null && this.f17312t != null) {
                    requestLayout();
                }
                this.f17263D = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f17265E = true;
            this.f17267F = true;
            setScrollState(0);
            W w6 = this.f17293j0;
            w6.f17361n.removeCallbacks(w6);
            w6.j.abortAnimation();
        }
    }

    public final void t() {
        if (this.f17275O != null) {
            return;
        }
        ((U) this.f17274N).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f17275O = edgeEffect;
        if (this.f17302o) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void u() {
        if (this.f17277Q != null) {
            return;
        }
        ((U) this.f17274N).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f17277Q = edgeEffect;
        if (this.f17302o) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void v() {
        if (this.f17276P != null) {
            return;
        }
        ((U) this.f17274N).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f17276P = edgeEffect;
        if (this.f17302o) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String w() {
        return ServerSentEventKt.SPACE + super.toString() + ", adapter:" + this.f17312t + ", layout:" + this.f17314u + ", context:" + getContext();
    }

    public final void x(T t9) {
        if (getScrollState() != 2) {
            t9.getClass();
            return;
        }
        OverScroller overScroller = this.f17293j0.j;
        overScroller.getFinalX();
        overScroller.getCurrX();
        t9.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean z(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f17320x;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1631m c1631m = (C1631m) arrayList.get(i3);
            int i9 = c1631m.f17474v;
            if (i9 == 1) {
                boolean zB = c1631m.b(motionEvent.getX(), motionEvent.getY());
                boolean zA = c1631m.a(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zB || zA)) {
                    if (zA) {
                        c1631m.f17475w = 1;
                        c1631m.f17468p = (int) motionEvent.getX();
                    } else if (zB) {
                        c1631m.f17475w = 2;
                        c1631m.f17465m = (int) motionEvent.getY();
                    }
                    c1631m.d(2);
                    if (action != 3) {
                        this.y = c1631m;
                        return true;
                    }
                }
            } else if (i9 != 2) {
                continue;
            } else if (action != 3) {
                this.y = c1631m;
                return true;
            }
        }
        return false;
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        I i3 = this.f17314u;
        if (i3 != null) {
            return i3.s(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w());
    }
}
