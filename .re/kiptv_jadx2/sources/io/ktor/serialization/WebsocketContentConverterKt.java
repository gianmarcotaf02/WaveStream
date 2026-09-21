package io.ktor.serialization;

import O7.a;
import androidx.media3.container.NalUnitUtil;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.websocket.Frame;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.c;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00028\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0086H¢\u0006\u0004\b\u0007\u0010\b\u001a2\u0010\n\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u0006\u0010\t\u001a\u00020\u00062\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0086H¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "Lio/ktor/serialization/WebsocketContentConverter;", "value", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "Lio/ktor/websocket/Frame;", "serialize", "(Lio/ktor/serialization/WebsocketContentConverter;Ljava/lang/Object;Ljava/nio/charset/Charset;Ll6/c;)Ljava/lang/Object;", "content", "deserialize", "(Lio/ktor/serialization/WebsocketContentConverter;Lio/ktor/websocket/Frame;Ljava/nio/charset/Charset;Ll6/c;)Ljava/lang/Object;", "ktor-serialization"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WebsocketContentConverterKt {
    public static final <T> Object deserialize(WebsocketContentConverter websocketContentConverter, Frame frame, Charset charset, c cVar) {
        m.j();
        throw null;
    }

    public static Object deserialize$default(WebsocketContentConverter websocketContentConverter, Frame frame, Charset charset, c cVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            a aVar = a.f8023a;
        }
        m.j();
        throw null;
    }

    public static final <T> Object serialize(WebsocketContentConverter websocketContentConverter, T t9, Charset charset, c cVar) {
        m.j();
        throw null;
    }

    public static Object serialize$default(WebsocketContentConverter websocketContentConverter, Object obj, Charset charset, c cVar, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            a aVar = a.f8023a;
        }
        m.j();
        throw null;
    }
}
