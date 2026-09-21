package com.revenuecat.purchases.virtualcurrencies;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0011\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\"¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "Landroid/os/Parcelable;", "", "balance", "", "name", "code", "serverDescription", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getBalance", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getCode", "getServerDescription", "getServerDescription$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class VirtualCurrency implements android.os.Parcelable {
    private final int balance;
    private final java.lang.String code;
    private final java.lang.String name;
    private final java.lang.String serverDescription;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.virtualcurrencies.VirtualCurrency.Companion INSTANCE = new com.revenuecat.purchases.virtualcurrencies.VirtualCurrency.Companion(null);
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.virtualcurrencies.VirtualCurrency> CREATOR = new com.revenuecat.purchases.virtualcurrencies.VirtualCurrency.Creator();

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrency;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.virtualcurrencies.VirtualCurrency$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.virtualcurrencies.VirtualCurrency> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrency createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            return new com.revenuecat.purchases.virtualcurrencies.VirtualCurrency(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.virtualcurrencies.VirtualCurrency[] newArray(int i3) {
            return new com.revenuecat.purchases.virtualcurrencies.VirtualCurrency[i3];
        }
    }

    @p070h6.c
    public /* synthetic */ VirtualCurrency(int i3, int i9, java.lang.String str, java.lang.String str2, @p119n8.h("description") java.lang.String str3, p153r8.k0 k0Var) {
        if (7 != (i3 & 7)) {
            p153r8.AbstractC2686a0.l(i3, 7, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.balance = i9;
        this.name = str;
        this.code = str2;
        if ((i3 & 8) == 0) {
            this.serverDescription = null;
        } else {
            this.serverDescription = str3;
        }
    }

    @p119n8.h("description")
    public static /* synthetic */ void getServerDescription$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.virtualcurrencies.VirtualCurrency self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.n(0, self.balance, serialDesc);
        output.s(serialDesc, 1, self.name);
        output.s(serialDesc, 2, self.code);
        if (!output.E(serialDesc) && self.serverDescription == null) {
            return;
        }
        output.t(serialDesc, 3, p153r8.p0.f26988a, self.serverDescription);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.virtualcurrencies.VirtualCurrency)) {
            return false;
        }
        com.revenuecat.purchases.virtualcurrencies.VirtualCurrency virtualCurrency = (com.revenuecat.purchases.virtualcurrencies.VirtualCurrency) obj;
        return this.balance == virtualCurrency.balance && kotlin.jvm.internal.m.a(this.name, virtualCurrency.name) && kotlin.jvm.internal.m.a(this.code, virtualCurrency.code) && kotlin.jvm.internal.m.a(this.serverDescription, virtualCurrency.serverDescription);
    }

    public final int getBalance() {
        return this.balance;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getServerDescription() {
        return this.serverDescription;
    }

    public int hashCode() {
        int iA = B2.a.a(B2.a.a(this.balance * 31, 31, this.name), 31, this.code);
        java.lang.String str = this.serverDescription;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualCurrency(balance=");
        sb.append(this.balance);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", serverDescription=");
        return Y6.f.l(sb, this.serverDescription, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeInt(this.balance);
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        parcel.writeString(this.serverDescription);
    }

    public VirtualCurrency(int i3, java.lang.String name, java.lang.String code, java.lang.String str) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(code, "code");
        this.balance = i3;
        this.name = name;
        this.code = code;
        this.serverDescription = str;
    }

    public /* synthetic */ VirtualCurrency(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(i3, str, str2, (i9 & 8) != 0 ? null : str3);
    }
}
