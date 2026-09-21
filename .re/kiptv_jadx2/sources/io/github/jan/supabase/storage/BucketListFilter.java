package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.sentry.protocol.OperatingSystem;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p162s8.v;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001d"}, d2 = {"Lio/github/jan/supabase/storage/BucketListFilter;", "", "<init>", "()V", "", "column", "order", "Lh6/A;", "sortBy", "(Ljava/lang/String;Ljava/lang/String;)V", "Lkotlinx/serialization/json/c;", OperatingSystem.JsonKeys.BUILD, "()Lkotlinx/serialization/json/c;", "", "limit", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "setLimit", "(Ljava/lang/Integer;)V", "offset", "getOffset", "setOffset", "search", "Ljava/lang/String;", "getSearch", "()Ljava/lang/String;", "setSearch", "(Ljava/lang/String;)V", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BucketListFilter {
    private String column;
    private Integer limit;
    private Integer offset;
    private String order;
    private String search;

    private static final A build$lambda$5$lambda$4$lambda$3(BucketListFilter bucketListFilter, v putJsonObject) {
        m.e(putJsonObject, "$this$putJsonObject");
        P.m0("column", bucketListFilter.column, putJsonObject);
        P.m0("order", bucketListFilter.order, putJsonObject);
        return A.f22523a;
    }

    @SupabaseInternal
    public final kotlinx.serialization.json.c build() {
        v vVar = new v();
        Integer num = this.limit;
        if (num != null) {
            P.o0(vVar, "limit", Integer.valueOf(num.intValue()));
        }
        Integer num2 = this.offset;
        if (num2 != null) {
            P.o0(vVar, "offset", Integer.valueOf(num2.intValue()));
        }
        String str = this.search;
        if (str != null) {
            P.m0("search", str, vVar);
        }
        if (this.column != null) {
            v vVar2 = new v();
            build$lambda$5$lambda$4$lambda$3(this, vVar2);
            vVar.b("sortBy", vVar2.a());
        }
        return vVar.a();
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final String getSearch() {
        return this.search;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setSearch(String str) {
        this.search = str;
    }

    public final void sortBy(String column, String order) {
        m.e(column, "column");
        m.e(order, "order");
        this.column = column;
        this.order = order;
    }
}
