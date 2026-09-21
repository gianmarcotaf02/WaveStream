package p005a5;

import O7.q;
import S4.C0875n;
import S4.r;
import U4.h;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.ContentRatingInfo;
import com.kiptv.core.model.TMDBCredits;
import com.kiptv.core.model.TMDBEpisode;
import com.kiptv.core.model.TMDBExternalIds;
import com.kiptv.core.model.TMDBImage;
import com.kiptv.core.model.TMDBImages;
import com.kiptv.core.model.TMDBSeasonDetail;
import com.kiptv.core.model.TMDBSeriesDetail;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.p0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.o;
import p078i6.w;
import p109m6.a;
import p117n6.c;

public final class J3 {

    public final C1451x5 f13541a;

    public final LinkedHashMap f13542b;

    public final LinkedHashMap f13543c;

    public J3(C1291h4 settingsRepository, C1451x5 tmdbRepository) {
        m.e(tmdbRepository, "tmdbRepository");
        m.e(settingsRepository, "settingsRepository");
        this.f13541a = tmdbRepository;
        this.f13542b = new LinkedHashMap();
        this.f13543c = new LinkedHashMap();
    }

    public static C3 b(String str, XtreamSeries xtreamSeries) {
        String str2;
        Double d4;
        String str3;
        r rVar = r.f9438i;
        String str4 = (xtreamSeries == null || (str3 = xtreamSeries.f20683b) == null) ? str : str3;
        String str5 = xtreamSeries != null ? xtreamSeries.f20686e : null;
        Double dValueOf = (xtreamSeries == null || (d4 = xtreamSeries.f20691l) == null) ? null : Double.valueOf(d4.doubleValue() * 2.0d);
        String strP1 = (xtreamSeries == null || (str2 = xtreamSeries.f20689i) == null) ? null : q.p1(4, str2);
        String str6 = xtreamSeries != null ? xtreamSeries.f20688h : null;
        w wVar = w.f23205h;
        return new C3(null, str4, str5, null, null, null, dValueOf, strP1, str6, null, null, null, null, null, wVar, wVar, null, rVar);
    }

