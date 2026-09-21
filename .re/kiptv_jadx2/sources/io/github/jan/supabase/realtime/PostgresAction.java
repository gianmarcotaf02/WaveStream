package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.plugins.SerializableData;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/plugins/SerializableData;", "", "Lio/github/jan/supabase/realtime/Column;", "getColumns", "()Ljava/util/List;", "columns", "Ld8/d;", "getCommitTimestamp", "()Ld8/d;", "commitTimestamp", "Insert", "Update", "Delete", "Select", "Lio/github/jan/supabase/realtime/PostgresAction$Delete;", "Lio/github/jan/supabase/realtime/PostgresAction$Insert;", "Lio/github/jan/supabase/realtime/PostgresAction$Select;", "Lio/github/jan/supabase/realtime/PostgresAction$Update;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface PostgresAction extends SerializableData {

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction$Delete;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/realtime/HasOldRecord;", "Lkotlinx/serialization/json/c;", "oldRecord", "", "Lio/github/jan/supabase/realtime/Column;", "columns", "Ld8/d;", "commitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "()Ljava/util/List;", "component3", "()Ld8/d;", "component4", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/realtime/PostgresAction$Delete;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getOldRecord", "Ljava/util/List;", "getColumns", "Ld8/d;", "getCommitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Delete implements PostgresAction, HasOldRecord {
        private final List<Column> columns;
        private final p036d8.d commitTimestamp;
        private final kotlinx.serialization.json.c oldRecord;
        private final SupabaseSerializer serializer;

        public Delete(kotlinx.serialization.json.c oldRecord, List<Column> columns, p036d8.d commitTimestamp, SupabaseSerializer serializer) {
            m.e(oldRecord, "oldRecord");
            m.e(columns, "columns");
            m.e(commitTimestamp, "commitTimestamp");
            m.e(serializer, "serializer");
            this.oldRecord = oldRecord;
            this.columns = columns;
            this.commitTimestamp = commitTimestamp;
            this.serializer = serializer;
        }

        public static Delete copy$default(Delete delete, kotlinx.serialization.json.c cVar, List list, p036d8.d dVar, SupabaseSerializer supabaseSerializer, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                cVar = delete.oldRecord;
            }
            if ((i3 & 2) != 0) {
                list = delete.columns;
            }
            if ((i3 & 4) != 0) {
                dVar = delete.commitTimestamp;
            }
            if ((i3 & 8) != 0) {
                supabaseSerializer = delete.serializer;
            }
            return delete.copy(cVar, list, dVar, supabaseSerializer);
        }

        public final kotlinx.serialization.json.c getOldRecord() {
            return this.oldRecord;
        }

        public final List<Column> component2() {
            return this.columns;
        }

        public final p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        public final SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final Delete copy(kotlinx.serialization.json.c oldRecord, List<Column> columns, p036d8.d commitTimestamp, SupabaseSerializer serializer) {
            m.e(oldRecord, "oldRecord");
            m.e(columns, "columns");
            m.e(commitTimestamp, "commitTimestamp");
            m.e(serializer, "serializer");
            return new Delete(oldRecord, columns, commitTimestamp, serializer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Delete)) {
                return false;
            }
            Delete delete = (Delete) other;
            return m.a(this.oldRecord, delete.oldRecord) && m.a(this.columns, delete.columns) && m.a(this.commitTimestamp, delete.commitTimestamp) && m.a(this.serializer, delete.serializer);
        }

        @Override
        public List<Column> getColumns() {
            return this.columns;
        }

        @Override
        public p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        @Override
        public kotlinx.serialization.json.c getOldRecord() {
            return this.oldRecord;
        }

        @Override
        public SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode() + ((this.commitTimestamp.f21303h.hashCode() + B2.a.b(this.oldRecord.f24558h.hashCode() * 31, 31, this.columns)) * 31);
        }

        public String toString() {
            return "Delete(oldRecord=" + this.oldRecord + ", columns=" + this.columns + ", commitTimestamp=" + this.commitTimestamp + ", serializer=" + this.serializer + ')';
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction$Insert;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/realtime/HasRecord;", "Lkotlinx/serialization/json/c;", "record", "", "Lio/github/jan/supabase/realtime/Column;", "columns", "Ld8/d;", "commitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "()Ljava/util/List;", "component3", "()Ld8/d;", "component4", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/realtime/PostgresAction$Insert;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getRecord", "Ljava/util/List;", "getColumns", "Ld8/d;", "getCommitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Insert implements PostgresAction, HasRecord {
        private final List<Column> columns;
        private final p036d8.d commitTimestamp;
        private final kotlinx.serialization.json.c record;
        private final SupabaseSerializer serializer;

        public Insert(kotlinx.serialization.json.c record, List<Column> columns, p036d8.d commitTimestamp, SupabaseSerializer serializer) {
            m.e(record, "record");
            m.e(columns, "columns");
            m.e(commitTimestamp, "commitTimestamp");
            m.e(serializer, "serializer");
            this.record = record;
            this.columns = columns;
            this.commitTimestamp = commitTimestamp;
            this.serializer = serializer;
        }

        public static Insert copy$default(Insert insert, kotlinx.serialization.json.c cVar, List list, p036d8.d dVar, SupabaseSerializer supabaseSerializer, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                cVar = insert.record;
            }
            if ((i3 & 2) != 0) {
                list = insert.columns;
            }
            if ((i3 & 4) != 0) {
                dVar = insert.commitTimestamp;
            }
            if ((i3 & 8) != 0) {
                supabaseSerializer = insert.serializer;
            }
            return insert.copy(cVar, list, dVar, supabaseSerializer);
        }

        public final kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        public final List<Column> component2() {
            return this.columns;
        }

        public final p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        public final SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final Insert copy(kotlinx.serialization.json.c record, List<Column> columns, p036d8.d commitTimestamp, SupabaseSerializer serializer) {
            m.e(record, "record");
            m.e(columns, "columns");
            m.e(commitTimestamp, "commitTimestamp");
            m.e(serializer, "serializer");
            return new Insert(record, columns, commitTimestamp, serializer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) other;
            return m.a(this.record, insert.record) && m.a(this.columns, insert.columns) && m.a(this.commitTimestamp, insert.commitTimestamp) && m.a(this.serializer, insert.serializer);
        }

        @Override
        public List<Column> getColumns() {
            return this.columns;
        }

        @Override
        public p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        @Override
        public kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        @Override
        public SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode() + ((this.commitTimestamp.f21303h.hashCode() + B2.a.b(this.record.f24558h.hashCode() * 31, 31, this.columns)) * 31);
        }

        public String toString() {
            return "Insert(record=" + this.record + ", columns=" + this.columns + ", commitTimestamp=" + this.commitTimestamp + ", serializer=" + this.serializer + ')';
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction$Select;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/realtime/HasRecord;", "Lkotlinx/serialization/json/c;", "record", "", "Lio/github/jan/supabase/realtime/Column;", "columns", "Ld8/d;", "commitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "()Ljava/util/List;", "component3", "()Ld8/d;", "component4", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/realtime/PostgresAction$Select;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getRecord", "Ljava/util/List;", "getColumns", "Ld8/d;", "getCommitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Select implements PostgresAction, HasRecord {
        private final List<Column> columns;
        private final p036d8.d commitTimestamp;
        private final kotlinx.serialization.json.c record;
        private final SupabaseSerializer serializer;

        public Select(kotlinx.serialization.json.c record, List<Column> columns, p036d8.d commitTimestamp, SupabaseSerializer serializer) {
            m.e(record, "record");
            m.e(columns, "columns");
            m.e(commitTimestamp, "commitTimestamp");
            m.e(serializer, "serializer");
            this.record = record;
            this.columns = columns;
            this.commitTimestamp = commitTimestamp;
            this.serializer = serializer;
        }

        public static Select copy$default(Select select, kotlinx.serialization.json.c cVar, List list, p036d8.d dVar, SupabaseSerializer supabaseSerializer, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                cVar = select.record;
            }
            if ((i3 & 2) != 0) {
                list = select.columns;
            }
            if ((i3 & 4) != 0) {
                dVar = select.commitTimestamp;
            }
            if ((i3 & 8) != 0) {
                supabaseSerializer = select.serializer;
            }
            return select.copy(cVar, list, dVar, supabaseSerializer);
        }

        public final kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        public final List<Column> component2() {
            return this.columns;
        }

        public final p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        public final SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final Select copy(kotlinx.serialization.json.c record, List<Column> columns, p036d8.d commitTimestamp, SupabaseSerializer serializer) {
            m.e(record, "record");
            m.e(columns, "columns");
            m.e(commitTimestamp, "commitTimestamp");
            m.e(serializer, "serializer");
            return new Select(record, columns, commitTimestamp, serializer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Select)) {
                return false;
            }
            Select select = (Select) other;
            return m.a(this.record, select.record) && m.a(this.columns, select.columns) && m.a(this.commitTimestamp, select.commitTimestamp) && m.a(this.serializer, select.serializer);
        }

        @Override
        public List<Column> getColumns() {
            return this.columns;
        }

        @Override
        public p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        @Override
        public kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        @Override
        public SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode() + ((this.commitTimestamp.f21303h.hashCode() + B2.a.b(this.record.f24558h.hashCode() * 31, 31, this.columns)) * 31);
        }

        public String toString() {
            return "Select(record=" + this.record + ", columns=" + this.columns + ", commitTimestamp=" + this.commitTimestamp + ", serializer=" + this.serializer + ')';
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u0018¨\u0006/"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction$Update;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/realtime/HasRecord;", "Lio/github/jan/supabase/realtime/HasOldRecord;", "Lkotlinx/serialization/json/c;", "record", "oldRecord", "", "Lio/github/jan/supabase/realtime/Column;", "columns", "Ld8/d;", "commitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/json/c;Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ld8/d;", "component5", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy", "(Lkotlinx/serialization/json/c;Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/realtime/PostgresAction$Update;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getRecord", "getOldRecord", "Ljava/util/List;", "getColumns", "Ld8/d;", "getCommitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Update implements PostgresAction, HasRecord, HasOldRecord {
        private final List<Column> columns;
        private final p036d8.d commitTimestamp;
        private final kotlinx.serialization.json.c oldRecord;
        private final kotlinx.serialization.json.c record;
        private final SupabaseSerializer serializer;

        public Update(kotlinx.serialization.json.c record, kotlinx.serialization.json.c oldRecord, List<Column> columns, p036d8.d commitTimestamp, SupabaseSerializer serializer) {
            m.e(record, "record");
            m.e(oldRecord, "oldRecord");
            m.e(columns, "columns");
            m.e(commitTimestamp, "commitTimestamp");
            m.e(serializer, "serializer");
            this.record = record;
            this.oldRecord = oldRecord;
            this.columns = columns;
            this.commitTimestamp = commitTimestamp;
            this.serializer = serializer;
        }

        public static Update copy$default(Update update, kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, List list, p036d8.d dVar, SupabaseSerializer supabaseSerializer, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                cVar = update.record;
            }
            if ((i3 & 2) != 0) {
                cVar2 = update.oldRecord;
            }
            if ((i3 & 4) != 0) {
                list = update.columns;
            }
            if ((i3 & 8) != 0) {
                dVar = update.commitTimestamp;
            }
            if ((i3 & 16) != 0) {
                supabaseSerializer = update.serializer;
            }
            SupabaseSerializer supabaseSerializer2 = supabaseSerializer;
            List list2 = list;
            return update.copy(cVar, cVar2, list2, dVar, supabaseSerializer2);
        }

        public final kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        public final kotlinx.serialization.json.c getOldRecord() {
            return this.oldRecord;
        }

        public final List<Column> component3() {
            return this.columns;
        }

        public final p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        public final SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final Update copy(kotlinx.serialization.json.c record, kotlinx.serialization.json.c oldRecord, List<Column> columns, p036d8.d commitTimestamp, SupabaseSerializer serializer) {
            m.e(record, "record");
            m.e(oldRecord, "oldRecord");
            m.e(columns, "columns");
            m.e(commitTimestamp, "commitTimestamp");
            m.e(serializer, "serializer");
            return new Update(record, oldRecord, columns, commitTimestamp, serializer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Update)) {
                return false;
            }
            Update update = (Update) other;
            return m.a(this.record, update.record) && m.a(this.oldRecord, update.oldRecord) && m.a(this.columns, update.columns) && m.a(this.commitTimestamp, update.commitTimestamp) && m.a(this.serializer, update.serializer);
        }

        @Override
        public List<Column> getColumns() {
            return this.columns;
        }

        @Override
        public p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        @Override
        public kotlinx.serialization.json.c getOldRecord() {
            return this.oldRecord;
        }

        @Override
        public kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        @Override
        public SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode() + ((this.commitTimestamp.f21303h.hashCode() + B2.a.b(B2.a.c(this.record.f24558h.hashCode() * 31, 31, this.oldRecord.f24558h), 31, this.columns)) * 31);
        }

        public String toString() {
            return "Update(record=" + this.record + ", oldRecord=" + this.oldRecord + ", columns=" + this.columns + ", commitTimestamp=" + this.commitTimestamp + ", serializer=" + this.serializer + ')';
        }
    }

    List<Column> getColumns();

    p036d8.d getCommitTimestamp();
}
