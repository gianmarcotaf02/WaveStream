package J5;

import V7.C0999z;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kiptv.core.model.C1944g0;
import com.kiptv.core.model.LocalDeviceSettings;
import com.kiptv.core.model.PlaylistSettings;
import com.kiptv.core.model.UserSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import p005a5.C1291h4;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ5/J0;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class J0 extends androidx.lifecycle.e0 {

    public final C1291h4 f6125b;

    public final p015b5.t f6126c;

    public final p005a5.M1 f6127d;

    public final V7.n0 f6128e;

    public final V7.W f6129f;
    public final ArrayList g;

    public J0(C1291h4 settingsRepository, p015b5.t localizationService, p005a5.M1 playlistRepository) {
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(localizationService, "localizationService");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        this.f6125b = settingsRepository;
        this.f6126c = localizationService;
        this.f6127d = playlistRepository;
        V7.n0 n0VarB = V7.r.b(new A0(TtmlNode.TEXT_EMPHASIS_AUTO, "movies", "off", p078i6.w.f23205h, true));
        this.f6128e = n0VarB;
        this.f6129f = new V7.W(n0VarB);
        List listI0 = com.google.common.util.concurrent.P.i0(TtmlNode.TEXT_EMPHASIS_AUTO);
        p015b5.t.Companion.getClass();
        this.g = p078i6.o.A1(listI0, p015b5.t.f17991i);
        f();
        V7.r.s(new C0999z(settingsRepository.g, new B0(this, null), 1), androidx.lifecycle.X.h(this));
        V7.r.s(new C0999z(settingsRepository.f14556i, new C0(this, null), 1), androidx.lifecycle.X.h(this));
        V7.r.s(new C0999z(settingsRepository.f14557k, new D0(this, null), 1), androidx.lifecycle.X.h(this));
        V7.r.s(new C0999z(playlistRepository.f13658i, new E0(this, null), 1), androidx.lifecycle.X.h(this));
    }

    public final Object e(String str, p117n6.c cVar) {
        F0 f9;
        J0 j9;
        Object value;
        if (cVar instanceof F0) {
            f9 = (F0) cVar;
            int i3 = f9.f6089l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f9.f6089l = i3 - Integer.MIN_VALUE;
            } else {
                f9 = new F0(this, cVar);
            }
        } else {
            f9 = new F0(this, cVar);
        }
        Object obj = f9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = f9.f6089l;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            f9.f6086h = this;
            f9.f6087i = str;
            f9.f6089l = 1;
            if (this.f6126c.d(str, f9) != aVar) {
                j9 = this;
            }
            return aVar;
        }
        if (i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return a2;
        }
        str = f9.f6087i;
        j9 = f9.f6086h;
        com.google.common.util.concurrent.P.u0(obj);
        String str2 = str;
        V7.n0 n0Var = j9.f6128e;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, A0.a((A0) value, str2, null, null, 30)));
        C1291h4 c1291h4 = j9.f6125b;
        UserSettings userSettings = (UserSettings) ((V7.n0) c1291h4.g.f10419h).getValue();
        if (userSettings.f20579b.length() > 0) {
            UserSettings userSettingsA = UserSettings.a(userSettings, null, str2, null, null, 262139);
            f9.f6086h = null;
            f9.f6087i = null;
            f9.f6089l = 2;
            if (c1291h4.P(userSettingsA, f9) == aVar) {
                return aVar;
            }
        }
        return a2;
    }

    public final void f() {
        V7.n0 n0Var;
        Object value;
        String str;
        PlaylistSettings playlistSettingsA;
        String str2;
        C1944g0 c1944g0;
        String str3;
        boolean zB;
        String lowerCase;
        String str4;
        List playlists;
        C1944g0 c1944g1;
        do {
            n0Var = this.f6128e;
            value = n0Var.getValue();
            A0 a2 = (A0) value;
            C1291h4 c1291h4 = this.f6125b;
            String str5 = ((UserSettings) ((V7.n0) c1291h4.g.f10419h).getValue()).f20580c;
            if (str5.length() == 0) {
                str5 = TtmlNode.TEXT_EMPHASIS_AUTO;
            }
            str = str5;
            if (c1291h4.b()) {
                PlaylistSettings playlistSettingsA2 = c1291h4.a();
                if ((playlistSettingsA2 == null || (c1944g1 = playlistSettingsA2.f20062i) == null) ? true : c1944g1.f20764m) {
                    str2 = "home";
                } else {
                    playlistSettingsA = c1291h4.a();
                    if (playlistSettingsA != null) {
                        str2 = "movies";
                    } else {
                        str2 = "movies";
                    }
                }
            } else {
                playlistSettingsA = c1291h4.a();
                if (playlistSettingsA != null || (c1944g0 = playlistSettingsA.f20062i) == null || (str2 = c1944g0.f20759f) == null) {
                    str2 = "movies";
                }
            }
            str3 = str2;
            zB = c1291h4.b();
            LocalDeviceSettings localDeviceSettings = (LocalDeviceSettings) ((V7.n0) c1291h4.f14557k.f10419h).getValue();
            kotlin.jvm.internal.m.e(localDeviceSettings, "<this>");
            if (localDeviceSettings.f19828f) {
                String str6 = localDeviceSettings.g;
                if (str6 != null) {
                    lowerCase = str6.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = "last";
                }
            } else {
                lowerCase = "off";
            }
            str4 = lowerCase;
            playlists = (List) ((V7.n0) this.f6127d.f13658i.f10419h).getValue();
            a2.getClass();
            kotlin.jvm.internal.m.e(playlists, "playlists");
        } while (!n0Var.g(value, new A0(str, str3, str4, playlists, zB)));
    }
}
