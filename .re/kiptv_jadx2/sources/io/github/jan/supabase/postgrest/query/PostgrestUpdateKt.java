package io.github.jan.supabase.postgrest.query;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.json.c;
import p194x6.j;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "propertyConversionMethod", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/PostgrestUpdate;", "Lh6/A;", "block", "Lkotlinx/serialization/json/c;", "buildPostgrestUpdate", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;Lio/github/jan/supabase/SupabaseSerializer;Lx6/j;)Lkotlinx/serialization/json/c;", "postgrest-kt_release"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgrestUpdateKt {
    @SupabaseInternal
    public static final c buildPostgrestUpdate(PropertyConversionMethod propertyConversionMethod, SupabaseSerializer serializer, j block) {
        m.e(propertyConversionMethod, "propertyConversionMethod");
        m.e(serializer, "serializer");
        m.e(block, "block");
        PostgrestUpdate postgrestUpdate = new PostgrestUpdate(propertyConversionMethod, serializer);
        block.invoke(postgrestUpdate);
        return postgrestUpdate.toJson();
    }

    public static c buildPostgrestUpdate$default(PropertyConversionMethod propertyConversionMethod, SupabaseSerializer serializer, j block, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            propertyConversionMethod = PropertyConversionMethod.INSTANCE.getSERIAL_NAME();
        }
        m.e(propertyConversionMethod, "propertyConversionMethod");
        m.e(serializer, "serializer");
        m.e(block, "block");
        PostgrestUpdate postgrestUpdate = new PostgrestUpdate(propertyConversionMethod, serializer);
        block.invoke(postgrestUpdate);
        return postgrestUpdate.toJson();
    }
}
