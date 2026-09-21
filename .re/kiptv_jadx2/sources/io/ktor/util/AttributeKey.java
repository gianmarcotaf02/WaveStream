package io.ktor.util;

import E6.InterfaceC0331d;
import E6.v;
import O7.q;
import androidx.media3.container.NalUnitUtil;
import io.ktor.util.reflect.TypeInfo;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/ktor/util/AttributeKey;", "", "T", "", "name", "Lio/ktor/util/reflect/TypeInfo;", "type", "<init>", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()Lio/ktor/util/reflect/TypeInfo;", "copy", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)Lio/ktor/util/AttributeKey;", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "Lio/ktor/util/reflect/TypeInfo;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AttributeKey<T> {
    private final String name;
    private final TypeInfo type;

    public AttributeKey(String name) {
        this(name, null, 2, null);
        m.e(name, "name");
    }

    private final TypeInfo getType() {
        return this.type;
    }

    public static AttributeKey copy$default(AttributeKey attributeKey, String str, TypeInfo typeInfo, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = attributeKey.name;
        }
        if ((i3 & 2) != 0) {
            typeInfo = attributeKey.type;
        }
        return attributeKey.copy(str, typeInfo);
    }

    public final String getName() {
        return this.name;
    }

    public final AttributeKey<T> copy(String name, TypeInfo type) {
        m.e(name, "name");
        m.e(type, "type");
        return new AttributeKey<>(name, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributeKey)) {
            return false;
        }
        AttributeKey attributeKey = (AttributeKey) other;
        return m.a(this.name, attributeKey.name) && m.a(this.type, attributeKey.type);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "AttributeKey: " + this.name;
    }

    public AttributeKey(String name, TypeInfo type) {
        m.e(name, "name");
        m.e(type, "type");
        this.name = name;
        this.type = type;
        if (q.N0(name)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    public AttributeKey(String str, TypeInfo typeInfo, int i3, AbstractC2541f abstractC2541f) {
        v vVarA;
        if ((i3 & 2) != 0) {
            InterfaceC0331d interfaceC0331dB = B.f24540a.b(Object.class);
            try {
                vVarA = B.a(Object.class);
            } catch (Throwable unused) {
                vVarA = null;
            }
            typeInfo = new TypeInfo(interfaceC0331dB, vVarA);
        }
        this(str, typeInfo);
    }
}
