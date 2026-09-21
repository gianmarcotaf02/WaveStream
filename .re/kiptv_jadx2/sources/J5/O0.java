package J5;

import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.Playlist;
import io.github.jan.supabase.auth.user.UserInfo;
import kotlin.Metadata;
import p005a5.C1296i;
import p005a5.C1379q2;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ5/O0;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class O0 extends androidx.lifecycle.e0 {

    public final C1379q2 f6204b;

    public final p005a5.M1 f6205c;

    public final V7.n0 f6206d;

    public O0(C1296i authRepository, C1379q2 purchaseRepository, p005a5.M1 playlistRepository, p005a5.H deviceRegistry, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(authRepository, "authRepository");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        kotlin.jvm.internal.m.e(deviceRegistry, "deviceRegistry");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f6204b = purchaseRepository;
        this.f6205c = playlistRepository;
        UserInfo userInfoE = authRepository.e();
        String email = userInfoE != null ? userInfoE.getEmail() : null;
        com.kiptv.core.model.l0 l0Var = (com.kiptv.core.model.l0) ((V7.n0) purchaseRepository.f14983h.f10419h).getValue();
        V7.W w6 = playlistRepository.f13659k;
        Playlist playlist = (Playlist) ((V7.n0) w6.f10419h).getValue();
        String str = playlist != null ? playlist.f20033a : null;
        Playlist playlist2 = (Playlist) ((V7.n0) w6.f10419h).getValue();
        this.f6206d = V7.r.b(new K0(email, l0Var, str, playlist2 != null ? playlist2.f20035c : null));
        S7.C.A(androidx.lifecycle.X.h(this), null, new M0(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new N0(this, null), 3);
    }
}
