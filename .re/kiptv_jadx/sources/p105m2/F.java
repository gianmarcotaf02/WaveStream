package p105m2;

/* JADX INFO: loaded from: classes.dex */
public class F extends android.media.MediaRouter.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p105m2.E f25221a;

    public F(p105m2.E e6) {
        this.f25221a = e6;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteInfo routeInfo) {
        p105m2.f0 f0Var = (p105m2.f0) this.f25221a;
        if (f0Var.i(routeInfo)) {
            f0Var.u();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteInfo routeInfo) {
        int iJ;
        p105m2.f0 f0Var = (p105m2.f0) this.f25221a;
        f0Var.getClass();
        if (p105m2.f0.o(routeInfo) != null || (iJ = f0Var.j(routeInfo)) < 0) {
            return;
        }
        p105m2.d0 d0Var = (p105m2.d0) f0Var.f25321x.get(iJ);
        java.lang.String str = d0Var.f25279b;
        java.lang.CharSequence charSequenceA = p105m2.G.a(d0Var.f25278a, f0Var.f25363h);
        p105m2.C2616n c2616n = new p105m2.C2616n(str, charSequenceA != null ? charSequenceA.toString() : "");
        f0Var.q(d0Var, c2616n);
        d0Var.f25280c = c2616n.b();
        f0Var.u();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteInfo routeInfo, android.media.MediaRouter.RouteGroup routeGroup, int i3) {
        this.f25221a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteInfo routeInfo) {
        int iJ;
        p105m2.f0 f0Var = (p105m2.f0) this.f25221a;
        f0Var.getClass();
        if (p105m2.f0.o(routeInfo) != null || (iJ = f0Var.j(routeInfo)) < 0) {
            return;
        }
        f0Var.f25321x.remove(iJ);
        f0Var.u();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(android.media.MediaRouter mediaRouter, int i3, android.media.MediaRouter.RouteInfo routeInfo) {
        p105m2.A a2;
        p105m2.f0 f0Var = (p105m2.f0) this.f25221a;
        if (routeInfo != p105m2.K.i(f0Var.f25314q, 8388611)) {
            return;
        }
        p105m2.e0 e0VarO = p105m2.f0.o(routeInfo);
        if (e0VarO != null) {
            p105m2.A a9 = e0VarO.f25281a;
            a9.getClass();
            p105m2.C.b();
            p105m2.C.c().i(a9, 3);
            return;
        }
        int iJ = f0Var.j(routeInfo);
        if (iJ >= 0) {
            java.lang.String str = ((p105m2.d0) f0Var.f25321x.get(iJ)).f25279b;
            p105m2.C2608f c2608f = f0Var.f25313p;
            c2608f.f25298m.removeMessages(org.videolan.libvlc.MediaPlayer.Event.Stopped);
            p105m2.C2627z c2627zD = c2608f.d(c2608f.f25289b);
            if (c2627zD != null) {
                java.util.Iterator it = c2627zD.f25387b.iterator();
                do {
                    if (!it.hasNext()) {
                        a2 = null;
                        break;
                    }
                    a2 = (p105m2.A) it.next();
                } while (!a2.f25194b.equals(str));
                if (a2 != null) {
                    p105m2.C.b();
                    p105m2.C.c().i(a2, 3);
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteInfo routeInfo, android.media.MediaRouter.RouteGroup routeGroup) {
        this.f25221a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(android.media.MediaRouter mediaRouter, int i3, android.media.MediaRouter.RouteInfo routeInfo) {
        this.f25221a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteInfo routeInfo) {
        int iJ;
        p105m2.f0 f0Var = (p105m2.f0) this.f25221a;
        f0Var.getClass();
        if (p105m2.f0.o(routeInfo) != null || (iJ = f0Var.j(routeInfo)) < 0) {
            return;
        }
        p105m2.d0 d0Var = (p105m2.d0) f0Var.f25321x.get(iJ);
        int iF = p105m2.G.f(routeInfo);
        if (iF != d0Var.f25280c.f25349a.getInt("volume")) {
            p105m2.C2617o c2617o = d0Var.f25280c;
            new java.util.ArrayList();
            new java.util.ArrayList();
            new java.util.HashSet();
            if (c2617o == null) {
                throw new java.lang.IllegalArgumentException("descriptor must not be null");
            }
            android.os.Bundle bundle = new android.os.Bundle(c2617o.f25349a);
            java.util.ArrayList arrayListC = c2617o.c();
            java.util.ArrayList arrayListB = c2617o.b();
            java.util.HashSet hashSetA = c2617o.a();
            bundle.putInt("volume", iF);
            bundle.putParcelableArrayList("controlFilters", new java.util.ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new java.util.ArrayList<>(arrayListC));
            bundle.putStringArrayList("allowedPackages", new java.util.ArrayList<>(hashSetA));
            d0Var.f25280c = new p105m2.C2617o(bundle);
            f0Var.u();
        }
    }
}
