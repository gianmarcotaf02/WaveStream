package com.revenuecat.purchases.utils.serializers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/EmptyObjectToNullSerializer;", "", "T", "Lkotlinx/serialization/KSerializer;", "delegate", "", "resilient", "<init>", "(Lkotlinx/serialization/KSerializer;Z)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "Z", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class EmptyObjectToNullSerializer<T> implements kotlinx.serialization.KSerializer {
    private final kotlinx.serialization.KSerializer delegate;
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;
    private final boolean resilient;

    public EmptyObjectToNullSerializer(kotlinx.serialization.KSerializer delegate, boolean z6) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.delegate = delegate;
        this.resilient = z6;
        this.descriptor = delegate.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public T deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar = decoder instanceof p162s8.k ? (p162s8.k) decoder : null;
        if (kVar == null) {
            return (T) this.delegate.deserialize(decoder);
        }
        kotlinx.serialization.json.b bVarI = kVar.i();
        if ((bVarI instanceof kotlinx.serialization.json.c) && !((kotlinx.serialization.json.c) bVarI).f24558h.isEmpty()) {
            if (!this.resilient) {
                return (T) kVar.t().a(this.delegate, bVarI);
            }
            try {
                return (T) kVar.t().a(this.delegate, bVarI);
            } catch (p119n8.j unused) {
            }
        }
        return null;
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, T value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        if (value != null) {
            this.delegate.serialize(encoder, value);
        }
    }

    public /* synthetic */ EmptyObjectToNullSerializer(kotlinx.serialization.KSerializer kSerializer, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(kSerializer, (i3 & 2) != 0 ? true : z6);
    }
}
