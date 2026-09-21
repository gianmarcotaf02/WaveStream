package io.ktor.http;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import p078i6.y;
import p194x6.m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\f0\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lio/ktor/http/EmptyParameters;", "Lio/ktor/http/Parameters;", "<init>", "()V", "", "name", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "entries", "", "isEmpty", "()Z", "toString", "()Ljava/lang/String;", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "getCaseInsensitiveName", "caseInsensitiveName", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EmptyParameters implements Parameters {
    public static final EmptyParameters INSTANCE = new EmptyParameters();

    private EmptyParameters() {
    }

    @Override
    public boolean contains(String str) {
        return Parameters.DefaultImpls.contains(this, str);
    }

    @Override
    public Set<Map.Entry<String, List<String>>> entries() {
        return y.f23207h;
    }

    public boolean equals(Object other) {
        return (other instanceof Parameters) && ((Parameters) other).isEmpty();
    }

    @Override
    public void forEach(m mVar) {
        Parameters.DefaultImpls.forEach(this, mVar);
    }

    @Override
    public String get(String str) {
        return Parameters.DefaultImpls.get(this, str);
    }

    @Override
    public List<String> getAll(String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return null;
    }

    @Override
    public boolean getCaseInsensitiveName() {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Set<String> names() {
        return y.f23207h;
    }

    public String toString() {
        return "Parameters " + entries();
    }

    @Override
    public boolean contains(String str, String str2) {
        return Parameters.DefaultImpls.contains(this, str, str2);
    }
}
