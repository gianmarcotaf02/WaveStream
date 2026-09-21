package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/plugins/SerializableData;", "", "Lio/github/jan/supabase/realtime/Column;", "getColumns", "()Ljava/util/List;", "columns", "Ld8/d;", "getCommitTimestamp", "()Ld8/d;", "commitTimestamp", "Insert", "Update", "Delete", "Select", "Lio/github/jan/supabase/realtime/PostgresAction$Delete;", "Lio/github/jan/supabase/realtime/PostgresAction$Insert;", "Lio/github/jan/supabase/realtime/PostgresAction$Select;", "Lio/github/jan/supabase/realtime/PostgresAction$Update;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface PostgresAction extends io.github.jan.supabase.plugins.SerializableData {

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction$Delete;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/realtime/HasOldRecord;", "Lkotlinx/serialization/json/c;", "oldRecord", "", "Lio/github/jan/supabase/realtime/Column;", "columns", "Ld8/d;", "commitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "()Ljava/util/List;", "component3", "()Ld8/d;", "component4", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/realtime/PostgresAction$Delete;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getOldRecord", "Ljava/util/List;", "getColumns", "Ld8/d;", "getCommitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Delete implements io.github.jan.supabase.realtime.PostgresAction, io.github.jan.supabase.realtime.HasOldRecord {
        private final java.util.List<io.github.jan.supabase.realtime.Column> columns;
        private final p036d8.d commitTimestamp;
        private final kotlinx.serialization.json.c oldRecord;
        private final io.github.jan.supabase.SupabaseSerializer serializer;

        public Delete(kotlinx.serialization.json.c oldRecord, java.util.List<io.github.jan.supabase.realtime.Column> columns, p036d8.d commitTimestamp, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(oldRecord, "oldRecord");
            kotlin.jvm.internal.m.e(columns, "columns");
            kotlin.jvm.internal.m.e(commitTimestamp, "commitTimestamp");
            kotlin.jvm.internal.m.e(serializer, "serializer");
            this.oldRecord = oldRecord;
            this.columns = columns;
            this.commitTimestamp = commitTimestamp;
            this.serializer = serializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.github.jan.supabase.realtime.PostgresAction.Delete copy$default(io.github.jan.supabase.realtime.PostgresAction.Delete delete, kotlinx.serialization.json.c cVar, java.util.List list, p036d8.d dVar, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, int i3, java.lang.Object obj) {
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

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final kotlinx.serialization.json.c getOldRecord() {
            return this.oldRecord;
        }

        public final java.util.List<io.github.jan.supabase.realtime.Column> component2() {
            return this.columns;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final io.github.jan.supabase.realtime.PostgresAction.Delete copy(kotlinx.serialization.json.c oldRecord, java.util.List<io.github.jan.supabase.realtime.Column> columns, p036d8.d commitTimestamp, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(oldRecord, "oldRecord");
            kotlin.jvm.internal.m.e(columns, "columns");
            kotlin.jvm.internal.m.e(commitTimestamp, "commitTimestamp");
            kotlin.jvm.internal.m.e(serializer, "serializer");
            return new io.github.jan.supabase.realtime.PostgresAction.Delete(oldRecord, columns, commitTimestamp, serializer);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.github.jan.supabase.realtime.PostgresAction.Delete)) {
                return false;
            }
            io.github.jan.supabase.realtime.PostgresAction.Delete delete = (io.github.jan.supabase.realtime.PostgresAction.Delete) other;
            return kotlin.jvm.internal.m.a(this.oldRecord, delete.oldRecord) && kotlin.jvm.internal.m.a(this.columns, delete.columns) && kotlin.jvm.internal.m.a(this.commitTimestamp, delete.commitTimestamp) && kotlin.jvm.internal.m.a(this.serializer, delete.serializer);
        }

        @Override // io.github.jan.supabase.realtime.PostgresAction
        public java.util.List<io.github.jan.supabase.realtime.Column> getColumns() {
            return this.columns;
        }

        @Override // io.github.jan.supabase.realtime.PostgresAction
        public p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        @Override // io.github.jan.supabase.realtime.HasOldRecord
        public kotlinx.serialization.json.c getOldRecord() {
            return this.oldRecord;
        }

        @Override // io.github.jan.supabase.plugins.SerializableData
        public io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode() + ((this.commitTimestamp.f21303h.hashCode() + B2.a.b(this.oldRecord.f24558h.hashCode() * 31, 31, this.columns)) * 31);
        }

        public java.lang.String toString() {
            return "Delete(oldRecord=" + this.oldRecord + ", columns=" + this.columns + ", commitTimestamp=" + this.commitTimestamp + ", serializer=" + this.serializer + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction$Insert;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/realtime/HasRecord;", "Lkotlinx/serialization/json/c;", "record", "", "Lio/github/jan/supabase/realtime/Column;", "columns", "Ld8/d;", "commitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "()Ljava/util/List;", "component3", "()Ld8/d;", "component4", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/realtime/PostgresAction$Insert;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getRecord", "Ljava/util/List;", "getColumns", "Ld8/d;", "getCommitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Insert implements io.github.jan.supabase.realtime.PostgresAction, io.github.jan.supabase.realtime.HasRecord {
        private final java.util.List<io.github.jan.supabase.realtime.Column> columns;
        private final p036d8.d commitTimestamp;
        private final kotlinx.serialization.json.c record;
        private final io.github.jan.supabase.SupabaseSerializer serializer;

        public Insert(kotlinx.serialization.json.c record, java.util.List<io.github.jan.supabase.realtime.Column> columns, p036d8.d commitTimestamp, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(record, "record");
            kotlin.jvm.internal.m.e(columns, "columns");
            kotlin.jvm.internal.m.e(commitTimestamp, "commitTimestamp");
            kotlin.jvm.internal.m.e(serializer, "serializer");
            this.record = record;
            this.columns = columns;
            this.commitTimestamp = commitTimestamp;
            this.serializer = serializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.github.jan.supabase.realtime.PostgresAction.Insert copy$default(io.github.jan.supabase.realtime.PostgresAction.Insert insert, kotlinx.serialization.json.c cVar, java.util.List list, p036d8.d dVar, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, int i3, java.lang.Object obj) {
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

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        public final java.util.List<io.github.jan.supabase.realtime.Column> component2() {
            return this.columns;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final io.github.jan.supabase.realtime.PostgresAction.Insert copy(kotlinx.serialization.json.c record, java.util.List<io.github.jan.supabase.realtime.Column> columns, p036d8.d commitTimestamp, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(record, "record");
            kotlin.jvm.internal.m.e(columns, "columns");
            kotlin.jvm.internal.m.e(commitTimestamp, "commitTimestamp");
            kotlin.jvm.internal.m.e(serializer, "serializer");
            return new io.github.jan.supabase.realtime.PostgresAction.Insert(record, columns, commitTimestamp, serializer);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.github.jan.supabase.realtime.PostgresAction.Insert)) {
                return false;
            }
            io.github.jan.supabase.realtime.PostgresAction.Insert insert = (io.github.jan.supabase.realtime.PostgresAction.Insert) other;
            return kotlin.jvm.internal.m.a(this.record, insert.record) && kotlin.jvm.internal.m.a(this.columns, insert.columns) && kotlin.jvm.internal.m.a(this.commitTimestamp, insert.commitTimestamp) && kotlin.jvm.internal.m.a(this.serializer, insert.serializer);
        }

        @Override // io.github.jan.supabase.realtime.PostgresAction
        public java.util.List<io.github.jan.supabase.realtime.Column> getColumns() {
            return this.columns;
        }

        @Override // io.github.jan.supabase.realtime.PostgresAction
        public p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        @Override // io.github.jan.supabase.realtime.HasRecord
        public kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        @Override // io.github.jan.supabase.plugins.SerializableData
        public io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode() + ((this.commitTimestamp.f21303h.hashCode() + B2.a.b(this.record.f24558h.hashCode() * 31, 31, this.columns)) * 31);
        }

        public java.lang.String toString() {
            return "Insert(record=" + this.record + ", columns=" + this.columns + ", commitTimestamp=" + this.commitTimestamp + ", serializer=" + this.serializer + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J>\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0015¨\u0006+"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction$Select;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/realtime/HasRecord;", "Lkotlinx/serialization/json/c;", "record", "", "Lio/github/jan/supabase/realtime/Column;", "columns", "Ld8/d;", "commitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "()Ljava/util/List;", "component3", "()Ld8/d;", "component4", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy", "(Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/realtime/PostgresAction$Select;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getRecord", "Ljava/util/List;", "getColumns", "Ld8/d;", "getCommitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Select implements io.github.jan.supabase.realtime.PostgresAction, io.github.jan.supabase.realtime.HasRecord {
        private final java.util.List<io.github.jan.supabase.realtime.Column> columns;
        private final p036d8.d commitTimestamp;
        private final kotlinx.serialization.json.c record;
        private final io.github.jan.supabase.SupabaseSerializer serializer;

        public Select(kotlinx.serialization.json.c record, java.util.List<io.github.jan.supabase.realtime.Column> columns, p036d8.d commitTimestamp, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(record, "record");
            kotlin.jvm.internal.m.e(columns, "columns");
            kotlin.jvm.internal.m.e(commitTimestamp, "commitTimestamp");
            kotlin.jvm.internal.m.e(serializer, "serializer");
            this.record = record;
            this.columns = columns;
            this.commitTimestamp = commitTimestamp;
            this.serializer = serializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.github.jan.supabase.realtime.PostgresAction.Select copy$default(io.github.jan.supabase.realtime.PostgresAction.Select select, kotlinx.serialization.json.c cVar, java.util.List list, p036d8.d dVar, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, int i3, java.lang.Object obj) {
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

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        public final java.util.List<io.github.jan.supabase.realtime.Column> component2() {
            return this.columns;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final io.github.jan.supabase.realtime.PostgresAction.Select copy(kotlinx.serialization.json.c record, java.util.List<io.github.jan.supabase.realtime.Column> columns, p036d8.d commitTimestamp, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(record, "record");
            kotlin.jvm.internal.m.e(columns, "columns");
            kotlin.jvm.internal.m.e(commitTimestamp, "commitTimestamp");
            kotlin.jvm.internal.m.e(serializer, "serializer");
            return new io.github.jan.supabase.realtime.PostgresAction.Select(record, columns, commitTimestamp, serializer);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.github.jan.supabase.realtime.PostgresAction.Select)) {
                return false;
            }
            io.github.jan.supabase.realtime.PostgresAction.Select select = (io.github.jan.supabase.realtime.PostgresAction.Select) other;
            return kotlin.jvm.internal.m.a(this.record, select.record) && kotlin.jvm.internal.m.a(this.columns, select.columns) && kotlin.jvm.internal.m.a(this.commitTimestamp, select.commitTimestamp) && kotlin.jvm.internal.m.a(this.serializer, select.serializer);
        }

        @Override // io.github.jan.supabase.realtime.PostgresAction
        public java.util.List<io.github.jan.supabase.realtime.Column> getColumns() {
            return this.columns;
        }

        @Override // io.github.jan.supabase.realtime.PostgresAction
        public p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        @Override // io.github.jan.supabase.realtime.HasRecord
        public kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        @Override // io.github.jan.supabase.plugins.SerializableData
        public io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode() + ((this.commitTimestamp.f21303h.hashCode() + B2.a.b(this.record.f24558h.hashCode() * 31, 31, this.columns)) * 31);
        }

        public java.lang.String toString() {
            return "Select(record=" + this.record + ", columns=" + this.columns + ", commitTimestamp=" + this.commitTimestamp + ", serializer=" + this.serializer + ')';
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010\u0018¨\u0006/"}, d2 = {"Lio/github/jan/supabase/realtime/PostgresAction$Update;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lio/github/jan/supabase/realtime/HasRecord;", "Lio/github/jan/supabase/realtime/HasOldRecord;", "Lkotlinx/serialization/json/c;", "record", "oldRecord", "", "Lio/github/jan/supabase/realtime/Column;", "columns", "Ld8/d;", "commitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/json/c;Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)V", "component1", "()Lkotlinx/serialization/json/c;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ld8/d;", "component5", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy", "(Lkotlinx/serialization/json/c;Lkotlinx/serialization/json/c;Ljava/util/List;Ld8/d;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/realtime/PostgresAction$Update;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/c;", "getRecord", "getOldRecord", "Ljava/util/List;", "getColumns", "Ld8/d;", "getCommitTimestamp", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Update implements io.github.jan.supabase.realtime.PostgresAction, io.github.jan.supabase.realtime.HasRecord, io.github.jan.supabase.realtime.HasOldRecord {
        private final java.util.List<io.github.jan.supabase.realtime.Column> columns;
        private final p036d8.d commitTimestamp;
        private final kotlinx.serialization.json.c oldRecord;
        private final kotlinx.serialization.json.c record;
        private final io.github.jan.supabase.SupabaseSerializer serializer;

        public Update(kotlinx.serialization.json.c record, kotlinx.serialization.json.c oldRecord, java.util.List<io.github.jan.supabase.realtime.Column> columns, p036d8.d commitTimestamp, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(record, "record");
            kotlin.jvm.internal.m.e(oldRecord, "oldRecord");
            kotlin.jvm.internal.m.e(columns, "columns");
            kotlin.jvm.internal.m.e(commitTimestamp, "commitTimestamp");
            kotlin.jvm.internal.m.e(serializer, "serializer");
            this.record = record;
            this.oldRecord = oldRecord;
            this.columns = columns;
            this.commitTimestamp = commitTimestamp;
            this.serializer = serializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ io.github.jan.supabase.realtime.PostgresAction.Update copy$default(io.github.jan.supabase.realtime.PostgresAction.Update update, kotlinx.serialization.json.c cVar, kotlinx.serialization.json.c cVar2, java.util.List list, p036d8.d dVar, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, int i3, java.lang.Object obj) {
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
            io.github.jan.supabase.SupabaseSerializer supabaseSerializer2 = supabaseSerializer;
            java.util.List list2 = list;
            return update.copy(cVar, cVar2, list2, dVar, supabaseSerializer2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final kotlinx.serialization.json.c getOldRecord() {
            return this.oldRecord;
        }

        public final java.util.List<io.github.jan.supabase.realtime.Column> component3() {
            return this.columns;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final io.github.jan.supabase.realtime.PostgresAction.Update copy(kotlinx.serialization.json.c record, kotlinx.serialization.json.c oldRecord, java.util.List<io.github.jan.supabase.realtime.Column> columns, p036d8.d commitTimestamp, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(record, "record");
            kotlin.jvm.internal.m.e(oldRecord, "oldRecord");
            kotlin.jvm.internal.m.e(columns, "columns");
            kotlin.jvm.internal.m.e(commitTimestamp, "commitTimestamp");
            kotlin.jvm.internal.m.e(serializer, "serializer");
            return new io.github.jan.supabase.realtime.PostgresAction.Update(record, oldRecord, columns, commitTimestamp, serializer);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof io.github.jan.supabase.realtime.PostgresAction.Update)) {
                return false;
            }
            io.github.jan.supabase.realtime.PostgresAction.Update update = (io.github.jan.supabase.realtime.PostgresAction.Update) other;
            return kotlin.jvm.internal.m.a(this.record, update.record) && kotlin.jvm.internal.m.a(this.oldRecord, update.oldRecord) && kotlin.jvm.internal.m.a(this.columns, update.columns) && kotlin.jvm.internal.m.a(this.commitTimestamp, update.commitTimestamp) && kotlin.jvm.internal.m.a(this.serializer, update.serializer);
        }

        @Override // io.github.jan.supabase.realtime.PostgresAction
        public java.util.List<io.github.jan.supabase.realtime.Column> getColumns() {
            return this.columns;
        }

        @Override // io.github.jan.supabase.realtime.PostgresAction
        public p036d8.d getCommitTimestamp() {
            return this.commitTimestamp;
        }

        @Override // io.github.jan.supabase.realtime.HasOldRecord
        public kotlinx.serialization.json.c getOldRecord() {
            return this.oldRecord;
        }

        @Override // io.github.jan.supabase.realtime.HasRecord
        public kotlinx.serialization.json.c getRecord() {
            return this.record;
        }

        @Override // io.github.jan.supabase.plugins.SerializableData
        public io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public int hashCode() {
            return this.serializer.hashCode() + ((this.commitTimestamp.f21303h.hashCode() + B2.a.b(B2.a.c(this.record.f24558h.hashCode() * 31, 31, this.oldRecord.f24558h), 31, this.columns)) * 31);
        }

        public java.lang.String toString() {
            return "Update(record=" + this.record + ", oldRecord=" + this.oldRecord + ", columns=" + this.columns + ", commitTimestamp=" + this.commitTimestamp + ", serializer=" + this.serializer + ')';
        }
    }

    java.util.List<io.github.jan.supabase.realtime.Column> getColumns();

    p036d8.d getCommitTimestamp();
}
