package S4;

import C5.O1;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kiptv.core.model.D0;
import com.kiptv.core.model.E0;
import com.kiptv.core.model.F0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class z {

    public static final z f9500a = new z();

    static {
        new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        DateFormat.getDateInstance(2);
    }

    public static String a(o oVar, Map allEpisodeMetadata) {
        Integer numZ0;
        String strE;
        int iIntValue;
        int iIntValue2;
        kotlin.jvm.internal.m.e(allEpisodeMetadata, "allEpisodeMetadata");
        Map map = (Map) allEpisodeMetadata.get(Integer.valueOf(oVar.f9426b));
        C0875n c0875n = map != null ? (C0875n) map.get(Integer.valueOf(oVar.f9428d)) : null;
        Integer num = c0875n != null ? c0875n.f9422f : null;
        if (num != null && num.intValue() > 0) {
            int iIntValue3 = num.intValue() / 60;
            int iIntValue4 = num.intValue() % 60;
            if (iIntValue3 <= 0) {
                return Y6.f.e(iIntValue4, " min");
            }
            return iIntValue3 + "h " + iIntValue4 + CmcdData.OBJECT_TYPE_MANIFEST;
        }
        F0 f9 = oVar.f9427c.f19735e;
        String str = f9 != null ? f9.f19767a : null;
        if (str != null && str.length() != 0) {
            if (O7.q.B0(str, ":", false)) {
                List listB1 = O7.q.b1(str, new String[]{":"}, 0, 6);
                if (listB1.size() >= 2) {
                    Integer numZ1 = O7.x.z0((String) listB1.get(0));
                    int iIntValue5 = numZ1 != null ? numZ1.intValue() : 0;
                    Integer numZ2 = O7.x.z0((String) listB1.get(1));
                    int iIntValue6 = numZ2 != null ? numZ2.intValue() : 0;
                    if (iIntValue5 > 0) {
                        strE = iIntValue5 + "h " + iIntValue6 + CmcdData.OBJECT_TYPE_MANIFEST;
                    } else {
                        strE = Y6.f.e(iIntValue6, CmcdData.OBJECT_TYPE_MANIFEST);
                    }
                } else {
                    numZ0 = O7.x.z0(str);
                    if (numZ0 != null) {
                        iIntValue = numZ0.intValue() / 60;
                        iIntValue2 = numZ0.intValue() % 60;
                        if (iIntValue > 0) {
                            strE = iIntValue + "h " + iIntValue2 + CmcdData.OBJECT_TYPE_MANIFEST;
                        } else {
                            strE = numZ0 + CmcdData.OBJECT_TYPE_MANIFEST;
                        }
                    } else {
                        strE = str;
                    }
                }
            } else {
                numZ0 = O7.x.z0(str);
                if (numZ0 != null) {
                    iIntValue = numZ0.intValue() / 60;
                    iIntValue2 = numZ0.intValue() % 60;
                    if (iIntValue > 0) {
                        strE = iIntValue + "h " + iIntValue2 + CmcdData.OBJECT_TYPE_MANIFEST;
                    } else {
                        strE = numZ0 + CmcdData.OBJECT_TYPE_MANIFEST;
                    }
                } else {
                    strE = str;
                }
            }
            Integer numD = d(str);
            if (numD != null && numD.intValue() >= 5) {
                return strE;
            }
        }
        return null;
    }

    public static String b(o oVar, Map allEpisodeMetadata, String str) {
        String strL;
        int i3 = 0;
        kotlin.jvm.internal.m.e(allEpisodeMetadata, "allEpisodeMetadata");
        int i9 = oVar.f9426b;
        Map map = (Map) allEpisodeMetadata.get(Integer.valueOf(i9));
        int i10 = oVar.f9428d;
        C0875n c0875n = map != null ? (C0875n) map.get(Integer.valueOf(i10)) : null;
        String str2 = c0875n != null ? c0875n.f9419c : null;
        if (str2 == null || str2.length() == 0) {
            strL = B2.a.l("number", String.valueOf(i10), "series.episode");
        } else {
            kotlin.jvm.internal.m.b(c0875n);
            strL = c0875n.f9419c;
            kotlin.jvm.internal.m.b(strL);
        }
        E0.Companion.getClass();
        O7.p[] pVarArr = O7.p.f8061h;
        String strF = new O7.o("S(\\d{1,2})\\s?E(\\d{1,3})", 0).f(strL, new D0(i9, i10, i3));
        if (str != null) {
            String strC = K.c(K.f9329a, str, false, 6);
            if (strC.length() > 0) {
                Locale locale = Locale.ROOT;
                String lowerCase = strF.toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                String lowerCase2 = strC.toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                if (O7.x.x0(lowerCase, lowerCase2, false)) {
                    String string = O7.q.r1(O7.q.u1(O7.q.r1(O7.q.D0(strC.length(), strF)).toString(), '-', 8211, 8212)).toString();
                    if (string.length() > 0) {
                        return string;
                    }
                }
            }
        }
        return strF;
    }

    public static p070h6.k c(int i3, int i9, Map episodes) {
        List list;
        E0 e6;
        Object next;
        kotlin.jvm.internal.m.e(episodes, "episodes");
        Set setKeySet = episodes.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            Integer numZ0 = O7.x.z0((String) it.next());
            if (numZ0 != null) {
                arrayList.add(numZ0);
            }
        }
        List listH1 = p078i6.o.H1(arrayList);
        List list2 = (List) episodes.get(String.valueOf(i3));
        if (list2 != null) {
            Iterator it2 = p078i6.o.I1(list2, new O1(12)).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((E0) next).a() <= i9);
            E0 e9 = (E0) next;
            if (e9 != null) {
                return new p070h6.k(e9, Integer.valueOf(i3));
            }
        }
        Iterator it3 = listH1.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Number) it3.next()).intValue();
            if (iIntValue > i3 && (list = (List) episodes.get(String.valueOf(iIntValue))) != null && (e6 = (E0) p078i6.o.j1(p078i6.o.I1(list, new O1(13)))) != null) {
                return new p070h6.k(e6, Integer.valueOf(iIntValue));
            }
        }
        return new p070h6.k(null, null);
    }

    public static Integer d(String duration) {
        kotlin.jvm.internal.m.e(duration, "duration");
        if (O7.q.B0(duration, ":", false)) {
            List listB1 = O7.q.b1(duration, new String[]{":"}, 0, 6);
            if (listB1.size() >= 2) {
                Integer numZ0 = O7.x.z0((String) listB1.get(0));
                if (numZ0 == null) {
                    return null;
                }
                int iIntValue = numZ0.intValue();
                Integer numZ1 = O7.x.z0((String) listB1.get(1));
                if (numZ1 == null) {
                    return null;
                }
                return Integer.valueOf((iIntValue * 60) + numZ1.intValue());
            }
        }
        return O7.x.z0(duration);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(int r31, java.util.List r32, java.util.Map r33, java.util.Map r34, I5.C0 r35, p117n6.c r36) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.z.e(int, java.util.List, java.util.Map, java.util.Map, I5.C0, n6.c):java.lang.Object");
    }
}
