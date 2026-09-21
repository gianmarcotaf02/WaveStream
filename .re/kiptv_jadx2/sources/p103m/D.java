package p103m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.kiptv.tv.R;

public class D extends SeekBar {

    public final E f24902h;

    public D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        N0.a(this, getContext());
        E e6 = new E(this);
        this.f24902h = e6;
        e6.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override
    public void drawableStateChanged() {
        super.drawableStateChanged();
        E e6 = this.f24902h;
        Drawable drawable = e6.f24904f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        D d4 = e6.f24903e;
        if (drawable.setState(d4.getDrawableState())) {
            d4.invalidateDrawable(drawable);
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f24902h.f24904f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f24902h.g(canvas);
    }
}
