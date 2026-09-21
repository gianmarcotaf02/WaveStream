package io.github.jan.supabase.postgrest.query.filter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1 implements p194x6.j {
    public static final io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1 INSTANCE = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1();

    @Override // p194x6.j
    public final java.lang.CharSequence invoke(final p070h6.k it) {
        kotlin.jvm.internal.m.e(it, "it");
        return p078i6.o.o1((java.lang.Iterable) it.f22540i, ",", null, null, new p194x6.j() { // from class: io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.1
            @Override // p194x6.j
            public final java.lang.CharSequence invoke(java.lang.String filter) {
                kotlin.jvm.internal.m.e(filter, "filter");
                boolean z6 = false;
                if (O7.x.x0(filter, "(", false) && O7.x.q0(filter, ")", false)) {
                    z6 = true;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.String) it.f22539h);
                return Y6.f.m(sb, z6 ? "" : ".", filter);
            }
        }, 30);
    }
}
