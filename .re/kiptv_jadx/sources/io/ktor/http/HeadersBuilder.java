package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "Lio/ktor/util/StringValuesBuilderImpl;", "", "size", "<init>", "(I)V", "Lio/ktor/http/Headers;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Lio/ktor/http/Headers;", "", "name", "Lh6/A;", "validateName", "(Ljava/lang/String;)V", "value", "validateValue", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HeadersBuilder extends io.ktor.util.StringValuesBuilderImpl {
    public HeadersBuilder() {
        this(0, 1, null);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public void validateName(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        super.validateName(name);
        io.ktor.http.HttpHeaders.INSTANCE.checkHeaderName(name);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public void validateValue(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
        super.validateValue(value);
        io.ktor.http.HttpHeaders.INSTANCE.checkHeaderValue(value);
    }

    public HeadersBuilder(int i3) {
        super(true, i3);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    public io.ktor.http.Headers build() {
        return new io.ktor.http.HeadersImpl(getValues());
    }

    public /* synthetic */ HeadersBuilder(int i3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? 8 : i3);
    }
}
