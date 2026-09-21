package v5;

/* JADX INFO: renamed from: v5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lv5/o;", "Landroidx/lifecycle/e0;", "v5/j", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class C2943o extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p015b5.o f29554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1451x5 f29555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p015b5.k f29556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V4.C0967j f29557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.M1 f29558f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.n0 f29559h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.W f29560i;
    public java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S7.w0 f29561k;

    public C2943o(p015b5.o tmdbEnrichment, p005a5.C1451x5 tmdbRepository, p015b5.k reminderScheduler, V4.C0967j reminderStore, p005a5.M1 playlistRepository, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(tmdbEnrichment, "tmdbEnrichment");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(reminderScheduler, "reminderScheduler");
        kotlin.jvm.internal.m.e(reminderStore, "reminderStore");
        kotlin.jvm.internal.m.e(playlistRepository, "playlistRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f29554b = tmdbEnrichment;
        this.f29555c = tmdbRepository;
        this.f29556d = reminderScheduler;
        this.f29557e = reminderStore;
        this.f29558f = playlistRepository;
        this.g = "https://image.tmdb.org/t/p";
        V7.n0 n0VarB = V7.r.b(new v5.C2933j(false, null, null, false));
        this.f29559h = n0VarB;
        this.f29560i = new V7.W(n0VarB);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object e(com.kiptv.core.model.EPGProgram ePGProgram, int i3, java.lang.String str, int i9, p117n6.c cVar) {
        v5.C2941n c2941n;
        v5.C2943o c2943o;
        java.lang.Object value;
        if (cVar instanceof v5.C2941n) {
            c2941n = (v5.C2941n) cVar;
            int i10 = c2941n.f29551k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2941n.f29551k = i10 - Integer.MIN_VALUE;
            } else {
                c2941n = new v5.C2941n(this, cVar);
            }
        } else {
            c2941n = new v5.C2941n(this, cVar);
        }
        v5.C2941n c2941n2 = c2941n;
        java.lang.Object objG = c2941n2.f29550i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c2941n2.f29551k;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            com.kiptv.core.model.Playlist playlist = (com.kiptv.core.model.Playlist) ((V7.n0) this.f29558f.f13659k.f10419h).getValue();
            java.lang.String str2 = playlist != null ? playlist.f20033a : null;
            java.lang.String str3 = playlist != null ? playlist.f20035c : null;
            c2941n2.f29549h = this;
            c2941n2.f29551k = 1;
            objG = this.f29556d.g(ePGProgram, i3, str, i9, str2, str3, c2941n2);
            if (objG == aVar) {
                return aVar;
            }
            c2943o = this;
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2943o = c2941n2.f29549h;
            com.google.common.util.concurrent.P.u0(objG);
        }
        if (((com.kiptv.core.model.EPGReminder) objG) == null) {
            return java.lang.Boolean.FALSE;
        }
        V7.n0 n0Var = c2943o.f29559h;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, v5.C2933j.a((v5.C2933j) value, false, null, null, true, 7)));
        return java.lang.Boolean.TRUE;
    }
}
