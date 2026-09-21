package p105m2;

import C1.b;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.revenuecat.purchases.common.events.BackendEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import org.videolan.libvlc.MediaPlayer;
import p136q.C2661e;

public final class A {

    public final C2627z f25193a;

    public final String f25194b;

    public final String f25195c;

    public String f25196d;

    public String f25197e;

    public Uri f25198f;
    public boolean g;

    public int f25199h;

    public boolean f25200i;

    public int f25201k;

    public int f25202l;

    public int f25203m;

    public int f25204n;

    public int f25205o;

    public int f25206p;

    public Bundle f25208r;

    public IntentSender f25209s;

    public C2617o f25210t;

    public C2661e f25212v;
    public final ArrayList j = new ArrayList();

    public int f25207q = -1;

    public ArrayList f25211u = new ArrayList();

    public A(C2627z c2627z, String str, String str2) {
        this.f25193a = c2627z;
        this.f25194b = str;
        this.f25195c = str2;
    }

    public final AbstractC2622u a() {
        C2627z c2627z = this.f25193a;
        c2627z.getClass();
        C.b();
        return c2627z.f25386a;
    }

    public final int b() {
        Bundle bundle;
        if (Collections.unmodifiableList(this.f25211u).size() >= 1) {
            if (C.f25213c == null) {
                return 0;
            }
            P p2 = C.c().f25301p;
            if (p2 != null && (bundle = p2.f25229d) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
                return 0;
            }
        }
        return this.f25204n;
    }

    public final boolean c() {
        C.b();
        A a2 = C.c().f25302q;
        if (a2 == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (a2 == this || this.f25203m == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) a().f25364i.f15522i).getPackageName(), BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM) && i("android.media.intent.category.LIVE_AUDIO") && !i("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean d() {
        return this.f25210t != null && this.g;
    }

