package com.revenuecat.purchases.ads.rewardverification;

import O7.q;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/Outcome;", "", "Failed", "Verified", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Verified;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Outcome {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Verified;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome;", "reward", "Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "moreRewards", "", "(Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;Ljava/util/List;)V", "getMoreRewards", "()Ljava/util/List;", "getReward", "()Lcom/revenuecat/purchases/ads/rewardverification/VerifiedReward;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Verified implements Outcome {
        private final List<VerifiedReward> moreRewards;
        private final VerifiedReward reward;

        public Verified(VerifiedReward reward, List<? extends VerifiedReward> moreRewards) {
            m.e(reward, "reward");
            m.e(moreRewards, "moreRewards");
            this.reward = reward;
            this.moreRewards = moreRewards;
        }

        public final List<VerifiedReward> getMoreRewards() {
            return this.moreRewards;
        }

        public final VerifiedReward getReward() {
            return this.reward;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\t\n\u000b\f\rR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome;", "isUnexpected", "", "()Z", "logMessage", "", "getLogMessage", "()Ljava/lang/String;", "BackendRejected", "ExhaustedWhilePending", "ExhaustedWhileTransientErroring", "TerminalError", "UnexpectedResponse", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$BackendRejected;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$ExhaustedWhilePending;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$ExhaustedWhileTransientErroring;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$TerminalError;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$UnexpectedResponse;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public interface Failed extends Outcome {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$ExhaustedWhilePending;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed;", "()V", "isUnexpected", "", "()Z", "logMessage", "", "getLogMessage", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class ExhaustedWhilePending implements Failed {
            public static final ExhaustedWhilePending INSTANCE = new ExhaustedWhilePending();

            private ExhaustedWhilePending() {
            }

            @Override
            public String getLogMessage() {
                return "Reward verification timed out: the AdMob server-side verification (SSV) callback was not received in time. Possible causes: SSV is not enabled/configured for this ad unit in the AdMob Dashboard, the SSV callback URL is misconfigured in the AdMob Dashboard, AdMob delayed delivering the callback, or RevenueCat failed to process the SSV webhook.";
            }

            @Override
            public boolean isUnexpected() {
                return false;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$ExhaustedWhileTransientErroring;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed;", "()V", "isUnexpected", "", "()Z", "logMessage", "", "getLogMessage", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class ExhaustedWhileTransientErroring implements Failed {
            public static final ExhaustedWhileTransientErroring INSTANCE = new ExhaustedWhileTransientErroring();

            private ExhaustedWhileTransientErroring() {
            }

            @Override
            public String getLogMessage() {
                return "Reward verification timed out after repeated transient errors while polling — typically unstable device network connectivity. The reward couldn't be verified.";
            }

            @Override
            public boolean isUnexpected() {
                return false;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$TerminalError;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed;", "error", "", "(Ljava/lang/String;)V", "isUnexpected", "", "()Z", "logMessage", "getLogMessage", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class TerminalError implements Failed {
            private final String error;

            public TerminalError(String error) {
                m.e(error, "error");
                this.error = error;
            }

            @Override
            public String getLogMessage() {
                return f.m(new StringBuilder("Reward verification stopped after an unrecoverable error: "), this.error, ". This is unexpected; if it persists, contact RevenueCat support with the error above.");
            }

            @Override
            public boolean isUnexpected() {
                return true;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$UnexpectedResponse;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed;", "()V", "isUnexpected", "", "()Z", "logMessage", "", "getLogMessage", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class UnexpectedResponse implements Failed {
            public static final UnexpectedResponse INSTANCE = new UnexpectedResponse();

            private UnexpectedResponse() {
            }

            @Override
            public String getLogMessage() {
                return "Reward verification stopped after the server returned a status this SDK version doesn't recognize. Update to the latest SDK version; if you're already on the latest, contact RevenueCat support.";
            }

            @Override
            public boolean isUnexpected() {
                return true;
            }
        }

        String getLogMessage();

        boolean isUnexpected();

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed$BackendRejected;", "Lcom/revenuecat/purchases/ads/rewardverification/Outcome$Failed;", "backendMessage", "", "failureReason", "(Ljava/lang/String;Ljava/lang/String;)V", "isUnexpected", "", "()Z", "logMessage", "getLogMessage", "()Ljava/lang/String;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class BackendRejected implements Failed {
            private final String backendMessage;
            private final String failureReason;

            public BackendRejected(String str, String str2) {
                this.backendMessage = str;
                this.failureReason = str2;
            }

            @Override
            public String getLogMessage() {
                String str = this.backendMessage;
                if (str != null) {
                    if (q.N0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        return str;
                    }
                }
                String str2 = this.failureReason;
                if (str2 == null) {
                    return "Reward verification was rejected by AdMob server-side verification.";
                }
                String str3 = q.N0(str2) ? null : str2;
                return str3 != null ? f.h("Reward verification was rejected by AdMob server-side verification (reason: ", str3, ").") : "Reward verification was rejected by AdMob server-side verification.";
            }

            @Override
            public boolean isUnexpected() {
                return false;
            }

            public BackendRejected(String str, String str2, int i3, AbstractC2541f abstractC2541f) {
                this(str, (i3 & 2) != 0 ? null : str2);
            }
        }
    }
}
