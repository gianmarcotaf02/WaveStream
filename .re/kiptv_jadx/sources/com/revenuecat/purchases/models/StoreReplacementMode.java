package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/models/StoreReplacementMode;", "Lcom/revenuecat/purchases/ReplacementMode;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StoreReplacementMode implements com.revenuecat.purchases.ReplacementMode {
    public static final com.revenuecat.purchases.models.StoreReplacementMode CHARGE_FULL_PRICE;
    public static final com.revenuecat.purchases.models.StoreReplacementMode CHARGE_PRORATED_PRICE;
    public static final com.revenuecat.purchases.models.StoreReplacementMode DEFERRED;
    public static final com.revenuecat.purchases.models.StoreReplacementMode WITHOUT_PRORATION;
    public static final com.revenuecat.purchases.models.StoreReplacementMode WITH_TIME_PRORATION;
    private static final java.util.List<com.revenuecat.purchases.models.StoreReplacementMode> allModes;
    private final java.lang.String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.models.StoreReplacementMode.Companion INSTANCE = new com.revenuecat.purchases.models.StoreReplacementMode.Companion(null);
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.models.StoreReplacementMode> CREATOR = new com.revenuecat.purchases.models.StoreReplacementMode.Creator();

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/models/StoreReplacementMode$Companion;", "", "()V", "CHARGE_FULL_PRICE", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "CHARGE_PRORATED_PRICE", "DEFERRED", "WITHOUT_PRORATION", "WITH_TIME_PRORATION", "allModes", "", "fromName", "name", "", "fromName$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.models.StoreReplacementMode fromName$purchases_defaultsRelease(java.lang.String name) {
            java.lang.Object next;
            kotlin.jvm.internal.m.e(name, "name");
            java.util.Iterator it = com.revenuecat.purchases.models.StoreReplacementMode.allModes.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (kotlin.jvm.internal.m.a(((com.revenuecat.purchases.models.StoreReplacementMode) next).getName(), name)) {
                    return (com.revenuecat.purchases.models.StoreReplacementMode) next;
                }
            }
            next = null;
            return (com.revenuecat.purchases.models.StoreReplacementMode) next;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.models.StoreReplacementMode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.StoreReplacementMode createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            return new com.revenuecat.purchases.models.StoreReplacementMode(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.models.StoreReplacementMode[] newArray(int i3) {
            return new com.revenuecat.purchases.models.StoreReplacementMode[i3];
        }
    }

    static {
        com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode = new com.revenuecat.purchases.models.StoreReplacementMode("WITHOUT_PRORATION");
        WITHOUT_PRORATION = storeReplacementMode;
        com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode2 = new com.revenuecat.purchases.models.StoreReplacementMode("WITH_TIME_PRORATION");
        WITH_TIME_PRORATION = storeReplacementMode2;
        com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode3 = new com.revenuecat.purchases.models.StoreReplacementMode("CHARGE_FULL_PRICE");
        CHARGE_FULL_PRICE = storeReplacementMode3;
        com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode4 = new com.revenuecat.purchases.models.StoreReplacementMode("CHARGE_PRORATED_PRICE");
        CHARGE_PRORATED_PRICE = storeReplacementMode4;
        com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode5 = new com.revenuecat.purchases.models.StoreReplacementMode("DEFERRED");
        DEFERRED = storeReplacementMode5;
        allModes = p078i6.p.B0(storeReplacementMode, storeReplacementMode2, storeReplacementMode3, storeReplacementMode4, storeReplacementMode5);
    }

    public StoreReplacementMode(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        this.name = name;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.revenuecat.purchases.models.StoreReplacementMode) && kotlin.jvm.internal.m.a(this.name, ((com.revenuecat.purchases.models.StoreReplacementMode) obj).name);
    }

    @Override // com.revenuecat.purchases.ReplacementMode
    public java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public java.lang.String toString() {
        return getName();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeString(this.name);
    }
}
