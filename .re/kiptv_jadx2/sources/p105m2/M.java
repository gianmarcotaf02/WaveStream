package p105m2;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

public final class M extends F {
    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        f0 f0Var = (f0) ((L) this.f25221a);
        int iJ = f0Var.j(routeInfo);
        if (iJ >= 0) {
            d0 d0Var = (d0) f0Var.f25321x.get(iJ);
            Display displayA = N.a(routeInfo);
            int displayId = displayA != null ? displayA.getDisplayId() : -1;
            if (displayId != d0Var.f25280c.f25349a.getInt("presentationDisplayId", -1)) {
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
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                d0Var.f25280c = new C2617o(bundle);
                f0Var.u();
            }
        }
    }
}
