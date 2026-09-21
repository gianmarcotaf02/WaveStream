package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.a;
import java.lang.ref.WeakReference;
import p103m.e1;

public final class ViewStubCompat extends View {

    public int f15777h;

    public int f15778i;
    public WeakReference j;

    public LayoutInflater f15779k;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15777h = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f22427z, 0, 0);
        this.f15778i = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f15777h = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f15777h == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f15779k;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f15777h, viewGroup, false);
        int i3 = this.f15778i;
        if (i3 != -1) {
            viewInflate.setId(i3);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.j = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f15778i;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f15779k;
    }

    public int getLayoutResource() {
        return this.f15777h;
    }

    @Override
    public final void onMeasure(int i3, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i3) {
        this.f15778i = i3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f15779k = layoutInflater;
    }

    public void setLayoutResource(int i3) {
        this.f15777h = i3;
    }

    @Override
    public void setVisibility(int i3) {
        WeakReference weakReference = this.j;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i3);
            return;
        }
        super.setVisibility(i3);
        if (i3 == 0 || i3 == 4) {
            a();
        }
    }

    public void setOnInflateListener(e1 e1Var) {
    }
}
