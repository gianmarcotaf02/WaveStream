package io.github.jan.supabase.postgrest;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "V", "LE6/t;", "property", "", "getSerialName", "(LE6/t;)Ljava/lang/String;", "postgrest-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GetColumnNameKt {
    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final <T, V> java.lang.String getSerialName(E6.t property) {
        T next;
        java.lang.String strValue;
        kotlin.jvm.internal.m.e(property, "property");
        java.util.Iterator<T> it = property.getAnnotations().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((java.lang.annotation.Annotation) next) instanceof p119n8.h));
        p119n8.h hVar = (p119n8.h) next;
        return (hVar == null || (strValue = hVar.value()) == null) ? property.getName() : strValue;
    }
}
