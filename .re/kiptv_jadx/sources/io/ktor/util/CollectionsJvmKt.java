package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "", "unmodifiable", "(Ljava/util/Set;)Ljava/util/Set;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CollectionsJvmKt {
    public static final <T> java.util.Set<T> unmodifiable(java.util.Set<? extends T> set) {
        kotlin.jvm.internal.m.e(set, "<this>");
        java.util.Set<T> setUnmodifiableSet = java.util.Collections.unmodifiableSet(set);
        kotlin.jvm.internal.m.d(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }
}
