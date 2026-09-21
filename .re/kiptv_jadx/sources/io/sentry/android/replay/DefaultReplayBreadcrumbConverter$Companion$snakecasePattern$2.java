package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO7/o;", "invoke", "()LO7/o;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final io.sentry.android.replay.DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2 INSTANCE = new io.sentry.android.replay.DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2();

    public DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final O7.o invoke() {
        return new O7.o("_[a-z]");
    }
}
