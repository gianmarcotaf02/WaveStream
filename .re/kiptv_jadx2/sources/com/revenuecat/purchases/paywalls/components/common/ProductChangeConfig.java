package com.revenuecat.purchases.paywalls.components.common;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.models.StoreReplacementMode;
import com.revenuecat.purchases.paywalls.components.common.serializers.DowngradeReplacementModeDeserializer;
import com.revenuecat.purchases.paywalls.components.common.serializers.UpgradeReplacementModeDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.k0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "upgradeReplacementMode", "downgradeReplacementMode", "<init>", "(Lcom/revenuecat/purchases/models/StoreReplacementMode;Lcom/revenuecat/purchases/models/StoreReplacementMode;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/models/StoreReplacementMode;Lcom/revenuecat/purchases/models/StoreReplacementMode;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "getUpgradeReplacementMode", "()Lcom/revenuecat/purchases/models/StoreReplacementMode;", "getUpgradeReplacementMode$annotations", "()V", "getDowngradeReplacementMode", "getDowngradeReplacementMode$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class ProductChangeConfig {

    public static final Companion INSTANCE = new Companion(null);
    private final StoreReplacementMode downgradeReplacementMode;
    private final StoreReplacementMode upgradeReplacementMode;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ProductChangeConfig;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return ProductChangeConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProductChangeConfig() {
        this((StoreReplacementMode) null, (StoreReplacementMode) (0 == true ? 1 : 0), 3, (AbstractC2541f) (0 == true ? 1 : 0));
    }

    @h("downgrade_replacement_mode")
    @i(with = DowngradeReplacementModeDeserializer.class)
    public static void getDowngradeReplacementMode$annotations() {
    }

    @h("upgrade_replacement_mode")
    @i(with = UpgradeReplacementModeDeserializer.class)
    public static void getUpgradeReplacementMode$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(ProductChangeConfig self, b output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !m.a(self.upgradeReplacementMode, StoreReplacementMode.CHARGE_PRORATED_PRICE)) {
            output.h(serialDesc, 0, UpgradeReplacementModeDeserializer.INSTANCE, self.upgradeReplacementMode);
        }
        if (!output.E(serialDesc) && m.a(self.downgradeReplacementMode, StoreReplacementMode.DEFERRED)) {
            return;
        }
        output.h(serialDesc, 1, DowngradeReplacementModeDeserializer.INSTANCE, self.downgradeReplacementMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductChangeConfig)) {
            return false;
        }
        ProductChangeConfig productChangeConfig = (ProductChangeConfig) obj;
        return m.a(this.upgradeReplacementMode, productChangeConfig.upgradeReplacementMode) && m.a(this.downgradeReplacementMode, productChangeConfig.downgradeReplacementMode);
    }

    public final StoreReplacementMode getDowngradeReplacementMode() {
        return this.downgradeReplacementMode;
    }

    public final StoreReplacementMode getUpgradeReplacementMode() {
        return this.upgradeReplacementMode;
    }

    public int hashCode() {
        return this.downgradeReplacementMode.hashCode() + (this.upgradeReplacementMode.hashCode() * 31);
    }

    public String toString() {
        return "ProductChangeConfig(upgradeReplacementMode=" + this.upgradeReplacementMode + ", downgradeReplacementMode=" + this.downgradeReplacementMode + ')';
    }

    @c
    public ProductChangeConfig(int i3, @h("upgrade_replacement_mode") @i(with = UpgradeReplacementModeDeserializer.class) StoreReplacementMode storeReplacementMode, @h("downgrade_replacement_mode") @i(with = DowngradeReplacementModeDeserializer.class) StoreReplacementMode storeReplacementMode2, k0 k0Var) {
        this.upgradeReplacementMode = (i3 & 1) == 0 ? StoreReplacementMode.CHARGE_PRORATED_PRICE : storeReplacementMode;
        if ((i3 & 2) == 0) {
            this.downgradeReplacementMode = StoreReplacementMode.DEFERRED;
        } else {
            this.downgradeReplacementMode = storeReplacementMode2;
        }
    }

    public ProductChangeConfig(StoreReplacementMode upgradeReplacementMode, StoreReplacementMode downgradeReplacementMode) {
        m.e(upgradeReplacementMode, "upgradeReplacementMode");
        m.e(downgradeReplacementMode, "downgradeReplacementMode");
        this.upgradeReplacementMode = upgradeReplacementMode;
        this.downgradeReplacementMode = downgradeReplacementMode;
    }

    public ProductChangeConfig(StoreReplacementMode storeReplacementMode, StoreReplacementMode storeReplacementMode2, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? StoreReplacementMode.CHARGE_PRORATED_PRICE : storeReplacementMode, (i3 & 2) != 0 ? StoreReplacementMode.DEFERRED : storeReplacementMode2);
    }
}
