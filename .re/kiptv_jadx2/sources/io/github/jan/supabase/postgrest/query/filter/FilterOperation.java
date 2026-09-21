package io.github.jan.supabase.postgrest.query.filter;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/postgrest/query/filter/FilterOperation;", "", "column", "", "operator", "Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "value", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;Ljava/lang/Object;)V", "getColumn", "()Ljava/lang/String;", "getOperator", "()Lio/github/jan/supabase/postgrest/query/filter/FilterOperator;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FilterOperation {
    private final String column;
    private final FilterOperator operator;
    private final Object value;

    public FilterOperation(String column, FilterOperator operator, Object value) {
        m.e(column, "column");
        m.e(operator, "operator");
        m.e(value, "value");
        this.column = column;
        this.operator = operator;
        this.value = value;
    }

    public static FilterOperation copy$default(FilterOperation filterOperation, String str, FilterOperator filterOperator, Object obj, int i3, Object obj2) {
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

    public final String getColumn() {
        return this.column;
    }

    public final FilterOperator getOperator() {
        return this.operator;
    }

    public final Object getValue() {
        return this.value;
    }

    public final FilterOperation copy(String column, FilterOperator operator, Object value) {
        m.e(column, "column");
        m.e(operator, "operator");
        m.e(value, "value");
        return new FilterOperation(column, operator, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterOperation)) {
            return false;
        }
        FilterOperation filterOperation = (FilterOperation) other;
        return m.a(this.column, filterOperation.column) && this.operator == filterOperation.operator && m.a(this.value, filterOperation.value);
    }

    public final String getColumn() {
        return this.column;
    }

    public final FilterOperator getOperator() {
        return this.operator;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + ((this.operator.hashCode() + (this.column.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterOperation(column=");
        sb.append(this.column);
        sb.append(", operator=");
        sb.append(this.operator);
        sb.append(", value=");
        return a.n(sb, this.value, ')');
    }
}
