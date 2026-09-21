package p105m2;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

public final class C2613k extends MediaRouter2$RouteCallback {

    public final int f25333a;

    public final C2615m f25334b;

    public C2613k(C2615m c2615m, int i3) {
        this.f25333a = i3;
        this.f25334b = c2615m;
    }

    public void onRoutesAdded(List list) {
        switch (this.f25333a) {
            case 0:
                this.f25334b.i();
                break;
            default:
                super.onRoutesAdded(list);
                break;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f25333a) {
            case 0:
                this.f25334b.i();
                break;
            default:
                super.onRoutesChanged(list);
                break;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f25333a) {
            case 0:
                this.f25334b.i();
                break;
            default:
                super.onRoutesRemoved(list);
                break;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f25333a) {
            case 1:
                this.f25334b.i();
                break;
            default:
                super.onRoutesUpdated(list);
                break;
        }
    }
}
