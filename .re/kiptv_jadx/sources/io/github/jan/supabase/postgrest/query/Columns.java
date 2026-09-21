package io.github.jan.supabase.postgrest.query;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Columns;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Columns {
    private final java.lang.String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.postgrest.query.Columns.Companion INSTANCE = new io.github.jan.supabase.postgrest.query.Columns.Companion(null);
    private static final java.lang.String ALL = m293constructorimpl("*");

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0010\"\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u000e\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0004\b\u0011\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0016\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0007J\f\u0010\u0018\u001a\u00020\u000b*\u00020\u000bH\u0002R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Columns$Companion;", "", "<init>", "()V", "ALL", "Lio/github/jan/supabase/postgrest/query/Columns;", "getALL-U9NzzuM", "()Ljava/lang/String;", "Ljava/lang/String;", "raw", "value", "", "raw-Y7uY_Gg", "(Ljava/lang/String;)Ljava/lang/String;", "list", "columns", "", "list-Y7uY_Gg", "([Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/util/List;)Ljava/lang/String;", "type", "T", "type-U9NzzuM", "clean", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private final java.lang.String clean(java.lang.String str) {
            java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("\\s");
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(str.length());
            boolean z6 = false;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '\"') {
                    z6 = !z6;
                }
                java.lang.String input = java.lang.String.valueOf(cCharAt);
                kotlin.jvm.internal.m.e(input, "input");
                arrayList.add((!patternCompile.matcher(input).matches() || z6) ? java.lang.Character.valueOf(cCharAt) : "");
            }
            return p078i6.o.o1(arrayList, "", null, null, null, 62);
        }

        /* JADX INFO: renamed from: getALL-U9NzzuM, reason: not valid java name */
        public final java.lang.String m299getALLU9NzzuM() {
            return io.github.jan.supabase.postgrest.query.Columns.ALL;
        }

        /* JADX INFO: renamed from: list-Y7uY_Gg, reason: not valid java name */
        public final java.lang.String m301listY7uY_Gg(java.lang.String... columns) {
            kotlin.jvm.internal.m.e(columns, "columns");
            return io.github.jan.supabase.postgrest.query.Columns.m293constructorimpl(p078i6.m.v0(columns, ",", null, null, null, 62));
        }

        /* JADX INFO: renamed from: raw-Y7uY_Gg, reason: not valid java name */
        public final java.lang.String m302rawY7uY_Gg(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            return io.github.jan.supabase.postgrest.query.Columns.m293constructorimpl(clean(value));
        }

        /* JADX INFO: renamed from: type-U9NzzuM, reason: not valid java name */
        public final <T> java.lang.String m303typeU9NzzuM() {
            kotlin.jvm.internal.m.j();
            throw null;
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: list-Y7uY_Gg, reason: not valid java name */
        public final java.lang.String m300listY7uY_Gg(java.util.List<java.lang.String> columns) {
            kotlin.jvm.internal.m.e(columns, "columns");
            return io.github.jan.supabase.postgrest.query.Columns.m293constructorimpl(p078i6.o.o1(columns, ",", null, null, null, 62));
        }
    }

    private /* synthetic */ Columns(java.lang.String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ io.github.jan.supabase.postgrest.query.Columns m292boximpl(java.lang.String str) {
        return new io.github.jan.supabase.postgrest.query.Columns(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m293constructorimpl(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m294equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof io.github.jan.supabase.postgrest.query.Columns) && kotlin.jvm.internal.m.a(str, ((io.github.jan.supabase.postgrest.query.Columns) obj).m298unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m295equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.m.a(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m296hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m297toStringimpl(java.lang.String str) {
        return B2.a.i(')', "Columns(value=", str);
    }

    public boolean equals(java.lang.Object other) {
        return m294equalsimpl(this.value, other);
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m296hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m297toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m298unboximpl() {
        return this.value;
    }
}
