package io.github.jan.supabase.postgrest.query;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import io.sentry.protocol.ViewHierarchyNode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Returning;", "", ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "<init>", "(Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "Minimal", "Representation", "Lio/github/jan/supabase/postgrest/query/Returning$Minimal;", "Lio/github/jan/supabase/postgrest/query/Returning$Representation;", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class Returning {
    private final String identifier;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Returning$Minimal;", "Lio/github/jan/supabase/postgrest/query/Returning;", "<init>", "()V", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Minimal extends Returning {
        public static final Minimal INSTANCE = new Minimal();

        private Minimal() {
            super("minimal", null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Minimal);
        }

        public int hashCode() {
            return -1374471108;
        }

        public String toString() {
            return "Minimal";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Returning$Representation;", "Lio/github/jan/supabase/postgrest/query/Returning;", "Lio/github/jan/supabase/postgrest/query/Columns;", "columns", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "component1-U9NzzuM", "()Ljava/lang/String;", "component1", "copy-fYsiLaM", "(Ljava/lang/String;)Lio/github/jan/supabase/postgrest/query/Returning$Representation;", "copy", "", "toString", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColumns-U9NzzuM", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Representation extends Returning {
        private final String columns;

        public Representation(String str, AbstractC2541f abstractC2541f) {
            this(str);
        }

        public static Representation m309copyfYsiLaM$default(Representation representation, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = representation.columns;
            }
            return representation.m311copyfYsiLaM(str);
        }

        public final String getColumns() {
            return this.columns;
        }

        public final Representation m311copyfYsiLaM(String columns) {
            m.e(columns, "columns");
            return new Representation(columns, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Representation) && Columns.m295equalsimpl0(this.columns, ((Representation) other).columns);
        }

        public final String m312getColumnsU9NzzuM() {
            return this.columns;
        }

        public int hashCode() {
            return Columns.m296hashCodeimpl(this.columns);
        }

        public String toString() {
            return "Representation(columns=" + ((Object) Columns.m297toStringimpl(this.columns)) + ')';
        }

        private Representation(String columns) {
            super("representation", null);
            m.e(columns, "columns");
            this.columns = columns;
        }

        public Representation(String str, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? Columns.INSTANCE.m299getALLU9NzzuM() : str, null);
        }
    }

    public Returning(String str, AbstractC2541f abstractC2541f) {
        this(str);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    private Returning(String str) {
        this.identifier = str;
    }
}
