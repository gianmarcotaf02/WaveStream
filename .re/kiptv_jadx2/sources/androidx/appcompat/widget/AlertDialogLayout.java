package androidx.appcompat.widget;

import D1.U;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kiptv.tv.R;
import java.util.WeakHashMap;
import p103m.AbstractC2590t0;
import p103m.C2588s0;

public class AlertDialogLayout extends AbstractC2590t0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int i(View view) {
        WeakHashMap weakHashMap = U.f1980a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return i(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    @Override
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int paddingLeft = getPaddingLeft();
        int i15 = i10 - i3;
        int paddingRight = i15 - getPaddingRight();
        int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i16 = gravity & 112;
        int i17 = gravity & 8388615;
        int paddingTop = i16 != 16 ? i16 != 80 ? getPaddingTop() : ((getPaddingTop() + i11) - i9) - measuredHeight : (((i11 - i9) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C2588s0 c2588s0 = (C2588s0) childAt.getLayoutParams();
                int i19 = ((LinearLayout.LayoutParams) c2588s0).gravity;
                if (i19 < 0) {
                    i19 = i17;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i19, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) c2588s0).leftMargin + paddingLeft;
                    } else {
                        i12 = paddingRight - measuredWidth;
                        i13 = ((LinearLayout.LayoutParams) c2588s0).rightMargin;
                    }
                    if (h(i18)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i20 = paddingTop + ((LinearLayout.LayoutParams) c2588s0).topMargin;
                    childAt.layout(i14, i20, measuredWidth + i14, i20 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c2588s0).bottomMargin + i20;
                } else {
                    i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c2588s0).leftMargin;
                    i13 = ((LinearLayout.LayoutParams) c2588s0).rightMargin;
                }
                i14 = i12 - i13;
                if (h(i18)) {
                    paddingTop += intrinsicHeight;
                }
                int i21 = paddingTop + ((LinearLayout.LayoutParams) c2588s0).topMargin;
                childAt.layout(i14, i21, measuredWidth + i14, i21 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c2588s0).bottomMargin + i21;
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        int iCombineMeasuredStates;
        int i10;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = alertDialogLayout.getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i3, i9);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i3, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i3, 0);
            i10 = i(view2);
            measuredHeight = view2.getMeasuredHeight() - i10;
            paddingBottom += i10;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            i10 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i3, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i12 = size - paddingBottom;
        if (view2 != null) {
            int i13 = paddingBottom - i10;
            int iMin = Math.min(i12, measuredHeight);
            if (iMin > 0) {
                i12 -= iMin;
                i10 += iMin;
            }
            view2.measure(i3, View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            paddingBottom = i13 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i12 > 0) {
            view3.measure(i3, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i12, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = alertDialogLayout.getChildAt(i14);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i15 = i9;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i3, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i15, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i16 = 0;
            while (i16 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i16);
                if (childAt3.getVisibility() != 8) {
                    C2588s0 c2588s0 = (C2588s0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c2588s0).width == -1) {
                        int i17 = ((LinearLayout.LayoutParams) c2588s0).height;
                        ((LinearLayout.LayoutParams) c2588s0).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i15, 0);
                        ((LinearLayout.LayoutParams) c2588s0).height = i17;
                    }
                }
                i16++;
                alertDialogLayout = this;
                i15 = i9;
            }
        }
    }
}
