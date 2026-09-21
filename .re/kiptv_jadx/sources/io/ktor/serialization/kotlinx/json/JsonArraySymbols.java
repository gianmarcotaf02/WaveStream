package io.ktor.serialization.kotlinx.json;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lio/ktor/serialization/kotlinx/json/JsonArraySymbols;", "", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "<init>", "(Ljava/nio/charset/Charset;)V", "", "beginArray", "[B", "getBeginArray", "()[B", "endArray", "getEndArray", "objectSeparator", "getObjectSeparator", "ktor-serialization-kotlinx-json"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class JsonArraySymbols {
    private final byte[] beginArray;
    private final byte[] endArray;
    private final byte[] objectSeparator;

    public JsonArraySymbols(java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(charset, "charset");
        this.beginArray = io.ktor.utils.io.core.StringsKt.toByteArray("[", charset);
        this.endArray = io.ktor.utils.io.core.StringsKt.toByteArray("]", charset);
        this.objectSeparator = io.ktor.utils.io.core.StringsKt.toByteArray(",", charset);
    }

    public final byte[] getBeginArray() {
        return this.beginArray;
    }

    public final byte[] getEndArray() {
        return this.endArray;
    }

    public final byte[] getObjectSeparator() {
        return this.objectSeparator;
    }
}
