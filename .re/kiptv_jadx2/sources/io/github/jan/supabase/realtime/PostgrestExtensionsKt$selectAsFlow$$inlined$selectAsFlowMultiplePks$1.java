package io.github.jan.supabase.realtime;

import E6.t;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class PostgrestExtensionsKt$selectAsFlow$$inlined$selectAsFlowMultiplePks$1 implements j {
    final t $primaryKey;

    public PostgrestExtensionsKt$selectAsFlow$$inlined$selectAsFlowMultiplePks$1(t tVar) {
        this.$primaryKey = tVar;
    }

    @Override
    public final String invoke(Data it) {
        m.e(it, "it");
        return String.valueOf(this.$primaryKey.get(it));
    }
}
