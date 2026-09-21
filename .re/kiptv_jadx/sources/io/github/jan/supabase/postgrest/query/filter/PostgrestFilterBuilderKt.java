package io.github.jan.supabase.postgrest.query.filter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;", "Lkotlin/Function1;", "Lh6/A;", "filter", "", "formatJoiningFilter", "(Lio/github/jan/supabase/postgrest/query/filter/PostgrestFilterBuilder;Lx6/j;)Ljava/lang/String;", "postgrest-kt_release"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PostgrestFilterBuilderKt {
    public static final java.lang.String formatJoiningFilter(io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder, p194x6.j filter) {
        kotlin.jvm.internal.m.e(postgrestFilterBuilder, "<this>");
        kotlin.jvm.internal.m.e(filter, "filter");
        io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder postgrestFilterBuilder2 = new io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilder(postgrestFilterBuilder.getPropertyConversionMethod(), null, true, 2, null);
        filter.invoke(postgrestFilterBuilder2);
        return B2.a.i(')', "(", p078i6.o.o1(p078i6.C.V0(postgrestFilterBuilder2.getParams()), ",", null, null, io.github.jan.supabase.postgrest.query.filter.PostgrestFilterBuilderKt$formatJoiningFilter$formattedFilter$1.INSTANCE, 30));
    }
}
