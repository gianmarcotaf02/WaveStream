package io.github.jan.supabase.storage.resumable;

import B2.a;
import O7.q;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0002¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/storage/resumable/Fingerprint;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "parts", "", "getParts-impl", "(Ljava/lang/String;)Ljava/util/List;", "source", "getSource-impl", "size", "", "getSize-impl", "(Ljava/lang/String;)J", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "Companion", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Fingerprint {

    public static final Companion INSTANCE = new Companion(null);
    public static final int FINGERPRINT_PARTS = 2;
    public static final String FINGERPRINT_SEPARATOR = "::";
    private final String value;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/storage/resumable/Fingerprint$Companion;", "", "<init>", "()V", "FINGERPRINT_PARTS", "", "FINGERPRINT_SEPARATOR", "", "invoke", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "source", "size", "", "invoke-dc9EZ54", "(Ljava/lang/String;J)Ljava/lang/String;", "value", "invoke-3xapfgk", "(Ljava/lang/String;)Ljava/lang/String;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final String m379invoke3xapfgk(String value) {
            m.e(value, "value");
            String strM370constructorimpl = Fingerprint.m370constructorimpl(value);
            if (Fingerprint.m373getPartsimpl(strM370constructorimpl).size() != 2) {
                return null;
            }
            return strM370constructorimpl;
        }

        public final String m380invokedc9EZ54(String source, long size) {
            m.e(source, "source");
            return Fingerprint.m370constructorimpl(source + Fingerprint.FINGERPRINT_SEPARATOR + size);
        }

        private Companion() {
        }
    }

    private Fingerprint(String str) {
        this.value = str;
    }

    public static final Fingerprint m369boximpl(String str) {
        return new Fingerprint(str);
    }

    public static String m370constructorimpl(String str) {
        return str;
    }

    public static boolean m371equalsimpl(String str, Object obj) {
        return (obj instanceof Fingerprint) && m.a(str, ((Fingerprint) obj).m378unboximpl());
    }

    public static final boolean m372equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    public static final List<String> m373getPartsimpl(String str) {
        return q.b1(str, new String[]{FINGERPRINT_SEPARATOR}, 0, 6);
    }

    public static final long m374getSizeimpl(String str) {
        return Long.parseLong(m373getPartsimpl(str).get(1));
    }

    public static final String m375getSourceimpl(String str) {
        return m373getPartsimpl(str).get(0);
    }

    public static int m376hashCodeimpl(String str) {
        return str.hashCode();
    }

    public static String m377toStringimpl(String str) {
        return a.i(')', "Fingerprint(value=", str);
    }

    public boolean equals(Object other) {
        return m371equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m376hashCodeimpl(this.value);
    }

    public String toString() {
        return m377toStringimpl(this.value);
    }

    public final String m378unboximpl() {
        return this.value;
    }
}
