package Y4;

import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kiptv.core.model.EPGProgram;
import io.ktor.client.HttpClient;
import io.ktor.http.LinkHeader;
import java.io.FilterInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class V1 {
    public static final S1 Companion = new S1();

    public static final Set f11756b = p078i6.m.F0(new Integer[]{301, 302, 303, 307, 308});

    public static final R1 f11757c;

    public static final R1 f11758d;

    public final HttpClient f11759a;

    static {
        final Q1 q9 = new Q1(0);
        final int i3 = 0;
        f11757c = new ThreadLocal() {
            @Override
            public final Object initialValue() {
                switch (i3) {
                    case 0:
                        break;
                }
                return ((Q1) q9).get();
            }
        };
        final Q1 q10 = new Q1(1);
        final int i9 = 1;
        f11758d = new ThreadLocal() {
            @Override
            public final Object initialValue() {
                switch (i9) {
                    case 0:
                        break;
                }
                return ((Q1) q10).get();
            }
        };
    }

    public V1(HttpClient httpClient) {
        this.f11759a = httpClient;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(Y4.V1 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, p117n6.c r23) {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.V1.a(Y4.V1, java.lang.String, java.lang.String, java.lang.String, java.lang.String, n6.c):java.lang.Object");
    }

    public static P1 b(V1 v6, FilterInputStream filterInputStream) {
        String str;
        int i3;
        Iterator it;
        int size;
        String strF;
        String string;
        String string2;
        String string3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        P4.b bVar = P4.c.f8139b;
        Long l2 = bVar != null ? bVar.f8137e : false ? 93600000L : null;
        P4.b bVar2 = P4.c.f8139b;
        Long l9 = bVar2 != null ? bVar2.f8137e : false ? 216000000L : null;
        v6.getClass();
        String str2 = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Long lValueOf = l2 != null ? Long.valueOf(jCurrentTimeMillis - l2.longValue()) : null;
        Long lValueOf2 = l9 != null ? Long.valueOf(l9.longValue() + jCurrentTimeMillis) : null;
        try {
            try {
                XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
                xmlPullParserFactoryNewInstance.setNamespaceAware(false);
                XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
                xmlPullParserNewPullParser.setInput(filterInputStream, null);
                int eventType = xmlPullParserNewPullParser.getEventType();
                i3 = 0;
                boolean z6 = false;
                boolean z9 = false;
                boolean z10 = false;
                String str3 = null;
                String attributeValue = null;
                String attributeValue2 = null;
                Long lC = null;
                String str4 = null;
                Long lC2 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                try {
                    while (eventType != 1) {
                        Long l10 = lValueOf2;
                        Long l11 = lValueOf;
                        str = str2;
                        i3 = i3;
                        if (eventType == 2) {
                            String name = xmlPullParserNewPullParser.getName();
                            if (name == null) {
                                name = str;
                            }
                            switch (name.hashCode()) {
                                case -968778980:
                                    if (!name.equals("programme")) {
                                        i3 = i3;
                                    } else {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "channel");
                                        lC = c(xmlPullParserNewPullParser.getAttributeValue(null, TtmlNode.START));
                                        lC2 = c(xmlPullParserNewPullParser.getAttributeValue(null, "stop"));
                                        str5 = null;
                                        str6 = null;
                                        str7 = null;
                                        i3 = i3;
                                    }
                                    break;
                                case 3079825:
                                    if (name.equals("desc")) {
                                        if (attributeValue != null) {
                                            z10 = true;
                                        }
                                    }
                                    i3 = i3;
                                    break;
                                case 3226745:
                                    if (name.equals("icon")) {
                                        if (attributeValue2 != null && attributeValue == null && str3 == null) {
                                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(null, "src");
                                            str3 = (attributeValue3 == null || (string2 = O7.q.r1(attributeValue3).toString()) == null || string2.length() <= 0) ? null : string2;
                                        }
                                        if (attributeValue != null && str7 == null) {
                                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(null, "src");
                                            str7 = (attributeValue4 == null || (string = O7.q.r1(attributeValue4).toString()) == null || string.length() <= 0) ? null : string;
                                        }
                                    }
                                    i3 = i3;
                                    break;
                                case 110371416:
                                    if (!name.equals(LinkHeader.Parameters.Title)) {
                                        i3 = i3;
                                    } else if (attributeValue == null) {
                                        i3 = i3;
                                    } else {
                                        i3 = i3;
                                        z9 = true;
                                    }
                                    break;
                                case 738950403:
                                    if (!name.equals("channel")) {
                                        i3 = i3;
                                    } else {
                                        attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "id");
                                        str3 = null;
                                        str4 = null;
                                    }
                                    break;
                                case 1568910518:
                                    if (!name.equals("display-name")) {
                                        i3 = i3;
                                    } else if (attributeValue2 == null) {
                                        i3 = i3;
                                    } else {
                                        i3 = i3;
                                        z6 = true;
                                    }
                                    break;
                                default:
                                    i3 = i3;
                                    break;
                            }
                            eventType = xmlPullParserNewPullParser.next();
                            lValueOf2 = l10;
                            lValueOf = l11;
                            str2 = str;
                        } else if (eventType != 3) {
                            if (eventType == 4) {
                                try {
                                    String text = xmlPullParserNewPullParser.getText();
                                    if (text == null || (string3 = O7.q.r1(text).toString()) == null) {
                                        string3 = str;
                                    }
                                    if (string3.length() > 0) {
                                        if (z6) {
                                            str4 = string3;
                                        } else if (z9) {
                                            str5 = string3;
                                        } else if (z10) {
                                            str6 = string3;
                                        }
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    i3 = i3;
                                    Log.e("XMLTVParser", "XML parsing error: " + e.getMessage());
                                    try {
                                        filterInputStream.close();
                                    } catch (Exception unused) {
                                    }
                                    int size2 = linkedHashMap.size();
                                    it = linkedHashMap2.values().iterator();
                                    size = 0;
                                    while (it.hasNext()) {
                                        size += ((List) it.next()).size();
                                    }
                                    int size3 = linkedHashMap2.size();
                                    if (i3 > 0) {
                                        strF = Y6.f.f(i3, " (dropped ", " outside retention window)");
                                    } else {
                                        strF = str;
                                    }
                                    StringBuilder sbS = p121o0.p.s(size2, size, "XMLTV parsed: ", " channels, ", " programs across ");
                                    sbS.append(size3);
                                    sbS.append(" channel entries");
                                    sbS.append(strF);
                                    Log.i("XMLTVParser", sbS.toString());
                                    return new P1(linkedHashMap, linkedHashMap2);
                                }
                            }
                            i3 = i3;
                            try {
                                eventType = xmlPullParserNewPullParser.next();
                                lValueOf2 = l10;
                                lValueOf = l11;
                                str2 = str;
                            } catch (Exception e9) {
                                e = e9;
                                Log.e("XMLTVParser", "XML parsing error: " + e.getMessage());
                                filterInputStream.close();
                                int size4 = linkedHashMap.size();
                                it = linkedHashMap2.values().iterator();
                                size = 0;
                                while (it.hasNext()) {
                                    size += ((List) it.next()).size();
                                }
                                int size5 = linkedHashMap2.size();
                                if (i3 > 0) {
                                    strF = Y6.f.f(i3, " (dropped ", " outside retention window)");
                                } else {
                                    strF = str;
                                }
                                StringBuilder sbS2 = p121o0.p.s(size4, size, "XMLTV parsed: ", " channels, ", " programs across ");
                                sbS2.append(size5);
                                sbS2.append(" channel entries");
                                sbS2.append(strF);
                                Log.i("XMLTVParser", sbS2.toString());
                                return new P1(linkedHashMap, linkedHashMap2);
                            }
                        } else {
                            String name2 = xmlPullParserNewPullParser.getName();
                            if (name2 != null) {
                                switch (name2.hashCode()) {
                                    case -968778980:
                                        if (!name2.equals("programme")) {
                                            i3 = i3;
                                        } else {
                                            if (attributeValue == null || lC == null || lC2 == null || str5 == null) {
                                                i3 = i3;
                                            } else {
                                                long jLongValue = lC.longValue();
                                                long jLongValue2 = lC2.longValue();
                                                boolean z11 = (l11 != null && jLongValue2 < l11.longValue()) || (l10 != null && jLongValue > l10.longValue());
                                                i3 = z11 ? i3 + 1 : i3;
                                                if (!z11 && jLongValue2 > jLongValue && jLongValue2 - jLongValue <= 43200000) {
                                                    EPGProgram ePGProgram = new EPGProgram(attributeValue + "@" + jLongValue, str5, str6, jLongValue, jLongValue2, str7);
                                                    Object arrayList = linkedHashMap2.get(attributeValue);
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                        linkedHashMap2.put(attributeValue, arrayList);
                                                    }
                                                    List list = (List) arrayList;
                                                    EPGProgram ePGProgram2 = (EPGProgram) p078i6.o.s1(list);
                                                    if (ePGProgram2 == null || jLongValue >= ePGProgram2.f19742e) {
                                                        list.add(ePGProgram);
                                                    }
                                                }
                                            }
                                            attributeValue = null;
                                            lC = null;
                                            lC2 = null;
                                            str5 = null;
                                            str6 = null;
                                            str7 = null;
                                        }
                                        break;
                                    case 3079825:
                                        if (!name2.equals("desc")) {
                                            i3 = i3;
                                        } else {
                                            i3 = i3;
                                            z10 = false;
                                        }
                                        break;
                                    case 110371416:
                                        if (!name2.equals(LinkHeader.Parameters.Title)) {
                                            i3 = i3;
                                        } else {
                                            i3 = i3;
                                            z9 = false;
                                        }
                                        break;
                                    case 738950403:
                                        if (!name2.equals("channel")) {
                                            i3 = i3;
                                        } else {
                                            if (attributeValue2 != null && str4 != null) {
                                                linkedHashMap.put(attributeValue2, new O1(str4, str3));
                                            }
                                            str3 = null;
                                            attributeValue2 = null;
                                            str4 = null;
                                        }
                                        break;
                                    case 1568910518:
                                        if (!name2.equals("display-name")) {
                                            i3 = i3;
                                        } else {
                                            i3 = i3;
                                            z6 = false;
                                        }
                                        break;
                                    default:
                                        i3 = i3;
                                        break;
                                }
                            } else {
                                i3 = i3;
                            }
                            eventType = xmlPullParserNewPullParser.next();
                            lValueOf2 = l10;
                            lValueOf = l11;
                            str2 = str;
                        }
                        int size6 = linkedHashMap.size();
                        it = linkedHashMap2.values().iterator();
                        size = 0;
                        while (it.hasNext()) {
                            size += ((List) it.next()).size();
                        }
                        int size7 = linkedHashMap2.size();
                        if (i3 > 0) {
                            strF = Y6.f.f(i3, " (dropped ", " outside retention window)");
                        } else {
                            strF = str;
                        }
                        StringBuilder sbS3 = p121o0.p.s(size6, size, "XMLTV parsed: ", " channels, ", " programs across ");
                        sbS3.append(size7);
                        sbS3.append(" channel entries");
                        sbS3.append(strF);
                        Log.i("XMLTVParser", sbS3.toString());
                        return new P1(linkedHashMap, linkedHashMap2);
                    }
                    filterInputStream.close();
                } catch (Exception unused2) {
                }
                str = str2;
                int i9 = i3;
                i3 = i9;
            } catch (Throwable th) {
                try {
                    filterInputStream.close();
                } catch (Exception unused3) {
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            str = "";
            i3 = 0;
        }
        int size8 = linkedHashMap.size();
        it = linkedHashMap2.values().iterator();
        size = 0;
        while (it.hasNext()) {
            size += ((List) it.next()).size();
        }
        int size9 = linkedHashMap2.size();
        if (i3 > 0) {
            strF = Y6.f.f(i3, " (dropped ", " outside retention window)");
        } else {
            strF = str;
        }
        StringBuilder sbS4 = p121o0.p.s(size8, size, "XMLTV parsed: ", " channels, ", " programs across ");
        sbS4.append(size9);
        sbS4.append(" channel entries");
        sbS4.append(strF);
        Log.i("XMLTVParser", sbS4.toString());
        return new P1(linkedHashMap, linkedHashMap2);
    }

    public static Long c(String str) {
        if (str == null || O7.q.N0(str)) {
            return null;
        }
        String string = O7.q.r1(str).toString();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f11757c.get();
        if (simpleDateFormat != null) {
            try {
                Date date = simpleDateFormat.parse(string);
                if (date != null) {
                    return Long.valueOf(date.getTime());
                }
                return null;
            } catch (Exception unused) {
            }
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) f11758d.get();
        if (simpleDateFormat2 == null) {
            return null;
        }
        try {
            Date date2 = simpleDateFormat2.parse(string);
            if (date2 != null) {
                return Long.valueOf(date2.getTime());
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
