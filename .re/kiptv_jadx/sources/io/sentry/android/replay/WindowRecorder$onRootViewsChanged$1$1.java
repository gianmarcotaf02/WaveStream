package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowRecorder$onRootViewsChanged$1$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ android.view.View $root;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecorder$onRootViewsChanged$1$1(android.view.View view) {
        super(1);
        this.$root = view;
    }

    @Override // p194x6.j
    public final java.lang.Boolean invoke(java.lang.ref.WeakReference<android.view.View> it) {
        kotlin.jvm.internal.m.e(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.m.a(it.get(), this.$root));
    }
}
