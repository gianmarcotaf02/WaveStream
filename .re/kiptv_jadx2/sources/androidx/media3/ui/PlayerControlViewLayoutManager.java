package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

final class PlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private final ViewGroup basicControls;
    private final ViewGroup bottomBar;
    private final ViewGroup centerControls;
    private final View controlsBackground;
    private final ViewGroup extraControls;
    private final ViewGroup extraControlsScrollView;
    private final AnimatorSet hideAllBarsAnimator;
    private final Runnable hideAllBarsRunnable;
    private final AnimatorSet hideMainBarAnimator;
    private final AnimatorSet hideProgressBarAnimator;
    private boolean isMinimalMode;
    private final ViewGroup minimalControls;
    private boolean needToShowBars;
    private final View.OnLayoutChangeListener onLayoutChangeListener;
    private final ValueAnimator overflowHideAnimator;
    private final ValueAnimator overflowShowAnimator;
    private final View overflowShowButton;
    private final PlayerControlView playerControlView;
    private final AnimatorSet showAllBarsAnimator;
    private final Runnable showAllBarsRunnable;
    private final AnimatorSet showMainBarAnimator;
    private final View timeBar;
    private final ViewGroup timeView;
    private final ViewGroup topControls;
    private final Runnable hideProgressBarRunnable = new f(this, 4);
    private final Runnable hideMainBarRunnable = new f(this, 5);
    private final Runnable hideControllerRunnable = new f(this, 6);
    private boolean animationEnabled = true;
    private int uxState = 0;
    private final List<View> shownButtons = new ArrayList();

    public PlayerControlViewLayoutManager(final PlayerControlView playerControlView) {
        this.playerControlView = playerControlView;
        int i3 = 2;
        this.showAllBarsRunnable = new f(this, i3);
        int i9 = 3;
        this.hideAllBarsRunnable = new f(this, i9);
        int i10 = 0;
        this.onLayoutChangeListener = new h(i10, this);
        int i11 = 1;
        this.topControls = (ViewGroup) playerControlView.findViewById(R.id.exo_top_controls);
        this.controlsBackground = playerControlView.findViewById(R.id.exo_controls_background);
        this.centerControls = (ViewGroup) playerControlView.findViewById(R.id.exo_center_controls);
        this.minimalControls = (ViewGroup) playerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(R.id.exo_bottom_bar);
        this.bottomBar = viewGroup;
        this.timeView = (ViewGroup) playerControlView.findViewById(R.id.exo_time);
        View viewFindViewById = playerControlView.findViewById(R.id.exo_progress);
        this.timeBar = viewFindViewById;
        this.basicControls = (ViewGroup) playerControlView.findViewById(R.id.exo_basic_controls);
        this.extraControls = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls);
        this.extraControlsScrollView = (ViewGroup) playerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = playerControlView.findViewById(R.id.exo_overflow_show);
        this.overflowShowButton = viewFindViewById2;
        View viewFindViewById3 = playerControlView.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new c(i9, this));
            viewFindViewById3.setOnClickListener(new c(i9, this));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new g(i10, this));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (PlayerControlViewLayoutManager.this.controlsBackground != null) {
                    PlayerControlViewLayoutManager.this.controlsBackground.setVisibility(4);
                }
                if (PlayerControlViewLayoutManager.this.topControls != null) {
                    PlayerControlViewLayoutManager.this.topControls.setVisibility(4);
                }
                if (PlayerControlViewLayoutManager.this.centerControls != null) {
                    PlayerControlViewLayoutManager.this.centerControls.setVisibility(4);
                }
                if (PlayerControlViewLayoutManager.this.minimalControls != null) {
                    PlayerControlViewLayoutManager.this.minimalControls.setVisibility(4);
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                if (!(PlayerControlViewLayoutManager.this.timeBar instanceof DefaultTimeBar) || PlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((DefaultTimeBar) PlayerControlViewLayoutManager.this.timeBar).hideScrubber(250L);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new g(i11, this));
        valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                if (PlayerControlViewLayoutManager.this.controlsBackground != null) {
                    PlayerControlViewLayoutManager.this.controlsBackground.setVisibility(0);
                }
                if (PlayerControlViewLayoutManager.this.topControls != null) {
                    PlayerControlViewLayoutManager.this.topControls.setVisibility(0);
                }
                if (PlayerControlViewLayoutManager.this.centerControls != null) {
                    PlayerControlViewLayoutManager.this.centerControls.setVisibility(0);
                }
                if (PlayerControlViewLayoutManager.this.minimalControls != null) {
                    PlayerControlViewLayoutManager.this.minimalControls.setVisibility(PlayerControlViewLayoutManager.this.isMinimalMode ? 0 : 4);
                }
                if (!(PlayerControlViewLayoutManager.this.timeBar instanceof DefaultTimeBar) || PlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((DefaultTimeBar) PlayerControlViewLayoutManager.this.timeBar).showScrubber(250L);
            }
        });
        Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.hideMainBarAnimator = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(1);
                if (PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet.play(valueAnimatorOfFloat).with(ofTranslationY(0.0f, dimension, viewFindViewById)).with(ofTranslationY(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.hideProgressBarAnimator = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(2);
                if (PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet2.play(ofTranslationY(dimension, dimension2, viewFindViewById)).with(ofTranslationY(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.hideAllBarsAnimator = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(2);
                if (PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet3.play(valueAnimatorOfFloat).with(ofTranslationY(0.0f, dimension2, viewFindViewById)).with(ofTranslationY(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.showMainBarAnimator = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(0);
            }

            @Override
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(4);
            }
        });
        animatorSet4.play(valueAnimatorOfFloat2).with(ofTranslationY(dimension, 0.0f, viewFindViewById)).with(ofTranslationY(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.showAllBarsAnimator = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(0);
            }

            @Override
            public void onAnimationStart(Animator animator) {
                PlayerControlViewLayoutManager.this.setUxState(4);
            }
        });
        animatorSet5.play(valueAnimatorOfFloat2).with(ofTranslationY(dimension2, 0.0f, viewFindViewById)).with(ofTranslationY(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.overflowShowAnimator = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new g(i3, this));
        valueAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (PlayerControlViewLayoutManager.this.basicControls != null) {
                    PlayerControlViewLayoutManager.this.basicControls.setVisibility(4);
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                if (PlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    PlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(0);
                    PlayerControlViewLayoutManager.this.extraControlsScrollView.setTranslationX(PlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth());
                    PlayerControlViewLayoutManager.this.extraControlsScrollView.scrollTo(PlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth(), 0);
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.overflowHideAnimator = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new g(i9, this));
        valueAnimatorOfFloat4.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (PlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    PlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(4);
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                if (PlayerControlViewLayoutManager.this.basicControls != null) {
                    PlayerControlViewLayoutManager.this.basicControls.setVisibility(0);
                }
            }
        });
    }

    private void animateOverflow(float f9) {
        ViewGroup viewGroup = this.extraControlsScrollView;
        if (viewGroup != null) {
            this.extraControlsScrollView.setTranslationX((int) ((1.0f - f9) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.timeView;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f9);
        }
        ViewGroup viewGroup3 = this.basicControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f9);
        }
    }

    private static int getHeightWithMargins(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + height;
    }

    private static int getWidthWithMargins(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    public void hideAllBars() {
        this.hideAllBarsAnimator.start();
    }

    public void hideController() {
        setUxState(2);
    }

    public void hideMainBar() {
        this.hideMainBarAnimator.start();
        postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
    }

    public void hideProgressBar() {
        this.hideProgressBarAnimator.start();
    }

    public void lambda$new$0(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.controlsBackground;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.topControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.centerControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup3 = this.minimalControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(fFloatValue);
        }
    }

    public void lambda$new$1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.controlsBackground;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = this.topControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = this.centerControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup3 = this.minimalControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(fFloatValue);
        }
    }

    public void lambda$new$2(ValueAnimator valueAnimator) {
        animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$new$3(ValueAnimator valueAnimator) {
        animateOverflow(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static ObjectAnimator ofTranslationY(float f9, float f10, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f9, f10);
    }

    public void onLayoutChange(View view, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean zUseMinimalMode = useMinimalMode();
        if (this.isMinimalMode != zUseMinimalMode) {
            this.isMinimalMode = zUseMinimalMode;
            view.post(new f(this, 0));
        }
        boolean z6 = i10 - i3 != i14 - i12;
        if (this.isMinimalMode || !z6) {
            return;
        }
        view.post(new f(this, 1));
    }

    public void onLayoutWidthChanged() {
        int i3;
        if (this.basicControls == null || this.extraControls == null) {
            return;
        }
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        while (true) {
            if (this.extraControls.getChildCount() <= 1) {
                break;
            }
            int childCount = this.extraControls.getChildCount() - 2;
            View childAt = this.extraControls.getChildAt(childCount);
            this.extraControls.removeViewAt(childCount);
            this.basicControls.addView(childAt, 0);
        }
        View view = this.overflowShowButton;
        if (view != null) {
            view.setVisibility(8);
        }
        int widthWithMargins = getWidthWithMargins(this.timeView);
        int childCount2 = this.basicControls.getChildCount() - 1;
        for (int i9 = 0; i9 < childCount2; i9++) {
            widthWithMargins += getWidthWithMargins(this.basicControls.getChildAt(i9));
        }
        if (widthWithMargins <= width) {
            ViewGroup viewGroup = this.extraControlsScrollView;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.overflowHideAnimator.isStarted()) {
                return;
            }
            this.overflowShowAnimator.cancel();
            this.overflowHideAnimator.start();
            return;
        }
        View view2 = this.overflowShowButton;
        if (view2 != null) {
            view2.setVisibility(0);
            widthWithMargins += getWidthWithMargins(this.overflowShowButton);
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < childCount2; i10++) {
            View childAt2 = this.basicControls.getChildAt(i10);
            widthWithMargins -= getWidthWithMargins(childAt2);
            arrayList.add(childAt2);
            if (widthWithMargins <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.basicControls.removeViews(0, arrayList.size());
        for (i3 = 0; i3 < arrayList.size(); i3++) {
            this.extraControls.addView((View) arrayList.get(i3), this.extraControls.getChildCount() - 1);
        }
    }

    public void onOverflowButtonClick(View view) {
        resetHideCallbacks();
        if (view.getId() == R.id.exo_overflow_show) {
            this.overflowShowAnimator.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            this.overflowHideAnimator.start();
        }
    }

    private void postDelayedRunnable(Runnable runnable, long j) {
        if (j >= 0) {
            this.playerControlView.postDelayed(runnable, j);
        }
    }

    public void setUxState(int i3) {
        int i9 = this.uxState;
        this.uxState = i3;
        if (i3 == 2) {
            this.playerControlView.setVisibility(8);
        } else if (i9 == 2) {
            this.playerControlView.setVisibility(0);
        }
        if (i9 != i3) {
            this.playerControlView.notifyOnVisibilityChange();
        }
    }

    private boolean shouldHideInMinimalMode(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_media_route_button_placeholder || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    public void showAllBars() {
        if (!this.animationEnabled) {
            setUxState(0);
            resetHideCallbacks();
            return;
        }
        int i3 = this.uxState;
        if (i3 == 1) {
            this.showMainBarAnimator.start();
        } else if (i3 == 2) {
            this.showAllBarsAnimator.start();
        } else if (i3 == 3) {
            this.needToShowBars = true;
        } else if (i3 == 4) {
            return;
        }
        resetHideCallbacks();
    }

    public void updateLayoutForSizeChange() {
        ViewGroup viewGroup = this.minimalControls;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.isMinimalMode ? 0 : 4);
        }
        if (this.timeBar != null) {
            int dimensionPixelSize = this.playerControlView.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.timeBar.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.isMinimalMode) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.timeBar.setLayoutParams(marginLayoutParams);
            }
            View view = this.timeBar;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.isMinimalMode) {
                    defaultTimeBar.hideScrubber(true);
                } else {
                    int i3 = this.uxState;
                    if (i3 == 1) {
                        defaultTimeBar.hideScrubber(false);
                    } else if (i3 != 3) {
                        defaultTimeBar.showScrubber();
                    }
                }
            }
        }
        for (View view2 : this.shownButtons) {
            view2.setVisibility((this.isMinimalMode && shouldHideInMinimalMode(view2)) ? 4 : 0);
        }
    }

    private boolean useMinimalMode() {
        int paddingRight;
        int paddingBottom;
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        int height = (this.playerControlView.getHeight() - this.playerControlView.getPaddingBottom()) - this.playerControlView.getPaddingTop();
        int widthWithMargins = getWidthWithMargins(this.centerControls);
        ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            paddingRight = this.centerControls.getPaddingRight() + viewGroup.getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        int i3 = widthWithMargins - paddingRight;
        int heightWithMargins = getHeightWithMargins(this.centerControls);
        ViewGroup viewGroup2 = this.centerControls;
        if (viewGroup2 != null) {
            paddingBottom = this.centerControls.getPaddingBottom() + viewGroup2.getPaddingTop();
        } else {
            paddingBottom = 0;
        }
        return width <= Math.max(i3, getWidthWithMargins(this.timeView) + getWidthWithMargins(this.overflowShowButton)) || height <= (getHeightWithMargins(this.bottomBar) * 2) + (heightWithMargins - paddingBottom);
    }

    public boolean getShowButton(View view) {
        return view != null && this.shownButtons.contains(view);
    }

    public void hide() {
        int i3 = this.uxState;
        if (i3 == 3 || i3 == 2) {
            return;
        }
        removeHideCallbacks();
        if (!this.animationEnabled) {
            hideController();
        } else if (this.uxState == 1) {
            hideProgressBar();
        } else {
            hideAllBars();
        }
    }

    public void hideImmediately() {
        int i3 = this.uxState;
        if (i3 == 3 || i3 == 2) {
            return;
        }
        removeHideCallbacks();
        hideController();
    }

    public boolean isAnimationEnabled() {
        return this.animationEnabled;
    }

    public boolean isFullyVisible() {
        return this.uxState == 0 && this.playerControlView.isVisible();
    }

    public void onAttachedToWindow() {
        this.playerControlView.addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void onDetachedFromWindow() {
        this.playerControlView.removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        View view = this.controlsBackground;
        if (view != null) {
            view.layout(0, 0, i10 - i3, i11 - i9);
        }
    }

    public void removeHideCallbacks() {
        this.playerControlView.removeCallbacks(this.hideControllerRunnable);
        this.playerControlView.removeCallbacks(this.hideAllBarsRunnable);
        this.playerControlView.removeCallbacks(this.hideMainBarRunnable);
        this.playerControlView.removeCallbacks(this.hideProgressBarRunnable);
    }

    public void resetHideCallbacks() {
        if (this.uxState == 3) {
            return;
        }
        removeHideCallbacks();
        int showTimeoutMs = this.playerControlView.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.animationEnabled) {
                postDelayedRunnable(this.hideControllerRunnable, showTimeoutMs);
            } else if (this.uxState == 1) {
                postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
            } else {
                postDelayedRunnable(this.hideMainBarRunnable, showTimeoutMs);
            }
        }
    }

    public void setAnimationEnabled(boolean z6) {
        this.animationEnabled = z6;
    }

    public void setShowButton(View view, boolean z6) {
        if (view == null) {
            return;
        }
        if (!z6) {
            view.setVisibility(8);
            this.shownButtons.remove(view);
            return;
        }
        if (this.isMinimalMode && shouldHideInMinimalMode(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.shownButtons.add(view);
    }

    public void show() {
        if (!this.playerControlView.isVisible()) {
            this.playerControlView.setVisibility(0);
            this.playerControlView.updateAll();
            this.playerControlView.requestPlayPauseFocus();
        }
        showAllBars();
    }
}
