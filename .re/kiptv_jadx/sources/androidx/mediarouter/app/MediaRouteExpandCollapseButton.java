package androidx.mediarouter.app;

/* JADX INFO: loaded from: classes.dex */
class MediaRouteExpandCollapseButton extends p103m.C2593v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final android.graphics.drawable.AnimationDrawable f17177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.graphics.drawable.AnimationDrawable f17178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f17179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f17180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public android.view.View.OnClickListener f17182p;

    public MediaRouteExpandCollapseButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) context.getDrawable(com.kiptv.tv.R.drawable.mr_group_expand);
        this.f17177k = animationDrawable;
        android.graphics.drawable.AnimationDrawable animationDrawable2 = (android.graphics.drawable.AnimationDrawable) context.getDrawable(com.kiptv.tv.R.drawable.mr_group_collapse);
        this.f17178l = animationDrawable2;
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.kiptv.tv.R.attr.colorPrimary, typedValue, true);
        int color = typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
        java.lang.ThreadLocal threadLocal = p182w1.a.f29758a;
        if (android.graphics.Color.alpha(color) != 255) {
            throw new java.lang.IllegalArgumentException("background can not be translucent: #" + java.lang.Integer.toHexString(color));
        }
        double dB = p182w1.a.b(android.graphics.Color.alpha(-1) < 255 ? p182w1.a.c(-1, color) : -1) + 0.05d;
        double dB2 = p182w1.a.b(color) + 0.05d;
        android.graphics.PorterDuffColorFilter porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(java.lang.Math.max(dB, dB2) / java.lang.Math.min(dB, dB2) < 3.0d ? -570425344 : -1, android.graphics.PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        java.lang.String string = context.getString(com.kiptv.tv.R.string.mr_controller_expand_group);
        this.f17179m = string;
        this.f17180n = context.getString(com.kiptv.tv.R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new androidx.mediarouter.app.a(this));
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f17182p = onClickListener;
    }
}
