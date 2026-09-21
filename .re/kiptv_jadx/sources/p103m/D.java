package p103m;

/* JADX INFO: loaded from: classes.dex */
public class D extends android.widget.SeekBar {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p103m.E f24902h;

    public D(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.kiptv.tv.R.attr.seekBarStyle);
        p103m.N0.a(this, getContext());
        p103m.E e6 = new p103m.E(this);
        this.f24902h = e6;
        e6.b(attributeSet, com.kiptv.tv.R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p103m.E e6 = this.f24902h;
        android.graphics.drawable.Drawable drawable = e6.f24904f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        p103m.D d4 = e6.f24903e;
        if (drawable.setState(d4.getDrawableState())) {
            d4.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable drawable = this.f24902h.f24904f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        this.f24902h.g(canvas);
    }
}
