package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0015"}, d2 = {"Lio/ktor/http/EmptyHeaders;", "Lio/ktor/http/Headers;", "<init>", "()V", "", "name", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "entries", "", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "getCaseInsensitiveName", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class EmptyHeaders implements io.ktor.http.Headers {
    public static final io.ktor.http.EmptyHeaders INSTANCE = new io.ktor.http.EmptyHeaders();

    private EmptyHeaders() {
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String str) {
        return io.ktor.http.Headers.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return p078i6.y.f23207h;
    }

    @Override // io.ktor.util.StringValues
    public void forEach(p194x6.m mVar) {
        io.ktor.http.Headers.DefaultImpls.forEach(this, mVar);
    }

    @Override // io.ktor.util.StringValues
    public java.lang.String get(java.lang.String str) {
        return io.ktor.http.Headers.DefaultImpls.get(this, str);
    }

    @Override // io.ktor.util.StringValues
    public java.util.List<java.lang.String> getAll(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return null;
    }

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.lang.String> names() {
        return p078i6.y.f23207h;
    }

    public java.lang.String toString() {
        return "Headers " + entries();
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String str, java.lang.String str2) {
        return io.ktor.http.Headers.DefaultImpls.contains(this, str, str2);
    }
}
