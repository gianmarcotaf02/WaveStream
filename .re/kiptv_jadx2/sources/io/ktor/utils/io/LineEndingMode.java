package io.ktor.utils.io;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import p078i6.p;

@InternalAPI
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0018"}, d2 = {"Lio/ktor/utils/io/LineEndingMode;", "", "", "mode", "constructor-impl", "(I)I", Request.JsonKeys.OTHER, "", "contains-lTjpP64", "(II)Z", "contains", "plus-1Ter-O4", "(II)I", "plus", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "Companion", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LineEndingMode {
    private static final int Any;
    private static final int CR;
    private static final int CRLF;

    public static final Companion INSTANCE = new Companion(null);
    private static final int LF;
    private static final List<LineEndingMode> values;
    private final int mode;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/utils/io/LineEndingMode$Companion;", "", "<init>", "()V", "Lio/ktor/utils/io/LineEndingMode;", "CR", "I", "getCR-f0jXZW8", "()I", "LF", "getLF-f0jXZW8", "CRLF", "getCRLF-f0jXZW8", "Any", "getAny-f0jXZW8", "", "values", "Ljava/util/List;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final int m491getAnyf0jXZW8() {
            return LineEndingMode.Any;
        }

        public final int m492getCRf0jXZW8() {
            return LineEndingMode.CR;
        }

        public final int m493getCRLFf0jXZW8() {
            return LineEndingMode.CRLF;
        }

        public final int m494getLFf0jXZW8() {
            return LineEndingMode.LF;
        }

        private Companion() {
        }
    }

    static {
        int iM483constructorimpl = m483constructorimpl(1);
        CR = iM483constructorimpl;
        int iM483constructorimpl2 = m483constructorimpl(2);
        LF = iM483constructorimpl2;
        int iM483constructorimpl3 = m483constructorimpl(4);
        CRLF = iM483constructorimpl3;
        Any = m483constructorimpl(7);
        values = p.B0(m482boximpl(iM483constructorimpl), m482boximpl(iM483constructorimpl2), m482boximpl(iM483constructorimpl3));
    }

    private LineEndingMode(int i3) {
        this.mode = i3;
    }

    public static final LineEndingMode m482boximpl(int i3) {
        return new LineEndingMode(i3);
    }

    private static int m483constructorimpl(int i3) {
        return i3;
    }

    public static final boolean m484containslTjpP64(int i3, int i9) {
        return (i9 | i3) == i3;
    }

    public static boolean m485equalsimpl(int i3, Object obj) {
        return (obj instanceof LineEndingMode) && i3 == ((LineEndingMode) obj).getMode();
    }

    public static final boolean m486equalsimpl0(int i3, int i9) {
        return i3 == i9;
    }

    public static int m487hashCodeimpl(int i3) {
        return Integer.hashCode(i3);
    }

    public static final int m488plus1TerO4(int i3, int i9) {
        return m483constructorimpl(i3 | i9);
    }

    public static String m489toStringimpl(int i3) {
        if (m486equalsimpl0(i3, CR)) {
            return "CR";
        }
        if (m486equalsimpl0(i3, LF)) {
            return "LF";
        }
        if (m486equalsimpl0(i3, CRLF)) {
            return "CRLF";
        }
        List<LineEndingMode> list = values;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m484containslTjpP64(i3, ((LineEndingMode) obj).getMode())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public boolean equals(Object other) {
        return m485equalsimpl(this.mode, other);
    }

    public int hashCode() {
        return m487hashCodeimpl(this.mode);
    }

    public String toString() {
        return m489toStringimpl(this.mode);
    }

    public final int getMode() {
        return this.mode;
    }
}
