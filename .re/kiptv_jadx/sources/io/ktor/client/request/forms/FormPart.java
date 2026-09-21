package io.ktor.client.request.forms;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lio/ktor/client/request/forms/FormPart;", "", "T", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "value", "Lio/ktor/http/Headers;", "headers", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/Headers;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Lio/ktor/http/Headers;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/Headers;)Lio/ktor/client/request/forms/FormPart;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKey", "Ljava/lang/Object;", "getValue", "Lio/ktor/http/Headers;", "getHeaders", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class FormPart<T> {
    private final io.ktor.http.Headers headers;
    private final java.lang.String key;
    private final T value;

    public FormPart(java.lang.String key, T value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.key = key;
        this.value = value;
        this.headers = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.ktor.client.request.forms.FormPart copy$default(io.ktor.client.request.forms.FormPart formPart, java.lang.String str, java.lang.Object obj, io.ktor.http.Headers headers, int i3, java.lang.Object obj2) {
        if ((i3 & 1) != 0) {
            str = formPart.key;
        }
        if ((i3 & 2) != 0) {
            obj = formPart.value;
        }
        if ((i3 & 4) != 0) {
            headers = formPart.headers;
        }
        return formPart.copy(str, obj, headers);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    public final T component2() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public final io.ktor.client.request.forms.FormPart<T> copy(java.lang.String key, T value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        return new io.ktor.client.request.forms.FormPart<>(key, value, headers);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.client.request.forms.FormPart)) {
            return false;
        }
        io.ktor.client.request.forms.FormPart formPart = (io.ktor.client.request.forms.FormPart) other;
        return kotlin.jvm.internal.m.a(this.key, formPart.key) && kotlin.jvm.internal.m.a(this.value, formPart.value) && kotlin.jvm.internal.m.a(this.headers, formPart.headers);
    }

    public final io.ktor.http.Headers getHeaders() {
        return this.headers;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.headers.hashCode() + ((this.value.hashCode() + (this.key.hashCode() * 31)) * 31);
    }

    public java.lang.String toString() {
        return "FormPart(key=" + this.key + ", value=" + this.value + ", headers=" + this.headers + ')';
    }

    public /* synthetic */ FormPart(java.lang.String str, java.lang.Object obj, io.ktor.http.Headers headers, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, obj, (i3 & 4) != 0 ? io.ktor.http.Headers.INSTANCE.getEmpty() : headers);
    }
}
