package p103m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.kiptv.tv.R;

public final class B extends RatingBar {

    public final C2601z f24877h;

    public B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        N0.a(this, getContext());
        C2601z c2601z = new C2601z(this);
        this.f24877h = c2601z;
        c2601z.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override
    public final synchronized void onMeasure(int i3, int i9) {
        super.onMeasure(i3, i9);
        Bitmap bitmap = (Bitmap) this.f24877h.f25154c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }
}
