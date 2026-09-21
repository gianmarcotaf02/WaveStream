package D1;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

public final class C0238x {

    public final InterfaceC0237w f2073a;

    public C0238x(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f2073a = new C0236v(nestedScrollView);
        } else {
            this.f2073a = new B3.o(9);
        }
    }
}
