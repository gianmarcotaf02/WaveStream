package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Lq0/p;", "sentryReplayMask", "(Lq0/p;)Lq0/p;", "sentryReplayUnmask", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ModifierExtensionsKt {

    /* JADX INFO: renamed from: io.sentry.android.replay.ModifierExtensionsKt$sentryReplayMask$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY0/x;", "Lh6/A;", "invoke", "(LY0/x;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final io.sentry.android.replay.ModifierExtensionsKt.AnonymousClass1 INSTANCE = new io.sentry.android.replay.ModifierExtensionsKt.AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((Y0.x) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(Y0.x semantics) {
            kotlin.jvm.internal.m.e(semantics, "$this$semantics");
            semantics.d(io.sentry.android.replay.SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "mask");
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ModifierExtensionsKt$sentryReplayUnmask$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY0/x;", "Lh6/A;", "invoke", "(LY0/x;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class C24881 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final io.sentry.android.replay.ModifierExtensionsKt.C24881 INSTANCE = new io.sentry.android.replay.ModifierExtensionsKt.C24881();

        public C24881() {
            super(1);
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((Y0.x) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(Y0.x semantics) {
            kotlin.jvm.internal.m.e(semantics, "$this$semantics");
            semantics.d(io.sentry.android.replay.SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "unmask");
        }
    }

    public static final p137q0.p sentryReplayMask(p137q0.p pVar) {
        kotlin.jvm.internal.m.e(pVar, "<this>");
        return Y0.m.a(pVar, false, io.sentry.android.replay.ModifierExtensionsKt.AnonymousClass1.INSTANCE);
    }

    public static final p137q0.p sentryReplayUnmask(p137q0.p pVar) {
        kotlin.jvm.internal.m.e(pVar, "<this>");
        return Y0.m.a(pVar, false, io.sentry.android.replay.ModifierExtensionsKt.C24881.INSTANCE);
    }
}
