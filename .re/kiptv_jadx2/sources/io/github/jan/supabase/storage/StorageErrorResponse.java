package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p119n8.i;
import p153r8.AbstractC2686a0;
import p153r8.k0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lio/github/jan/supabase/storage/StorageErrorResponse;", "", "", "statusCode", "", "error", "message", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lr8/k0;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$storage_kt_release", "(Lio/github/jan/supabase/storage/StorageErrorResponse;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/storage/StorageErrorResponse;", "toString", "hashCode", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatusCode", "Ljava/lang/String;", "getError", "getMessage", "Companion", "$serializer", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class StorageErrorResponse {

    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final String message;
    private final int statusCode;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/StorageErrorResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/StorageErrorResponse;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return StorageErrorResponse$$serializer.INSTANCE;
        }

        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }
    }

    public StorageErrorResponse(int i3, int i9, String str, String str2, k0 k0Var) {
        if (7 != (i3 & 7)) {
            AbstractC2686a0.l(i3, 7, StorageErrorResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.statusCode = i9;
        this.error = str;
        this.message = str2;
    }

    public static StorageErrorResponse copy$default(StorageErrorResponse storageErrorResponse, int i3, String str, String str2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = storageErrorResponse.statusCode;
        }
        if ((i9 & 2) != 0) {
            str = storageErrorResponse.error;
        }
        if ((i9 & 4) != 0) {
            str2 = storageErrorResponse.message;
        }
        return storageErrorResponse.copy(i3, str, str2);
    }

    public static final void write$Self$storage_kt_release(StorageErrorResponse self, p143q8.b output, SerialDescriptor serialDesc) {
        output.n(0, self.statusCode, serialDesc);
        output.s(serialDesc, 1, self.error);
        output.s(serialDesc, 2, self.message);
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final StorageErrorResponse copy(int statusCode, String error, String message) {
        m.e(error, "error");
        m.e(message, "message");
        return new StorageErrorResponse(statusCode, error, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageErrorResponse)) {
            return false;
        }
        StorageErrorResponse storageErrorResponse = (StorageErrorResponse) other;
        return this.statusCode == storageErrorResponse.statusCode && m.a(this.error, storageErrorResponse.error) && m.a(this.message, storageErrorResponse.message);
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.message.hashCode() + B2.a.a(Integer.hashCode(this.statusCode) * 31, 31, this.error);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StorageErrorResponse(statusCode=");
        sb.append(this.statusCode);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", message=");
        return Y6.f.l(sb, this.message, ')');
    }

    public StorageErrorResponse(int i3, String error, String message) {
        m.e(error, "error");
        m.e(message, "message");
        this.statusCode = i3;
        this.error = error;
        this.message = message;
    }
}
