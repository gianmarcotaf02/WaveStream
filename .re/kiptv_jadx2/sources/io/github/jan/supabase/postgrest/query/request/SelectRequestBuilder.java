package io.github.jan.supabase.postgrest.query.request;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.github.jan.supabase.postgrest.PropertyConversionMethod;
import io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/request/SelectRequestBuilder;", "Lio/github/jan/supabase/postgrest/query/PostgrestRequestBuilder;", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", TtmlNode.TAG_HEAD, "", "getHead", "()Z", "setHead", "(Z)V", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SelectRequestBuilder extends PostgrestRequestBuilder {
    private boolean head;

    public SelectRequestBuilder(PropertyConversionMethod propertyConversionMethod) {
        super(propertyConversionMethod);
        m.e(propertyConversionMethod, "propertyConversionMethod");
    }

    public final boolean getHead() {
        return this.head;
    }

    public final void setHead(boolean z6) {
        this.head = z6;
    }
}
