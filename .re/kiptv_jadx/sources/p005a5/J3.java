package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class J3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a5.C1451x5 f13541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f13542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.LinkedHashMap f13543c;

    public J3(p005a5.C1291h4 settingsRepository, p005a5.C1451x5 tmdbRepository) {
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        this.f13541a = tmdbRepository;
        this.f13542b = new java.util.LinkedHashMap();
        this.f13543c = new java.util.LinkedHashMap();
    }

    public static p005a5.C3 b(java.lang.String str, com.kiptv.core.model.XtreamSeries xtreamSeries) {
        java.lang.String str2;
        java.lang.Double d4;
        java.lang.String str3;
        S4.r rVar = S4.r.f9438i;
        java.lang.String str4 = (xtreamSeries == null || (str3 = xtreamSeries.f20683b) == null) ? str : str3;
        java.lang.String str5 = xtreamSeries != null ? xtreamSeries.f20686e : null;
        java.lang.Double dValueOf = (xtreamSeries == null || (d4 = xtreamSeries.f20691l) == null) ? null : java.lang.Double.valueOf(d4.doubleValue() * 2.0d);
        java.lang.String strP1 = (xtreamSeries == null || (str2 = xtreamSeries.f20689i) == null) ? null : O7.q.p1(4, str2);
        java.lang.String str6 = xtreamSeries != null ? xtreamSeries.f20688h : null;
        p078i6.w wVar = p078i6.w.f23205h;
        return new p005a5.C3(null, str4, str5, null, null, null, dValueOf, strP1, str6, null, null, null, null, null, wVar, wVar, null, rVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x010d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object a(int i3, java.lang.String str, com.kiptv.core.model.XtreamSeries xtreamSeries, p117n6.c cVar) {
        p005a5.D3 d4;
        java.lang.String str2;
        com.kiptv.core.model.XtreamSeries xtreamSeries2;
        p005a5.J3 j9;
        com.kiptv.core.model.XtreamSeries xtreamSeries3;
        com.kiptv.core.model.TMDBSeriesDetail tMDBSeriesDetail;
        p078i6.w wVar;
        com.kiptv.core.model.TMDBImages tMDBImages;
        java.lang.String str3;
        com.kiptv.core.model.ContentRatingInfo contentRatingInfoA;
        java.lang.String str4;
        java.lang.String strP1;
        java.util.List list;
        java.lang.String strO1;
        java.lang.String strE;
        com.kiptv.core.model.TMDBCredits tMDBCredits;
        java.util.List listJ1;
        java.util.List list2;
        java.util.List list3;
        java.util.List list4;
        com.kiptv.core.model.TMDBImage tMDBImageA;
        int i9 = i3;
        if (cVar instanceof p005a5.D3) {
            d4 = (p005a5.D3) cVar;
            int i10 = d4.f13311n;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                d4.f13311n = i10 - Integer.MIN_VALUE;
            } else {
                d4 = new p005a5.D3(this, cVar);
            }
        } else {
            d4 = new p005a5.D3(this, cVar);
        }
        java.lang.Object objW = d4.f13309l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = d4.f13311n;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objW);
            try {
                p005a5.C1451x5 c1451x5 = this.f13541a;
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
                    } catch (java.lang.Exception unused) {
                        j9 = this;
                        tMDBSeriesDetail = null;
                        xtreamSeries3 = xtreamSeries2;
                    }
                } catch (java.lang.Exception unused2) {
                    xtreamSeries2 = xtreamSeries;
                    j9 = this;
                    tMDBSeriesDetail = null;
                    xtreamSeries3 = xtreamSeries2;
                    wVar = p078i6.w.f23205h;
                    if (tMDBSeriesDetail == null) {
                        j9.getClass();
                        p005a5.C3 c3B = b(str2, xtreamSeries3);
                        java.lang.Integer num = new java.lang.Integer(i9);
                        S4.r rVar = S4.r.f9438i;
                        java.lang.String title = c3B.f13239b;
                        kotlin.jvm.internal.m.e(title, "title");
                        return new p005a5.C3(num, title, c3B.f13240c, null, null, null, c3B.g, c3B.f13244h, c3B.f13245i, null, null, null, null, null, wVar, wVar, null, rVar);
                    }
                    tMDBImages = tMDBSeriesDetail.f20327p;
                    if (tMDBImages != null) {
                        str3 = null;
                    } else {
                        str3 = null;
                    }
                    contentRatingInfoA = tMDBSeriesDetail.a(null);
                    java.lang.Integer num2 = new java.lang.Integer(i9);
                    str4 = tMDBSeriesDetail.g;
                    if (str4 != null) {
                        strP1 = O7.q.p1(4, str4);
                    } else {
                        strP1 = null;
                    }
                    list = tMDBSeriesDetail.f20325n;
                    if (list != null) {
                        strO1 = p078i6.o.o1(list, ", ", null, null, new U4.h(18), 30);
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
                    com.kiptv.core.model.TMDBExternalIds tMDBExternalIds = tMDBSeriesDetail.f20330s;
                    return new p005a5.C3(num2, tMDBSeriesDetail.f20315b, tMDBSeriesDetail.f20317d, tMDBSeriesDetail.f20318e, tMDBSeriesDetail.f20319f, str3, tMDBSeriesDetail.f20323l, strP1, strO1, strE, contentRatingInfoA, tMDBSeriesDetail.f20321i, tMDBSeriesDetail.f20322k, tMDBSeriesDetail.f20329r, listJ1, list3, tMDBExternalIds != null ? tMDBExternalIds.f20171b : null, S4.r.f9437h);
                }
            } catch (java.lang.Exception unused3) {
                str2 = str;
            }
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = d4.f13308k;
            xtreamSeries3 = d4.j;
            str2 = d4.f13307i;
            j9 = d4.f13306h;
            try {
                com.google.common.util.concurrent.P.u0(objW);
            } catch (java.lang.Exception unused4) {
                xtreamSeries2 = xtreamSeries3;
                tMDBSeriesDetail = null;
                xtreamSeries3 = xtreamSeries2;
            }
        }
        tMDBSeriesDetail = (com.kiptv.core.model.TMDBSeriesDetail) objW;
        wVar = p078i6.w.f23205h;
        if (tMDBSeriesDetail == null) {
            j9.getClass();
            p005a5.C3 c3B2 = b(str2, xtreamSeries3);
            java.lang.Integer num3 = new java.lang.Integer(i9);
            S4.r rVar2 = S4.r.f9438i;
            java.lang.String title2 = c3B2.f13239b;
            kotlin.jvm.internal.m.e(title2, "title");
            return new p005a5.C3(num3, title2, c3B2.f13240c, null, null, null, c3B2.g, c3B2.f13244h, c3B2.f13245i, null, null, null, null, null, wVar, wVar, null, rVar2);
        }
        tMDBImages = tMDBSeriesDetail.f20327p;
        if (tMDBImages != null || (tMDBImageA = com.kiptv.core.model.TMDBImages.a(tMDBImages)) == null) {
            str3 = null;
        } else {
            str3 = tMDBImageA.f20180a;
        }
        contentRatingInfoA = tMDBSeriesDetail.a(null);
        java.lang.Integer num4 = new java.lang.Integer(i9);
        str4 = tMDBSeriesDetail.g;
        if (str4 != null) {
            strP1 = O7.q.p1(4, str4);
        } else {
            strP1 = null;
        }
        list = tMDBSeriesDetail.f20325n;
        if (list != null) {
            strO1 = p078i6.o.o1(list, ", ", null, null, new U4.h(18), 30);
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
            listJ1 = p078i6.o.J1(list4, 20);
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
        com.kiptv.core.model.TMDBExternalIds tMDBExternalIds2 = tMDBSeriesDetail.f20330s;
        return new p005a5.C3(num4, tMDBSeriesDetail.f20315b, tMDBSeriesDetail.f20317d, tMDBSeriesDetail.f20318e, tMDBSeriesDetail.f20319f, str3, tMDBSeriesDetail.f20323l, strP1, strO1, strE, contentRatingInfoA, tMDBSeriesDetail.f20321i, tMDBSeriesDetail.f20322k, tMDBSeriesDetail.f20329r, listJ1, list3, tMDBExternalIds2 != null ? tMDBExternalIds2.f20171b : null, S4.r.f9437h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, java.lang.Integer num, com.kiptv.core.model.XtreamSeries xtreamSeries, p117n6.c cVar) {
        p005a5.E3 e6;
        java.lang.String str2;
        java.lang.Object obj;
        p005a5.J3 j9;
        p005a5.C3 c3B;
        java.lang.String str3;
        if (cVar instanceof p005a5.E3) {
            e6 = (p005a5.E3) cVar;
            int i3 = e6.f13345n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f13345n = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new p005a5.E3(this, cVar);
            }
        } else {
            e6 = new p005a5.E3(this, cVar);
        }
        java.lang.Object obj2 = e6.f13343l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = e6.f13345n;
        if (i9 != 0) {
            if (i9 == 1) {
                java.lang.String str4 = e6.f13342k;
                xtreamSeries = e6.j;
                java.lang.String str5 = e6.f13341i;
                p005a5.J3 j10 = e6.f13340h;
                com.google.common.util.concurrent.P.u0(obj2);
                str2 = str4;
                str = str5;
                j9 = j10;
                obj = obj2;
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = e6.f13341i;
                j9 = e6.f13340h;
                com.google.common.util.concurrent.P.u0(obj2);
            }
            c3B = (p005a5.C3) obj2;
            j9.f13542b.put(str3, c3B);
            return c3B;
        }
        com.google.common.util.concurrent.P.u0(obj2);
        str2 = (num != null ? num.intValue() : 0) + "_" + (xtreamSeries != null ? new java.lang.Integer(xtreamSeries.f20684c) : str);
        p005a5.C3 c9 = (p005a5.C3) this.f13542b.get(str2);
        if (c9 != null) {
            return c9;
        }
        e6.f13340h = this;
        e6.f13341i = str;
        e6.j = xtreamSeries;
        e6.f13342k = str2;
        e6.f13345n = 1;
        java.lang.Object objE = e(str, num, xtreamSeries, e6);
        if (objE != aVar) {
            obj = objE;
            j9 = this;
        }
        return aVar;
        java.lang.Integer num2 = (java.lang.Integer) obj;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            e6.f13340h = j9;
            e6.f13341i = str2;
            e6.j = null;
            e6.f13342k = null;
            e6.f13345n = 2;
            java.lang.Object objA = j9.a(iIntValue, str, xtreamSeries, e6);
            if (objA != aVar) {
                java.lang.String str6 = str2;
                obj2 = objA;
                str3 = str6;
                c3B = (p005a5.C3) obj2;
            }
            return aVar;
        }
        j9.getClass();
        java.lang.String str7 = str2;
        c3B = b(str, xtreamSeries);
        str3 = str7;
        j9.f13542b.put(str3, c3B);
        return c3B;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [i6.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    public final java.lang.Object d(java.lang.Integer num, int i3, p117n6.c cVar) {
        p005a5.H3 h9;
        p005a5.J3 j9;
        java.lang.String str;
        int i9;
        ?? arrayList;
        if (cVar instanceof p005a5.H3) {
            h9 = (p005a5.H3) cVar;
            int i10 = h9.f13469m;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h9.f13469m = i10 - Integer.MIN_VALUE;
            } else {
                h9 = new p005a5.H3(this, cVar);
            }
        } else {
            h9 = new p005a5.H3(this, cVar);
        }
        java.lang.Object obj = h9.f13467k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = h9.f13469m;
        ?? r9 = p078i6.w.f23205h;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (num == null) {
                return r9;
            }
            java.lang.String str2 = num + "_s" + i3;
            java.util.List list = (java.util.List) this.f13543c.get(str2);
            if (list != null) {
                return list;
            }
            try {
                p005a5.C1451x5 c1451x5 = this.f13541a;
                int iIntValue = num.intValue();
                h9.f13465h = this;
                h9.f13466i = str2;
                h9.j = i3;
                h9.f13469m = 1;
                java.lang.Object objV = c1451x5.v(iIntValue, i3, h9);
                if (objV == aVar) {
                    return aVar;
                }
                obj = objV;
                i9 = i3;
                str = str2;
                j9 = this;
            } catch (java.lang.Exception unused) {
                j9 = this;
                str = str2;
            }
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = h9.j;
            str = h9.f13466i;
            j9 = h9.f13465h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
            } catch (java.lang.Exception unused2) {
            }
        }
        java.util.List<com.kiptv.core.model.TMDBEpisode> list2 = ((com.kiptv.core.model.TMDBSeasonDetail) obj).f20312f;
        if (list2 != null) {
            arrayList = new java.util.ArrayList(p078i6.q.I0(list2, 10));
            for (com.kiptv.core.model.TMDBEpisode tMDBEpisode : list2) {
                java.lang.Integer num2 = tMDBEpisode.f20162d;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                java.lang.Integer num3 = tMDBEpisode.f20163e;
                int iIntValue3 = num3 != null ? num3.intValue() : i9;
                java.lang.String str3 = tMDBEpisode.f20160b;
                java.lang.String str4 = tMDBEpisode.f20161c;
                java.lang.String str5 = tMDBEpisode.f20164f;
                arrayList.add(new S4.C0875n(iIntValue2, iIntValue3, str3, str4, str5 != null ? "https://image.tmdb.org/t/p/w780" + str5 : null, tMDBEpisode.g, tMDBEpisode.f20165h, tMDBEpisode.f20166i, S4.r.f9437h));
            }
        } else {
            arrayList = r9;
        }
        S4.C0875n c0875n = (S4.C0875n) p078i6.o.j1(p078i6.o.I1(arrayList, new p005a5.B(15)));
        int i12 = c0875n != null ? c0875n.f9417a : 1;
        int i13 = i12 > 1 ? i12 - 1 : 0;
        if (i13 > 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
            for (S4.C0875n c0875n2 : arrayList) {
                arrayList2.add(new S4.C0875n(c0875n2.f9417a - i13, c0875n2.f9418b, c0875n2.f9419c, c0875n2.f9420d, c0875n2.f9421e, c0875n2.f9422f, c0875n2.g, c0875n2.f9423h, c0875n2.f9424i));
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object e(java.lang.String str, java.lang.Integer num, com.kiptv.core.model.XtreamSeries xtreamSeries, p117n6.c cVar) {
        p005a5.I3 i3;
        java.lang.Integer numE;
        if (cVar instanceof p005a5.I3) {
            i3 = (p005a5.I3) cVar;
            int i9 = i3.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                i3.j = i9 - Integer.MIN_VALUE;
            } else {
                i3 = new p005a5.I3(this, cVar);
            }
        } else {
            i3 = new p005a5.I3(this, cVar);
        }
        p005a5.I3 i10 = i3;
        java.lang.Object objI = i10.f13505h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i11 = i10.j;
        if (i11 == 0) {
            com.google.common.util.concurrent.P.u0(objI);
            if (num != null) {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    return new java.lang.Integer(num.intValue());
                }
            }
            if (xtreamSeries != null && (numE = xtreamSeries.e()) != null) {
                return new java.lang.Integer(numE.intValue());
            }
            if (this.f13541a.D()) {
                java.lang.String str2 = xtreamSeries != null ? xtreamSeries.f20694o : null;
                i10.j = 1;
                objI = p005a5.C1451x5.i(this.f13541a, str, null, str2, false, i10, 10);
                if (objI == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.common.util.concurrent.P.u0(objI);
        com.kiptv.core.model.p0 p0Var = (com.kiptv.core.model.p0) objI;
        if (p0Var != null) {
            return new java.lang.Integer(p0Var.f20815a);
        }
        return null;
    }
}
