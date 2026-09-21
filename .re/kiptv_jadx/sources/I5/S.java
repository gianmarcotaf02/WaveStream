package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamSeries f4915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.I0 f4916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.TMDBSeriesDetail f4917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f4918f;
    public final java.util.List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f4919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.List f4920i;
    public final java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.Map f4922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.Map f4923m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.Map f4924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Integer f4925o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f4926p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f4927q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.List f4928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final S4.C0871j f4929s;

    public S(boolean z6, int i3, com.kiptv.core.model.XtreamSeries xtreamSeries, com.kiptv.core.model.I0 i9, com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail, java.util.List cast, java.util.List trailers, java.util.List recommendations, java.util.List externalRatings, java.util.List availableSeasons, int i10, java.util.Map episodesBySeason, java.util.Map episodeProgress, java.util.Map episodeMetadata, java.lang.Integer num, boolean z9, java.lang.String str, java.util.List otherVersions, S4.C0871j c0871j) {
        kotlin.jvm.internal.m.e(cast, "cast");
        kotlin.jvm.internal.m.e(trailers, "trailers");
        kotlin.jvm.internal.m.e(recommendations, "recommendations");
        kotlin.jvm.internal.m.e(externalRatings, "externalRatings");
        kotlin.jvm.internal.m.e(availableSeasons, "availableSeasons");
        kotlin.jvm.internal.m.e(episodesBySeason, "episodesBySeason");
        kotlin.jvm.internal.m.e(episodeProgress, "episodeProgress");
        kotlin.jvm.internal.m.e(episodeMetadata, "episodeMetadata");
        kotlin.jvm.internal.m.e(otherVersions, "otherVersions");
        this.f4913a = z6;
        this.f4914b = i3;
        this.f4915c = xtreamSeries;
        this.f4916d = i9;
        this.f4917e = tMDBSeriesDetail;
        this.f4918f = cast;
        this.g = trailers;
        this.f4919h = recommendations;
        this.f4920i = externalRatings;
        this.j = availableSeasons;
        this.f4921k = i10;
        this.f4922l = episodesBySeason;
        this.f4923m = episodeProgress;
        this.f4924n = episodeMetadata;
        this.f4925o = num;
        this.f4926p = z9;
        this.f4927q = str;
        this.f4928r = otherVersions;
        this.f4929s = c0871j;
    }

    public static I5.S a(I5.S s9, com.kiptv.core.model.XtreamSeries xtreamSeries, com.kiptv.core.model.I0 i3, com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, int i9, java.util.TreeMap treeMap, java.util.LinkedHashMap linkedHashMap, java.util.Map map, java.lang.Integer num, boolean z6, java.util.List list6, S4.C0871j c0871j, int i10) {
        boolean z9 = (i10 & 1) != 0 ? s9.f4913a : false;
        int i11 = s9.f4914b;
        com.kiptv.core.model.XtreamSeries xtreamSeries2 = (i10 & 4) != 0 ? s9.f4915c : xtreamSeries;
        com.kiptv.core.model.I0 i12 = (i10 & 8) != 0 ? s9.f4916d : i3;
        com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail2 = (i10 & 16) != 0 ? s9.f4917e : tMDBSeriesDetail;
        java.util.List cast = (i10 & 32) != 0 ? s9.f4918f : list;
        java.util.List trailers = (i10 & 64) != 0 ? s9.g : list2;
        java.util.List recommendations = (i10 & 128) != 0 ? s9.f4919h : list3;
        java.util.List externalRatings = (i10 & 256) != 0 ? s9.f4920i : list4;
        java.util.List availableSeasons = (i10 & 512) != 0 ? s9.j : list5;
        int i13 = (i10 & 1024) != 0 ? s9.f4921k : i9;
        java.util.Map episodesBySeason = (i10 & 2048) != 0 ? s9.f4922l : treeMap;
        java.util.Map episodeProgress = (i10 & 4096) != 0 ? s9.f4923m : linkedHashMap;
        java.util.Map episodeMetadata = (i10 & 8192) != 0 ? s9.f4924n : map;
        java.lang.Integer num2 = (i10 & 16384) != 0 ? s9.f4925o : num;
        boolean z10 = (32768 & i10) != 0 ? s9.f4926p : z6;
        java.lang.String str = s9.f4927q;
        java.util.List otherVersions = (i10 & 131072) != 0 ? s9.f4928r : list6;
        S4.C0871j c0871j2 = (i10 & 262144) != 0 ? s9.f4929s : c0871j;
        s9.getClass();
        kotlin.jvm.internal.m.e(cast, "cast");
        kotlin.jvm.internal.m.e(trailers, "trailers");
        kotlin.jvm.internal.m.e(recommendations, "recommendations");
        kotlin.jvm.internal.m.e(externalRatings, "externalRatings");
        kotlin.jvm.internal.m.e(availableSeasons, "availableSeasons");
        kotlin.jvm.internal.m.e(episodesBySeason, "episodesBySeason");
        kotlin.jvm.internal.m.e(episodeProgress, "episodeProgress");
        kotlin.jvm.internal.m.e(episodeMetadata, "episodeMetadata");
        kotlin.jvm.internal.m.e(otherVersions, "otherVersions");
        return new I5.S(z9, i11, xtreamSeries2, i12, tMDBSeriesDetail2, cast, trailers, recommendations, externalRatings, availableSeasons, i13, episodesBySeason, episodeProgress, episodeMetadata, num2, z10, str, otherVersions, c0871j2);
    }

    public final S4.C0871j b() {
        return this.f4929s;
    }

    public final java.util.List c() {
        return this.f4920i;
    }

    public final java.lang.String d() {
        java.util.List list;
        java.lang.String strO1;
        com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail = this.f4917e;
        if (tMDBSeriesDetail != null && (list = tMDBSeriesDetail.f20325n) != null && (strO1 = p078i6.o.o1(list, " • ", null, null, new F2.c(27), 30)) != null) {
            return strO1;
        }
        com.kiptv.core.model.XtreamSeries xtreamSeries = this.f4915c;
        if (xtreamSeries != null) {
            return xtreamSeries.f20688h;
        }
        return null;
    }

    public final com.kiptv.core.model.E0 e() {
        p070h6.k kVarG = g();
        if (kVarG != null) {
            return (com.kiptv.core.model.E0) kVarG.f22540i;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I5.S)) {
            return false;
        }
        I5.S s9 = (I5.S) obj;
        return this.f4913a == s9.f4913a && this.f4914b == s9.f4914b && kotlin.jvm.internal.m.a(this.f4915c, s9.f4915c) && kotlin.jvm.internal.m.a(this.f4916d, s9.f4916d) && kotlin.jvm.internal.m.a(this.f4917e, s9.f4917e) && kotlin.jvm.internal.m.a(this.f4918f, s9.f4918f) && kotlin.jvm.internal.m.a(this.g, s9.g) && kotlin.jvm.internal.m.a(this.f4919h, s9.f4919h) && kotlin.jvm.internal.m.a(this.f4920i, s9.f4920i) && kotlin.jvm.internal.m.a(this.j, s9.j) && this.f4921k == s9.f4921k && kotlin.jvm.internal.m.a(this.f4922l, s9.f4922l) && kotlin.jvm.internal.m.a(this.f4923m, s9.f4923m) && kotlin.jvm.internal.m.a(this.f4924n, s9.f4924n) && kotlin.jvm.internal.m.a(this.f4925o, s9.f4925o) && this.f4926p == s9.f4926p && kotlin.jvm.internal.m.a(this.f4927q, s9.f4927q) && kotlin.jvm.internal.m.a(this.f4928r, s9.f4928r) && kotlin.jvm.internal.m.a(this.f4929s, s9.f4929s);
    }

    public final java.lang.String f() {
        java.lang.String str;
        com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail = this.f4917e;
        if (tMDBSeriesDetail != null && (str = tMDBSeriesDetail.f20317d) != null) {
            return str;
        }
        com.kiptv.core.model.XtreamSeries xtreamSeries = this.f4915c;
        if (xtreamSeries != null) {
            return xtreamSeries.f20686e;
        }
        return null;
    }

    public final p070h6.k g() {
        java.util.List list;
        java.util.Map map;
        int i3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.j.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            list = p078i6.w.f23205h;
            map = this.f4922l;
            if (!zHasNext) {
                break;
            }
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            java.util.List list2 = (java.util.List) map.get(java.lang.Integer.valueOf(iIntValue));
            if (list2 != null) {
                list = list2;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new p070h6.k(java.lang.Integer.valueOf(iIntValue), (com.kiptv.core.model.E0) it2.next()));
            }
            p078i6.u.M0(arrayList, arrayList2);
        }
        java.lang.Object next = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        java.util.Iterator it3 = this.f4923m.values().iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                java.lang.String str = ((com.kiptv.core.model.WatchProgress) next).f20621n;
                do {
                    java.lang.Object next2 = it3.next();
                    java.lang.String str2 = ((com.kiptv.core.model.WatchProgress) next2).f20621n;
                    if (str.compareTo(str2) < 0) {
                        next = next2;
                        str = str2;
                    }
                } while (it3.hasNext());
            }
        }
        com.kiptv.core.model.WatchProgress watchProgress = (com.kiptv.core.model.WatchProgress) next;
        if (watchProgress != null) {
            java.util.Iterator it4 = arrayList.iterator();
            int i9 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    i9 = -1;
                    break;
                }
                p070h6.k kVar = (p070h6.k) it4.next();
                int iIntValue2 = ((java.lang.Number) kVar.f22539h).intValue();
                com.kiptv.core.model.E0 e6 = (com.kiptv.core.model.E0) kVar.f22540i;
                java.lang.Integer num = e6.g;
                if (num != null) {
                    iIntValue2 = num.intValue();
                }
                java.lang.Integer num2 = watchProgress.f20616h;
                if (num2 != null && iIntValue2 == num2.intValue()) {
                    int iA = e6.a();
                    java.lang.Integer num3 = watchProgress.f20617i;
                    if (num3 != null && iA == num3.intValue()) {
                        break;
                    }
                }
                i9++;
            }
            if (i9 >= 0) {
                return (!watchProgress.g() || (i3 = i9 + 1) >= arrayList.size()) ? (p070h6.k) arrayList.get(i9) : (p070h6.k) arrayList.get(i3);
            }
        }
        int i10 = this.f4921k;
        java.util.List list3 = (java.util.List) map.get(java.lang.Integer.valueOf(i10));
        if (list3 != null) {
            list = list3;
        }
        com.kiptv.core.model.E0 e9 = (com.kiptv.core.model.E0) p078i6.o.j1(list);
        return e9 != null ? new p070h6.k(java.lang.Integer.valueOf(i10), e9) : (p070h6.k) p078i6.o.j1(arrayList);
    }

    public final java.lang.String h() {
        java.lang.String str;
        com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail = this.f4917e;
        if (tMDBSeriesDetail != null && (str = tMDBSeriesDetail.f20315b) != null) {
            return str;
        }
        S4.K k9 = S4.K.f9329a;
        com.kiptv.core.model.XtreamSeries xtreamSeries = this.f4915c;
        java.lang.String str2 = xtreamSeries != null ? xtreamSeries.f20683b : null;
        if (str2 == null) {
            str2 = "";
        }
        return S4.K.c(k9, str2, false, 6);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f4914b, java.lang.Boolean.hashCode(this.f4913a) * 31, 31);
        com.kiptv.core.model.XtreamSeries xtreamSeries = this.f4915c;
        int iHashCode = (iD + (xtreamSeries == null ? 0 : xtreamSeries.hashCode())) * 31;
        com.kiptv.core.model.I0 i3 = this.f4916d;
        int iHashCode2 = (iHashCode + (i3 == null ? 0 : i3.hashCode())) * 31;
        com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail = this.f4917e;
        int iC = B2.a.c(B2.a.c(B2.a.c(p121o0.p.d(this.f4921k, B2.a.b(B2.a.b(B2.a.b(B2.a.b(B2.a.b((iHashCode2 + (tMDBSeriesDetail == null ? 0 : tMDBSeriesDetail.hashCode())) * 31, 31, this.f4918f), 31, this.g), 31, this.f4919h), 31, this.f4920i), 31, this.j), 31), 31, this.f4922l), 31, this.f4923m), 31, this.f4924n);
        java.lang.Integer num = this.f4925o;
        int iB = B2.a.b(B2.a.a(p121o0.p.f((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.f4926p), 31, this.f4927q), 31, this.f4928r);
        S4.C0871j c0871j = this.f4929s;
        return iB + (c0871j != null ? c0871j.hashCode() : 0);
    }

    public final java.lang.String i() {
        com.kiptv.core.model.XtreamSeries xtreamSeries = this.f4915c;
        if (xtreamSeries != null) {
            return xtreamSeries.a();
        }
        return null;
    }

    public final java.lang.String j() {
        java.lang.Integer numB;
        com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail = this.f4917e;
        if (tMDBSeriesDetail == null || (numB = tMDBSeriesDetail.b()) == null) {
            return null;
        }
        return numB.toString();
    }

    public final java.lang.String toString() {
        return "TvSeriesDetailUiState(isLoading=" + this.f4913a + ", seriesId=" + this.f4914b + ", series=" + this.f4915c + ", seriesInfo=" + this.f4916d + ", tmdbDetail=" + this.f4917e + ", cast=" + this.f4918f + ", trailers=" + this.g + ", recommendations=" + this.f4919h + ", externalRatings=" + this.f4920i + ", availableSeasons=" + this.j + ", selectedSeason=" + this.f4921k + ", episodesBySeason=" + this.f4922l + ", episodeProgress=" + this.f4923m + ", episodeMetadata=" + this.f4924n + ", tmdbId=" + this.f4925o + ", isInMyList=" + this.f4926p + ", imageBaseUrl=" + this.f4927q + ", otherVersions=" + this.f4928r + ", currentVersion=" + this.f4929s + ")";
    }
}
