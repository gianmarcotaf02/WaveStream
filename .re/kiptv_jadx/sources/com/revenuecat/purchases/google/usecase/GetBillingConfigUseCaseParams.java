package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/GetBillingConfigUseCaseParams;", "Lcom/revenuecat/purchases/google/usecase/UseCaseParams;", "appInBackground", "", "(Z)V", "getAppInBackground", "()Z", "component1", "copy", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class GetBillingConfigUseCaseParams implements com.revenuecat.purchases.google.usecase.UseCaseParams {
    private final boolean appInBackground;

    public GetBillingConfigUseCaseParams(boolean z6) {
        this.appInBackground = z6;
    }

    public static /* synthetic */ com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams copy$default(com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = getBillingConfigUseCaseParams.appInBackground;
        }
        return getBillingConfigUseCaseParams.copy(z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAppInBackground() {
        return this.appInBackground;
    }

    public final com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams copy(boolean appInBackground) {
        return new com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams(appInBackground);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams) && this.appInBackground == ((com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams) other).appInBackground;
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.appInBackground);
    }

    public java.lang.String toString() {
        return v5.L.a(new java.lang.StringBuilder("GetBillingConfigUseCaseParams(appInBackground="), this.appInBackground, ')');
    }
}
