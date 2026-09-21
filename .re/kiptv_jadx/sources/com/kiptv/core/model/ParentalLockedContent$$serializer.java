package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/ParentalLockedContent.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/ParentalLockedContent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/ParentalLockedContent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/ParentalLockedContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class ParentalLockedContent$$serializer implements p153r8.D {
    public static final com.kiptv.core.model.ParentalLockedContent$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.model.ParentalLockedContent$$serializer parentalLockedContent$$serializer = new com.kiptv.core.model.ParentalLockedContent$$serializer();
        INSTANCE = parentalLockedContent$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.model.ParentalLockedContent", parentalLockedContent$$serializer, 3);
        c2690c0.k("movies", true);
        c2690c0.k("series", true);
        c2690c0.k("live", true);
        descriptor = c2690c0;
    }

    private ParentalLockedContent$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.model.ParentalLockedContent.f20028d;
        return new kotlinx.serialization.KSerializer[]{kSerializerArr[0], kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.model.ParentalLockedContent deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.model.ParentalLockedContent.f20028d;
        java.util.List list = null;
        boolean z6 = true;
        int i3 = 0;
        java.util.List list2 = null;
        java.util.List list3 = null;
        while (z6) {
            int iS = aVarC.s(serialDescriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                list = (java.util.List) aVarC.x(serialDescriptor, 0, kSerializerArr[0], list);
                i3 |= 1;
            } else if (iS == 1) {
                list2 = (java.util.List) aVarC.x(serialDescriptor, 1, kSerializerArr[1], list2);
                i3 |= 2;
            } else {
                if (iS != 2) {
                    throw new p119n8.m(iS);
                }
                list3 = (java.util.List) aVarC.x(serialDescriptor, 2, kSerializerArr[2], list3);
                i3 |= 4;
            }
        }
        aVarC.a(serialDescriptor);
        com.kiptv.core.model.ParentalLockedContent parentalLockedContent = new com.kiptv.core.model.ParentalLockedContent();
        int i9 = i3 & 1;
        p078i6.w wVar = p078i6.w.f23205h;
        if (i9 == 0) {
            parentalLockedContent.f20030a = wVar;
        } else {
            parentalLockedContent.f20030a = list;
        }
        if ((i3 & 2) == 0) {
            parentalLockedContent.f20031b = wVar;
        } else {
            parentalLockedContent.f20031b = list2;
        }
        if ((i3 & 4) == 0) {
            parentalLockedContent.f20032c = wVar;
            return parentalLockedContent;
        }
        parentalLockedContent.f20032c = list3;
        return parentalLockedContent;
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.model.ParentalLockedContent value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        com.kiptv.core.model.ParentalLockedContent.Companion companion = com.kiptv.core.model.ParentalLockedContent.INSTANCE;
        boolean zE = bVarC.E(serialDescriptor);
        p078i6.w wVar = p078i6.w.f23205h;
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.model.ParentalLockedContent.f20028d;
        java.util.List list = value.f20030a;
        if (zE || !kotlin.jvm.internal.m.a(list, wVar)) {
            bVarC.h(serialDescriptor, 0, kSerializerArr[0], list);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        java.util.List list2 = value.f20031b;
        if (zE2 || !kotlin.jvm.internal.m.a(list2, wVar)) {
            bVarC.h(serialDescriptor, 1, kSerializerArr[1], list2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        java.util.List list3 = value.f20032c;
        if (zE3 || !kotlin.jvm.internal.m.a(list3, wVar)) {
            bVarC.h(serialDescriptor, 2, kSerializerArr[2], list3);
        }
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
