package p005a5;

import O7.q;
import O7.x;
import Y4.C1118u1;
import Y4.L1;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.TMDBSearchResult;
import com.kiptv.core.model.TraktIds;
import com.kiptv.core.model.TraktListItem;
import com.kiptv.core.model.TraktListSummary;
import com.kiptv.core.model.TraktListUser;
import com.kiptv.core.model.TraktMediaFull;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import p100l6.c;
import p109m6.a;
import p186w5.C;

public final class F6 {
    public static final C1432v6 Companion = new C1432v6();

    public final C1118u1 f13395a;

    public final C1263e6 f13396b;

    public F6(C1118u1 api, C1263e6 account) {
        m.e(api, "api");
        m.e(account, "account");
        this.f13395a = api;
        this.f13396b = account;
    }

    public static final C1442w6 a(F6 f9, TraktListSummary traktListSummary, boolean z6) {
        String str;
        TraktIds traktIds;
        String str2;
        String string;
        String str3;
        String str4;
        f9.getClass();
        if (z6) {
            str = "me";
        } else {
            TraktListUser traktListUser = traktListSummary.f20444h;
            if (traktListUser == null || (traktIds = traktListUser.f20447c) == null || (str2 = traktIds.f20410b) == null) {
                String str5 = traktListUser != null ? traktListUser.f20445a : null;
                if (str5 == null) {
                    str = "me";
                } else {
                    str = str5;
                }
            } else {
                str = str2;
            }
        }
        Integer num = traktListSummary.g.f20409a;
        if ((num == null || (string = num.toString()) == null) && (string = traktListSummary.g.f20410b) == null) {
            string = "";
        }
        String str6 = string;
        TraktListUser traktListUser2 = traktListSummary.f20444h;
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
        return new C1442w6(str6, str, traktListSummary.f20438a, str3, traktListSummary.f20442e, traktListSummary.f20443f, m.a(traktListSummary.f20441d, "official"), z6);
    }

    public static final ArrayList b(F6 f9, List list, boolean z6) {
        TMDBSearchResult tMDBSearchResultA;
        f9.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TraktListItem traktListItem = (TraktListItem) it.next();
            TraktMediaFull traktMediaFull = z6 ? traktListItem.f20436e : traktListItem.f20437f;
            if (traktMediaFull == null) {
                tMDBSearchResultA = null;
            } else {
                Companion.getClass();
                tMDBSearchResultA = C1432v6.a(traktMediaFull, z6);
            }
            if (tMDBSearchResultA != null) {
                arrayList.add(tMDBSearchResultA);
            }
        }
        return arrayList;
    }

    public final Object c(String str, C c9) {
        Object objT;
        int i3;
        int i9;
        String string = q.r1(str).toString();
        if (string.length() != 0) {
            A a2 = new A();
            if (x.A0(string) == null) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                m.d(lowerCase, "toLowerCase(...)");
                if (q.B0(lowerCase, "trakt.tv/", false)) {
                    if (!x.x0(string, "http", false)) {
                        string = "https://".concat(string);
                    }
                    try {
                        objT = new URI(string).getPath();
                    } catch (Throwable th) {
                        objT = P.T(th);
                    }
                    if (objT instanceof p070h6.m) {
                        objT = null;
                    }
                    String str2 = (String) objT;
                    if (str2 != null) {
                        List listC1 = q.c1(str2, new char[]{'/'});
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listC1) {
                            if (((String) obj).length() > 0) {
                                arrayList.add(obj);
                            }
                        }
                        int iIndexOf = arrayList.indexOf("lists");
                        if (iIndexOf < 0 || (i3 = iIndexOf + 1) >= arrayList.size()) {
                            string = null;
                        } else {
                            string = (String) arrayList.get(i3);
                            int iIndexOf2 = arrayList.indexOf("users");
                            if (iIndexOf2 >= 0 && (i9 = iIndexOf2 + 1) < arrayList.size()) {
                                a2.f24539h = arrayList.get(i9);
                            }
                        }
                        if (string != null) {
                            return d(new C6(this, a2, string, null), c9);
                        }
                    }
                } else {
                    string = null;
                    if (string != null) {
                        return d(new C6(this, a2, string, null), c9);
                    }
                }
            } else if (string != null) {
                return d(new C6(this, a2, string, null), c9);
            }
        }
        return null;
    }

    public final Object d(p194x6.m mVar, c cVar) throws Throwable {
        E6 e6;
        F6 f9;
        if (cVar instanceof E6) {
            e6 = (E6) cVar;
            int i3 = e6.f13354l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e6.f13354l = i3 - Integer.MIN_VALUE;
            } else {
                e6 = new E6(this, cVar);
            }
        } else {
            e6 = new E6(this, cVar);
        }
        Object objR = e6.j;
        a aVar = a.f25430h;
        ?? r9 = e6.f13354l;
        try {
            if (r9 == 0) {
                P.u0(objR);
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
                    P.u0(objR);
                    return objR;
                }
                if (r9 != 3) {
                    if (r9 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    P.u0(objR);
                    return objR;
                }
                mVar = (p194x6.m) e6.f13351h;
                P.u0(objR);
                e6.f13351h = null;
                e6.f13354l = 4;
                Object objInvoke = mVar.invoke(objR, e6);
                if (objInvoke == aVar) {
                    return aVar;
                }
                return objInvoke;
            }
            mVar = e6.f13352i;
            f9 = (F6) e6.f13351h;
            P.u0(objR);
            String str = (String) objR;
            e6.f13351h = f9;
            e6.f13352i = mVar;
            e6.f13354l = 2;
            Object objInvoke2 = mVar.invoke(str, e6);
            if (objInvoke2 == aVar) {
                return aVar;
            }
            return objInvoke2;
        } catch (L1 unused) {
            C1263e6 c1263e6 = r9.f13396b;
            e6.f13351h = mVar;
            e6.f13352i = null;
            e6.f13354l = 3;
            objR = c1263e6.r(e6);
            if (objR != aVar) {
            }
        }
    }
}
