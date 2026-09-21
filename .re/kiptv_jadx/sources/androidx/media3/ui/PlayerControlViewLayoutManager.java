package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
final class PlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private final android.view.ViewGroup basicControls;
    private final android.view.ViewGroup bottomBar;
    private final android.view.ViewGroup centerControls;
    private final android.view.View controlsBackground;
    private final android.view.ViewGroup extraControls;
    private final android.view.ViewGroup extraControlsScrollView;
    private final android.animation.AnimatorSet hideAllBarsAnimator;
    private final java.lang.Runnable hideAllBarsRunnable;
    private final android.animation.AnimatorSet hideMainBarAnimator;
    private final android.animation.AnimatorSet hideProgressBarAnimator;
    private boolean isMinimalMode;
    private final android.view.ViewGroup minimalControls;
    private boolean needToShowBars;
    private final android.view.View.OnLayoutChangeListener onLayoutChangeListener;
    private final android.animation.ValueAnimator overflowHideAnimator;
    private final android.animation.ValueAnimator overflowShowAnimator;
    private final android.view.View overflowShowButton;
    private final androidx.media3.ui.PlayerControlView playerControlView;
    private final android.animation.AnimatorSet showAllBarsAnimator;
    private final java.lang.Runnable showAllBarsRunnable;
    private final android.animation.AnimatorSet showMainBarAnimator;
    private final android.view.View timeBar;
    private final android.view.ViewGroup timeView;
    private final android.view.ViewGroup topControls;
    private final java.lang.Runnable hideProgressBarRunnable = new androidx.media3.ui.f(this, 4);
    private final java.lang.Runnable hideMainBarRunnable = new androidx.media3.ui.f(this, 5);
    private final java.lang.Runnable hideControllerRunnable = new androidx.media3.ui.f(this, 6);
    private boolean animationEnabled = true;
    private int uxState = 0;
    private final java.util.List<android.view.View> shownButtons = new java.util.ArrayList();

    public PlayerControlViewLayoutManager(final androidx.media3.ui.PlayerControlView playerControlView) {
        this.playerControlView = playerControlView;
        int i3 = 2;
        this.showAllBarsRunnable = new androidx.media3.ui.f(this, i3);
        int i9 = 3;
        this.hideAllBarsRunnable = new androidx.media3.ui.f(this, i9);
        int i10 = 0;
        this.onLayoutChangeListener = new androidx.media3.ui.h(i10, this);
        int i11 = 1;
        this.topControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_top_controls);
        this.controlsBackground = playerControlView.findViewById(androidx.media3.ui.R.id.exo_controls_background);
        this.centerControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_center_controls);
        this.minimalControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_minimal_controls);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_bottom_bar);
        this.bottomBar = viewGroup;
        this.timeView = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_time);
        android.view.View viewFindViewById = playerControlView.findViewById(androidx.media3.ui.R.id.exo_progress);
        this.timeBar = viewFindViewById;
        this.basicControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_basic_controls);
        this.extraControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_extra_controls);
        this.extraControlsScrollView = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_extra_controls_scroll_view);
        android.view.View viewFindViewById2 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_overflow_show);
        this.overflowShowButton = viewFindViewById2;
        android.view.View viewFindViewById3 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new androidx.media3.ui.c(i9, this));
            viewFindViewById3.setOnClickListener(new androidx.media3.ui.c(i9, this));
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new androidx.media3.ui.g(i10, this));
        valueAnimatorOfFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.controlsBackground != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.controlsBackground.setVisibility(4);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.topControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.topControls.setVisibility(4);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.centerControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.centerControls.setVisibility(4);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.minimalControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.minimalControls.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (!(androidx.media3.ui.PlayerControlViewLayoutManager.this.timeBar instanceof androidx.media3.ui.DefaultTimeBar) || androidx.media3.ui.PlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((androidx.media3.ui.DefaultTimeBar) androidx.media3.ui.PlayerControlViewLayoutManager.this.timeBar).hideScrubber(250L);
            }
        });
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new androidx.media3.ui.g(i11, this));
        valueAnimatorOfFloat2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.controlsBackground != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.controlsBackground.setVisibility(0);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.topControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.topControls.setVisibility(0);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.centerControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.centerControls.setVisibility(0);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.minimalControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.minimalControls.setVisibility(androidx.media3.ui.PlayerControlViewLayoutManager.this.isMinimalMode ? 0 : 4);
                }
                if (!(androidx.media3.ui.PlayerControlViewLayoutManager.this.timeBar instanceof androidx.media3.ui.DefaultTimeBar) || androidx.media3.ui.PlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((androidx.media3.ui.DefaultTimeBar) androidx.media3.ui.PlayerControlViewLayoutManager.this.timeBar).showScrubber(250L);
            }
        });
        android.content.res.Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(androidx.media3.ui.R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(androidx.media3.ui.R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(androidx.media3.ui.R.dimen.exo_styled_bottom_bar_height);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.hideMainBarAnimator = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(1);
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(androidx.media3.ui.PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet.play(valueAnimatorOfFloat).with(ofTranslationY(0.0f, dimension, viewFindViewById)).with(ofTranslationY(0.0f, dimension, viewGroup));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        this.hideProgressBarAnimator = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(2);
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(androidx.media3.ui.PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet2.play(ofTranslationY(dimension, dimension2, viewFindViewById)).with(ofTranslationY(dimension, dimension2, viewGroup));
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        this.hideAllBarsAnimator = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(2);
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(androidx.media3.ui.PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(3);
            }
        });
        animatorSet3.play(valueAnimatorOfFloat).with(ofTranslationY(0.0f, dimension2, viewFindViewById)).with(ofTranslationY(0.0f, dimension2, viewGroup));
        android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
        this.showMainBarAnimator = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(4);
            }
        });
        animatorSet4.play(valueAnimatorOfFloat2).with(ofTranslationY(dimension, 0.0f, viewFindViewById)).with(ofTranslationY(dimension, 0.0f, viewGroup));
        android.animation.AnimatorSet animatorSet5 = new android.animation.AnimatorSet();
        this.showAllBarsAnimator = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(0);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(4);
            }
        });
        animatorSet5.play(valueAnimatorOfFloat2).with(ofTranslationY(dimension2, 0.0f, viewFindViewById)).with(ofTranslationY(dimension2, 0.0f, viewGroup));
        android.animation.ValueAnimator valueAnimatorOfFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.overflowShowAnimator = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new androidx.media3.ui.g(i3, this));
        valueAnimatorOfFloat3.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.basicControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.basicControls.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(0);
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.setTranslationX(androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth());
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.scrollTo(androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth(), 0);
                }
            }
        });
        android.animation.ValueAnimator valueAnimatorOfFloat4 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.overflowHideAnimator = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new androidx.media3.ui.g(i9, this));
        valueAnimatorOfFloat4.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(4);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.basicControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.basicControls.setVisibility(0);
                }
            }
        });
    }

    private void animateOverflow(float f9) {
        android.view.ViewGroup viewGroup = this.extraControlsScrollView;
        if (viewGroup != null) {
            this.extraControlsScrollView.setTranslationX((int) ((1.0f - f9) * viewGroup.getWidth()));
        }
        android.view.ViewGroup viewGroup2 = this.timeView;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f9);
        }
        android.view.ViewGroup viewGroup3 = this.basicControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f9);
        }
    }

    private static int getHeightWithMargins(android.view.View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return height;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + height;
    }

    private static int getWidthWithMargins(android.view.View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return width;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAllBars() {
        this.hideAllBarsAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideController() {
        setUxState(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideMainBar() {
        this.hideMainBarAnimator.start();
        postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideProgressBar() {
        this.hideProgressBarAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.view.View view = this.controlsBackground;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup = this.topControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup2 = this.centerControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup3 = this.minimalControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.view.View view = this.controlsBackground;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup = this.topControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup2 = this.centerControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup3 = this.minimalControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(android.animation.ValueAnimator valueAnimator) {
        animateOverflow(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(android.animation.ValueAnimator valueAnimator) {
        animateOverflow(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private static android.animation.ObjectAnimator ofTranslationY(float f9, float f10, android.view.View view) {
        return android.animation.ObjectAnimator.ofFloat(view, "translationY", f9, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(android.view.View view, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        boolean zUseMinimalMode = useMinimalMode();
        if (this.isMinimalMode != zUseMinimalMode) {
            this.isMinimalMode = zUseMinimalMode;
            view.post(new androidx.media3.ui.f(this, 0));
        }
        boolean z6 = i10 - i3 != i14 - i12;
        if (this.isMinimalMode || !z6) {
            return;
        }
        view.post(new androidx.media3.ui.f(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
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
            android.view.View childAt = this.extraControls.getChildAt(childCount);
            this.extraControls.removeViewAt(childCount);
            this.basicControls.addView(childAt, 0);
        }
        android.view.View view = this.overflowShowButton;
        if (view != null) {
            view.setVisibility(8);
        }
        int widthWithMargins = getWidthWithMargins(this.timeView);
        int childCount2 = this.basicControls.getChildCount() - 1;
        for (int i9 = 0; i9 < childCount2; i9++) {
            widthWithMargins += getWidthWithMargins(this.basicControls.getChildAt(i9));
        }
        if (widthWithMargins <= width) {
            android.view.ViewGroup viewGroup = this.extraControlsScrollView;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.overflowHideAnimator.isStarted()) {
                return;
            }
            this.overflowShowAnimator.cancel();
            this.overflowHideAnimator.start();
            return;
        }
        android.view.View view2 = this.overflowShowButton;
        if (view2 != null) {
            view2.setVisibility(0);
            widthWithMargins += getWidthWithMargins(this.overflowShowButton);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i10 = 0; i10 < childCount2; i10++) {
            android.view.View childAt2 = this.basicControls.getChildAt(i10);
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
            this.extraControls.addView((android.view.View) arrayList.get(i3), this.extraControls.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOverflowButtonClick(android.view.View view) {
        resetHideCallbacks();
        if (view.getId() == androidx.media3.ui.R.id.exo_overflow_show) {
            this.overflowShowAnimator.start();
        } else if (view.getId() == androidx.media3.ui.R.id.exo_overflow_hide) {
            this.overflowHideAnimator.start();
        }
    }

    private void postDelayedRunnable(java.lang.Runnable runnable, long j) {
        if (j >= 0) {
            this.playerControlView.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    private boolean shouldHideInMinimalMode(android.view.View view) {
        int id = view.getId();
        return id == androidx.media3.ui.R.id.exo_bottom_bar || id == androidx.media3.ui.R.id.exo_media_route_button_placeholder || id == androidx.media3.ui.R.id.exo_prev || id == androidx.media3.ui.R.id.exo_next || id == androidx.media3.ui.R.id.exo_rew || id == androidx.media3.ui.R.id.exo_rew_with_amount || id == androidx.media3.ui.R.id.exo_ffwd || id == androidx.media3.ui.R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
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

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayoutForSizeChange() {
        android.view.ViewGroup viewGroup = this.minimalControls;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.isMinimalMode ? 0 : 4);
        }
        if (this.timeBar != null) {
            int dimensionPixelSize = this.playerControlView.getResources().getDimensionPixelSize(androidx.media3.ui.R.dimen.exo_styled_progress_margin_bottom);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.timeBar.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.isMinimalMode) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.timeBar.setLayoutParams(marginLayoutParams);
            }
            android.view.View view = this.timeBar;
            if (view instanceof androidx.media3.ui.DefaultTimeBar) {
                androidx.media3.ui.DefaultTimeBar defaultTimeBar = (androidx.media3.ui.DefaultTimeBar) view;
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
        for (android.view.View view2 : this.shownButtons) {
            view2.setVisibility((this.isMinimalMode && shouldHideInMinimalMode(view2)) ? 4 : 0);
        }
    }

    private boolean useMinimalMode() {
        int paddingRight;
        int paddingBottom;
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        int height = (this.playerControlView.getHeight() - this.playerControlView.getPaddingBottom()) - this.playerControlView.getPaddingTop();
        int widthWithMargins = getWidthWithMargins(this.centerControls);
        android.view.ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            paddingRight = this.centerControls.getPaddingRight() + viewGroup.getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        int i3 = widthWithMargins - paddingRight;
        int heightWithMargins = getHeightWithMargins(this.centerControls);
        android.view.ViewGroup viewGroup2 = this.centerControls;
        if (viewGroup2 != null) {
            paddingBottom = this.centerControls.getPaddingBottom() + viewGroup2.getPaddingTop();
        } else {
            paddingBottom = 0;
        }
        return width <= java.lang.Math.max(i3, getWidthWithMargins(this.timeView) + getWidthWithMargins(this.overflowShowButton)) || height <= (getHeightWithMargins(this.bottomBar) * 2) + (heightWithMargins - paddingBottom);
    }

    public boolean getShowButton(android.view.View view) {
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
        android.view.View view = this.controlsBackground;
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

    public void setShowButton(android.view.View view, boolean z6) {
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
