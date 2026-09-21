package p186w5;

import E2.d;
import V4.I;
import V7.d0;
import V7.r;
import android.net.Uri;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.e0;
import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.A;
import com.kiptv.core.model.HomeSectionConfig;
import com.kiptv.core.model.HomeSectionKind$Companion;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p005a5.C1291h4;
import p005a5.C1357o0;
import p078i6.w;
import p132p5.a;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw5/W;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class W extends e0 {

    public final C1357o0 f30165b;

    public final C1291h4 f30166c;

    public final d f30167d;

    public Object f30168e;

    public final String f30169f;
    public final String g;

    public final String f30170h;

    public final V7.W f30171i;

    public W(U savedStateHandle, C1357o0 homeFeedRepository, C1291h4 settingsRepository, a appConfig, d dVar) {
        m.e(savedStateHandle, "savedStateHandle");
        m.e(homeFeedRepository, "homeFeedRepository");
        m.e(settingsRepository, "settingsRepository");
        m.e(appConfig, "appConfig");
        this.f30165b = homeFeedRepository;
        this.f30166c = settingsRepository;
        this.f30167d = dVar;
        this.f30169f = "https://image.tmdb.org/t/p";
        String str = (String) savedStateHandle.a("sectionId");
        String strDecode = Uri.decode(str == null ? "" : str);
        m.d(strDecode, "decode(...)");
        this.g = strDecode;
        String str2 = (String) savedStateHandle.a(LinkHeader.Parameters.Title);
        String strDecode2 = Uri.decode(str2 != null ? str2 : "");
        m.d(strDecode2, "decode(...)");
        this.f30170h = strDecode2;
        this.f30171i = r.u(new I(homeFeedRepository.f14855h, homeFeedRepository.f14858l, new U(this, null)), X.h(this), d0.a(2), w.f23205h);
    }

    public final HomeSectionConfig e() {
        HomeSectionKind$Companion homeSectionKind$Companion = A.Companion;
        String str = this.g;
        Object obj = null;
        if (m.a(str, "recommended")) {
            return null;
        }
        for (Object obj2 : this.f30166c.c()) {
            if (m.a(((HomeSectionConfig) obj2).f19793a, str)) {
                obj = obj2;
                break;
            }
        }
        return (HomeSectionConfig) obj;
    }
}
