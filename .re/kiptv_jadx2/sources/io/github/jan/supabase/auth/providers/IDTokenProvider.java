package io.github.jan.supabase.auth.providers;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p119n8.i;
import p135p8.e;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "<init>", "()V", "Companion", "Lio/github/jan/supabase/auth/providers/Apple;", "Lio/github/jan/supabase/auth/providers/Azure;", "Lio/github/jan/supabase/auth/providers/Facebook;", "Lio/github/jan/supabase/auth/providers/Google;", "Lio/github/jan/supabase/auth/providers/Kakao;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i(with = Companion.class)
public abstract class IDTokenProvider extends OAuthProvider {

    public static final Companion INSTANCE = new Companion(null);
    private static final SerialDescriptor descriptor = q0.d("IDTokenProvider", e.f26270n);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/auth/providers/IDTokenProvider$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/github/jan/supabase/auth/providers/IDTokenProvider;)V", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements KSerializer {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        @Override
        public SerialDescriptor getDescriptor() {
            return IDTokenProvider.descriptor;
        }

        public final KSerializer serializer() {
            return IDTokenProvider.INSTANCE;
        }

        private Companion() {
        }

        @Override
        public IDTokenProvider deserialize(Decoder decoder) {
            m.e(decoder, "decoder");
            throw new UnsupportedOperationException();
        }

        @Override
        public void serialize(Encoder encoder, IDTokenProvider value) {
            m.e(encoder, "encoder");
            m.e(value, "value");
            encoder.F(value.getName());
        }
    }

    public IDTokenProvider(AbstractC2541f abstractC2541f) {
        this();
    }

    private IDTokenProvider() {
    }
}
