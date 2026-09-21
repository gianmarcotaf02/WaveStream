package kotlinx.serialization.json;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/JsonNull;", "Lkotlinx/serialization/json/d;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = p162s8.u.class)
public final class JsonNull extends kotlinx.serialization.json.d {
    public static final kotlinx.serialization.json.JsonNull INSTANCE = new kotlinx.serialization.json.JsonNull();

    @Override // kotlinx.serialization.json.d
    public final java.lang.String d() {
        return "null";
    }

    @Override // kotlinx.serialization.json.d
    public final boolean e() {
        return false;
    }

    public final kotlinx.serialization.KSerializer serializer() {
        return p162s8.u.f27424a;
    }
}
