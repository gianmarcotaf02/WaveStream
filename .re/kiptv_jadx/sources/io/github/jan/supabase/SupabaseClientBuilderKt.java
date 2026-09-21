package io.github.jan.supabase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"", "supabaseUrl", "supabaseKey", "Lkotlin/Function1;", "Lio/github/jan/supabase/SupabaseClientBuilder;", "Lh6/A;", "builder", "Lio/github/jan/supabase/SupabaseClient;", "createSupabaseClient", "(Ljava/lang/String;Ljava/lang/String;Lx6/j;)Lio/github/jan/supabase/SupabaseClient;", "supabase-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SupabaseClientBuilderKt {
    public static final io.github.jan.supabase.SupabaseClient createSupabaseClient(java.lang.String supabaseUrl, java.lang.String supabaseKey, p194x6.j builder) {
        kotlin.jvm.internal.m.e(supabaseUrl, "supabaseUrl");
        kotlin.jvm.internal.m.e(supabaseKey, "supabaseKey");
        kotlin.jvm.internal.m.e(builder, "builder");
        io.github.jan.supabase.SupabaseClientBuilder supabaseClientBuilder = new io.github.jan.supabase.SupabaseClientBuilder(supabaseUrl, supabaseKey);
        builder.invoke(supabaseClientBuilder);
        return supabaseClientBuilder.build();
    }
}
