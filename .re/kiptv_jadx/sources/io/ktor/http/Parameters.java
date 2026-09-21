package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/Parameters;", "Lio/ktor/util/StringValues;", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Parameters extends io.ktor.util.StringValues {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.http.Parameters.Companion INSTANCE = io.ktor.http.Parameters.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lio/ktor/http/Parameters$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/ktor/http/ParametersBuilder;", "Lh6/A;", "builder", "Lio/ktor/http/Parameters;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "(Lx6/j;)Lio/ktor/http/Parameters;", "Empty", "Lio/ktor/http/Parameters;", "getEmpty", "()Lio/ktor/http/Parameters;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ io.ktor.http.Parameters.Companion $$INSTANCE = new io.ktor.http.Parameters.Companion();
        private static final io.ktor.http.Parameters Empty = io.ktor.http.EmptyParameters.INSTANCE;

        private Companion() {
        }

        public final io.ktor.http.Parameters build(p194x6.j builder) {
            kotlin.jvm.internal.m.e(builder, "builder");
            io.ktor.http.ParametersBuilder parametersBuilderParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
            builder.invoke(parametersBuilderParametersBuilder$default);
            return parametersBuilderParametersBuilder$default.build();
        }

        public final io.ktor.http.Parameters getEmpty() {
            return Empty;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static boolean contains(io.ktor.http.Parameters parameters, java.lang.String name) {
            kotlin.jvm.internal.m.e(name, "name");
            return io.ktor.util.StringValues.DefaultImpls.contains(parameters, name);
        }

        public static void forEach(io.ktor.http.Parameters parameters, p194x6.m body) {
            kotlin.jvm.internal.m.e(body, "body");
            io.ktor.util.StringValues.DefaultImpls.forEach(parameters, body);
        }

        public static java.lang.String get(io.ktor.http.Parameters parameters, java.lang.String name) {
            kotlin.jvm.internal.m.e(name, "name");
            return io.ktor.util.StringValues.DefaultImpls.get(parameters, name);
        }

        public static boolean contains(io.ktor.http.Parameters parameters, java.lang.String name, java.lang.String value) {
            kotlin.jvm.internal.m.e(name, "name");
            kotlin.jvm.internal.m.e(value, "value");
            return io.ktor.util.StringValues.DefaultImpls.contains(parameters, name, value);
        }
    }
}
