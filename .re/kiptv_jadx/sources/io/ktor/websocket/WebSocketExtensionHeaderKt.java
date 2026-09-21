package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "value", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "parseWebSocketExtensions", "(Ljava/lang/String;)Ljava/util/List;", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WebSocketExtensionHeaderKt {
    public static final java.util.List<io.ktor.websocket.WebSocketExtensionHeader> parseWebSocketExtensions(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        java.util.List listB1 = O7.q.b1(value, new java.lang.String[]{","}, 0, 6);
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(listB1, 10));
        java.util.Iterator it = listB1.iterator();
        while (it.hasNext()) {
            java.util.List listB2 = O7.q.b1((java.lang.String) it.next(), new java.lang.String[]{";"}, 0, 6);
            java.lang.String string = O7.q.r1((java.lang.String) p078i6.o.h1(listB2)).toString();
            java.util.List listD1 = p078i6.o.d1(listB2, 1);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(listD1, 10));
            java.util.Iterator it2 = listD1.iterator();
            while (it2.hasNext()) {
                arrayList2.add(O7.q.r1((java.lang.String) it2.next()).toString());
            }
            arrayList.add(new io.ktor.websocket.WebSocketExtensionHeader(string, arrayList2));
        }
        return arrayList;
    }
}
