package p105m2;

import android.media.MediaRouter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.videolan.libvlc.MediaPlayer;

public class F extends MediaRouter.Callback {

    public final E f25221a;

    public F(E e6) {
        this.f25221a = e6;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        f0 f0Var = (f0) this.f25221a;
        if (f0Var.i(routeInfo)) {
            f0Var.u();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        f0 f0Var = (f0) this.f25221a;
        f0Var.getClass();
        if (f0.o(routeInfo) != null || (iJ = f0Var.j(routeInfo)) < 0) {
            return;
        }
        d0 d0Var = (d0) f0Var.f25321x.get(iJ);
        String str = d0Var.f25279b;
        CharSequence charSequenceA = G.a(d0Var.f25278a, f0Var.f25363h);
        C2616n c2616n = new C2616n(str, charSequenceA != null ? charSequenceA.toString() : "");
        f0Var.q(d0Var, c2616n);
        d0Var.f25280c = c2616n.b();
        f0Var.u();
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i3) {
        this.f25221a.getClass();
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        f0 f0Var = (f0) this.f25221a;
        f0Var.getClass();
        if (f0.o(routeInfo) != null || (iJ = f0Var.j(routeInfo)) < 0) {
            return;
        }
        f0Var.f25321x.remove(iJ);
        f0Var.u();
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        A a2;
        f0 f0Var = (f0) this.f25221a;
        if (routeInfo != K.i(f0Var.f25314q, 8388611)) {
            return;
        }
        e0 e0VarO = f0.o(routeInfo);
        if (e0VarO != null) {
            A a9 = e0VarO.f25281a;
            a9.getClass();
            C.b();
            C.c().i(a9, 3);
            return;
        }
        int iJ = f0Var.j(routeInfo);
        if (iJ >= 0) {
            String str = ((d0) f0Var.f25321x.get(iJ)).f25279b;
            C2608f c2608f = f0Var.f25313p;
            c2608f.f25298m.removeMessages(MediaPlayer.Event.Stopped);
            C2627z c2627zD = c2608f.d(c2608f.f25289b);
            if (c2627zD != null) {
                Iterator it = c2627zD.f25387b.iterator();
                do {
                    if (!it.hasNext()) {
                        a2 = null;
                        break;
                    }
                    a2 = (A) it.next();
                } while (!a2.f25194b.equals(str));
                if (a2 != null) {
                    C.b();
                    C.c().i(a2, 3);
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f25221a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        this.f25221a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        f0 f0Var = (f0) this.f25221a;
        f0Var.getClass();
        if (f0.o(routeInfo) != null || (iJ = f0Var.j(routeInfo)) < 0) {
            return;
        }
        d0 d0Var = (d0) f0Var.f25321x.get(iJ);
        int iF = G.f(routeInfo);
        if (iF != d0Var.f25280c.f25349a.getInt("volume")) {
            C2617o c2617o = d0Var.f25280c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (c2617o == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(c2617o.f25349a);
            ArrayList arrayListC = c2617o.c();
            ArrayList arrayListB = c2617o.b();
            HashSet hashSetA = c2617o.a();
            bundle.putInt("volume", iF);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
            d0Var.f25280c = new C2617o(bundle);
            f0Var.u();
        }
    }
}
