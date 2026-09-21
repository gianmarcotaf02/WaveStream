package com.revenuecat.purchases;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import io.sentry.protocol.Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.w;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "", "Failed", "PENDING", "UNKNOWN", "Verified", "Lcom/revenuecat/purchases/RewardVerificationPollStatus$Failed;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus$PENDING;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus$UNKNOWN;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus$Verified;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RewardVerificationPollStatus {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus$Failed;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "failureReason", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getFailureReason", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Failed implements RewardVerificationPollStatus {
        private final String failureReason;
        private final String message;

        public Failed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static Failed copy$default(Failed failed, String str, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = failed.failureReason;
            }
            if ((i3 & 2) != 0) {
                str2 = failed.message;
            }
            return failed.copy(str, str2);
        }

        public final String getFailureReason() {
            return this.failureReason;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Failed copy(String failureReason, String message) {
            return new Failed(failureReason, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) other;
            return m.a(this.failureReason, failed.failureReason) && m.a(this.message, failed.message);
        }

        public final String getFailureReason() {
            return this.failureReason;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            String str = this.failureReason;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.message;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Failed(failureReason=");
            sb.append(this.failureReason);
            sb.append(", message=");
            return f.l(sb, this.message, ')');
        }

        public Failed(String str, String str2) {
            this.failureReason = str;
            this.message = str2;
        }

        public Failed(String str, String str2, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus$PENDING;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PENDING implements RewardVerificationPollStatus {
        public static final PENDING INSTANCE = new PENDING();

        private PENDING() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus$UNKNOWN;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class UNKNOWN implements RewardVerificationPollStatus {
        public static final UNKNOWN INSTANCE = new UNKNOWN();

        private UNKNOWN() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/RewardVerificationPollStatus$Verified;", "Lcom/revenuecat/purchases/RewardVerificationPollStatus;", "reward", "Lcom/revenuecat/purchases/VerifiedReward;", "moreRewards", "", "(Lcom/revenuecat/purchases/VerifiedReward;Ljava/util/List;)V", "getMoreRewards", "()Ljava/util/List;", "getReward", "()Lcom/revenuecat/purchases/VerifiedReward;", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Verified implements RewardVerificationPollStatus {
        private final List<VerifiedReward> moreRewards;
        private final VerifiedReward reward;

        public Verified(VerifiedReward reward, List<? extends VerifiedReward> moreRewards) {
            m.e(reward, "reward");
            m.e(moreRewards, "moreRewards");
            this.reward = reward;
            this.moreRewards = moreRewards;
        }

        public static Verified copy$default(Verified verified, VerifiedReward verifiedReward, List list, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                verifiedReward = verified.reward;
            }
            if ((i3 & 2) != 0) {
                list = verified.moreRewards;
            }
            return verified.copy(verifiedReward, list);
        }

        public final VerifiedReward getReward() {
            return this.reward;
        }

        public final List<VerifiedReward> component2() {
            return this.moreRewards;
        }

        public final Verified copy(VerifiedReward reward, List<? extends VerifiedReward> moreRewards) {
            m.e(reward, "reward");
            m.e(moreRewards, "moreRewards");
            return new Verified(reward, moreRewards);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Verified)) {
                return false;
            }
            Verified verified = (Verified) other;
            return m.a(this.reward, verified.reward) && m.a(this.moreRewards, verified.moreRewards);
        }

        public final List<VerifiedReward> getMoreRewards() {
            return this.moreRewards;
        }

        public final VerifiedReward getReward() {
            return this.reward;
        }

        public int hashCode() {
            return this.moreRewards.hashCode() + (this.reward.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Verified(reward=");
            sb.append(this.reward);
            sb.append(", moreRewards=");
            return M0.n(sb, this.moreRewards, ')');
        }

        public Verified(VerifiedReward verifiedReward, List list, int i3, AbstractC2541f abstractC2541f) {
            this(verifiedReward, (i3 & 2) != 0 ? w.f23205h : list);
        }
    }
}
