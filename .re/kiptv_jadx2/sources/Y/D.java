package Y;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import p188x0.C3098s;

public final class D extends RippleDrawable {

    public final boolean f10949h;

    public C3098s f10950i;
    public Integer j;

    public boolean f10951k;

    public D(boolean z6) {
        super(ColorStateList.valueOf(-16777216), null, z6 ? new ColorDrawable(-1) : null);
        this.f10949h = z6;
    }

    @Override
    public final Rect getDirtyBounds() {
        if (!this.f10949h) {
            this.f10951k = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f10951k = false;
        return dirtyBounds;
    }

    @Override
    public final boolean isProjected() {
        return this.f10951k;
    }
}
