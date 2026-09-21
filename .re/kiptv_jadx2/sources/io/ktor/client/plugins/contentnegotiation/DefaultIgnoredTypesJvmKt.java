package io.ktor.client.plugins.contentnegotiation;

import E6.InterfaceC0331d;
import androidx.media3.container.NalUnitUtil;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import p078i6.D;
import p078i6.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "LE6/d;", "DefaultIgnoredTypes", "Ljava/util/Set;", "getDefaultIgnoredTypes", "()Ljava/util/Set;", "ktor-client-content-negotiation"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultIgnoredTypesJvmKt {
    private static final Set<InterfaceC0331d> DefaultIgnoredTypes;

    static {
        InterfaceC0331d[] interfaceC0331dArr = {B.f24540a.b(InputStream.class)};
        LinkedHashSet linkedHashSet = new LinkedHashSet(D.I0(1));
        m.D0(interfaceC0331dArr, linkedHashSet);
        DefaultIgnoredTypes = linkedHashSet;
    }

    public static final Set<InterfaceC0331d> getDefaultIgnoredTypes() {
        return DefaultIgnoredTypes;
    }
}
