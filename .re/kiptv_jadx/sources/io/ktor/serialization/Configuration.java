package io.ktor.serialization;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/serialization/Configuration;", "", "Lio/ktor/serialization/ContentConverter;", "T", "Lio/ktor/http/ContentType;", "contentType", "converter", "Lkotlin/Function1;", "Lh6/A;", "configuration", "register", "(Lio/ktor/http/ContentType;Lio/ktor/serialization/ContentConverter;Lx6/j;)V", "ktor-serialization"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Configuration {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static /* synthetic */ void register$default(io.ktor.serialization.Configuration configuration, io.ktor.http.ContentType contentType, io.ktor.serialization.ContentConverter contentConverter, p194x6.j jVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            }
            if ((i3 & 4) != 0) {
                jVar = new io.ktor.http.b(18);
            }
            configuration.register(contentType, contentConverter, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static p070h6.A register$lambda$0(io.ktor.serialization.ContentConverter contentConverter) {
            kotlin.jvm.internal.m.e(contentConverter, "<this>");
            return p070h6.A.f22523a;
        }
    }

    <T extends io.ktor.serialization.ContentConverter> void register(io.ktor.http.ContentType contentType, T converter, p194x6.j configuration);
}
