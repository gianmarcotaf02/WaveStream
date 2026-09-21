package androidx.appcompat.widget;

import B3.r;
import D1.U;
import Y1.w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.q;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.crypto.tink.shaded.protobuf.AbstractC1911f;
import com.kiptv.tv.R;
import h.a;
import j1.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p008a8.c;
import p020c0.C1704s0;
import p072i.ViewOnClickListenerC2181a;
import p088k.g;
import p095l.n;
import p103m.C2570j;
import p103m.C2593v;
import p103m.C2595w;
import p103m.InterfaceC2567h0;
import p103m.K0;
import p103m.R0;
import p103m.S0;
import p103m.T0;
import p103m.U0;
import p103m.V0;
import p103m.W0;
import p103m.X0;
import p103m.Y;
import p103m.Y0;
import p103m.g1;

public class Toolbar extends ViewGroup {

    public K0 f15739A;

    public int f15740B;

    public int f15741C;

    public final int f15742D;

    public CharSequence f15743E;

    public CharSequence f15744F;

    public ColorStateList f15745G;
    public ColorStateList H;

    public boolean f15746I;

    public boolean f15747J;

    public final ArrayList f15748K;

    public final ArrayList f15749L;

    public final int[] f15750M;

    public final q f15751N;

    public ArrayList f15752O;

    public final C1704s0 f15753P;

    public Y0 f15754Q;

    public C2570j f15755R;

    public T0 f15756S;

    public boolean f15757T;

    public OnBackInvokedCallback f15758U;
    public OnBackInvokedDispatcher V;
    public boolean W;

    public final r f15759a0;

    public ActionMenuView f15760h;

    public Y f15761i;
    public Y j;

    public C2593v f15762k;

    public C2595w f15763l;

    public final Drawable f15764m;

    public final CharSequence f15765n;

    public C2593v f15766o;

    public View f15767p;

    public Context f15768q;

    public int f15769r;

    public int f15770s;

    public int f15771t;

    public final int f15772u;

    public final int f15773v;

    public int f15774w;

    public int f15775x;
    public int y;