    public final boolean e(C2623v c2623v) {
        if (c2623v == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        C.b();
        ArrayList<IntentFilter> arrayList = this.j;
        if (arrayList == null) {
            return false;
        }
        c2623v.a();
        if (c2623v.f25372b.isEmpty()) {
            return false;
        }
        for (IntentFilter intentFilter : arrayList) {
            if (intentFilter != null) {
                Iterator it = c2623v.f25372b.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory((String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int f(C2617o c2617o) {
        int i3;
        A a2;
        int iCountActions;
        if (this.f25210t != c2617o) {
            this.f25210t = c2617o;
            if (c2617o != null) {
                String str = this.f25196d;
                Bundle bundle = c2617o.f25349a;
                if (Objects.equals(str, bundle.getString("name"))) {
                    i3 = 0;
                } else {
                    this.f25196d = bundle.getString("name");
                    i3 = 1;
                }
                if (!Objects.equals(this.f25197e, bundle.getString("status"))) {
                    this.f25197e = bundle.getString("status");
                    i3 = 1;
                }
                Uri uri = this.f25198f;
                String string = bundle.getString("iconUri");
                if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
                    String string2 = bundle.getString("iconUri");
                    this.f25198f = string2 == null ? null : Uri.parse(string2);
                    i3 = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i3 = 1;
                }
                if (this.f25199h != bundle.getInt("connectionState", 0)) {
                    this.f25199h = bundle.getInt("connectionState", 0);
                    i3 = 1;
                }
                ArrayList arrayList = this.j;
                ArrayList arrayListB = c2617o.b();
                if (arrayList != arrayListB) {
                    if (arrayList != null) {
                        ListIterator listIterator = arrayList.listIterator();
                        ListIterator listIterator2 = arrayListB.listIterator();
                        while (true) {
                            if (listIterator.hasNext() && listIterator2.hasNext()) {
                                IntentFilter intentFilter = (IntentFilter) listIterator.next();
                                IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                                if (intentFilter != intentFilter2) {
                                    if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= iCountActions) {
                                                int iCountCategories = intentFilter.countCategories();
                                                if (iCountCategories == intentFilter2.countCategories()) {
                                                    int i10 = 0;
                                                    while (true) {
                                                        if (i10 >= iCountCategories) {
                                                            continue;
                                                        } else if (intentFilter.getCategory(i10).equals(intentFilter2.getCategory(i10))) {
                                                            i10++;
                                                        }
                                                    }
                                                }
                                            } else if (intentFilter.getAction(i9).equals(intentFilter2.getAction(i9))) {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                            } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                            }
                            arrayList.clear();
                            arrayList.addAll(c2617o.b());
                            i3 = 1;
                        }
                    } else {
                        arrayList.clear();
                        arrayList.addAll(c2617o.b());
                        i3 = 1;
                    }
                }
                if (this.f25201k != bundle.getInt("playbackType", 1)) {
                    this.f25201k = bundle.getInt("playbackType", 1);
                    i3 = 1;
                }
                if (this.f25202l != bundle.getInt("playbackStream", -1)) {
                    this.f25202l = bundle.getInt("playbackStream", -1);
                    i3 = 1;
                }
                if (this.f25203m != bundle.getInt("deviceType")) {
                    this.f25203m = bundle.getInt("deviceType");
                    i3 = 1;
                }
                int i11 = 3;
                if (this.f25204n != bundle.getInt("volumeHandling", 0)) {
                    this.f25204n = bundle.getInt("volumeHandling", 0);
                    i3 = 3;
                }
                if (this.f25205o != bundle.getInt("volume")) {
                    this.f25205o = bundle.getInt("volume");
                    i3 = 3;
                }
                if (this.f25206p != bundle.getInt("volumeMax")) {
                    this.f25206p = bundle.getInt("volumeMax");
                } else {
                    i11 = i3;
                }
                if (this.f25207q != bundle.getInt("presentationDisplayId", -1)) {
                    this.f25207q = bundle.getInt("presentationDisplayId", -1);
                    i11 |= 5;
                }
                if (!Objects.equals(this.f25208r, bundle.getBundle("extras"))) {
                    this.f25208r = bundle.getBundle("extras");
                    i11 |= 1;
                }
                if (!Objects.equals(this.f25209s, (IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.f25209s = (IntentSender) bundle.getParcelable("settingsIntent");
                    i11 |= 1;
                }
                if (this.f25200i != bundle.getBoolean("canDisconnect", false)) {
                    this.f25200i = bundle.getBoolean("canDisconnect", false);
                    i11 |= 5;
                }
                ArrayList<String> arrayListC = c2617o.c();
                ArrayList arrayList2 = new ArrayList();
                boolean z6 = arrayListC.size() != this.f25211u.size();
                if (!arrayListC.isEmpty()) {
                    C2608f c2608fC = C.c();
                    for (String str2 : arrayListC) {
                        c2608fC.getClass();
                        String str3 = (String) c2608fC.f25294h.get(new b(((ComponentName) this.f25193a.f25389d.f15522i).flattenToShortString(), str2));
                        Iterator it = c2608fC.g.iterator();
                        do {
                            if (!it.hasNext()) {
                                a2 = null;
                                break;
                            }
                            a2 = (A) it.next();
                        } while (!a2.f25195c.equals(str3));
                        if (a2 != null) {
                            arrayList2.add(a2);
                            if (!z6 && !this.f25211u.contains(a2)) {
                                z6 = true;
                            }
                        }
                    }
                }
                if (!z6) {
                    return i11;
                }
                this.f25211u = arrayList2;
                return i11 | 1;
            }
        }
        return 0;
    }

    public final void g(int i3) {
        AbstractC2621t abstractC2621t;
        AbstractC2621t abstractC2621t2;
        C.b();
        C2608f c2608fC = C.c();
        int iMin = Math.min(this.f25206p, Math.max(0, i3));
        if (this == c2608fC.f25304s && (abstractC2621t2 = c2608fC.f25305t) != null) {
            abstractC2621t2.f(iMin);
            return;
        }
        HashMap map = c2608fC.f25308w;
        if (map.isEmpty() || (abstractC2621t = (AbstractC2621t) map.get(this.f25195c)) == null) {
            return;
        }
        abstractC2621t.f(iMin);
    }

    public final void h(int i3) {
        AbstractC2621t abstractC2621t;
        AbstractC2621t abstractC2621t2;
        C.b();
        if (i3 != 0) {
            C2608f c2608fC = C.c();
            if (this == c2608fC.f25304s && (abstractC2621t2 = c2608fC.f25305t) != null) {
                abstractC2621t2.i(i3);
                return;
            }
            HashMap map = c2608fC.f25308w;
            if (map.isEmpty() || (abstractC2621t = (AbstractC2621t) map.get(this.f25195c)) == null) {
                return;
            }
            abstractC2621t.i(i3);
        }
    }

    public final boolean i(String str) {
        C.b();
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void j(ArrayList arrayList) {
        A a2;
        this.f25211u.clear();
        if (this.f25212v == null) {
            this.f25212v = new C2661e(0);
        }
        this.f25212v.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            String strD = rVar.f25356a.d();
            Iterator it2 = this.f25193a.f25387b.iterator();
            do {
                if (!it2.hasNext()) {
                    a2 = null;
                    break;
                }
                a2 = (A) it2.next();
            } while (!a2.f25194b.equals(strD));
            if (a2 != null) {
                this.f25212v.put(a2.f25195c, rVar);
                int i3 = rVar.f25357b;
                if (i3 == 2 || i3 == 3) {
                    this.f25211u.add(a2);
                }
            }
        }
        C.c().f25298m.b(MediaPlayer.Event.Buffering, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f25195c);
        sb.append(", name=");
        sb.append(this.f25196d);
        sb.append(", description=");
        sb.append(this.f25197e);
        sb.append(", iconUri=");
        sb.append(this.f25198f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", connectionState=");
        sb.append(this.f25199h);
        sb.append(", canDisconnect=");
        sb.append(this.f25200i);
        sb.append(", playbackType=");
        sb.append(this.f25201k);
        sb.append(", playbackStream=");
        sb.append(this.f25202l);
        sb.append(", deviceType=");
        sb.append(this.f25203m);
        sb.append(", volumeHandling=");
        sb.append(this.f25204n);
        sb.append(", volume=");
        sb.append(this.f25205o);
        sb.append(", volumeMax=");
        sb.append(this.f25206p);
        sb.append(", presentationDisplayId=");
        sb.append(this.f25207q);
        sb.append(", extras=");
        sb.append(this.f25208r);
        sb.append(", settingsIntent=");
        sb.append(this.f25209s);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.f25193a.f25389d.f15522i).getPackageName());
        if (Collections.unmodifiableList(this.f25211u).size() >= 1) {
            sb.append(", members=[");
            int size = this.f25211u.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                if (this.f25211u.get(i3) != this) {
                    sb.append(((A) this.f25211u.get(i3)).f25195c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
