package io.ktor.sse;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.InternalAPI;
import io.sentry.UserFeedback;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013JR\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b)\u0010\u0013¨\u0006*"}, d2 = {"Lio/ktor/sse/TypedServerSentEvent;", "T", "Lio/ktor/sse/ServerSentEventMetadata;", "data", "", "event", "id", "", "retry", UserFeedback.JsonKeys.COMMENTS, "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Lkotlin/Function1;", "serializer", "toString", "(Lx6/j;)Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Long;", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lio/ktor/sse/TypedServerSentEvent;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getData", "Ljava/lang/String;", "getEvent", "getId", "Ljava/lang/Long;", "getRetry", "getComments", "ktor-sse"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TypedServerSentEvent<T> implements ServerSentEventMetadata<T> {
    private final String comments;
    private final T data;
    private final String event;
    private final String id;
    private final Long retry;

    public TypedServerSentEvent() {
        this(null, null, null, null, null, 31, null);
    }

    public static TypedServerSentEvent copy$default(TypedServerSentEvent typedServerSentEvent, Object obj, String str, String str2, Long l2, String str3, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            obj = typedServerSentEvent.data;
        }
        if ((i3 & 2) != 0) {
            str = typedServerSentEvent.event;
        }
        if ((i3 & 4) != 0) {
            str2 = typedServerSentEvent.id;
        }
        if ((i3 & 8) != 0) {
            l2 = typedServerSentEvent.retry;
        }
        if ((i3 & 16) != 0) {
            str3 = typedServerSentEvent.comments;
        }
        String str4 = str3;
        String str5 = str2;
        return typedServerSentEvent.copy(obj, str, str5, l2, str4);
    }

    public final T component1() {
        return this.data;
    }

    public final String getEvent() {
        return this.event;
    }

    public final String getId() {
        return this.id;
    }

    public final Long getRetry() {
        return this.retry;
    }

    public final String getComments() {
        return this.comments;
    }

    public final TypedServerSentEvent<T> copy(T data, String event, String id, Long retry, String comments) {
        return new TypedServerSentEvent<>(data, event, id, retry, comments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypedServerSentEvent)) {
            return false;
        }
        TypedServerSentEvent typedServerSentEvent = (TypedServerSentEvent) other;
        return m.a(this.data, typedServerSentEvent.data) && m.a(this.event, typedServerSentEvent.event) && m.a(this.id, typedServerSentEvent.id) && m.a(this.retry, typedServerSentEvent.retry) && m.a(this.comments, typedServerSentEvent.comments);
    }

    @Override
    public String getComments() {
        return this.comments;
    }

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public String getEvent() {
        return this.event;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Long getRetry() {
        return this.retry;
    }

    public int hashCode() {
        T t9 = this.data;
        int iHashCode = (t9 == null ? 0 : t9.hashCode()) * 31;
        String str = this.event;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.id;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.retry;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.comments;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TypedServerSentEvent(data=");
        sb.append(this.data);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", retry=");
        sb.append(this.retry);
        sb.append(", comments=");
        return f.l(sb, this.comments, ')');
    }

    public TypedServerSentEvent(T t9, String str, String str2, Long l2, String str3) {
        this.data = t9;
        this.event = str;
        this.id = str2;
        this.retry = l2;
        this.comments = str3;
    }

    @InternalAPI
    public final String toString(j serializer) {
        m.e(serializer, "serializer");
        T data = getData();
        return ServerSentEventKt.eventToString(data != null ? (String) serializer.invoke(data) : null, getEvent(), getId(), getRetry(), getComments());
    }

    public TypedServerSentEvent(Object obj, String str, String str2, Long l2, String str3, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : obj, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : l2, (i3 & 16) != 0 ? null : str3);
    }
}
