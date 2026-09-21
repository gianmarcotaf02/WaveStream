package com.google.android.gms.cast.framework.media.widget;

import A3.a;
import A3.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.kiptv.tv.R;
import java.util.ArrayList;
import java.util.Iterator;
import p191x3.AbstractC3104e;

public class CastSeekBar extends View {

    public static final int f18672q = 0;

    public final a f18673h;

    public final ArrayList f18674i;
    public final float j;

    public final float f18675k;

    public final float f18676l;

    public final Paint f18677m;

    public final int f18678n;

    public final int f18679o;

    public final int f18680p;

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f18674i = new ArrayList();
        setAccessibilityDelegate(new b(this));
        Paint paint = new Paint(1);
        this.f18677m = paint;
        paint.setStyle(Paint.Style.FILL);
        this.j = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f18675k = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.f18676l = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        this.f18673h = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC3104e.f31192a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f18678n = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.f18679o = context.getResources().getColor(resourceId3);
        this.f18680p = context.getResources().getColor(resourceId4);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i3, int i9, int i10, int i11) {
        Paint paint = this.f18677m;
        paint.setColor(i11);
        float f9 = 1;
        float f10 = i10;
        float f11 = this.f18676l;
        canvas.drawRect((i3 / f9) * f10, -f11, (i9 / f9) * f10, f11, paint);
    }

    public int getMaxProgress() {
        this.f18673h.getClass();
        return 1;
    }

    public int getProgress() {
        this.f18673h.getClass();
        return 0;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int i3;
        int i9;
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int iSave2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        this.f18673h.getClass();
        int iMax = Math.max(0, 0);
        if (iMax > 0) {
            i3 = iMax;
            castSeekBar = this;
            canvas2 = canvas;
            castSeekBar.a(canvas2, 0, i3, measuredWidth, this.f18679o);
        } else {
            castSeekBar = this;
            canvas2 = canvas;
            i3 = iMax;
        }
        if (progress > i3) {
            castSeekBar.a(canvas2, i3, progress, measuredWidth, castSeekBar.f18678n);
            i9 = progress;
        } else {
            i9 = progress;
        }
        if (1 > i9) {
            castSeekBar.a(canvas2, i9, 1, measuredWidth, castSeekBar.f18679o);
        }
        canvas2.restoreToCount(iSave2);
        ArrayList arrayList = castSeekBar.f18674i;
        if (arrayList != null && !arrayList.isEmpty()) {
            castSeekBar.f18677m.setColor(castSeekBar.f18680p);
            getMeasuredWidth();
            getPaddingLeft();
            getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int iSave3 = canvas2.save();
            canvas2.translate(0.0f, measuredHeight2 / 2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
            }
            canvas2.restoreToCount(iSave3);
        }
        isEnabled();
        canvas2.restoreToCount(iSave);
    }

    @Override
    public final synchronized void onMeasure(int i3, int i9) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.j + paddingLeft + getPaddingRight()), i3, 0), View.resolveSizeAndState((int) (this.f18675k + getPaddingTop() + getPaddingBottom()), i9, 0));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.f18673h.getClass();
        return false;
    }
}
