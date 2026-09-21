package p005a5;

import S7.C;
import S7.F;
import U4.x;
import V7.W;
import V7.n0;
import V7.r;
import Y4.A;
import Y4.Q0;
import android.util.Log;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.ContentRatingInfo;
import com.kiptv.core.model.Playlist;
import com.kiptv.core.model.TMDBGenre;
import com.kiptv.core.model.TMDBImages;
import com.kiptv.core.model.TMDBMovieDetail;
import com.kiptv.core.model.TMDBSearchResult;
import com.kiptv.core.model.TMDBSeriesDetail;
import com.kiptv.core.model.XtreamCategory;
import com.kiptv.core.repository.TrendingRepository$CachedMatchResults;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p015b5.t;
import p028c8.d;
import p070h6.k;
import p078i6.D;
import p078i6.o;
import p078i6.q;
import p078i6.w;
import p078i6.y;
import p117n6.c;
import p117n6.i;
import p132p5.a;
import p153r8.C2691d;
import p153r8.p0;

public final class C1434v8 {
    public static final C1265e8 Companion = new C1265e8();

    public final ConcurrentHashMap f15191A;

    public final Set f15192B;

    public final Set f15193C;

    public final d f15194D;

    public F f15195E;

    public final C1451x5 f15196a;

    public final x f15197b;

    public final C1366p f15198c;

    public final M1 f15199d;

    public final C1291h4 f15200e;

    public final t f15201f;
    public final a g;

    public final n0 f15202h;

    public final W f15203i;
    public final n0 j;

    public final W f15204k;

    public final n0 f15205l;

    public final W f15206m;

    public final n0 f15207n;

    public final W f15208o;

    public final n0 f15209p;

    public final W f15210q;

    public final n0 f15211r;

    public final W f15212s;

    public final n0 f15213t;

    public final W f15214u;

    public volatile String f15215v;

    public volatile String f15216w;

    public final n0 f15217x;
    public final W y;

    public final ConcurrentHashMap f15218z;

    public C1434v8(C1451x5 tmdbRepository, x diskCache, C1366p contentCacheRepository, M1 playlistRepository, C1291h4 settingsRepository, t localizationService, a appConfig) {
        m.e(tmdbRepository, "tmdbRepository");
        m.e(diskCache, "diskCache");
        m.e(contentCacheRepository, "contentCacheRepository");
        m.e(playlistRepository, "playlistRepository");
        m.e(settingsRepository, "settingsRepository");
        m.e(localizationService, "localizationService");
        m.e(appConfig, "appConfig");
        this.f15196a = tmdbRepository;
        this.f15197b = diskCache;
        this.f15198c = contentCacheRepository;
        this.f15199d = playlistRepository;
        this.f15200e = settingsRepository;
        this.f15201f = localizationService;
        this.g = appConfig;
        n0 n0VarB = r.b(null);
        this.f15202h = n0VarB;
        this.f15203i = new W(n0VarB);
        n0 n0VarB2 = r.b(null);
        this.j = n0VarB2;
        this.f15204k = new W(n0VarB2);
        n0 n0VarB3 = r.b(null);
        this.f15205l = n0VarB3;
        this.f15206m = new W(n0VarB3);
        n0 n0VarB4 = r.b(null);
        this.f15207n = n0VarB4;
        this.f15208o = new W(n0VarB4);
        p078i6.x xVar = p078i6.x.f23206h;
        n0 n0VarB5 = r.b(xVar);
        this.f15209p = n0VarB5;
        this.f15210q = new W(n0VarB5);
        n0 n0VarB6 = r.b(xVar);
        this.f15211r = n0VarB6;
        this.f15212s = new W(n0VarB6);
        y yVar = y.f23207h;
        n0 n0VarB7 = r.b(yVar);
        this.f15213t = n0VarB7;
        this.f15214u = new W(n0VarB7);
        n0 n0VarB8 = r.b(yVar);
        this.f15217x = n0VarB8;
        this.y = new W(n0VarB8);
        this.f15218z = new ConcurrentHashMap();
        this.f15191A = new ConcurrentHashMap();
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        m.d(setSynchronizedSet, "synchronizedSet(...)");
        this.f15192B = setSynchronizedSet;
        Set setSynchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        m.d(setSynchronizedSet2, "synchronizedSet(...)");
        this.f15193C = setSynchronizedSet2;
        this.f15194D = new d();
    }

    public static final Set a(C1434v8 c1434v8, List list) {
        c1434v8.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C1381q4 c1381q4 = C1451x5.Companion;
            String str = ((XtreamCategory) obj).f20650b;
            c1381q4.getClass();
            if (C1381q4.b(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.I0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((XtreamCategory) it.next()).f20649a);
        }
        return o.R1(arrayList2);
    }

