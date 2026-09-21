package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lio/github/jan/supabase/realtime/PrimaryKey;", "Data", "", "", "columnName", "Lkotlin/Function1;", "producer", "<init>", "(Ljava/lang/String;Lx6/j;)V", "component1", "()Ljava/lang/String;", "component2", "()Lx6/j;", "copy", "(Ljava/lang/String;Lx6/j;)Lio/github/jan/supabase/realtime/PrimaryKey;", "toString", "", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getColumnName", "Lx6/j;", "getProducer", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PrimaryKey<Data> {
    private final String columnName;
    private final j producer;

    public PrimaryKey(String columnName, j producer) {
        m.e(columnName, "columnName");
        m.e(producer, "producer");
        this.columnName = columnName;
        this.producer = producer;
    }

    public static PrimaryKey copy$default(PrimaryKey primaryKey, String str, j jVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = primaryKey.columnName;
        }
        if ((i3 & 2) != 0) {
            jVar = primaryKey.producer;
        }
        return primaryKey.copy(str, jVar);
    }

    public final String getColumnName() {
        return this.columnName;
    }

    public final j getProducer() {
        return this.producer;
    }

    public final PrimaryKey<Data> copy(String columnName, j producer) {
        m.e(columnName, "columnName");
        m.e(producer, "producer");
        return new PrimaryKey<>(columnName, producer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryKey)) {
            return false;
        }
        PrimaryKey primaryKey = (PrimaryKey) other;
        return m.a(this.columnName, primaryKey.columnName) && m.a(this.producer, primaryKey.producer);
    }

    public final String getColumnName() {
        return this.columnName;
    }

    public final j getProducer() {
        return this.producer;
    }

    public int hashCode() {
        return this.producer.hashCode() + (this.columnName.hashCode() * 31);
    }

    public String toString() {
        return "PrimaryKey(columnName=" + this.columnName + ", producer=" + this.producer + ')';
    }
}
