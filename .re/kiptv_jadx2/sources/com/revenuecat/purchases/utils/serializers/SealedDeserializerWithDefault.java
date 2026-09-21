package com.revenuecat.purchases.utils.serializers;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import p162s8.k;
import p194x6.j;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00030\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R.\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00030\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "", "T", "Lkotlinx/serialization/KSerializer;", "", "serialName", "", "Lkotlin/Function0;", "serializerByType", "Lkotlin/Function1;", "defaultValue", "typeDiscriminator", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lx6/j;Ljava/lang/String;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "Ljava/lang/String;", "Ljava/util/Map;", "Lx6/j;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class SealedDeserializerWithDefault<T> implements KSerializer {
    private final j defaultValue;
    private final SerialDescriptor descriptor;
    private final String serialName;
    private final Map<String, Function0> serializerByType;
    private final String typeDiscriminator;

    public SealedDeserializerWithDefault(String serialName, Map<String, ? extends Function0> serializerByType, j defaultValue, String typeDiscriminator) {
        m.e(serialName, "serialName");
        m.e(serializerByType, "serializerByType");
        m.e(defaultValue, "defaultValue");
        m.e(typeDiscriminator, "typeDiscriminator");
        this.serialName = serialName;
        this.serializerByType = serializerByType;
        this.defaultValue = defaultValue;
        this.typeDiscriminator = typeDiscriminator;
        this.descriptor = q0.j(serialName, new SerialDescriptor[0], new SealedDeserializerWithDefault$descriptor$1(this));
    }

    @Override
    public T deserialize(Decoder decoder) {
        Function0 function0;
        m.e(decoder, "decoder");
        k kVar = decoder instanceof k ? (k) decoder : null;
        if (kVar == null) {
            StringBuilder sb = new StringBuilder("Can only deserialize ");
            sb.append(this.serialName);
            sb.append(" from JSON, got: ");
            throw new p119n8.j(M0.p(B.f24540a, decoder.getClass(), sb));
        }
        b bVarI = kVar.i();
        c cVar = bVarI instanceof c ? (c) bVarI : null;
        if (cVar == null) {
            return (T) this.defaultValue.invoke("null");
        }
        Object obj = cVar.get(this.typeDiscriminator);
        d dVar = obj instanceof d ? (d) obj : null;
        String strD = dVar != null ? dVar.d() : null;
        if (strD == null || (function0 = this.serializerByType.get(strD)) == null) {
            return (T) this.defaultValue.invoke(strD != null ? strD : "null");
        }
        try {
            return (T) kVar.t().a((KSerializer) function0.invoke(), cVar);
        } catch (Exception unused) {
            return (T) this.defaultValue.invoke(strD);
        }
    }

    @Override
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override
    public void serialize(Encoder encoder, T value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        throw new p070h6.j("Serialization is not implemented because it is not needed.");
    }

    public SealedDeserializerWithDefault(String str, Map map, j jVar, String str2, int i3, AbstractC2541f abstractC2541f) {
        this(str, map, jVar, (i3 & 8) != 0 ? "type" : str2);
    }
}
