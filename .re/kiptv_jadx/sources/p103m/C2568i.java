package p103m;

/* JADX INFO: renamed from: m.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2568i extends p103m.C2595w implements p103m.InterfaceC2572k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p103m.C2570j f25046k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2568i(p103m.C2570j c2570j, android.content.Context context) {
        super(context, null, com.kiptv.tv.R.attr.actionOverflowButtonStyle);
        this.f25046k = c2570j;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        com.google.crypto.tink.shaded.protobuf.AbstractC1911f.E(this, getContentDescription());
        setOnTouchListener(new p095l.C2545b(this, this));
    }

    @Override // p103m.InterfaceC2572k
    public final boolean a() {
        return false;
    }

    @Override // p103m.InterfaceC2572k
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f25046k.l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i9, int i10, int i11) {
        boolean frame = super.setFrame(i3, i9, i10, i11);
        android.graphics.drawable.Drawable drawable = getDrawable();
        android.graphics.drawable.Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = java.lang.Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
