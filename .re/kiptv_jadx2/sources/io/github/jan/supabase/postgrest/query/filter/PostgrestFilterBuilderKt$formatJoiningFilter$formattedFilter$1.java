package io.github.jan.supabase.postgrest.query.filter;

import O7.x;
import Y6.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.k;
import p078i6.o;
import p194x6.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1 implements j {
    public static final PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1 INSTANCE = new PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1();

    @Override
    public final CharSequence invoke(final k it) {
        m.e(it, "it");
        return o.o1((Iterable) it.f22540i, ",", null, null, new j() {
            @Override
            public final CharSequence invoke(String filter) {
                m.e(filter, "filter");
                boolean z6 = false;
                if (x.x0(filter, "(", false) && x.q0(filter, ")", false)) {
                    z6 = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((String) it.f22539h);
                return f.m(sb, z6 ? "" : ".", filter);
            }
        }, 30);
    }
}
