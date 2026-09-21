package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@p070h6.c
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\bj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "", "Lcom/revenuecat/purchases/ReplacementMode;", "", "playBillingClientMode", "<init>", "(Ljava/lang/String;II)V", "describeContents", "()I", "Landroid/os/Parcel;", "out", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getPlayBillingClientMode", "CREATOR", "WITHOUT_PRORATION", "WITH_TIME_PRORATION", "CHARGE_FULL_PRICE", "CHARGE_PRORATED_PRICE", "DEFERRED", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum GoogleReplacementMode implements com.revenuecat.purchases.ReplacementMode {
    WITHOUT_PRORATION(3),
    WITH_TIME_PRORATION(1),
    CHARGE_FULL_PRICE(5),
    CHARGE_PRORATED_PRICE(2),
    DEFERRED(6);


    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.models.GoogleReplacementMode.Companion INSTANCE = new com.revenuecat.purchases.models.GoogleReplacementMode.Companion(null);
    private final int playBillingClientMode;

    /* JADX INFO: renamed from: com.revenuecat.purchases.models.GoogleReplacementMode$CREATOR, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleReplacementMode$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "()V", "createFromParcel", "in", "Landroid/os/Parcel;", "fromPlayBillingClientMode", "playBillingClientMode", "", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "newArray", "", "size", "(I)[Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements android.os.Parcelable.Creator<com.revenuecat.purchases.models.GoogleReplacementMode> {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.models.GoogleReplacementMode fromPlayBillingClientMode(java.lang.Integer playBillingClientMode) {
            if (playBillingClientMode == null) {
                return null;
            }
            for (com.revenuecat.purchases.models.GoogleReplacementMode googleReplacementMode : com.revenuecat.purchases.models.GoogleReplacementMode.values()) {
                if (playBillingClientMode.intValue() == googleReplacementMode.getPlayBillingClientMode()) {
                    return googleReplacementMode;
                }
            }
            throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.revenuecat.purchases.models.GoogleReplacementMode createFromParcel(android.os.Parcel in) {
            kotlin.jvm.internal.m.e(in, "in");
            java.lang.String string = in.readString();
            if (string != null) {
                return com.revenuecat.purchases.models.GoogleReplacementMode.valueOf(string);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.revenuecat.purchases.models.GoogleReplacementMode[] newArray(int size) {
            return new com.revenuecat.purchases.models.GoogleReplacementMode[size];
        }
    }

    GoogleReplacementMode(int i3) {
        this.playBillingClientMode = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.revenuecat.purchases.ReplacementMode
    public /* bridge */ /* synthetic */ java.lang.String getName() {
        return name();
    }

    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int flags) {
        kotlin.jvm.internal.m.e(out, "out");
        out.writeString(name());
    }
}
