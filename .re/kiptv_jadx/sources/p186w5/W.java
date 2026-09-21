package p186w5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw5/W;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class W extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1357o0 f30165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1291h4 f30166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E2.d f30167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f30168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f30169f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f30170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.W f30171i;

    public W(androidx.lifecycle.U savedStateHandle, p005a5.C1357o0 homeFeedRepository, p005a5.C1291h4 settingsRepository, p132p5.a appConfig, E2.d dVar) {
        kotlin.jvm.internal.m.e(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.m.e(homeFeedRepository, "homeFeedRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f30165b = homeFeedRepository;
        this.f30166c = settingsRepository;
        this.f30167d = dVar;
        this.f30169f = "https://image.tmdb.org/t/p";
        java.lang.String str = (java.lang.String) savedStateHandle.a("sectionId");
        java.lang.String strDecode = android.net.Uri.decode(str == null ? "" : str);
        kotlin.jvm.internal.m.d(strDecode, "decode(...)");
        this.g = strDecode;
        java.lang.String str2 = (java.lang.String) savedStateHandle.a(io.ktor.http.LinkHeader.Parameters.Title);
        java.lang.String strDecode2 = android.net.Uri.decode(str2 != null ? str2 : "");
        kotlin.jvm.internal.m.d(strDecode2, "decode(...)");
        this.f30170h = strDecode2;
        this.f30171i = V7.r.u(new V4.I(homeFeedRepository.f14855h, homeFeedRepository.f14858l, new p186w5.U(this, null)), androidx.lifecycle.X.h(this), V7.d0.a(2), p078i6.w.f23205h);
    }

    public final com.kiptv.core.model.HomeSectionConfig e() {
        com.kiptv.core.model.HomeSectionKind$Companion homeSectionKind$Companion = com.kiptv.core.model.A.Companion;
        java.lang.String str = this.g;
        java.lang.Object obj = null;
        if (kotlin.jvm.internal.m.a(str, "recommended")) {
            return null;
        }
        for (java.lang.Object obj2 : this.f30166c.c()) {
            if (kotlin.jvm.internal.m.a(((com.kiptv.core.model.HomeSectionConfig) obj2).f19793a, str)) {
                obj = obj2;
                break;
            }
        }
        return (com.kiptv.core.model.HomeSectionConfig) obj;
    }
}
