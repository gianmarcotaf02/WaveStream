package io.ktor.client.plugins.contentnegotiation;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "LE6/d;", "DefaultIgnoredTypes", "Ljava/util/Set;", "getDefaultIgnoredTypes", "()Ljava/util/Set;", "ktor-client-content-negotiation"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultIgnoredTypesJvmKt {
    private static final java.util.Set<E6.InterfaceC0331d> DefaultIgnoredTypes;

    static {
        E6.InterfaceC0331d[] interfaceC0331dArr = {kotlin.jvm.internal.B.f24540a.b(java.io.InputStream.class)};
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(p078i6.D.I0(1));
        p078i6.m.D0(interfaceC0331dArr, linkedHashSet);
        DefaultIgnoredTypes = linkedHashSet;
    }

    public static final java.util.Set<E6.InterfaceC0331d> getDefaultIgnoredTypes() {
        return DefaultIgnoredTypes;
    }
}
