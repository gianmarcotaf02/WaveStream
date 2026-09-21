package com.revenuecat.purchases.virtualcurrencies;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001d\b\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "Landroid/os/Parcelable;", "", "", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, "<init>", "(Ljava/util/Map;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/Map;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "code", "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getAll", "()Ljava/util/Map;", "getAll$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class VirtualCurrencies implements android.os.Parcelable {
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency> all;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies.Companion INSTANCE = new com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies.Companion(null);
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies> CREATOR = new com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies.Creator();
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {new p153r8.F(p153r8.p0.f26988a, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency$$serializer.INSTANCE, 1)};

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            int i3 = parcel.readInt();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i3);
            for (int i9 = 0; i9 != i3; i9++) {
                linkedHashMap.put(parcel.readString(), com.revenuecat.purchases.virtualcurrencies.VirtualCurrency.CREATOR.createFromParcel(parcel));
            }
            return new com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies[] newArray(int i3) {
            return new com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies[i3];
        }
    }

    @p070h6.c
    public /* synthetic */ VirtualCurrencies(int i3, @p119n8.h("virtual_currencies") java.util.Map map, p153r8.k0 k0Var) {
        if (1 == (i3 & 1)) {
            this.all = map;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    @p119n8.h("virtual_currencies")
    public static /* synthetic */ void getAll$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies) && kotlin.jvm.internal.m.a(this.all, ((com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies) obj).all);
    }

    public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrency get(java.lang.String code) {
        kotlin.jvm.internal.m.e(code, "code");
        return this.all.get(code);
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency> getAll() {
        return this.all;
    }

    public int hashCode() {
        return this.all.hashCode();
    }

    public java.lang.String toString() {
        return p121o0.p.r(new java.lang.StringBuilder("VirtualCurrencies(all="), this.all, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        java.util.Map<java.lang.String, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency> map = this.all;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, flags);
        }
    }

    public VirtualCurrencies(java.util.Map<java.lang.String, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency> all) {
        kotlin.jvm.internal.m.e(all, "all");
        this.all = all;
    }
}
