package io.ktor.serialization.kotlinx.json;

import E6.InterfaceC0331d;
import E6.InterfaceC0332e;
import E6.v;
import E6.y;
import androidx.media3.container.NalUnitUtil;
import io.ktor.util.reflect.TypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/util/reflect/TypeInfo;", "argumentTypeInfo", "(Lio/ktor/util/reflect/TypeInfo;)Lio/ktor/util/reflect/TypeInfo;", "ktor-serialization-kotlinx-json"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KotlinxSerializationJsonExtensionsKt {
    public static final TypeInfo argumentTypeInfo(TypeInfo typeInfo) {
        m.e(typeInfo, "<this>");
        v kotlinType = typeInfo.getKotlinType();
        m.b(kotlinType);
        v vVar = ((y) kotlinType.c().get(0)).f3224b;
        m.b(vVar);
        InterfaceC0332e interfaceC0332eD = vVar.d();
        m.c(interfaceC0332eD, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return new TypeInfo((InterfaceC0331d) interfaceC0332eD, vVar);
    }
}
