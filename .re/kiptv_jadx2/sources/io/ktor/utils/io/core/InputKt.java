package io.ktor.utils.io.core;

import androidx.media3.container.NalUnitUtil;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.n;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u0019\u0010\f\u001a\u00020\t*\u00060\u0000j\u0002`\u00018F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010\r\"\u00020\u00002\u00020\u0000¨\u0006\u000e"}, d2 = {"Lk8/n;", "Lio/ktor/utils/io/core/Input;", "", "buffer", "", "offset", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "readAvailable", "(Lk8/n;[BII)I", "", "getEndOfInput", "(Lk8/n;)Z", "endOfInput", "Input", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class InputKt {
    public static final boolean getEndOfInput(n nVar) {
        m.e(nVar, "<this>");
        return nVar.o();
    }

    public static final int readAvailable(n nVar, byte[] buffer, int i3, int i9) {
        m.e(nVar, "<this>");
        m.e(buffer, "buffer");
        int iQ = nVar.q(buffer, i3, i9 + i3);
        if (iQ == -1) {
            return 0;
        }
        return iQ;
    }

    public static int readAvailable$default(n nVar, byte[] bArr, int i3, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length - i3;
        }
        return readAvailable(nVar, bArr, i3, i9);
    }
}
