package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class F6 {
    public static final p005a5.C1432v6 Companion = new p005a5.C1432v6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.C1118u1 f13395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1263e6 f13396b;

    public F6(Y4.C1118u1 api, p005a5.C1263e6 account) {
        kotlin.jvm.internal.m.e(api, "api");
        kotlin.jvm.internal.m.e(account, "account");
        this.f13395a = api;
        this.f13396b = account;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0052  */
    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    public static final p005a5.C1442w6 a(p005a5.F6 f9, com.kiptv.core.model.TraktListSummary traktListSummary, boolean z6) {
        java.lang.String str;
        com.kiptv.core.model.TraktIds traktIds;
        java.lang.String str2;
        java.lang.String string;
        java.lang.String str3;
        java.lang.String str4;
        f9.getClass();
        if (z6) {
            str = "me";
        } else {
            com.kiptv.core.model.TraktListUser traktListUser = traktListSummary.f20444h;
            if (traktListUser == null || (traktIds = traktListUser.f20447c) == null || (str2 = traktIds.f20410b) == null) {
                java.lang.String str5 = traktListUser != null ? traktListUser.f20445a : null;
                if (str5 == null) {
                    str = "me";
                } else {
                    str = str5;
                }
            } else {
                str = str2;
            }
        }
        java.lang.Integer num = traktListSummary.g.f20409a;
        if ((num == null || (string = num.toString()) == null) && (string = traktListSummary.g.f20410b) == null) {
            string = "";
        }
        java.lang.String str6 = string;
        com.kiptv.core.model.TraktListUser traktListUser2 = traktListSummary.f20444h;
        if (traktListUser2 == null || (str4 = traktListUser2.f20446b) == null) {
            str3 = traktListUser2 != null ? traktListUser2.f20445a : null;
        } else {
            if (str4.length() <= 0) {
                str4 = null;
            }
            if (str4 == null) {
                str3 = traktListUser2 != null ? traktListUser2.f20445a : null;
            } else {
                str3 = str4;
            }
        }
        return new p005a5.C1442w6(str6, str, traktListSummary.f20438a, str3, traktListSummary.f20442e, traktListSummary.f20443f, kotlin.jvm.internal.m.a(traktListSummary.f20441d, "official"), z6);
    }

    public static final java.util.ArrayList b(p005a5.F6 f9, java.util.List list, boolean z6) {
        com.kiptv.core.model.TMDBSearchResult tMDBSearchResultA;
        f9.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.kiptv.core.model.TraktListItem traktListItem = (com.kiptv.core.model.TraktListItem) it.next();
            com.kiptv.core.model.TraktMediaFull traktMediaFull = z6 ? traktListItem.f20436e : traktListItem.f20437f;
            if (traktMediaFull == null) {
                tMDBSearchResultA = null;
            } else {
                Companion.getClass();
                tMDBSearchResultA = p005a5.C1432v6.a(traktMediaFull, z6);
            }
            if (tMDBSearchResultA != null) {
                arrayList.add(tMDBSearchResultA);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    public final java.lang.Object c(java.lang.String str, p186w5.C c9) {
        java.lang.Object objT;
        int i3;
        int i9;
        java.lang.String string = O7.q.r1(str).toString();
        if (string.length() != 0) {
            kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
            if (O7.x.A0(string) == null) {
                java.lang.String lowerCase = string.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                if (O7.q.B0(lowerCase, "trakt.tv/", false)) {
                    if (!O7.x.x0(string, "http", false)) {
                        string = "https://".concat(string);
                    }
                    try {
                        objT = new java.net.URI(string).getPath();
                    } catch (java.lang.Throwable th) {
                        objT = com.google.common.util.concurrent.P.T(th);
                    }
                    if (objT instanceof p070h6.m) {
                        objT = null;
                    }
                    java.lang.String str2 = (java.lang.String) objT;
                    if (str2 != null) {
                        java.util.List listC1 = O7.q.c1(str2, new char[]{'/'});
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj : listC1) {
                            if (((java.lang.String) obj).length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        int iIndexOf = arrayList.indexOf("lists");
                        if (iIndexOf < 0 || (i3 = iIndexOf + 1) >= arrayList.size()) {
                            string = null;
                        } else {
                            string = (java.lang.String) arrayList.get(i3);
                            int iIndexOf2 = arrayList.indexOf("users");
                            if (iIndexOf2 >= 0 && (i9 = iIndexOf2 + 1) < arrayList.size()) {
                                a2.f24539h = arrayList.get(i9);
                            }
                        }
                        if (string != null) {
                            return d(new p005a5.C6(this, a2, string, null), c9);
                        }
                    }
                } else {
                    string = null;
                    if (string != null) {
                        return d(new p005a5.C6(this, a2, string, null), c9);
                    }
                }
            } else if (string != null) {
                return d(new p005a5.C6(this, a2, string, null), c9);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [a5.F6, int] */
    public final java.lang.Object d(p194x6.m mVar, p100l6.c cVar) throws java.lang.Throwable {
        p005a5.E6 e6;
        p005a5.F6 f9;
        if (cVar instanceof p005a5.E6) {
            e6 = (p005a5.E6) cVar;
            int i3 = e6.f13354l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f13354l = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new p005a5.E6(this, cVar);
            }
        } else {
            e6 = new p005a5.E6(this, cVar);
        }
        java.lang.Object objR = e6.j;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r9 = e6.f13354l;
        try {
            if (r9 == 0) {
                com.google.common.util.concurrent.P.u0(objR);
                e6.f13351h = this;
                e6.f13352i = mVar;
                e6.f13354l = 1;
                objR = this.f13396b.z(e6);
                if (objR != aVar) {
                    f9 = this;
                }
                return aVar;
            }
            if (r9 != 1) {
                if (r9 == 2) {
                    p194x6.m mVar2 = e6.f13352i;
                    com.google.common.util.concurrent.P.u0(objR);
                    return objR;
                }
                if (r9 != 3) {
                    if (r9 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(objR);
                    return objR;
                }
                mVar = (p194x6.m) e6.f13351h;
                com.google.common.util.concurrent.P.u0(objR);
                e6.f13351h = null;
                e6.f13354l = 4;
                java.lang.Object objInvoke = mVar.invoke(objR, e6);
                if (objInvoke == aVar) {
                    return aVar;
                }
                return objInvoke;
            }
            mVar = e6.f13352i;
            f9 = (p005a5.F6) e6.f13351h;
            com.google.common.util.concurrent.P.u0(objR);
            java.lang.String str = (java.lang.String) objR;
            e6.f13351h = f9;
            e6.f13352i = mVar;
            e6.f13354l = 2;
            java.lang.Object objInvoke2 = mVar.invoke(str, e6);
            if (objInvoke2 == aVar) {
                return aVar;
            }
            return objInvoke2;
        } catch (Y4.L1 unused) {
            p005a5.C1263e6 c1263e6 = r9.f13396b;
            e6.f13351h = mVar;
            e6.f13352i = null;
            e6.f13354l = 3;
            objR = c1263e6.r(e6);
            if (objR != aVar) {
            }
        }
    }
}
