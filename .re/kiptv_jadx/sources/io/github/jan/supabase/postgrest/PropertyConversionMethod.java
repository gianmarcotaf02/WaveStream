package io.github.jan.supabase.postgrest;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J \u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "", "LE6/t;", "property", "", "invoke", "(LE6/t;)Ljava/lang/String;", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface PropertyConversionMethod {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.postgrest.PropertyConversionMethod.Companion INSTANCE = io.github.jan.supabase.postgrest.PropertyConversionMethod.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/PropertyConversionMethod$Companion;", "", "<init>", "()V", "SERIAL_NAME", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getSERIAL_NAME", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "CAMEL_CASE_TO_SNAKE_CASE", "getCAMEL_CASE_TO_SNAKE_CASE", "NONE", "getNONE", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ io.github.jan.supabase.postgrest.PropertyConversionMethod.Companion $$INSTANCE = new io.github.jan.supabase.postgrest.PropertyConversionMethod.Companion();
        private static final io.github.jan.supabase.postgrest.PropertyConversionMethod SERIAL_NAME = new D1.C0223h(26);
        private static final io.github.jan.supabase.postgrest.PropertyConversionMethod CAMEL_CASE_TO_SNAKE_CASE = new D1.C0223h(27);
        private static final io.github.jan.supabase.postgrest.PropertyConversionMethod NONE = new D1.C0223h(28);

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.String CAMEL_CASE_TO_SNAKE_CASE$lambda$1(E6.t it) {
            kotlin.jvm.internal.m.e(it, "it");
            return io.github.jan.supabase.postgrest.UtilsKt.camelToSnakeCase(it.getName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.String NONE$lambda$2(E6.t it) {
            kotlin.jvm.internal.m.e(it, "it");
            return it.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.String SERIAL_NAME$lambda$0(E6.t it) {
            kotlin.jvm.internal.m.e(it, "it");
            return io.github.jan.supabase.postgrest.GetColumnNameKt.getSerialName(it);
        }

        public final io.github.jan.supabase.postgrest.PropertyConversionMethod getCAMEL_CASE_TO_SNAKE_CASE() {
            return CAMEL_CASE_TO_SNAKE_CASE;
        }

        public final io.github.jan.supabase.postgrest.PropertyConversionMethod getNONE() {
            return NONE;
        }

        public final io.github.jan.supabase.postgrest.PropertyConversionMethod getSERIAL_NAME() {
            if (p078i6.p.B0(io.github.jan.supabase.PlatformTarget.JVM, io.github.jan.supabase.PlatformTarget.ANDROID).contains(io.github.jan.supabase.PlatformTargetKt.getCurrentPlatformTarget())) {
                return SERIAL_NAME;
            }
            throw new java.lang.IllegalStateException("SerialName PropertyConversionMethod is only available on the JVM and ANDROID due to limited reflection on other targets. Use CAMEL_CASE_TO_SNAKE_CASE instead.");
        }
    }

    java.lang.String invoke(E6.t property);
}
