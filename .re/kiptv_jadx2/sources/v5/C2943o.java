package v5;

import V4.C0967j;
import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.EPGReminder;
import com.kiptv.core.model.Playlist;
import kotlin.Metadata;
import p005a5.C1451x5;
import p005a5.M1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lv5/o;", "Landroidx/lifecycle/e0;", "v5/j", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class C2943o extends androidx.lifecycle.e0 {

    public final p015b5.o f29554b;

    public final C1451x5 f29555c;

    public final p015b5.k f29556d;

    public final C0967j f29557e;

    public final M1 f29558f;
    public final String g;

    public final V7.n0 f29559h;

    public final V7.W f29560i;
    public String j;

    public S7.w0 f29561k;

    public C2943o(p015b5.o tmdbEnrichment, C1451x5 tmdbRepository, p015b5.k reminderScheduler, C0967j reminderStore, M1 playlistRepository, p132p5.a appConfig) {
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
        V7.n0 n0VarB = V7.r.b(new C2933j(false, null, null, false));
        this.f29559h = n0VarB;
        this.f29560i = new V7.W(n0VarB);
    }

    public final Object e(EPGProgram ePGProgram, int i3, String str, int i9, p117n6.c cVar) {
        C2941n c2941n;
        C2943o c2943o;
        Object value;
        if (cVar instanceof C2941n) {
            c2941n = (C2941n) cVar;
            int i10 = c2941n.f29551k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2941n.f29551k = i10 - Integer.MIN_VALUE;
            } else {
                c2941n = new C2941n(this, cVar);
            }
        } else {
            c2941n = new C2941n(this, cVar);
        }
        C2941n c2941n2 = c2941n;
        Object objG = c2941n2.f29550i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = c2941n2.f29551k;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objG);
            Playlist playlist = (Playlist) ((V7.n0) this.f29558f.f13659k.f10419h).getValue();
            String str2 = playlist != null ? playlist.f20033a : null;
            String str3 = playlist != null ? playlist.f20035c : null;
            c2941n2.f29549h = this;
            c2941n2.f29551k = 1;
            objG = this.f29556d.g(ePGProgram, i3, str, i9, str2, str3, c2941n2);
            if (objG == aVar) {
                return aVar;
            }
            c2943o = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2943o = c2941n2.f29549h;
            com.google.common.util.concurrent.P.u0(objG);
        }
        if (((EPGReminder) objG) == null) {
            return Boolean.FALSE;
        }
        V7.n0 n0Var = c2943o.f29559h;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, C2933j.a((C2933j) value, false, null, null, true, 7)));
        return Boolean.TRUE;
    }
}
