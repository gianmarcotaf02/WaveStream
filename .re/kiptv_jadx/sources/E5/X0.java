package E5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LE5/X0;", "Landroidx/lifecycle/e0;", "Companion", "E5/M0", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class X0 extends androidx.lifecycle.e0 {
    public static final E5.M0 Companion = new E5.M0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile boolean f2959l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.M1 f2960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1296i f2961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.C1379q2 f2962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1291h4 f2963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.H f2964f;
    public final V7.W g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.n0 f2965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.W f2966i;
    public final U7.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.C0978d f2967k;

    public X0(p005a5.M1 repository, p005a5.C1296i authRepository, p005a5.C1379q2 purchaseRepository, p005a5.C1291h4 settingsRepository, p005a5.H deviceRegistry) {
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
        io.github.jan.supabase.auth.user.UserInfo userInfoE = authRepository.e();
        java.lang.String email = userInfoE != null ? userInfoE.getEmail() : null;
        V7.W w6 = repository.f13658i;
        V7.n0 n0VarB = V7.r.b(new E5.K0((java.util.List) ((V7.n0) w6.f10419h).getValue(), email, ((java.util.List) ((V7.n0) w6.f10419h).getValue()).isEmpty(), null, false, null, false));
        this.f2965h = n0VarB;
        this.f2966i = new V7.W(n0VarB);
        U7.j jVarB = N3.a.b(-2, 6, null);
        this.j = jVarB;
        this.f2967k = V7.r.t(jVarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new E5.L0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new E5.R0(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:1: B:26:0x007b->B:43:?, LOOP_END, SYNTHETIC] */
    public static final void e(E5.X0 x9) {
        java.lang.String lowerCase;
        java.lang.Object next;
        java.lang.String lowerCase2;
        x9.getClass();
        if (f2959l) {
            return;
        }
        f2959l = true;
        com.kiptv.core.model.LocalDeviceSettings localDeviceSettings = (com.kiptv.core.model.LocalDeviceSettings) ((V7.n0) x9.f2963e.f14557k.f10419h).getValue();
        java.util.List playlists = ((E5.K0) x9.f2965h.getValue()).f2898a;
        kotlin.jvm.internal.m.e(localDeviceSettings, "<this>");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        com.kiptv.core.model.Playlist playlist = null;
        java.lang.Object obj = null;
        playlist = null;
        if (localDeviceSettings.f19828f && !playlists.isEmpty()) {
            java.lang.String str = localDeviceSettings.g;
            if (str != null) {
                lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                java.util.Iterator it = playlists.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        lowerCase2 = ((com.kiptv.core.model.Playlist) next).f20033a.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                    }
                } while (!lowerCase2.equals(lowerCase));
                com.kiptv.core.model.Playlist playlist2 = (com.kiptv.core.model.Playlist) next;
                if (playlist2 != null) {
                    playlist = playlist2;
                } else {
                    for (java.lang.Object obj2 : playlists) {
                        if (((com.kiptv.core.model.Playlist) obj2).f20040i) {
                            obj = obj2;
                            break;
                        }
                    }
                    playlist = (com.kiptv.core.model.Playlist) obj;
                    if (playlist == null) {
                        playlist = (com.kiptv.core.model.Playlist) p078i6.o.h1(playlists);
                    }
                }
            } else {
                while (r0.hasNext()) {
                    if (((com.kiptv.core.model.Playlist) obj2).f20040i) {
                        obj = obj2;
                        break;
                    }
                }
                playlist = (com.kiptv.core.model.Playlist) obj;
                if (playlist == null) {
                    playlist = (com.kiptv.core.model.Playlist) p078i6.o.h1(playlists);
                }
            }
        }
        if (playlist == null) {
            return;
        }
        i(x9, playlist, 6);
    }

    public static boolean h(E5.X0 x9, com.kiptv.core.model.Playlist playlist) {
        kotlin.jvm.internal.m.e(playlist, "playlist");
        p005a5.M1 m8 = x9.f2960b;
        return m8.f(playlist, m8.f13655e.f());
    }

    public static void i(E5.X0 x9, com.kiptv.core.model.Playlist playlist, int i3) {
        boolean z6 = (i3 & 2) == 0;
        boolean z9 = (i3 & 4) == 0;
        x9.getClass();
        kotlin.jvm.internal.m.e(playlist, "playlist");
        p005a5.M1 m8 = x9.f2960b;
        if (m8.f(playlist, m8.f13655e.f())) {
            S7.C.A(androidx.lifecycle.X.h(x9), null, new E5.T0(x9, null), 3);
        } else {
            S7.C.A(androidx.lifecycle.X.h(x9), null, new E5.U0(x9, playlist, z6, z9, null), 3);
        }
    }

    public final boolean f() {
        V7.n0 n0Var;
        java.lang.Object value;
        p005a5.M1 m8 = this.f2960b;
        if (((java.util.List) m8.f13657h.getValue()).size() < m8.f13655e.f()) {
            return true;
        }
        if (((V7.n0) this.f2962d.f14983h.f10419h).getValue() != com.kiptv.core.model.l0.f20796k) {
            S7.C.A(androidx.lifecycle.X.h(this), null, new E5.P0(this, null), 3);
            return false;
        }
        do {
            n0Var = this.f2965h;
            value = n0Var.getValue();
        } while (!n0Var.g(value, E5.K0.a((E5.K0) value, null, false, null, false, null, true, 63)));
        return false;
    }

    public final void g() {
        V7.n0 n0Var;
        java.lang.Object value;
        do {
            n0Var = this.f2965h;
            value = n0Var.getValue();
        } while (!n0Var.g(value, E5.K0.a((E5.K0) value, null, false, null, false, null, false, 63)));
    }
}
