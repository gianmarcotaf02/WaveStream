package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u0011\u0010 \u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\n¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "code", "", "underlyingErrorMessage", "<init>", "(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "getCode", "()Lcom/revenuecat/purchases/PurchasesErrorCode;", "Ljava/lang/String;", "getUnderlyingErrorMessage", "getMessage", "message", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesError implements android.os.Parcelable, java.io.Serializable {
    private static final long serialVersionUID = 81719171;
    private final com.revenuecat.purchases.PurchasesErrorCode code;
    private final java.lang.String underlyingErrorMessage;
    public static final android.os.Parcelable.Creator<com.revenuecat.purchases.PurchasesError> CREATOR = new com.revenuecat.purchases.PurchasesError.Creator();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements android.os.Parcelable.Creator<com.revenuecat.purchases.PurchasesError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.PurchasesError createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.m.e(parcel, "parcel");
            return new com.revenuecat.purchases.PurchasesError(com.revenuecat.purchases.PurchasesErrorCode.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.revenuecat.purchases.PurchasesError[] newArray(int i3) {
            return new com.revenuecat.purchases.PurchasesError[i3];
        }
    }

    public PurchasesError(com.revenuecat.purchases.PurchasesErrorCode code, java.lang.String str) {
        kotlin.jvm.internal.m.e(code, "code");
        this.code = code;
        this.underlyingErrorMessage = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!com.revenuecat.purchases.PurchasesError.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(other, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesError");
        com.revenuecat.purchases.PurchasesError purchasesError = (com.revenuecat.purchases.PurchasesError) other;
        return this.code == purchasesError.code && kotlin.jvm.internal.m.a(this.underlyingErrorMessage, purchasesError.underlyingErrorMessage);
    }

    public final com.revenuecat.purchases.PurchasesErrorCode getCode() {
        return this.code;
    }

    public final java.lang.String getMessage() {
        return this.code.getDescription();
    }

    public final java.lang.String getUnderlyingErrorMessage() {
        return this.underlyingErrorMessage;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        java.lang.String str = this.underlyingErrorMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PurchasesError(code=" + this.code + ", underlyingErrorMessage=" + this.underlyingErrorMessage + ", message='" + getMessage() + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int flags) {
        kotlin.jvm.internal.m.e(parcel, "out");
        parcel.writeString(this.code.name());
        parcel.writeString(this.underlyingErrorMessage);
    }

    public /* synthetic */ PurchasesError(com.revenuecat.purchases.PurchasesErrorCode purchasesErrorCode, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(purchasesErrorCode, (i3 & 2) != 0 ? null : str);
    }
}
