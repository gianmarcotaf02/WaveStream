package io.ktor.http;

import O7.x;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", SubscriberAttributeKt.JSON_NAME_KEY, "value", "encodeContentDispositionAttribute", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ContentDispositionKt {
    public static final String encodeContentDispositionAttribute(String str, String str2) {
        if (!m.a(str, ContentDisposition.Parameters.FileNameAsterisk) || x.x0(str2, "utf-8''", true)) {
            return str2;
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            if (!CodecsKt.getATTRIBUTE_CHARACTERS().contains(Character.valueOf(str2.charAt(i3)))) {
                return p.C("utf-8''", CodecsKt.percentEncode(str2, CodecsKt.getATTRIBUTE_CHARACTERS()));
            }
        }
        return str2;
    }
}
