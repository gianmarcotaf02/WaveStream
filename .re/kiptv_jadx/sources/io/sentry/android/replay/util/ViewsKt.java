package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000e\u001a\u00020\t*\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0018\u001a\u00020\u0012*\u00020\u0012H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001d\"\u0018\u0010\"\u001a\u00020\u0012*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Landroid/view/View;", "Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;", "parentNode", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lh6/A;", "traverse", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/ViewHierarchyNode;Lio/sentry/SentryOptions;)V", "Lh6/k;", "", "Landroid/graphics/Rect;", "isVisibleToUser", "(Landroid/view/View;)Lh6/k;", "Landroid/graphics/drawable/Drawable;", "isMaskable", "(Landroid/graphics/drawable/Drawable;)Z", "Lio/sentry/android/replay/util/TextLayout;", "globalRect", "", "paddingLeft", "paddingTop", "", "getVisibleRects", "(Lio/sentry/android/replay/util/TextLayout;Landroid/graphics/Rect;II)Ljava/util/List;", "toOpaque", "(I)I", "Landroid/view/ViewTreeObserver$OnDrawListener;", "listener", "addOnDrawListenerSafe", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V", "removeOnDrawListenerSafe", "Landroid/widget/TextView;", "getTotalPaddingTopSafe", "(Landroid/widget/TextView;)I", "totalPaddingTopSafe", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ViewsKt {
    public static final void addOnDrawListenerSafe(android.view.View view, android.view.ViewTreeObserver.OnDrawListener listener) {
        kotlin.jvm.internal.m.e(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().addOnDrawListener(listener);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public static final int getTotalPaddingTopSafe(android.widget.TextView textView) {
        kotlin.jvm.internal.m.e(textView, "<this>");
        try {
            return textView.getTotalPaddingTop();
        } catch (java.lang.NullPointerException unused) {
            return textView.getExtendedPaddingTop();
        }
    }

    public static final java.util.List<android.graphics.Rect> getVisibleRects(io.sentry.android.replay.util.TextLayout textLayout, android.graphics.Rect globalRect, int i3, int i9) {
        kotlin.jvm.internal.m.e(globalRect, "globalRect");
        if (textLayout == null) {
            return com.google.common.util.concurrent.P.i0(globalRect);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int lineCount = textLayout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            int primaryHorizontal = (int) textLayout.getPrimaryHorizontal(i10, textLayout.getLineStart(i10));
            int ellipsisCount = textLayout.getEllipsisCount(i10);
            int lineVisibleEnd = textLayout.getLineVisibleEnd(i10);
            int primaryHorizontal2 = (int) textLayout.getPrimaryHorizontal(i10, (lineVisibleEnd - ellipsisCount) + (ellipsisCount > 0 ? 1 : 0));
            if (primaryHorizontal2 == 0 && lineVisibleEnd > 0) {
                primaryHorizontal2 = ((int) textLayout.getPrimaryHorizontal(i10, lineVisibleEnd - 1)) + 1;
            }
            int lineTop = textLayout.getLineTop(i10);
            int lineBottom = textLayout.getLineBottom(i10);
            android.graphics.Rect rect = new android.graphics.Rect();
            int i11 = globalRect.left + i3 + primaryHorizontal;
            rect.left = i11;
            rect.right = (primaryHorizontal2 - primaryHorizontal) + i11;
            int i12 = globalRect.top + i9 + lineTop;
            rect.top = i12;
            rect.bottom = (lineBottom - lineTop) + i12;
            arrayList.add(rect);
        }
        return arrayList;
    }

    public static final boolean isMaskable(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.InsetDrawable ? true : drawable instanceof android.graphics.drawable.ColorDrawable ? true : drawable instanceof android.graphics.drawable.VectorDrawable ? true : drawable instanceof android.graphics.drawable.GradientDrawable) {
            return false;
        }
        if (!(drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            return true;
        }
        android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        return bitmap != null && !bitmap.isRecycled() && bitmap.getHeight() > 10 && bitmap.getWidth() > 10;
    }

    public static final p070h6.k isVisibleToUser(android.view.View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        if (!view.isAttachedToWindow()) {
            return new p070h6.k(java.lang.Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return new p070h6.k(java.lang.Boolean.FALSE, null);
        }
        java.lang.Object parent = view;
        while (parent instanceof android.view.View) {
            float transitionAlpha = android.os.Build.VERSION.SDK_INT >= 29 ? ((android.view.View) parent).getTransitionAlpha() : 1.0f;
            android.view.View view2 = (android.view.View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return new p070h6.k(java.lang.Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        return new p070h6.k(java.lang.Boolean.valueOf(view.getGlobalVisibleRect(rect, new android.graphics.Point())), rect);
    }

    public static final void removeOnDrawListenerSafe(android.view.View view, android.view.ViewTreeObserver.OnDrawListener listener) {
        kotlin.jvm.internal.m.e(listener, "listener");
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(listener);
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public static final int toOpaque(int i3) {
        return i3 | (-16777216);
    }

    public static final void traverse(android.view.View view, io.sentry.android.replay.viewhierarchy.ViewHierarchyNode parentNode, io.sentry.SentryOptions options) {
        kotlin.jvm.internal.m.e(view, "<this>");
        kotlin.jvm.internal.m.e(parentNode, "parentNode");
        kotlin.jvm.internal.m.e(options, "options");
        if ((view instanceof android.view.ViewGroup) && !io.sentry.android.replay.viewhierarchy.ComposeViewHierarchyNode.INSTANCE.fromView(view, parentNode, options)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = viewGroup.getChildAt(i3);
                if (childAt != null) {
                    io.sentry.android.replay.viewhierarchy.ViewHierarchyNode viewHierarchyNodeFromView = io.sentry.android.replay.viewhierarchy.ViewHierarchyNode.INSTANCE.fromView(childAt, parentNode, viewGroup.indexOfChild(childAt), options);
                    arrayList.add(viewHierarchyNodeFromView);
                    traverse(childAt, viewHierarchyNodeFromView, options);
                }
            }
            parentNode.setChildren(arrayList);
        }
    }
}
