package p090k2;

import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.widget.RemoteViews;
import androidx.core.app.C;
import androidx.core.app.E;
import androidx.core.app.InterfaceC1487g;

public final class c extends C {

    public int[] f24436a;

    public MediaSessionCompat$Token f24437b;

    @Override
    public final void apply(InterfaceC1487g interfaceC1487g) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.d(((E) interfaceC1487g).f15975b, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.f24436a, this.f24437b));
        } else {
            a.d(((E) interfaceC1487g).f15975b, a.b(a.a(), this.f24436a, this.f24437b));
        }
    }

    @Override
    public final RemoteViews makeBigContentView(InterfaceC1487g interfaceC1487g) {
        return null;
    }

    @Override
    public final RemoteViews makeContentView(InterfaceC1487g interfaceC1487g) {
        return null;
    }
}
