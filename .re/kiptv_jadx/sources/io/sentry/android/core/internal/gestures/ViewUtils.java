package io.sentry.android.core.internal.gestures;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewUtils {
    private static final int[] coordinates = new int[2];

    public static io.sentry.internal.gestures.UiElement findTarget(io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions, android.view.View view, float f9, float f10, io.sentry.internal.gestures.UiElement.Type type) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.UiElement uiElement = null;
        while (linkedList.size() > 0) {
            android.view.View view2 = (android.view.View) linkedList.poll();
            if (touchWithinBounds(view2, f9, f10)) {
                if (view2 instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        linkedList.add(viewGroup.getChildAt(i3));
                    }
                }
                java.util.Iterator<io.sentry.internal.gestures.GestureTargetLocator> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
                while (it.hasNext()) {
                    io.sentry.internal.gestures.UiElement uiElementLocate = it.next().locate(view2, f9, f10, type);
                    if (uiElementLocate != null) {
                        if (type == io.sentry.internal.gestures.UiElement.Type.CLICKABLE) {
                            uiElement = uiElementLocate;
                        } else if (type == io.sentry.internal.gestures.UiElement.Type.SCROLLABLE) {
                            return uiElementLocate;
                        }
                    }
                }
            }
        }
        return uiElement;
    }

    public static java.lang.String getResourceId(android.view.View view) {
        int id = view.getId();
        if (id == -1 || isViewIdGenerated(id)) {
            throw new android.content.res.Resources.NotFoundException();
        }
        android.content.res.Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }

    public static java.lang.String getResourceIdWithFallback(android.view.View view) {
        try {
            return getResourceId(view);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return "0x" + java.lang.Integer.toString(view.getId(), 16);
        }
    }

    private static boolean isViewIdGenerated(int i3) {
        return ((-16777216) & i3) == 0 && (i3 & 16777215) != 0;
    }

    private static boolean touchWithinBounds(android.view.View view, float f9, float f10) {
        if (view == null) {
            return false;
        }
        int[] iArr = coordinates;
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i9 = iArr[1];
        return f9 >= ((float) i3) && f9 <= ((float) (i3 + view.getWidth())) && f10 >= ((float) i9) && f10 <= ((float) (i9 + view.getHeight()));
    }
}
