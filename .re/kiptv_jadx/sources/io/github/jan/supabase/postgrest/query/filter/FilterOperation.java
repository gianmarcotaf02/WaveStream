package io.github.jan.supabase.postgrest.query.filter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;", "", "column", "", "operator", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "value", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;Ljava/lang/Object;)V", "getColumn", "()Ljava/lang/String;", "getOperator", "()Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class FilterOperation {
    private final java.lang.String column;
    private final io.github.jan.supabase.postgrest.query.filter.FilterOperator operator;
    private final java.lang.Object value;

    public FilterOperation(java.lang.String column, io.github.jan.supabase.postgrest.query.filter.FilterOperator operator, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(operator, "operator");
        kotlin.jvm.internal.m.e(value, "value");
        this.column = column;
        this.operator = operator;
        this.value = value;
    }

    public static /* synthetic */ io.github.jan.supabase.postgrest.query.filter.FilterOperation copy$default(io.github.jan.supabase.postgrest.query.filter.FilterOperation filterOperation, java.lang.String str, io.github.jan.supabase.postgrest.query.filter.FilterOperator filterOperator, java.lang.Object obj, int i3, java.lang.Object obj2) {
        if ((i3 & 1) != 0) {
            str = filterOperation.column;
        }
        if ((i3 & 2) != 0) {
            filterOperator = filterOperation.operator;
        }
        if ((i3 & 4) != 0) {
            obj = filterOperation.value;
        }
        return filterOperation.copy(str, filterOperator, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getColumn() {
        return this.column;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final io.github.jan.supabase.postgrest.query.filter.FilterOperator getOperator() {
        return this.operator;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.Object getValue() {
        return this.value;
    }

    public final io.github.jan.supabase.postgrest.query.filter.FilterOperation copy(java.lang.String column, io.github.jan.supabase.postgrest.query.filter.FilterOperator operator, java.lang.Object value) {
        kotlin.jvm.internal.m.e(column, "column");
        kotlin.jvm.internal.m.e(operator, "operator");
        kotlin.jvm.internal.m.e(value, "value");
        return new io.github.jan.supabase.postgrest.query.filter.FilterOperation(column, operator, value);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.postgrest.query.filter.FilterOperation)) {
            return false;
        }
        io.github.jan.supabase.postgrest.query.filter.FilterOperation filterOperation = (io.github.jan.supabase.postgrest.query.filter.FilterOperation) other;
        return kotlin.jvm.internal.m.a(this.column, filterOperation.column) && this.operator == filterOperation.operator && kotlin.jvm.internal.m.a(this.value, filterOperation.value);
    }

    public final java.lang.String getColumn() {
        return this.column;
    }

    public final io.github.jan.supabase.postgrest.query.filter.FilterOperator getOperator() {
        return this.operator;
    }

    public final java.lang.Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.operator.hashCode() + (this.column.hashCode() * 31)) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FilterOperation(column=");
        sb.append(this.column);
        sb.append(", operator=");
        sb.append(this.operator);
        sb.append(", value=");
        return B2.a.n(sb, this.value, ')');
    }
}
