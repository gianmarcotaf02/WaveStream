package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/github/jan/supabase/storage/StorageErrorResponse.$serializer", "Lr8/D;", "Lio/github/jan/supabase/storage/StorageErrorResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/github/jan/supabase/storage/StorageErrorResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/github/jan/supabase/storage/StorageErrorResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class StorageErrorResponse$$serializer implements p153r8.D {
    public static final io.github.jan.supabase.storage.StorageErrorResponse$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        io.github.jan.supabase.storage.StorageErrorResponse$$serializer storageErrorResponse$$serializer = new io.github.jan.supabase.storage.StorageErrorResponse$$serializer();
        INSTANCE = storageErrorResponse$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("io.github.jan.supabase.storage.StorageErrorResponse", storageErrorResponse$$serializer, 3);
        c2690c0.k("statusCode", false);
        c2690c0.k("error", false);
        c2690c0.k("message", false);
        descriptor = c2690c0;
    }

    private StorageErrorResponse$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new kotlinx.serialization.KSerializer[]{p153r8.K.f26915a, p0Var, p0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final io.github.jan.supabase.storage.StorageErrorResponse deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        int i3 = 0;
        int iK = 0;
        java.lang.String strQ = null;
        java.lang.String strQ2 = null;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                iK = aVarC.k(serialDescriptor, 0);
                i3 |= 1;
            } else if (iS == 1) {
                strQ = aVarC.q(serialDescriptor, 1);
                i3 |= 2;
            } else {
                if (iS != 2) {
                    throw new p119n8.m(iS);
                }
                strQ2 = aVarC.q(serialDescriptor, 2);
                i3 |= 4;
            }
        }
        aVarC.a(serialDescriptor);
        return new io.github.jan.supabase.storage.StorageErrorResponse(i3, iK, strQ, strQ2, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, io.github.jan.supabase.storage.StorageErrorResponse value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        io.github.jan.supabase.storage.StorageErrorResponse.write$Self$storage_kt_release(value, bVarC, serialDescriptor);
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
