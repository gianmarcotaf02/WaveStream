package io.sentry.android.replay;

import Y0.x;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p137q0.p;
import p194x6.j;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Lq0/p;", "sentryReplayMask", "(Lq0/p;)Lq0/p;", "sentryReplayUnmask", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ModifierExtensionsKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY0/x;", "Lh6/A;", "invoke", "(LY0/x;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends o implements j {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public Object invoke(Object obj) {
            invoke((x) obj);
            return A.f22523a;
        }

        public final void invoke(x semantics) {
            m.e(semantics, "$this$semantics");
            semantics.d(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "mask");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LY0/x;", "Lh6/A;", "invoke", "(LY0/x;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class C24881 extends o implements j {
        public static final C24881 INSTANCE = new C24881();

        public C24881() {
            super(1);
        }

        @Override
        public Object invoke(Object obj) {
            invoke((x) obj);
            return A.f22523a;
        }

        public final void invoke(x semantics) {
            m.e(semantics, "$this$semantics");
            semantics.d(SentryReplayModifiers.INSTANCE.getSentryPrivacy(), "unmask");
        }
    }

    public static final p sentryReplayMask(p pVar) {
        m.e(pVar, "<this>");
        return Y0.m.a(pVar, false, AnonymousClass1.INSTANCE);
    }

    public static final p sentryReplayUnmask(p pVar) {
        m.e(pVar, "<this>");
        return Y0.m.a(pVar, false, C24881.INSTANCE);
    }
}
