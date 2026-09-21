package io.sentry.android.core.internal.gestures;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public class WindowCallbackAdapter implements Window.Callback {
    private final Window.Callback delegate;

    public WindowCallbackAdapter(Window.Callback callback) {
        this.delegate = callback;
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.delegate.dispatchGenericMotionEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.delegate.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.delegate.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.delegate.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.delegate.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.delegate.dispatchTrackballEvent(motionEvent);
    }

    @Override
    public void onActionModeFinished(ActionMode actionMode) {
        this.delegate.onActionModeFinished(actionMode);
    }

    @Override
    public void onActionModeStarted(ActionMode actionMode) {
        this.delegate.onActionModeStarted(actionMode);
    }

    @Override
    public void onAttachedToWindow() {
        this.delegate.onAttachedToWindow();
    }

    @Override
    public void onContentChanged() {
        this.delegate.onContentChanged();
    }

    @Override
    public boolean onCreatePanelMenu(int i3, Menu menu) {
        return this.delegate.onCreatePanelMenu(i3, menu);
    }

    @Override
    public View onCreatePanelView(int i3) {
        return this.delegate.onCreatePanelView(i3);
    }

    @Override
    public void onDetachedFromWindow() {
        this.delegate.onDetachedFromWindow();
    }

    @Override
    public boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        return this.delegate.onMenuItemSelected(i3, menuItem);
    }

    @Override
    public boolean onMenuOpened(int i3, Menu menu) {
        return this.delegate.onMenuOpened(i3, menu);
    }

    @Override
    public void onPanelClosed(int i3, Menu menu) {
        this.delegate.onPanelClosed(i3, menu);
    }

    @Override
    public boolean onPreparePanel(int i3, View view, Menu menu) {
        return this.delegate.onPreparePanel(i3, view, menu);
    }

    @Override
    public boolean onSearchRequested() {
        return this.delegate.onSearchRequested();
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.delegate.onWindowAttributesChanged(layoutParams);
    }

    @Override
    public void onWindowFocusChanged(boolean z6) {
        this.delegate.onWindowFocusChanged(z6);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.delegate.onWindowStartingActionMode(callback);
    }

    @Override
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.delegate.onSearchRequested(searchEvent);
    }

    @Override
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i3) {
        return this.delegate.onWindowStartingActionMode(callback, i3);
    }
}
