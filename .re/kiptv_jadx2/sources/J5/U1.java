package J5;

import V7.C0999z;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import p005a5.C1291h4;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ5/U1;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class U1 extends androidx.lifecycle.e0 {

    public final C1291h4 f6282b;

    public final V7.n0 f6283c;

    public final V7.W f6284d;

    public U1(C1291h4 settingsRepository, p005a5.M1 playlistRepository) {
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        this.f6282b = settingsRepository;
        V7.n0 n0VarB = V7.r.b(new J1(true, true, "movies", "off", TtmlNode.TEXT_EMPHASIS_AUTO, "medium", "#FFFFFF", "semi-transparent", "bottom", "system", "default", false, "none", TtmlNode.TEXT_EMPHASIS_AUTO, TtmlNode.TEXT_EMPHASIS_AUTO, true, true, TtmlNode.TEXT_EMPHASIS_AUTO, TtmlNode.TEXT_EMPHASIS_AUTO, TtmlNode.TEXT_EMPHASIS_AUTO, TtmlNode.TEXT_EMPHASIS_AUTO, "off", "off", false, "", false, true, false));
        this.f6283c = n0VarB;
        this.f6284d = new V7.W(n0VarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new L1(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new M1(this, null), 3);
        V7.r.s(new C0999z(settingsRepository.f14556i, new N1(this, null), 1), androidx.lifecycle.X.h(this));
        V7.r.s(new C0999z(playlistRepository.f13659k, new O1(this, null), 1), androidx.lifecycle.X.h(this));
    }

    public final void e(p194x6.j jVar) {
        S7.C.A(androidx.lifecycle.X.h(this), null, new S1(this, jVar, null), 3);
    }

    public final void f(p194x6.j jVar) {
        S7.C.A(androidx.lifecycle.X.h(this), null, new T1(this, jVar, null), 3);
    }
}
