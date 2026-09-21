package androidx.core.widget;

import A.a;
import D1.C;
import D1.C0224i;
import D1.C0230o;
import D1.C0238x;
import D1.D;
import D1.E;
import D1.InterfaceC0232q;
import D1.L;
import D1.U;
import D1.V;
import D1.r;
import E8.d;
import H1.c;
import H1.e;
import H1.f;
import H1.g;
import H1.h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.media3.common.util.Log;
import androidx.media3.extractor.ts.TsExtractor;
import com.revenuecat.purchases.common.events.BackendEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements InterfaceC0232q, ScrollingView {

    public static final float f16086J = (float) (Math.log(0.78d) / Math.log(0.9d));

    public static final e f16087K = new e();

    public static final int[] f16088L = {R.attr.fillViewport};

    public final int[] f16089A;

    public final int[] f16090B;

    public int f16091C;

    public int f16092D;

    public h f16093E;

    public final r f16094F;

    public final C0230o f16095G;
    public float H;

    public final C0224i f16096I;

    public final float f16097h;

    public long f16098i;
    public final Rect j;

    public final OverScroller f16099k;

    public final EdgeEffect f16100l;

    public final EdgeEffect f16101m;

    public C0238x f16102n;

    public int f16103o;

    public boolean f16104p;

    public boolean f16105q;

    public View f16106r;

    public boolean f16107s;

    public VelocityTracker f16108t;

    public boolean f16109u;

    public boolean f16110v;

    public final int f16111w;

    public final int f16112x;
    public final int y;

    public int f16113z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kiptv.tv.R.attr.nestedScrollViewStyle);
        this.j = new Rect();
        this.f16104p = true;
        this.f16105q = false;
        this.f16106r = null;
        this.f16107s = false;
        this.f16110v = true;
        this.f16113z = -1;
        this.f16089A = new int[2];
        this.f16090B = new int[2];
        this.f16096I = new C0224i(getContext(), new a(11, this));
        int i3 = Build.VERSION.SDK_INT;
        this.f16100l = i3 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f16101m = i3 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f16097h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f16099k = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f16111w = viewConfiguration.getScaledTouchSlop();
        this.f16112x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.y = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16088L, com.kiptv.tv.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f16094F = new r();
        this.f16095G = new C0230o(this);
        setNestedScrollingEnabled(true);
        U.j(this, f16087K);
    }

    private C0238x getScrollFeedbackProvider() {
        if (this.f16102n == null) {
            this.f16102n = new C0238x(this);
        }
        return this.f16102n;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override
    public final void a(ViewGroup viewGroup, int i3, int i9, int i10, int i11, int i12) {
        o(i11, i12, null);
    }

    @Override
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public final boolean b(int i3) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.j;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(d(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i3);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i3, int i9, int i10, int i11, int i12, int[] iArr) {
        o(i11, i12, iArr);
    }

    @Override
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i3;
        int scrollRange;
        int i9;
        int overScrollMode;
        if (this.f16099k.isFinished()) {
            return;
        }
        this.f16099k.computeScrollOffset();
        int currY = this.f16099k.getCurrY();
        int i10 = currY - this.f16092D;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f16101m;
        EdgeEffect edgeEffect2 = this.f16100l;
        if (i10 <= 0 || d.P(edgeEffect2) == 0.0f) {
            if (i10 < 0 && d.P(edgeEffect) != 0.0f) {
                float f9 = height;
                iRound = Math.round(d.U(edgeEffect, (i10 * 4.0f) / f9, 0.5f) * (f9 / 4.0f));
                if (iRound != i10) {
                    edgeEffect.finish();
                }
            }
            this.f16092D = currY;
            iArr = this.f16090B;
            iArr[1] = 0;
            i(0, i10, 1, iArr, null);
            i3 = i10 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f16099k.getCurrVelocity()));
            }
            if (i3 != 0) {
                int scrollY = getScrollY();
                q(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i3 - scrollY2;
                iArr[1] = 0;
                i9 = 1;
                this.f16095G.d(0, scrollY2, 0, i11, this.f16089A, 1, iArr);
                i3 = i11 - iArr[1];
            } else {
                i9 = 1;
            }
            if (i3 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i9 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect2.isFinished()) {
                            edgeEffect2.onAbsorb((int) this.f16099k.getCurrVelocity());
                        }
                    } else if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f16099k.getCurrVelocity());
                    }
                }
                this.f16099k.abortAnimation();
                y(i9);
            }
            if (this.f16099k.isFinished()) {
                y(i9);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(d.U(edgeEffect2, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i10) {
            edgeEffect2.finish();
        }
        i10 -= iRound;
        this.f16092D = currY;
        iArr = this.f16090B;
        iArr[1] = 0;
        i(0, i10, 1, iArr, null);
        i3 = i10 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            f.a(this, Math.abs(this.f16099k.getCurrVelocity()));
        }
        if (i3 != 0) {
            int scrollY3 = getScrollY();
            q(i3, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i12 = i3 - scrollY4;
            iArr[1] = 0;
            i9 = 1;
            this.f16095G.d(0, scrollY4, 0, i12, this.f16089A, 1, iArr);
            i3 = i12 - iArr[1];
        } else {
            i9 = 1;
        }
        if (i3 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i3 < 0) {
                    if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f16099k.getCurrVelocity());
                    }
                } else if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f16099k.getCurrVelocity());
                }
            } else if (i3 < 0) {
                if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f16099k.getCurrVelocity());
                }
            } else if (edgeEffect.isFinished()) {
                edgeEffect.onAbsorb((int) this.f16099k.getCurrVelocity());
            }
            this.f16099k.abortAnimation();
            y(i9);
        }
        if (this.f16099k.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            y(i9);
        }
    }

    @Override
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final int d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i9 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i10 = rect.bottom;
        if (i10 > i9 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i9, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i10 >= i9) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i9 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override
    public final boolean dispatchNestedFling(float f9, float f10, boolean z6) {
        return this.f16095G.a(f9, f10, z6);
    }

    @Override
    public final boolean dispatchNestedPreFling(float f9, float f10) {
        return this.f16095G.b(f9, f10);
    }

    @Override
    public final boolean dispatchNestedPreScroll(int i3, int i9, int[] iArr, int[] iArr2) {
        return this.f16095G.c(i3, i9, 0, iArr, iArr2);
    }

    @Override
    public final boolean dispatchNestedScroll(int i3, int i9, int i10, int i11, int[] iArr) {
        return this.f16095G.d(i3, i9, i10, i11, iArr, 0, null);
    }

    @Override
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f16100l;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f16101m;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override
    public final void e(int i3, View view) {
        r rVar = this.f16094F;
        if (i3 == 1) {
            rVar.f2054b = 0;
        } else {
            rVar.f2053a = 0;
        }
        y(i3);
    }

    @Override
    public final void f(int i3, int i9, int i10, int[] iArr) {
        i(i3, i9, i10, iArr, null);
    }

    @Override
    public final boolean g(View view, View view2, int i3, int i9) {
        return (i3 & 2) != 0;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override
    public int getNestedScrollAxes() {
        r rVar = this.f16094F;
        return rVar.f2054b | rVar.f2053a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.H == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.H = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.H;
    }

    @Override
    public final void h(View view, View view2, int i3, int i9) {
        r rVar = this.f16094F;
        if (i9 == 1) {
            rVar.f2054b = i3;
        } else {
            rVar.f2053a = i3;
        }
        w(2, i9);
    }

    @Override
    public final boolean hasNestedScrollingParent() {
        return this.f16095G.f(0);
    }

    public final boolean i(int i3, int i9, int i10, int[] iArr, int[] iArr2) {
        return this.f16095G.c(i3, i9, i10, iArr, null);
    }

    @Override
    public final boolean isNestedScrollingEnabled() {
        return this.f16095G.f2050d;
    }

    public final boolean j(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.j.setEmpty();
        int childCount = getChildCount();
        int i3 = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (childCount > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : b(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(TsExtractor.TS_STREAM_TYPE_HDMV_DTS) : b(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    }
                    if (keyCode == 62) {
                        if (keyEvent.isShiftPressed()) {
                            i3 = 33;
                        }
                        r(i3);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    public final void k(int i3) {
        if (getChildCount() > 0) {
            this.f16099k.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Log.LOG_LEVEL_OFF, 0, 0);
            w(2, 1);
            this.f16092D = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                f.a(this, Math.abs(this.f16099k.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i3) {
        int childCount;
        boolean z6 = i3 == 130;
        int height = getHeight();
        Rect rect = this.j;
        rect.top = 0;
        rect.bottom = height;
        if (z6 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i3, rect.top, rect.bottom);
    }

    @Override
    public final void measureChild(View view, int i3, int i9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override
    public final void measureChildWithMargins(View view, int i3, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i3, int i9) {
        Rect rect = this.j;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i9;
    }

    public final void o(int i3, int i9, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f16095G.d(0, scrollY2, 0, i3 - scrollY2, null, i9, iArr);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16105q = false;
    }

    @Override
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f9;
        int i3;
        int width;
        int i9;
        int i10;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z6;
        VelocityTracker velocityTracker;
        float yVelocity;
        float f10;
        long j;
        float f11;
        float fSqrt;
        int i11;
        int i12;
        if (motionEvent.getAction() != 8 || this.f16107s) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i3 = 9;
            f9 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f9 = axisValue2;
            i3 = 26;
        } else {
            f9 = 0.0f;
            i3 = 0;
            width = 0;
        }
        if (f9 == 0.0f) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * f9)), i3, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i3 != 0) {
            C0224i c0224i = this.f16096I;
            c0224i.getClass();
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i13 = c0224i.f2026f;
            int[] iArr = c0224i.f2027h;
            int i14 = 1;
            if (i13 == source && c0224i.g == deviceId && c0224i.f2025e == i3) {
                z6 = false;
                i9 = 20;
                i10 = 0;
            } else {
                Context context = c0224i.f2021a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                i9 = 20;
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i10 = 0;
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 34) {
                    Method method = V.f1985a;
                    scaledMinimumFlingVelocity = C.f(viewConfiguration, deviceId2, i3, source2);
                } else {
                    Method method2 = V.f1985a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i3, source2) == null) {
                        scaledMinimumFlingVelocity = Log.LOG_LEVEL_OFF;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM) : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Log.LOG_LEVEL_OFF;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i15 >= 34) {
                    scaledMaximumFlingVelocity = C.e(viewConfiguration, deviceId3, i3, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if ((device2 == null || device2.getMotionRange(i3, source3) == null) ? false : true) {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i3 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM) : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    } else {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0224i.f2026f = source;
                c0224i.g = deviceId;
                c0224i.f2025e = i3;
                z6 = true;
            }
            if (iArr[i10] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker2 = c0224i.f2023c;
                if (velocityTracker2 == null) {
                    return true;
                }
                velocityTracker2.recycle();
                c0224i.f2023c = null;
                return true;
            }
            if (c0224i.f2023c == null) {
                c0224i.f2023c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker3 = c0224i.f2023c;
            Map map = D.f1960a;
            velocityTracker3.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = D.f1960a;
                if (!map2.containsKey(velocityTracker3)) {
                    map2.put(velocityTracker3, new E());
                }
                E e6 = (E) map2.get(velocityTracker3);
                e6.getClass();
                long eventTime = motionEvent.getEventTime();
                int i16 = e6.f1964d;
                long[] jArr = e6.f1962b;
                if (i16 != 0 && eventTime - jArr[e6.f1965e] > 40) {
                    e6.f1964d = i10;
                    e6.f1963c = 0.0f;
                }
                int i17 = (e6.f1965e + 1) % 20;
                e6.f1965e = i17;
                int i18 = e6.f1964d;
                if (i18 != i9) {
                    e6.f1964d = i18 + 1;
                }
                e6.f1961a[i17] = motionEvent.getAxisValue(26);
                jArr[e6.f1965e] = eventTime;
            }
            float f12 = Float.MAX_VALUE;
            velocityTracker3.computeCurrentVelocity(1000, Float.MAX_VALUE);
            E e9 = (E) D.f1960a.get(velocityTracker3);
            if (e9 != null) {
                int i19 = e9.f1964d;
                if (i19 < 2) {
                    velocityTracker = velocityTracker3;
                    f11 = Float.MAX_VALUE;
                    i11 = 1000;
                    fSqrt = 0.0f;
                } else {
                    int i20 = e9.f1965e;
                    int i21 = ((i20 + 20) - (i19 - 1)) % 20;
                    long[] jArr2 = e9.f1962b;
                    long j9 = jArr2[i20];
                    while (true) {
                        j = jArr2[i21];
                        if (j9 - j <= 100) {
                            break;
                        }
                        e9.f1964d--;
                        i21 = (i21 + 1) % 20;
                    }
                    int i22 = e9.f1964d;
                    if (i22 < 2) {
                        velocityTracker = velocityTracker3;
                        f11 = Float.MAX_VALUE;
                        i11 = 1000;
                        fSqrt = 0.0f;
                    } else {
                        float[] fArr = e9.f1961a;
                        if (i22 == 2) {
                            int i23 = (i21 + 1) % 20;
                            long j10 = jArr2[i23];
                            if (j == j10) {
                                velocityTracker = velocityTracker3;
                                f11 = Float.MAX_VALUE;
                                i11 = 1000;
                                fSqrt = 0.0f;
                            } else {
                                velocityTracker = velocityTracker3;
                                f11 = Float.MAX_VALUE;
                                i11 = 1000;
                                fSqrt = fArr[i23] / (j10 - j);
                            }
                        } else {
                            float f13 = 0.0f;
                            int i24 = 0;
                            int i25 = 0;
                            while (true) {
                                if (i24 >= e9.f1964d - 1) {
                                    break;
                                }
                                int i26 = i24 + i21;
                                long j11 = jArr2[i26 % 20];
                                int i27 = (i26 + 1) % 20;
                                if (jArr2[i27] == j11) {
                                    i12 = i14;
                                } else {
                                    i25++;
                                    float fSqrt2 = (f13 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f13) * 2.0f));
                                    float f14 = fArr[i27] / (jArr2[i27] - j11);
                                    float fAbs = (Math.abs(f14) * (f14 - fSqrt2)) + f13;
                                    i12 = i14;
                                    if (i25 == i12) {
                                        fAbs *= 0.5f;
                                    }
                                    f13 = fAbs;
                                }
                                i24 += i12;
                                f12 = f12;
                                i14 = i12;
                                velocityTracker3 = velocityTracker3;
                            }
                            velocityTracker = velocityTracker3;
                            f11 = f12;
                            fSqrt = ((float) Math.sqrt(Math.abs(f13) * 2.0f)) * (f13 < 0.0f ? -1.0f : 1.0f);
                            i11 = 1000;
                        }
                    }
                }
                float f15 = fSqrt * i11;
                e9.f1963c = f15;
                if (f15 < (-Math.abs(f11))) {
                    e9.f1963c = -Math.abs(f11);
                } else if (e9.f1963c > Math.abs(f11)) {
                    e9.f1963c = Math.abs(f11);
                }
            } else {
                velocityTracker = velocityTracker3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = C.b(velocityTracker, i3);
            } else {
                VelocityTracker velocityTracker4 = velocityTracker;
                if (i3 == 0) {
                    yVelocity = velocityTracker4.getXVelocity();
                } else if (i3 == 1) {
                    yVelocity = velocityTracker4.getYVelocity();
                } else {
                    E e10 = (E) D.f1960a.get(velocityTracker4);
                    yVelocity = (e10 == null || i3 != 26) ? 0.0f : e10.f1963c;
                }
            }
            NestedScrollView nestedScrollView = (NestedScrollView) c0224i.f2022b.f9i;
            float f16 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f16);
            if (z6 || (fSignum != Math.signum(c0224i.f2024d) && fSignum != 0.0f)) {
                nestedScrollView.f16099k.abortAnimation();
            }
            if (Math.abs(f16) >= iArr[0]) {
                int i28 = iArr[1];
                float fMax = Math.max(-i28, Math.min(f16, i28));
                if (fMax == 0.0f) {
                    f10 = 0.0f;
                } else {
                    nestedScrollView.f16099k.abortAnimation();
                    nestedScrollView.k((int) fMax);
                    f10 = fMax;
                }
                c0224i.f2024d = f10;
                return true;
            }
        }
        return true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action == 2 && this.f16107s) {
            return true;
        }
        int i3 = action & 255;
        if (i3 == 0) {
            int y = (int) motionEvent.getY();
            int x9 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x9 < childAt.getLeft() || x9 >= childAt.getRight()) {
                    if (!x(motionEvent) && this.f16099k.isFinished()) {
                        z6 = false;
                    }
                    this.f16107s = z6;
                    velocityTracker = this.f16108t;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f16108t = null;
                    }
                } else {
                    this.f16103o = y;
                    this.f16113z = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f16108t;
                    if (velocityTracker3 == null) {
                        this.f16108t = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f16108t.addMovement(motionEvent);
                    this.f16099k.computeScrollOffset();
                    if (!x(motionEvent) && this.f16099k.isFinished()) {
                        z6 = false;
                    }
                    this.f16107s = z6;
                    w(2, 0);
                }
            } else {
                if (!x(motionEvent)) {
                    z6 = false;
                }
                this.f16107s = z6;
                velocityTracker = this.f16108t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f16108t = null;
                }
            }
        } else if (i3 == 1) {
            this.f16107s = false;
            this.f16113z = -1;
            velocityTracker2 = this.f16108t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f16108t = null;
            }
            if (this.f16099k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i3 == 2) {
            int i9 = this.f16113z;
            if (i9 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i9);
                if (iFindPointerIndex == -1) {
                    android.util.Log.e("NestedScrollView", "Invalid pointerId=" + i9 + " in onInterceptTouchEvent");
                } else {
                    int y9 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y9 - this.f16103o) > this.f16111w && (2 & getNestedScrollAxes()) == 0) {
                        this.f16107s = true;
                        this.f16103o = y9;
                        if (this.f16108t == null) {
                            this.f16108t = VelocityTracker.obtain();
                        }
                        this.f16108t.addMovement(motionEvent);
                        this.f16091C = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i3 == 3) {
            this.f16107s = false;
            this.f16113z = -1;
            velocityTracker2 = this.f16108t;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f16108t = null;
            }
            if (this.f16099k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i3 == 6) {
            p(motionEvent);
        }
        return this.f16107s;
    }

    @Override
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        int measuredHeight;
        super.onLayout(z6, i3, i9, i10, i11);
        int i12 = 0;
        this.f16104p = false;
        View view = this.f16106r;
        if (view != null && m(view, this)) {
            View view2 = this.f16106r;
            Rect rect = this.j;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iD = d(rect);
            if (iD != 0) {
                scrollBy(0, iD);
            }
        }
        this.f16106r = null;
        if (!this.f16105q) {
            if (this.f16093E != null) {
                scrollTo(getScrollX(), this.f16093E.f3865h);
                this.f16093E = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i12 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i12 != scrollY) {
                scrollTo(getScrollX(), i12);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f16105q = true;
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        super.onMeasure(i3, i9);
        if (this.f16109u && View.MeasureSpec.getMode(i9) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override
    public final boolean onNestedFling(View view, float f9, float f10, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        k((int) f10);
        return true;
    }

    @Override
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        return this.f16095G.b(f9, f10);
    }

    @Override
    public final void onNestedPreScroll(View view, int i3, int i9, int[] iArr) {
        i(i3, i9, 0, iArr, null);
    }

    @Override
    public final void onNestedScroll(View view, int i3, int i9, int i10, int i11) {
        o(i11, 0, null);
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        h(view, view2, i3, 0);
    }

    @Override
    public final void onOverScrolled(int i3, int i9, boolean z6, boolean z9) {
        super.scrollTo(i3, i9);
    }

    @Override
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        this.f16093E = hVar;
        requestLayout();
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f3865h = getScrollY();
        return hVar;
    }

    @Override
    public final void onScrollChanged(int i3, int i9, int i10, int i11) {
        super.onScrollChanged(i3, i9, i10, i11);
    }

    @Override
    public final void onSizeChanged(int i3, int i9, int i10, int i11) {
        super.onSizeChanged(i3, i9, i10, i11);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i11)) {
            return;
        }
        Rect rect = this.j;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iD = d(rect);
        if (iD != 0) {
            if (this.f16110v) {
                v(0, iD, false);
            } else {
                scrollBy(0, iD);
            }
        }
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return g(view, view2, i3, 0);
    }

    @Override
    public final void onStopNestedScroll(View view) {
        e(0, view);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fU;
        int iRound;
        int i3;
        ViewParent parent2;
        if (this.f16108t == null) {
            this.f16108t = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16091C = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f9 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f16091C);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f16101m;
            EdgeEffect edgeEffect2 = this.f16100l;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f16108t;
                velocityTracker.computeCurrentVelocity(1000, this.y);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f16113z);
                if (Math.abs(yVelocity) >= this.f16112x) {
                    if (d.P(edgeEffect2) != 0.0f) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (d.P(edgeEffect) != 0.0f) {
                        int i9 = -yVelocity;
                        if (u(edgeEffect, i9)) {
                            edgeEffect.onAbsorb(i9);
                        } else {
                            k(i9);
                        }
                    } else {
                        int i10 = -yVelocity;
                        float f10 = i10;
                        if (!this.f16095G.b(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            k(i10);
                        }
                    }
                } else if (this.f16099k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f16113z = -1;
                this.f16107s = false;
                VelocityTracker velocityTracker2 = this.f16108t;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f16108t = null;
                }
                y(0);
                this.f16100l.onRelease();
                this.f16101m.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f16113z);
                if (iFindPointerIndex == -1) {
                    android.util.Log.e("NestedScrollView", "Invalid pointerId=" + this.f16113z + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i11 = this.f16103o - y;
                    float x9 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i11 / getHeight();
                    if (d.P(edgeEffect2) != 0.0f) {
                        fU = -d.U(edgeEffect2, -height, x9);
                        if (d.P(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else if (d.P(edgeEffect) != 0.0f) {
                        fU = d.U(edgeEffect, height, 1.0f - x9);
                        if (d.P(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else {
                        iRound = Math.round(f9 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i3 = i11 - iRound;
                        if (!this.f16107s && Math.abs(i3) > this.f16111w) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f16107s = true;
                            if (i3 > 0) {
                                i3 -= this.f16111w;
                            } else {
                                i3 += this.f16111w;
                            }
                        }
                        if (this.f16107s) {
                            int iT = t(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f16103o = y - iT;
                            this.f16091C += iT;
                        }
                    }
                    f9 = fU;
                    iRound = Math.round(f9 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i3 = i11 - iRound;
                    if (!this.f16107s) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f16107s = true;
                        if (i3 > 0) {
                            i3 -= this.f16111w;
                        } else {
                            i3 += this.f16111w;
                        }
                    }
                    if (this.f16107s) {
                        int iT2 = t(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f16103o = y - iT2;
                        this.f16091C += iT2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f16107s && getChildCount() > 0 && this.f16099k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f16113z = -1;
                this.f16107s = false;
                VelocityTracker velocityTracker3 = this.f16108t;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f16108t = null;
                }
                y(0);
                this.f16100l.onRelease();
                this.f16101m.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f16103o = (int) motionEvent.getY(actionIndex);
                this.f16113z = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f16103o = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f16113z));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f16107s && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f16099k.isFinished()) {
                this.f16099k.abortAnimation();
                y(1);
            }
            int y9 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f16103o = y9;
            this.f16113z = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f16108t;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f16113z) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f16103o = (int) motionEvent.getY(i3);
            this.f16113z = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f16108t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i3, int i9, int i10, int i11) {
        int i12;
        boolean z6;
        int i13;
        boolean z9;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i14 = i10 + i3;
        if (i9 <= 0 && i9 >= 0) {
            i12 = i9;
            z6 = false;
        } else {
            i12 = 0;
            z6 = true;
        }
        if (i14 <= i11) {
            if (i14 < 0) {
                i13 = 0;
            } else {
                i13 = i14;
                z9 = false;
            }
            if (z9 && !this.f16095G.f(1)) {
                this.f16099k.springBack(i12, i13, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i12, i13);
            return !z6 || z9;
        }
        i13 = i11;
        z9 = true;
        if (z9) {
            this.f16099k.springBack(i12, i13, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i12, i13);
        if (z6) {
        }
    }

    public final void r(int i3) {
        boolean z6 = i3 == 130;
        int height = getHeight();
        Rect rect = this.j;
        if (z6) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i9 = rect.top;
        int i10 = height + i9;
        rect.bottom = i10;
        s(i3, i9, i10);
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (this.f16104p) {
            this.f16106r = view2;
        } else {
            Rect rect = this.j;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iD = d(rect);
            if (iD != 0) {
                scrollBy(0, iD);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z6) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iD = d(rect);
        boolean z9 = iD != 0;
        if (z9) {
            if (z6) {
                scrollBy(0, iD);
                return z9;
            }
            v(0, iD, false);
        }
        return z9;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f16108t) != null) {
            velocityTracker.recycle();
            this.f16108t = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override
    public final void requestLayout() {
        this.f16104p = true;
        super.requestLayout();
    }

    public final boolean s(int i3, int i9, int i10) {
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        boolean z9 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i9 < bottom && top < i10) {
                boolean z11 = i9 < top && bottom < i10;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z9 && top < view.getTop()) || (!z9 && bottom > view.getBottom());
                    if (z10) {
                        if (z11 && z12) {
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else if (z12) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i9 < scrollY || i10 > i11) {
            t(z9 ? i9 - scrollY : i10 - i11, -1, null, 0, 1, true);
            z6 = true;
        } else {
            z6 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i3);
        }
        return z6;
    }

    @Override
    public final void scrollTo(int i3, int i9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i9 < 0) {
                i9 = 0;
            } else if (height + i9 > height2) {
                i9 = height2 - height;
            }
            if (i3 == getScrollX() && i9 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i9);
        }
    }

    public void setFillViewport(boolean z6) {
        if (z6 != this.f16109u) {
            this.f16109u = z6;
            requestLayout();
        }
    }

    @Override
    public void setNestedScrollingEnabled(boolean z6) {
        C0230o c0230o = this.f16095G;
        if (c0230o.f2050d) {
            WeakHashMap weakHashMap = U.f1980a;
            L.i(c0230o.f2049c);
        }
        c0230o.f2050d = z6;
    }

    public void setSmoothScrollingEnabled(boolean z6) {
        this.f16110v = z6;
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override
    public final boolean startNestedScroll(int i3) {
        return this.f16095G.g(i3, 0);
    }

    @Override
    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i3, int i9, MotionEvent motionEvent, int i10, int i11, boolean z6) {
        int i12;
        int i13;
        boolean z9;
        boolean z10;
        VelocityTracker velocityTracker;
        if (i11 == 1) {
            w(2, i11);
        }
        boolean zC = this.f16095G.c(0, i3, i11, this.f16090B, this.f16089A);
        int[] iArr = this.f16090B;
        int[] iArr2 = this.f16089A;
        if (zC) {
            i12 = i3 - iArr[1];
            i13 = iArr2[1];
        } else {
            i12 = i3;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z6;
        boolean z12 = q(i12, 0, scrollY, scrollRange) && !this.f16095G.f(i11);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f2073a.b(motionEvent.getDeviceId(), motionEvent.getSource(), i9, scrollY2);
        }
        iArr[1] = 0;
        this.f16095G.d(0, scrollY2, 0, i12 - scrollY2, this.f16089A, i11, iArr);
        int i14 = i13 + iArr2[1];
        int i15 = i12 - iArr[1];
        int i16 = scrollY + i15;
        EdgeEffect edgeEffect = this.f16101m;
        EdgeEffect edgeEffect2 = this.f16100l;
        if (i16 >= 0) {
            if (i16 > scrollRange && z11) {
                d.U(edgeEffect, i15 / getHeight(), 1.0f - (i10 / getWidth()));
                if (motionEvent != null) {
                    z9 = false;
                    getScrollFeedbackProvider().f2073a.a(false, motionEvent.getDeviceId(), motionEvent.getSource(), i9);
                } else {
                    z9 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z10 = z9;
            } else {
                z10 = z12;
            }
            if (z10 && i11 == 0 && (velocityTracker = this.f16108t) != null) {
                velocityTracker.clear();
            }
            if (i11 == 1) {
                y(i11);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i14;
        }
        if (z11) {
            d.U(edgeEffect2, (-i15) / getHeight(), i10 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f2073a.a(true, motionEvent.getDeviceId(), motionEvent.getSource(), i9);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z9 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z10 = z9;
        } else {
            postInvalidateOnAnimation();
            z10 = z9;
        }
        if (z10) {
            velocityTracker.clear();
        }
        if (i11 == 1) {
            y(i11);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i14;
    }

    public final boolean u(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float fP = d.P(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i3) * 0.35f;
        float f9 = this.f16097h * 0.015f;
        double dLog = Math.log(fAbs / f9);
        double d4 = f16086J;
        return ((float) (Math.exp((d4 / (d4 - 1.0d)) * dLog) * ((double) f9))) < fP;
    }

    public final void v(int i3, int i9, boolean z6) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f16098i > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f16099k.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i9 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z6) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f16092D = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f16099k.isFinished()) {
                this.f16099k.abortAnimation();
                y(1);
            }
            scrollBy(i3, i9);
        }
        this.f16098i = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void w(int i3, int i9) {
        this.f16095G.g(2, i9);
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z6;
        EdgeEffect edgeEffect = this.f16100l;
        if (d.P(edgeEffect) != 0.0f) {
            d.U(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z6 = true;
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = this.f16101m;
        if (d.P(edgeEffect2) == 0.0f) {
            return z6;
        }
        d.U(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i3) {
        this.f16095G.h(i3);
    }

    @Override
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
