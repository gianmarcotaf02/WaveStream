package io.ktor.util.reflect;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0017\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/ktor/util/reflect/TypeInfo;", "", "LE6/d;", "type", "LE6/v;", "kotlinType", "<init>", "(LE6/d;LE6/v;)V", "Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "(LE6/d;Ljava/lang/reflect/Type;LE6/v;)V", "", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "LE6/d;", "getType", "()LE6/d;", "LE6/v;", "getKotlinType", "()LE6/v;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TypeInfo {
    private final E6.v kotlinType;
    private final E6.InterfaceC0331d type;

    public TypeInfo(E6.InterfaceC0331d type, E6.v vVar) {
        kotlin.jvm.internal.m.e(type, "type");
        this.type = type;
        this.kotlinType = vVar;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.reflect.TypeInfo)) {
            return false;
        }
        E6.v vVar = this.kotlinType;
        if (vVar == null) {
            io.ktor.util.reflect.TypeInfo typeInfo = (io.ktor.util.reflect.TypeInfo) other;
            if (typeInfo.kotlinType == null) {
                return kotlin.jvm.internal.m.a(this.type, typeInfo.type);
            }
        }
        return kotlin.jvm.internal.m.a(vVar, ((io.ktor.util.reflect.TypeInfo) other).kotlinType);
    }

    public final E6.v getKotlinType() {
        return this.kotlinType;
    }

    public final E6.InterfaceC0331d getType() {
        return this.type;
    }

    public int hashCode() {
        E6.v vVar = this.kotlinType;
        return vVar != null ? vVar.hashCode() : this.type.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeInfo(");
        java.lang.Object obj = this.kotlinType;
        if (obj == null) {
            obj = this.type;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TypeInfo(E6.InterfaceC0331d interfaceC0331d, E6.v vVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(interfaceC0331d, (i3 & 2) != 0 ? null : vVar);
    }

    public /* synthetic */ TypeInfo(E6.InterfaceC0331d interfaceC0331d, java.lang.reflect.Type type, E6.v vVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(interfaceC0331d, type, (i3 & 4) != 0 ? null : vVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public TypeInfo(E6.InterfaceC0331d type, java.lang.reflect.Type reifiedType, E6.v vVar) {
        this(type, vVar);
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(reifiedType, "reifiedType");
    }
}
