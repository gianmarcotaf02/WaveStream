package io.github.jan.supabase.postgrest;

import D1.C0223h;
import E6.t;
import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.PlatformTarget;
import io.github.jan.supabase.PlatformTargetKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.p;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J \u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "", "LE6/t;", "property", "", "invoke", "(LE6/t;)Ljava/lang/String;", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface PropertyConversionMethod {

    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/PropertyConversionMethod$Companion;", "", "<init>", "()V", "SERIAL_NAME", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "getSERIAL_NAME", "()Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "CAMEL_CASE_TO_SNAKE_CASE", "getCAMEL_CASE_TO_SNAKE_CASE", "NONE", "getNONE", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();
        private static final PropertyConversionMethod SERIAL_NAME = new C0223h(26);
        private static final PropertyConversionMethod CAMEL_CASE_TO_SNAKE_CASE = new C0223h(27);
        private static final PropertyConversionMethod NONE = new C0223h(28);

        private Companion() {
        }

        public static final String CAMEL_CASE_TO_SNAKE_CASE$lambda$1(t it) {
            m.e(it, "it");
            return UtilsKt.camelToSnakeCase(it.getName());
        }

        public static final String NONE$lambda$2(t it) {
            m.e(it, "it");
            return it.getName();
        }

        public static final String SERIAL_NAME$lambda$0(t it) {
            m.e(it, "it");
            return GetColumnNameKt.getSerialName(it);
        }

        public final PropertyConversionMethod getCAMEL_CASE_TO_SNAKE_CASE() {
            return CAMEL_CASE_TO_SNAKE_CASE;
        }

        public final PropertyConversionMethod getNONE() {
            return NONE;
        }

        public final PropertyConversionMethod getSERIAL_NAME() {
            if (p.B0(PlatformTarget.JVM, PlatformTarget.ANDROID).contains(PlatformTargetKt.getCurrentPlatformTarget())) {
                return SERIAL_NAME;
            }
            throw new IllegalStateException("SerialName PropertyConversionMethod is only available on the JVM and ANDROID due to limited reflection on other targets. Use CAMEL_CASE_TO_SNAKE_CASE instead.");
        }
    }

    String invoke(t property);
}
