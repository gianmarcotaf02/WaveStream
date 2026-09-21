package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/HeadersImpl;", "Lio/ktor/http/Headers;", "Lio/ktor/util/StringValuesImpl;", "", "", "", "values", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HeadersImpl extends io.ktor.util.StringValuesImpl implements io.ktor.http.Headers {
    /* JADX WARN: Multi-variable type inference failed */
    public HeadersImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.ktor.util.StringValuesImpl
    public java.lang.String toString() {
        return "Headers " + entries();
    }

    public /* synthetic */ HeadersImpl(java.util.Map map, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? p078i6.x.f23206h : map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadersImpl(java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> values) {
        super(true, values);
        kotlin.jvm.internal.m.e(values, "values");
    }
}
