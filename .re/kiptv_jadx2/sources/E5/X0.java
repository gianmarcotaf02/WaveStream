package E5;

import V7.C0978d;
import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.LocalDeviceSettings;
import com.kiptv.core.model.Playlist;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import p005a5.C1291h4;
import p005a5.C1296i;
import p005a5.C1379q2;
import p005a5.M1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LE5/X0;", "Landroidx/lifecycle/e0;", "Companion", "E5/M0", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class X0 extends androidx.lifecycle.e0 {
    public static final M0 Companion = new M0();

    public static volatile boolean f2959l;

    public final M1 f2960b;

    public final C1296i f2961c;

    public final C1379q2 f2962d;

    public final C1291h4 f2963e;

    public final p005a5.H f2964f;
    public final V7.W g;

    public final V7.n0 f2965h;

    public final V7.W f2966i;
    public final U7.j j;

    public final C0978d f2967k;

    public X0(M1 repository, C1296i authRepository, C1379q2 purchaseRepository, C1291h4 settingsRepository, p005a5.H deviceRegistry) {
        kotlin.jvm.internal.m.e(repository, "repository");
        kotlin.jvm.internal.m.e(authRepository, "authRepository");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(deviceRegistry, "deviceRegistry");
        this.f2960b = repository;
        this.f2961c = authRepository;
        this.f2962d = purchaseRepository;
        this.f2963e = settingsRepository;
        this.f2964f = deviceRegistry;
        this.g = purchaseRepository.f14983h;
        UserInfo userInfoE = authRepository.e();
        String email = userInfoE != null ? userInfoE.getEmail() : null;
        V7.W w6 = repository.f13658i;
        V7.n0 n0VarB = V7.r.b(new K0((List) ((V7.n0) w6.f10419h).getValue(), email, ((List) ((V7.n0) w6.f10419h).getValue()).isEmpty(), null, false, null, false));
        this.f2965h = n0VarB;
        this.f2966i = new V7.W(n0VarB);
        U7.j jVarB = N3.a.b(-2, 6, null);
        this.j = jVarB;
        this.f2967k = V7.r.t(jVarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new L0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new R0(this, null), 3);
    }

    public static final void e(X0 x9) {
        String lowerCase;
        Object next;
        String lowerCase2;
        x9.getClass();
        if (f2959l) {
            return;
        }
        f2959l = true;
        LocalDeviceSettings localDeviceSettings = (LocalDeviceSettings) ((V7.n0) x9.f2963e.f14557k.f10419h).getValue();
        List playlists = ((K0) x9.f2965h.getValue()).f2898a;
        kotlin.jvm.internal.m.e(localDeviceSettings, "<this>");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        Playlist playlist = null;
        Object obj = null;
        playlist = null;
        if (localDeviceSettings.f19828f && !playlists.isEmpty()) {
            String str = localDeviceSettings.g;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                Iterator it = playlists.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        lowerCase2 = ((Playlist) next).f20033a.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                    }
                } while (!lowerCase2.equals(lowerCase));
                Playlist playlist2 = (Playlist) next;
                if (playlist2 != null) {
                    playlist = playlist2;
                } else {
                    for (Object obj2 : playlists) {
                        if (((Playlist) obj2).f20040i) {
                            obj = obj2;
                            break;
                        }
                    }
                    playlist = (Playlist) obj;
                    if (playlist == null) {
                        playlist = (Playlist) p078i6.o.h1(playlists);
                    }
                }
            } else {
                while (r0.hasNext()) {
                    if (((Playlist) obj2).f20040i) {
                        obj = obj2;
                        break;
                    }
                }
                playlist = (Playlist) obj;
                if (playlist == null) {
                    playlist = (Playlist) p078i6.o.h1(playlists);
                }
            }
        }
        if (playlist == null) {
            return;
        }
        i(x9, playlist, 6);
    }

    public static boolean h(X0 x9, Playlist playlist) {
        kotlin.jvm.internal.m.e(playlist, "playlist");
        M1 m8 = x9.f2960b;
        return m8.f(playlist, m8.f13655e.f());
    }

    public static void i(X0 x9, Playlist playlist, int i3) {
        boolean z6 = (i3 & 2) == 0;
        boolean z9 = (i3 & 4) == 0;
        x9.getClass();
        kotlin.jvm.internal.m.e(playlist, "playlist");
        M1 m8 = x9.f2960b;
        if (m8.f(playlist, m8.f13655e.f())) {
            S7.C.A(androidx.lifecycle.X.h(x9), null, new T0(x9, null), 3);
        } else {
            S7.C.A(androidx.lifecycle.X.h(x9), null, new U0(x9, playlist, z6, z9, null), 3);
        }
    }

    public final boolean f() {
        V7.n0 n0Var;
        Object value;
        M1 m8 = this.f2960b;
        if (((List) m8.f13657h.getValue()).size() < m8.f13655e.f()) {
            return true;
        }
        if (((V7.n0) this.f2962d.f14983h.f10419h).getValue() != com.kiptv.core.model.l0.f20796k) {
            S7.C.A(androidx.lifecycle.X.h(this), null, new P0(this, null), 3);
            return false;
        }
        do {
            n0Var = this.f2965h;
            value = n0Var.getValue();
        } while (!n0Var.g(value, K0.a((K0) value, null, false, null, false, null, true, 63)));
        return false;
    }

    public final void g() {
        V7.n0 n0Var;
        Object value;
        do {
            n0Var = this.f2965h;
            value = n0Var.getValue();
        } while (!n0Var.g(value, K0.a((K0) value, null, false, null, false, null, false, 63)));
    }
}
