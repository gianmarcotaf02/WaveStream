package io.ktor.utils.io.core;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BIG_ENDIAN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/ktor/utils/io/core/ByteOrder;", "", "Ljava/nio/ByteOrder;", "nioOrder", "<init>", "(Ljava/lang/String;ILjava/nio/ByteOrder;)V", "Ljava/nio/ByteOrder;", "getNioOrder", "()Ljava/nio/ByteOrder;", "Companion", "BIG_ENDIAN", "LITTLE_ENDIAN", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteOrder {
    private static final /* synthetic */ p126o6.a $ENTRIES;
    private static final /* synthetic */ io.ktor.utils.io.core.ByteOrder[] $VALUES;
    public static final io.ktor.utils.io.core.ByteOrder BIG_ENDIAN;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.utils.io.core.ByteOrder.Companion INSTANCE;
    public static final io.ktor.utils.io.core.ByteOrder LITTLE_ENDIAN;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    private static final io.ktor.utils.io.core.ByteOrder f7native;
    private final java.nio.ByteOrder nioOrder;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/utils/io/core/ByteOrder$Companion;", "", "<init>", "()V", "Ljava/nio/ByteOrder;", "nioOrder", "Lio/ktor/utils/io/core/ByteOrder;", "of", "(Ljava/nio/ByteOrder;)Lio/ktor/utils/io/core/ByteOrder;", "nativeOrder", "()Lio/ktor/utils/io/core/ByteOrder;", io.sentry.protocol.SentryStackFrame.JsonKeys.NATIVE, "Lio/ktor/utils/io/core/ByteOrder;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.utils.io.core.ByteOrder nativeOrder() {
            return io.ktor.utils.io.core.ByteOrder.f7native;
        }

        public final io.ktor.utils.io.core.ByteOrder of(java.nio.ByteOrder nioOrder) {
            kotlin.jvm.internal.m.e(nioOrder, "nioOrder");
            return io.ktor.utils.io.core.ByteOrderJVMKt.orderOf(nioOrder);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ io.ktor.utils.io.core.ByteOrder[] $values() {
        return new io.ktor.utils.io.core.ByteOrder[]{BIG_ENDIAN, LITTLE_ENDIAN};
    }

    static {
        java.nio.ByteOrder BIG_ENDIAN2 = java.nio.ByteOrder.BIG_ENDIAN;
        kotlin.jvm.internal.m.d(BIG_ENDIAN2, "BIG_ENDIAN");
        BIG_ENDIAN = new io.ktor.utils.io.core.ByteOrder("BIG_ENDIAN", 0, BIG_ENDIAN2);
        java.nio.ByteOrder LITTLE_ENDIAN2 = java.nio.ByteOrder.LITTLE_ENDIAN;
        kotlin.jvm.internal.m.d(LITTLE_ENDIAN2, "LITTLE_ENDIAN");
        LITTLE_ENDIAN = new io.ktor.utils.io.core.ByteOrder("LITTLE_ENDIAN", 1, LITTLE_ENDIAN2);
        io.ktor.utils.io.core.ByteOrder[] byteOrderArr$values = $values();
        $VALUES = byteOrderArr$values;
        $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(byteOrderArr$values);
        INSTANCE = new io.ktor.utils.io.core.ByteOrder.Companion(null);
        java.nio.ByteOrder byteOrderNativeOrder = java.nio.ByteOrder.nativeOrder();
        kotlin.jvm.internal.m.d(byteOrderNativeOrder, "nativeOrder(...)");
        f7native = io.ktor.utils.io.core.ByteOrderJVMKt.orderOf(byteOrderNativeOrder);
    }

    private ByteOrder(java.lang.String str, int i3, java.nio.ByteOrder byteOrder) {
        super(str, i3);
        this.nioOrder = byteOrder;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public static io.ktor.utils.io.core.ByteOrder valueOf(java.lang.String str) {
        return (io.ktor.utils.io.core.ByteOrder) java.lang.Enum.valueOf(io.ktor.utils.io.core.ByteOrder.class, str);
    }

    public static io.ktor.utils.io.core.ByteOrder[] values() {
        return (io.ktor.utils.io.core.ByteOrder[]) $VALUES.clone();
    }

    public final java.nio.ByteOrder getNioOrder() {
        return this.nioOrder;
    }
}
