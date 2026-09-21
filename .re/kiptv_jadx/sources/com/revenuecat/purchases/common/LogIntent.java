package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/common/LogIntent;", "", "emojiList", "", "", "(Ljava/lang/String;ILjava/util/List;)V", "getEmojiList", "()Ljava/util/List;", "DEBUG", "GOOGLE_ERROR", "GOOGLE_WARNING", "INFO", "PURCHASE", "RC_ERROR", "RC_PURCHASE_SUCCESS", "RC_SUCCESS", "USER", "WARNING", "AMAZON_WARNING", "AMAZON_ERROR", "GALAXY_WARNING", "GALAXY_ERROR", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum LogIntent {
    DEBUG(com.google.common.util.concurrent.P.i0(com.revenuecat.purchases.strings.Emojis.INFO)),
    GOOGLE_ERROR(p078i6.p.B0(com.revenuecat.purchases.strings.Emojis.ROBOT, com.revenuecat.purchases.strings.Emojis.DOUBLE_EXCLAMATION)),
    GOOGLE_WARNING(p078i6.p.B0(com.revenuecat.purchases.strings.Emojis.ROBOT, com.revenuecat.purchases.strings.Emojis.DOUBLE_EXCLAMATION)),
    INFO(com.google.common.util.concurrent.P.i0(com.revenuecat.purchases.strings.Emojis.INFO)),
    PURCHASE(com.google.common.util.concurrent.P.i0(com.revenuecat.purchases.strings.Emojis.MONEY_BAG)),
    RC_ERROR(p078i6.p.B0(com.revenuecat.purchases.strings.Emojis.SAD_CAT_EYES, com.revenuecat.purchases.strings.Emojis.DOUBLE_EXCLAMATION)),
    RC_PURCHASE_SUCCESS(p078i6.p.B0(com.revenuecat.purchases.strings.Emojis.HEART_CAT_EYES, com.revenuecat.purchases.strings.Emojis.MONEY_BAG)),
    RC_SUCCESS(com.google.common.util.concurrent.P.i0(com.revenuecat.purchases.strings.Emojis.HEART_CAT_EYES)),
    USER(com.google.common.util.concurrent.P.i0(com.revenuecat.purchases.strings.Emojis.PERSON)),
    WARNING(com.google.common.util.concurrent.P.i0(com.revenuecat.purchases.strings.Emojis.WARNING)),
    AMAZON_WARNING(p078i6.p.B0(com.revenuecat.purchases.strings.Emojis.BOX, com.revenuecat.purchases.strings.Emojis.DOUBLE_EXCLAMATION)),
    AMAZON_ERROR(p078i6.p.B0(com.revenuecat.purchases.strings.Emojis.BOX, com.revenuecat.purchases.strings.Emojis.DOUBLE_EXCLAMATION)),
    GALAXY_WARNING(p078i6.p.B0(com.revenuecat.purchases.strings.Emojis.STARS, com.revenuecat.purchases.strings.Emojis.DOUBLE_EXCLAMATION)),
    GALAXY_ERROR(p078i6.p.B0(com.revenuecat.purchases.strings.Emojis.STARS, com.revenuecat.purchases.strings.Emojis.DOUBLE_EXCLAMATION));

    private final java.util.List<java.lang.String> emojiList;

    LogIntent(java.util.List list) {
        this.emojiList = list;
    }

    public final java.util.List<java.lang.String> getEmojiList() {
        return this.emojiList;
    }
}
