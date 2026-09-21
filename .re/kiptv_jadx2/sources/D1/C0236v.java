package D1;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

public final class C0236v implements InterfaceC0237w {

    public final ScrollFeedbackProvider f2069h;

    public C0236v(NestedScrollView nestedScrollView) {
        this.f2069h = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void a(boolean z6, int i3, int i9, int i10) {
        this.f2069h.onScrollLimit(i3, i9, i10, z6);
    }

    @Override
    public final void b(int i3, int i9, int i10, int i11) {
        this.f2069h.onScrollProgress(i3, i9, i10, i11);
    }
}
