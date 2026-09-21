package com.revenuecat.purchases;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryThread;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002)*B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0007BQ\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J[\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u001eJ\u0013\u0010\u001f\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0013\u0010!\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0086\u0002J\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020\u0006J\u0010\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010\"\u001a\u00020\u0006J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "", SentryThread.JsonKeys.CURRENT, "Lcom/revenuecat/purchases/Offering;", TtmlNode.COMBINE_ALL, "", "", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;)V", "placements", "Lcom/revenuecat/purchases/Offerings$Placements;", "targeting", "Lcom/revenuecat/purchases/Offerings$Targeting;", "originalSource", "Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "loadedFromDiskCache", "", "(Lcom/revenuecat/purchases/Offering;Ljava/util/Map;Lcom/revenuecat/purchases/Offerings$Placements;Lcom/revenuecat/purchases/Offerings$Targeting;Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;Z)V", "getAll", "()Ljava/util/Map;", "getCurrent", "()Lcom/revenuecat/purchases/Offering;", "getLoadedFromDiskCache$purchases_defaultsRelease", "()Z", "getOriginalSource$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/common/HTTPResponseOriginalSource;", "getPlacements$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Offerings$Placements;", "getTargeting$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/Offerings$Targeting;", "copy", "copy$purchases_defaultsRelease", "equals", Request.JsonKeys.OTHER, "get", ViewHierarchyNode.JsonKeys.IDENTIFIER, "getCurrentOfferingForPlacement", "placementId", "getOffering", "hashCode", "", "toString", "Placements", "Targeting", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Offerings {
    private final Map<String, Offering> all;
    private final Offering current;
    private final boolean loadedFromDiskCache;
    private final HTTPResponseOriginalSource originalSource;
    private final Placements placements;
    private final Targeting targeting;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0003J-\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/Offerings$Placements;", "", "fallbackOfferingId", "", "offeringIdsByPlacement", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getFallbackOfferingId", "()Ljava/lang/String;", "getOfferingIdsByPlacement", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Placements {
        private final String fallbackOfferingId;
        private final Map<String, String> offeringIdsByPlacement;

        public Placements(String str, Map<String, String> offeringIdsByPlacement) {
            m.e(offeringIdsByPlacement, "offeringIdsByPlacement");
            this.fallbackOfferingId = str;
            this.offeringIdsByPlacement = offeringIdsByPlacement;
        }

        public static Placements copy$default(Placements placements, String str, Map map, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = placements.fallbackOfferingId;
            }
            if ((i3 & 2) != 0) {
                map = placements.offeringIdsByPlacement;
            }
            return placements.copy(str, map);
        }

        public final String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final Map<String, String> component2() {
            return this.offeringIdsByPlacement;
        }

        public final Placements copy(String fallbackOfferingId, Map<String, String> offeringIdsByPlacement) {
            m.e(offeringIdsByPlacement, "offeringIdsByPlacement");
            return new Placements(fallbackOfferingId, offeringIdsByPlacement);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Placements)) {
                return false;
            }
            Placements placements = (Placements) other;
            return m.a(this.fallbackOfferingId, placements.fallbackOfferingId) && m.a(this.offeringIdsByPlacement, placements.offeringIdsByPlacement);
        }

        public final String getFallbackOfferingId() {
            return this.fallbackOfferingId;
        }

        public final Map<String, String> getOfferingIdsByPlacement() {
            return this.offeringIdsByPlacement;
        }

        public int hashCode() {
            String str = this.fallbackOfferingId;
            return this.offeringIdsByPlacement.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Placements(fallbackOfferingId=");
            sb.append(this.fallbackOfferingId);
            sb.append(", offeringIdsByPlacement=");
            return p.r(sb, this.offeringIdsByPlacement, ')');
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/Offerings$Targeting;", "", "revision", "", "ruleId", "", "(ILjava/lang/String;)V", "getRevision", "()I", "getRuleId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Targeting {
        private final int revision;
        private final String ruleId;

        public Targeting(int i3, String ruleId) {
            m.e(ruleId, "ruleId");
            this.revision = i3;
            this.ruleId = ruleId;
        }

        public static Targeting copy$default(Targeting targeting, int i3, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i3 = targeting.revision;
            }
            if ((i9 & 2) != 0) {
                str = targeting.ruleId;
            }
            return targeting.copy(i3, str);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public final Targeting copy(int revision, String ruleId) {
            m.e(ruleId, "ruleId");
            return new Targeting(revision, ruleId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Targeting)) {
                return false;
            }
            Targeting targeting = (Targeting) other;
            return this.revision == targeting.revision && m.a(this.ruleId, targeting.ruleId);
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getRuleId() {
            return this.ruleId;
        }

        public int hashCode() {
            return this.ruleId.hashCode() + (Integer.hashCode(this.revision) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Targeting(revision=");
            sb.append(this.revision);
            sb.append(", ruleId=");
            return f.l(sb, this.ruleId, ')');
        }
    }

    public Offerings(Offering offering, Map<String, Offering> all, Placements placements, Targeting targeting, HTTPResponseOriginalSource originalSource, boolean z6) {
        m.e(all, "all");
        m.e(originalSource, "originalSource");
        this.current = offering;
        this.all = all;
        this.placements = placements;
        this.targeting = targeting;
        this.originalSource = originalSource;
        this.loadedFromDiskCache = z6;
    }

    public static Offerings copy$purchases_defaultsRelease$default(Offerings offerings, Offering offering, Map map, Placements placements, Targeting targeting, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, int i3, Object obj) {
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
        HTTPResponseOriginalSource hTTPResponseOriginalSource2 = hTTPResponseOriginalSource;
        boolean z9 = z6;
        return offerings.copy$purchases_defaultsRelease(offering, map, placements, targeting, hTTPResponseOriginalSource2, z9);
    }

    public final Offerings copy$purchases_defaultsRelease(Offering current, Map<String, Offering> all, Placements placements, Targeting targeting, HTTPResponseOriginalSource originalSource, boolean loadedFromDiskCache) {
        m.e(all, "all");
        m.e(originalSource, "originalSource");
        return new Offerings(current, all, placements, targeting, originalSource, loadedFromDiskCache);
    }

    public boolean equals(Object other) {
        return (other instanceof Offerings) && new OfferingsComparableData(this).equals(new OfferingsComparableData((Offerings) other));
    }

    public final Offering get(String identifier) {
        m.e(identifier, "identifier");
        return getOffering(identifier);
    }

    public final Map<String, Offering> getAll() {
        return this.all;
    }

    public final Offering getCurrent() {
        return this.current;
    }

    public final Offering getCurrentOfferingForPlacement(String placementId) {
        m.e(placementId, "placementId");
        Placements placements = this.placements;
        if (placements == null) {
            return null;
        }
        String str = placements.getOfferingIdsByPlacement().get(placementId);
        Offering offering = str != null ? getOffering(str) : null;
        String fallbackOfferingId = placements.getFallbackOfferingId();
        Offering offering2 = fallbackOfferingId != null ? getOffering(fallbackOfferingId) : null;
        boolean zContainsKey = placements.getOfferingIdsByPlacement().containsKey(placementId);
        if (offering == null) {
            offering = zContainsKey ? null : offering2;
        }
        if (offering != null) {
            return OfferingsKt.withPresentedContext(offering, placementId, this.targeting);
        }
        return null;
    }

    public final boolean getLoadedFromDiskCache() {
        return this.loadedFromDiskCache;
    }

    public final Offering getOffering(String identifier) {
        m.e(identifier, "identifier");
        return this.all.get(identifier);
    }

    public final HTTPResponseOriginalSource getOriginalSource() {
        return this.originalSource;
    }

    public final Placements getPlacements() {
        return this.placements;
    }

    public final Targeting getTargeting() {
        return this.targeting;
    }

    public int hashCode() {
        return new OfferingsComparableData(this).hashCode();
    }

    public String toString() {
        return "<Offerings\n current: " + this.current + "\nall:  " + this.all + ",\nplacements: " + this.placements + ",\ntargeting: " + this.targeting + "\n>";
    }

    public Offerings(Offering offering, Map map, Placements placements, Targeting targeting, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z6, int i3, AbstractC2541f abstractC2541f) {
        this(offering, map, (i3 & 4) != 0 ? null : placements, (i3 & 8) != 0 ? null : targeting, (i3 & 16) != 0 ? HTTPResponseOriginalSource.MAIN : hTTPResponseOriginalSource, (i3 & 32) != 0 ? false : z6);
    }

    public Offerings(Offering offering, Map<String, Offering> all) {
        this(offering, all, null, null, null, false, 48, null);
        m.e(all, "all");
    }
}