    public int f15776z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f15742D = 8388627;
        this.f15748K = new ArrayList();
        this.f15749L = new ArrayList();
        this.f15750M = new int[2];
        this.f15751N = new q(new R0(this, 1));
        this.f15752O = new ArrayList();
        this.f15753P = new C1704s0(13, this);
        this.f15759a0 = new r(14, this);
        Context context2 = getContext();
        int[] iArr = a.f22425w;
        l lVarS = l.s(context2, attributeSet, iArr, R.attr.toolbarStyle);
        U.i(this, context, iArr, attributeSet, (TypedArray) lVarS.j, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) lVarS.j;
        this.f15770s = typedArray.getResourceId(28, 0);
        this.f15771t = typedArray.getResourceId(19, 0);
        this.f15742D = typedArray.getInteger(0, 8388627);
        this.f15772u = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f15776z = dimensionPixelOffset;
        this.y = dimensionPixelOffset;
        this.f15775x = dimensionPixelOffset;
        this.f15774w = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f15774w = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f15775x = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.y = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f15776z = dimensionPixelOffset5;
        }
        this.f15773v = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        K0 k1 = this.f15739A;
        k1.f24936h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            k1.f24934e = dimensionPixelSize;
            k1.f24930a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            k1.f24935f = dimensionPixelSize2;
            k1.f24931b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            k1.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f15740B = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f15741C = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f15764m = lVarS.l(4);
        this.f15765n = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f15768q = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableL = lVarS.l(16);
        if (drawableL != null) {
            setNavigationIcon(drawableL);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableL2 = lVarS.l(11);
        if (drawableL2 != null) {
            setLogo(drawableL2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(lVarS.k(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(lVarS.k(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        lVarS.u();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new g(getContext());
    }

    public static U0 h() {
        U0 u1 = new U0(-2, -2);
        u1.f24978b = 0;
        u1.f24977a = 8388627;
        return u1;
    }

    public static U0 i(ViewGroup.LayoutParams layoutParams) {
        boolean z6 = layoutParams instanceof U0;
        if (z6) {
            U0 u1 = (U0) layoutParams;
            U0 u6 = new U0(u1);
            u6.f24978b = 0;
            u6.f24978b = u1.f24978b;
            return u6;
        }
        if (z6) {
            U0 u7 = new U0((U0) layoutParams);
            u7.f24978b = 0;
            return u7;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            U0 u8 = new U0(layoutParams);
            u8.f24978b = 0;
            return u8;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        U0 u9 = new U0(marginLayoutParams);
        u9.f24978b = 0;
        ((ViewGroup.MarginLayoutParams) u9).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) u9).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) u9).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) u9).bottomMargin = marginLayoutParams.bottomMargin;
        return u9;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i3, ArrayList arrayList) {
        boolean z6 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z6) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                U0 u1 = (U0) childAt.getLayoutParams();
                if (u1.f24978b == 0 && s(childAt)) {
                    int i10 = u1.f24977a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            View childAt2 = getChildAt(i11);
            U0 u6 = (U0) childAt2.getLayoutParams();
            if (u6.f24978b == 0 && s(childAt2)) {
                int i12 = u6.f24977a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i12, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z6) {
        U0 u0I;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            u0I = h();
        } else {
            u0I = !checkLayoutParams(layoutParams) ? i(layoutParams) : (U0) layoutParams;
        }
        u0I.f24978b = 1;
        if (!z6 || this.f15767p == null) {
            addView(view, u0I);
        } else {
            view.setLayoutParams(u0I);
            this.f15749L.add(view);
        }
    }

    public final void c() {
        if (this.f15766o == null) {
            C2593v c2593v = new C2593v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f15766o = c2593v;
            c2593v.setImageDrawable(this.f15764m);
            this.f15766o.setContentDescription(this.f15765n);
            U0 u0H = h();
            u0H.f24977a = (this.f15772u & 112) | 8388611;
            u0H.f24978b = 2;
            this.f15766o.setLayoutParams(u0H);
            this.f15766o.setOnClickListener(new ViewOnClickListenerC2181a(2, this));
        }
    }

    @Override
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof U0);
    }

    public final void d() {
        if (this.f15739A == null) {
            K0 k1 = new K0();
            k1.f24930a = 0;
            k1.f24931b = 0;
            k1.f24932c = Integer.MIN_VALUE;
            k1.f24933d = Integer.MIN_VALUE;
            k1.f24934e = 0;
            k1.f24935f = 0;
            k1.g = false;
            k1.f24936h = false;
            this.f15739A = k1;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f15760h;
        if (actionMenuView.f15723w == null) {
            p095l.l lVar = (p095l.l) actionMenuView.getMenu();
            if (this.f15756S == null) {
                this.f15756S = new T0(this);
            }
            this.f15760h.setExpandedActionViewsExclusive(true);
            lVar.b(this.f15756S, this.f15768q);
            t();
        }
    }

    public final void f() {
        if (this.f15760h == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f15760h = actionMenuView;
            actionMenuView.setPopupTheme(this.f15769r);
            this.f15760h.setOnMenuItemClickListener(this.f15753P);
            ActionMenuView actionMenuView2 = this.f15760h;
            c cVar = new c(12, this);
            actionMenuView2.getClass();
            actionMenuView2.f15717B = cVar;
            U0 u0H = h();
            u0H.f24977a = (this.f15772u & 112) | 8388613;
            this.f15760h.setLayoutParams(u0H);
            b(this.f15760h, false);
        }
    }

    public final void g() {
        if (this.f15762k == null) {
            this.f15762k = new C2593v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            U0 u0H = h();
            u0H.f24977a = (this.f15772u & 112) | 8388611;
            this.f15762k.setLayoutParams(u0H);
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C2593v c2593v = this.f15766o;
        if (c2593v != null) {
            return c2593v.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C2593v c2593v = this.f15766o;
        if (c2593v != null) {
            return c2593v.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        K0 k1 = this.f15739A;
        if (k1 != null) {
            return k1.g ? k1.f24930a : k1.f24931b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f15741C;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        K0 k1 = this.f15739A;
        if (k1 != null) {
            return k1.f24930a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        K0 k1 = this.f15739A;
        if (k1 != null) {
            return k1.f24931b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        K0 k1 = this.f15739A;
        if (k1 != null) {
            return k1.g ? k1.f24931b : k1.f24930a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f15740B;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        p095l.l lVar;
        ActionMenuView actionMenuView = this.f15760h;
        return (actionMenuView == null || (lVar = actionMenuView.f15723w) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f15741C, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f15740B, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C2595w c2595w = this.f15763l;
        if (c2595w != null) {
            return c2595w.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C2595w c2595w = this.f15763l;
        if (c2595w != null) {
            return c2595w.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f15760h.getMenu();
    }

    public View getNavButtonView() {
        return this.f15762k;
    }

    public CharSequence getNavigationContentDescription() {
        C2593v c2593v = this.f15762k;
        if (c2593v != null) {
            return c2593v.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C2593v c2593v = this.f15762k;
        if (c2593v != null) {
            return c2593v.getDrawable();
        }
        return null;
    }

    public C2570j getOuterActionMenuPresenter() {
        return this.f15755R;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f15760h.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f15768q;
    }

    public int getPopupTheme() {
        return this.f15769r;
    }

    public CharSequence getSubtitle() {
        return this.f15744F;
    }

    public final TextView getSubtitleTextView() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.f15743E;
    }

    public int getTitleMarginBottom() {
        return this.f15776z;
    }

    public int getTitleMarginEnd() {
        return this.f15775x;
    }

    public int getTitleMarginStart() {
        return this.f15774w;
    }

    public int getTitleMarginTop() {
        return this.y;
    }

    public final TextView getTitleTextView() {
        return this.f15761i;
    }

    public InterfaceC2567h0 getWrapper() {
        Drawable drawable;
        if (this.f15754Q == null) {
            Y0 y9 = new Y0();
            y9.f25000n = 0;
            y9.f24989a = this;
            y9.f24995h = getTitle();
            y9.f24996i = getSubtitle();
            y9.g = y9.f24995h != null;
            y9.f24994f = getNavigationIcon();
            l lVarS = l.s(getContext(), null, a.f22405a, R.attr.actionBarStyle);
            y9.f25001o = lVarS.l(15);
            TypedArray typedArray = (TypedArray) lVarS.j;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                y9.g = true;
                y9.f24995h = text;
                if ((y9.f24990b & 8) != 0) {
                    Toolbar toolbar = y9.f24989a;
                    toolbar.setTitle(text);
                    if (y9.g) {
                        U.k(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                y9.f24996i = text2;
                if ((y9.f24990b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableL = lVarS.l(20);
            if (drawableL != null) {
                y9.f24993e = drawableL;
                y9.c();
            }
            Drawable drawableL2 = lVarS.l(17);
            if (drawableL2 != null) {
                y9.f24992d = drawableL2;
                y9.c();
            }
            if (y9.f24994f == null && (drawable = y9.f25001o) != null) {
                y9.f24994f = drawable;
                int i3 = y9.f24990b & 4;
                Toolbar toolbar2 = y9.f24989a;
                if (i3 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            y9.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = y9.f24991c;
                if (view != null && (y9.f24990b & 16) != 0) {
                    removeView(view);
                }
                y9.f24991c = viewInflate;
                if (viewInflate != null && (y9.f24990b & 16) != 0) {
                    addView(viewInflate);
                }
                y9.a(y9.f24990b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f15739A.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f15770s = resourceId2;
                Y y = this.f15761i;
                if (y != null) {
                    y.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f15771t = resourceId3;
                Y y10 = this.j;
                if (y10 != null) {
                    y10.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            lVarS.u();
            if (R.string.abc_action_bar_up_description != y9.f25000n) {
                y9.f25000n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i9 = y9.f25000n;
                    y9.j = i9 != 0 ? getContext().getString(i9) : null;
                    y9.b();
                }
            }
            y9.j = getNavigationContentDescription();
            setNavigationOnClickListener(new X0(y9));
            this.f15754Q = y9;
        }
        return this.f15754Q;
    }

    public final int j(int i3, View view) {
        U0 u1 = (U0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i10 = u1.f24977a & 112;
        if (i10 != 16 && i10 != 48 && i10 != 80) {
            i10 = this.f15742D & 112;
        }
        if (i10 == 48) {
            return getPaddingTop() - i9;
        }
        if (i10 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) u1).bottomMargin) - i9;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = ((ViewGroup.MarginLayoutParams) u1).topMargin;
        if (iMax < i11) {
            iMax = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i13 = ((ViewGroup.MarginLayoutParams) u1).bottomMargin;
            if (i12 < i13) {
                iMax = Math.max(0, iMax - (i13 - i12));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.f15752O.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f15751N.j).iterator();
        while (it2.hasNext()) {
            ((w) it2.next()).f11351a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f15752O = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f15749L.contains(view);
    }

    public final int o(View view, int i3, int i9, int[] iArr) {
        U0 u1 = (U0) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) u1).leftMargin - iArr[0];
        int iMax = Math.max(0, i10) + i3;
        iArr[0] = Math.max(0, -i10);
        int iJ = j(i9, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) u1).rightMargin + iMax;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f15759a0);
        t();
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f15747J = false;
        }
        if (!this.f15747J) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f15747J = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f15747J = false;
        return true;
    }

    @Override
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        int iO;
        int iP;
        int iMax;
        int iMin;
        boolean zS;
        boolean zS2;
        int measuredHeight;
        Y y;
        Y y9;
        U0 u1;
        U0 u6;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iMax2;
        int i21;
        int i22;
        int i23;
        int i24;
        ArrayList arrayList;
        int size;
        int iO2;
        int i25;
        int size2;
        int i26;
        int size3;
        int i27;
        int i28;
        int i29;
        int measuredWidth;
        int i30;
        int i31;
        int i32;
        int size4;
        boolean z10 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.f15750M;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = U.f1980a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i11 - i9) : 0;
        if (s(this.f15762k)) {
            if (z10) {
                iP = p(this.f15762k, i33, iMin2, iArr);
                iO = paddingLeft;
            } else {
                iO = o(this.f15762k, paddingLeft, iMin2, iArr);
            }
            if (s(this.f15766o)) {
                if (z10) {
                    iP = p(this.f15766o, iP, iMin2, iArr);
                } else {
                    iO = o(this.f15766o, iO, iMin2, iArr);
                }
            }
            if (s(this.f15760h)) {
                if (z10) {
                    iO = o(this.f15760h, iO, iMin2, iArr);
                } else {
                    iP = p(this.f15760h, iP, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iO);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iP));
            iMax = Math.max(iO, currentContentInsetLeft);
            iMin = Math.min(iP, i33 - currentContentInsetRight);
            if (s(this.f15767p)) {
                if (z10) {
                    iMin = p(this.f15767p, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f15767p, iMax, iMin2, iArr);
                }
            }
            if (s(this.f15763l)) {
                if (z10) {
                    iMin = p(this.f15763l, iMin, iMin2, iArr);
                } else {
                    iMax = o(this.f15763l, iMax, iMin2, iArr);
                }
            }
            zS = s(this.f15761i);
            zS2 = s(this.j);
            if (zS) {
                U0 u7 = (U0) this.f15761i.getLayoutParams();
                measuredHeight = this.f15761i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u7).topMargin + ((ViewGroup.MarginLayoutParams) u7).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zS2) {
                U0 u8 = (U0) this.j.getLayoutParams();
                measuredHeight = this.j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u8).topMargin + ((ViewGroup.MarginLayoutParams) u8).bottomMargin + measuredHeight;
            }
            if (zS || zS2) {
                if (zS) {
                    y = this.f15761i;
                } else {
                    y = this.j;
                }
                if (zS2) {
                    y9 = this.j;
                } else {
                    y9 = this.f15761i;
                }
                u1 = (U0) y.getLayoutParams();
                u6 = (U0) y9.getLayoutParams();
                i12 = measuredHeight;
                z9 = (!zS && this.f15761i.getMeasuredWidth() > 0) || (zS2 && this.j.getMeasuredWidth() > 0);
                i13 = this.f15742D & 112;
                i14 = iMax;
                if (i13 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u1).topMargin + this.y;
                } else if (i13 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i12) / 2;
                    i21 = ((ViewGroup.MarginLayoutParams) u1).topMargin + this.y;
                    if (iMax2 < i21) {
                        iMax2 = i21;
                    } else {
                        i22 = (((height - paddingBottom) - i12) - iMax2) - paddingTop2;
                        i23 = ((ViewGroup.MarginLayoutParams) u1).bottomMargin;
                        i24 = this.f15776z;
                        if (i22 < i23 + i24) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u6).bottomMargin + i24) - i22));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u6).bottomMargin) - this.f15776z) - i12;
                }
                if (z10) {
                    if (z9) {
                        i18 = this.f15774w;
                    } else {
                        i18 = 0;
                    }
                    int i34 = i18 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zS) {
                        U0 u9 = (U0) this.f15761i.getLayoutParams();
                        int measuredWidth2 = iMin - this.f15761i.getMeasuredWidth();
                        int measuredHeight2 = this.f15761i.getMeasuredHeight() + paddingTop;
                        this.f15761i.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i19 = measuredWidth2 - this.f15775x;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) u9).bottomMargin;
                    } else {
                        i19 = iMin;
                    }
                    if (zS2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.j.getLayoutParams())).topMargin;
                        this.j.layout(iMin - this.j.getMeasuredWidth(), i35, iMin, this.j.getMeasuredHeight() + i35);
                        i20 = iMin - this.f15775x;
                    } else {
                        i20 = iMin;
                    }
                    if (z9) {
                        iMin = Math.min(i19, i20);
                    }
                    iMax = i14;
                } else {
                    if (z9) {
                        i15 = this.f15774w;
                    } else {
                        i15 = 0;
                    }
                    int i36 = i15 - iArr[0];
                    iMax = Math.max(0, i36) + i14;
                    iArr[0] = Math.max(0, -i36);
                    if (zS) {
                        U0 u10 = (U0) this.f15761i.getLayoutParams();
                        int measuredWidth3 = this.f15761i.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f15761i.getMeasuredHeight() + paddingTop;
                        this.f15761i.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i16 = measuredWidth3 + this.f15775x;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) u10).bottomMargin;
                    } else {
                        i16 = iMax;
                    }
                    if (zS2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.j.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.j.getMeasuredWidth() + iMax;
                        this.j.layout(iMax, i37, measuredWidth4, this.j.getMeasuredHeight() + i37);
                        i17 = measuredWidth4 + this.f15775x;
                    } else {
                        i17 = iMax;
                    }
                    if (z9) {
                        iMax = Math.max(i16, i17);
                    }
                }
            }
            arrayList = this.f15748K;
            a(3, arrayList);
            size = arrayList.size();
            iO2 = iMax;
            for (i25 = 0; i25 < size; i25++) {
                iO2 = o((View) arrayList.get(i25), iO2, iMin2, iArr);
            }
            a(5, arrayList);
            size2 = arrayList.size();
            for (i26 = 0; i26 < size2; i26++) {
                iMin = p((View) arrayList.get(i26), iMin, iMin2, iArr);
            }
            a(1, arrayList);
            int i38 = iArr[0];
            int i39 = iArr[1];
            size3 = arrayList.size();
            i27 = i39;
            i28 = i38;
            i29 = 0;
            measuredWidth = 0;
            while (i29 < size3) {
                View view = (View) arrayList.get(i29);
                U0 u11 = (U0) view.getLayoutParams();
                int i40 = i29;
                int i41 = ((ViewGroup.MarginLayoutParams) u11).leftMargin - i28;
                int i42 = ((ViewGroup.MarginLayoutParams) u11).rightMargin - i27;
                int iMax3 = Math.max(0, i41);
                int iMax4 = Math.max(0, i42);
                int iMax5 = Math.max(0, -i41);
                int iMax6 = Math.max(0, -i42);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i27 = iMax6;
                i28 = iMax5;
                i29 = i40 + 1;
            }
            i31 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i32 = measuredWidth + i31;
            if (i31 >= iO2) {
                if (i32 > iMin) {
                    iO2 = i31 - (i32 - iMin);
                } else {
                    iO2 = i31;
                }
            }
            size4 = arrayList.size();
            for (i30 = 0; i30 < size4; i30++) {
                iO2 = o((View) arrayList.get(i30), iO2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iO = paddingLeft;
        iP = i33;
        if (s(this.f15766o)) {
            if (z10) {
                iP = p(this.f15766o, iP, iMin2, iArr);
            } else {
                iO = o(this.f15766o, iO, iMin2, iArr);
            }
        }
        if (s(this.f15760h)) {
            if (z10) {
                iO = o(this.f15760h, iO, iMin2, iArr);
            } else {
                iP = p(this.f15760h, iP, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iO);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iP));
        iMax = Math.max(iO, currentContentInsetLeft2);
        iMin = Math.min(iP, i33 - currentContentInsetRight2);
        if (s(this.f15767p)) {
            if (z10) {
                iMin = p(this.f15767p, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f15767p, iMax, iMin2, iArr);
            }
        }
        if (s(this.f15763l)) {
            if (z10) {
                iMin = p(this.f15763l, iMin, iMin2, iArr);
            } else {
                iMax = o(this.f15763l, iMax, iMin2, iArr);
            }
        }
        zS = s(this.f15761i);
        zS2 = s(this.j);
        if (zS) {
            U0 u12 = (U0) this.f15761i.getLayoutParams();
            measuredHeight = this.f15761i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u12).topMargin + ((ViewGroup.MarginLayoutParams) u12).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zS2) {
            U0 u13 = (U0) this.j.getLayoutParams();
            measuredHeight = this.j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) u13).topMargin + ((ViewGroup.MarginLayoutParams) u13).bottomMargin + measuredHeight;
        }
        if (zS) {
            if (zS) {
                y = this.f15761i;
            } else {
                y = this.j;
            }
            if (zS2) {
                y9 = this.j;
            } else {
                y9 = this.f15761i;
            }
            u1 = (U0) y.getLayoutParams();
            u6 = (U0) y9.getLayoutParams();
            i12 = measuredHeight;
            if (zS) {
            }
            i13 = this.f15742D & 112;
            i14 = iMax;
            if (i13 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u1).topMargin + this.y;
            } else if (i13 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i12) / 2;
                i21 = ((ViewGroup.MarginLayoutParams) u1).topMargin + this.y;
                if (iMax2 < i21) {
                    iMax2 = i21;
                } else {
                    i22 = (((height - paddingBottom) - i12) - iMax2) - paddingTop2;
                    i23 = ((ViewGroup.MarginLayoutParams) u1).bottomMargin;
                    i24 = this.f15776z;
                    if (i22 < i23 + i24) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u6).bottomMargin + i24) - i22));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u6).bottomMargin) - this.f15776z) - i12;
            }
            if (z10) {
                if (z9) {
                    i18 = this.f15774w;
                } else {
                    i18 = 0;
                }
                int i310 = i18 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zS) {
                    U0 u14 = (U0) this.f15761i.getLayoutParams();
                    int measuredWidth5 = iMin - this.f15761i.getMeasuredWidth();
                    int measuredHeight4 = this.f15761i.getMeasuredHeight() + paddingTop;
                    this.f15761i.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i19 = measuredWidth5 - this.f15775x;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) u14).bottomMargin;
                } else {
                    i19 = iMin;
                }
                if (zS2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.j.getLayoutParams())).topMargin;
                    this.j.layout(iMin - this.j.getMeasuredWidth(), i311, iMin, this.j.getMeasuredHeight() + i311);
                    i20 = iMin - this.f15775x;
                } else {
                    i20 = iMin;
                }
                if (z9) {
                    iMin = Math.min(i19, i20);
                }
                iMax = i14;
            } else {
                if (z9) {
                    i15 = this.f15774w;
                } else {
                    i15 = 0;
                }
                int i312 = i15 - iArr[0];
                iMax = Math.max(0, i312) + i14;
                iArr[0] = Math.max(0, -i312);
                if (zS) {
                    U0 u15 = (U0) this.f15761i.getLayoutParams();
                    int measuredWidth6 = this.f15761i.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f15761i.getMeasuredHeight() + paddingTop;
                    this.f15761i.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i16 = measuredWidth6 + this.f15775x;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) u15).bottomMargin;
                } else {
                    i16 = iMax;
                }
                if (zS2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.j.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.j.getMeasuredWidth() + iMax;
                    this.j.layout(iMax, i313, measuredWidth7, this.j.getMeasuredHeight() + i313);
                    i17 = measuredWidth7 + this.f15775x;
                } else {
                    i17 = iMax;
                }
                if (z9) {
                    iMax = Math.max(i16, i17);
                }
            }
        } else {
            if (zS) {
                y = this.f15761i;
            } else {
                y = this.j;
            }
            if (zS2) {
                y9 = this.j;
            } else {
                y9 = this.f15761i;
            }
            u1 = (U0) y.getLayoutParams();
            u6 = (U0) y9.getLayoutParams();
            i12 = measuredHeight;
            if (zS) {
            }
            i13 = this.f15742D & 112;
            i14 = iMax;
            if (i13 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) u1).topMargin + this.y;
            } else if (i13 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i12) / 2;
                i21 = ((ViewGroup.MarginLayoutParams) u1).topMargin + this.y;
                if (iMax2 < i21) {
                    iMax2 = i21;
                } else {
                    i22 = (((height - paddingBottom) - i12) - iMax2) - paddingTop2;
                    i23 = ((ViewGroup.MarginLayoutParams) u1).bottomMargin;
                    i24 = this.f15776z;
                    if (i22 < i23 + i24) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) u6).bottomMargin + i24) - i22));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) u6).bottomMargin) - this.f15776z) - i12;
            }
            if (z10) {
                if (z9) {
                    i18 = this.f15774w;
                } else {
                    i18 = 0;
                }
                int i314 = i18 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zS) {
                    U0 u16 = (U0) this.f15761i.getLayoutParams();
                    int measuredWidth8 = iMin - this.f15761i.getMeasuredWidth();
                    int measuredHeight6 = this.f15761i.getMeasuredHeight() + paddingTop;
                    this.f15761i.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i19 = measuredWidth8 - this.f15775x;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) u16).bottomMargin;
                } else {
                    i19 = iMin;
                }
                if (zS2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.j.getLayoutParams())).topMargin;
                    this.j.layout(iMin - this.j.getMeasuredWidth(), i315, iMin, this.j.getMeasuredHeight() + i315);
                    i20 = iMin - this.f15775x;
                } else {
                    i20 = iMin;
                }
                if (z9) {
                    iMin = Math.min(i19, i20);
                }
                iMax = i14;
            } else {
                if (z9) {
                    i15 = this.f15774w;
                } else {
                    i15 = 0;
                }
                int i316 = i15 - iArr[0];
                iMax = Math.max(0, i316) + i14;
                iArr[0] = Math.max(0, -i316);
                if (zS) {
                    U0 u17 = (U0) this.f15761i.getLayoutParams();
                    int measuredWidth9 = this.f15761i.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f15761i.getMeasuredHeight() + paddingTop;
                    this.f15761i.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i16 = measuredWidth9 + this.f15775x;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) u17).bottomMargin;
                } else {
                    i16 = iMax;
                }
                if (zS2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((U0) this.j.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.j.getMeasuredWidth() + iMax;
                    this.j.layout(iMax, i317, measuredWidth10, this.j.getMeasuredHeight() + i317);
                    i17 = measuredWidth10 + this.f15775x;
                } else {
                    i17 = iMax;
                }
                if (z9) {
                    iMax = Math.max(i16, i17);
                }
            }
        }
        arrayList = this.f15748K;
        a(3, arrayList);
        size = arrayList.size();
        iO2 = iMax;
        while (i25 < size) {
            iO2 = o((View) arrayList.get(i25), iO2, iMin2, iArr);
        }
        a(5, arrayList);
        size2 = arrayList.size();
        while (i26 < size2) {
            iMin = p((View) arrayList.get(i26), iMin, iMin2, iArr);
        }
        a(1, arrayList);
        int i318 = iArr[0];
        int i319 = iArr[1];
        size3 = arrayList.size();
        i27 = i319;
        i28 = i318;
        i29 = 0;
        measuredWidth = 0;
        while (i29 < size3) {
            View view2 = (View) arrayList.get(i29);
            U0 u18 = (U0) view2.getLayoutParams();
            int i43 = i29;
            int i44 = ((ViewGroup.MarginLayoutParams) u18).leftMargin - i28;
            int i45 = ((ViewGroup.MarginLayoutParams) u18).rightMargin - i27;
            int iMax7 = Math.max(0, i44);
            int iMax8 = Math.max(0, i45);
            int iMax9 = Math.max(0, -i44);
            int iMax10 = Math.max(0, -i45);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i27 = iMax10;
            i28 = iMax9;
            i29 = i43 + 1;
        }
        i31 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i32 = measuredWidth + i31;
        if (i31 >= iO2) {
            if (i32 > iMin) {
                iO2 = i31 - (i32 - iMin);
            } else {
                iO2 = i31;
            }
        }
        size4 = arrayList.size();
        while (i30 < size4) {
            iO2 = o((View) arrayList.get(i30), iO2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        char c9;
        Object[] objArr;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z6 = g1.f25041a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c9 = 0;
        } else {
            c9 = 1;
            objArr = false;
        }
        if (s(this.f15762k)) {
            r(this.f15762k, i3, 0, i9, this.f15773v);
            iK = k(this.f15762k) + this.f15762k.getMeasuredWidth();
            iMax = Math.max(0, l(this.f15762k) + this.f15762k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f15762k.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.f15766o)) {
            r(this.f15766o, i3, 0, i9, this.f15773v);
            iK = k(this.f15766o) + this.f15766o.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f15766o) + this.f15766o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f15766o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        Object[] objArr2 = objArr;
        int[] iArr = this.f15750M;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (s(this.f15760h)) {
            r(this.f15760h, i3, iMax3, i9, this.f15773v);
            iK2 = k(this.f15760h) + this.f15760h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f15760h) + this.f15760h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f15760h.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c9] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.f15767p)) {
            iMax5 += q(this.f15767p, i3, iMax5, i9, 0, iArr);
            iMax = Math.max(iMax, l(this.f15767p) + this.f15767p.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f15767p.getMeasuredState());
        }
        if (s(this.f15763l)) {
            iMax5 += q(this.f15763l, i3, iMax5, i9, 0, iArr);
            iMax = Math.max(iMax, l(this.f15763l) + this.f15763l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f15763l.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((U0) childAt.getLayoutParams()).f24978b == 0 && s(childAt)) {
                iMax5 += q(childAt, i3, iMax5, i9, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i12 = iMax5;
        int i13 = this.y + this.f15776z;
        int i14 = this.f15774w + this.f15775x;
        if (s(this.f15761i)) {
            q(this.f15761i, i3, i12 + i14, i9, i13, iArr);
            int iK3 = k(this.f15761i) + this.f15761i.getMeasuredWidth();
            iL = l(this.f15761i) + this.f15761i.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f15761i.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.j)) {
            iMax2 = Math.max(iMax2, q(this.j, i3, i12 + i14, i9, i13 + iL, iArr));
            iL += l(this.j) + this.j.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.j.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i9, iCombineMeasuredStates2 << 16);
        if (!this.f15757T) {
            i10 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i10 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i10);
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof W0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        W0 w6 = (W0) parcelable;
        super.onRestoreInstanceState(w6.f7299h);
        ActionMenuView actionMenuView = this.f15760h;
        p095l.l lVar = actionMenuView != null ? actionMenuView.f15723w : null;
        int i3 = w6.j;
        if (i3 != 0 && this.f15756S != null && lVar != null && (menuItemFindItem = lVar.findItem(i3)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (w6.f24979k) {
            r rVar = this.f15759a0;
            removeCallbacks(rVar);
            post(rVar);
        }
    }

    @Override
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        K0 k1 = this.f15739A;
        boolean z6 = i3 == 1;
        if (z6 == k1.g) {
            return;
        }
        k1.g = z6;
        if (!k1.f24936h) {
            k1.f24930a = k1.f24934e;
            k1.f24931b = k1.f24935f;
            return;
        }
        if (z6) {
            int i9 = k1.f24933d;
            if (i9 == Integer.MIN_VALUE) {
                i9 = k1.f24934e;
            }
            k1.f24930a = i9;
            int i10 = k1.f24932c;
            if (i10 == Integer.MIN_VALUE) {
                i10 = k1.f24935f;
            }
            k1.f24931b = i10;
            return;
        }
        int i11 = k1.f24932c;
        if (i11 == Integer.MIN_VALUE) {
            i11 = k1.f24934e;
        }
        k1.f24930a = i11;
        int i12 = k1.f24933d;
        if (i12 == Integer.MIN_VALUE) {
            i12 = k1.f24935f;
        }
        k1.f24931b = i12;
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        C2570j c2570j;
        n nVar;
        W0 w6 = new W0(super.onSaveInstanceState());
        T0 t9 = this.f15756S;
        if (t9 != null && (nVar = t9.f24965i) != null) {
            w6.j = nVar.f24663a;
        }
        ActionMenuView actionMenuView = this.f15760h;
        w6.f24979k = (actionMenuView == null || (c2570j = actionMenuView.f15716A) == null || !c2570j.h()) ? false : true;
        return w6;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f15746I = false;
        }
        if (!this.f15746I) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f15746I = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f15746I = false;
        return true;
    }

    public final int p(View view, int i3, int i9, int[] iArr) {
        U0 u1 = (U0) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) u1).rightMargin - iArr[1];
        int iMax = i3 - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int iJ = j(i9, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) u1).leftMargin);
    }

    public final int q(View view, int i3, int i9, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i13) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + iMax + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i3, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z6) {
        if (this.W != z6) {
            this.W = z6;
            t();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(AbstractC1903s.y(getContext(), i3));
    }

    public void setCollapsible(boolean z6) {
        this.f15757T = z6;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f15741C) {
            this.f15741C = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f15740B) {
            this.f15740B = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(AbstractC1903s.y(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(AbstractC1903s.y(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f15762k.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f15760h.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f15769r != i3) {
            this.f15769r = i3;
            if (i3 == 0) {
                this.f15768q = getContext();
            } else {
                this.f15768q = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f15776z = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f15775x = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f15774w = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.y = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = S0.a(this);
            T0 t9 = this.f15756S;
            boolean z6 = (t9 == null || t9.f24965i == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.W) ? false : true;
            if (z6 && this.V == null) {
                if (this.f15758U == null) {
                    this.f15758U = S0.b(new R0(this, 0));
                }
                S0.c(onBackInvokedDispatcherA, this.f15758U);
                this.V = onBackInvokedDispatcherA;
                return;
            }
            if (z6 || (onBackInvokedDispatcher = this.V) == null) {
                return;
            }
            S0.d(onBackInvokedDispatcher, this.f15758U);
            this.V = null;
        }
    }

    @Override
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        U0 u1 = new U0(context, attributeSet);
        u1.f24977a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f22406b);
        u1.f24977a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        u1.f24978b = 0;
        return u1;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C2593v c2593v = this.f15766o;
        if (c2593v != null) {
            c2593v.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f15766o.setImageDrawable(drawable);
        } else {
            C2593v c2593v = this.f15766o;
            if (c2593v != null) {
                c2593v.setImageDrawable(this.f15764m);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f15763l == null) {
                this.f15763l = new C2595w(getContext(), null, 0);
            }
            if (!n(this.f15763l)) {
                b(this.f15763l, true);
            }
        } else {
            C2595w c2595w = this.f15763l;
            if (c2595w != null && n(c2595w)) {
                removeView(this.f15763l);
                this.f15749L.remove(this.f15763l);
            }
        }
        C2595w c2595w2 = this.f15763l;
        if (c2595w2 != null) {
            c2595w2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f15763l == null) {
            this.f15763l = new C2595w(getContext(), null, 0);
        }
        C2595w c2595w = this.f15763l;
        if (c2595w != null) {
            c2595w.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C2593v c2593v = this.f15762k;
        if (c2593v != null) {
            c2593v.setContentDescription(charSequence);
            AbstractC1911f.E(this.f15762k, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f15762k)) {
                b(this.f15762k, true);
            }
        } else {
            C2593v c2593v = this.f15762k;
            if (c2593v != null && n(c2593v)) {
                removeView(this.f15762k);
                this.f15749L.remove(this.f15762k);
            }
        }
        C2593v c2593v2 = this.f15762k;
        if (c2593v2 != null) {
            c2593v2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Y y = this.j;
            if (y != null && n(y)) {
                removeView(this.j);
                this.f15749L.remove(this.j);
            }
        } else {
            if (this.j == null) {
                Context context = getContext();
                Y y9 = new Y(context, null);
                this.j = y9;
                y9.setSingleLine();
                this.j.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f15771t;
                if (i3 != 0) {
                    this.j.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.j.setTextColor(colorStateList);
                }
            }
            if (!n(this.j)) {
                b(this.j, true);
            }
        }
        Y y10 = this.j;
        if (y10 != null) {
            y10.setText(charSequence);
        }
        this.f15744F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        Y y = this.j;
        if (y != null) {
            y.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Y y = this.f15761i;
            if (y != null && n(y)) {
                removeView(this.f15761i);
                this.f15749L.remove(this.f15761i);
            }
        } else {
            if (this.f15761i == null) {
                Context context = getContext();
                Y y9 = new Y(context, null);
                this.f15761i = y9;
                y9.setSingleLine();
                this.f15761i.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f15770s;
                if (i3 != 0) {
                    this.f15761i.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f15745G;
                if (colorStateList != null) {
                    this.f15761i.setTextColor(colorStateList);
                }
            }
            if (!n(this.f15761i)) {
                b(this.f15761i, true);
            }
        }
        Y y10 = this.f15761i;
        if (y10 != null) {
            y10.setText(charSequence);
        }
        this.f15743E = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f15745G = colorStateList;
        Y y = this.f15761i;
        if (y != null) {
            y.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(V0 v6) {
    }
}
