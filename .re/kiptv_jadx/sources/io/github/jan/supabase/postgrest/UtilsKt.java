package io.github.jan.supabase.postgrest;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a7\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\"\u0006\b\u0000\u0010\u0003\u0018\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "camelToSnakeCase", "(Ljava/lang/String;)Ljava/lang/String;", "T", "", "", "mapToFirstValue", "(Ljava/util/Map;)Ljava/util/Map;", "classPropertyNames", "()Ljava/util/List;", "LO7/o;", "SNAKE_CASE_REGEX", "LO7/o;", "postgrest-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    private static final O7.o SNAKE_CASE_REGEX = new O7.o("([a-z0-9])([A-Z])");

    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final java.lang.String camelToSnakeCase(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        java.lang.String lowerCase = SNAKE_CASE_REGEX.e(str, "$1_$2").toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final <T> java.util.List<java.lang.String> classPropertyNames() {
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public static final <T> java.util.Map<T, T> mapToFirstValue(java.util.Map<T, ? extends java.util.List<? extends T>> map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), p078i6.o.h1((java.util.List) entry.getValue()));
        }
        return linkedHashMap;
    }
}
