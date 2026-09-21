package p208z5;

import B2.a;
import S4.C0871j;
import S4.K;
import Y6.f;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kiptv.core.model.TMDBMovieDetail;
import com.kiptv.core.model.WatchProgress;
import com.kiptv.core.model.XtreamVODStream;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.o;
import p121o0.p;

public final class C3224q {

    public final boolean f32787a;

    public final int f32788b;

    public final XtreamVODStream f32789c;

    public final TMDBMovieDetail f32790d;

    public final List f32791e;

    public final List f32792f;
    public final List g;

    public final List f32793h;

    public final List f32794i;
    public final WatchProgress j;

    public final boolean f32795k;

    public final String f32796l;

    public final EnumC3182a f32797m;

    public final List f32798n;

    public final C0871j f32799o;

    public C3224q(boolean z6, int i3, XtreamVODStream xtreamVODStream, TMDBMovieDetail tMDBMovieDetail, List cast, List trailers, List recommendations, List externalRatings, List collectionMovies, WatchProgress watchProgress, boolean z9, String str, EnumC3182a availability, List otherVersions, C0871j c0871j) {
        m.e(cast, "cast");
        m.e(trailers, "trailers");
        m.e(recommendations, "recommendations");
        m.e(externalRatings, "externalRatings");
        m.e(collectionMovies, "collectionMovies");
        m.e(availability, "availability");
        m.e(otherVersions, "otherVersions");
        this.f32787a = z6;
        this.f32788b = i3;
        this.f32789c = xtreamVODStream;
        this.f32790d = tMDBMovieDetail;
        this.f32791e = cast;
        this.f32792f = trailers;
        this.g = recommendations;
        this.f32793h = externalRatings;
        this.f32794i = collectionMovies;
        this.j = watchProgress;
        this.f32795k = z9;
        this.f32796l = str;
        this.f32797m = availability;
        this.f32798n = otherVersions;
        this.f32799o = c0871j;
    }

    public static C3224q a(C3224q c3224q, int i3, XtreamVODStream xtreamVODStream, TMDBMovieDetail tMDBMovieDetail, List list, List list2, List list3, List list4, List list5, WatchProgress watchProgress, boolean z6, EnumC3182a enumC3182a, List list6, C0871j c0871j, int i9) {
        boolean z9 = (i9 & 1) != 0 ? c3224q.f32787a : false;
        int i10 = (i9 & 2) != 0 ? c3224q.f32788b : i3;
        XtreamVODStream xtreamVODStream2 = (i9 & 4) != 0 ? c3224q.f32789c : xtreamVODStream;
        TMDBMovieDetail tMDBMovieDetail2 = (i9 & 8) != 0 ? c3224q.f32790d : tMDBMovieDetail;
        List cast = (i9 & 16) != 0 ? c3224q.f32791e : list;
        List trailers = (i9 & 32) != 0 ? c3224q.f32792f : list2;
        List recommendations = (i9 & 64) != 0 ? c3224q.g : list3;
        List externalRatings = (i9 & 128) != 0 ? c3224q.f32793h : list4;
        List collectionMovies = (i9 & 256) != 0 ? c3224q.f32794i : list5;
        WatchProgress watchProgress2 = (i9 & 512) != 0 ? c3224q.j : watchProgress;
        boolean z10 = (i9 & 1024) != 0 ? c3224q.f32795k : z6;
        String str = c3224q.f32796l;
        EnumC3182a availability = (i9 & 4096) != 0 ? c3224q.f32797m : enumC3182a;
        List otherVersions = (i9 & 8192) != 0 ? c3224q.f32798n : list6;
        C0871j c0871j2 = (i9 & 16384) != 0 ? c3224q.f32799o : c0871j;
        c3224q.getClass();
        m.e(cast, "cast");
        m.e(trailers, "trailers");
        m.e(recommendations, "recommendations");
        m.e(externalRatings, "externalRatings");
        m.e(collectionMovies, "collectionMovies");
        m.e(availability, "availability");
        m.e(otherVersions, "otherVersions");
        return new C3224q(z9, i10, xtreamVODStream2, tMDBMovieDetail2, cast, trailers, recommendations, externalRatings, collectionMovies, watchProgress2, z10, str, availability, otherVersions, c0871j2);
    }

