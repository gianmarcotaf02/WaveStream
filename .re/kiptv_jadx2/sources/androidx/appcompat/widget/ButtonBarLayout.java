package androidx.appcompat.widget;

import D1.U;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.kiptv.tv.R;
import h.a;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {

    public boolean f15727h;

    public boolean f15728i;
    public int j;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = -1;
        int[] iArr = a.f22413k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        U.i(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f15727h = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f15727h);
        }
    }

    private void setStacked(boolean z6) {
        if (this.f15728i != z6) {
            if (!z6 || this.f15727h) {
                this.f15728i = z6;
                setOrientation(z6 ? 1 : 0);
                setGravity(z6 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z6 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        int iMakeMeasureSpec;
        boolean z6;
        int i10;
        int size = View.MeasureSpec.getSize(i3);
        int paddingBottom = 0;
        if (this.f15727h) {
            if (size > this.j && this.f15728i) {
                setStacked(false);
            }
            this.j = size;
        }
        if (this.f15728i || View.MeasureSpec.getMode(i3) != 1073741824) {
            iMakeMeasureSpec = i3;
            z6 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z6 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i9);
        if (this.f15727h && !this.f15728i && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z6 = true;
        }
        if (z6) {
            super.onMeasure(i3, i9);
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            i10 = -1;
            if (i11 >= childCount) {
                i11 = -1;
                break;
            } else if (getChildAt(i11).getVisibility() == 0) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            View childAt = getChildAt(i11);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f15728i) {
                int childCount2 = getChildCount();
                for (int i12 = i11 + 1; i12 < childCount2; i12++) {
                    if (getChildAt(i12).getVisibility() == 0) {
                        i10 = i12;
                        break;
                    }
                }
                paddingBottom = i10 >= 0 ? getChildAt(i10).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = U.f1980a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i9 == 0) {
                super.onMeasure(i3, i9);
            }
        }
    }

    public void setAllowStacking(boolean z6) {
        if (this.f15727h != z6) {
            this.f15727h = z6;
            if (!z6 && this.f15728i) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
