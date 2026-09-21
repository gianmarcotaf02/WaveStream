package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.gestures.UiElement;
import java.util.Iterator;
import java.util.LinkedList;

public final class ViewUtils {
    private static final int[] coordinates = new int[2];

    public static UiElement findTarget(SentryAndroidOptions sentryAndroidOptions, View view, float f9, float f10, UiElement.Type type) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        UiElement uiElement = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (touchWithinBounds(view2, f9, f10)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        linkedList.add(viewGroup.getChildAt(i3));
                    }
                }
                Iterator<GestureTargetLocator> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
                while (it.hasNext()) {
                    UiElement uiElementLocate = it.next().locate(view2, f9, f10, type);
                    if (uiElementLocate != null) {
                        if (type == UiElement.Type.CLICKABLE) {
                            uiElement = uiElementLocate;
                        } else if (type == UiElement.Type.SCROLLABLE) {
                            return uiElementLocate;
                        }
                    }
                }
            }
        }
        return uiElement;
    }

    public static String getResourceId(View view) {
        int id = view.getId();
        if (id == -1 || isViewIdGenerated(id)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : "";
    }

    public static String getResourceIdWithFallback(View view) {
        try {
            return getResourceId(view);
        } catch (Resources.NotFoundException unused) {
            return "0x" + Integer.toString(view.getId(), 16);
        }
    }

    private static boolean isViewIdGenerated(int i3) {
        return ((-16777216) & i3) == 0 && (i3 & 16777215) != 0;
    }

    private static boolean touchWithinBounds(View view, float f9, float f10) {
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
