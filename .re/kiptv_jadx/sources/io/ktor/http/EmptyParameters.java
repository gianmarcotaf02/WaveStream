package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lio/ktor/http/EmptyParameters;", "Lio/ktor/http/Parameters;", "<init>", "()V", "", "name", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "entries", "", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "getCaseInsensitiveName", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EmptyParameters implements io.ktor.http.Parameters {
    public static final io.ktor.http.EmptyParameters INSTANCE = new io.ktor.http.EmptyParameters();

    private EmptyParameters() {
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String str) {
        return io.ktor.http.Parameters.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return p078i6.y.f23207h;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof io.ktor.http.Parameters) && ((io.ktor.http.Parameters) other).isEmpty();
    }

    @Override // io.ktor.util.StringValues
    public void forEach(p194x6.m mVar) {
        io.ktor.http.Parameters.DefaultImpls.forEach(this, mVar);
    }

    @Override // io.ktor.util.StringValues
    public java.lang.String get(java.lang.String str) {
        return io.ktor.http.Parameters.DefaultImpls.get(this, str);
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
        return "Parameters " + entries();
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String str, java.lang.String str2) {
        return io.ktor.http.Parameters.DefaultImpls.contains(this, str, str2);
    }
}
