package io.ktor.http;

import D6.j;
import androidx.media3.container.NalUnitUtil;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.date.GMTDateParser;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"LD6/j;", "range", "", "fullLength", "Lio/ktor/http/RangeUnits;", "unit", "", "contentRangeHeaderValue", "(LD6/j;Ljava/lang/Long;Lio/ktor/http/RangeUnits;)Ljava/lang/String;", "(LD6/j;Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContentRangeKt {
    public static final String contentRangeHeaderValue(j jVar, Long l2, RangeUnits unit) {
        m.e(unit, "unit");
        return contentRangeHeaderValue(jVar, l2, unit.getUnitToken());
    }

    public static String contentRangeHeaderValue$default(j jVar, Long l2, RangeUnits rangeUnits, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            l2 = null;
        }
        if ((i3 & 4) != 0) {
            rangeUnits = RangeUnits.Bytes;
        }
        return contentRangeHeaderValue(jVar, l2, rangeUnits);
    }

    public static final String contentRangeHeaderValue(j jVar, Long l2, String unit) {
        m.e(unit, "unit");
        StringBuilder sb = new StringBuilder();
        sb.append(unit);
        sb.append(ServerSentEventKt.SPACE);
        if (jVar != null) {
            sb.append(jVar.f2464h);
            sb.append('-');
            sb.append(jVar.f2465i);
        } else {
            sb.append(GMTDateParser.ANY);
        }
        sb.append('/');
        Object obj = l2;
        if (l2 == null) {
            obj = "*";
        }
        sb.append(obj);
        return sb.toString();
    }

    public static String contentRangeHeaderValue$default(j jVar, Long l2, String str, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            l2 = null;
        }
        if ((i3 & 4) != 0) {
            str = RangeUnits.Bytes.getUnitToken();
        }
        return contentRangeHeaderValue(jVar, l2, str);
    }
}
