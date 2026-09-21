package io.sentry.android.core.internal.gestures;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidViewGestureTargetLocator implements io.sentry.internal.gestures.GestureTargetLocator {
    private static final java.lang.String ORIGIN = "old_view_system";
    private final boolean isAndroidXAvailable;

    public AndroidViewGestureTargetLocator(boolean z6) {
        this.isAndroidXAvailable = z6;
    }

    private io.sentry.internal.gestures.UiElement createUiElement(android.view.View view) {
        try {
            return new io.sentry.internal.gestures.UiElement(view, io.sentry.android.core.internal.util.ClassUtil.getClassName(view), io.sentry.android.core.internal.gestures.ViewUtils.getResourceId(view), null, ORIGIN);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    private static boolean isJetpackScrollingView(android.view.View view, boolean z6) {
        if (z6) {
            return androidx.core.view.ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    private static boolean isViewScrollable(android.view.View view, boolean z6) {
        return (isJetpackScrollingView(view, z6) || android.widget.AbsListView.class.isAssignableFrom(view.getClass()) || android.widget.ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    private static boolean isViewTappable(android.view.View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    @Override // io.sentry.internal.gestures.GestureTargetLocator
    public io.sentry.internal.gestures.UiElement locate(java.lang.Object obj, float f9, float f10, io.sentry.internal.gestures.UiElement.Type type) {
        if (!(obj instanceof android.view.View)) {
            return null;
        }
        android.view.View view = (android.view.View) obj;
        if (type == io.sentry.internal.gestures.UiElement.Type.CLICKABLE && isViewTappable(view)) {
            return createUiElement(view);
        }
        if (type == io.sentry.internal.gestures.UiElement.Type.SCROLLABLE && isViewScrollable(view, this.isAndroidXAvailable)) {
            return createUiElement(view);
        }
        return null;
    }
}
