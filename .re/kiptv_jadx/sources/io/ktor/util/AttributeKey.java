package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lio/ktor/util/AttributeKey;", "", "T", "", "name", "Lio/ktor/util/reflect/TypeInfo;", "type", "<init>", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "()Lio/ktor/util/reflect/TypeInfo;", "copy", "(Ljava/lang/String;Lio/ktor/util/reflect/TypeInfo;)Lio/ktor/util/AttributeKey;", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "Lio/ktor/util/reflect/TypeInfo;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class AttributeKey<T> {
    private final java.lang.String name;
    private final io.ktor.util.reflect.TypeInfo type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AttributeKey(java.lang.String name) {
        this(name, null, 2, null);
        kotlin.jvm.internal.m.e(name, "name");
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final io.ktor.util.reflect.TypeInfo getType() {
        return this.type;
    }

    public static /* synthetic */ io.ktor.util.AttributeKey copy$default(io.ktor.util.AttributeKey attributeKey, java.lang.String str, io.ktor.util.reflect.TypeInfo typeInfo, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = attributeKey.name;
        }
        if ((i3 & 2) != 0) {
            typeInfo = attributeKey.type;
        }
        return attributeKey.copy(str, typeInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public final io.ktor.util.AttributeKey<T> copy(java.lang.String name, io.ktor.util.reflect.TypeInfo type) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(type, "type");
        return new io.ktor.util.AttributeKey<>(name, type);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.AttributeKey)) {
            return false;
        }
        io.ktor.util.AttributeKey attributeKey = (io.ktor.util.AttributeKey) other;
        return kotlin.jvm.internal.m.a(this.name, attributeKey.name) && kotlin.jvm.internal.m.a(this.type, attributeKey.type);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.name.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "AttributeKey: " + this.name;
    }

    public AttributeKey(java.lang.String name, io.ktor.util.reflect.TypeInfo type) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(type, "type");
        this.name = name;
        this.type = type;
        if (O7.q.N0(name)) {
            throw new java.lang.IllegalArgumentException("Name can't be blank");
        }
    }

    public AttributeKey(java.lang.String str, io.ktor.util.reflect.TypeInfo typeInfo, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        E6.v vVarA;
        if ((i3 & 2) != 0) {
            E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(java.lang.Object.class);
            try {
                vVarA = kotlin.jvm.internal.B.a(java.lang.Object.class);
            } catch (java.lang.Throwable unused) {
                vVarA = null;
            }
            typeInfo = new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA);
        }
        this(str, typeInfo);
    }
}
