package p005a5;

/* JADX INFO: renamed from: a5.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1432v6 {
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    public static com.kiptv.core.model.TMDBSearchResult a(com.kiptv.core.model.TraktMediaFull media, boolean z6) {
        java.lang.Integer num;
        java.lang.String strE;
        java.util.List list;
        java.lang.String str;
        java.util.List list2;
        java.lang.String str2;
        kotlin.jvm.internal.m.e(media, "media");
        java.lang.Integer num2 = media.f20451c.f20412d;
        if (num2 != null) {
            if (num2.intValue() <= 0) {
                num2 = null;
            }
            if (num2 != null) {
                int iIntValue = num2.intValue();
                java.lang.String str3 = media.f20449a;
                if (str3 == null) {
                    str3 = "";
                }
                com.kiptv.core.model.TraktImages traktImages = media.f20457k;
                java.lang.String strConcat = (traktImages == null || (list2 = traktImages.f20415a) == null || (str2 = (java.lang.String) p078i6.o.j1(list2)) == null) ? null : "https://".concat(str2);
                java.lang.String strConcat2 = (traktImages == null || (list = traktImages.f20416b) == null || (str = (java.lang.String) p078i6.o.j1(list)) == null) ? null : "https://".concat(str);
                if (!z6 || (strE = media.g) == null || strE.length() == 0) {
                    if (z6) {
                        num = media.f20450b;
                        if (num != null) {
                            strE = Y6.f.e(num.intValue(), "-01-01");
                        } else {
                            strE = null;
                        }
                    } else {
                        java.lang.String str4 = media.f20455h;
                        if ((str4 != null ? str4.length() : 0) >= 10) {
                            kotlin.jvm.internal.m.b(str4);
                            strE = O7.q.p1(10, str4);
                        } else {
                            num = media.f20450b;
                            if (num != null) {
                                strE = Y6.f.e(num.intValue(), "-01-01");
                            } else {
                                strE = null;
                            }
                        }
                    }
                }
                java.lang.String str5 = strE;
                java.lang.String str6 = z6 ? str3 : null;
                if (z6) {
                    str3 = null;
                }
                return new com.kiptv.core.model.TMDBSearchResult(iIntValue, str6, str3, media.f20452d, strConcat, strConcat2, z6 ? str5 : null, z6 ? null : str5, media.f20453e, media.f20454f, z6 ? "movie" : "tv");
            }
        }
        return null;
    }
}
