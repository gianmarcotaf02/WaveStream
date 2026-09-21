package p105m2;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import com.kiptv.tv.R;
import com.revenuecat.purchases.common.events.BackendEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p007a7.z;
import p008a8.c;

public abstract class f0 extends g0 implements L, E, I {

    public static final ArrayList f25311A;

    public static final ArrayList f25312z;

    public final C2608f f25313p;

    public final MediaRouter f25314q;

    public final MediaRouter.Callback f25315r;

    public final MediaRouter.VolumeCallback f25316s;

    public final MediaRouter.RouteCategory f25317t;

    public int f25318u;

    public boolean f25319v;

    public boolean f25320w;

    public final ArrayList f25321x;
    public final ArrayList y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        f25312z = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        f25311A = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public f0(Context context, C2608f c2608f) {
        super(context, new c(14, new ComponentName(BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM, g0.class.getName())));
        this.f25321x = new ArrayList();
        this.y = new ArrayList();
        this.f25313p = c2608f;
        MediaRouter mediaRouterG = K.g(context);
        this.f25314q = mediaRouterG;
        this.f25315r = new M(this);
        this.f25316s = K.f(this);
        this.f25317t = K.d(mediaRouterG, context.getResources().getString(R.string.mr_user_route_category_name), false);
        x();
    }

    public static e0 o(MediaRouter.RouteInfo routeInfo) {
        Object objE = G.e(routeInfo);
        if (objE instanceof e0) {
            return (e0) objE;
        }
        return null;
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i3) {
        e0 e0VarO = o(routeInfo);
        if (e0VarO != null) {
            e0VarO.f25281a.g(i3);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i3) {
        e0 e0VarO = o(routeInfo);
        if (e0VarO != null) {
            e0VarO.f25281a.h(i3);
        }
    }

    @Override
    public final AbstractC2621t d(String str) {
        int iK = k(str);
        if (iK >= 0) {
            return new c0(((d0) this.f25321x.get(iK)).f25278a);
        }
        return null;
    }

    @Override
    public final void f(C2618p c2618p) {
        boolean zB;
        int i3 = 0;
        if (c2618p != null) {
            c2618p.a();
            ArrayList arrayListB = c2618p.f25351b.b();
            int size = arrayListB.size();
            int i9 = 0;
            while (i3 < size) {
                String str = (String) arrayListB.get(i3);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i9 |= 1;
                } else {
                    i9 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i9 | 2 : i9 | 8388608;
                }
                i3++;
            }
            zB = c2618p.b();
            i3 = i9;
        } else {
            zB = false;
        }
        if (this.f25318u == i3 && this.f25319v == zB) {
            return;
        }
        this.f25318u = i3;
        this.f25319v = zB;
        x();
    }

