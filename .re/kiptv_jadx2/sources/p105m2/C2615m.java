package p105m2;

import D1.A0;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import androidx.media3.common.util.d;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.kiptv.tv.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007a7.z;
import p008a8.c;

public final class C2615m extends AbstractC2622u {
    public static final int y = 0;

    public final MediaRouter2 f25336p;

    public final c f25337q;

    public final ArrayMap f25338r;

    public final MediaRouter2$RouteCallback f25339s;

    public final C2614l f25340t;

    public final C2610h f25341u;

    public final d f25342v;

    public ArrayList f25343w;

    public final ArrayMap f25344x;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public C2615m(Context context, c cVar) {
        super(context, null);
        this.f25338r = new ArrayMap();
        this.f25340t = new C2614l(this);
        this.f25341u = new C2610h(this);
        this.f25343w = new ArrayList();
        this.f25344x = new ArrayMap();
        this.f25336p = MediaRouter2.getInstance(context);
        this.f25337q = cVar;
        this.f25342v = new d(new Handler(Looper.getMainLooper()));
        if (Build.VERSION.SDK_INT >= 34) {
            this.f25339s = new C2613k(this, 1);
        } else {
            this.f25339s = new C2613k(this, 0);
        }
    }

    @Override
    public final AbstractC2620s c(String str) {
        Iterator it = this.f25338r.entrySet().iterator();
        while (it.hasNext()) {
            C2611i c2611i = (C2611i) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, c2611i.f25323f)) {
                return c2611i;
            }
        }
        return null;
    }

    @Override
    public final AbstractC2621t d(String str) {
        return new C2612j((String) this.f25344x.get(str), null);
    }

    @Override
    public final AbstractC2621t e(String str, String str2) {
        String str3 = (String) this.f25344x.get(str);
        for (C2611i c2611i : this.f25338r.values()) {
            C2617o c2617o = c2611i.f25330o;
            if (TextUtils.equals(str2, c2617o != null ? c2617o.d() : c2611i.g.getId())) {
                return new C2612j(str3, c2611i);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C2612j(str3, null);
    }

    @Override
    public final void f(C2618p c2618p) {
        ArrayList<String> arrayList;
        C2623v c2623v;
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.f25339s;
        int i3 = C.f25213c == null ? 0 : C.c().f25310z;
        C2610h c2610h = this.f25341u;
        C2614l c2614l = this.f25340t;
        if (i3 <= 0) {
            this.f25336p.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.f25336p.unregisterTransferCallback(c2614l);
            this.f25336p.unregisterControllerCallback(c2610h);
            return;
        }
        P p2 = C.c().f25301p;
        boolean z6 = p2 == null ? false : p2.f25228c;
        if (c2618p == null) {
            c2618p = new C2618p(C2623v.f25370c, false);
        }
        c2618p.a();
        ArrayList<String> arrayListB = c2618p.f25351b.b();
        if (!z6) {
            arrayListB.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListB.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListB.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (arrayListB.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = null;
            for (String str : arrayListB) {
                if (str == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null) {
            c2623v = C2623v.f25370c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            c2623v = new C2623v(bundle, arrayList);
        }
        boolean zB = c2618p.b();
        if (c2623v == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", c2623v.f25371a);
        bundle2.putBoolean("activeScan", zB);
        MediaRouter2 mediaRouter2 = this.f25336p;
        c2623v.a();
        if (c2623v.f25372b.contains(null)) {
            A0.o();
            routeDiscoveryPreferenceBuild = AbstractC2609g.c(new ArrayList()).build();
        } else {
            boolean z9 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : c2623v.b()) {
                str2.getClass();
                switch (str2) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str2 = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str2 = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str2);
            }
            routeDiscoveryPreferenceBuild = AbstractC2609g.d(arrayList2, z9).build();
        }
        d dVar = this.f25342v;
        mediaRouter2.registerRouteCallback(dVar, mediaRouter2$RouteCallback, routeDiscoveryPreferenceBuild);
        this.f25336p.registerTransferCallback(dVar, c2614l);
        this.f25336p.registerControllerCallback(dVar, c2610h);
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.f25336p.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoC = A0.c(it.next());
            if (mediaRoute2InfoC != null && !arraySet.contains(mediaRoute2InfoC) && !mediaRoute2InfoC.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoC);
                arrayList.add(mediaRoute2InfoC);
            }
        }
        if (arrayList.equals(this.f25343w)) {
            return;
        }
        this.f25343w = arrayList;
        ArrayMap arrayMap = this.f25344x;
        arrayMap.clear();
        Iterator it2 = this.f25343w.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoC2 = A0.c(it2.next());
            Bundle extras = mediaRoute2InfoC2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2InfoC2);
            } else {
                arrayMap.put(mediaRoute2InfoC2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList<C2617o> arrayList2 = new ArrayList();
        Iterator it3 = this.f25343w.iterator();
        while (it3.hasNext()) {
            MediaRoute2Info mediaRoute2InfoC3 = A0.c(it3.next());
            C2617o c2617oP0 = AbstractC1864o0.p0(mediaRoute2InfoC3);
            if (mediaRoute2InfoC3 != null) {
                arrayList2.add(c2617oP0);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            for (C2617o c2617o : arrayList2) {
                if (c2617o == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList3.contains(c2617o)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList3.add(c2617o);
            }
        }
        g(new z(arrayList3, true));
    }

    public final void j(MediaRouter2.RoutingController routingController) {
        C2616n c2616n;
        C2611i c2611i = (C2611i) this.f25338r.get(routingController);
        if (c2611i == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList<String> arrayListH0 = AbstractC1864o0.h0(selectedRoutes);
        C2617o c2617oP0 = AbstractC1864o0.p0(A0.c(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f25363h.getString(R.string.mr_dialog_default_group_name);
        C2617o c2617o = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    c2617o = new C2617o(bundle);
                }
            } catch (Exception e6) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e6);
            }
        }
        if (c2617o == null) {
            c2616n = new C2616n(routingController.getId(), string);
            Bundle bundle2 = c2616n.f25345a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            c2616n = new C2616n(c2617o);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = c2616n.f25345a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        c2616n.f25347c.clear();
        c2616n.a(c2617oP0.b());
        ArrayList arrayList = c2616n.f25346b;
        arrayList.clear();
        if (!arrayListH0.isEmpty()) {
            for (String str : arrayListH0) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        C2617o c2617oB = c2616n.b();
        ArrayList arrayListH1 = AbstractC1864o0.h0(routingController.getSelectableRoutes());
        ArrayList arrayListH2 = AbstractC1864o0.h0(routingController.getDeselectableRoutes());
        z zVar = this.f25368n;
        if (zVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<C2617o> list = zVar.f15517b;
        if (!list.isEmpty()) {
            for (C2617o c2617o2 : list) {
                String strD = c2617o2.d();
                int i3 = arrayListH0.contains(strD) ? 3 : 1;
                arrayListH1.contains(strD);
                arrayListH2.contains(strD);
                arrayList2.add(new r(c2617o2, i3));
            }
        }
        c2611i.f25330o = c2617oB;
        c2611i.j(c2617oB, arrayList2);
    }
}
