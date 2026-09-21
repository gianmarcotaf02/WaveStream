package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0017\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\nJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0015J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R#\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/EntitlementInfos;", "Landroid/os/Parcelable;", "", "", "Lcom/revenuecat/purchases/EntitlementInfo;", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, "Lcom/revenuecat/purchases/VerificationResult;", "verification", "<init>", "(Ljava/util/Map;Lcom/revenuecat/purchases/VerificationResult;)V", "(Ljava/util/Map;)V", androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_SS, "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/EntitlementInfo;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getAll", "()Ljava/util/Map;", "Lcom/revenuecat/purchases/VerificationResult;", "getVerification", "()Lcom/revenuecat/purchases/VerificationResult;", "active", "getActive", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class EntitlementInfos implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.EntitlementInfos> CREATOR = new com.revenuecat.purchases.EntitlementInfos.Creator();
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> active;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> all;
    private final com.revenuecat.purchases.VerificationResult verification;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.EntitlementInfos> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.EntitlementInfos createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            int i3 = parcel.readInt();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i3);
            for (int i9 = 0; i9 != i3; i9++) {
                linkedHashMap.put(parcel.readString(), com.revenuecat.purchases.EntitlementInfo.CREATOR.createFromParcel(parcel));
            }
            return new com.revenuecat.purchases.EntitlementInfos(linkedHashMap, com.revenuecat.purchases.VerificationResult.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.EntitlementInfos[] newArray(int i3) {
            return new com.revenuecat.purchases.EntitlementInfos[i3];
        }
    }

    public EntitlementInfos(java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> all, com.revenuecat.purchases.VerificationResult verification) {
        kotlin.jvm.internal.m.e(all, "all");
        kotlin.jvm.internal.m.e(verification, "verification");
        this.all = all;
        this.verification = verification;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.EntitlementInfo> entry : all.entrySet()) {
            if (entry.getValue().getIsActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.active = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!com.revenuecat.purchases.EntitlementInfos.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.EntitlementInfos");
        com.revenuecat.purchases.EntitlementInfos entitlementInfos = (com.revenuecat.purchases.EntitlementInfos) other;
        return kotlin.jvm.internal.m.a(this.all, entitlementInfos.all) && kotlin.jvm.internal.m.a(this.active, entitlementInfos.active) && this.verification == entitlementInfos.verification;
    }

    public final com.revenuecat.purchases.EntitlementInfo get(java.lang.String s9) {
        kotlin.jvm.internal.m.e(s9, "s");
        return this.all.get(s9);
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> getActive() {
        return this.active;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> getAll() {
        return this.all;
    }

    public final com.revenuecat.purchases.VerificationResult getVerification() {
        return this.verification;
    }

    public int hashCode() {
        return this.active.hashCode() + (this.all.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> map = this.all;
        parcel.writeInt(map.size());
        for (java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.EntitlementInfo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, flags);
        }
        parcel.writeString(this.verification.name());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public EntitlementInfos(java.util.Map<java.lang.String, com.revenuecat.purchases.EntitlementInfo> all) {
        this(all, com.revenuecat.purchases.VerificationResult.NOT_REQUESTED);
        kotlin.jvm.internal.m.e(all, "all");
    }
}