    public final String b() {
        TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail != null) {
            return tMDBMovieDetail.g;
        }
        return null;
    }

    public final C0871j c() {
        return this.f32799o;
    }

    public final String d() {
        Integer num;
        int iIntValue;
        TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail == null || (num = tMDBMovieDetail.f20202i) == null || (iIntValue = num.intValue()) <= 0) {
            return null;
        }
        int i3 = iIntValue / 60;
        int i9 = iIntValue % 60;
        if (i3 <= 0) {
            return f.e(i9, CmcdData.OBJECT_TYPE_MANIFEST);
        }
        return i3 + "h " + i9 + CmcdData.OBJECT_TYPE_MANIFEST;
    }

    public final List e() {
        return this.f32793h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3224q)) {
            return false;
        }
        C3224q c3224q = (C3224q) obj;
        return this.f32787a == c3224q.f32787a && this.f32788b == c3224q.f32788b && m.a(this.f32789c, c3224q.f32789c) && m.a(this.f32790d, c3224q.f32790d) && m.a(this.f32791e, c3224q.f32791e) && m.a(this.f32792f, c3224q.f32792f) && m.a(this.g, c3224q.g) && m.a(this.f32793h, c3224q.f32793h) && m.a(this.f32794i, c3224q.f32794i) && m.a(this.j, c3224q.j) && this.f32795k == c3224q.f32795k && m.a(this.f32796l, c3224q.f32796l) && this.f32797m == c3224q.f32797m && m.a(this.f32798n, c3224q.f32798n) && m.a(this.f32799o, c3224q.f32799o);
    }

    public final String f() {
        List list;
        TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail == null || (list = tMDBMovieDetail.f20204l) == null) {
            return null;
        }
        return o.o1(list, " • ", null, null, new C3214l(5), 30);
    }

    public final String g() {
        TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail != null) {
            return tMDBMovieDetail.f20199e;
        }
        return null;
    }

    public final String h() {
        XtreamVODStream xtreamVODStream = this.f32789c;
        if (xtreamVODStream != null) {
            return xtreamVODStream.a();
        }
        return null;
    }

    public final int hashCode() {
        int iD = p.d(this.f32788b, Boolean.hashCode(this.f32787a) * 31, 31);
        XtreamVODStream xtreamVODStream = this.f32789c;
        int iHashCode = (iD + (xtreamVODStream == null ? 0 : xtreamVODStream.hashCode())) * 31;
        TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        int iB = a.b(a.b(a.b(a.b(a.b((iHashCode + (tMDBMovieDetail == null ? 0 : tMDBMovieDetail.hashCode())) * 31, 31, this.f32791e), 31, this.f32792f), 31, this.g), 31, this.f32793h), 31, this.f32794i);
        WatchProgress watchProgress = this.j;
        int iB2 = a.b((this.f32797m.hashCode() + a.a(p.f((iB + (watchProgress == null ? 0 : watchProgress.hashCode())) * 31, 31, this.f32795k), 31, this.f32796l)) * 31, 31, this.f32798n);
        C0871j c0871j = this.f32799o;
        return iB2 + (c0871j != null ? c0871j.hashCode() : 0);
    }

    public final List i() {
        return this.g;
    }

    public final String j() {
        String str;
        TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail != null && (str = tMDBMovieDetail.f20196b) != null) {
            return str;
        }
        K k9 = K.f9329a;
        XtreamVODStream xtreamVODStream = this.f32789c;
        String str2 = xtreamVODStream != null ? xtreamVODStream.f20723b : null;
        if (str2 == null) {
            str2 = "";
        }
        return K.c(k9, str2, false, 6);
    }

    public final String k() {
        Integer numC;
        TMDBMovieDetail tMDBMovieDetail = this.f32790d;
        if (tMDBMovieDetail == null || (numC = tMDBMovieDetail.c()) == null) {
            return null;
        }
        return numC.toString();
    }

    public final String toString() {
        return "TvMovieDetailUiState(isLoading=" + this.f32787a + ", streamId=" + this.f32788b + ", movie=" + this.f32789c + ", tmdbDetail=" + this.f32790d + ", cast=" + this.f32791e + ", trailers=" + this.f32792f + ", recommendations=" + this.g + ", externalRatings=" + this.f32793h + ", collectionMovies=" + this.f32794i + ", watchProgress=" + this.j + ", isInMyList=" + this.f32795k + ", imageBaseUrl=" + this.f32796l + ", availability=" + this.f32797m + ", otherVersions=" + this.f32798n + ", currentVersion=" + this.f32799o + ")";
    }
}