    public final boolean i(MediaRouter.RouteInfo routeInfo) {
        String str;
        String str2;
        if (o(routeInfo) != null || j(routeInfo) >= 0) {
            return false;
        }
        Object objN = n();
        Context context = this.f25363h;
        if (objN == routeInfo) {
            str = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence charSequenceA = G.a(routeInfo, context);
            str = String.format(locale, "ROUTE_%08x", Integer.valueOf((charSequenceA != null ? charSequenceA.toString() : "").hashCode()));
        }
        if (k(str) >= 0) {
            int i3 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = str + "_" + i3;
                if (k(str2) < 0) {
                    break;
                }
                i3++;
            }
            str = str2;
        }
        d0 d0Var = new d0(routeInfo, str);
        CharSequence charSequenceA2 = G.a(routeInfo, context);
        C2616n c2616n = new C2616n(str, charSequenceA2 != null ? charSequenceA2.toString() : "");
        q(d0Var, c2616n);
        d0Var.f25280c = c2616n.b();
        this.f25321x.add(d0Var);
        return true;
    }

    public final int j(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.f25321x;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((d0) arrayList.get(i3)).f25278a == routeInfo) {
                return i3;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.f25321x;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((d0) arrayList.get(i3)).f25279b.equals(str)) {
                return i3;
            }
        }
        return -1;
    }

    public final int l(A a2) {
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((e0) arrayList.get(i3)).f25281a == a2) {
                return i3;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo m() {
        return this.f25314q.getDefaultRoute();
    }

    public Object n() {
        return m();
    }

    public boolean p(d0 d0Var) {
        return d0Var.f25278a.isConnecting();
    }

    public void q(d0 d0Var, C2616n c2616n) {
        int iD = G.d(d0Var.f25278a);
        if ((iD & 1) != 0) {
            c2616n.a(f25312z);
        }
        if ((iD & 2) != 0) {
            c2616n.a(f25311A);
        }
        MediaRouter.RouteInfo routeInfo = d0Var.f25278a;
        c2616n.f25345a.putInt("playbackType", G.c(routeInfo));
        int iB = G.b(routeInfo);
        Bundle bundle = c2616n.f25345a;
        bundle.putInt("playbackStream", iB);
        bundle.putInt("volume", G.f(routeInfo));
        bundle.putInt("volumeMax", G.h(routeInfo));
        bundle.putInt("volumeHandling", G.g(routeInfo));
        MediaRouter.RouteInfo routeInfo2 = d0Var.f25278a;
        boolean zB = N.b(routeInfo2);
        Bundle bundle2 = c2616n.f25345a;
        if (!zB) {
            bundle2.putBoolean("enabled", false);
        }
        if (p(d0Var)) {
            bundle2.putInt("connectionState", 1);
        }
        Display displayA = N.a(routeInfo2);
        if (displayA != null) {
            bundle2.putInt("presentationDisplayId", displayA.getDisplayId());
        }
        CharSequence description = d0Var.f25278a.getDescription();
        if (description != null) {
            c2616n.f25345a.putString("status", description.toString());
        }
    }

    public final void r(A a2) {
        AbstractC2622u abstractC2622uA = a2.a();
        MediaRouter mediaRouter = this.f25314q;
        if (abstractC2622uA == this) {
            int iJ = j(K.i(mediaRouter, 8388611));
            if (iJ < 0 || !((d0) this.f25321x.get(iJ)).f25279b.equals(a2.f25194b)) {
                return;
            }
            C.b();
            C.c().i(a2, 3);
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoE = K.e(mediaRouter, this.f25317t);
        e0 e0Var = new e0(a2, userRouteInfoE);
        G.k(userRouteInfoE, e0Var);
        H.f(userRouteInfoE, this.f25316s);
        y(e0Var);
        this.y.add(e0Var);
        K.b(mediaRouter, userRouteInfoE);
    }

    public final void s(A a2) {
        int iL;
        if (a2.a() == this || (iL = l(a2)) < 0) {
            return;
        }
        e0 e0Var = (e0) this.y.remove(iL);
        G.k(e0Var.f25282b, null);
        MediaRouter.UserRouteInfo userRouteInfo = e0Var.f25282b;
        H.f(userRouteInfo, null);
        K.k(this.f25314q, userRouteInfo);
    }

    public final void t(A a2) {
        a2.getClass();
        C.b();
        if (C.c().e() == a2) {
            if (a2.a() != this) {
                int iL = l(a2);
                if (iL >= 0) {
                    v(((e0) this.y.get(iL)).f25282b);
                    return;
                }
                return;
            }
            int iK = k(a2.f25194b);
            if (iK >= 0) {
                v(((d0) this.f25321x.get(iK)).f25278a);
            }
        }
    }

    public final void u() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f25321x;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C2617o c2617o = ((d0) arrayList2.get(i3)).f25280c;
            if (c2617o == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(c2617o)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(c2617o);
        }
        g(new z(arrayList, false));
    }

    public void v(MediaRouter.RouteInfo routeInfo) {
        K.l(this.f25314q, 8388611, routeInfo);
    }

    public void w() {
        boolean z6 = this.f25320w;
        MediaRouter.Callback callback = this.f25315r;
        MediaRouter mediaRouter = this.f25314q;
        if (z6) {
            K.j(mediaRouter, callback);
        }
        this.f25320w = true;
        mediaRouter.addCallback(this.f25318u, callback, (this.f25319v ? 1 : 0) | 2);
    }

    public final void x() {
        w();
        Iterator<MediaRouter.RouteInfo> it = K.h(this.f25314q).iterator();
        boolean zI = false;
        while (it.hasNext()) {
            zI |= i(it.next());
        }
        if (zI) {
            u();
        }
    }

    public void y(e0 e0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = e0Var.f25282b;
        A a2 = e0Var.f25281a;
        H.a(userRouteInfo, a2.f25196d);
        int i3 = a2.f25201k;
        MediaRouter.UserRouteInfo userRouteInfo2 = e0Var.f25282b;
        H.c(userRouteInfo2, i3);
        H.b(userRouteInfo2, a2.f25202l);
        H.e(userRouteInfo2, a2.f25205o);
        H.h(userRouteInfo2, a2.f25206p);
        H.g(userRouteInfo2, a2.b());
        e0Var.f25282b.setDescription(e0Var.f25281a.f25197e);
    }
}
