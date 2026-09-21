package androidx.media3.ui;

import android.view.View;

public final class h implements View.OnLayoutChangeListener {

    public final int f17164a;

    public final Object f17165b;

    public h(int i3, Object obj) {
        this.f17164a = i3;
        this.f17165b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        switch (this.f17164a) {
            case 0:
                ((PlayerControlViewLayoutManager) this.f17165b).onLayoutChange(view, i3, i9, i10, i11, i12, i13, i14, i15);
                break;
            default:
                ((PlayerControlView) this.f17165b).onLayoutChange(view, i3, i9, i10, i11, i12, i13, i14, i15);
                break;
        }
    }
}
