package io.github.jan.supabase.postgrest;

import E6.t;
import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p119n8.h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "V", "LE6/t;", "property", "", "getSerialName", "(LE6/t;)Ljava/lang/String;", "postgrest-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GetColumnNameKt {
    @SupabaseInternal
    public static final <T, V> String getSerialName(t property) {
        T next;
        String strValue;
        m.e(property, "property");
        Iterator<T> it = property.getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Annotation) next) instanceof h));
        h hVar = (h) next;
        return (hVar == null || (strValue = hVar.value()) == null) ? property.getName() : strValue;
    }
}
