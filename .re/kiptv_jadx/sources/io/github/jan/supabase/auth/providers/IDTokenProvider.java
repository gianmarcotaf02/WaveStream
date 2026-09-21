package io.github.jan.supabase.auth.providers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "<init>", "()V", "Companion", "Lio/github/jan/supabase/auth/providers/Apple;", "Lio/github/jan/supabase/auth/providers/Azure;", "Lio/github/jan/supabase/auth/providers/Facebook;", "Lio/github/jan/supabase/auth/providers/Google;", "Lio/github/jan/supabase/auth/providers/Kakao;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = io.github.jan.supabase.auth.providers.IDTokenProvider.Companion.class)
public abstract class IDTokenProvider extends io.github.jan.supabase.auth.providers.OAuthProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.auth.providers.IDTokenProvider.Companion INSTANCE = new io.github.jan.supabase.auth.providers.IDTokenProvider.Companion(null);
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.google.crypto.tink.shaded.protobuf.q0.d("IDTokenProvider", p135p8.e.f26270n);

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/auth/providers/IDTokenProvider$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/github/jan/supabase/auth/providers/IDTokenProvider;)V", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements kotlinx.serialization.KSerializer {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        @Override // kotlinx.serialization.KSerializer
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return io.github.jan.supabase.auth.providers.IDTokenProvider.descriptor;
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return io.github.jan.supabase.auth.providers.IDTokenProvider.INSTANCE;
        }

        private Companion() {
        }

        @Override // kotlinx.serialization.KSerializer
        public io.github.jan.supabase.auth.providers.IDTokenProvider deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            kotlin.jvm.internal.m.e(decoder, "decoder");
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(kotlinx.serialization.encoding.Encoder encoder, io.github.jan.supabase.auth.providers.IDTokenProvider value) {
            kotlin.jvm.internal.m.e(encoder, "encoder");
            kotlin.jvm.internal.m.e(value, "value");
            encoder.F(value.getName());
        }
    }

    public /* synthetic */ IDTokenProvider(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    private IDTokenProvider() {
    }
}