    public static final Object b(C1434v8 c1434v8, TMDBSearchResult tMDBSearchResult, c cVar) {
        C1275f8 c1275f8;
        String str;
        Object objP;
        String str2;
        TMDBGenre tMDBGenre;
        String str3;
        C1434v8 c1434v9 = c1434v8;
        TMDBSearchResult tMDBSearchResult2 = tMDBSearchResult;
        if (cVar instanceof C1275f8) {
            c1275f8 = (C1275f8) cVar;
            int i3 = c1275f8.f14470m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1275f8.f14470m = i3 - Integer.MIN_VALUE;
            } else {
                c1275f8 = new C1275f8(c1434v9, cVar);
            }
        } else {
            c1275f8 = new C1275f8(c1434v9, cVar);
        }
        Object obj = c1275f8.f14468k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1275f8.f14470m;
        try {
            if (i9 == 0) {
                P.u0(obj);
                str = (String) ((n0) c1434v9.f15201f.f17998d.f10419h).getValue();
                String upperCase = str.toUpperCase(Locale.ROOT);
                m.d(upperCase, "toUpperCase(...)");
                O7.q.p1(2, upperCase);
                C1451x5 c1451x5 = c1434v9.f15196a;
                int i10 = tMDBSearchResult2.f20292a;
                c1275f8.f14466h = c1434v9;
                c1275f8.f14467i = tMDBSearchResult2;
                c1275f8.j = str;
                c1275f8.f14470m = 1;
                objP = c1451x5.p(i10, c1275f8);
                if (objP == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str4 = c1275f8.j;
                tMDBSearchResult2 = c1275f8.f14467i;
                C1434v8 c1434v10 = c1275f8.f14466h;
                P.u0(obj);
                str = str4;
                c1434v9 = c1434v10;
                objP = obj;
            }
            TMDBMovieDetail tMDBMovieDetail = (TMDBMovieDetail) objP;
            C1265e8 c1265e8 = Companion;
            TMDBImages tMDBImages = tMDBMovieDetail.f20212t;
            List list = tMDBImages != null ? tMDBImages.f20187a : null;
            c1265e8.getClass();
            String strA = C1265e8.a(str, list);
            TMDBImages tMDBImages2 = tMDBMovieDetail.f20212t;
            String strB = C1265e8.b(tMDBImages2 != null ? tMDBImages2.f20188b : null);
            if (strB != null) {
                c1434v9.f15218z.put(new Integer(tMDBSearchResult2.f20292a), strB);
            }
            Integer num = tMDBMovieDetail.f20202i;
            if (num == null) {
                str2 = null;
            } else {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    int i11 = iIntValue / 60;
                    int i12 = iIntValue % 60;
                    if (i11 > 0) {
                        str3 = i11 + "h " + i12 + CmcdData.OBJECT_TYPE_MANIFEST;
                    } else {
                        str3 = i12 + CmcdData.OBJECT_TYPE_MANIFEST;
                    }
                    str2 = str3;
                } else {
                    str2 = null;
                }
            }
            Integer numC = tMDBMovieDetail.c();
            String string = numC != null ? numC.toString() : null;
            ContentRatingInfo contentRatingInfoA = tMDBMovieDetail.a(V0.u());
            int i13 = tMDBSearchResult2.f20292a;
            String str5 = tMDBMovieDetail.f20196b;
            String str6 = tMDBMovieDetail.g;
            if (str6 == null) {
                str6 = tMDBSearchResult2.f20298h;
            }
            String str7 = str6;
            String str8 = tMDBMovieDetail.f20200f;
            if (str8 == null) {
                str8 = tMDBSearchResult2.g;
            }
            String str9 = str8;
            Double d4 = tMDBMovieDetail.j;
            List list2 = tMDBMovieDetail.f20204l;
            return new C1255d8(i13, str5, str7, str9, strB, strA, d4, (list2 == null || (tMDBGenre = (TMDBGenre) o.j1(list2)) == null) ? null : tMDBGenre.f20179b, string, str2, contentRatingInfoA != null ? contentRatingInfoA.e() : null, contentRatingInfoA, tMDBMovieDetail.f20199e);
        } catch (Exception e6) {
            Log.d("TrendingRepository", "Error loading details for " + tMDBSearchResult2.f20292a + ": " + e6.getMessage());
            String strA2 = tMDBSearchResult2.a();
            Integer numB = tMDBSearchResult2.b();
            return new C1255d8(tMDBSearchResult2.f20292a, strA2, tMDBSearchResult2.f20298h, tMDBSearchResult2.g, null, null, tMDBSearchResult2.f20300k, null, numB != null ? numB.toString() : null, null, null, null, tMDBSearchResult2.f20297f);
        }
    }

    public static final Object c(C1434v8 c1434v8, TMDBSearchResult tMDBSearchResult, c cVar) {
        C1285g8 c1285g8;
        String str;
        Object objW;
        String str2;
        String strE;
        Integer numB;
        String string;
        ContentRatingInfo contentRatingInfoA;
        String str3;
        String str4;
        List list;
        String str5;
        String strE2;
        TMDBGenre tMDBGenre;
        C1434v8 c1434v9 = c1434v8;
        TMDBSearchResult tMDBSearchResult2 = tMDBSearchResult;
        if (cVar instanceof C1285g8) {
            c1285g8 = (C1285g8) cVar;
            int i3 = c1285g8.f14502m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1285g8.f14502m = i3 - Integer.MIN_VALUE;
            } else {
                c1285g8 = new C1285g8(c1434v9, cVar);
            }
        } else {
            c1285g8 = new C1285g8(c1434v9, cVar);
        }
        Object obj = c1285g8.f14500k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1285g8.f14502m;
        try {
            if (i9 == 0) {
                P.u0(obj);
                str = (String) ((n0) c1434v9.f15201f.f17998d.f10419h).getValue();
                String upperCase = str.toUpperCase(Locale.ROOT);
                m.d(upperCase, "toUpperCase(...)");
                O7.q.p1(2, upperCase);
                C1451x5 c1451x5 = c1434v9.f15196a;
                int i10 = tMDBSearchResult2.f20292a;
                c1285g8.f14498h = c1434v9;
                c1285g8.f14499i = tMDBSearchResult2;
                c1285g8.j = str;
                c1285g8.f14502m = 1;
                objW = c1451x5.w(i10, c1285g8);
                if (objW == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str6 = c1285g8.j;
                tMDBSearchResult2 = c1285g8.f14499i;
                C1434v8 c1434v10 = c1285g8.f14498h;
                P.u0(obj);
                str = str6;
                c1434v9 = c1434v10;
                objW = obj;
            }
            TMDBSeriesDetail tMDBSeriesDetail = (TMDBSeriesDetail) objW;
            C1265e8 c1265e8 = Companion;
            TMDBImages tMDBImages = tMDBSeriesDetail.f20327p;
            List list2 = tMDBImages != null ? tMDBImages.f20187a : null;
            c1265e8.getClass();
            String strA = C1265e8.a(str, list2);
            TMDBImages tMDBImages2 = tMDBSeriesDetail.f20327p;
            String strB = C1265e8.b(tMDBImages2 != null ? tMDBImages2.f20188b : null);
            if (strB != null) {
                c1434v9.f15191A.put(new Integer(tMDBSearchResult2.f20292a), strB);
            }
            Integer num = tMDBSeriesDetail.f20321i;
            if (num == null || num.intValue() <= 0) {
                List list3 = tMDBSeriesDetail.f20322k;
                Integer num2 = list3 != null ? (Integer) o.j1(list3) : null;
                if (num2 == null || num2.intValue() <= 0) {
                    str2 = null;
                } else {
                    strE = num2 + "m/ep";
                }
                numB = tMDBSeriesDetail.b();
                if (numB != null) {
                    string = numB.toString();
                } else {
                    string = null;
                }
                contentRatingInfoA = tMDBSeriesDetail.a(V0.u());
                int i11 = tMDBSearchResult2.f20292a;
                String str7 = tMDBSeriesDetail.f20315b;
                str3 = tMDBSeriesDetail.f20319f;
                if (str3 == null) {
                    str3 = tMDBSearchResult2.f20298h;
                }
                String str8 = str3;
                str4 = tMDBSeriesDetail.f20318e;
                if (str4 == null) {
                    str4 = tMDBSearchResult2.g;
                }
                String str9 = str4;
                Double d4 = tMDBSeriesDetail.f20323l;
                list = tMDBSeriesDetail.f20325n;
                if (list != null || (tMDBGenre = (TMDBGenre) o.j1(list)) == null) {
                    str5 = null;
                } else {
                    str5 = tMDBGenre.f20179b;
                }
                if (contentRatingInfoA != null) {
                    strE2 = contentRatingInfoA.e();
                } else {
                    strE2 = null;
                }
                return new C1255d8(i11, str7, str8, str9, strB, strA, d4, str5, string, str2, strE2, contentRatingInfoA, tMDBSeriesDetail.f20317d);
            }
            strE = c1434v9.f15201f.e(num.intValue() == 1 ? "series.seasonCount" : "series.seasonsCount", D.J0(new k("count", String.valueOf(num))));
            str2 = strE;
            numB = tMDBSeriesDetail.b();
            if (numB != null) {
                string = numB.toString();
            } else {
                string = null;
            }
            contentRatingInfoA = tMDBSeriesDetail.a(V0.u());
            int i12 = tMDBSearchResult2.f20292a;
            String str10 = tMDBSeriesDetail.f20315b;
            str3 = tMDBSeriesDetail.f20319f;
            if (str3 == null) {
                str3 = tMDBSearchResult2.f20298h;
            }
            String str11 = str3;
            str4 = tMDBSeriesDetail.f20318e;
            if (str4 == null) {
                str4 = tMDBSearchResult2.g;
            }
            String str12 = str4;
            Double d6 = tMDBSeriesDetail.f20323l;
            list = tMDBSeriesDetail.f20325n;
            if (list != null) {
                str5 = null;
            } else {
                str5 = null;
            }
            if (contentRatingInfoA != null) {
                strE2 = contentRatingInfoA.e();
            } else {
                strE2 = null;
            }
            return new C1255d8(i12, str10, str11, str12, strB, strA, d6, str5, string, str2, strE2, contentRatingInfoA, tMDBSeriesDetail.f20317d);
        } catch (Exception e6) {
            Log.d("TrendingRepository", "Error loading series details for " + tMDBSearchResult2.f20292a + ": " + e6.getMessage());
            String strA2 = tMDBSearchResult2.a();
            Integer numB2 = tMDBSearchResult2.b();
            return new C1255d8(tMDBSearchResult2.f20292a, strA2, tMDBSearchResult2.f20298h, tMDBSearchResult2.g, null, null, tMDBSearchResult2.f20300k, null, numB2 != null ? numB2.toString() : null, null, null, null, tMDBSearchResult2.f20297f);
        }
    }

    public static final Serializable d(C1434v8 c1434v8, c cVar) {
        C1305i8 c1305i8;
        String str;
        Object objD;
        C1434v8 c1434v9;
        String str2;
        C1434v8 c1434v10;
        ArrayList arrayList;
        Iterator it;
        List<String> listC1;
        Object objE;
        String str3;
        List list;
        String str4;
        ArrayList arrayList2;
        String strB;
        List<String> list2;
        if (cVar instanceof C1305i8) {
            c1305i8 = (C1305i8) cVar;
            int i3 = c1305i8.f14616m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1305i8.f14616m = i3 - Integer.MIN_VALUE;
            } else {
                c1305i8 = new C1305i8(c1434v8, cVar);
            }
        } else {
            c1305i8 = new C1305i8(c1434v8, cVar);
        }
        C1305i8 c1305i9 = c1305i8;
        Object objD2 = c1305i9.f14614k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1305i9.f14616m;
        if (i9 == 0) {
            P.u0(objD2);
            c1434v8.g.getClass();
            KSerializer kSerializerS = V0.s(new C2691d(p0.f26988a, 0));
            c1305i9.f14612h = c1434v8;
            str = "https://image.tmdb.org/t/p";
            c1305i9.f14613i = "https://image.tmdb.org/t/p";
            c1305i9.f14616m = 1;
            objD = c1434v8.f15197b.d("carousel_poster_paths", kSerializerS, 86400000L, c1305i9);
            if (objD == aVar) {
                return aVar;
            }
        } else if (i9 == 1) {
            String str5 = c1305i9.f14613i;
            C1434v8 c1434v11 = (C1434v8) c1305i9.f14612h;
            P.u0(objD2);
            str = str5;
            c1434v8 = c1434v11;
            objD = objD2;
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) c1305i9.f14612h;
                    P.u0(objD2);
                    list2 = (List) objD2;
                    if (list2 != null || list2.isEmpty()) {
                        return w.f23205h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (String str6 : list2) {
                        Q0.Companion.getClass();
                        String strB2 = A.b(str6, "w342", str2);
                        if (strB2 != null) {
                            arrayList3.add(strB2);
                        }
                    }
                    return arrayList3;
                }
                list = c1305i9.j;
                str3 = c1305i9.f14613i;
                c1434v9 = (C1434v8) c1305i9.f14612h;
                try {
                    P.u0(objD2);
                    listC1 = list;
                    str2 = str3;
                    arrayList2 = new ArrayList();
                    for (String str7 : listC1) {
                        Q0.Companion.getClass();
                        strB = A.b(str7, "w342", str2);
                        if (strB != null) {
                            arrayList2.add(strB);
                        }
                    }
                    return arrayList2;
                } catch (Exception unused) {
                    str2 = str3;
                    x xVar = c1434v9.f15197b;
                    KSerializer kSerializerS2 = V0.s(new C2691d(p0.f26988a, 0));
                    c1305i9.f14612h = str2;
                    c1305i9.f14613i = null;
                    c1305i9.j = null;
                    c1305i9.f14616m = 4;
                    objD2 = xVar.d("carousel_poster_paths", kSerializerS2, 604800000L, c1305i9);
                    if (objD2 == aVar) {
                        return aVar;
                    }
                    list2 = (List) objD2;
                    if (list2 != null) {
                    }
                    return w.f23205h;
                }
            }
            str2 = c1305i9.f14613i;
            c1434v9 = (C1434v8) c1305i9.f14612h;
            try {
                P.u0(objD2);
                c1434v10 = c1434v9;
                try {
                    arrayList = new ArrayList();
                    it = ((List) objD2).iterator();
                    while (it.hasNext()) {
                        str4 = ((TMDBSearchResult) it.next()).g;
                        if (str4 != null) {
                            arrayList.add(str4);
                        }
                    }
                    listC1 = o.c1(arrayList);
                    if (listC1.isEmpty()) {
                        c1434v9 = c1434v10;
                    } else {
                        x xVar2 = c1434v10.f15197b;
                        C2691d c2691d = new C2691d(p0.f26988a, 0);
                        c1305i9.f14612h = c1434v10;
                        c1305i9.f14613i = str2;
                        c1305i9.j = listC1;
                        c1305i9.f14616m = 3;
                        try {
                            objE = xVar2.e("carousel_poster_paths", listC1, c2691d, 604800000L, c1305i9);
                            c1305i9 = c1305i9;
                            if (objE == aVar) {
                                return aVar;
                            }
                            str3 = str2;
                            list = listC1;
                            c1434v9 = c1434v10;
                            listC1 = list;
                            str2 = str3;
                        } catch (Exception unused2) {
                            c1305i9 = c1305i9;
                            c1434v9 = c1434v10;
                            x xVar3 = c1434v9.f15197b;
                            KSerializer kSerializerS3 = V0.s(new C2691d(p0.f26988a, 0));
                            c1305i9.f14612h = str2;
                            c1305i9.f14613i = null;
                            c1305i9.j = null;
                            c1305i9.f14616m = 4;
                            objD2 = xVar3.d("carousel_poster_paths", kSerializerS3, 604800000L, c1305i9);
                            if (objD2 == aVar) {
                                return aVar;
                            }
                            list2 = (List) objD2;
                            if (list2 != null) {
                            }
                            return w.f23205h;
                        }
                    }
                    arrayList2 = new ArrayList();
                    while (r1.hasNext()) {
                        Q0.Companion.getClass();
                        strB = A.b(str7, "w342", str2);
                        if (strB != null) {
                            arrayList2.add(strB);
                        }
                    }
                    return arrayList2;
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
                x xVar4 = c1434v9.f15197b;
                KSerializer kSerializerS4 = V0.s(new C2691d(p0.f26988a, 0));
                c1305i9.f14612h = str2;
                c1305i9.f14613i = null;
                c1305i9.j = null;
                c1305i9.f14616m = 4;
                objD2 = xVar4.d("carousel_poster_paths", kSerializerS4, 604800000L, c1305i9);
                if (objD2 == aVar) {
                    return aVar;
                }
                list2 = (List) objD2;
                if (list2 != null) {
                }
                return w.f23205h;
            }
        }
        List<String> list3 = (List) objD;
        if (list3 != null && !list3.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            for (String str8 : list3) {
                Q0.Companion.getClass();
                String strB3 = A.b(str8, "w342", str);
                if (strB3 != null) {
                    arrayList4.add(strB3);
                }
            }
            return arrayList4;
        }
        try {
            C1451x5 c1451x5 = c1434v8.f15196a;
            c1305i9.f14612h = c1434v8;
            c1305i9.f14613i = str;
            c1305i9.f14616m = 2;
            Object objB = c1451x5.B(TtmlNode.COMBINE_ALL, "week", c1305i9);
            if (objB == aVar) {
                return aVar;
            }
            c1434v10 = c1434v8;
            str2 = str;
            objD2 = objB;
            arrayList = new ArrayList();
            it = ((List) objD2).iterator();
            while (it.hasNext()) {
                str4 = ((TMDBSearchResult) it.next()).g;
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            listC1 = o.c1(arrayList);
            if (listC1.isEmpty()) {
                x xVar5 = c1434v10.f15197b;
                C2691d c2691d2 = new C2691d(p0.f26988a, 0);
                c1305i9.f14612h = c1434v10;
                c1305i9.f14613i = str2;
                c1305i9.j = listC1;
                c1305i9.f14616m = 3;
                objE = xVar5.e("carousel_poster_paths", listC1, c2691d2, 604800000L, c1305i9);
                c1305i9 = c1305i9;
                if (objE == aVar) {
                    return aVar;
                }
                str3 = str2;
                list = listC1;
                c1434v9 = c1434v10;
                listC1 = list;
                str2 = str3;
            } else {
                c1434v9 = c1434v10;
            }
            arrayList2 = new ArrayList();
            while (r1.hasNext()) {
                Q0.Companion.getClass();
                strB = A.b(str7, "w342", str2);
                if (strB != null) {
                    arrayList2.add(strB);
                }
            }
            return arrayList2;
        } catch (Exception unused5) {
            c1434v9 = c1434v8;
            str2 = str;
            x xVar6 = c1434v9.f15197b;
            KSerializer kSerializerS5 = V0.s(new C2691d(p0.f26988a, 0));
            c1305i9.f14612h = str2;
            c1305i9.f14613i = null;
            c1305i9.j = null;
            c1305i9.f14616m = 4;
            objD2 = xVar6.d("carousel_poster_paths", kSerializerS5, 604800000L, c1305i9);
            if (objD2 == aVar) {
                return aVar;
            }
            list2 = (List) objD2;
            if (list2 != null) {
            }
            return w.f23205h;
        }
    }

    public static final Object e(C1434v8 c1434v8, String str, int i3, String str2, c cVar) {
        C1315j8 c1315j8;
        c1434v8.getClass();
        if (cVar instanceof C1315j8) {
            c1315j8 = (C1315j8) cVar;
            int i9 = c1315j8.f14674l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1315j8.f14674l = i9 - Integer.MIN_VALUE;
            } else {
                c1315j8 = new C1315j8(c1434v8, cVar);
            }
        } else {
            c1315j8 = new C1315j8(c1434v8, cVar);
        }
        C1315j8 c1315j9 = c1315j8;
        Object objD = c1315j9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = c1315j9.f14674l;
        if (i10 == 0) {
            P.u0(objD);
            String strG = c1434v8.g(str);
            if (strG.length() == 0) {
                return null;
            }
            KSerializer kSerializerSerializer = TrendingRepository$CachedMatchResults.INSTANCE.serializer();
            c1315j9.f14672i = str2;
            c1315j9.f14671h = i3;
            c1315j9.f14674l = 1;
            objD = c1434v8.f15197b.d(strG, kSerializerSerializer, 86400000L, c1315j9);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = c1315j9.f14671h;
            str2 = c1315j9.f14672i;
            P.u0(objD);
        }
        TrendingRepository$CachedMatchResults trendingRepository$CachedMatchResults = (TrendingRepository$CachedMatchResults) objD;
        if (trendingRepository$CachedMatchResults != null && trendingRepository$CachedMatchResults.f20939a == i3 && m.a(trendingRepository$CachedMatchResults.f20941c, str2)) {
            return trendingRepository$CachedMatchResults.f20940b;
        }
        return null;
    }

    public static final Object f(C1434v8 c1434v8, String str, int i3, String str2, LinkedHashMap linkedHashMap, i iVar) {
        String strG = c1434v8.g(str);
        int length = strG.length();
        p070h6.A a2 = p070h6.A.f22523a;
        if (length != 0) {
            Object objE = c1434v8.f15197b.e(strG, new TrendingRepository$CachedMatchResults(i3, linkedHashMap, str2), TrendingRepository$CachedMatchResults.INSTANCE.serializer(), 86400000L, iVar);
            if (objE == p109m6.a.f25430h) {
                return objE;
            }
        }
        return a2;
    }

    public final String g(String str) {
        String str2;
        Playlist playlist = (Playlist) ((n0) this.f15199d.f13659k.f10419h).getValue();
        return (playlist == null || (str2 = playlist.f20033a) == null) ? "" : B2.a.m("trending_match_", str, "_", str2);
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i3, c cVar) throws Throwable {
        C1325k8 c1325k8;
        C1434v8 c1434v8;
        p028c8.a aVar;
        p028c8.a aVar2;
        C1434v8 c1434v9;
        p028c8.a aVar3;
        F f9;
        Iterable iterable;
        if (cVar instanceof C1325k8) {
            c1325k8 = (C1325k8) cVar;
            int i9 = c1325k8.f14710n;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c1325k8.f14710n = i9 - Integer.MIN_VALUE;
            } else {
                c1325k8 = new C1325k8(this, cVar);
            }
        } else {
            c1325k8 = new C1325k8(this, cVar);
        }
        Object objB = c1325k8.f14708l;
        p109m6.a aVar4 = p109m6.a.f25430h;
        int i10 = c1325k8.f14710n;
        try {
            if (i10 == 0) {
                P.u0(objB);
                c1325k8.f14705h = this;
                d dVar = this.f15194D;
                c1325k8.f14706i = dVar;
                c1325k8.f14707k = i3;
                c1325k8.f14710n = 1;
                if (dVar.e(c1325k8) != aVar4) {
                    c1434v8 = this;
                    aVar = dVar;
                }
                return aVar4;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i3 = c1325k8.f14707k;
                    c1434v8 = c1325k8.j;
                    aVar2 = c1325k8.f14706i;
                    c1434v9 = c1325k8.f14705h;
                    try {
                        P.u0(objB);
                        aVar2 = aVar2;
                        c1434v8.f15195E = (F) objB;
                        aVar3 = aVar2;
                        c1434v8 = c1434v9;
                        ((d) aVar3).g(null);
                        f9 = c1434v8.f15195E;
                        if (f9 != null) {
                            c1325k8.f14705h = null;
                            c1325k8.f14706i = null;
                            c1325k8.j = null;
                            c1325k8.f14707k = i3;
                            c1325k8.f14710n = 3;
                            objB = f9.B(c1325k8);
                        } else {
                            iterable = w.f23205h;
                        }
                        return o.J1(iterable, i3);
                    } catch (Throwable th) {
                        th = th;
                        ((d) aVar2).g(null);
                        throw th;
                    }
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c1325k8.f14707k;
                P.u0(objB);
                iterable = (List) objB;
                if (iterable == null) {
                    iterable = w.f23205h;
                }
                return o.J1(iterable, i3);
            }
            i3 = c1325k8.f14707k;
            p028c8.a aVar5 = c1325k8.f14706i;
            C1434v8 c1434v10 = c1325k8.f14705h;
            P.u0(objB);
            aVar = aVar5;
            c1434v8 = c1434v10;
            F f10 = c1434v8.f15195E;
            if (f10 != null && f10.isActive()) {
                aVar3 = aVar;
                ((d) aVar3).g(null);
                f9 = c1434v8.f15195E;
                if (f9 != null) {
                    c1325k8.f14705h = null;
                    c1325k8.f14706i = null;
                    c1325k8.j = null;
                    c1325k8.f14707k = i3;
                    c1325k8.f14710n = 3;
                    objB = f9.B(c1325k8);
                } else {
                    iterable = w.f23205h;
                }
                return o.J1(iterable, i3);
            }
            C1345m8 c1345m8 = new C1345m8(c1434v8, null);
            c1325k8.f14705h = c1434v8;
            c1325k8.f14706i = aVar;
            c1325k8.j = c1434v8;
            c1325k8.f14707k = i3;
            c1325k8.f14710n = 2;
            Object objM = C.m(c1345m8, c1325k8);
            if (objM != aVar4) {
                aVar2 = aVar;
                objB = objM;
                c1434v9 = c1434v8;
                c1434v8.f15195E = (F) objB;
                aVar3 = aVar2;
                c1434v8 = c1434v9;
                ((d) aVar3).g(null);
                f9 = c1434v8.f15195E;
                if (f9 != null) {
                    c1325k8.f14705h = null;
                    c1325k8.f14706i = null;
                    c1325k8.j = null;
                    c1325k8.f14707k = i3;
                    c1325k8.f14710n = 3;
                    objB = f9.B(c1325k8);
                } else {
                    iterable = w.f23205h;
                }
                return o.J1(iterable, i3);
            }
            return aVar4;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            ((d) aVar2).g(null);
            throw th;
        }
    }

    public final Object i(c cVar) {
        C1375p8 c1375p8;
        C1434v8 c1434v8;
        List<TMDBSearchResult> list;
        C1434v8 c1434v9;
        List list2;
        ArrayList arrayList;
        Iterator it;
        Object next;
        C1255d8 c1255d8;
        if (cVar instanceof C1375p8) {
            c1375p8 = (C1375p8) cVar;
            int i3 = c1375p8.f14955l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1375p8.f14955l = i3 - Integer.MIN_VALUE;
            } else {
                c1375p8 = new C1375p8(this, cVar);
            }
        } else {
            c1375p8 = new C1375p8(this, cVar);
        }
        Object objB = c1375p8.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1375p8.f14955l;
        p070h6.A a2 = p070h6.A.f22523a;
        try {
            if (i9 == 0) {
                P.u0(objB);
                if (this.f15202h.getValue() == null || this.f15205l.getValue() == null) {
                    C1451x5 c1451x5 = this.f15196a;
                    c1375p8.f14952h = this;
                    c1375p8.f14955l = 1;
                    objB = c1451x5.B("movie", "week", c1375p8);
                    if (objB != aVar) {
                        c1434v8 = this;
                    }
                    return aVar;
                }
                return a2;
            }
            if (i9 == 1) {
                c1434v8 = c1375p8.f14952h;
                P.u0(objB);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = c1375p8.f14953i;
                c1434v9 = c1375p8.f14952h;
                P.u0(objB);
            }
            list2 = (List) objB;
            arrayList = new ArrayList();
            for (TMDBSearchResult tMDBSearchResult : list) {
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((C1255d8) next).f14365a != tMDBSearchResult.f20292a);
                c1255d8 = (C1255d8) next;
                if (c1255d8 != null) {
                    arrayList.add(c1255d8);
                }
            }
            n0 n0Var = c1434v9.f15202h;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            n0Var.h(arrayList);
            C1366p c1366p = c1434v9.f15198c;
            Boolean bool = Boolean.TRUE;
            n0 n0Var2 = c1366p.f14904A;
            n0Var2.getClass();
            n0Var2.i(null, bool);
            return a2;
            List list3 = (List) objB;
            if (list3.isEmpty()) {
                return a2;
            }
            n0 n0Var3 = c1434v8.f15205l;
            List listJ1 = o.J1(list3, 20);
            n0Var3.getClass();
            n0Var3.i(null, listJ1);
            List listJ2 = o.J1(list3, 8);
            C1394r8 c1394r8 = new C1394r8(listJ2, c1434v8, null);
            c1375p8.f14952h = c1434v8;
            c1375p8.f14953i = listJ2;
            c1375p8.f14955l = 2;
            Object objM = C.m(c1394r8, c1375p8);
            if (objM != aVar) {
                list = listJ2;
                objB = objM;
                c1434v9 = c1434v8;
                list2 = (List) objB;
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((C1255d8) next).f14365a != tMDBSearchResult.f20292a);
                    c1255d8 = (C1255d8) next;
                    if (c1255d8 != null) {
                        arrayList.add(c1255d8);
                    }
                }
                n0 n0Var4 = c1434v9.f15202h;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                n0Var4.h(arrayList);
                C1366p c1366p2 = c1434v9.f15198c;
                Boolean bool2 = Boolean.TRUE;
                n0 n0Var5 = c1366p2.f14904A;
                n0Var5.getClass();
                n0Var5.i(null, bool2);
                return a2;
            }
            return aVar;
        } catch (Exception e6) {
            Log.d("TrendingRepository", "Error loading movie trending: " + e6.getMessage());
        }
    }

    public final Object j(c cVar) {
        C1404s8 c1404s8;
        C1434v8 c1434v8;
        List<TMDBSearchResult> list;
        C1434v8 c1434v9;
        List list2;
        ArrayList arrayList;
        Iterator it;
        Object next;
        C1255d8 c1255d8;
        if (cVar instanceof C1404s8) {
            c1404s8 = (C1404s8) cVar;
            int i3 = c1404s8.f15083l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1404s8.f15083l = i3 - Integer.MIN_VALUE;
            } else {
                c1404s8 = new C1404s8(this, cVar);
            }
        } else {
            c1404s8 = new C1404s8(this, cVar);
        }
        Object objB = c1404s8.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1404s8.f15083l;
        p070h6.A a2 = p070h6.A.f22523a;
        ArrayList arrayList2 = null;
        try {
            if (i9 == 0) {
                P.u0(objB);
                if (this.j.getValue() == null || this.f15207n.getValue() == null) {
                    C1451x5 c1451x5 = this.f15196a;
                    c1404s8.f15080h = this;
                    c1404s8.f15083l = 1;
                    objB = c1451x5.B("tv", "week", c1404s8);
                    if (objB != aVar) {
                        c1434v8 = this;
                    }
                    return aVar;
                }
                return a2;
            }
            if (i9 == 1) {
                c1434v8 = c1404s8.f15080h;
                P.u0(objB);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = c1404s8.f15081i;
                c1434v9 = c1404s8.f15080h;
                P.u0(objB);
            }
            list2 = (List) objB;
            arrayList = new ArrayList();
            for (TMDBSearchResult tMDBSearchResult : list) {
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((C1255d8) next).f14365a != tMDBSearchResult.f20292a);
                c1255d8 = (C1255d8) next;
                if (c1255d8 != null) {
                    arrayList.add(c1255d8);
                }
            }
            n0 n0Var = c1434v9.j;
            if (arrayList.isEmpty()) {
                arrayList2 = arrayList;
            }
            n0Var.h(arrayList2);
            return a2;
            List list3 = (List) objB;
            if (list3.isEmpty()) {
                return a2;
            }
            n0 n0Var2 = c1434v8.f15207n;
            List listJ1 = o.J1(list3, 20);
            n0Var2.getClass();
            n0Var2.i(null, listJ1);
            List listJ2 = o.J1(list3, 8);
            C1424u8 c1424u8 = new C1424u8(listJ2, c1434v8, null);
            c1404s8.f15080h = c1434v8;
            c1404s8.f15081i = listJ2;
            c1404s8.f15083l = 2;
            Object objM = C.m(c1424u8, c1404s8);
            if (objM != aVar) {
                list = listJ2;
                objB = objM;
                c1434v9 = c1434v8;
                list2 = (List) objB;
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((C1255d8) next).f14365a != tMDBSearchResult.f20292a);
                    c1255d8 = (C1255d8) next;
                    if (c1255d8 != null) {
                        arrayList.add(c1255d8);
                    }
                }
                n0 n0Var3 = c1434v9.j;
                if (arrayList.isEmpty()) {
                    arrayList2 = arrayList;
                }
                n0Var3.h(arrayList2);
                return a2;
            }
            return aVar;
        } catch (Exception e6) {
            Log.d("TrendingRepository", "Error loading series trending: " + e6.getMessage());
        }
    }
}
