package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public class PlayerControlView extends android.widget.FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private static final java.lang.String TAG = "PlayerControlView";
    private long[] adGroupTimesMs;
    private final android.view.View audioTrackButton;
    private final androidx.media3.ui.PlayerControlView.AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final androidx.media3.ui.PlayerControlView.ComponentListener componentListener;
    private final java.lang.Class<?> compositionPlayerClazz;
    private final java.lang.reflect.Method compositionPlayerIsScrubbingModeEnabledMethod;
    private final java.lang.reflect.Method compositionPlayerSetScrubbingModeEnabledMethod;
    private final androidx.media3.ui.PlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    private final android.widget.TextView durationView;
    private final java.lang.Class<?> exoplayerClazz;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final android.view.View fastForwardButton;
    private final android.widget.TextView fastForwardButtonTextView;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;
    private final android.widget.ImageView fullscreenButton;
    private final java.lang.String fullscreenEnterContentDescription;
    private final android.graphics.drawable.Drawable fullscreenEnterDrawable;
    private final java.lang.String fullscreenExitContentDescription;
    private final android.graphics.drawable.Drawable fullscreenExitDrawable;
    private final android.os.Handler handler;
    private boolean isAttachedToWindow;
    private boolean isFullscreen;
    private final java.lang.reflect.Method isScrubbingModeEnabledMethod;
    private final android.widget.ImageView minimalFullscreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    private final android.widget.ImageView nextButton;
    private androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final android.graphics.drawable.Drawable pauseButtonDrawable;
    private final androidx.media3.common.Timeline.Period period;
    private final android.graphics.drawable.Drawable playButtonDrawable;
    private final android.widget.ImageView playPauseButton;
    private final androidx.media3.ui.PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter;
    private final android.view.View playbackSpeedButton;
    private boolean[] playedAdGroups;
    private androidx.media3.common.Player player;
    private final android.widget.TextView positionView;
    private final android.widget.ImageView previousButton;
    private androidx.media3.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener;
    private final java.lang.String repeatAllButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatAllButtonDrawable;
    private final java.lang.String repeatOffButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOffButtonDrawable;
    private final java.lang.String repeatOneButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOneButtonDrawable;
    private final android.widget.ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final android.content.res.Resources resources;
    private final android.view.View rewindButton;
    private final android.widget.TextView rewindButtonTextView;
    private boolean scrubbing;
    private final java.lang.reflect.Method setScrubbingModeEnabledMethod;
    private final androidx.media3.ui.PlayerControlView.SettingsAdapter settingsAdapter;
    private final android.view.View settingsButton;
    private final androidx.recyclerview.widget.RecyclerView settingsView;
    private final android.widget.PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private boolean showPlayButtonIfSuppressed;
    private int showTimeoutMs;
    private final android.widget.ImageView shuffleButton;
    private final android.graphics.drawable.Drawable shuffleOffButtonDrawable;
    private final java.lang.String shuffleOffContentDescription;
    private final android.graphics.drawable.Drawable shuffleOnButtonDrawable;
    private final java.lang.String shuffleOnContentDescription;
    private final android.widget.ImageView subtitleButton;
    private final android.graphics.drawable.Drawable subtitleOffButtonDrawable;
    private final java.lang.String subtitleOffContentDescription;
    private final android.graphics.drawable.Drawable subtitleOnButtonDrawable;
    private final java.lang.String subtitleOnContentDescription;
    private final androidx.media3.ui.PlayerControlView.TextTrackSelectionAdapter textTrackSelectionAdapter;
    private final androidx.media3.ui.TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private boolean timeBarScrubbingEnabled;
    private final androidx.media3.ui.TrackNameProvider trackNameProvider;
    private final java.lang.Runnable updateProgressAction;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.ui.PlayerControlView.VisibilityListener> visibilityListeners;
    private final android.widget.ImageView vrButton;
    private final androidx.media3.common.Timeline.Window window;

    public final class AudioTrackSelectionAdapter extends androidx.media3.ui.PlayerControlView.TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        private boolean hasSelectionOverride(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            for (int i3 = 0; i3 < this.tracks.size(); i3++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i3).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(android.view.View view) {
            if (androidx.media3.ui.PlayerControlView.this.player == null || !androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            ((androidx.media3.common.Player) androidx.media3.common.util.Util.castNonNull(androidx.media3.ui.PlayerControlView.this.player)).setTrackSelectionParameters(androidx.media3.ui.PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, androidx.media3.ui.PlayerControlView.this.getResources().getString(androidx.media3.ui.R.string.exo_track_selection_auto));
            androidx.media3.ui.PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(java.util.List<androidx.media3.ui.PlayerControlView.TrackInformation> list) {
            this.tracks = list;
            androidx.media3.common.Player player = androidx.media3.ui.PlayerControlView.this.player;
            player.getClass();
            androidx.media3.common.TrackSelectionParameters trackSelectionParameters = player.getTrackSelectionParameters();
            if (list.isEmpty()) {
                androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, androidx.media3.ui.PlayerControlView.this.getResources().getString(androidx.media3.ui.R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, androidx.media3.ui.PlayerControlView.this.getResources().getString(androidx.media3.ui.R.string.exo_track_selection_auto));
                return;
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                androidx.media3.ui.PlayerControlView.TrackInformation trackInformation = list.get(i3);
                if (trackInformation.isSelected()) {
                    androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(androidx.media3.ui.R.string.exo_track_selection_auto);
            androidx.media3.common.Player player = androidx.media3.ui.PlayerControlView.this.player;
            player.getClass();
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(player.getTrackSelectionParameters()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new androidx.media3.ui.c(0, this));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(java.lang.String str) {
            androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }
    }

    public final class ComponentListener implements androidx.media3.common.Player.Listener, androidx.media3.ui.TimeBar.OnScrubListener, android.view.View.OnClickListener, android.widget.PopupWindow.OnDismissListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.media3.common.Player player = androidx.media3.ui.PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (androidx.media3.ui.PlayerControlView.this.nextButton == view) {
                if (player.isCommandAvailable(9)) {
                    player.seekToNext();
                    return;
                }
                return;
            }
            if (androidx.media3.ui.PlayerControlView.this.previousButton == view) {
                if (player.isCommandAvailable(7)) {
                    player.seekToPrevious();
                    return;
                }
                return;
            }
            if (androidx.media3.ui.PlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                    return;
                }
                player.seekForward();
                return;
            }
            if (androidx.media3.ui.PlayerControlView.this.rewindButton == view) {
                if (player.isCommandAvailable(11)) {
                    player.seekBack();
                    return;
                }
                return;
            }
            if (androidx.media3.ui.PlayerControlView.this.playPauseButton == view) {
                androidx.media3.common.util.Util.handlePlayPauseButtonAction(player, androidx.media3.ui.PlayerControlView.this.showPlayButtonIfSuppressed);
                return;
            }
            if (androidx.media3.ui.PlayerControlView.this.repeatToggleButton == view) {
                if (player.isCommandAvailable(15)) {
                    player.setRepeatMode(androidx.media3.common.util.RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), androidx.media3.ui.PlayerControlView.this.repeatToggleModes));
                    return;
                }
                return;
            }
            if (androidx.media3.ui.PlayerControlView.this.shuffleButton == view) {
                if (player.isCommandAvailable(14)) {
                    player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (androidx.media3.ui.PlayerControlView.this.settingsButton == view) {
                androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                androidx.media3.ui.PlayerControlView playerControlView = androidx.media3.ui.PlayerControlView.this;
                playerControlView.displaySettingsWindow(playerControlView.settingsAdapter, androidx.media3.ui.PlayerControlView.this.settingsButton);
                return;
            }
            if (androidx.media3.ui.PlayerControlView.this.playbackSpeedButton == view) {
                androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                androidx.media3.ui.PlayerControlView playerControlView2 = androidx.media3.ui.PlayerControlView.this;
                playerControlView2.displaySettingsWindow(playerControlView2.playbackSpeedAdapter, androidx.media3.ui.PlayerControlView.this.playbackSpeedButton);
            } else if (androidx.media3.ui.PlayerControlView.this.audioTrackButton == view) {
                androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                androidx.media3.ui.PlayerControlView playerControlView3 = androidx.media3.ui.PlayerControlView.this;
                playerControlView3.displaySettingsWindow(playerControlView3.audioTrackSelectionAdapter, androidx.media3.ui.PlayerControlView.this.audioTrackButton);
            } else if (androidx.media3.ui.PlayerControlView.this.subtitleButton == view) {
                androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                androidx.media3.ui.PlayerControlView playerControlView4 = androidx.media3.ui.PlayerControlView.this;
                playerControlView4.displaySettingsWindow(playerControlView4.textTrackSelectionAdapter, androidx.media3.ui.PlayerControlView.this.subtitleButton);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (androidx.media3.ui.PlayerControlView.this.needToHideBars) {
                androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            if (events.containsAny(4, 5, 13)) {
                androidx.media3.ui.PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateProgress();
            }
            if (events.containsAny(8, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.containsAny(9, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateTimeline();
            }
            if (events.containsAny(12, 13)) {
                androidx.media3.ui.PlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.containsAny(2, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateTrackLists();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(androidx.media3.ui.TimeBar timeBar, long j) {
            if (androidx.media3.ui.PlayerControlView.this.positionView != null) {
                androidx.media3.ui.PlayerControlView.this.positionView.setText(androidx.media3.common.util.Util.getStringForTime(androidx.media3.ui.PlayerControlView.this.formatBuilder, androidx.media3.ui.PlayerControlView.this.formatter, j));
            }
            androidx.media3.ui.PlayerControlView playerControlView = androidx.media3.ui.PlayerControlView.this;
            if (playerControlView.isScrubbingModeEnabled(playerControlView.player)) {
                androidx.media3.ui.PlayerControlView playerControlView2 = androidx.media3.ui.PlayerControlView.this;
                playerControlView2.seekToTimeBarPosition(playerControlView2.player, j);
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(androidx.media3.ui.TimeBar timeBar, long j) {
            androidx.media3.ui.PlayerControlView.this.scrubbing = true;
            if (androidx.media3.ui.PlayerControlView.this.positionView != null) {
                androidx.media3.ui.PlayerControlView.this.positionView.setText(androidx.media3.common.util.Util.getStringForTime(androidx.media3.ui.PlayerControlView.this.formatBuilder, androidx.media3.ui.PlayerControlView.this.formatter, j));
            }
            androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
            if (androidx.media3.ui.PlayerControlView.this.player != null && androidx.media3.ui.PlayerControlView.this.timeBarScrubbingEnabled) {
                androidx.media3.ui.PlayerControlView playerControlView = androidx.media3.ui.PlayerControlView.this;
                if (playerControlView.isExoPlayer(playerControlView.player)) {
                    try {
                        java.lang.reflect.Method method = androidx.media3.ui.PlayerControlView.this.setScrubbingModeEnabledMethod;
                        method.getClass();
                        method.invoke(androidx.media3.ui.PlayerControlView.this.player, java.lang.Boolean.TRUE);
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
                        throw new java.lang.RuntimeException(e6);
                    }
                } else {
                    androidx.media3.ui.PlayerControlView playerControlView2 = androidx.media3.ui.PlayerControlView.this;
                    if (playerControlView2.isCompositionPlayer(playerControlView2.player)) {
                        try {
                            java.lang.reflect.Method method2 = androidx.media3.ui.PlayerControlView.this.compositionPlayerSetScrubbingModeEnabledMethod;
                            method2.getClass();
                            method2.invoke(androidx.media3.ui.PlayerControlView.this.player, java.lang.Boolean.TRUE);
                        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e9) {
                            throw new java.lang.RuntimeException(e9);
                        }
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                        androidx.media3.common.Player player = androidx.media3.ui.PlayerControlView.this.player;
                        player.getClass();
                        sb.append(player.getClass());
                        androidx.media3.common.util.Log.w(androidx.media3.ui.PlayerControlView.TAG, sb.toString());
                    }
                }
            }
            androidx.media3.ui.PlayerControlView playerControlView3 = androidx.media3.ui.PlayerControlView.this;
            if (playerControlView3.isScrubbingModeEnabled(playerControlView3.player)) {
                androidx.media3.ui.PlayerControlView playerControlView4 = androidx.media3.ui.PlayerControlView.this;
                playerControlView4.seekToTimeBarPosition(playerControlView4.player, j);
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(androidx.media3.ui.TimeBar timeBar, long j, boolean z6) {
            androidx.media3.ui.PlayerControlView.this.scrubbing = false;
            if (androidx.media3.ui.PlayerControlView.this.player != null) {
                if (!z6) {
                    androidx.media3.ui.PlayerControlView playerControlView = androidx.media3.ui.PlayerControlView.this;
                    playerControlView.seekToTimeBarPosition(playerControlView.player, j);
                }
                androidx.media3.ui.PlayerControlView playerControlView2 = androidx.media3.ui.PlayerControlView.this;
                if (playerControlView2.isExoPlayer(playerControlView2.player)) {
                    try {
                        java.lang.reflect.Method method = androidx.media3.ui.PlayerControlView.this.setScrubbingModeEnabledMethod;
                        method.getClass();
                        method.invoke(androidx.media3.ui.PlayerControlView.this.player, java.lang.Boolean.FALSE);
                    } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
                        throw new java.lang.RuntimeException(e6);
                    }
                } else {
                    androidx.media3.ui.PlayerControlView playerControlView3 = androidx.media3.ui.PlayerControlView.this;
                    if (playerControlView3.isCompositionPlayer(playerControlView3.player)) {
                        try {
                            java.lang.reflect.Method method2 = androidx.media3.ui.PlayerControlView.this.compositionPlayerSetScrubbingModeEnabledMethod;
                            method2.getClass();
                            method2.invoke(androidx.media3.ui.PlayerControlView.this.player, java.lang.Boolean.FALSE);
                        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e9) {
                            throw new java.lang.RuntimeException(e9);
                        }
                    }
                }
            }
            androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    @java.lang.Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z6);
    }

    public final class PlaybackSpeedAdapter extends androidx.recyclerview.widget.A {
        private final java.lang.String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public PlaybackSpeedAdapter(java.lang.String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(int i3, android.view.View view) {
            if (i3 != this.selectedIndex) {
                androidx.media3.ui.PlayerControlView.this.setPlaybackSpeed(this.playbackSpeeds[i3]);
            }
            androidx.media3.ui.PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.A
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        public java.lang.String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        public void updateSelectedIndex(float f9) {
            int i3 = 0;
            float f10 = Float.MAX_VALUE;
            int i9 = 0;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i3 >= fArr.length) {
                    this.selectedIndex = i9;
                    return;
                }
                float fAbs = java.lang.Math.abs(f9 - fArr[i3]);
                if (fAbs < f10) {
                    i9 = i3;
                    f10 = fAbs;
                }
                i3++;
            }
        }

        @Override // androidx.recyclerview.widget.A
        public void onBindViewHolder(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder, final int i3) {
            java.lang.String[] strArr = this.playbackSpeedTexts;
            if (i3 < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i3]);
            }
            if (i3 == this.selectedIndex) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f17155h.lambda$onBindViewHolder$0(i3, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.A
        public androidx.media3.ui.PlayerControlView.SubSettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i3) {
            return new androidx.media3.ui.PlayerControlView.SubSettingViewHolder(android.view.LayoutInflater.from(androidx.media3.ui.PlayerControlView.this.getContext()).inflate(androidx.media3.ui.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j9);
    }

    public final class SettingViewHolder extends androidx.recyclerview.widget.X {
        private final android.widget.ImageView iconView;
        private final android.widget.TextView mainTextView;
        private final android.widget.TextView subTextView;

        public SettingViewHolder(android.view.View view) {
            super(view);
            if (android.os.Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (android.widget.TextView) view.findViewById(androidx.media3.ui.R.id.exo_main_text);
            this.subTextView = (android.widget.TextView) view.findViewById(androidx.media3.ui.R.id.exo_sub_text);
            this.iconView = (android.widget.ImageView) view.findViewById(androidx.media3.ui.R.id.exo_icon);
            view.setOnClickListener(new androidx.media3.ui.c(1, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(android.view.View view) {
            androidx.media3.ui.PlayerControlView.this.onSettingViewClicked(getBindingAdapterPosition());
        }
    }

    public class SettingsAdapter extends androidx.recyclerview.widget.A {
        private final android.graphics.drawable.Drawable[] iconIds;
        private final java.lang.String[] mainTexts;
        private final java.lang.String[] subTexts;

        public SettingsAdapter(java.lang.String[] strArr, android.graphics.drawable.Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new java.lang.String[strArr.length];
            this.iconIds = drawableArr;
        }

        private boolean shouldShowSetting(int i3) {
            if (androidx.media3.ui.PlayerControlView.this.player == null) {
                return false;
            }
            if (i3 == 0) {
                return androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(13);
            }
            if (i3 != 1) {
                return true;
            }
            return androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(30) && androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(29);
        }

        @Override // androidx.recyclerview.widget.A
        public int getItemCount() {
            return this.mainTexts.length;
        }

        @Override // androidx.recyclerview.widget.A
        public long getItemId(int i3) {
            return i3;
        }

        public boolean hasSettingsToShow() {
            return shouldShowSetting(1) || shouldShowSetting(0);
        }

        public void setSubTextAtPosition(int i3, java.lang.String str) {
            this.subTexts[i3] = str;
        }

        @Override // androidx.recyclerview.widget.A
        public void onBindViewHolder(androidx.media3.ui.PlayerControlView.SettingViewHolder settingViewHolder, int i3) {
            if (shouldShowSetting(i3)) {
                settingViewHolder.itemView.setLayoutParams(new androidx.recyclerview.widget.J(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new androidx.recyclerview.widget.J(0, 0));
            }
            settingViewHolder.mainTextView.setText(this.mainTexts[i3]);
            if (this.subTexts[i3] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i3]);
            }
            if (this.iconIds[i3] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i3]);
            }
        }

        @Override // androidx.recyclerview.widget.A
        public androidx.media3.ui.PlayerControlView.SettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i3) {
            return androidx.media3.ui.PlayerControlView.this.new SettingViewHolder(android.view.LayoutInflater.from(androidx.media3.ui.PlayerControlView.this.getContext()).inflate(androidx.media3.ui.R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public static class SubSettingViewHolder extends androidx.recyclerview.widget.X {
        public final android.view.View checkView;
        public final android.widget.TextView textView;

        public SubSettingViewHolder(android.view.View view) {
            super(view);
            if (android.os.Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (android.widget.TextView) view.findViewById(androidx.media3.ui.R.id.exo_text);
            this.checkView = view.findViewById(androidx.media3.ui.R.id.exo_check);
        }
    }

    public final class TextTrackSelectionAdapter extends androidx.media3.ui.PlayerControlView.TrackSelectionAdapter {
        private TextTrackSelectionAdapter() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolderAtZeroPosition$0(android.view.View view) {
            if (androidx.media3.ui.PlayerControlView.this.player == null || !androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            androidx.media3.ui.PlayerControlView.this.player.setTrackSelectionParameters(androidx.media3.ui.PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).setPreferredTextLanguage(null).setPreferredTextRoleFlags(0).build());
            androidx.media3.ui.PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(java.util.List<androidx.media3.ui.PlayerControlView.TrackInformation> list) {
            boolean z6 = false;
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (list.get(i3).isSelected()) {
                    z6 = true;
                    break;
                }
            }
            if (androidx.media3.ui.PlayerControlView.this.subtitleButton != null) {
                android.widget.ImageView imageView = androidx.media3.ui.PlayerControlView.this.subtitleButton;
                androidx.media3.ui.PlayerControlView playerControlView = androidx.media3.ui.PlayerControlView.this;
                imageView.setImageDrawable(z6 ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
                androidx.media3.ui.PlayerControlView.this.subtitleButton.setContentDescription(z6 ? androidx.media3.ui.PlayerControlView.this.subtitleOnContentDescription : androidx.media3.ui.PlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder) {
            boolean z6;
            subSettingViewHolder.textView.setText(androidx.media3.ui.R.string.exo_track_selection_none);
            int i3 = 0;
            while (true) {
                if (i3 >= this.tracks.size()) {
                    z6 = true;
                    break;
                } else {
                    if (this.tracks.get(i3).isSelected()) {
                        z6 = false;
                        break;
                    }
                    i3++;
                }
            }
            subSettingViewHolder.checkView.setVisibility(z6 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new androidx.media3.ui.c(2, this));
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(java.lang.String str) {
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.A
        public void onBindViewHolder(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder, int i3) {
            super.onBindViewHolder(subSettingViewHolder, i3);
            if (i3 > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i3 + (-1)).isSelected() ? 0 : 4);
            }
        }
    }

    public static final class TrackInformation {
        public final androidx.media3.common.Tracks.Group trackGroup;
        public final int trackIndex;
        public final java.lang.String trackName;

        public TrackInformation(androidx.media3.common.Tracks tracks, int i3, int i9, java.lang.String str) {
            this.trackGroup = (androidx.media3.common.Tracks.Group) tracks.getGroups().get(i3);
            this.trackIndex = i9;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }
    }

    public abstract class TrackSelectionAdapter extends androidx.recyclerview.widget.A {
        protected java.util.List<androidx.media3.ui.PlayerControlView.TrackInformation> tracks = new java.util.ArrayList();

        public TrackSelectionAdapter() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onBindViewHolder$0(androidx.media3.common.Player player, androidx.media3.common.TrackGroup trackGroup, androidx.media3.ui.PlayerControlView.TrackInformation trackInformation, android.view.View view) {
            if (player.isCommandAvailable(29)) {
                player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new androidx.media3.common.TrackSelectionOverride(trackGroup, p076i4.AbstractC2186b0.y(java.lang.Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
                onTrackSelection(trackInformation.trackName);
                androidx.media3.ui.PlayerControlView.this.settingsWindow.dismiss();
            }
        }

        public void clear() {
            this.tracks = java.util.Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.A
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        public abstract void init(java.util.List<androidx.media3.ui.PlayerControlView.TrackInformation> list);

        public abstract void onBindViewHolderAtZeroPosition(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder);

        public abstract void onTrackSelection(java.lang.String str);

        @Override // androidx.recyclerview.widget.A
        public void onBindViewHolder(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder, int i3) {
            final androidx.media3.common.Player player = androidx.media3.ui.PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i3 == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final androidx.media3.ui.PlayerControlView.TrackInformation trackInformation = this.tracks.get(i3 - 1);
            final androidx.media3.common.TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            boolean z6 = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z6 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f17157h.lambda$onBindViewHolder$0(player, mediaTrackGroup, trackInformation, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.A
        public androidx.media3.ui.PlayerControlView.SubSettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i3) {
            return new androidx.media3.ui.PlayerControlView.SubSettingViewHolder(android.view.LayoutInflater.from(androidx.media3.ui.PlayerControlView.this.getContext()).inflate(androidx.media3.ui.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @java.lang.Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i3);
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(android.content.Context context) {
        this(context, null);
    }

    private static boolean canShowMultiWindowTimeBar(androidx.media3.common.Player player, androidx.media3.common.Timeline.Window window) {
        androidx.media3.common.Timeline currentTimeline;
        int windowCount;
        if (!player.isCommandAvailable(17) || (windowCount = (currentTimeline = player.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i3 = 0; i3 < windowCount; i3++) {
            if (currentTimeline.getWindow(i3, window).durationUs == androidx.media3.common.C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(androidx.recyclerview.widget.A a2, android.view.View view) {
        this.settingsView.setAdapter(a2);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private p076i4.AbstractC2186b0 gatherSupportedTrackInfosOfType(androidx.media3.common.Tracks tracks, int i3) {
        p076i4.AbstractC2230y.d(4, "initialCapacity");
        java.lang.Object[] objArrCopyOf = new java.lang.Object[4];
        p076i4.AbstractC2186b0 groups = tracks.getGroups();
        int i9 = 0;
        for (int i10 = 0; i10 < groups.size(); i10++) {
            androidx.media3.common.Tracks.Group group = (androidx.media3.common.Tracks.Group) groups.get(i10);
            if (group.getType() == i3) {
                for (int i11 = 0; i11 < group.length; i11++) {
                    if (group.isTrackSupported(i11)) {
                        androidx.media3.common.Format trackFormat = group.getTrackFormat(i11);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            androidx.media3.ui.PlayerControlView.TrackInformation trackInformation = new androidx.media3.ui.PlayerControlView.TrackInformation(tracks, i10, i11, this.trackNameProvider.getTrackName(trackFormat));
                            int i12 = i9 + 1;
                            int iB = p076i4.V.b(objArrCopyOf.length, i12);
                            if (iB > objArrCopyOf.length) {
                                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iB);
                            }
                            objArrCopyOf[i9] = trackInformation;
                            i9 = i12;
                        }
                    }
                }
            }
        }
        return p076i4.AbstractC2186b0.r(objArrCopyOf, i9);
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        androidx.media3.common.Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            androidx.media3.common.Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
                return;
            }
            androidx.media3.ui.PlayerControlView.TextTrackSelectionAdapter textTrackSelectionAdapter = this.textTrackSelectionAdapter;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            textTrackSelectionAdapter.init(p076i4.S0.f22832l);
        }
    }

    private static void initializeFullscreenButton(android.view.View view, android.view.View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isCompositionPlayer(androidx.media3.common.Player player) {
        java.lang.Class<?> cls;
        return (player == null || (cls = this.compositionPlayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isExoPlayer(androidx.media3.common.Player player) {
        java.lang.Class<?> cls;
        return (player == null || (cls = this.exoplayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    private static boolean isHandledMediaKey(int i3) {
        return i3 == 90 || i3 == 89 || i3 == 85 || i3 == 79 || i3 == 126 || i3 == 127 || i3 == 87 || i3 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isScrubbingModeEnabled(androidx.media3.common.Player player) {
        try {
            if (isExoPlayer(player)) {
                java.lang.reflect.Method method = this.isScrubbingModeEnabledMethod;
                method.getClass();
                java.lang.Object objInvoke = method.invoke(player, null);
                objInvoke.getClass();
                if (((java.lang.Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (!isCompositionPlayer(player)) {
                return false;
            }
            java.lang.reflect.Method method2 = this.compositionPlayerIsScrubbingModeEnabledMethod;
            method2.getClass();
            java.lang.Object objInvoke2 = method2.invoke(player, null);
            objInvoke2.getClass();
            return ((java.lang.Boolean) objInvoke2).booleanValue();
        } catch (java.lang.IllegalAccessException e6) {
            e = e6;
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.reflect.InvocationTargetException e9) {
            e = e9;
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullscreenButtonClicked(android.view.View view) {
        updateIsFullscreen(!this.isFullscreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(android.view.View view, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i11 - i9;
        int i17 = i15 - i13;
        if (!(i10 - i3 == i14 - i12 && i16 == i17) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i3) {
        if (i3 == 0) {
            androidx.media3.ui.PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter = this.playbackSpeedAdapter;
            android.view.View view = this.settingsButton;
            view.getClass();
            displaySettingsWindow(playbackSpeedAdapter, view);
            return;
        }
        if (i3 != 1) {
            this.settingsWindow.dismiss();
            return;
        }
        androidx.media3.ui.PlayerControlView.AudioTrackSelectionAdapter audioTrackSelectionAdapter = this.audioTrackSelectionAdapter;
        android.view.View view2 = this.settingsButton;
        view2.getClass();
        displaySettingsWindow(audioTrackSelectionAdapter, view2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(androidx.media3.common.Player player, long j) {
        if (this.multiWindowTimeBar) {
            if (player.isCommandAvailable(17) && player.isCommandAvailable(10)) {
                androidx.media3.common.Timeline currentTimeline = player.getCurrentTimeline();
                int windowCount = currentTimeline.getWindowCount();
                int i3 = 0;
                while (true) {
                    long durationMs = currentTimeline.getWindow(i3, this.window).getDurationMs();
                    if (j < durationMs) {
                        break;
                    }
                    if (i3 == windowCount - 1) {
                        j = durationMs;
                        break;
                    } else {
                        j -= durationMs;
                        i3++;
                    }
                }
                player.seekTo(i3, j);
            }
        } else if (player.isCommandAvailable(5)) {
            player.seekTo(j);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f9) {
        androidx.media3.common.Player player = this.player;
        if (player == null || !player.isCommandAvailable(13)) {
            return;
        }
        androidx.media3.common.Player player2 = this.player;
        player2.setPlaybackParameters(player2.getPlaybackParameters().withSpeed(f9));
    }

    private void updateButton(boolean z6, android.view.View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z6);
        view.setAlpha(z6 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    private void updateFastForwardButton() {
        androidx.media3.common.Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : 15000L) / 1000);
        android.widget.TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(seekForwardIncrement));
        }
        android.view.View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(androidx.media3.ui.R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, java.lang.Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void updateFullscreenButtonForState(android.widget.ImageView imageView, boolean z6) {
        if (imageView == null) {
            return;
        }
        if (z6) {
            imageView.setImageDrawable(this.fullscreenExitDrawable);
            imageView.setContentDescription(this.fullscreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullscreenEnterDrawable);
            imageView.setContentDescription(this.fullscreenEnterContentDescription);
        }
    }

    private static void updateFullscreenButtonVisibility(android.view.View view, boolean z6) {
        if (view == null) {
            return;
        }
        if (z6) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.isAttachedToWindow) {
            androidx.media3.common.Player player = this.player;
            if (player != null) {
                zIsCommandAvailable = (this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window)) ? player.isCommandAvailable(10) : player.isCommandAvailable(5);
                zIsCommandAvailable3 = player.isCommandAvailable(7);
                zIsCommandAvailable4 = player.isCommandAvailable(11);
                zIsCommandAvailable5 = player.isCommandAvailable(12);
                zIsCommandAvailable2 = player.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            if (zIsCommandAvailable4) {
                updateRewindButton();
            }
            if (zIsCommandAvailable5) {
                updateFastForwardButton();
            }
            updateButton(zIsCommandAvailable3, this.previousButton);
            updateButton(zIsCommandAvailable4, this.rewindButton);
            updateButton(zIsCommandAvailable5, this.fastForwardButton);
            updateButton(zIsCommandAvailable2, this.nextButton);
            androidx.media3.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean zShouldShowPlayButton = androidx.media3.common.util.Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            android.graphics.drawable.Drawable drawable = zShouldShowPlayButton ? this.playButtonDrawable : this.pauseButtonDrawable;
            int i3 = zShouldShowPlayButton ? androidx.media3.ui.R.string.exo_controls_play_description : androidx.media3.ui.R.string.exo_controls_pause_description;
            this.playPauseButton.setImageDrawable(drawable);
            this.playPauseButton.setContentDescription(this.resources.getString(i3));
            updateButton(androidx.media3.common.util.Util.shouldEnablePlayPauseButton(this.player), this.playPauseButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        androidx.media3.common.Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
        updateSettingsButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.isAttachedToWindow) {
            androidx.media3.common.Player player = this.player;
            if (player == null || !player.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = player.getContentPosition() + this.currentWindowOffset;
                contentBufferedPosition = player.getContentBufferedPosition() + this.currentWindowOffset;
            }
            android.widget.TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(androidx.media3.common.util.Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            androidx.media3.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(isScrubbingModeEnabled(player) ? contentPosition : contentBufferedPosition);
            }
            androidx.media3.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            androidx.media3.ui.TimeBar timeBar2 = this.timeBar;
            long jMin = java.lang.Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f9 = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, androidx.media3.common.util.Util.constrainValue(f9 > 0.0f ? (long) (jMin / f9) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        android.widget.ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            androidx.media3.common.Player player = this.player;
            if (player == null || !player.isCommandAvailable(15)) {
                updateButton(false, this.repeatToggleButton);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, this.repeatToggleButton);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
        }
    }

    private void updateRewindButton() {
        androidx.media3.common.Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        android.widget.TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(seekBackIncrement));
        }
        android.view.View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(androidx.media3.ui.R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, java.lang.Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateSettingsButton() {
        updateButton(this.settingsAdapter.hasSettingsToShow(), this.settingsButton);
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(java.lang.Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(java.lang.Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        android.widget.ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            androidx.media3.common.Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (player == null || !player.isCommandAvailable(14)) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, this.shuffleButton);
                this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(player.getShuffleModeEnabled() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    public void updateTimeline() {
        int i3;
        long jMsToUs;
        androidx.media3.common.Timeline.Window window;
        long j;
        androidx.media3.common.Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z6 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window);
        long j9 = 0;
        this.currentWindowOffset = 0L;
        androidx.media3.common.Timeline currentTimeline = player.isCommandAvailable(17) ? player.getCurrentTimeline() : androidx.media3.common.Timeline.EMPTY;
        boolean zIsEmpty = currentTimeline.isEmpty();
        long j10 = androidx.media3.common.C.TIME_UNSET;
        if (!zIsEmpty) {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z9 = this.multiWindowTimeBar;
            int i9 = z9 ? 0 : currentMediaItemIndex;
            int windowCount = z9 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            i3 = 0;
            long j11 = 0;
            while (i9 <= windowCount) {
                if (i9 == currentMediaItemIndex) {
                    this.currentWindowOffset = androidx.media3.common.util.Util.usToMs(j11);
                }
                currentTimeline.getWindow(i9, this.window);
                androidx.media3.common.Timeline.Window window2 = this.window;
                boolean z10 = z6;
                long j12 = j9;
                if (window2.durationUs == j10) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.multiWindowTimeBar ^ z10);
                    break;
                }
                int i10 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i10 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i10, this.period);
                        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
                        int adGroupCount = this.period.getAdGroupCount();
                        while (removedAdGroupCount < adGroupCount) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                j = j10;
                                long j13 = this.period.durationUs;
                                if (j13 != j) {
                                    adGroupTimeUs = j13;
                                }
                                removedAdGroupCount++;
                                j10 = j;
                            } else {
                                j = j10;
                            }
                            long positionInWindowUs = this.period.getPositionInWindowUs() + adGroupTimeUs;
                            if (positionInWindowUs >= j12) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i3 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.adGroupTimesMs = java.util.Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = java.util.Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i3] = androidx.media3.common.util.Util.usToMs(positionInWindowUs + j11);
                                this.playedAdGroups[i3] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i3++;
                            }
                            removedAdGroupCount++;
                            j10 = j;
                        }
                        i10++;
                    }
                }
                j11 += window.durationUs;
                i9++;
                j9 = j12;
                z6 = true;
            }
            jMsToUs = j11;
        } else if (player.isCommandAvailable(16)) {
            long contentDuration = player.getContentDuration();
            if (contentDuration != androidx.media3.common.C.TIME_UNSET) {
                jMsToUs = androidx.media3.common.util.Util.msToUs(contentDuration);
                i3 = 0;
            } else {
                i3 = 0;
                jMsToUs = 0;
            }
        } else {
            i3 = 0;
            jMsToUs = 0;
        }
        long jUsToMs = androidx.media3.common.util.Util.usToMs(jMsToUs);
        android.widget.TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(androidx.media3.common.util.Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        androidx.media3.ui.TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i11 = i3 + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i11 > jArr2.length) {
                this.adGroupTimesMs = java.util.Arrays.copyOf(jArr2, i11);
                this.playedAdGroups = java.util.Arrays.copyOf(this.playedAdGroups, i11);
            }
            java.lang.System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i3, length2);
            java.lang.System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i3, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i11);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
        updateSettingsButton();
    }

    @java.lang.Deprecated
    public void addVisibilityListener(androidx.media3.ui.PlayerControlView.VisibilityListener visibilityListener) {
        visibilityListener.getClass();
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.media3.common.Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89 && player.isCommandAvailable(11)) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            androidx.media3.common.util.Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
            return true;
        }
        if (keyCode == 87) {
            if (!player.isCommandAvailable(9)) {
                return true;
            }
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!player.isCommandAvailable(7)) {
                return true;
            }
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            androidx.media3.common.util.Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        androidx.media3.common.util.Util.handlePauseButtonAction(player);
        return true;
    }

    public androidx.media3.common.Player getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    public void notifyOnVisibilityChange() {
        java.util.Iterator<androidx.media3.ui.PlayerControlView.VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        super.onLayout(z6, i3, i9, i10, i11);
        this.controlViewLayoutManager.onLayout(z6, i3, i9, i10, i11);
    }

    @java.lang.Deprecated
    public void removeVisibilityListener(androidx.media3.ui.PlayerControlView.VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void requestPlayPauseFocus() {
        android.widget.ImageView imageView = this.playPauseButton;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z6) {
        this.controlViewLayoutManager.setAnimationEnabled(z6);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            zArr.getClass();
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(jArr.length == zArr.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr;
        }
        updateTimeline();
    }

    public void setMediaRouteButtonViewProvider(androidx.media3.common.ViewProvider viewProvider) {
        final android.view.View viewFindViewById = findViewById(androidx.media3.ui.R.id.exo_media_route_button_placeholder);
        if (viewFindViewById == null) {
            throw new java.lang.IllegalStateException("The media route button placeholder is missing.");
        }
        if (viewProvider == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        final android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById.getParent();
        if (viewGroup == null) {
            throw new java.lang.IllegalStateException("The media route button placeholder has no parent view.");
        }
        com.google.common.util.concurrent.J view = viewProvider.getView(viewGroup);
        com.google.common.util.concurrent.B b9 = new com.google.common.util.concurrent.B() { // from class: androidx.media3.ui.PlayerControlView.1
            @Override // com.google.common.util.concurrent.B
            public void onFailure(java.lang.Throwable th) {
                viewFindViewById.setVisibility(8);
            }

            @Override // com.google.common.util.concurrent.B
            public void onSuccess(android.view.View view2) {
                android.view.ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.IllegalStateException("The media route button placeholder missing layout params.");
                }
                view2.setId(androidx.media3.ui.R.id.exo_media_route_button_placeholder);
                view2.setLayoutParams(layoutParams);
                int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
                viewGroup.removeView(viewFindViewById);
                viewGroup.addView(view2, iIndexOfChild);
                view2.setVisibility(0);
                androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.setShowButton(view2, true);
            }
        };
        android.os.Handler handler = this.handler;
        java.util.Objects.requireNonNull(handler);
        com.google.common.util.concurrent.D.d(view, b9, new androidx.media3.common.util.d(handler));
    }

    @java.lang.Deprecated
    public void setOnFullScreenModeChangedListener(androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullscreenButtonVisibility(this.fullscreenButton, onFullScreenModeChangedListener != null);
        updateFullscreenButtonVisibility(this.minimalFullscreenButton, onFullScreenModeChangedListener != null);
    }

    public void setPlayer(androidx.media3.common.Player player) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(player == null || player.getApplicationLooper() == android.os.Looper.getMainLooper());
        androidx.media3.common.Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setProgressUpdateListener(androidx.media3.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i3) {
        this.repeatToggleModes = i3;
        androidx.media3.common.Player player = this.player;
        if (player != null && player.isCommandAvailable(15)) {
            int repeatMode = this.player.getRepeatMode();
            if (i3 == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i3 == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i3 == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i3 != 0);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z6) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z6);
        updateNavigation();
    }

    @java.lang.Deprecated
    public void setShowMultiWindowTimeBar(boolean z6) {
        this.showMultiWindowTimeBar = z6;
        updateTimeline();
    }

    public void setShowNextButton(boolean z6) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z6);
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z6) {
        this.showPlayButtonIfSuppressed = z6;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z6) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z6);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z6) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z6);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z6) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z6);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z6) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z6);
    }

    public void setShowTimeoutMs(int i3) {
        this.showTimeoutMs = i3;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z6) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z6);
    }

    public void setTimeBarMinUpdateInterval(int i3) {
        this.timeBarMinUpdateIntervalMs = androidx.media3.common.util.Util.constrainValue(i3, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z6) {
        this.timeBarScrubbingEnabled = z6;
    }

    public void setVrButtonListener(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.vrButton;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    public void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public void updateIsFullscreen(boolean z6) {
        if (this.isFullscreen == z6) {
            return;
        }
        this.isFullscreen = z6;
        updateFullscreenButtonForState(this.fullscreenButton, z6);
        updateFullscreenButtonForState(this.minimalFullscreenButton, z6);
        androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(z6);
        }
    }

    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(android.content.res.TypedArray typedArray, int i3) {
        return typedArray.getInt(androidx.media3.ui.R.styleable.PlayerControlView_repeat_toggle_modes, i3);
    }

    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:100:0x0491  */
    /* JADX WARN: Code duplicated, block: B:103:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:104:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0270  */
    /* JADX WARN: Code duplicated, block: B:44:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x02f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0341  */
    /* JADX WARN: Code duplicated, block: B:59:0x035d  */
    /* JADX WARN: Code duplicated, block: B:62:0x037a  */
    /* JADX WARN: Code duplicated, block: B:65:0x038b  */
    /* JADX WARN: Code duplicated, block: B:68:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x03f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0405  */
    /* JADX WARN: Code duplicated, block: B:84:0x041c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0428 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x042a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0432  */
    /* JADX WARN: Code duplicated, block: B:90:0x043a  */
    /* JADX WARN: Code duplicated, block: B:93:0x044b  */
    /* JADX WARN: Code duplicated, block: B:96:0x045c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0483  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.media3.ui.TimeBar] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, android.view.ViewGroup, android.widget.TextView, androidx.media3.ui.PlayerControlView$1] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r4v25, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v28, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.graphics.Typeface] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.LayoutInflater] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i3, android.util.AttributeSet attributeSet2) throws java.lang.Throwable {
        androidx.media3.ui.PlayerControlView playerControlView;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z6;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int resourceId;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z15;
        java.lang.String str;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        java.lang.Class<?> cls;
        java.lang.reflect.Method method5;
        android.widget.ImageView imageView;
        android.view.View viewFindViewById;
        android.view.View viewFindViewById2;
        android.view.View viewFindViewById3;
        androidx.media3.ui.TimeBar timeBar;
        android.view.View viewFindViewById4;
        android.widget.ImageView imageView2;
        android.content.Context context2;
        androidx.media3.ui.PlayerControlView playerControlView2;
        ?? r9;
        androidx.media3.ui.TimeBar timeBar2;
        android.content.res.Resources resources;
        android.widget.ImageView imageView3;
        android.widget.ImageView imageView4;
        android.widget.ImageView imageView5;
        int i22;
        android.widget.ImageView imageView6;
        android.content.res.Resources resources2;
        ?? A9;
        android.widget.ImageView imageView7;
        ?? r10;
        android.view.View view;
        android.widget.ImageView imageView8;
        ?? r11;
        android.view.View view2;
        android.widget.ImageView imageView9;
        android.widget.ImageView imageView10;
        android.widget.ImageView imageView11;
        boolean z16;
        super(context, attributeSet, i3);
        java.lang.Class cls2 = java.lang.Boolean.TYPE;
        int resourceId2 = androidx.media3.ui.R.layout.exo_player_control_view;
        int resourceId3 = androidx.media3.ui.R.drawable.exo_styled_controls_play;
        int i23 = androidx.media3.ui.R.drawable.exo_styled_controls_pause;
        int i24 = androidx.media3.ui.R.drawable.exo_styled_controls_next;
        int i25 = androidx.media3.ui.R.drawable.exo_styled_controls_simple_fastforward;
        int i26 = androidx.media3.ui.R.drawable.exo_styled_controls_previous;
        int i27 = androidx.media3.ui.R.drawable.exo_styled_controls_simple_rewind;
        int i28 = androidx.media3.ui.R.drawable.exo_styled_controls_fullscreen_exit;
        int i29 = androidx.media3.ui.R.drawable.exo_styled_controls_fullscreen_enter;
        int i30 = androidx.media3.ui.R.drawable.exo_styled_controls_repeat_off;
        int i31 = androidx.media3.ui.R.drawable.exo_styled_controls_repeat_one;
        int i32 = androidx.media3.ui.R.drawable.exo_styled_controls_repeat_all;
        java.lang.String str2 = "isScrubbingModeEnabled";
        int i33 = androidx.media3.ui.R.drawable.exo_styled_controls_shuffle_on;
        int i34 = androidx.media3.ui.R.drawable.exo_styled_controls_shuffle_off;
        int i35 = androidx.media3.ui.R.drawable.exo_styled_controls_subtitle_on;
        int resourceId4 = androidx.media3.ui.R.drawable.exo_styled_controls_subtitle_off;
        int i36 = androidx.media3.ui.R.drawable.exo_styled_controls_vr;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, androidx.media3.ui.R.styleable.PlayerControlView, i3, 0);
            try {
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_controller_layout_id, resourceId2);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_play_icon, resourceId3);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_pause_icon, i23);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_next_icon, i24);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_fastforward_icon, i25);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_previous_icon, i26);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_rewind_icon, i27);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_fullscreen_exit_icon, i28);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_fullscreen_enter_icon, i29);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_repeat_off_icon, i30);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_repeat_one_icon, i31);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_repeat_all_icon, i32);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_shuffle_on_icon, i33);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_shuffle_off_icon, i34);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_subtitle_on_icon, i35);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_subtitle_off_icon, resourceId4);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_vr_icon, i36);
                playerControlView = this;
                try {
                    playerControlView.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerControlView_show_timeout, playerControlView.showTimeoutMs);
                    playerControlView.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, playerControlView.repeatToggleModes);
                    boolean z17 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_rewind_button, true);
                    boolean z18 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_fastforward_button, true);
                    z12 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_previous_button, true);
                    boolean z19 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_next_button, true);
                    boolean z20 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_shuffle_button, false);
                    boolean z21 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_subtitle_button, false);
                    boolean z22 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_vr_button, false);
                    playerControlView.timeBarScrubbingEnabled = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_time_bar_scrubbing_enabled, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerControlView_time_bar_min_update_interval, playerControlView.timeBarMinUpdateIntervalMs));
                    boolean z23 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_animation_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                    i14 = resourceId15;
                    i12 = resourceId17;
                    i9 = resourceId16;
                    z9 = z21;
                    i13 = resourceId14;
                    z6 = z22;
                    i10 = resourceId7;
                    i11 = resourceId8;
                    z13 = z17;
                    z10 = z20;
                    z14 = z18;
                    z11 = z19;
                    i16 = resourceId11;
                    i17 = resourceId6;
                    i18 = resourceId10;
                    i19 = resourceId12;
                    i20 = resourceId5;
                    i21 = resourceId9;
                    z15 = z23;
                    i15 = resourceId13;
                } catch (java.lang.Throwable th) {
                    th = th;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } else {
            playerControlView = this;
            i9 = i34;
            i10 = i25;
            i11 = i26;
            i12 = i35;
            i13 = i32;
            i14 = i33;
            z6 = false;
            z9 = false;
            z10 = false;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
            resourceId = i36;
            i15 = i31;
            i16 = i29;
            i17 = i24;
            i18 = i28;
            i19 = i30;
            i20 = i23;
            i21 = i27;
            z15 = true;
        }
        android.view.LayoutInflater.from(context).inflate(resourceId2, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        playerControlView.componentListener = new androidx.media3.ui.PlayerControlView.ComponentListener();
        playerControlView.visibilityListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        playerControlView.period = new androidx.media3.common.Timeline.Period();
        playerControlView.window = new androidx.media3.common.Timeline.Window();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        playerControlView.formatBuilder = sb;
        boolean z24 = z6;
        playerControlView.formatter = new java.util.Formatter(sb, java.util.Locale.getDefault());
        playerControlView.adGroupTimesMs = new long[0];
        playerControlView.playedAdGroups = new boolean[0];
        playerControlView.extraAdGroupTimesMs = new long[0];
        playerControlView.extraPlayedAdGroups = new boolean[0];
        playerControlView.updateProgressAction = new androidx.media3.ui.a(playerControlView, 1);
        try {
            str = "setScrubbingModeEnabled";
            try {
                method = androidx.media3.exoplayer.ExoPlayer.class.getMethod(str, cls2);
                str2 = str2;
                try {
                    method2 = androidx.media3.exoplayer.ExoPlayer.class.getMethod(str2, null);
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
                    method2 = null;
                }
            } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused2) {
                method = null;
                method2 = null;
                java.lang.reflect.Method method6 = method;
                playerControlView.exoplayerClazz = androidx.media3.exoplayer.ExoPlayer.class;
                playerControlView.setScrubbingModeEnabledMethod = method6;
                playerControlView.isScrubbingModeEnabledMethod = method2;
                cls = java.lang.Class.forName("androidx.media3.transformer.CompositionPlayer");
                try {
                    method4 = cls.getMethod(str, cls2);
                    method3 = null;
                    try {
                        method5 = cls.getMethod(str2, null);
                    } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused3) {
                        method5 = method3;
                    }
                } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused4) {
                    method3 = null;
                    method4 = null;
                }
                playerControlView.compositionPlayerClazz = cls;
                playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method4;
                playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method5;
                playerControlView.durationView = (android.widget.TextView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_duration);
                playerControlView.positionView = (android.widget.TextView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_position);
                imageView = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_subtitle);
                playerControlView.subtitleButton = imageView;
                if (imageView != null) {
                    imageView.setOnClickListener(playerControlView.componentListener);
                }
                android.widget.ImageView imageView12 = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_fullscreen);
                playerControlView.fullscreenButton = imageView12;
                int i37 = 4;
                initializeFullscreenButton(imageView12, new androidx.media3.ui.c(i37, playerControlView));
                android.widget.ImageView imageView13 = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_minimal_fullscreen);
                playerControlView.minimalFullscreenButton = imageView13;
                initializeFullscreenButton(imageView13, new androidx.media3.ui.c(i37, playerControlView));
                viewFindViewById = playerControlView.findViewById(androidx.media3.ui.R.id.exo_settings);
                playerControlView.settingsButton = viewFindViewById;
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(playerControlView.componentListener);
                }
                viewFindViewById2 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_playback_speed);
                playerControlView.playbackSpeedButton = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(playerControlView.componentListener);
                }
                viewFindViewById3 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_audio_track);
                playerControlView.audioTrackButton = viewFindViewById3;
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setOnClickListener(playerControlView.componentListener);
                }
                timeBar = (androidx.media3.ui.TimeBar) playerControlView.findViewById(androidx.media3.ui.R.id.exo_progress);
                viewFindViewById4 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_progress_placeholder);
                if (timeBar != null) {
                    playerControlView.timeBar = timeBar;
                    imageView2 = imageView;
                    r9 = method3;
                    context2 = context;
                    playerControlView2 = playerControlView;
                } else if (viewFindViewById4 != null) {
                    imageView2 = imageView;
                    r9 = method3;
                    playerControlView2 = this;
                    androidx.media3.ui.DefaultTimeBar defaultTimeBar = new androidx.media3.ui.DefaultTimeBar(context, null, 0, attributeSet2, androidx.media3.ui.R.style.ExoStyledControls_TimeBar);
                    context2 = context;
                    defaultTimeBar.setId(androidx.media3.ui.R.id.exo_progress);
                    defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById4.getParent();
                    int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
                    viewGroup.removeView(viewFindViewById4);
                    viewGroup.addView(defaultTimeBar, iIndexOfChild);
                    playerControlView2.timeBar = defaultTimeBar;
                } else {
                    imageView2 = imageView;
                    ?? r12 = method3;
                    context2 = context;
                    playerControlView2 = playerControlView;
                    playerControlView2.timeBar = r12;
                    r9 = r12;
                }
                timeBar2 = playerControlView2.timeBar;
                if (timeBar2 != null) {
                    timeBar2.addListener(playerControlView2.componentListener);
                }
                playerControlView2.handler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
                resources = context2.getResources();
                playerControlView2.resources = resources;
                imageView3 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_play_pause);
                playerControlView2.playPauseButton = imageView3;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(playerControlView2.componentListener);
                }
                imageView4 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_prev);
                playerControlView2.previousButton = imageView4;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources, i11));
                    imageView4.setOnClickListener(playerControlView2.componentListener);
                }
                imageView5 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_next);
                playerControlView2.nextButton = imageView5;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources, i17));
                    imageView5.setOnClickListener(playerControlView2.componentListener);
                }
                i22 = androidx.media3.ui.R.font.roboto_medium_numbers;
                java.lang.ThreadLocal threadLocal = p176v1.j.f29136a;
                if (context2.isRestricted()) {
                    imageView6 = imageView4;
                    resources2 = resources;
                    A9 = r9;
                } else {
                    imageView6 = imageView4;
                    resources2 = resources;
                    A9 = p176v1.j.a(context2, i22, new android.util.TypedValue(), 0, null, false);
                }
                imageView7 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_rew);
                r10 = (android.widget.TextView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_rew_with_amount);
                if (imageView7 != null) {
                    imageView7.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources2, i21));
                    playerControlView2.rewindButton = imageView7;
                    playerControlView2.rewindButtonTextView = r9;
                } else if (r10 != 0) {
                    r10.setTypeface(A9);
                    playerControlView2.rewindButtonTextView = r10;
                    playerControlView2.rewindButton = r10;
                } else {
                    playerControlView2.rewindButtonTextView = r9;
                    playerControlView2.rewindButton = r9;
                }
                view = playerControlView2.rewindButton;
                if (view != null) {
                    view.setOnClickListener(playerControlView2.componentListener);
                }
                imageView8 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_ffwd);
                r11 = (android.widget.TextView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_ffwd_with_amount);
                if (imageView8 != null) {
                    imageView8.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources2, i10));
                    playerControlView2.fastForwardButton = imageView8;
                    playerControlView2.fastForwardButtonTextView = r9;
                } else if (r11 != 0) {
                    r11.setTypeface(A9);
                    playerControlView2.fastForwardButtonTextView = r11;
                    playerControlView2.fastForwardButton = r11;
                } else {
                    playerControlView2.fastForwardButtonTextView = r9;
                    playerControlView2.fastForwardButton = r9;
                }
                view2 = playerControlView2.fastForwardButton;
                if (view2 != null) {
                    view2.setOnClickListener(playerControlView2.componentListener);
                }
                imageView9 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_repeat_toggle);
                playerControlView2.repeatToggleButton = imageView9;
                if (imageView9 != null) {
                    imageView9.setOnClickListener(playerControlView2.componentListener);
                }
                imageView10 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_shuffle);
                playerControlView2.shuffleButton = imageView10;
                if (imageView10 != null) {
                    imageView10.setOnClickListener(playerControlView2.componentListener);
                }
                playerControlView2.buttonAlphaEnabled = resources2.getInteger(androidx.media3.ui.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                playerControlView2.buttonAlphaDisabled = resources2.getInteger(androidx.media3.ui.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                imageView11 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_vr);
                playerControlView2.vrButton = imageView11;
                if (imageView11 != null) {
                    imageView11.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources2, resourceId));
                    playerControlView2.updateButton(false, imageView11);
                }
                androidx.media3.ui.PlayerControlViewLayoutManager playerControlViewLayoutManager = new androidx.media3.ui.PlayerControlViewLayoutManager(playerControlView2);
                playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager;
                playerControlViewLayoutManager.setAnimationEnabled(z15);
                androidx.media3.ui.PlayerControlView.SettingsAdapter settingsAdapter = playerControlView2.new SettingsAdapter(new java.lang.String[]{resources2.getString(androidx.media3.ui.R.string.exo_controls_playback_speed), resources2.getString(androidx.media3.ui.R.string.exo_track_selection_title_audio)}, new android.graphics.drawable.Drawable[]{androidx.media3.common.util.Util.getDrawable(context2, resources2, androidx.media3.ui.R.drawable.exo_styled_controls_speed), androidx.media3.common.util.Util.getDrawable(context2, resources2, androidx.media3.ui.R.drawable.exo_styled_controls_audiotrack)});
                playerControlView2.settingsAdapter = settingsAdapter;
                playerControlView2.settingsWindowMargin = resources2.getDimensionPixelSize(androidx.media3.ui.R.dimen.exo_settings_offset);
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) android.view.LayoutInflater.from(context2).inflate(androidx.media3.ui.R.layout.exo_styled_settings_list, r9);
                playerControlView2.settingsView = recyclerView;
                recyclerView.setAdapter(settingsAdapter);
                playerControlView2.getContext();
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager());
                android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) recyclerView, -2, -2, true);
                playerControlView2.settingsWindow = popupWindow;
                popupWindow.setOnDismissListener(playerControlView2.componentListener);
                playerControlView2.needToHideBars = true;
                playerControlView2.trackNameProvider = new androidx.media3.ui.DefaultTrackNameProvider(playerControlView2.getResources());
                playerControlView2.subtitleOnButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i12);
                playerControlView2.subtitleOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, resourceId4);
                playerControlView2.subtitleOnContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_cc_enabled_description);
                playerControlView2.subtitleOffContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_cc_disabled_description);
                playerControlView2.textTrackSelectionAdapter = new androidx.media3.ui.PlayerControlView.TextTrackSelectionAdapter();
                playerControlView2.audioTrackSelectionAdapter = new androidx.media3.ui.PlayerControlView.AudioTrackSelectionAdapter();
                playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources2.getStringArray(androidx.media3.ui.R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
                playerControlView2.playButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, resourceId3);
                playerControlView2.pauseButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i20);
                playerControlView2.fullscreenExitDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i18);
                playerControlView2.fullscreenEnterDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i16);
                playerControlView2.repeatOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i19);
                playerControlView2.repeatOneButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i15);
                playerControlView2.repeatAllButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i13);
                playerControlView2.shuffleOnButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i14);
                playerControlView2.shuffleOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i9);
                playerControlView2.fullscreenExitContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_fullscreen_exit_description);
                playerControlView2.fullscreenEnterContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_fullscreen_enter_description);
                playerControlView2.repeatOffButtonContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_repeat_off_description);
                playerControlView2.repeatOneButtonContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_repeat_one_description);
                playerControlView2.repeatAllButtonContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_repeat_all_description);
                playerControlView2.shuffleOnContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_shuffle_on_description);
                playerControlView2.shuffleOffContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_shuffle_off_description);
                playerControlViewLayoutManager.setShowButton((android.view.ViewGroup) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_bottom_bar), true);
                playerControlViewLayoutManager.setShowButton(playerControlView2.fastForwardButton, z14);
                playerControlViewLayoutManager.setShowButton(playerControlView2.rewindButton, z13);
                playerControlViewLayoutManager.setShowButton(imageView6, z12);
                playerControlViewLayoutManager.setShowButton(imageView5, z11);
                playerControlViewLayoutManager.setShowButton(imageView10, z10);
                playerControlViewLayoutManager.setShowButton(imageView2, z9);
                playerControlViewLayoutManager.setShowButton(imageView11, z24);
                if (playerControlView2.repeatToggleModes != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                playerControlViewLayoutManager.setShowButton(imageView9, z16);
                playerControlView2.addOnLayoutChangeListener(new androidx.media3.ui.h(1, playerControlView2));
            }
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused5) {
            str = "setScrubbingModeEnabled";
        }
        java.lang.reflect.Method method7 = method;
        playerControlView.exoplayerClazz = androidx.media3.exoplayer.ExoPlayer.class;
        playerControlView.setScrubbingModeEnabledMethod = method7;
        playerControlView.isScrubbingModeEnabledMethod = method2;
        try {
            cls = java.lang.Class.forName("androidx.media3.transformer.CompositionPlayer");
            method4 = cls.getMethod(str, cls2);
            method3 = null;
            method5 = cls.getMethod(str2, null);
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused6) {
            method3 = null;
            method4 = null;
            cls = null;
        }
        playerControlView.compositionPlayerClazz = cls;
        playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method4;
        playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method5;
        playerControlView.durationView = (android.widget.TextView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_duration);
        playerControlView.positionView = (android.widget.TextView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_position);
        imageView = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_subtitle);
        playerControlView.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(playerControlView.componentListener);
        }
        android.widget.ImageView imageView14 = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_fullscreen);
        playerControlView.fullscreenButton = imageView14;
        int i38 = 4;
        initializeFullscreenButton(imageView14, new androidx.media3.ui.c(i38, playerControlView));
        android.widget.ImageView imageView15 = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_minimal_fullscreen);
        playerControlView.minimalFullscreenButton = imageView15;
        initializeFullscreenButton(imageView15, new androidx.media3.ui.c(i38, playerControlView));
        viewFindViewById = playerControlView.findViewById(androidx.media3.ui.R.id.exo_settings);
        playerControlView.settingsButton = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(playerControlView.componentListener);
        }
        viewFindViewById2 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_playback_speed);
        playerControlView.playbackSpeedButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(playerControlView.componentListener);
        }
        viewFindViewById3 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_audio_track);
        playerControlView.audioTrackButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(playerControlView.componentListener);
        }
        timeBar = (androidx.media3.ui.TimeBar) playerControlView.findViewById(androidx.media3.ui.R.id.exo_progress);
        viewFindViewById4 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_progress_placeholder);
        if (timeBar != null) {
            playerControlView.timeBar = timeBar;
            imageView2 = imageView;
            r9 = method3;
            context2 = context;
            playerControlView2 = playerControlView;
        } else if (viewFindViewById4 != null) {
            imageView2 = imageView;
            r9 = method3;
            playerControlView2 = this;
            androidx.media3.ui.DefaultTimeBar defaultTimeBar2 = new androidx.media3.ui.DefaultTimeBar(context, null, 0, attributeSet2, androidx.media3.ui.R.style.ExoStyledControls_TimeBar);
            context2 = context;
            defaultTimeBar2.setId(androidx.media3.ui.R.id.exo_progress);
            defaultTimeBar2.setLayoutParams(viewFindViewById4.getLayoutParams());
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild2 = viewGroup2.indexOfChild(viewFindViewById4);
            viewGroup2.removeView(viewFindViewById4);
            viewGroup2.addView(defaultTimeBar2, iIndexOfChild2);
            playerControlView2.timeBar = defaultTimeBar2;
        } else {
            imageView2 = imageView;
            ?? r13 = method3;
            context2 = context;
            playerControlView2 = playerControlView;
            playerControlView2.timeBar = r13;
            r9 = r13;
        }
        timeBar2 = playerControlView2.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(playerControlView2.componentListener);
        }
        playerControlView2.handler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        resources = context2.getResources();
        playerControlView2.resources = resources;
        imageView3 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_play_pause);
        playerControlView2.playPauseButton = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(playerControlView2.componentListener);
        }
        imageView4 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_prev);
        playerControlView2.previousButton = imageView4;
        if (imageView4 != null) {
            imageView4.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources, i11));
            imageView4.setOnClickListener(playerControlView2.componentListener);
        }
        imageView5 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_next);
        playerControlView2.nextButton = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources, i17));
            imageView5.setOnClickListener(playerControlView2.componentListener);
        }
        i22 = androidx.media3.ui.R.font.roboto_medium_numbers;
        java.lang.ThreadLocal threadLocal2 = p176v1.j.f29136a;
        if (context2.isRestricted()) {
            imageView6 = imageView4;
            resources2 = resources;
            A9 = r9;
        } else {
            imageView6 = imageView4;
            resources2 = resources;
            A9 = p176v1.j.a(context2, i22, new android.util.TypedValue(), 0, null, false);
        }
        imageView7 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_rew);
        r10 = (android.widget.TextView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources2, i21));
            playerControlView2.rewindButton = imageView7;
            playerControlView2.rewindButtonTextView = r9;
        } else if (r10 != 0) {
            r10.setTypeface(A9);
            playerControlView2.rewindButtonTextView = r10;
            playerControlView2.rewindButton = r10;
        } else {
            playerControlView2.rewindButtonTextView = r9;
            playerControlView2.rewindButton = r9;
        }
        view = playerControlView2.rewindButton;
        if (view != null) {
            view.setOnClickListener(playerControlView2.componentListener);
        }
        imageView8 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_ffwd);
        r11 = (android.widget.TextView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources2, i10));
            playerControlView2.fastForwardButton = imageView8;
            playerControlView2.fastForwardButtonTextView = r9;
        } else if (r11 != 0) {
            r11.setTypeface(A9);
            playerControlView2.fastForwardButtonTextView = r11;
            playerControlView2.fastForwardButton = r11;
        } else {
            playerControlView2.fastForwardButtonTextView = r9;
            playerControlView2.fastForwardButton = r9;
        }
        view2 = playerControlView2.fastForwardButton;
        if (view2 != null) {
            view2.setOnClickListener(playerControlView2.componentListener);
        }
        imageView9 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_repeat_toggle);
        playerControlView2.repeatToggleButton = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(playerControlView2.componentListener);
        }
        imageView10 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_shuffle);
        playerControlView2.shuffleButton = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(playerControlView2.componentListener);
        }
        playerControlView2.buttonAlphaEnabled = resources2.getInteger(androidx.media3.ui.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.buttonAlphaDisabled = resources2.getInteger(androidx.media3.ui.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView11 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_vr);
        playerControlView2.vrButton = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context2, resources2, resourceId));
            playerControlView2.updateButton(false, imageView11);
        }
        androidx.media3.ui.PlayerControlViewLayoutManager playerControlViewLayoutManager2 = new androidx.media3.ui.PlayerControlViewLayoutManager(playerControlView2);
        playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager2;
        playerControlViewLayoutManager2.setAnimationEnabled(z15);
        androidx.media3.ui.PlayerControlView.SettingsAdapter settingsAdapter2 = playerControlView2.new SettingsAdapter(new java.lang.String[]{resources2.getString(androidx.media3.ui.R.string.exo_controls_playback_speed), resources2.getString(androidx.media3.ui.R.string.exo_track_selection_title_audio)}, new android.graphics.drawable.Drawable[]{androidx.media3.common.util.Util.getDrawable(context2, resources2, androidx.media3.ui.R.drawable.exo_styled_controls_speed), androidx.media3.common.util.Util.getDrawable(context2, resources2, androidx.media3.ui.R.drawable.exo_styled_controls_audiotrack)});
        playerControlView2.settingsAdapter = settingsAdapter2;
        playerControlView2.settingsWindowMargin = resources2.getDimensionPixelSize(androidx.media3.ui.R.dimen.exo_settings_offset);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) android.view.LayoutInflater.from(context2).inflate(androidx.media3.ui.R.layout.exo_styled_settings_list, r9);
        playerControlView2.settingsView = recyclerView2;
        recyclerView2.setAdapter(settingsAdapter2);
        playerControlView2.getContext();
        recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager());
        android.widget.PopupWindow popupWindow2 = new android.widget.PopupWindow((android.view.View) recyclerView2, -2, -2, true);
        playerControlView2.settingsWindow = popupWindow2;
        popupWindow2.setOnDismissListener(playerControlView2.componentListener);
        playerControlView2.needToHideBars = true;
        playerControlView2.trackNameProvider = new androidx.media3.ui.DefaultTrackNameProvider(playerControlView2.getResources());
        playerControlView2.subtitleOnButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i12);
        playerControlView2.subtitleOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, resourceId4);
        playerControlView2.subtitleOnContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_cc_enabled_description);
        playerControlView2.subtitleOffContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_cc_disabled_description);
        playerControlView2.textTrackSelectionAdapter = new androidx.media3.ui.PlayerControlView.TextTrackSelectionAdapter();
        playerControlView2.audioTrackSelectionAdapter = new androidx.media3.ui.PlayerControlView.AudioTrackSelectionAdapter();
        playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources2.getStringArray(androidx.media3.ui.R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        playerControlView2.playButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, resourceId3);
        playerControlView2.pauseButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i20);
        playerControlView2.fullscreenExitDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i18);
        playerControlView2.fullscreenEnterDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i16);
        playerControlView2.repeatOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i19);
        playerControlView2.repeatOneButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i15);
        playerControlView2.repeatAllButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i13);
        playerControlView2.shuffleOnButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i14);
        playerControlView2.shuffleOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context2, resources2, i9);
        playerControlView2.fullscreenExitContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_fullscreen_exit_description);
        playerControlView2.fullscreenEnterContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_fullscreen_enter_description);
        playerControlView2.repeatOffButtonContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_repeat_off_description);
        playerControlView2.repeatOneButtonContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_repeat_one_description);
        playerControlView2.repeatAllButtonContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_repeat_all_description);
        playerControlView2.shuffleOnContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_shuffle_on_description);
        playerControlView2.shuffleOffContentDescription = resources2.getString(androidx.media3.ui.R.string.exo_controls_shuffle_off_description);
        playerControlViewLayoutManager2.setShowButton((android.view.ViewGroup) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_bottom_bar), true);
        playerControlViewLayoutManager2.setShowButton(playerControlView2.fastForwardButton, z14);
        playerControlViewLayoutManager2.setShowButton(playerControlView2.rewindButton, z13);
        playerControlViewLayoutManager2.setShowButton(imageView6, z12);
        playerControlViewLayoutManager2.setShowButton(imageView5, z11);
        playerControlViewLayoutManager2.setShowButton(imageView10, z10);
        playerControlViewLayoutManager2.setShowButton(imageView2, z9);
        playerControlViewLayoutManager2.setShowButton(imageView11, z24);
        if (playerControlView2.repeatToggleModes != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        playerControlViewLayoutManager2.setShowButton(imageView9, z16);
        playerControlView2.addOnLayoutChangeListener(new androidx.media3.ui.h(1, playerControlView2));
    }
}
