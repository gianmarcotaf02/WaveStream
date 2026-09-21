package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class B extends android.widget.RatingBar {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p103m.C2601z f24877h;

    public B(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.kiptv.tv.R.attr.ratingBarStyle);
        p103m.N0.a(this, getContext());
        p103m.C2601z c2601z = new p103m.C2601z(this);
        this.f24877h = c2601z;
        c2601z.b(attributeSet, com.kiptv.tv.R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i3, int i9) {
        super.onMeasure(i3, i9);
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f24877h.f25154c;
        if (bitmap != null) {
            setMeasuredDimension(android.view.View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }
}
