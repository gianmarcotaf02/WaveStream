package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p105m2.F {
    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(android.media.MediaRouter mediaRouter, android.media.MediaRouter.RouteInfo routeInfo) {
        p105m2.f0 f0Var = (p105m2.f0) ((p105m2.L) this.f25221a);
        int iJ = f0Var.j(routeInfo);
        if (iJ >= 0) {
            p105m2.d0 d0Var = (p105m2.d0) f0Var.f25321x.get(iJ);
            android.view.Display displayA = p105m2.N.a(routeInfo);
            int displayId = displayA != null ? displayA.getDisplayId() : -1;
            if (displayId != d0Var.f25280c.f25349a.getInt("presentationDisplayId", -1)) {
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
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new java.util.ArrayList<>(arrayListB));
                bundle.putStringArrayList("groupMemberIds", new java.util.ArrayList<>(arrayListC));
                bundle.putStringArrayList("allowedPackages", new java.util.ArrayList<>(hashSetA));
                d0Var.f25280c = new p105m2.C2617o(bundle);
                f0Var.u();
            }
        }
    }
}
