package io.github.jan.supabase.postgrest.query;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Columns;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Columns {
    private final String value;

    public static final Companion INSTANCE = new Companion(null);
    private static final String ALL = m293constructorimpl("*");

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0010\"\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0004\b\u0011\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0007J\f\u0010\u0018\u001a\u00020\u000b*\u00020\u000bH\u0002R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Columns$Companion;", "", "<init>", "()V", "ALL", "Lio/github/jan/supabase/postgrest/query/Columns;", "getALL-U9NzzuM", "()Ljava/lang/String;", "Ljava/lang/String;", "raw", "value", "", "raw-Y7uY_Gg", "(Ljava/lang/String;)Ljava/lang/String;", "list", "columns", "", "list-Y7uY_Gg", "([Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/util/List;)Ljava/lang/String;", "type", "T", "type-U9NzzuM", "clean", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private final String clean(String str) {
            Pattern patternCompile = Pattern.compile("\\s");
            m.d(patternCompile, "compile(...)");
            ArrayList arrayList = new ArrayList(str.length());
            boolean z6 = false;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '\"') {
                    z6 = !z6;
                }
                String input = String.valueOf(cCharAt);
                m.e(input, "input");
                arrayList.add((!patternCompile.matcher(input).matches() || z6) ? Character.valueOf(cCharAt) : "");
            }
            return o.o1(arrayList, "", null, null, null, 62);
        }

        public final String m299getALLU9NzzuM() {
            return Columns.ALL;
        }

        public final String m301listY7uY_Gg(String... columns) {
            m.e(columns, "columns");
            return Columns.m293constructorimpl(p078i6.m.v0(columns, ",", null, null, null, 62));
        }

        public final String m302rawY7uY_Gg(String value) {
            m.e(value, "value");
            return Columns.m293constructorimpl(clean(value));
        }

        public final <T> String m303typeU9NzzuM() {
            m.j();
            throw null;
        }

        private Companion() {
        }

        public final String m300listY7uY_Gg(List<String> columns) {
            m.e(columns, "columns");
            return Columns.m293constructorimpl(o.o1(columns, ",", null, null, null, 62));
        }
    }

    private Columns(String str) {
        this.value = str;
    }

    public static final Columns m292boximpl(String str) {
        return new Columns(str);
    }

    public static String m293constructorimpl(String value) {
        m.e(value, "value");
        return value;
    }

    public static boolean m294equalsimpl(String str, Object obj) {
        return (obj instanceof Columns) && m.a(str, ((Columns) obj).m298unboximpl());
    }

    public static final boolean m295equalsimpl0(String str, String str2) {
        return m.a(str, str2);
    }

    public static int m296hashCodeimpl(String str) {
        return str.hashCode();
    }

    public static String m297toStringimpl(String str) {
        return a.i(')', "Columns(value=", str);
    }

    public boolean equals(Object other) {
        return m294equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m296hashCodeimpl(this.value);
    }

    public String toString() {
        return m297toStringimpl(this.value);
    }

    public final String m298unboximpl() {
        return this.value;
    }
}
