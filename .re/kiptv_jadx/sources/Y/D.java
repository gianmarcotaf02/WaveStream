package Y;

/* JADX INFO: loaded from: classes.dex */
public final class D extends android.graphics.drawable.RippleDrawable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p188x0.C3098s f10950i;
    public java.lang.Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10951k;

    public D(boolean z6) {
        super(android.content.res.ColorStateList.valueOf(-16777216), null, z6 ? new android.graphics.drawable.ColorDrawable(-1) : null);
        this.f10949h = z6;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final android.graphics.Rect getDirtyBounds() {
        if (!this.f10949h) {
            this.f10951k = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        this.f10951k = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f10951k;
    }
}
