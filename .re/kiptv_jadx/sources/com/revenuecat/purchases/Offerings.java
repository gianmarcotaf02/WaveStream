package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002)*B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007BQ\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J[\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u001eJ\u0013\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0013\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0086\u0002J\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\u0006J\u0010\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020\u0006J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "", io.sentry.protocol.SentryThread.JsonKeys.CURRENT, "Lcom/revenuecat/purchases/Offering;", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, "", "", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;)V", "placements", "Lcom/revenuecat/purchases/Offerings$Placements;", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "originalSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "loadedFromDiskCache", "", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;Lcom/revenuecat/purchases/Offerings$Placements;Lcom/revenuecat/purchases/Offerings$Targeting;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;Z)V", "getAll", "()Ljava/util/Map;", "getCurrent", "()Lcom/revenuecat/purchases/Offering;", "getLoadedFromDiskCache$purchases_defaultsRelease", "()Z", "getOriginalSource$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "getPlacements$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Offerings$Placements;", "getTargeting$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Offerings$Targeting;", "copy", "copy$purchases_defaultsRelease", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "get", io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER, "getCurrentOfferingForPlacement", "placementId", "getOffering", "hashCode", "", "toString", "Placements", "Targeting", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Offerings {
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> all;
    private final com.revenuecat.purchases.Offering current;
    private final boolean loadedFromDiskCache;
    private final com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource;
    private final com.revenuecat.purchases.Offerings.Placements placements;
    private final com.revenuecat.purchases.Offerings.Targeting targeting;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J-\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/Offerings$Placements;", "", "fallbackOfferingId", "", "offeringIdsByPlacement", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getFallbackOfferingId", "()Ljava/lang/String;", "getOfferingIdsByPlacement", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Placements {
        private final java.lang.String fallbackOfferingId;
        private final java.util.Map<java.lang.String, java.lang.String> offeringIdsByPlacement;

        public Placements(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> offeringIdsByPlacement) {
            kotlin.jvm.internal.m.e(offeringIdsByPlacement, "offeringIdsByPlacement");
            this.fallbackOfferingId = str;
            this.offeringIdsByPlacement = offeringIdsByPlacement;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.revenuecat.purchases.Offerings.Placements copy$default(com.revenuecat.purchases.Offerings.Placements placements, java.lang.String str, java.util.Map map, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = placements.fallbackOfferingId;
            }
            if ((i3 & 2) != 0) {
                map = placements.offeringIdsByPlacement;
            }
            return placements.copy(str, map);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return this.offeringIdsByPlacement;
        }

        public final com.revenuecat.purchases.Offerings.Placements copy(java.lang.String fallbackOfferingId, java.util.Map<java.lang.String, java.lang.String> offeringIdsByPlacement) {
            kotlin.jvm.internal.m.e(offeringIdsByPlacement, "offeringIdsByPlacement");
            return new com.revenuecat.purchases.Offerings.Placements(fallbackOfferingId, offeringIdsByPlacement);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.Offerings.Placements)) {
                return false;
            }
            com.revenuecat.purchases.Offerings.Placements placements = (com.revenuecat.purchases.Offerings.Placements) other;
            return kotlin.jvm.internal.m.a(this.fallbackOfferingId, placements.fallbackOfferingId) && kotlin.jvm.internal.m.a(this.offeringIdsByPlacement, placements.offeringIdsByPlacement);
        }

        public final java.lang.String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getOfferingIdsByPlacement() {
            return this.offeringIdsByPlacement;
        }

        public int hashCode() {
            java.lang.String str = this.fallbackOfferingId;
            return this.offeringIdsByPlacement.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Placements(fallbackOfferingId=");
            sb.append(this.fallbackOfferingId);
            sb.append(", offeringIdsByPlacement=");
            return p121o0.p.r(sb, this.offeringIdsByPlacement, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/Offerings$Targeting;", "", "revision", "", "ruleId", "", "(ILjava/lang/String;)V", "getRevision", "()I", "getRuleId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Targeting {
        private final int revision;
        private final java.lang.String ruleId;

        public Targeting(int i3, java.lang.String ruleId) {
            kotlin.jvm.internal.m.e(ruleId, "ruleId");
            this.revision = i3;
            this.ruleId = ruleId;
        }

        public static /* synthetic */ com.revenuecat.purchases.Offerings.Targeting copy$default(com.revenuecat.purchases.Offerings.Targeting targeting, int i3, java.lang.String str, int i9, java.lang.Object obj) {
            if ((i9 & 1) != 0) {
                i3 = targeting.revision;
            }
            if ((i9 & 2) != 0) {
                str = targeting.ruleId;
            }
            return targeting.copy(i3, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getRevision() {
            return this.revision;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getRuleId() {
            return this.ruleId;
        }

        public final com.revenuecat.purchases.Offerings.Targeting copy(int revision, java.lang.String ruleId) {
            kotlin.jvm.internal.m.e(ruleId, "ruleId");
            return new com.revenuecat.purchases.Offerings.Targeting(revision, ruleId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.Offerings.Targeting)) {
                return false;
            }
            com.revenuecat.purchases.Offerings.Targeting targeting = (com.revenuecat.purchases.Offerings.Targeting) other;
            return this.revision == targeting.revision && kotlin.jvm.internal.m.a(this.ruleId, targeting.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final java.lang.String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return this.ruleId.hashCode() + (java.lang.Integer.hashCode(this.revision) * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Targeting(revision=");
            sb.append(this.revision);
            sb.append(", ruleId=");
            return Y6.f.l(sb, this.ruleId, ')');
        }
    }

    public Offerings(com.revenuecat.purchases.Offering offering, java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> all, com.revenuecat.purchases.Offerings.Placements placements, com.revenuecat.purchases.Offerings.Targeting targeting, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource, boolean z6) {
        kotlin.jvm.internal.m.e(all, "all");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        this.current = offering;
        this.all = all;
        this.placements = placements;
        this.targeting = targeting;
        this.originalSource = originalSource;
        this.loadedFromDiskCache = z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.Offerings copy$purchases_defaultsRelease$default(com.revenuecat.purchases.Offerings offerings, com.revenuecat.purchases.Offering offering, java.util.Map map, com.revenuecat.purchases.Offerings.Placements placements, com.revenuecat.purchases.Offerings.Targeting targeting, com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            offering = offerings.current;
        }
        if ((i3 & 2) != 0) {
            map = offerings.all;
        }
        if ((i3 & 4) != 0) {
            placements = offerings.placements;
        }
        if ((i3 & 8) != 0) {
            targeting = offerings.targeting;
        }
        if ((i3 & 16) != 0) {
            hTTPResponseOriginalSource = offerings.originalSource;
        }
        if ((i3 & 32) != 0) {
            z6 = offerings.loadedFromDiskCache;
        }
        com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource2 = hTTPResponseOriginalSource;
        boolean z9 = z6;
        return offerings.copy$purchases_defaultsRelease(offering, map, placements, targeting, hTTPResponseOriginalSource2, z9);
    }

    public final com.revenuecat.purchases.Offerings copy$purchases_defaultsRelease(com.revenuecat.purchases.Offering current, java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> all, com.revenuecat.purchases.Offerings.Placements placements, com.revenuecat.purchases.Offerings.Targeting targeting, com.revenuecat.purchases.common.HTTPResponseOriginalSource originalSource, boolean loadedFromDiskCache) {
        kotlin.jvm.internal.m.e(all, "all");
        kotlin.jvm.internal.m.e(originalSource, "originalSource");
        return new com.revenuecat.purchases.Offerings(current, all, placements, targeting, originalSource, loadedFromDiskCache);
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof com.revenuecat.purchases.Offerings) && new com.revenuecat.purchases.OfferingsComparableData(this).equals(new com.revenuecat.purchases.OfferingsComparableData((com.revenuecat.purchases.Offerings) other));
    }

    public final com.revenuecat.purchases.Offering get(java.lang.String identifier) {
        kotlin.jvm.internal.m.e(identifier, "identifier");
        return getOffering(identifier);
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> getAll() {
        return this.all;
    }

    public final com.revenuecat.purchases.Offering getCurrent() {
        return this.current;
    }

    public final com.revenuecat.purchases.Offering getCurrentOfferingForPlacement(java.lang.String placementId) {
        kotlin.jvm.internal.m.e(placementId, "placementId");
        com.revenuecat.purchases.Offerings.Placements placements = this.placements;
        if (placements == null) {
            return null;
        }
        java.lang.String str = placements.getOfferingIdsByPlacement().get(placementId);
        com.revenuecat.purchases.Offering offering = str != null ? getOffering(str) : null;
        java.lang.String fallbackOfferingId = placements.getFallbackOfferingId();
        com.revenuecat.purchases.Offering offering2 = fallbackOfferingId != null ? getOffering(fallbackOfferingId) : null;
        boolean zContainsKey = placements.getOfferingIdsByPlacement().containsKey(placementId);
        if (offering == null) {
            offering = zContainsKey ? null : offering2;
        }
        if (offering != null) {
            return com.revenuecat.purchases.OfferingsKt.withPresentedContext(offering, placementId, this.targeting);
        }
        return null;
    }

    /* JADX INFO: renamed from: getLoadedFromDiskCache$purchases_defaultsRelease, reason: from getter */
    public final boolean getLoadedFromDiskCache() {
        return this.loadedFromDiskCache;
    }

    public final com.revenuecat.purchases.Offering getOffering(java.lang.String identifier) {
        kotlin.jvm.internal.m.e(identifier, "identifier");
        return this.all.get(identifier);
    }

    /* JADX INFO: renamed from: getOriginalSource$purchases_defaultsRelease, reason: from getter */
    public final com.revenuecat.purchases.common.HTTPResponseOriginalSource getOriginalSource() {
        return this.originalSource;
    }

    /* JADX INFO: renamed from: getPlacements$purchases_defaultsRelease, reason: from getter */
    public final com.revenuecat.purchases.Offerings.Placements getPlacements() {
        return this.placements;
    }

    /* JADX INFO: renamed from: getTargeting$purchases_defaultsRelease, reason: from getter */
    public final com.revenuecat.purchases.Offerings.Targeting getTargeting() {
        return this.targeting;
    }

    public int hashCode() {
        return new com.revenuecat.purchases.OfferingsComparableData(this).hashCode();
    }

    public java.lang.String toString() {
        return "<Offerings\n current: " + this.current + "\nall:  " + this.all + ",\nplacements: " + this.placements + ",\ntargeting: " + this.targeting + "\n>";
    }

    public /* synthetic */ Offerings(com.revenuecat.purchases.Offering offering, java.util.Map map, com.revenuecat.purchases.Offerings.Placements placements, com.revenuecat.purchases.Offerings.Targeting targeting, com.revenuecat.purchases.common.HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(offering, map, (i3 & 4) != 0 ? null : placements, (i3 & 8) != 0 ? null : targeting, (i3 & 16) != 0 ? com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN : hTTPResponseOriginalSource, (i3 & 32) != 0 ? false : z6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offerings(com.revenuecat.purchases.Offering offering, java.util.Map<java.lang.String, com.revenuecat.purchases.Offering> all) {
        this(offering, all, null, null, null, false, 48, null);
        kotlin.jvm.internal.m.e(all, "all");
    }
}
