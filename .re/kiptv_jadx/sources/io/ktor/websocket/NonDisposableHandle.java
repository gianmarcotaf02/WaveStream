package io.ktor.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/websocket/NonDisposableHandle;", "LS7/O;", "<init>", "()V", "Lh6/A;", "dispose", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class NonDisposableHandle implements S7.O {
    public static final io.ktor.websocket.NonDisposableHandle INSTANCE = new io.ktor.websocket.NonDisposableHandle();

    private NonDisposableHandle() {
    }

    @Override // S7.O
    public void dispose() {
    }

    public boolean equals(java.lang.Object other) {
        return this == other || (other instanceof io.ktor.websocket.NonDisposableHandle);
    }

    public int hashCode() {
        return 207988788;
    }

    public java.lang.String toString() {
        return "NonDisposableHandle";
    }
}
