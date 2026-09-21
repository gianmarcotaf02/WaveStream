package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialPackageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "<init>", "(Ljava/lang/Boolean;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PartialPackageComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class PartialPackageComponent implements com.revenuecat.purchases.paywalls.components.PartialComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.PartialPackageComponent.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PartialPackageComponent.Companion(null);
    private final java.lang.Boolean visible;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialPackageComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PartialPackageComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.PartialPackageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PartialPackageComponent() {
        this((java.lang.Boolean) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PartialPackageComponent self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.visible == null) {
            return;
        }
        output.t(serialDesc, 0, p153r8.C2696g.f26961a, self.visible);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.revenuecat.purchases.paywalls.components.PartialPackageComponent) && kotlin.jvm.internal.m.a(this.visible, ((com.revenuecat.purchases.paywalls.components.PartialPackageComponent) obj).visible);
    }

    public final /* synthetic */ java.lang.Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.visible;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public java.lang.String toString() {
        return "PartialPackageComponent(visible=" + this.visible + ')';
    }

    @p070h6.c
    public /* synthetic */ PartialPackageComponent(int i3, java.lang.Boolean bool, p153r8.k0 k0Var) {
        if ((i3 & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
    }

    public PartialPackageComponent(java.lang.Boolean bool) {
        this.visible = bool;
    }

    public /* synthetic */ PartialPackageComponent(java.lang.Boolean bool, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : bool);
    }
}
