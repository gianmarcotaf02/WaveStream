package p103m;

import Q0.w0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import com.google.common.util.concurrent.AbstractC1903s;
import h.a;
import j1.l;
import p088k.b;
import p095l.ViewTreeObserverOnGlobalLayoutListenerC2547d;

public final class O extends Spinner {

    public static final int[] f24949p = {R.attr.spinnerMode};

    public final w0 f24950h;

    public final Context f24951i;
    public final F j;

    public SpinnerAdapter f24952k;

    public final boolean f24953l;

    public final N f24954m;

    public int f24955n;

    public final Rect f24956o;

    public O(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.kiptv.tv.R.attr.spinnerStyle);
        this.f24956o = new Rect();
        N0.a(this, getContext());
        int[] iArr = a.f22423u;
        l lVarS = l.s(context, attributeSet, iArr, com.kiptv.tv.R.attr.spinnerStyle);
        this.f24950h = new w0(this);
        TypedArray typedArray = (TypedArray) lVarS.j;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f24951i = new b(context, resourceId);
        } else {
            this.f24951i = context;
        }
        int i3 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24949p, com.kiptv.tv.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e6) {
                    e = e6;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i3 != 0) {
                        H h9 = new H(this);
                        this.f24954m = h9;
                        h9.j = typedArray.getString(2);
                    } else if (i3 == 1) {
                        L l2 = new L(this, this.f24951i, attributeSet);
                        l lVarS2 = l.s(this.f24951i, attributeSet, iArr, com.kiptv.tv.R.attr.spinnerStyle);
                        this.f24955n = ((TypedArray) lVarS2.j).getLayoutDimension(3, -2);
                        l2.j(lVarS2.l(1));
                        l2.f24937I = typedArray.getString(2);
                        lVarS2.u();
                        this.f24954m = l2;
                        this.j = new F(this, this, l2);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.kiptv.tv.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    lVarS.u();
                    this.f24953l = true;
                    spinnerAdapter = this.f24952k;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f24952k = null;
                    }
                    this.f24950h.k(attributeSet, com.kiptv.tv.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e9) {
            e = e9;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i3 != 0) {
            H h10 = new H(this);
            this.f24954m = h10;
            h10.j = typedArray.getString(2);
        } else if (i3 == 1) {
            L l9 = new L(this, this.f24951i, attributeSet);
            l lVarS3 = l.s(this.f24951i, attributeSet, iArr, com.kiptv.tv.R.attr.spinnerStyle);
            this.f24955n = ((TypedArray) lVarS3.j).getLayoutDimension(3, -2);
            l9.j(lVarS3.l(1));
            l9.f24937I = typedArray.getString(2);
            lVarS3.u();
            this.f24954m = l9;
            this.j = new F(this, this, l9);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.kiptv.tv.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        lVarS.u();
        this.f24953l = true;
        spinnerAdapter = this.f24952k;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f24952k = null;
        }
        this.f24950h.k(attributeSet, com.kiptv.tv.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f24956o;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.a();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        N n3 = this.f24954m;
        return n3 != null ? n3.b() : super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        N n3 = this.f24954m;
        return n3 != null ? n3.n() : super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        return this.f24954m != null ? this.f24955n : super.getDropDownWidth();
    }

    public final N getInternalPopup() {
        return this.f24954m;
    }

    @Override
    public Drawable getPopupBackground() {
        N n3 = this.f24954m;
        return n3 != null ? n3.f() : super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.f24951i;
    }

    @Override
    public CharSequence getPrompt() {
        N n3 = this.f24954m;
        return n3 != null ? n3.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        w0 w0Var = this.f24950h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w0 w0Var = this.f24950h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        N n3 = this.f24954m;
        if (n3 == null || !n3.a()) {
            return;
        }
        n3.dismiss();
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        super.onMeasure(i3, i9);
        if (this.f24954m == null || View.MeasureSpec.getMode(i3) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
    }

    @Override
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        M m8 = (M) parcelable;
        super.onRestoreInstanceState(m8.getSuperState());
        if (!m8.f24942h || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2547d(2, this));
    }

    @Override
    public final Parcelable onSaveInstanceState() {
        M m8 = new M(super.onSaveInstanceState());
        N n3 = this.f24954m;
        m8.f24942h = n3 != null && n3.a();
        return m8;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        F f9 = this.j;
        if (f9 == null || !f9.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean performClick() {
        N n3 = this.f24954m;
        if (n3 == null) {
            return super.performClick();
        }
        if (n3.a()) {
            return true;
        }
        this.f24954m.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i3) {
        N n3 = this.f24954m;
        if (n3 == null) {
            super.setDropDownHorizontalOffset(i3);
        } else {
            n3.l(i3);
            n3.c(i3);
        }
    }

    @Override
    public void setDropDownVerticalOffset(int i3) {
        N n3 = this.f24954m;
        if (n3 != null) {
            n3.k(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override
    public void setDropDownWidth(int i3) {
        if (this.f24954m != null) {
            this.f24955n = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        N n3 = this.f24954m;
        if (n3 != null) {
            n3.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(AbstractC1903s.y(getPopupContext(), i3));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        N n3 = this.f24954m;
        if (n3 != null) {
            n3.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f24950h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f24953l) {
            this.f24952k = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        N n3 = this.f24954m;
        if (n3 != null) {
            Context context = this.f24951i;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            I i3 = new I();
            i3.f24918a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                i3.f24919b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                G.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            n3.o(i3);
        }
    }
}
