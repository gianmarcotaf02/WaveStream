package io.github.jan.supabase.postgrest.query;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "propertyConversionMethod", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "Lkotlin/Function1;", "Lio/github/jan/supabase/postgrest/query/PostgrestUpdate;", "Lh6/A;", "block", "Lkotlinx/serialization/json/c;", "buildPostgrestUpdate", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;Lio/github/jan/supabase/SupabaseSerializer;Lx6/j;)Lkotlinx/serialization/json/c;", "postgrest-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgrestUpdateKt {
    @io.github.jan.supabase.annotations.SupabaseInternal
    public static final kotlinx.serialization.json.c buildPostgrestUpdate(io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod, io.github.jan.supabase.SupabaseSerializer serializer, p194x6.j block) {
        kotlin.jvm.internal.m.e(propertyConversionMethod, "propertyConversionMethod");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.m.e(block, "block");
        io.github.jan.supabase.postgrest.query.PostgrestUpdate postgrestUpdate = new io.github.jan.supabase.postgrest.query.PostgrestUpdate(propertyConversionMethod, serializer);
        block.invoke(postgrestUpdate);
        return postgrestUpdate.toJson();
    }

    public static /* synthetic */ kotlinx.serialization.json.c buildPostgrestUpdate$default(io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod, io.github.jan.supabase.SupabaseSerializer serializer, p194x6.j block, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            propertyConversionMethod = io.github.jan.supabase.postgrest.PropertyConversionMethod.INSTANCE.getSERIAL_NAME();
        }
        kotlin.jvm.internal.m.e(propertyConversionMethod, "propertyConversionMethod");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.m.e(block, "block");
        io.github.jan.supabase.postgrest.query.PostgrestUpdate postgrestUpdate = new io.github.jan.supabase.postgrest.query.PostgrestUpdate(propertyConversionMethod, serializer);
        block.invoke(postgrestUpdate);
        return postgrestUpdate.toJson();
    }
}
