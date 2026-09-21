package F0;

import D1.U;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

public final class b implements a {

    public final int f3509a;

    public final View f3510b;

    public b(View view, int i3) {
        this.f3509a = i3;
        this.f3510b = view;
    }

    @Override
    public final void a() {
        switch (this.f3509a) {
            case 0:
                U.g(9, (AndroidComposeView) this.f3510b);
                break;
            default:
                U.g(9, this.f3510b);
                break;
        }
    }
}
