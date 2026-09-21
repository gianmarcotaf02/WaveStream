package J5;

import V7.C0999z;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kiptv.core.model.C1944g0;
import com.kiptv.core.model.ContentTypeSettings;
import com.kiptv.core.model.LocalDeviceSettings;
import com.kiptv.core.model.MyListItem;
import com.kiptv.core.model.Playlist;
import com.kiptv.core.model.PlaylistSettings;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p005a5.C1291h4;
import p005a5.i9;
import p005a5.l9;
import p005a5.n9;
import t5.C2850z0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ5/u0;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class C0636u0 extends androidx.lifecycle.e0 {

    public final C1291h4 f6572b;

    public final i9 f6573c;

    public final p005a5.D0 f6574d;

    public final p005a5.B2 f6575e;

    public final n9 f6576f;
    public final p005a5.M1 g;

    public final V7.n0 f6577h;

    public final V7.W f6578i;

    public C0636u0(C1291h4 settingsRepository, i9 watchProgressRepository, p005a5.D0 myListRepository, p005a5.B2 recentlyWatchedLive, n9 xmlTvRepository, p005a5.M1 playlistRepository) {
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        kotlin.jvm.internal.m.e(myListRepository, "myListRepository");
        kotlin.jvm.internal.m.e(recentlyWatchedLive, "recentlyWatchedLive");
        kotlin.jvm.internal.m.e(xmlTvRepository, "xmlTvRepository");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        this.f6572b = settingsRepository;
        this.f6573c = watchProgressRepository;
        this.f6574d = myListRepository;
        this.f6575e = recentlyWatchedLive;
        this.f6576f = xmlTvRepository;
        this.g = playlistRepository;
        V7.n0 n0VarB = V7.r.b(new C0578e0(true, true, true, true, true, false, true, true, "channelList", TtmlNode.TEXT_EMPHASIS_AUTO, p078i6.w.f23205h, 480, 1, "", false, "", false, null));
        this.f6577h = n0VarB;
        this.f6578i = new V7.W(n0VarB);
        V7.r.s(new C0999z(settingsRepository.f14556i, new C0582f0(this, null), 1), androidx.lifecycle.X.h(this));
        V7.r.s(new C0999z(settingsRepository.g, new C0586g0(this, null), 1), androidx.lifecycle.X.h(this));
        V7.r.s(new C0999z(settingsRepository.f14557k, new C0590h0(this, null), 1), androidx.lifecycle.X.h(this));
        S7.C.A(androidx.lifecycle.X.h(this), null, new C0594i0(this, null), 3);
    }

    public static final Object e(C0636u0 c0636u0, p117n6.c cVar) {
        C0606l0 c0606l0;
        p086j6.b bVarU;
        ArrayList arrayListA;
        p086j6.b bVar;
        p086j6.b bVar2;
        Object objT;
        p086j6.b bVarM;
        V7.n0 n0Var;
        Object value;
        Object obj;
        ArrayList<p070h6.k> arrayList;
        String str;
        Iterator it;
        C0636u0 c0636u1 = c0636u0;
        c0636u1.getClass();
        if (cVar instanceof C0606l0) {
            c0606l0 = (C0606l0) cVar;
            int i3 = c0606l0.f6485n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0606l0.f6485n = i3 - Integer.MIN_VALUE;
            } else {
                c0606l0 = new C0606l0(c0636u1, cVar);
            }
        } else {
            c0606l0 = new C0606l0(c0636u1, cVar);
        }
        Object objH = c0606l0.f6483l;
        Object obj2 = p109m6.a.f25430h;
        int i9 = c0606l0.f6485n;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objH);
            bVarU = com.google.common.util.concurrent.P.U();
            bVarU.add(new C2850z0(TtmlNode.TEXT_EMPHASIS_AUTO, p015b5.u.a("sorting.default")));
            C1291h4 c1291h4 = c0636u1.f6572b;
            if (c1291h4.d() && !((Collection) ((V7.n0) c0636u1.f6575e.f13170h.f10419h).getValue()).isEmpty()) {
                bVarU.add(new C2850z0("recentlyWatched", p015b5.u.a("livetv.recentlyWatched")));
            }
            if (c1291h4.e()) {
                bVarU.add(new C2850z0("recentlyAdded", p015b5.u.a("livetv.recentlyAdded")));
            }
            com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.f20886k;
            p005a5.D0 d4 = c0636u1.f6574d;
            arrayListA = d4.a(z0Var);
            if (arrayListA.isEmpty()) {
                bVar2 = bVarU;
            } else {
                try {
                    c0606l0.f6480h = c0636u1;
                    c0606l0.f6481i = bVarU;
                    c0606l0.j = bVarU;
                    c0606l0.f6482k = arrayListA;
                    c0606l0.f6485n = 1;
                    objH = d4.h(z0Var, c0606l0);
                    if (objH == obj2) {
                        return obj2;
                    }
                    bVar = bVarU;
                    objT = (List) objH;
                    obj = p078i6.w.f23205h;
                    if (objT instanceof p070h6.m) {
                        objT = obj;
                    }
                    arrayList = new ArrayList();
                    for (Object obj3 : (Iterable) objT) {
                        str = (String) ((p070h6.k) obj3).f22539h;
                        if (arrayListA != null) {
                        }
                        it = arrayListA.iterator();
                        while (it.hasNext()) {
                            if (((MyListItem) it.next()).f19878h.contains(str)) {
                                arrayList.add(obj3);
                                break;
                                break;
                            }
                        }
                    }
                    for (p070h6.k kVar : arrayList) {
                        bVar.add(new C2850z0(p121o0.p.C("tag:", (String) kVar.f22539h), p015b5.u.a((String) kVar.f22540i)));
                    }
                    bVar2 = bVarU;
                    bVarU = bVar;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVarU;
                    objT = com.google.common.util.concurrent.P.T(th);
                    obj = p078i6.w.f23205h;
                    if (objT instanceof p070h6.m) {
                        objT = obj;
                    }
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        str = (String) ((p070h6.k) obj3).f22539h;
                        if (arrayListA != null) {
                        }
                        it = arrayListA.iterator();
                        while (it.hasNext()) {
                            if (((MyListItem) it.next()).f19878h.contains(str)) {
                                arrayList.add(obj3);
                                break;
                                break;
                            }
                        }
                    }
                    while (r0.hasNext()) {
                        bVar.add(new C2850z0(p121o0.p.C("tag:", (String) kVar.f22539h), p015b5.u.a((String) kVar.f22540i)));
                    }
                    bVar2 = bVarU;
                    bVarU = bVar;
                    bVarU.add(new C2850z0("firstCategory", p015b5.u.a("livetv.categoriesSection")));
                    bVarM = com.google.common.util.concurrent.P.M(bVar2);
                    n0Var = c0636u1.f6577h;
                    do {
                        value = n0Var.getValue();
                    } while (!n0Var.g(value, C0578e0.a((C0578e0) value, false, false, false, false, false, false, false, false, null, null, bVarM, 0, 0, null, false, null, false, null, 261119)));
                    return p070h6.A.f22523a;
                }
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArrayList arrayList2 = c0606l0.f6482k;
            bVar = c0606l0.j;
            bVarU = c0606l0.f6481i;
            C0636u0 c0636u2 = c0606l0.f6480h;
            try {
                com.google.common.util.concurrent.P.u0(objH);
                arrayListA = arrayList2;
                c0636u1 = c0636u2;
                try {
                    objT = (List) objH;
                } catch (Throwable th2) {
                    th = th2;
                    objT = com.google.common.util.concurrent.P.T(th);
                }
            } catch (Throwable th3) {
                th = th3;
                arrayListA = arrayList2;
                c0636u1 = c0636u2;
                objT = com.google.common.util.concurrent.P.T(th);
                obj = p078i6.w.f23205h;
                if (objT instanceof p070h6.m) {
                    objT = obj;
                }
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    str = (String) ((p070h6.k) obj3).f22539h;
                    if (arrayListA != null) {
                    }
                    it = arrayListA.iterator();
                    while (it.hasNext()) {
                        if (((MyListItem) it.next()).f19878h.contains(str)) {
                            arrayList.add(obj3);
                            break;
                        }
                    }
                }
                while (r0.hasNext()) {
                    bVar.add(new C2850z0(p121o0.p.C("tag:", (String) kVar.f22539h), p015b5.u.a((String) kVar.f22540i)));
                }
                bVar2 = bVarU;
                bVarU = bVar;
                bVarU.add(new C2850z0("firstCategory", p015b5.u.a("livetv.categoriesSection")));
                bVarM = com.google.common.util.concurrent.P.M(bVar2);
                n0Var = c0636u1.f6577h;
                do {
                    value = n0Var.getValue();
                } while (!n0Var.g(value, C0578e0.a((C0578e0) value, false, false, false, false, false, false, false, false, null, null, bVarM, 0, 0, null, false, null, false, null, 261119)));
                return p070h6.A.f22523a;
            }
            obj = p078i6.w.f23205h;
            if (objT instanceof p070h6.m) {
                objT = obj;
            }
            arrayList = new ArrayList();
            while (r0.hasNext()) {
                str = (String) ((p070h6.k) obj3).f22539h;
                if (arrayListA != null || !arrayListA.isEmpty()) {
                    it = arrayListA.iterator();
                    while (it.hasNext()) {
                        if (((MyListItem) it.next()).f19878h.contains(str)) {
                            arrayList.add(obj3);
                            break;
                            break;
                        }
                    }
                }
            }
            while (r0.hasNext()) {
                bVar.add(new C2850z0(p121o0.p.C("tag:", (String) kVar.f22539h), p015b5.u.a((String) kVar.f22540i)));
            }
            bVar2 = bVarU;
            bVarU = bVar;
        }
        bVarU.add(new C2850z0("firstCategory", p015b5.u.a("livetv.categoriesSection")));
        bVarM = com.google.common.util.concurrent.P.M(bVar2);
        n0Var = c0636u1.f6577h;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, C0578e0.a((C0578e0) value, false, false, false, false, false, false, false, false, null, null, bVarM, 0, 0, null, false, null, false, null, 261119)));
        return p070h6.A.f22523a;
    }

    public static final void f(C0636u0 c0636u0) {
        String str;
        n9 n9Var;
        String strA;
        String str2;
        String strA2;
        String str3;
        String str4;
        C1944g0 c1944g0;
        ContentTypeSettings contentTypeSettings;
        C1944g0 c1944g1;
        C0636u0 c0636u1 = c0636u0;
        C1291h4 c1291h4 = c0636u1.f6572b;
        PlaylistSettings playlistSettingsA = c1291h4.a();
        V7.n0 n0Var = c0636u1.f6577h;
        while (true) {
            Object value = n0Var.getValue();
            C0578e0 c0578e0 = (C0578e0) value;
            boolean zB = c1291h4.b();
            boolean zF = c1291h4.f();
            boolean zE = c1291h4.e();
            boolean zD = c1291h4.d();
            PlaylistSettings playlistSettingsA2 = c1291h4.a();
            boolean z6 = (playlistSettingsA2 == null || (c1944g1 = playlistSettingsA2.f20062i) == null) ? true : c1944g1.f20762k;
            V7.W w6 = c1291h4.f14557k;
            boolean z9 = ((LocalDeviceSettings) ((V7.n0) w6.f10419h).getValue()).f19840t;
            boolean z10 = playlistSettingsA != null ? playlistSettingsA.f20059e : true;
            boolean z11 = playlistSettingsA != null ? playlistSettingsA.j : true;
            String str5 = ((LocalDeviceSettings) ((V7.n0) w6.f10419h).getValue()).f19837q;
            if (playlistSettingsA == null || (c1944g0 = playlistSettingsA.f20062i) == null || (contentTypeSettings = c1944g0.f20757d) == null || (str = contentTypeSettings.f19700n) == null) {
                str = TtmlNode.TEXT_EMPHASIS_AUTO;
            }
            C1291h4 c1291h5 = c1291h4;
            int i3 = playlistSettingsA != null ? playlistSettingsA.f20063k : 480;
            int i9 = playlistSettingsA != null ? playlistSettingsA.f20064l : 1;
            n9 n9Var2 = c0636u1.f6576f;
            if (n9Var2.f()) {
                String strA3 = p015b5.u.a("settings.statusReady");
                l9 l9Var = n9Var2.f14840c;
                int size = l9Var != null ? l9Var.f14747a.size() : 0;
                n9Var = n9Var2;
                strA = strA3 + " · " + size + " ch / " + n9Var.d() + " prog";
            } else {
                n9Var = n9Var2;
                strA = p015b5.u.a("settings.statusIdle");
            }
            boolean zF2 = n9Var.f();
            Playlist playlist = (Playlist) ((V7.n0) c0636u1.g.f13659k.f10419h).getValue();
            String string = (playlist == null || (str4 = playlist.g) == null) ? null : O7.q.r1(str4).toString();
            if (string == null || string.length() == 0) {
                str2 = strA;
                if (playlist == null || !playlist.d()) {
                    strA2 = p015b5.u.a("settings.epgSourceNone");
                } else {
                    String str6 = playlist.f20036d;
                    if (str6.length() > 0) {
                        strA2 = h(p015b5.u.a("settings.epgSourceXtreamServer"), str6);
                    } else {
                        strA2 = p015b5.u.a("settings.epgSourceNone");
                    }
                }
            } else {
                if (playlist == null) {
                    str2 = strA;
                    str3 = null;
                } else {
                    if (!playlist.d()) {
                        playlist = null;
                    }
                    if (playlist != null) {
                        p005a5.M1.Companion.getClass();
                        String baseURL = playlist.f20036d;
                        kotlin.jvm.internal.m.e(baseURL, "baseURL");
                        String username = playlist.f20037e;
                        str2 = strA;
                        kotlin.jvm.internal.m.e(username, "username");
                        String password = playlist.f20038f;
                        kotlin.jvm.internal.m.e(password, "password");
                        String strA4 = p005a5.F1.a(baseURL);
                        if (strA4.length() != 0 && username.length() != 0 && password.length() != 0) {
                            str3 = strA4 + "/xmltv.php?username=" + username + "&password=" + password;
                        }
                    } else {
                        str2 = strA;
                    }
                    str3 = null;
                }
                strA2 = h(p015b5.u.a(kotlin.jvm.internal.m.a(str3, string) ? "settings.epgSourceXtreamServer" : "settings.epgSourceCustomUrl"), string);
            }
            if (n0Var.g(value, C0578e0.a(c0578e0, zB, zF, zE, zD, z6, z9, z10, z11, str5, str, null, i3, i9, str2, zF2, strA2, false, null, 197632))) {
                return;
            }
            c0636u1 = c0636u0;
            c1291h4 = c1291h5;
            playlistSettingsA = playlistSettingsA;
        }
    }

    public static String h(String str, String str2) {
        Object objT;
        try {
            objT = new URI(str2).getHost();
        } catch (Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        if (objT instanceof p070h6.m) {
            objT = null;
        }
        String str3 = (String) objT;
        if (str3 == null) {
            str3 = "";
        }
        return str3.length() == 0 ? str : p121o0.p.p(str, " · ", str3);
    }

    public final void g(p194x6.j jVar) {
        PlaylistSettings playlistSettingsA = this.f6572b.a();
        if (playlistSettingsA == null) {
            return;
        }
        S7.C.A(androidx.lifecycle.X.h(this), null, new C0602k0(this, jVar, playlistSettingsA, null), 3);
    }
}
