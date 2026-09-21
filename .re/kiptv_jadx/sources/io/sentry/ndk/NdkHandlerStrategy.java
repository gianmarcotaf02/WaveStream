package io.sentry.ndk;

/* JADX INFO: loaded from: classes4.dex */
public enum NdkHandlerStrategy {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    NdkHandlerStrategy(int i3) {
        this.value = i3;
    }

    public int getValue() {
        return this.value;
    }
}
