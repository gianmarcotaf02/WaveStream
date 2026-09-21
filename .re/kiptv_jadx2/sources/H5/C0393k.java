package H5;

import com.kiptv.core.model.WatchProgress;
import com.kiptv.core.model.XtreamVODStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005a5.Y2;
import p005a5.Z2;

public final class C0393k {

    public final boolean f4236a;

    public final Y2 f4237b;

    public final String f4238c;

    public final Map f4239d;

    public final Set f4240e;

    public final Set f4241f;
    public final Set g;

    public C0393k(boolean z6, Y2 y9, String str, Map progressById, Set watchedIds, Set traktWatchedIds, Set kiptvWatchedIds) {
        kotlin.jvm.internal.m.e(progressById, "progressById");
        kotlin.jvm.internal.m.e(watchedIds, "watchedIds");
        kotlin.jvm.internal.m.e(traktWatchedIds, "traktWatchedIds");
        kotlin.jvm.internal.m.e(kiptvWatchedIds, "kiptvWatchedIds");
        this.f4236a = z6;
        this.f4237b = y9;
        this.f4238c = str;
        this.f4239d = progressById;
        this.f4240e = watchedIds;
        this.f4241f = traktWatchedIds;
        this.g = kiptvWatchedIds;
    }

    public static C0393k a(C0393k c0393k, boolean z6, Y2 y9, LinkedHashMap linkedHashMap, Set set, Set set2, Set set3, int i3) {
        if ((i3 & 1) != 0) {
            z6 = c0393k.f4236a;
        }
        boolean z9 = z6;
        if ((i3 & 2) != 0) {
            y9 = c0393k.f4237b;
        }
        Y2 y10 = y9;
        String str = c0393k.f4238c;
        Map map = linkedHashMap;
        if ((i3 & 8) != 0) {
            map = c0393k.f4239d;
        }
        Map progressById = map;
        if ((i3 & 16) != 0) {
            set = c0393k.f4240e;
        }
        Set watchedIds = set;
        if ((i3 & 32) != 0) {
            set2 = c0393k.f4241f;
        }
        Set traktWatchedIds = set2;
        if ((i3 & 64) != 0) {
            set3 = c0393k.g;
        }
        Set kiptvWatchedIds = set3;
        c0393k.getClass();
        kotlin.jvm.internal.m.e(progressById, "progressById");
        kotlin.jvm.internal.m.e(watchedIds, "watchedIds");
        kotlin.jvm.internal.m.e(traktWatchedIds, "traktWatchedIds");
        kotlin.jvm.internal.m.e(kiptvWatchedIds, "kiptvWatchedIds");
        return new C0393k(z9, y10, str, progressById, watchedIds, traktWatchedIds, kiptvWatchedIds);
    }

    public final boolean b(Z2 entry) {
        String string;
        WatchProgress watchProgress;
        kotlin.jvm.internal.m.e(entry, "entry");
        XtreamVODStream xtreamVODStreamA = entry.a();
        return (xtreamVODStreamA == null || (string = Integer.valueOf(xtreamVODStreamA.f20725d).toString()) == null || (((watchProgress = (WatchProgress) this.f4239d.get(string)) == null || !watchProgress.g()) && !this.f4240e.contains(string))) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0393k)) {
            return false;
        }
        C0393k c0393k = (C0393k) obj;
        return this.f4236a == c0393k.f4236a && kotlin.jvm.internal.m.a(this.f4237b, c0393k.f4237b) && kotlin.jvm.internal.m.a(this.f4238c, c0393k.f4238c) && kotlin.jvm.internal.m.a(this.f4239d, c0393k.f4239d) && kotlin.jvm.internal.m.a(this.f4240e, c0393k.f4240e) && kotlin.jvm.internal.m.a(this.f4241f, c0393k.f4241f) && kotlin.jvm.internal.m.a(this.g, c0393k.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4236a) * 31;
        Y2 y9 = this.f4237b;
        return this.g.hashCode() + p121o0.p.g(this.f4241f, p121o0.p.g(this.f4240e, B2.a.c(B2.a.a((iHashCode + (y9 == null ? 0 : y9.hashCode())) * 31, 31, this.f4238c), 31, this.f4239d), 31), 31);
    }

    public final String toString() {
        return "TvCollectionUiState(isLoading=" + this.f4236a + ", saga=" + this.f4237b + ", imageBaseUrl=" + this.f4238c + ", progressById=" + this.f4239d + ", watchedIds=" + this.f4240e + ", traktWatchedIds=" + this.f4241f + ", kiptvWatchedIds=" + this.g + ")";
    }
}
