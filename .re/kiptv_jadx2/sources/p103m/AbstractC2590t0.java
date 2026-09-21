package p103m;

import D1.U;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.a;
import j1.l;

public abstract class AbstractC2590t0 extends ViewGroup {

    public boolean f25124h;

    public int f25125i;
    public int j;

    public int f25126k;

    public int f25127l;

    public int f25128m;

    public float f25129n;

    public boolean f25130o;

    public int[] f25131p;

    public int[] f25132q;

    public Drawable f25133r;

    public int f25134s;

    public int f25135t;

    public int f25136u;

    public int f25137v;

    public AbstractC2590t0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f25124h = true;
        this.f25125i = -1;
        this.j = 0;
        this.f25127l = 8388659;
        int[] iArr = a.f22416n;
        l lVarS = l.s(context, attributeSet, iArr, 0);
        U.i(this, context, iArr, attributeSet, (TypedArray) lVarS.j, 0);
        TypedArray typedArray = (TypedArray) lVarS.j;
        int i3 = typedArray.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i9 = typedArray.getInt(0, -1);
        if (i9 >= 0) {
            setGravity(i9);
        }
        boolean z6 = typedArray.getBoolean(2, true);
        if (!z6) {
            setBaselineAligned(z6);
        }
        this.f25129n = typedArray.getFloat(4, -1.0f);
        this.f25125i = typedArray.getInt(3, -1);
        this.f25130o = typedArray.getBoolean(7, false);
        setDividerDrawable(lVarS.l(5));
        this.f25136u = typedArray.getInt(8, 0);
        this.f25137v = typedArray.getDimensionPixelSize(6, 0);
        lVarS.u();
    }

    public final void c(Canvas canvas, int i3) {
        this.f25133r.setBounds(getPaddingLeft() + this.f25137v, i3, (getWidth() - getPaddingRight()) - this.f25137v, this.f25135t + i3);
        this.f25133r.draw(canvas);
    }

    @Override
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2588s0;
    }

    public final void d(Canvas canvas, int i3) {
        this.f25133r.setBounds(i3, getPaddingTop() + this.f25137v, this.f25134s + i3, (getHeight() - getPaddingBottom()) - this.f25137v);
        this.f25133r.draw(canvas);
    }

    @Override
    public C2588s0 generateDefaultLayoutParams() {
        int i3 = this.f25126k;
        if (i3 == 0) {
            return new C2588s0(-2, -2);
        }
        if (i3 == 1) {
            return new C2588s0(-1, -2);
        }
        return null;
    }

    @Override
    public C2588s0 generateLayoutParams(AttributeSet attributeSet) {
        return new C2588s0(getContext(), attributeSet);
    }

    @Override
    public C2588s0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2588s0) {
            return new C2588s0((C2588s0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C2588s0((ViewGroup.MarginLayoutParams) layoutParams) : new C2588s0(layoutParams);
    }

    @Override
    public int getBaseline() {
        int i3;
        if (this.f25125i < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i9 = this.f25125i;
        if (childCount <= i9) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i9);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f25125i == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.j;
        if (this.f25126k == 1 && (i3 = this.f25127l & 112) != 48) {
            if (i3 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f25128m) / 2;
            } else if (i3 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f25128m;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C2588s0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f25125i;
    }

    public Drawable getDividerDrawable() {
        return this.f25133r;
    }

    public int getDividerPadding() {
        return this.f25137v;
    }

    public int getDividerWidth() {
        return this.f25134s;
    }

    public int getGravity() {
        return this.f25127l;
    }

    public int getOrientation() {
        return this.f25126k;
    }

    public int getShowDividers() {
        return this.f25136u;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f25129n;
    }

    public final boolean h(int i3) {
        if (i3 == 0) {
            return (this.f25136u & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f25136u & 4) != 0;
        }
        if ((this.f25136u & 2) != 0) {
            for (int i9 = i3 - 1; i9 >= 0; i9--) {
                if (getChildAt(i9).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        int bottom;
        if (this.f25133r == null) {
            return;
        }
        int i9 = 0;
        if (this.f25126k == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i9 < virtualChildCount) {
                View childAt = getChildAt(i9);
                if (childAt != null && childAt.getVisibility() != 8 && h(i9)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C2588s0) childAt.getLayoutParams())).topMargin) - this.f25135t);
                }
                i9++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f25135t;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C2588s0) childAt2.getLayoutParams())).bottomMargin;
                }
                c(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z6 = g1.f25041a;
        boolean z9 = getLayoutDirection() == 1;
        while (i9 < virtualChildCount2) {
            View childAt3 = getChildAt(i9);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i9)) {
                C2588s0 c2588s0 = (C2588s0) childAt3.getLayoutParams();
                d(canvas, z9 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c2588s0).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c2588s0).leftMargin) - this.f25134s);
            }
            i9++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C2588s0 c2588s1 = (C2588s0) childAt4.getLayoutParams();
                if (z9) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c2588s1).leftMargin;
                    i3 = this.f25134s;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c2588s1).rightMargin;
                }
            } else if (z9) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f25134s;
                right = left - i3;
            }
            d(canvas, right);
        }
    }

    @Override
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override
    public void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        int paddingLeft;
        int i12;
        int i13;
        int i14;
        int i15;
        int baseline;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        int i19;
        int paddingTop;
        int i20;
        int i21;
        int i22;
        int i23 = 8;
        char c9 = 2;
        if (this.f25126k == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i24 = i10 - i3;
            int paddingRight = i24 - getPaddingRight();
            int paddingRight2 = (i24 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i25 = this.f25127l;
            int i26 = i25 & 112;
            int i27 = 8388615 & i25;
            if (i26 != 16) {
                paddingTop = i26 != 80 ? getPaddingTop() : ((getPaddingTop() + i11) - i9) - this.f25128m;
            } else {
                paddingTop = getPaddingTop() + (((i11 - i9) - this.f25128m) / 2);
            }
            int i28 = 0;
            while (i28 < virtualChildCount) {
                View childAt = getChildAt(i28);
                if (childAt != null && childAt.getVisibility() != i23) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C2588s0 c2588s0 = (C2588s0) childAt.getLayoutParams();
                    int i29 = ((LinearLayout.LayoutParams) c2588s0).gravity;
                    if (i29 < 0) {
                        i29 = i27;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i29, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i22 = ((LinearLayout.LayoutParams) c2588s0).leftMargin + paddingLeft2;
                        } else {
                            i20 = paddingRight - measuredWidth;
                            i21 = ((LinearLayout.LayoutParams) c2588s0).rightMargin;
                        }
                        if (h(i28)) {
                            paddingTop += this.f25135t;
                        }
                        int i30 = paddingTop + ((LinearLayout.LayoutParams) c2588s0).topMargin;
                        childAt.layout(i22, i30, measuredWidth + i22, i30 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c2588s0).bottomMargin + i30;
                    } else {
                        i20 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) c2588s0).leftMargin;
                        i21 = ((LinearLayout.LayoutParams) c2588s0).rightMargin;
                    }
                    i22 = i20 - i21;
                    if (h(i28)) {
                        paddingTop += this.f25135t;
                    }
                    int i31 = paddingTop + ((LinearLayout.LayoutParams) c2588s0).topMargin;
                    childAt.layout(i22, i31, measuredWidth + i22, i31 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c2588s0).bottomMargin + i31;
                }
                i28++;
                c9 = c9;
                i23 = 8;
            }
            return;
        }
        boolean z9 = g1.f25041a;
        boolean z10 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i32 = i11 - i9;
        int paddingBottom = i32 - getPaddingBottom();
        int paddingBottom2 = (i32 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i33 = this.f25127l;
        int i34 = 8388615 & i33;
        int i35 = i33 & 112;
        boolean z11 = this.f25124h;
        int[] iArr = this.f25131p;
        int[] iArr2 = this.f25132q;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i34, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i10) - i3) - this.f25128m;
        } else {
            paddingLeft = getPaddingLeft() + (((i10 - i3) - this.f25128m) / 2);
        }
        if (z10) {
            i13 = virtualChildCount2 - 1;
            i12 = -1;
        } else {
            i12 = 1;
            i13 = 0;
        }
        int i36 = 0;
        while (i36 < virtualChildCount2) {
            int i37 = (i12 * i36) + i13;
            View childAt2 = getChildAt(i37);
            if (childAt2 == null) {
                i14 = i13;
            } else {
                i14 = i13;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C2588s0 c2588s1 = (C2588s0) childAt2.getLayoutParams();
                    int i38 = paddingLeft;
                    if (z11) {
                        i15 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) c2588s1).height != -1 ? childAt2.getBaseline() : -1;
                        i16 = ((LinearLayout.LayoutParams) c2588s1).gravity;
                        if (i16 < 0) {
                            i16 = i35;
                        }
                        i17 = i16 & 112;
                        if (i17 != 16) {
                            if (i17 != 48) {
                                i18 = i15 + ((LinearLayout.LayoutParams) c2588s1).topMargin;
                                if (baseline != -1) {
                                    i18 = (iArr[1] - baseline) + i18;
                                }
                            } else if (i17 != 80) {
                                i18 = i15;
                            } else {
                                i18 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c2588s1).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (h(i37)) {
                                i19 = i38 + this.f25134s;
                            } else {
                                i19 = i38;
                            }
                            int i39 = i19 + ((LinearLayout.LayoutParams) c2588s1).leftMargin;
                            childAt2.layout(i39, i18, i39 + measuredWidth2, i18 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c2588s1).rightMargin + i39;
                        } else {
                            i18 = ((paddingBottom2 - measuredHeight3) / 2) + i15 + ((LinearLayout.LayoutParams) c2588s1).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c2588s1).bottomMargin;
                        }
                        i18 -= measuredHeight;
                        if (h(i37)) {
                            i19 = i38 + this.f25134s;
                        } else {
                            i19 = i38;
                        }
                        int i310 = i19 + ((LinearLayout.LayoutParams) c2588s1).leftMargin;
                        childAt2.layout(i310, i18, i310 + measuredWidth2, i18 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c2588s1).rightMargin + i310;
                    } else {
                        i15 = paddingTop2;
                    }
                    i16 = ((LinearLayout.LayoutParams) c2588s1).gravity;
                    if (i16 < 0) {
                        i16 = i35;
                    }
                    i17 = i16 & 112;
                    if (i17 != 16) {
                        if (i17 != 48) {
                            i18 = i15 + ((LinearLayout.LayoutParams) c2588s1).topMargin;
                            if (baseline != -1) {
                                i18 = (iArr[1] - baseline) + i18;
                            }
                        } else if (i17 != 80) {
                            i18 = i15;
                        } else {
                            i18 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c2588s1).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (h(i37)) {
                            i19 = i38 + this.f25134s;
                        } else {
                            i19 = i38;
                        }
                        int i311 = i19 + ((LinearLayout.LayoutParams) c2588s1).leftMargin;
                        childAt2.layout(i311, i18, i311 + measuredWidth2, i18 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c2588s1).rightMargin + i311;
                    } else {
                        i18 = ((paddingBottom2 - measuredHeight3) / 2) + i15 + ((LinearLayout.LayoutParams) c2588s1).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) c2588s1).bottomMargin;
                    }
                    i18 -= measuredHeight;
                    if (h(i37)) {
                        i19 = i38 + this.f25134s;
                    } else {
                        i19 = i38;
                    }
                    int i312 = i19 + ((LinearLayout.LayoutParams) c2588s1).leftMargin;
                    childAt2.layout(i312, i18, i312 + measuredWidth2, i18 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) c2588s1).rightMargin + i312;
                }
                i36++;
                i13 = i14;
                paddingTop2 = i15;
            }
            i15 = paddingTop2;
            i36++;
            i13 = i14;
            paddingTop2 = i15;
        }
    }

    @Override
    public void onMeasure(int i3, int i9) {
        int i10;
        int i11;
        int i12;
        int iMax;
        int i13;
        int baseline;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        boolean z6;
        boolean z9;
        C2588s0 c2588s0;
        View view;
        int i18;
        int[] iArr2;
        int i19;
        int i20;
        boolean z10;
        int i21;
        int measuredHeight;
        boolean z11;
        boolean z12;
        int iMax2;
        int i22;
        int baseline2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z13;
        int i28;
        int i29;
        int i30;
        View view2;
        boolean z14;
        AbstractC2590t0 abstractC2590t0 = this;
        int i31 = -2;
        int i32 = 1073741824;
        int i33 = 8;
        int iMax3 = 0;
        if (abstractC2590t0.f25126k == 1) {
            abstractC2590t0.f25128m = 0;
            int virtualChildCount = abstractC2590t0.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i9);
            int i34 = abstractC2590t0.f25125i;
            boolean z15 = abstractC2590t0.f25130o;
            int i35 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z16 = false;
            int i36 = 0;
            boolean z17 = false;
            boolean z18 = true;
            float f9 = 0.0f;
            int iMax6 = 0;
            while (i35 < virtualChildCount) {
                int i37 = mode;
                View childAt = abstractC2590t0.getChildAt(i35);
                if (childAt == null) {
                    abstractC2590t0.f25128m = abstractC2590t0.f25128m;
                } else {
                    if (childAt.getVisibility() != i33) {
                        if (abstractC2590t0.h(i35)) {
                            abstractC2590t0.f25128m += abstractC2590t0.f25135t;
                        }
                        C2588s0 c2588s1 = (C2588s0) childAt.getLayoutParams();
                        float f10 = ((LinearLayout.LayoutParams) c2588s1).weight;
                        f9 += f10;
                        if (mode2 == i32 && ((LinearLayout.LayoutParams) c2588s1).height == 0 && f10 > 0.0f) {
                            int i38 = abstractC2590t0.f25128m;
                            abstractC2590t0.f25128m = Math.max(i38, ((LinearLayout.LayoutParams) c2588s1).topMargin + i38 + ((LinearLayout.LayoutParams) c2588s1).bottomMargin);
                            view2 = childAt;
                            i27 = mode2;
                            i28 = i34;
                            z13 = z15;
                            i29 = i35;
                            z16 = true;
                            i30 = i37;
                        } else {
                            if (((LinearLayout.LayoutParams) c2588s1).height != 0 || f10 <= 0.0f) {
                                i26 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c2588s1).height = i31;
                                i26 = 0;
                            }
                            i27 = mode2;
                            z13 = z15;
                            i28 = i34;
                            i29 = i35;
                            i30 = i37;
                            abstractC2590t0.measureChildWithMargins(childAt, i3, 0, i9, f9 == 0.0f ? abstractC2590t0.f25128m : 0);
                            if (i26 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c2588s1).height = i26;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i39 = abstractC2590t0.f25128m;
                            view2 = childAt;
                            abstractC2590t0.f25128m = Math.max(i39, i39 + measuredHeight2 + ((LinearLayout.LayoutParams) c2588s1).topMargin + ((LinearLayout.LayoutParams) c2588s1).bottomMargin);
                            if (z13) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i28 >= 0 && i28 == i29 + 1) {
                            abstractC2590t0.j = abstractC2590t0.f25128m;
                        }
                        if (i29 < i28 && ((LinearLayout.LayoutParams) c2588s1).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i30 == 1073741824 || ((LinearLayout.LayoutParams) c2588s1).width != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                            z17 = true;
                        }
                        int i40 = ((LinearLayout.LayoutParams) c2588s1).leftMargin + ((LinearLayout.LayoutParams) c2588s1).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i40;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z19 = z14;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i36, measuredState);
                        if (z18) {
                            i36 = iCombineMeasuredStates;
                            boolean z20 = ((LinearLayout.LayoutParams) c2588s1).width == -1;
                            if (((LinearLayout.LayoutParams) c2588s1).weight > 0.0f) {
                                if (!z19) {
                                    i40 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i40);
                            } else {
                                if (!z19) {
                                    i40 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i40);
                            }
                            z18 = z20;
                            iMax3 = iMax7;
                        } else {
                            i36 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c2588s1).weight > 0.0f) {
                            if (!z19) {
                                i40 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i40);
                        } else {
                            if (!z19) {
                                i40 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i40);
                        }
                        z18 = z20;
                        iMax3 = iMax7;
                    }
                    i35 = i29 + 1;
                    i34 = i28;
                    mode = i30;
                    z15 = z13;
                    mode2 = i27;
                    i31 = -2;
                    i32 = 1073741824;
                    i33 = 8;
                }
                i27 = mode2;
                i28 = i34;
                z13 = z15;
                i29 = i35;
                i30 = i37;
                i35 = i29 + 1;
                i34 = i28;
                mode = i30;
                z15 = z13;
                mode2 = i27;
                i31 = -2;
                i32 = 1073741824;
                i33 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z21 = z15;
            int i43 = i36;
            int i44 = i9;
            if (abstractC2590t0.f25128m > 0 && abstractC2590t0.h(virtualChildCount)) {
                abstractC2590t0.f25128m += abstractC2590t0.f25135t;
            }
            if (z21 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                abstractC2590t0.f25128m = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = abstractC2590t0.getChildAt(i45);
                    if (childAt2 == null) {
                        abstractC2590t0.f25128m = abstractC2590t0.f25128m;
                    } else if (childAt2.getVisibility() != 8) {
                        C2588s0 c2588s2 = (C2588s0) childAt2.getLayoutParams();
                        int i46 = abstractC2590t0.f25128m;
                        abstractC2590t0.f25128m = Math.max(i46, i46 + iMax6 + ((LinearLayout.LayoutParams) c2588s2).topMargin + ((LinearLayout.LayoutParams) c2588s2).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC2590t0.getPaddingBottom() + abstractC2590t0.getPaddingTop() + abstractC2590t0.f25128m;
            abstractC2590t0.f25128m = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC2590t0.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (iResolveSizeAndState & 16777215) - abstractC2590t0.f25128m;
            if (z16 || (i47 != 0 && f9 > 0.0f)) {
                float f11 = abstractC2590t0.f25129n;
                if (f11 > 0.0f) {
                    f9 = f11;
                }
                abstractC2590t0.f25128m = 0;
                int iCombineMeasuredStates2 = i43;
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt3 = abstractC2590t0.getChildAt(i48);
                    if (childAt3.getVisibility() == 8) {
                        i48 = i48;
                    } else {
                        C2588s0 c2588s3 = (C2588s0) childAt3.getLayoutParams();
                        float f12 = ((LinearLayout.LayoutParams) c2588s3).weight;
                        if (f12 > 0.0f) {
                            int i49 = (int) ((i47 * f12) / f9);
                            f9 -= f12;
                            i47 -= i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, abstractC2590t0.getPaddingRight() + abstractC2590t0.getPaddingLeft() + ((LinearLayout.LayoutParams) c2588s3).leftMargin + ((LinearLayout.LayoutParams) c2588s3).rightMargin, ((LinearLayout.LayoutParams) c2588s3).width);
                            if (((LinearLayout.LayoutParams) c2588s3).height == 0) {
                                i25 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i49 <= 0) {
                                        i49 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i25 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i49;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i25));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i50 = ((LinearLayout.LayoutParams) c2588s3).leftMargin + ((LinearLayout.LayoutParams) c2588s3).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i50;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i41 != 1073741824) {
                            i24 = -1;
                            if (((LinearLayout.LayoutParams) c2588s3).width == -1) {
                                measuredWidth2 = i50;
                            }
                        } else {
                            i24 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z22 = z18 && ((LinearLayout.LayoutParams) c2588s3).width == i24;
                        int i51 = abstractC2590t0.f25128m;
                        abstractC2590t0.f25128m = Math.max(i51, childAt3.getMeasuredHeight() + i51 + ((LinearLayout.LayoutParams) c2588s3).topMargin + ((LinearLayout.LayoutParams) c2588s3).bottomMargin);
                        z18 = z22;
                    }
                    i48++;
                }
                abstractC2590t0.f25128m = abstractC2590t0.getPaddingBottom() + abstractC2590t0.getPaddingTop() + abstractC2590t0.f25128m;
                i43 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z21 && i42 != 1073741824) {
                    for (int i52 = 0; i52 < virtualChildCount; i52++) {
                        View childAt4 = abstractC2590t0.getChildAt(i52);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C2588s0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z18 || i41 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC2590t0.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC2590t0.getPaddingRight() + abstractC2590t0.getPaddingLeft() + iMax4, abstractC2590t0.getSuggestedMinimumWidth()), i3, i43), iResolveSizeAndState);
            if (z17) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC2590t0.getMeasuredWidth(), 1073741824);
                int i53 = 0;
                while (i53 < virtualChildCount) {
                    View childAt5 = abstractC2590t0.getChildAt(i53);
                    if (childAt5.getVisibility() != 8) {
                        C2588s0 c2588s4 = (C2588s0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c2588s4).width == -1) {
                            int i54 = ((LinearLayout.LayoutParams) c2588s4).height;
                            ((LinearLayout.LayoutParams) c2588s4).height = childAt5.getMeasuredHeight();
                            abstractC2590t0.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) c2588s4).height = i54;
                        }
                    }
                    i53++;
                    i44 = i9;
                }
                return;
            }
            return;
        }
        int i55 = i3;
        abstractC2590t0.f25128m = 0;
        int virtualChildCount2 = abstractC2590t0.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i55);
        int mode4 = View.MeasureSpec.getMode(i9);
        if (abstractC2590t0.f25131p == null || abstractC2590t0.f25132q == null) {
            abstractC2590t0.f25131p = new int[4];
            abstractC2590t0.f25132q = new int[4];
        }
        int[] iArr3 = abstractC2590t0.f25131p;
        int[] iArr4 = abstractC2590t0.f25132q;
        iArr3[3] = -1;
        char c9 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z23 = abstractC2590t0.f25124h;
        boolean z24 = abstractC2590t0.f25130o;
        boolean z25 = mode3 == 1073741824;
        float f13 = 0.0f;
        boolean z26 = true;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z27 = false;
        boolean z28 = false;
        while (i56 < virtualChildCount2) {
            char c10 = c9;
            View childAt6 = abstractC2590t0.getChildAt(i56);
            if (childAt6 == null) {
                abstractC2590t0.f25128m = abstractC2590t0.f25128m;
                i17 = i56;
                i22 = i58;
                iArr2 = iArr3;
                iArr = iArr4;
                z6 = z23;
                z9 = z24;
            } else {
                int i59 = i57;
                if (childAt6.getVisibility() == 8) {
                    i55 = i3;
                    i17 = i56;
                    i22 = i58;
                    iArr = iArr4;
                    z6 = z23;
                    z9 = z24;
                    i57 = i59;
                    iArr2 = iArr3;
                } else {
                    if (abstractC2590t0.h(i56)) {
                        abstractC2590t0.f25128m += abstractC2590t0.f25134s;
                    }
                    C2588s0 c2588s5 = (C2588s0) childAt6.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) c2588s5).weight;
                    f13 += f14;
                    int i60 = i56;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c2588s5).width == 0 && f14 > 0.0f) {
                        if (z25) {
                            abstractC2590t0.f25128m = ((LinearLayout.LayoutParams) c2588s5).leftMargin + ((LinearLayout.LayoutParams) c2588s5).rightMargin + abstractC2590t0.f25128m;
                        } else {
                            int i61 = abstractC2590t0.f25128m;
                            abstractC2590t0.f25128m = Math.max(i61, ((LinearLayout.LayoutParams) c2588s5).leftMargin + i61 + ((LinearLayout.LayoutParams) c2588s5).rightMargin);
                        }
                        if (z23) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z6 = z23;
                            z9 = z24;
                            i18 = i59;
                            i17 = i60;
                            c2588s0 = c2588s5;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i55 = i3;
                            i19 = i58;
                            i16 = iMax8;
                        } else {
                            view = childAt6;
                            z6 = z23;
                            z9 = z24;
                            z28 = true;
                            i18 = i59;
                            i17 = i60;
                            i20 = 1073741824;
                            c2588s0 = c2588s5;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i55 = i3;
                            i19 = i58;
                            i16 = iMax8;
                        }
                        if (mode4 == i20 && ((LinearLayout.LayoutParams) c2588s0).height == -1) {
                            z10 = true;
                            z27 = true;
                        } else {
                            z10 = false;
                        }
                        i21 = ((LinearLayout.LayoutParams) c2588s0).topMargin + ((LinearLayout.LayoutParams) c2588s0).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i21;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z6) {
                            baseline2 = view.getBaseline();
                            z11 = z10;
                            if (baseline2 != -1) {
                                i23 = ((LinearLayout.LayoutParams) c2588s0).gravity;
                                if (i23 < 0) {
                                    i23 = abstractC2590t0.f25127l;
                                }
                                int i62 = (((i23 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i62] = Math.max(iArr2[i62], baseline2);
                                iArr[i62] = Math.max(iArr[i62], measuredHeight - baseline2);
                            }
                        } else {
                            z11 = z10;
                        }
                        int iMax10 = Math.max(i18, measuredHeight);
                        if (z26 || ((LinearLayout.LayoutParams) c2588s0).height != -1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (((LinearLayout.LayoutParams) c2588s0).weight > 0.0f) {
                            if (!z11) {
                                i21 = measuredHeight;
                            }
                            iMax8 = Math.max(i16, i21);
                            iMax2 = i19;
                        } else {
                            if (!z11) {
                                i21 = measuredHeight;
                            }
                            iMax2 = Math.max(i19, i21);
                            iMax8 = i16;
                        }
                        int i63 = iMax2;
                        i57 = iMax10;
                        i22 = i63;
                        z26 = z12;
                    } else {
                        if (((LinearLayout.LayoutParams) c2588s5).width != 0 || f14 <= 0.0f) {
                            i15 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c2588s5).width = -2;
                            i15 = 0;
                        }
                        iArr = iArr4;
                        i16 = iMax8;
                        i17 = i60;
                        z6 = z23;
                        z9 = z24;
                        int i64 = i15;
                        c2588s0 = c2588s5;
                        view = childAt6;
                        i18 = i59;
                        i55 = i3;
                        iArr2 = iArr3;
                        i19 = i58;
                        abstractC2590t0.measureChildWithMargins(view, i55, f13 == 0.0f ? abstractC2590t0.f25128m : 0, i9, 0);
                        if (i64 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c2588s0).width = i64;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z25) {
                            abstractC2590t0.f25128m = ((LinearLayout.LayoutParams) c2588s0).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c2588s0).rightMargin + abstractC2590t0.f25128m;
                        } else {
                            int i65 = abstractC2590t0.f25128m;
                            abstractC2590t0.f25128m = Math.max(i65, i65 + measuredWidth3 + ((LinearLayout.LayoutParams) c2588s0).leftMargin + ((LinearLayout.LayoutParams) c2588s0).rightMargin);
                        }
                        if (z9) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i20 = 1073741824;
                    if (mode4 == i20) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    i21 = ((LinearLayout.LayoutParams) c2588s0).topMargin + ((LinearLayout.LayoutParams) c2588s0).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i21;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z6) {
                        baseline2 = view.getBaseline();
                        z11 = z10;
                        if (baseline2 != -1) {
                            i23 = ((LinearLayout.LayoutParams) c2588s0).gravity;
                            if (i23 < 0) {
                                i23 = abstractC2590t0.f25127l;
                            }
                            int i66 = (((i23 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i66] = Math.max(iArr2[i66], baseline2);
                            iArr[i66] = Math.max(iArr[i66], measuredHeight - baseline2);
                        }
                    } else {
                        z11 = z10;
                    }
                    int iMax11 = Math.max(i18, measuredHeight);
                    if (z26) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    if (((LinearLayout.LayoutParams) c2588s0).weight > 0.0f) {
                        if (!z11) {
                            i21 = measuredHeight;
                        }
                        iMax8 = Math.max(i16, i21);
                        iMax2 = i19;
                    } else {
                        if (!z11) {
                            i21 = measuredHeight;
                        }
                        iMax2 = Math.max(i19, i21);
                        iMax8 = i16;
                    }
                    int i67 = iMax2;
                    i57 = iMax11;
                    i22 = i67;
                    z26 = z12;
                }
            }
            i58 = i22;
            i56 = i17 + 1;
            c9 = c10;
            iArr3 = iArr2;
            iArr4 = iArr;
            z23 = z6;
            z24 = z9;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c11 = c9;
        boolean z29 = z23;
        boolean z30 = z24;
        int i68 = i57;
        int i69 = i58;
        int i70 = iMax8;
        if (abstractC2590t0.f25128m > 0 && abstractC2590t0.h(virtualChildCount2)) {
            abstractC2590t0.f25128m += abstractC2590t0.f25134s;
        }
        int i71 = iArr5[1];
        int iMax12 = (i71 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) ? i68 : Math.max(i68, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i71, iArr5[c11]))));
        if (z30 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC2590t0.f25128m = 0;
            for (int i72 = 0; i72 < virtualChildCount2; i72++) {
                View childAt7 = abstractC2590t0.getChildAt(i72);
                if (childAt7 == null) {
                    abstractC2590t0.f25128m = abstractC2590t0.f25128m;
                } else if (childAt7.getVisibility() != 8) {
                    C2588s0 c2588s6 = (C2588s0) childAt7.getLayoutParams();
                    if (z25) {
                        abstractC2590t0.f25128m = ((LinearLayout.LayoutParams) c2588s6).leftMargin + iMax9 + ((LinearLayout.LayoutParams) c2588s6).rightMargin + abstractC2590t0.f25128m;
                    } else {
                        int i73 = abstractC2590t0.f25128m;
                        abstractC2590t0.f25128m = Math.max(i73, i73 + iMax9 + ((LinearLayout.LayoutParams) c2588s6).leftMargin + ((LinearLayout.LayoutParams) c2588s6).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC2590t0.getPaddingRight() + abstractC2590t0.getPaddingLeft() + abstractC2590t0.f25128m;
        abstractC2590t0.f25128m = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC2590t0.getSuggestedMinimumWidth()), i55, 0);
        int i74 = (iResolveSizeAndState2 & 16777215) - abstractC2590t0.f25128m;
        if (z28 || (i74 != 0 && f13 > 0.0f)) {
            float f15 = abstractC2590t0.f25129n;
            if (f15 > 0.0f) {
                f13 = f15;
            }
            iArr5[3] = -1;
            iArr5[c11] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c11] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC2590t0.f25128m = 0;
            iMax12 = -1;
            int i75 = 0;
            while (i75 < virtualChildCount2) {
                View childAt8 = abstractC2590t0.getChildAt(i75);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    C2588s0 c2588s7 = (C2588s0) childAt8.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) c2588s7).weight;
                    if (f16 > 0.0f) {
                        int i76 = (int) ((i74 * f16) / f13);
                        f13 -= f16;
                        i74 -= i76;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, abstractC2590t0.getPaddingBottom() + abstractC2590t0.getPaddingTop() + ((LinearLayout.LayoutParams) c2588s7).topMargin + ((LinearLayout.LayoutParams) c2588s7).bottomMargin, ((LinearLayout.LayoutParams) c2588s7).height);
                        if (((LinearLayout.LayoutParams) c2588s7).width == 0) {
                            i14 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i76 <= 0) {
                                    i76 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i14 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i76;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i14), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z25) {
                        abstractC2590t0.f25128m = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2588s7).leftMargin + ((LinearLayout.LayoutParams) c2588s7).rightMargin + abstractC2590t0.f25128m;
                    } else {
                        int i77 = abstractC2590t0.f25128m;
                        abstractC2590t0.f25128m = Math.max(i77, childAt8.getMeasuredWidth() + i77 + ((LinearLayout.LayoutParams) c2588s7).leftMargin + ((LinearLayout.LayoutParams) c2588s7).rightMargin);
                    }
                    boolean z31 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c2588s7).height == -1;
                    int i78 = ((LinearLayout.LayoutParams) c2588s7).topMargin + ((LinearLayout.LayoutParams) c2588s7).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i78;
                    iMax12 = Math.max(iMax12, measuredHeight4);
                    if (!z31) {
                        i78 = measuredHeight4;
                    }
                    int iMax13 = Math.max(i69, i78);
                    if (z26) {
                        i13 = -1;
                        boolean z32 = ((LinearLayout.LayoutParams) c2588s7).height == -1;
                        if (!z29 && (baseline = childAt8.getBaseline()) != i13) {
                            int i79 = ((LinearLayout.LayoutParams) c2588s7).gravity;
                            if (i79 < 0) {
                                i79 = abstractC2590t0.f25127l;
                            }
                            int i80 = (((i79 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i80] = Math.max(iArr5[i80], baseline);
                            iArr6[i80] = Math.max(iArr6[i80], measuredHeight4 - baseline);
                        }
                        z26 = z32;
                        i69 = iMax13;
                    } else {
                        i13 = -1;
                    }
                    if (!z29) {
                    }
                    z26 = z32;
                    i69 = iMax13;
                }
                i75++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i10 = iResolveSizeAndState2;
            i11 = -16777216;
            abstractC2590t0.f25128m = abstractC2590t0.getPaddingRight() + abstractC2590t0.getPaddingLeft() + abstractC2590t0.f25128m;
            int i81 = iArr5[1];
            if (i81 == -1 && iArr5[0] == -1 && iArr5[c11] == -1 && iArr5[3] == -1) {
                i12 = 0;
            } else {
                i12 = 0;
                iMax12 = Math.max(iMax12, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c11]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i81, iArr5[c11]))));
            }
            iMax = i69;
        } else {
            iMax = Math.max(i69, i70);
            if (z30 && mode3 != 1073741824) {
                for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                    View childAt9 = abstractC2590t0.getChildAt(i82);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C2588s0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i10 = iResolveSizeAndState2;
            i11 = -16777216;
            i12 = 0;
        }
        if (!z26 && mode4 != 1073741824) {
            iMax12 = iMax;
        }
        abstractC2590t0.setMeasuredDimension(i10 | (iCombineMeasuredStates3 & i11), View.resolveSizeAndState(Math.max(abstractC2590t0.getPaddingBottom() + abstractC2590t0.getPaddingTop() + iMax12, abstractC2590t0.getSuggestedMinimumHeight()), i9, iCombineMeasuredStates3 << 16));
        if (z27) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC2590t0.getMeasuredHeight(), 1073741824);
            int i83 = i12;
            while (i83 < virtualChildCount2) {
                View childAt10 = abstractC2590t0.getChildAt(i83);
                if (childAt10.getVisibility() != 8) {
                    C2588s0 c2588s8 = (C2588s0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c2588s8).height == -1) {
                        int i84 = ((LinearLayout.LayoutParams) c2588s8).width;
                        ((LinearLayout.LayoutParams) c2588s8).width = childAt10.getMeasuredWidth();
                        abstractC2590t0.measureChildWithMargins(childAt10, i55, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c2588s8).width = i84;
                    }
                }
                i83++;
                abstractC2590t0 = this;
                i55 = i3;
            }
        }
    }

    public void setBaselineAligned(boolean z6) {
        this.f25124h = z6;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f25125i = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f25133r) {
            return;
        }
        this.f25133r = drawable;
        if (drawable != null) {
            this.f25134s = drawable.getIntrinsicWidth();
            this.f25135t = drawable.getIntrinsicHeight();
        } else {
            this.f25134s = 0;
            this.f25135t = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f25137v = i3;
    }

    public void setGravity(int i3) {
        if (this.f25127l != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f25127l = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i9 = i3 & 8388615;
        int i10 = this.f25127l;
        if ((8388615 & i10) != i9) {
            this.f25127l = i9 | ((-8388616) & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z6) {
        this.f25130o = z6;
    }

    public void setOrientation(int i3) {
        if (this.f25126k != i3) {
            this.f25126k = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f25136u) {
            requestLayout();
        }
        this.f25136u = i3;
    }

    public void setVerticalGravity(int i3) {
        int i9 = i3 & 112;
        int i10 = this.f25127l;
        if ((i10 & 112) != i9) {
            this.f25127l = i9 | (i10 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f9) {
        this.f25129n = Math.max(0.0f, f9);
    }

    @Override
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
