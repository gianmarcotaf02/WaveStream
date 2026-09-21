package io.github.jan.supabase.postgrest.query.request;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/request/SelectRequestBuilder;", "Lio/github/jan/supabase/postgrest/query/PostgrestRequestBuilder;", "propertyConversionMethod", "Lio/github/jan/supabase/postgrest/PropertyConversionMethod;", "<init>", "(Lio/github/jan/supabase/postgrest/PropertyConversionMethod;)V", androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD, "", "getHead", "()Z", "setHead", "(Z)V", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SelectRequestBuilder extends io.github.jan.supabase.postgrest.query.PostgrestRequestBuilder {
    private boolean head;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectRequestBuilder(io.github.jan.supabase.postgrest.PropertyConversionMethod propertyConversionMethod) {
        super(propertyConversionMethod);
        kotlin.jvm.internal.m.e(propertyConversionMethod, "propertyConversionMethod");
    }

    public final boolean getHead() {
        return this.head;
    }

    public final void setHead(boolean z6) {
        this.head = z6;
    }
}
