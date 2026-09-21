package com.revenuecat.purchases.common;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.strings.Emojis;
import java.util.List;
import kotlin.Metadata;
import p078i6.p;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/common/LogIntent;", "", "emojiList", "", "", "(Ljava/lang/String;ILjava/util/List;)V", "getEmojiList", "()Ljava/util/List;", "DEBUG", "GOOGLE_ERROR", "GOOGLE_WARNING", "INFO", "PURCHASE", "RC_ERROR", "RC_PURCHASE_SUCCESS", "RC_SUCCESS", "USER", "WARNING", "AMAZON_WARNING", "AMAZON_ERROR", "GALAXY_WARNING", "GALAXY_ERROR", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum LogIntent {
    DEBUG(P.i0(Emojis.INFO)),
    GOOGLE_ERROR(p.B0(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    GOOGLE_WARNING(p.B0(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    INFO(P.i0(Emojis.INFO)),
    PURCHASE(P.i0(Emojis.MONEY_BAG)),
    RC_ERROR(p.B0(Emojis.SAD_CAT_EYES, Emojis.DOUBLE_EXCLAMATION)),
    RC_PURCHASE_SUCCESS(p.B0(Emojis.HEART_CAT_EYES, Emojis.MONEY_BAG)),
    RC_SUCCESS(P.i0(Emojis.HEART_CAT_EYES)),
    USER(P.i0(Emojis.PERSON)),
    WARNING(P.i0(Emojis.WARNING)),
    AMAZON_WARNING(p.B0(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    AMAZON_ERROR(p.B0(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    GALAXY_WARNING(p.B0(Emojis.STARS, Emojis.DOUBLE_EXCLAMATION)),
    GALAXY_ERROR(p.B0(Emojis.STARS, Emojis.DOUBLE_EXCLAMATION));

    private final List<String> emojiList;

    LogIntent(List list) {
        this.emojiList = list;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }
}