    public final Object a(int i3, String str, XtreamSeries xtreamSeries, c cVar) {
        D3 d4;
        String str2;
        XtreamSeries xtreamSeries2;
        J3 j9;
        XtreamSeries xtreamSeries3;
        TMDBSeriesDetail tMDBSeriesDetail;
        w wVar;
        TMDBImages tMDBImages;
        String str3;
        ContentRatingInfo contentRatingInfoA;
        String str4;
        String strP1;
        List list;
        String strO1;
        String strE;
        TMDBCredits tMDBCredits;
        List listJ1;
        List list2;
        List list3;
        List list4;
        TMDBImage tMDBImageA;
        int i9 = i3;
        if (cVar instanceof D3) {
            d4 = (D3) cVar;
            int i10 = d4.f13311n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d4.f13311n = i10 - Integer.MIN_VALUE;
            } else {
                d4 = new D3(this, cVar);
            }
        } else {
            d4 = new D3(this, cVar);
        }
        Object objW = d4.f13309l;
        a aVar = a.f25430h;
        int i11 = d4.f13311n;
        if (i11 == 0) {
            P.u0(objW);
            try {
                C1451x5 c1451x5 = this.f13541a;
                d4.f13306h = this;
                str2 = str;
                try {
                    d4.f13307i = str2;
                    xtreamSeries2 = xtreamSeries;
                    try {
                        d4.j = xtreamSeries2;
                        d4.f13308k = i9;
                        d4.f13311n = 1;
                        objW = c1451x5.w(i9, d4);
                        if (objW == aVar) {
                            return aVar;
                        }
                        j9 = this;
                        xtreamSeries3 = xtreamSeries2;
                    } catch (Exception unused) {
                        j9 = this;
                        tMDBSeriesDetail = null;
                        xtreamSeries3 = xtreamSeries2;
                    }
                } catch (Exception unused2) {
                    xtreamSeries2 = xtreamSeries;
                    j9 = this;
                    tMDBSeriesDetail = null;
                    xtreamSeries3 = xtreamSeries2;
                    wVar = w.f23205h;
                    if (tMDBSeriesDetail == null) {
                        j9.getClass();
                        C3 c3B = b(str2, xtreamSeries3);
                        Integer num = new Integer(i9);
                        r rVar = r.f9438i;
                        String title = c3B.f13239b;
                        m.e(title, "title");
                        return new C3(num, title, c3B.f13240c, null, null, null, c3B.g, c3B.f13244h, c3B.f13245i, null, null, null, null, null, wVar, wVar, null, rVar);
                    }
                    tMDBImages = tMDBSeriesDetail.f20327p;
                    if (tMDBImages != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    contentRatingInfoA = tMDBSeriesDetail.a(null);
                    Integer num2 = new Integer(i9);
                    str4 = tMDBSeriesDetail.g;
                    if (str4 != null) {
                        strP1 = q.p1(4, str4);
                    } else {
                        strP1 = null;
                    }
                    list = tMDBSeriesDetail.f20325n;
                    if (list != null) {
                        strO1 = o.o1(list, ", ", null, null, new h(18), 30);
                    } else {
                        strO1 = null;
                    }
                    if (contentRatingInfoA != null) {
                        strE = contentRatingInfoA.e();
                    } else {
                        strE = null;
                    }
                    tMDBCredits = tMDBSeriesDetail.f20326o;
                    if (tMDBCredits != null) {
                        listJ1 = wVar;
                    } else {
                        listJ1 = wVar;
                    }
                    if (tMDBCredits != null) {
                        list2 = tMDBCredits.f20148b;
                    } else {
                        list2 = null;
                    }
                    if (list2 == null) {
                        list3 = wVar;
                    } else {
                        list3 = list2;
                    }
                    TMDBExternalIds tMDBExternalIds = tMDBSeriesDetail.f20330s;
                    return new C3(num2, tMDBSeriesDetail.f20315b, tMDBSeriesDetail.f20317d, tMDBSeriesDetail.f20318e, tMDBSeriesDetail.f20319f, str3, tMDBSeriesDetail.f20323l, strP1, strO1, strE, contentRatingInfoA, tMDBSeriesDetail.f20321i, tMDBSeriesDetail.f20322k, tMDBSeriesDetail.f20329r, listJ1, list3, tMDBExternalIds != null ? tMDBExternalIds.f20171b : null, r.f9437h);
                }
            } catch (Exception unused3) {
                str2 = str;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = d4.f13308k;
            xtreamSeries3 = d4.j;
            str2 = d4.f13307i;
            j9 = d4.f13306h;
            try {
                P.u0(objW);
            } catch (Exception unused4) {
                xtreamSeries2 = xtreamSeries3;
                tMDBSeriesDetail = null;
                xtreamSeries3 = xtreamSeries2;
            }
        }
        tMDBSeriesDetail = (TMDBSeriesDetail) objW;
        wVar = w.f23205h;
        if (tMDBSeriesDetail == null) {
            j9.getClass();
            C3 c3B2 = b(str2, xtreamSeries3);
            Integer num3 = new Integer(i9);
            r rVar2 = r.f9438i;
            String title2 = c3B2.f13239b;
            m.e(title2, "title");
            return new C3(num3, title2, c3B2.f13240c, null, null, null, c3B2.g, c3B2.f13244h, c3B2.f13245i, null, null, null, null, null, wVar, wVar, null, rVar2);
        }
        tMDBImages = tMDBSeriesDetail.f20327p;
        if (tMDBImages != null || (tMDBImageA = TMDBImages.a(tMDBImages)) == null) {
            str3 = null;
        } else {
            str3 = tMDBImageA.f20180a;
        }
        contentRatingInfoA = tMDBSeriesDetail.a(null);
        Integer num4 = new Integer(i9);
        str4 = tMDBSeriesDetail.g;
        if (str4 != null) {
            strP1 = q.p1(4, str4);
        } else {
            strP1 = null;
        }
        list = tMDBSeriesDetail.f20325n;
        if (list != null) {
            strO1 = o.o1(list, ", ", null, null, new h(18), 30);
        } else {
            strO1 = null;
        }
        if (contentRatingInfoA != null) {
            strE = contentRatingInfoA.e();
        } else {
            strE = null;
        }
        tMDBCredits = tMDBSeriesDetail.f20326o;
        if (tMDBCredits != null || (list4 = tMDBCredits.f20147a) == null) {
            listJ1 = wVar;
        } else {
            listJ1 = o.J1(list4, 20);
        }
        if (tMDBCredits != null) {
            list2 = tMDBCredits.f20148b;
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list3 = wVar;
        } else {
            list3 = list2;
        }
        TMDBExternalIds tMDBExternalIds2 = tMDBSeriesDetail.f20330s;
        return new C3(num4, tMDBSeriesDetail.f20315b, tMDBSeriesDetail.f20317d, tMDBSeriesDetail.f20318e, tMDBSeriesDetail.f20319f, str3, tMDBSeriesDetail.f20323l, strP1, strO1, strE, contentRatingInfoA, tMDBSeriesDetail.f20321i, tMDBSeriesDetail.f20322k, tMDBSeriesDetail.f20329r, listJ1, list3, tMDBExternalIds2 != null ? tMDBExternalIds2.f20171b : null, r.f9437h);
    }

    public final Object c(String str, Integer num, XtreamSeries xtreamSeries, c cVar) {
        E3 e6;
        String str2;
        Object obj;
        J3 j9;
        C3 c3B;
        String str3;
        if (cVar instanceof E3) {
            e6 = (E3) cVar;
            int i3 = e6.f13345n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f13345n = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new E3(this, cVar);
            }
        } else {
            e6 = new E3(this, cVar);
        }
        Object obj2 = e6.f13343l;
        a aVar = a.f25430h;
        int i9 = e6.f13345n;
        if (i9 != 0) {
            if (i9 == 1) {
                String str4 = e6.f13342k;
                xtreamSeries = e6.j;
                String str5 = e6.f13341i;
                J3 j10 = e6.f13340h;
                P.u0(obj2);
                str2 = str4;
                str = str5;
                j9 = j10;
                obj = obj2;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = e6.f13341i;
                j9 = e6.f13340h;
                P.u0(obj2);
            }
            c3B = (C3) obj2;
            j9.f13542b.put(str3, c3B);
            return c3B;
        }
        P.u0(obj2);
        str2 = (num != null ? num.intValue() : 0) + "_" + (xtreamSeries != null ? new Integer(xtreamSeries.f20684c) : str);
        C3 c9 = (C3) this.f13542b.get(str2);
        if (c9 != null) {
            return c9;
        }
        e6.f13340h = this;
        e6.f13341i = str;
        e6.j = xtreamSeries;
        e6.f13342k = str2;
        e6.f13345n = 1;
        Object objE = e(str, num, xtreamSeries, e6);
        if (objE != aVar) {
            obj = objE;
            j9 = this;
        }
        return aVar;
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            e6.f13340h = j9;
            e6.f13341i = str2;
            e6.j = null;
            e6.f13342k = null;
            e6.f13345n = 2;
            Object objA = j9.a(iIntValue, str, xtreamSeries, e6);
            if (objA != aVar) {
                String str6 = str2;
                obj2 = objA;
                str3 = str6;
                c3B = (C3) obj2;
            }
            return aVar;
        }
        j9.getClass();
        String str7 = str2;
        c3B = b(str, xtreamSeries);
        str3 = str7;
        j9.f13542b.put(str3, c3B);
        return c3B;
    }

    public final Object d(Integer num, int i3, c cVar) {
        H3 h9;
        J3 j9;
        String str;
        int i9;
        ?? arrayList;
        if (cVar instanceof H3) {
            h9 = (H3) cVar;
            int i10 = h9.f13469m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h9.f13469m = i10 - Integer.MIN_VALUE;
            } else {
                h9 = new H3(this, cVar);
            }
        } else {
            h9 = new H3(this, cVar);
        }
        Object obj = h9.f13467k;
        a aVar = a.f25430h;
        int i11 = h9.f13469m;
        ?? r9 = w.f23205h;
        if (i11 == 0) {
            P.u0(obj);
            if (num == null) {
                return r9;
            }
            String str2 = num + "_s" + i3;
            List list = (List) this.f13543c.get(str2);
            if (list != null) {
                return list;
            }
            try {
                C1451x5 c1451x5 = this.f13541a;
                int iIntValue = num.intValue();
                h9.f13465h = this;
                h9.f13466i = str2;
                h9.j = i3;
                h9.f13469m = 1;
                Object objV = c1451x5.v(iIntValue, i3, h9);
                if (objV == aVar) {
                    return aVar;
                }
                obj = objV;
                i9 = i3;
                str = str2;
                j9 = this;
            } catch (Exception unused) {
                j9 = this;
                str = str2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = h9.j;
            str = h9.f13466i;
            j9 = h9.f13465h;
            try {
                P.u0(obj);
            } catch (Exception unused2) {
            }
        }
        List<TMDBEpisode> list2 = ((TMDBSeasonDetail) obj).f20312f;
        if (list2 != null) {
            arrayList = new ArrayList(p078i6.q.I0(list2, 10));
            for (TMDBEpisode tMDBEpisode : list2) {
                Integer num2 = tMDBEpisode.f20162d;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = tMDBEpisode.f20163e;
                int iIntValue3 = num3 != null ? num3.intValue() : i9;
                String str3 = tMDBEpisode.f20160b;
                String str4 = tMDBEpisode.f20161c;
                String str5 = tMDBEpisode.f20164f;
                arrayList.add(new C0875n(iIntValue2, iIntValue3, str3, str4, str5 != null ? "https://image.tmdb.org/t/p/w780" + str5 : null, tMDBEpisode.g, tMDBEpisode.f20165h, tMDBEpisode.f20166i, r.f9437h));
            }
        } else {
            arrayList = r9;
        }
        C0875n c0875n = (C0875n) o.j1(o.I1(arrayList, new B(15)));
        int i12 = c0875n != null ? c0875n.f9417a : 1;
        int i13 = i12 > 1 ? i12 - 1 : 0;
        if (i13 > 0) {
            ArrayList arrayList2 = new ArrayList(p078i6.q.I0(arrayList, 10));
            for (C0875n c0875n2 : arrayList) {
                arrayList2.add(new C0875n(c0875n2.f9417a - i13, c0875n2.f9418b, c0875n2.f9419c, c0875n2.f9420d, c0875n2.f9421e, c0875n2.f9422f, c0875n2.g, c0875n2.f9423h, c0875n2.f9424i));
            }
            r9 = arrayList2;
        } else {
            r9 = arrayList;
        }
        if (!r9.isEmpty()) {
            j9.f13543c.put(str, r9);
        }
        return r9;
    }

    public final Object e(String str, Integer num, XtreamSeries xtreamSeries, c cVar) {
        I3 i3;
        Integer numE;
        if (cVar instanceof I3) {
            i3 = (I3) cVar;
            int i9 = i3.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                i3.j = i9 - Integer.MIN_VALUE;
            } else {
                i3 = new I3(this, cVar);
            }
        } else {
            i3 = new I3(this, cVar);
        }
        I3 i10 = i3;
        Object objI = i10.f13505h;
        a aVar = a.f25430h;
        int i11 = i10.j;
        if (i11 == 0) {
            P.u0(objI);
            if (num != null) {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    return new Integer(num.intValue());
                }
            }
            if (xtreamSeries != null && (numE = xtreamSeries.e()) != null) {
                return new Integer(numE.intValue());
            }
            if (this.f13541a.D()) {
                String str2 = xtreamSeries != null ? xtreamSeries.f20694o : null;
                i10.j = 1;
                objI = C1451x5.i(this.f13541a, str, null, str2, false, i10, 10);
                if (objI == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P.u0(objI);
        p0 p0Var = (p0) objI;
        if (p0Var != null) {
            return new Integer(p0Var.f20815a);
        }
        return null;
    }
}
