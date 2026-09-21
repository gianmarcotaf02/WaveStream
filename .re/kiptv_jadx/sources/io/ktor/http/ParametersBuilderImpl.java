package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/ParametersBuilderImpl;", "Lio/ktor/util/StringValuesBuilderImpl;", "Lio/ktor/http/ParametersBuilder;", "", "size", "<init>", "(I)V", "Lio/ktor/http/Parameters;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Lio/ktor/http/Parameters;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ParametersBuilderImpl extends io.ktor.util.StringValuesBuilderImpl implements io.ktor.http.ParametersBuilder {
    public ParametersBuilderImpl() {
        this(0, 1, null);
    }

    public /* synthetic */ ParametersBuilderImpl(int i3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? 8 : i3);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    public io.ktor.http.Parameters build() {
        return new io.ktor.http.ParametersImpl(getValues());
    }

    public ParametersBuilderImpl(int i3) {
        super(true, i3);
    }
}
