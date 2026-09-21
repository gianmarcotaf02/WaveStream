package com.revenuecat.purchases;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.revenuecat.purchases.CustomerInfoOriginalSource, still in use, count: 1, list:
  (r0v0 com.revenuecat.purchases.CustomerInfoOriginalSource) from 0x002c: SPUT (r0v0 com.revenuecat.purchases.CustomerInfoOriginalSource) (LINE:45) com.revenuecat.purchases.CustomerInfoOriginalSource.DEFAULT com.revenuecat.purchases.CustomerInfoOriginalSource
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "", "(Ljava/lang/String;I)V", "MAIN", "LOAD_SHEDDER", "OFFLINE_ENTITLEMENTS", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfoOriginalSource {
    MAIN,
    LOAD_SHEDDER,
    OFFLINE_ENTITLEMENTS;

    private static final com.revenuecat.purchases.CustomerInfoOriginalSource DEFAULT = new com.revenuecat.purchases.CustomerInfoOriginalSource();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.CustomerInfoOriginalSource.Companion INSTANCE = new com.revenuecat.purchases.CustomerInfoOriginalSource.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoOriginalSource$Companion;", "", "()V", "DEFAULT", "Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "getDEFAULT", "()Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "fromString", "originalSourceString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.CustomerInfoOriginalSource fromString(java.lang.String originalSourceString) {
            if (originalSourceString == null) {
                return getDEFAULT();
            }
            try {
                return com.revenuecat.purchases.CustomerInfoOriginalSource.valueOf(originalSourceString);
            } catch (java.lang.IllegalArgumentException e6) {
                com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Invalid CustomerInfo original source deserializing from cache", e6);
                return getDEFAULT();
            }
        }

        public final com.revenuecat.purchases.CustomerInfoOriginalSource getDEFAULT() {
            return com.revenuecat.purchases.CustomerInfoOriginalSource.DEFAULT;
        }

        private Companion() {
        }
    }

    static {
    }

    private CustomerInfoOriginalSource() {
        super(str, i);
    }

    public static com.revenuecat.purchases.CustomerInfoOriginalSource valueOf(java.lang.String str) {
        return (com.revenuecat.purchases.CustomerInfoOriginalSource) java.lang.Enum.valueOf(com.revenuecat.purchases.CustomerInfoOriginalSource.class, str);
    }

    public static com.revenuecat.purchases.CustomerInfoOriginalSource[] values() {
        return (com.revenuecat.purchases.CustomerInfoOriginalSource[]) $VALUES.clone();
    }
}
