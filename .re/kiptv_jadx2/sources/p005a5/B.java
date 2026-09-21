package p005a5;

import S4.AbstractC0865d;
import S4.C0875n;
import S4.EnumC0866e;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.MyListCustomTag;
import com.kiptv.core.model.TMDBImage;
import com.kiptv.core.model.TMDBPersonSearchResult;
import com.kiptv.core.model.UserDevice;
import com.kiptv.core.model.WatchProgress;
import com.kiptv.core.model.XtreamVODStream;
import java.io.File;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class B implements Comparator {

    public final int f13149h;

    public B(int i3) {
        this.f13149h = i3;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f13149h) {
            case 0:
                String str = ((UserDevice) obj2).g;
                if (str == null) {
                    str = "";
                }
                String str2 = ((UserDevice) obj).g;
                return q0.o(str, str2 != null ? str2 : "");
            case 1:
                return q0.o(Long.valueOf(((EPGProgram) obj).f19741d), Long.valueOf(((EPGProgram) obj2).f19741d));
            case 2:
                return q0.o(Long.valueOf(((EPGProgram) obj2).f19741d), Long.valueOf(((EPGProgram) obj).f19741d));
            case 3:
                return q0.o(Long.valueOf(((EPGProgram) obj).f19741d), Long.valueOf(((EPGProgram) obj2).f19741d));
            case 4:
                return q0.o((Double) ((Map.Entry) obj2).getValue(), (Double) ((Map.Entry) obj).getValue());
            case 5:
                return q0.o((Double) ((Map.Entry) obj2).getValue(), (Double) ((Map.Entry) obj).getValue());
            case 6:
                return q0.o(((WatchProgress) obj2).f20621n, ((WatchProgress) obj).f20621n);
            case 7:
                return q0.o(Integer.valueOf(((MyListCustomTag) obj).g), Integer.valueOf(((MyListCustomTag) obj2).g));
            case 8:
                return q0.o(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
            case 9:
                return q0.o(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 10:
                Object obj3 = AbstractC0865d.f9364a;
                EnumC0866e enumC0866eK = AbstractC0865d.k(((XtreamVODStream) obj2).f20723b);
                int iValueOf = enumC0866eK != null ? Integer.valueOf(enumC0866eK.ordinal()) : -1;
                EnumC0866e enumC0866eK2 = AbstractC0865d.k(((XtreamVODStream) obj).f20723b);
                return q0.o(iValueOf, enumC0866eK2 != null ? Integer.valueOf(enumC0866eK2.ordinal()) : -1);
            case 11:
                return q0.o(Boolean.valueOf(((C1220a3) obj).f14204d), Boolean.valueOf(((C1220a3) obj2).f14204d));
            case 12:
                return q0.o(Boolean.valueOf(((C1230b3) ((Q2) obj).f13810a).f14245d), Boolean.valueOf(((C1230b3) ((Q2) obj2).f13810a).f14245d));
            case 13:
                Boolean bool = ((TMDBPersonSearchResult) obj).f20271f;
                Boolean bool2 = Boolean.TRUE;
                return q0.o(Boolean.valueOf(m.a(bool, bool2)), Boolean.valueOf(m.a(((TMDBPersonSearchResult) obj2).f20271f, bool2)));
            case 14:
                return q0.o(Boolean.valueOf(((C1240c3) ((Q2) obj).f13810a).f14293d), Boolean.valueOf(((C1240c3) ((Q2) obj2).f13810a).f14293d));
            case 15:
                return q0.o(Integer.valueOf(((C0875n) obj).f9417a), Integer.valueOf(((C0875n) obj2).f9417a));
            case 16:
                Double d4 = ((TMDBImage) obj2).f20185f;
                Double dValueOf = Double.valueOf(d4 != null ? d4.doubleValue() : 0.0d);
                Double d6 = ((TMDBImage) obj).f20185f;
                return q0.o(dValueOf, Double.valueOf(d6 != null ? d6.doubleValue() : 0.0d));
            case 17:
                return q0.o(((WatchProgress) obj2).f20621n, ((WatchProgress) obj).f20621n);
            case 18:
                String str3 = ((j9) obj).f14676b;
                Locale locale = Locale.ROOT;
                String lowerCase = str3.toLowerCase(locale);
                m.d(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((j9) obj2).f14676b.toLowerCase(locale);
                m.d(lowerCase2, "toLowerCase(...)");
                return q0.o(lowerCase, lowerCase2);
            default:
                String str4 = ((j9) obj).f14675a;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str4.toLowerCase(locale2);
                m.d(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = ((j9) obj2).f14675a.toLowerCase(locale2);
                m.d(lowerCase4, "toLowerCase(...)");
                return q0.o(lowerCase3, lowerCase4);
        }
    }
}
