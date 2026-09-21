package com.google.android.gms.cast.framework.media.widget;

/* JADX INFO: loaded from: classes.dex */
public class CastSeekBar extends android.view.View {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f18672q = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A3.a f18673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f18674i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f18675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f18676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f18677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18680p;

    public CastSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f18674i = new java.util.ArrayList();
        setAccessibilityDelegate(new A3.b(this));
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f18677m = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.j = context.getResources().getDimension(com.kiptv.tv.R.dimen.cast_seek_bar_minimum_width);
        this.f18675k = context.getResources().getDimension(com.kiptv.tv.R.dimen.cast_seek_bar_minimum_height);
        this.f18676l = context.getResources().getDimension(com.kiptv.tv.R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(com.kiptv.tv.R.dimen.cast_seek_bar_thumb_size);
        context.getResources().getDimension(com.kiptv.tv.R.dimen.cast_seek_bar_ad_break_minimum_width);
        this.f18673h = new A3.a();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p191x3.AbstractC3104e.f31192a, com.kiptv.tv.R.attr.castExpandedControllerStyle, com.kiptv.tv.R.style.CastExpandedController);
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

    public final void a(android.graphics.Canvas canvas, int i3, int i9, int i10, int i11) {
        android.graphics.Paint paint = this.f18677m;
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

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        com.google.android.gms.cast.framework.media.widget.CastSeekBar castSeekBar;
        android.graphics.Canvas canvas2;
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
        int iMax = java.lang.Math.max(0, 0);
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
        java.util.ArrayList arrayList = castSeekBar.f18674i;
        if (arrayList != null && !arrayList.isEmpty()) {
            castSeekBar.f18677m.setColor(castSeekBar.f18680p);
            getMeasuredWidth();
            getPaddingLeft();
            getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int iSave3 = canvas2.save();
            canvas2.translate(0.0f, measuredHeight2 / 2);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new java.lang.ClassCastException();
                }
            }
            canvas2.restoreToCount(iSave3);
        }
        isEnabled();
        canvas2.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i3, int i9) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(android.view.View.resolveSizeAndState((int) (this.j + paddingLeft + getPaddingRight()), i3, 0), android.view.View.resolveSizeAndState((int) (this.f18675k + getPaddingTop() + getPaddingBottom()), i9, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.f18673h.getClass();
        return false;
    }
}
