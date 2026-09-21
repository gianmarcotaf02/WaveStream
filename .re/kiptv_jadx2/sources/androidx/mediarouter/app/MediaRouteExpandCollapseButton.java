package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.kiptv.tv.R;
import p103m.C2593v;

class MediaRouteExpandCollapseButton extends C2593v {

    public final AnimationDrawable f17177k;

    public final AnimationDrawable f17178l;

    public final String f17179m;

    public final String f17180n;

    public boolean f17181o;

    public View.OnClickListener f17182p;

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_expand);
        this.f17177k = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) context.getDrawable(R.drawable.mr_group_collapse);
        this.f17178l = animationDrawable2;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int color = typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
        ThreadLocal threadLocal = p182w1.a.f29758a;
        if (Color.alpha(color) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(color));
        }
        double dB = p182w1.a.b(Color.alpha(-1) < 255 ? p182w1.a.c(-1, color) : -1) + 0.05d;
        double dB2 = p182w1.a.b(color) + 0.05d;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Math.max(dB, dB2) / Math.min(dB, dB2) < 3.0d ? -570425344 : -1, PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.f17179m = string;
        this.f17180n = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new a(this));
    }

    @Override
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f17182p = onClickListener;
    }
}
