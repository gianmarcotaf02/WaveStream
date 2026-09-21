package com.revenuecat.purchases.common;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/Delay;", "", "LP7/b;", "minDelay", "maxDelay", "<init>", "(Ljava/lang/String;IJJ)V", "J", "getMinDelay-UwyO8pc", "()J", "getMaxDelay-UwyO8pc", "NONE", "DEFAULT", "LONG", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Delay {
    private static final /* synthetic */ com.revenuecat.purchases.common.Delay[] $VALUES;
    public static final com.revenuecat.purchases.common.Delay DEFAULT;
    public static final com.revenuecat.purchases.common.Delay LONG;
    public static final com.revenuecat.purchases.common.Delay NONE;
    private final long maxDelay;
    private final long minDelay;

    private static final /* synthetic */ com.revenuecat.purchases.common.Delay[] $values() {
        return new com.revenuecat.purchases.common.Delay[]{NONE, DEFAULT, LONG};
    }

    static {
        P7.a aVar = P7.b.f8168i;
        P7.d dVar = P7.d.MILLISECONDS;
        NONE = new com.revenuecat.purchases.common.Delay("NONE", 0, E8.l.N(0, dVar), E8.l.N(0, dVar));
        long jN = E8.l.N(0, dVar);
        com.revenuecat.purchases.common.DispatcherConstants dispatcherConstants = com.revenuecat.purchases.common.DispatcherConstants.INSTANCE;
        DEFAULT = new com.revenuecat.purchases.common.Delay("DEFAULT", 1, jN, dispatcherConstants.m129getJitterDelayUwyO8pc());
        LONG = new com.revenuecat.purchases.common.Delay("LONG", 2, dispatcherConstants.m129getJitterDelayUwyO8pc(), dispatcherConstants.m130getJitterLongDelayUwyO8pc());
        $VALUES = $values();
    }

    private Delay(java.lang.String str, int i3, long j, long j9) {
        super(str, i3);
        this.minDelay = j;
        this.maxDelay = j9;
    }

    public static com.revenuecat.purchases.common.Delay valueOf(java.lang.String str) {
        return (com.revenuecat.purchases.common.Delay) java.lang.Enum.valueOf(com.revenuecat.purchases.common.Delay.class, str);
    }

    public static com.revenuecat.purchases.common.Delay[] values() {
        return (com.revenuecat.purchases.common.Delay[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getMaxDelay-UwyO8pc, reason: not valid java name and from getter */
    public final long getMaxDelay() {
        return this.maxDelay;
    }

    /* JADX INFO: renamed from: getMinDelay-UwyO8pc, reason: not valid java name and from getter */
    public final long getMinDelay() {
        return this.minDelay;
    }
}
