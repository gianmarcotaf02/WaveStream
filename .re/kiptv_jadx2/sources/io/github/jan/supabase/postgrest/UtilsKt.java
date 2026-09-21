package io.github.jan.supabase.postgrest;

import O7.o;
import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.D;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a7\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005\"\u0006\b\u0000\u0010\u0003\u0018\u0001H\u0087\b¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "camelToSnakeCase", "(Ljava/lang/String;)Ljava/lang/String;", "T", "", "", "mapToFirstValue", "(Ljava/util/Map;)Ljava/util/Map;", "classPropertyNames", "()Ljava/util/List;", "LO7/o;", "SNAKE_CASE_REGEX", "LO7/o;", "postgrest-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UtilsKt {
    private static final o SNAKE_CASE_REGEX = new o("([a-z0-9])([A-Z])");

    @SupabaseInternal
    public static final String camelToSnakeCase(String str) {
        m.e(str, "<this>");
        String lowerCase = SNAKE_CASE_REGEX.e(str, "$1_$2").toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @SupabaseInternal
    public static final <T> List<String> classPropertyNames() {
        m.j();
        throw null;
    }

    public static final <T> Map<T, T> mapToFirstValue(Map<T, ? extends List<? extends T>> map) {
        m.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.I0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), p078i6.o.h1((List) entry.getValue()));
        }
        return linkedHashMap;
    }
}
