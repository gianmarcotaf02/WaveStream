package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.ViewProvider;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.X;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.common.util.concurrent.B;
import com.google.common.util.concurrent.D;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2230y;
import p076i4.S0;
import p076i4.V;
import p076i4.Z;

public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private static final String TAG = "PlayerControlView";
    private long[] adGroupTimesMs;
    private final View audioTrackButton;
    private final AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private final Class<?> compositionPlayerClazz;
    private final Method compositionPlayerIsScrubbingModeEnabledMethod;
    private final Method compositionPlayerSetScrubbingModeEnabledMethod;
    private final PlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    private final TextView durationView;
    private final Class<?> exoplayerClazz;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final ImageView fullscreenButton;
    private final String fullscreenEnterContentDescription;
    private final Drawable fullscreenEnterDrawable;
    private final String fullscreenExitContentDescription;
    private final Drawable fullscreenExitDrawable;
    private final Handler handler;
    private boolean isAttachedToWindow;
    private boolean isFullscreen;
    private final Method isScrubbingModeEnabledMethod;
    private final ImageView minimalFullscreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    private final ImageView nextButton;
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Drawable pauseButtonDrawable;
    private final Timeline.Period period;
    private final Drawable playButtonDrawable;
    private final ImageView playPauseButton;
    private final PlaybackSpeedAdapter playbackSpeedAdapter;
    private final View playbackSpeedButton;
    private boolean[] playedAdGroups;
    private Player player;
    private final TextView positionView;
    private final ImageView previousButton;
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final Resources resources;
    private final View rewindButton;
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private final Method setScrubbingModeEnabledMethod;
    private final SettingsAdapter settingsAdapter;
    private final View settingsButton;
    private final RecyclerView settingsView;
    private final PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private boolean showPlayButtonIfSuppressed;
    private int showTimeoutMs;
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;
    private final ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private final TextTrackSelectionAdapter textTrackSelectionAdapter;
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private boolean timeBarScrubbingEnabled;
    private final TrackNameProvider trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;
    private final ImageView vrButton;
    private final Timeline.Window window;

    public final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        private boolean hasSelectionOverride(TrackSelectionParameters trackSelectionParameters) {
            for (int i3 = 0; i3 < this.tracks.size(); i3++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i3).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        public void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            ((Player) Util.castNonNull(PlayerControlView.this.player)).setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override
        public void init(List<TrackInformation> list) {
            this.tracks = list;
            Player player = PlayerControlView.this.player;
            player.getClass();
            TrackSelectionParameters trackSelectionParameters = player.getTrackSelectionParameters();
            if (list.isEmpty()) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, PlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
                return;
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                TrackInformation trackInformation = list.get(i3);
                if (trackInformation.isSelected()) {
                    PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }

        @Override
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(R.string.exo_track_selection_auto);
            Player player = PlayerControlView.this.player;
            player.getClass();
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(player.getTrackSelectionParameters()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new c(0, this));
        }

        @Override
        public void onTrackSelection(String str) {
            PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private ComponentListener() {
        }

        @Override
        public void onClick(View view) {
            Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (PlayerControlView.this.nextButton == view) {
                if (player.isCommandAvailable(9)) {
                    player.seekToNext();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.previousButton == view) {
                if (player.isCommandAvailable(7)) {
                    player.seekToPrevious();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                    return;
                }
                player.seekForward();
                return;
            }
            if (PlayerControlView.this.rewindButton == view) {
                if (player.isCommandAvailable(11)) {
                    player.seekBack();
                    return;
                }
                return;
            }
            if (PlayerControlView.this.playPauseButton == view) {
                Util.handlePlayPauseButtonAction(player, PlayerControlView.this.showPlayButtonIfSuppressed);
                return;
            }
            if (PlayerControlView.this.repeatToggleButton == view) {
                if (player.isCommandAvailable(15)) {
                    player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                    return;
                }
                return;
            }
            if (PlayerControlView.this.shuffleButton == view) {
                if (player.isCommandAvailable(14)) {
                    player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                    return;
                }
                return;
            }
            if (PlayerControlView.this.settingsButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.displaySettingsWindow(playerControlView.settingsAdapter, PlayerControlView.this.settingsButton);
                return;
            }
            if (PlayerControlView.this.playbackSpeedButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.displaySettingsWindow(playerControlView2.playbackSpeedAdapter, PlayerControlView.this.playbackSpeedButton);
            } else if (PlayerControlView.this.audioTrackButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView3 = PlayerControlView.this;
                playerControlView3.displaySettingsWindow(playerControlView3.audioTrackSelectionAdapter, PlayerControlView.this.audioTrackButton);
            } else if (PlayerControlView.this.subtitleButton == view) {
                PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                PlayerControlView playerControlView4 = PlayerControlView.this;
                playerControlView4.displaySettingsWindow(playerControlView4.textTrackSelectionAdapter, PlayerControlView.this.subtitleButton);
            }
        }

        @Override
        public void onDismiss() {
            if (PlayerControlView.this.needToHideBars) {
                PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 13)) {
                PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7, 13)) {
                PlayerControlView.this.updateProgress();
            }
            if (events.containsAny(8, 13)) {
                PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.containsAny(9, 13)) {
                PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0, 13)) {
                PlayerControlView.this.updateTimeline();
            }
            if (events.containsAny(12, 13)) {
                PlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.containsAny(2, 13)) {
                PlayerControlView.this.updateTrackLists();
            }
        }

        @Override
        public void onScrubMove(TimeBar timeBar, long j) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            if (playerControlView.isScrubbingModeEnabled(playerControlView.player)) {
                PlayerControlView playerControlView2 = PlayerControlView.this;
                playerControlView2.seekToTimeBarPosition(playerControlView2.player, j);
            }
        }

        @Override
        public void onScrubStart(TimeBar timeBar, long j) {
            PlayerControlView.this.scrubbing = true;
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
            PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
            if (PlayerControlView.this.player != null && PlayerControlView.this.timeBarScrubbingEnabled) {
                PlayerControlView playerControlView = PlayerControlView.this;
                if (playerControlView.isExoPlayer(playerControlView.player)) {
                    try {
                        Method method = PlayerControlView.this.setScrubbingModeEnabledMethod;
                        method.getClass();
                        method.invoke(PlayerControlView.this.player, Boolean.TRUE);
                    } catch (IllegalAccessException | InvocationTargetException e6) {
                        throw new RuntimeException(e6);
                    }
                } else {
                    PlayerControlView playerControlView2 = PlayerControlView.this;
                    if (playerControlView2.isCompositionPlayer(playerControlView2.player)) {
                        try {
                            Method method2 = PlayerControlView.this.compositionPlayerSetScrubbingModeEnabledMethod;
                            method2.getClass();
                            method2.invoke(PlayerControlView.this.player, Boolean.TRUE);
                        } catch (IllegalAccessException | InvocationTargetException e9) {
                            throw new RuntimeException(e9);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=");
                        Player player = PlayerControlView.this.player;
                        player.getClass();
                        sb.append(player.getClass());
                        Log.w(PlayerControlView.TAG, sb.toString());
                    }
                }
            }
            PlayerControlView playerControlView3 = PlayerControlView.this;
            if (playerControlView3.isScrubbingModeEnabled(playerControlView3.player)) {
                PlayerControlView playerControlView4 = PlayerControlView.this;
                playerControlView4.seekToTimeBarPosition(playerControlView4.player, j);
            }
        }

        @Override
        public void onScrubStop(TimeBar timeBar, long j, boolean z6) {
            PlayerControlView.this.scrubbing = false;
            if (PlayerControlView.this.player != null) {
                if (!z6) {
                    PlayerControlView playerControlView = PlayerControlView.this;
                    playerControlView.seekToTimeBarPosition(playerControlView.player, j);
                }
                PlayerControlView playerControlView2 = PlayerControlView.this;
                if (playerControlView2.isExoPlayer(playerControlView2.player)) {
                    try {
                        Method method = PlayerControlView.this.setScrubbingModeEnabledMethod;
                        method.getClass();
                        method.invoke(PlayerControlView.this.player, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e6) {
                        throw new RuntimeException(e6);
                    }
                } else {
                    PlayerControlView playerControlView3 = PlayerControlView.this;
                    if (playerControlView3.isCompositionPlayer(playerControlView3.player)) {
                        try {
                            Method method2 = PlayerControlView.this.compositionPlayerSetScrubbingModeEnabledMethod;
                            method2.getClass();
                            method2.invoke(PlayerControlView.this.player, Boolean.FALSE);
                        } catch (IllegalAccessException | InvocationTargetException e9) {
                            throw new RuntimeException(e9);
                        }
                    }
                }
            }
            PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z6);
    }

    public final class PlaybackSpeedAdapter extends A {
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        public void lambda$onBindViewHolder$0(int i3, View view) {
            if (i3 != this.selectedIndex) {
                PlayerControlView.this.setPlaybackSpeed(this.playbackSpeeds[i3]);
            }
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        public String getSelectedText() {
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
                float fAbs = Math.abs(f9 - fArr[i3]);
                if (fAbs < f10) {
                    i9 = i3;
                    f10 = fAbs;
                }
                i3++;
            }
        }

        @Override
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, final int i3) {
            String[] strArr = this.playbackSpeedTexts;
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
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f17155h.lambda$onBindViewHolder$0(i3, view);
                }
            });
        }

        @Override
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j9);
    }

    public final class SettingViewHolder extends X {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(R.id.exo_main_text);
            this.subTextView = (TextView) view.findViewById(R.id.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new c(1, this));
        }

        public void lambda$new$0(View view) {
            PlayerControlView.this.onSettingViewClicked(getBindingAdapterPosition());
        }
    }

    public class SettingsAdapter extends A {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        private boolean shouldShowSetting(int i3) {
            if (PlayerControlView.this.player == null) {
                return false;
            }
            if (i3 == 0) {
                return PlayerControlView.this.player.isCommandAvailable(13);
            }
            if (i3 != 1) {
                return true;
            }
            return PlayerControlView.this.player.isCommandAvailable(30) && PlayerControlView.this.player.isCommandAvailable(29);
        }

        @Override
        public int getItemCount() {
            return this.mainTexts.length;
        }

        @Override
        public long getItemId(int i3) {
            return i3;
        }

        public boolean hasSettingsToShow() {
            return shouldShowSetting(1) || shouldShowSetting(0);
        }

        public void setSubTextAtPosition(int i3, String str) {
            this.subTexts[i3] = str;
        }

        @Override
        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i3) {
            if (shouldShowSetting(i3)) {
                settingViewHolder.itemView.setLayoutParams(new J(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new J(0, 0));
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

        @Override
        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
            return PlayerControlView.this.new SettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    public static class SubSettingViewHolder extends X {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(R.id.exo_text);
            this.checkView = view.findViewById(R.id.exo_check);
        }
    }

    public final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        private TextTrackSelectionAdapter() {
            super();
        }

        public void lambda$onBindViewHolderAtZeroPosition$0(View view) {
            if (PlayerControlView.this.player == null || !PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            PlayerControlView.this.player.setTrackSelectionParameters(PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).setPreferredTextLanguage(null).setPreferredTextRoleFlags(0).build());
            PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override
        public void init(List<TrackInformation> list) {
            boolean z6 = false;
            for (int i3 = 0; i3 < list.size(); i3++) {
                if (list.get(i3).isSelected()) {
                    z6 = true;
                    break;
                }
            }
            if (PlayerControlView.this.subtitleButton != null) {
                ImageView imageView = PlayerControlView.this.subtitleButton;
                PlayerControlView playerControlView = PlayerControlView.this;
                imageView.setImageDrawable(z6 ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
                PlayerControlView.this.subtitleButton.setContentDescription(z6 ? PlayerControlView.this.subtitleOnContentDescription : PlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z6;
            subSettingViewHolder.textView.setText(R.string.exo_track_selection_none);
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
            subSettingViewHolder.itemView.setOnClickListener(new c(2, this));
        }

        @Override
        public void onTrackSelection(String str) {
        }

        @Override
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i3) {
            super.onBindViewHolder(subSettingViewHolder, i3);
            if (i3 > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i3 + (-1)).isSelected() ? 0 : 4);
            }
        }
    }

    public static final class TrackInformation {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public TrackInformation(Tracks tracks, int i3, int i9, String str) {
            this.trackGroup = (Tracks.Group) tracks.getGroups().get(i3);
            this.trackIndex = i9;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }
    }

    public abstract class TrackSelectionAdapter extends A {
        protected List<TrackInformation> tracks = new ArrayList();

        public TrackSelectionAdapter() {
        }

        public void lambda$onBindViewHolder$0(Player player, TrackGroup trackGroup, TrackInformation trackInformation, View view) {
            if (player.isCommandAvailable(29)) {
                player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new TrackSelectionOverride(trackGroup, AbstractC2186b0.y(Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
                onTrackSelection(trackInformation.trackName);
                PlayerControlView.this.settingsWindow.dismiss();
            }
        }

        public void clear() {
            this.tracks = Collections.EMPTY_LIST;
        }

        @Override
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        public abstract void init(List<TrackInformation> list);

        public abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        public abstract void onTrackSelection(String str);

        @Override
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i3) {
            final Player player = PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i3 == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final TrackInformation trackInformation = this.tracks.get(i3 - 1);
            final TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            boolean z6 = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z6 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f17157h.lambda$onBindViewHolder$0(player, mediaTrackGroup, trackInformation, view);
                }
            });
        }

        @Override
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
            return new SubSettingViewHolder(LayoutInflater.from(PlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i3);
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    private static boolean canShowMultiWindowTimeBar(Player player, Timeline.Window window) {
        Timeline currentTimeline;
        int windowCount;
        if (!player.isCommandAvailable(17) || (windowCount = (currentTimeline = player.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i3 = 0; i3 < windowCount; i3++) {
            if (currentTimeline.getWindow(i3, window).durationUs == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    public void displaySettingsWindow(A a2, View view) {
        this.settingsView.setAdapter(a2);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private AbstractC2186b0 gatherSupportedTrackInfosOfType(Tracks tracks, int i3) {
        AbstractC2230y.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        AbstractC2186b0 groups = tracks.getGroups();
        int i9 = 0;
        for (int i10 = 0; i10 < groups.size(); i10++) {
            Tracks.Group group = (Tracks.Group) groups.get(i10);
            if (group.getType() == i3) {
                for (int i11 = 0; i11 < group.length; i11++) {
                    if (group.isTrackSupported(i11)) {
                        Format trackFormat = group.getTrackFormat(i11);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            TrackInformation trackInformation = new TrackInformation(tracks, i10, i11, this.trackNameProvider.getTrackName(trackFormat));
                            int i12 = i9 + 1;
                            int iB = V.b(objArrCopyOf.length, i12);
                            if (iB > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                            }
                            objArrCopyOf[i9] = trackInformation;
                            i9 = i12;
                        }
                    }
                }
            }
        }
        return AbstractC2186b0.r(objArrCopyOf, i9);
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
                return;
            }
            TextTrackSelectionAdapter textTrackSelectionAdapter = this.textTrackSelectionAdapter;
            Z z6 = AbstractC2186b0.f22868i;
            textTrackSelectionAdapter.init(S0.f22832l);
        }
    }

    private static void initializeFullscreenButton(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isCompositionPlayer(Player player) {
        Class<?> cls;
        return (player == null || (cls = this.compositionPlayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isExoPlayer(Player player) {
        Class<?> cls;
        return (player == null || (cls = this.exoplayerClazz) == null || !cls.isAssignableFrom(player.getClass())) ? false : true;
    }

    private static boolean isHandledMediaKey(int i3) {
        return i3 == 90 || i3 == 89 || i3 == 85 || i3 == 79 || i3 == 126 || i3 == 127 || i3 == 87 || i3 == 88;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean isScrubbingModeEnabled(Player player) {
        try {
            if (isExoPlayer(player)) {
                Method method = this.isScrubbingModeEnabledMethod;
                method.getClass();
                Object objInvoke = method.invoke(player, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (!isCompositionPlayer(player)) {
                return false;
            }
            Method method2 = this.compositionPlayerIsScrubbingModeEnabledMethod;
            method2.getClass();
            Object objInvoke2 = method2.invoke(player, null);
            objInvoke2.getClass();
            return ((Boolean) objInvoke2).booleanValue();
        } catch (IllegalAccessException e6) {
            e = e6;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e9) {
            e = e9;
            throw new RuntimeException(e);
        }
    }

    public void onFullscreenButtonClicked(View view) {
        updateIsFullscreen(!this.isFullscreen);
    }

    public void onLayoutChange(View view, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i11 - i9;
        int i17 = i15 - i13;
        if (!(i10 - i3 == i14 - i12 && i16 == i17) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    public void onSettingViewClicked(int i3) {
        if (i3 == 0) {
            PlaybackSpeedAdapter playbackSpeedAdapter = this.playbackSpeedAdapter;
            View view = this.settingsButton;
            view.getClass();
            displaySettingsWindow(playbackSpeedAdapter, view);
            return;
        }
        if (i3 != 1) {
            this.settingsWindow.dismiss();
            return;
        }
        AudioTrackSelectionAdapter audioTrackSelectionAdapter = this.audioTrackSelectionAdapter;
        View view2 = this.settingsButton;
        view2.getClass();
        displaySettingsWindow(audioTrackSelectionAdapter, view2);
    }

    public void seekToTimeBarPosition(Player player, long j) {
        if (this.multiWindowTimeBar) {
            if (player.isCommandAvailable(17) && player.isCommandAvailable(10)) {
                Timeline currentTimeline = player.getCurrentTimeline();
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

    public void setPlaybackSpeed(float f9) {
        Player player = this.player;
        if (player == null || !player.isCommandAvailable(13)) {
            return;
        }
        Player player2 = this.player;
        player2.setPlaybackParameters(player2.getPlaybackParameters().withSpeed(f9));
    }

    private void updateButton(boolean z6, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z6);
        view.setAlpha(z6 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    private void updateFastForwardButton() {
        Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void updateFullscreenButtonForState(ImageView imageView, boolean z6) {
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

    private static void updateFullscreenButtonVisibility(View view, boolean z6) {
        if (view == null) {
            return;
        }
        if (z6) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    public void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
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
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    public void updatePlayPauseButton() {
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            Drawable drawable = zShouldShowPlayButton ? this.playButtonDrawable : this.pauseButtonDrawable;
            int i3 = zShouldShowPlayButton ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            this.playPauseButton.setImageDrawable(drawable);
            this.playPauseButton.setContentDescription(this.resources.getString(i3));
            updateButton(Util.shouldEnablePlayPauseButton(this.player), this.playPauseButton);
        }
    }

    public void updatePlaybackSpeedList() {
        Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
        updateSettingsButton();
    }

    public void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player == null || !player.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = player.getContentPosition() + this.currentWindowOffset;
                contentBufferedPosition = player.getContentBufferedPosition() + this.currentWindowOffset;
            }
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(isScrubbingModeEnabled(player) ? contentPosition : contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
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
            TimeBar timeBar2 = this.timeBar;
            long jMin = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f9 = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f9 > 0.0f ? (long) (jMin / f9) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            Player player = this.player;
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
        Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateSettingsButton() {
        updateButton(this.settingsAdapter.hasSettingsToShow(), this.settingsButton);
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
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

    public void updateTimeline() {
        int i3;
        long jMsToUs;
        Timeline.Window window;
        long j;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z6 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window);
        long j9 = 0;
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.isCommandAvailable(17) ? player.getCurrentTimeline() : Timeline.EMPTY;
        boolean zIsEmpty = currentTimeline.isEmpty();
        long j10 = C.TIME_UNSET;
        if (!zIsEmpty) {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z9 = this.multiWindowTimeBar;
            int i9 = z9 ? 0 : currentMediaItemIndex;
            int windowCount = z9 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            i3 = 0;
            long j11 = 0;
            while (i9 <= windowCount) {
                if (i9 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j11);
                }
                currentTimeline.getWindow(i9, this.window);
                Timeline.Window window2 = this.window;
                boolean z10 = z6;
                long j12 = j9;
                if (window2.durationUs == j10) {
                    AbstractC1864o0.Y(this.multiWindowTimeBar ^ z10);
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
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i3] = Util.usToMs(positionInWindowUs + j11);
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
            if (contentDuration != C.TIME_UNSET) {
                jMsToUs = Util.msToUs(contentDuration);
                i3 = 0;
            } else {
                i3 = 0;
                jMsToUs = 0;
            }
        } else {
            i3 = 0;
            jMsToUs = 0;
        }
        long jUsToMs = Util.usToMs(jMsToUs);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i11 = i3 + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i11 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i11);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i11);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i3, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i3, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i11);
        }
        updateProgress();
    }

    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
        updateSettingsButton();
    }

    @Deprecated
    public void addVisibilityListener(VisibilityListener visibilityListener) {
        visibilityListener.getClass();
        this.visibilityListeners.add(visibilityListener);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
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
            Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
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
            Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        Util.handlePauseButtonAction(player);
        return true;
    }

    public Player getPlayer() {
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

    @Override
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
        Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    @Override
    public void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        super.onLayout(z6, i3, i9, i10, i11);
        this.controlViewLayoutManager.onLayout(z6, i3, i9, i10, i11);
    }

    @Deprecated
    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void requestPlayPauseFocus() {
        ImageView imageView = this.playPauseButton;
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
            AbstractC1864o0.L(jArr.length == zArr.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr;
        }
        updateTimeline();
    }

    public void setMediaRouteButtonViewProvider(ViewProvider viewProvider) {
        final View viewFindViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (viewFindViewById == null) {
            throw new IllegalStateException("The media route button placeholder is missing.");
        }
        if (viewProvider == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        final ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
        if (viewGroup == null) {
            throw new IllegalStateException("The media route button placeholder has no parent view.");
        }
        com.google.common.util.concurrent.J view = viewProvider.getView(viewGroup);
        B b9 = new B() {
            @Override
            public void onFailure(Throwable th) {
                viewFindViewById.setVisibility(8);
            }

            @Override
            public void onSuccess(View view2) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams == null) {
                    throw new IllegalStateException("The media route button placeholder missing layout params.");
                }
                view2.setId(R.id.exo_media_route_button_placeholder);
                view2.setLayoutParams(layoutParams);
                int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
                viewGroup.removeView(viewFindViewById);
                viewGroup.addView(view2, iIndexOfChild);
                view2.setVisibility(0);
                PlayerControlView.this.controlViewLayoutManager.setShowButton(view2, true);
            }
        };
        Handler handler = this.handler;
        Objects.requireNonNull(handler);
        D.d(view, b9, new androidx.media3.common.util.d(handler));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullscreenButtonVisibility(this.fullscreenButton, onFullScreenModeChangedListener != null);
        updateFullscreenButtonVisibility(this.minimalFullscreenButton, onFullScreenModeChangedListener != null);
    }

    public void setPlayer(Player player) {
        AbstractC1864o0.Y(Looper.myLooper() == Looper.getMainLooper());
        AbstractC1864o0.L(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.player;
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

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i3) {
        this.repeatToggleModes = i3;
        Player player = this.player;
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

    @Deprecated
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
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i3, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z6) {
        this.timeBarScrubbingEnabled = z6;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.vrButton;
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
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(z6);
        }
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i3) {
        return typedArray.getInt(R.styleable.PlayerControlView_repeat_toggle_modes, i3);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i3, AttributeSet attributeSet2) throws Throwable {
        PlayerControlView playerControlView;
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
        String str;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls;
        Method method5;
        ImageView imageView;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        TimeBar timeBar;
        View viewFindViewById4;
        ImageView imageView2;
        Context context2;
        PlayerControlView playerControlView2;
        ?? r9;
        TimeBar timeBar2;
        Resources resources;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        int i22;
        ImageView imageView6;
        Resources resources2;
        ?? A9;
        ImageView imageView7;
        ?? r10;
        View view;
        ImageView imageView8;
        ?? r11;
        View view2;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        boolean z16;
        super(context, attributeSet, i3);
        Class cls2 = Boolean.TYPE;
        int resourceId2 = R.layout.exo_player_control_view;
        int resourceId3 = R.drawable.exo_styled_controls_play;
        int i23 = R.drawable.exo_styled_controls_pause;
        int i24 = R.drawable.exo_styled_controls_next;
        int i25 = R.drawable.exo_styled_controls_simple_fastforward;
        int i26 = R.drawable.exo_styled_controls_previous;
        int i27 = R.drawable.exo_styled_controls_simple_rewind;
        int i28 = R.drawable.exo_styled_controls_fullscreen_exit;
        int i29 = R.drawable.exo_styled_controls_fullscreen_enter;
        int i30 = R.drawable.exo_styled_controls_repeat_off;
        int i31 = R.drawable.exo_styled_controls_repeat_one;
        int i32 = R.drawable.exo_styled_controls_repeat_all;
        String str2 = "isScrubbingModeEnabled";
        int i33 = R.drawable.exo_styled_controls_shuffle_on;
        int i34 = R.drawable.exo_styled_controls_shuffle_off;
        int i35 = R.drawable.exo_styled_controls_subtitle_on;
        int resourceId4 = R.drawable.exo_styled_controls_subtitle_off;
        int i36 = R.drawable.exo_styled_controls_vr;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.PlayerControlView, i3, 0);
            try {
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_controller_layout_id, resourceId2);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_play_icon, resourceId3);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_pause_icon, i23);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_next_icon, i24);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fastforward_icon, i25);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_previous_icon, i26);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_rewind_icon, i27);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fullscreen_exit_icon, i28);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_fullscreen_enter_icon, i29);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_off_icon, i30);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_one_icon, i31);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_repeat_all_icon, i32);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_shuffle_on_icon, i33);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_shuffle_off_icon, i34);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_subtitle_on_icon, i35);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_subtitle_off_icon, resourceId4);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_vr_icon, i36);
                playerControlView = this;
                try {
                    playerControlView.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_show_timeout, playerControlView.showTimeoutMs);
                    playerControlView.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, playerControlView.repeatToggleModes);
                    boolean z17 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_rewind_button, true);
                    boolean z18 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_fastforward_button, true);
                    z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_previous_button, true);
                    boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_next_button, true);
                    boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_shuffle_button, false);
                    boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_subtitle_button, false);
                    boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_vr_button, false);
                    playerControlView.timeBarScrubbingEnabled = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_time_bar_scrubbing_enabled, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.PlayerControlView_time_bar_min_update_interval, playerControlView.timeBarMinUpdateIntervalMs));
                    boolean z23 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_animation_enabled, true);
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
                } catch (Throwable th) {
                    th = th;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
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
        LayoutInflater.from(context).inflate(resourceId2, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        playerControlView.componentListener = new ComponentListener();
        playerControlView.visibilityListeners = new CopyOnWriteArrayList<>();
        playerControlView.period = new Timeline.Period();
        playerControlView.window = new Timeline.Window();
        StringBuilder sb = new StringBuilder();
        playerControlView.formatBuilder = sb;
        boolean z24 = z6;
        playerControlView.formatter = new Formatter(sb, Locale.getDefault());
        playerControlView.adGroupTimesMs = new long[0];
        playerControlView.playedAdGroups = new boolean[0];
        playerControlView.extraAdGroupTimesMs = new long[0];
        playerControlView.extraPlayedAdGroups = new boolean[0];
        playerControlView.updateProgressAction = new a(playerControlView, 1);
        try {
            str = "setScrubbingModeEnabled";
            try {
                method = ExoPlayer.class.getMethod(str, cls2);
                str2 = str2;
                try {
                    method2 = ExoPlayer.class.getMethod(str2, null);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    method2 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method = null;
                method2 = null;
                Method method6 = method;
                playerControlView.exoplayerClazz = ExoPlayer.class;
                playerControlView.setScrubbingModeEnabledMethod = method6;
                playerControlView.isScrubbingModeEnabledMethod = method2;
                cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
                try {
                    method4 = cls.getMethod(str, cls2);
                    method3 = null;
                    try {
                        method5 = cls.getMethod(str2, null);
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        method5 = method3;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    method3 = null;
                    method4 = null;
                }
                playerControlView.compositionPlayerClazz = cls;
                playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method4;
                playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method5;
                playerControlView.durationView = (TextView) playerControlView.findViewById(R.id.exo_duration);
                playerControlView.positionView = (TextView) playerControlView.findViewById(R.id.exo_position);
                imageView = (ImageView) playerControlView.findViewById(R.id.exo_subtitle);
                playerControlView.subtitleButton = imageView;
                if (imageView != null) {
                    imageView.setOnClickListener(playerControlView.componentListener);
                }
                ImageView imageView12 = (ImageView) playerControlView.findViewById(R.id.exo_fullscreen);
                playerControlView.fullscreenButton = imageView12;
                int i37 = 4;
                initializeFullscreenButton(imageView12, new c(i37, playerControlView));
                ImageView imageView13 = (ImageView) playerControlView.findViewById(R.id.exo_minimal_fullscreen);
                playerControlView.minimalFullscreenButton = imageView13;
                initializeFullscreenButton(imageView13, new c(i37, playerControlView));
                viewFindViewById = playerControlView.findViewById(R.id.exo_settings);
                playerControlView.settingsButton = viewFindViewById;
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(playerControlView.componentListener);
                }
                viewFindViewById2 = playerControlView.findViewById(R.id.exo_playback_speed);
                playerControlView.playbackSpeedButton = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(playerControlView.componentListener);
                }
                viewFindViewById3 = playerControlView.findViewById(R.id.exo_audio_track);
                playerControlView.audioTrackButton = viewFindViewById3;
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setOnClickListener(playerControlView.componentListener);
                }
                timeBar = (TimeBar) playerControlView.findViewById(R.id.exo_progress);
                viewFindViewById4 = playerControlView.findViewById(R.id.exo_progress_placeholder);
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
                    DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
                    context2 = context;
                    defaultTimeBar.setId(R.id.exo_progress);
                    defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
                    ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
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
                playerControlView2.handler = Util.createHandlerForCurrentLooper();
                resources = context2.getResources();
                playerControlView2.resources = resources;
                imageView3 = (ImageView) playerControlView2.findViewById(R.id.exo_play_pause);
                playerControlView2.playPauseButton = imageView3;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(playerControlView2.componentListener);
                }
                imageView4 = (ImageView) playerControlView2.findViewById(R.id.exo_prev);
                playerControlView2.previousButton = imageView4;
                if (imageView4 != null) {
                    imageView4.setImageDrawable(Util.getDrawable(context2, resources, i11));
                    imageView4.setOnClickListener(playerControlView2.componentListener);
                }
                imageView5 = (ImageView) playerControlView2.findViewById(R.id.exo_next);
                playerControlView2.nextButton = imageView5;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(Util.getDrawable(context2, resources, i17));
                    imageView5.setOnClickListener(playerControlView2.componentListener);
                }
                i22 = R.font.roboto_medium_numbers;
                ThreadLocal threadLocal = p176v1.j.f29136a;
                if (context2.isRestricted()) {
                    imageView6 = imageView4;
                    resources2 = resources;
                    A9 = r9;
                } else {
                    imageView6 = imageView4;
                    resources2 = resources;
                    A9 = p176v1.j.a(context2, i22, new TypedValue(), 0, null, false);
                }
                imageView7 = (ImageView) playerControlView2.findViewById(R.id.exo_rew);
                r10 = (TextView) playerControlView2.findViewById(R.id.exo_rew_with_amount);
                if (imageView7 != null) {
                    imageView7.setImageDrawable(Util.getDrawable(context2, resources2, i21));
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
                imageView8 = (ImageView) playerControlView2.findViewById(R.id.exo_ffwd);
                r11 = (TextView) playerControlView2.findViewById(R.id.exo_ffwd_with_amount);
                if (imageView8 != null) {
                    imageView8.setImageDrawable(Util.getDrawable(context2, resources2, i10));
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
                imageView9 = (ImageView) playerControlView2.findViewById(R.id.exo_repeat_toggle);
                playerControlView2.repeatToggleButton = imageView9;
                if (imageView9 != null) {
                    imageView9.setOnClickListener(playerControlView2.componentListener);
                }
                imageView10 = (ImageView) playerControlView2.findViewById(R.id.exo_shuffle);
                playerControlView2.shuffleButton = imageView10;
                if (imageView10 != null) {
                    imageView10.setOnClickListener(playerControlView2.componentListener);
                }
                playerControlView2.buttonAlphaEnabled = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                playerControlView2.buttonAlphaDisabled = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                imageView11 = (ImageView) playerControlView2.findViewById(R.id.exo_vr);
                playerControlView2.vrButton = imageView11;
                if (imageView11 != null) {
                    imageView11.setImageDrawable(Util.getDrawable(context2, resources2, resourceId));
                    playerControlView2.updateButton(false, imageView11);
                }
                PlayerControlViewLayoutManager playerControlViewLayoutManager = new PlayerControlViewLayoutManager(playerControlView2);
                playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager;
                playerControlViewLayoutManager.setAnimationEnabled(z15);
                SettingsAdapter settingsAdapter = playerControlView2.new SettingsAdapter(new String[]{resources2.getString(R.string.exo_controls_playback_speed), resources2.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context2, resources2, R.drawable.exo_styled_controls_speed), Util.getDrawable(context2, resources2, R.drawable.exo_styled_controls_audiotrack)});
                playerControlView2.settingsAdapter = settingsAdapter;
                playerControlView2.settingsWindowMargin = resources2.getDimensionPixelSize(R.dimen.exo_settings_offset);
                RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(R.layout.exo_styled_settings_list, r9);
                playerControlView2.settingsView = recyclerView;
                recyclerView.setAdapter(settingsAdapter);
                playerControlView2.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                playerControlView2.settingsWindow = popupWindow;
                popupWindow.setOnDismissListener(playerControlView2.componentListener);
                playerControlView2.needToHideBars = true;
                playerControlView2.trackNameProvider = new DefaultTrackNameProvider(playerControlView2.getResources());
                playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context2, resources2, i12);
                playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context2, resources2, resourceId4);
                playerControlView2.subtitleOnContentDescription = resources2.getString(R.string.exo_controls_cc_enabled_description);
                playerControlView2.subtitleOffContentDescription = resources2.getString(R.string.exo_controls_cc_disabled_description);
                playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
                playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
                playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources2.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
                playerControlView2.playButtonDrawable = Util.getDrawable(context2, resources2, resourceId3);
                playerControlView2.pauseButtonDrawable = Util.getDrawable(context2, resources2, i20);
                playerControlView2.fullscreenExitDrawable = Util.getDrawable(context2, resources2, i18);
                playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context2, resources2, i16);
                playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context2, resources2, i19);
                playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context2, resources2, i15);
                playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context2, resources2, i13);
                playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context2, resources2, i14);
                playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context2, resources2, i9);
                playerControlView2.fullscreenExitContentDescription = resources2.getString(R.string.exo_controls_fullscreen_exit_description);
                playerControlView2.fullscreenEnterContentDescription = resources2.getString(R.string.exo_controls_fullscreen_enter_description);
                playerControlView2.repeatOffButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_off_description);
                playerControlView2.repeatOneButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_one_description);
                playerControlView2.repeatAllButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_all_description);
                playerControlView2.shuffleOnContentDescription = resources2.getString(R.string.exo_controls_shuffle_on_description);
                playerControlView2.shuffleOffContentDescription = resources2.getString(R.string.exo_controls_shuffle_off_description);
                playerControlViewLayoutManager.setShowButton((ViewGroup) playerControlView2.findViewById(R.id.exo_bottom_bar), true);
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
                playerControlView2.addOnLayoutChangeListener(new h(1, playerControlView2));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            str = "setScrubbingModeEnabled";
        }
        Method method7 = method;
        playerControlView.exoplayerClazz = ExoPlayer.class;
        playerControlView.setScrubbingModeEnabledMethod = method7;
        playerControlView.isScrubbingModeEnabledMethod = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            method4 = cls.getMethod(str, cls2);
            method3 = null;
            method5 = cls.getMethod(str2, null);
        } catch (ClassNotFoundException | NoSuchMethodException unused6) {
            method3 = null;
            method4 = null;
            cls = null;
        }
        playerControlView.compositionPlayerClazz = cls;
        playerControlView.compositionPlayerSetScrubbingModeEnabledMethod = method4;
        playerControlView.compositionPlayerIsScrubbingModeEnabledMethod = method5;
        playerControlView.durationView = (TextView) playerControlView.findViewById(R.id.exo_duration);
        playerControlView.positionView = (TextView) playerControlView.findViewById(R.id.exo_position);
        imageView = (ImageView) playerControlView.findViewById(R.id.exo_subtitle);
        playerControlView.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(playerControlView.componentListener);
        }
        ImageView imageView14 = (ImageView) playerControlView.findViewById(R.id.exo_fullscreen);
        playerControlView.fullscreenButton = imageView14;
        int i38 = 4;
        initializeFullscreenButton(imageView14, new c(i38, playerControlView));
        ImageView imageView15 = (ImageView) playerControlView.findViewById(R.id.exo_minimal_fullscreen);
        playerControlView.minimalFullscreenButton = imageView15;
        initializeFullscreenButton(imageView15, new c(i38, playerControlView));
        viewFindViewById = playerControlView.findViewById(R.id.exo_settings);
        playerControlView.settingsButton = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(playerControlView.componentListener);
        }
        viewFindViewById2 = playerControlView.findViewById(R.id.exo_playback_speed);
        playerControlView.playbackSpeedButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(playerControlView.componentListener);
        }
        viewFindViewById3 = playerControlView.findViewById(R.id.exo_audio_track);
        playerControlView.audioTrackButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(playerControlView.componentListener);
        }
        timeBar = (TimeBar) playerControlView.findViewById(R.id.exo_progress);
        viewFindViewById4 = playerControlView.findViewById(R.id.exo_progress_placeholder);
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
            DefaultTimeBar defaultTimeBar2 = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            context2 = context;
            defaultTimeBar2.setId(R.id.exo_progress);
            defaultTimeBar2.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4.getParent();
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
        playerControlView2.handler = Util.createHandlerForCurrentLooper();
        resources = context2.getResources();
        playerControlView2.resources = resources;
        imageView3 = (ImageView) playerControlView2.findViewById(R.id.exo_play_pause);
        playerControlView2.playPauseButton = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(playerControlView2.componentListener);
        }
        imageView4 = (ImageView) playerControlView2.findViewById(R.id.exo_prev);
        playerControlView2.previousButton = imageView4;
        if (imageView4 != null) {
            imageView4.setImageDrawable(Util.getDrawable(context2, resources, i11));
            imageView4.setOnClickListener(playerControlView2.componentListener);
        }
        imageView5 = (ImageView) playerControlView2.findViewById(R.id.exo_next);
        playerControlView2.nextButton = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(Util.getDrawable(context2, resources, i17));
            imageView5.setOnClickListener(playerControlView2.componentListener);
        }
        i22 = R.font.roboto_medium_numbers;
        ThreadLocal threadLocal2 = p176v1.j.f29136a;
        if (context2.isRestricted()) {
            imageView6 = imageView4;
            resources2 = resources;
            A9 = r9;
        } else {
            imageView6 = imageView4;
            resources2 = resources;
            A9 = p176v1.j.a(context2, i22, new TypedValue(), 0, null, false);
        }
        imageView7 = (ImageView) playerControlView2.findViewById(R.id.exo_rew);
        r10 = (TextView) playerControlView2.findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(Util.getDrawable(context2, resources2, i21));
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
        imageView8 = (ImageView) playerControlView2.findViewById(R.id.exo_ffwd);
        r11 = (TextView) playerControlView2.findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(Util.getDrawable(context2, resources2, i10));
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
        imageView9 = (ImageView) playerControlView2.findViewById(R.id.exo_repeat_toggle);
        playerControlView2.repeatToggleButton = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(playerControlView2.componentListener);
        }
        imageView10 = (ImageView) playerControlView2.findViewById(R.id.exo_shuffle);
        playerControlView2.shuffleButton = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(playerControlView2.componentListener);
        }
        playerControlView2.buttonAlphaEnabled = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.buttonAlphaDisabled = resources2.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView11 = (ImageView) playerControlView2.findViewById(R.id.exo_vr);
        playerControlView2.vrButton = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(Util.getDrawable(context2, resources2, resourceId));
            playerControlView2.updateButton(false, imageView11);
        }
        PlayerControlViewLayoutManager playerControlViewLayoutManager2 = new PlayerControlViewLayoutManager(playerControlView2);
        playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager2;
        playerControlViewLayoutManager2.setAnimationEnabled(z15);
        SettingsAdapter settingsAdapter2 = playerControlView2.new SettingsAdapter(new String[]{resources2.getString(R.string.exo_controls_playback_speed), resources2.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{Util.getDrawable(context2, resources2, R.drawable.exo_styled_controls_speed), Util.getDrawable(context2, resources2, R.drawable.exo_styled_controls_audiotrack)});
        playerControlView2.settingsAdapter = settingsAdapter2;
        playerControlView2.settingsWindowMargin = resources2.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context2).inflate(R.layout.exo_styled_settings_list, r9);
        playerControlView2.settingsView = recyclerView2;
        recyclerView2.setAdapter(settingsAdapter2);
        playerControlView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
        playerControlView2.settingsWindow = popupWindow2;
        popupWindow2.setOnDismissListener(playerControlView2.componentListener);
        playerControlView2.needToHideBars = true;
        playerControlView2.trackNameProvider = new DefaultTrackNameProvider(playerControlView2.getResources());
        playerControlView2.subtitleOnButtonDrawable = Util.getDrawable(context2, resources2, i12);
        playerControlView2.subtitleOffButtonDrawable = Util.getDrawable(context2, resources2, resourceId4);
        playerControlView2.subtitleOnContentDescription = resources2.getString(R.string.exo_controls_cc_enabled_description);
        playerControlView2.subtitleOffContentDescription = resources2.getString(R.string.exo_controls_cc_disabled_description);
        playerControlView2.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
        playerControlView2.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
        playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources2.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        playerControlView2.playButtonDrawable = Util.getDrawable(context2, resources2, resourceId3);
        playerControlView2.pauseButtonDrawable = Util.getDrawable(context2, resources2, i20);
        playerControlView2.fullscreenExitDrawable = Util.getDrawable(context2, resources2, i18);
        playerControlView2.fullscreenEnterDrawable = Util.getDrawable(context2, resources2, i16);
        playerControlView2.repeatOffButtonDrawable = Util.getDrawable(context2, resources2, i19);
        playerControlView2.repeatOneButtonDrawable = Util.getDrawable(context2, resources2, i15);
        playerControlView2.repeatAllButtonDrawable = Util.getDrawable(context2, resources2, i13);
        playerControlView2.shuffleOnButtonDrawable = Util.getDrawable(context2, resources2, i14);
        playerControlView2.shuffleOffButtonDrawable = Util.getDrawable(context2, resources2, i9);
        playerControlView2.fullscreenExitContentDescription = resources2.getString(R.string.exo_controls_fullscreen_exit_description);
        playerControlView2.fullscreenEnterContentDescription = resources2.getString(R.string.exo_controls_fullscreen_enter_description);
        playerControlView2.repeatOffButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_off_description);
        playerControlView2.repeatOneButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_one_description);
        playerControlView2.repeatAllButtonContentDescription = resources2.getString(R.string.exo_controls_repeat_all_description);
        playerControlView2.shuffleOnContentDescription = resources2.getString(R.string.exo_controls_shuffle_on_description);
        playerControlView2.shuffleOffContentDescription = resources2.getString(R.string.exo_controls_shuffle_off_description);
        playerControlViewLayoutManager2.setShowButton((ViewGroup) playerControlView2.findViewById(R.id.exo_bottom_bar), true);
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
        playerControlView2.addOnLayoutChangeListener(new h(1, playerControlView2));
    }
}
