package io.ktor.websocket;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.o;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "value", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "parseWebSocketExtensions", "(Ljava/lang/String;)Ljava/util/List;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WebSocketExtensionHeaderKt {
    public static final List<WebSocketExtensionHeader> parseWebSocketExtensions(String value) {
        m.e(value, "value");
        List listB1 = q.b1(value, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(p078i6.q.I0(listB1, 10));
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            List listB2 = q.b1((String) it.next(), new String[]{";"}, 0, 6);
            String string = q.r1((String) o.h1(listB2)).toString();
            List listD1 = o.d1(listB2, 1);
            ArrayList arrayList2 = new ArrayList(p078i6.q.I0(listD1, 10));
            Iterator it2 = listD1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(q.r1((String) it2.next()).toString());
            }
            arrayList.add(new WebSocketExtensionHeader(string, arrayList2));
        }
        return arrayList;
    }
}
