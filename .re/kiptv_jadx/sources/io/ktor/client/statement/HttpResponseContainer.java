package io.ktor.client.statement;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lio/ktor/client/statement/HttpResponseContainer;", "", "Lio/ktor/util/reflect/TypeInfo;", "expectedType", io.sentry.protocol.Response.TYPE, "<init>", "(Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;)V", "component1", "()Lio/ktor/util/reflect/TypeInfo;", "component2", "()Ljava/lang/Object;", "copy", "(Lio/ktor/util/reflect/TypeInfo;Ljava/lang/Object;)Lio/ktor/client/statement/HttpResponseContainer;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lio/ktor/util/reflect/TypeInfo;", "getExpectedType", "Ljava/lang/Object;", "getResponse", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class HttpResponseContainer {
    private final io.ktor.util.reflect.TypeInfo expectedType;
    private final java.lang.Object response;

    public HttpResponseContainer(io.ktor.util.reflect.TypeInfo expectedType, java.lang.Object response) {
        kotlin.jvm.internal.m.e(expectedType, "expectedType");
        kotlin.jvm.internal.m.e(response, "response");
        this.expectedType = expectedType;
        this.response = response;
    }

    public static /* synthetic */ io.ktor.client.statement.HttpResponseContainer copy$default(io.ktor.client.statement.HttpResponseContainer httpResponseContainer, io.ktor.util.reflect.TypeInfo typeInfo, java.lang.Object obj, int i3, java.lang.Object obj2) {
        if ((i3 & 1) != 0) {
            typeInfo = httpResponseContainer.expectedType;
        }
        if ((i3 & 2) != 0) {
            obj = httpResponseContainer.response;
        }
        return httpResponseContainer.copy(typeInfo, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final io.ktor.util.reflect.TypeInfo getExpectedType() {
        return this.expectedType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Object getResponse() {
        return this.response;
    }

    public final io.ktor.client.statement.HttpResponseContainer copy(io.ktor.util.reflect.TypeInfo expectedType, java.lang.Object response) {
        kotlin.jvm.internal.m.e(expectedType, "expectedType");
        kotlin.jvm.internal.m.e(response, "response");
        return new io.ktor.client.statement.HttpResponseContainer(expectedType, response);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.client.statement.HttpResponseContainer)) {
            return false;
        }
        io.ktor.client.statement.HttpResponseContainer httpResponseContainer = (io.ktor.client.statement.HttpResponseContainer) other;
        return kotlin.jvm.internal.m.a(this.expectedType, httpResponseContainer.expectedType) && kotlin.jvm.internal.m.a(this.response, httpResponseContainer.response);
    }

    public final io.ktor.util.reflect.TypeInfo getExpectedType() {
        return this.expectedType;
    }

    public final java.lang.Object getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode() + (this.expectedType.hashCode() * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpResponseContainer(expectedType=");
        sb.append(this.expectedType);
        sb.append(", response=");
        return B2.a.n(sb, this.response, ')');
    }
}
