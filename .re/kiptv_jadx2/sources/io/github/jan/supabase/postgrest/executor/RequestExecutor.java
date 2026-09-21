package io.github.jan.supabase.postgrest.executor;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.postgrest.Postgrest;
import io.github.jan.supabase.postgrest.request.PostgrestRequest;
import io.sentry.SentryBaseEvent;
import kotlin.Metadata;
import p100l6.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/executor/RequestExecutor;", "", "Lio/github/jan/supabase/postgrest/Postgrest;", "postgrest", "", "path", "Lio/github/jan/supabase/postgrest/request/PostgrestRequest;", SentryBaseEvent.JsonKeys.REQUEST, "Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "execute", "(Lio/github/jan/supabase/postgrest/Postgrest;Ljava/lang/String;Lio/github/jan/supabase/postgrest/request/PostgrestRequest;Ll6/c;)Ljava/lang/Object;", "Lio/github/jan/supabase/postgrest/executor/RestRequestExecutor;", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RequestExecutor {
    Object execute(Postgrest postgrest, String str, PostgrestRequest postgrestRequest, c cVar);
}
