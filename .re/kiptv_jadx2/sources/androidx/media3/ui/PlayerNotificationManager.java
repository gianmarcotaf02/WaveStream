package androidx.media3.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.C;
import androidx.core.app.C1489i;
import androidx.core.app.E;
import androidx.core.app.InterfaceC1487g;
import androidx.core.app.J;
import androidx.media3.common.Player;
import androidx.media3.common.util.NotificationUtil;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "androidx.media3.ui.notification.dismiss";
    public static final String ACTION_FAST_FORWARD = "androidx.media3.ui.notification.ffwd";
    public static final String ACTION_NEXT = "androidx.media3.ui.notification.next";
    public static final String ACTION_PAUSE = "androidx.media3.ui.notification.pause";
    public static final String ACTION_PLAY = "androidx.media3.ui.notification.play";
    public static final String ACTION_PREVIOUS = "androidx.media3.ui.notification.prev";
    public static final String ACTION_REWIND = "androidx.media3.ui.notification.rewind";
    public static final String ACTION_STOP = "androidx.media3.ui.notification.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 1;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 2;
    private static int instanceIdCounter;
    private int badgeIconType;
    private androidx.core.app.n builder;
    private List<C1489i> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, C1489i> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private MediaSession.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private final NotificationListener notificationListener;
    private final J notificationManager;
    private final Map<String, C1489i> playbackActions;
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private boolean showPlayButtonIfSuppressed;
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public final class BitmapCallback {
        private final int notificationTag;

        public void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }

        private BitmapCallback(int i3) {
            this.notificationTag = i3;
        }
    }

    public interface CustomActionReceiver {
        Map<String, C1489i> createCustomActions(Context context, int i3);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    public static final class MediaStyle extends C {
        private final int[] actionsToShowInCompact;
        private final MediaSession.Token token;

        public MediaStyle(MediaSession.Token token, int[] iArr) {
            this.token = token;
            this.actionsToShowInCompact = iArr;
        }

        @Override
        public void apply(InterfaceC1487g interfaceC1487g) {
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.actionsToShowInCompact);
            MediaSession.Token token = this.token;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            ((E) interfaceC1487g).f15975b.setStyle(mediaStyle);
        }
    }

    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    Util.handlePlayButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    Util.handlePauseButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public interface NotificationListener {
        default void onNotificationCancelled(int i3, boolean z6) {
        }

        default void onNotificationPosted(int i3, Notification notification, boolean z6) {
        }
    }

    public class PlayerListener implements Player.Listener {
        private PlayerListener() {
        }

        @Override
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public PlayerNotificationManager(Context context, String str, int i3, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener, CustomActionReceiver customActionReceiver, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i3;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i9;
        this.groupKey = str2;
        int i17 = instanceIdCounter;
        instanceIdCounter = i17 + 1;
        this.instanceId = i17;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                return this.f17166h.handleMessage(message);
            }
        });
        this.notificationManager = new J(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.showPlayButtonIfSuppressed = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, C1489i> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i17, i10, i11, i12, i13, i14, i15, i16);
        this.playbackActions = mapCreatePlaybackActions;
        Iterator<String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        Map<String, C1489i> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : Collections.EMPTY_MAP;
        this.customActions = mapCreateCustomActions;
        Iterator<String> it2 = mapCreateCustomActions.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i3) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i3);
        return PendingIntent.getBroadcast(context, i3, intent, 201326592);
    }

    private static Map<String, C1489i> createPlaybackActions(Context context, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new C1489i(i9, createBroadcastIntent(ACTION_PLAY, context, i3), context.getString(R.string.exo_controls_play_description)));
        map.put(ACTION_PAUSE, new C1489i(i10, createBroadcastIntent(ACTION_PAUSE, context, i3), context.getString(R.string.exo_controls_pause_description)));
        map.put(ACTION_STOP, new C1489i(i11, createBroadcastIntent(ACTION_STOP, context, i3), context.getString(R.string.exo_controls_stop_description)));
        map.put(ACTION_REWIND, new C1489i(i12, createBroadcastIntent(ACTION_REWIND, context, i3), context.getString(R.string.exo_controls_rewind_description)));
        map.put(ACTION_FAST_FORWARD, new C1489i(i13, createBroadcastIntent(ACTION_FAST_FORWARD, context, i3), context.getString(R.string.exo_controls_fastforward_description)));
        map.put(ACTION_PREVIOUS, new C1489i(i14, createBroadcastIntent(ACTION_PREVIOUS, context, i3), context.getString(R.string.exo_controls_previous_description)));
        map.put(ACTION_NEXT, new C1489i(i15, createBroadcastIntent(ACTION_NEXT, context, i3), context.getString(R.string.exo_controls_next_description)));
        return map;
    }

    public boolean handleMessage(Message message) {
        int i3 = message.what;
        if (i3 == 1) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i3 != 2) {
                return false;
            }
            Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (Bitmap) message.obj);
            }
        }
        return true;
    }

    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(1)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    public void postUpdateNotificationBitmap(Bitmap bitmap, int i3) {
        this.mainHandler.obtainMessage(2, i3, -1, bitmap).sendToTarget();
    }

    private static void setLargeIcon(androidx.core.app.n nVar, Bitmap bitmap) {
        nVar.d(bitmap);
    }

    private void startOrUpdateNotification(Player player, Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        androidx.core.app.n nVarCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = nVarCreateNotification;
        if (nVarCreateNotification == null) {
            stopNotification(false);
            return;
        }
        Notification notificationA = nVarCreateNotification.a();
        this.notificationManager.a(this.notificationId, notificationA);
        if (!this.isNotificationStarted) {
            Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            notificationListener.onNotificationPosted(this.notificationId, notificationA, ongoing || !this.isNotificationStarted);
        }
        this.isNotificationStarted = true;
    }

    public void stopNotification(boolean z6) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(1);
            J j = this.notificationManager;
            j.f15997b.cancel(null, this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z6);
            }
        }
    }

    public androidx.core.app.n createNotification(Player player, androidx.core.app.n nVar, boolean z6, Bitmap bitmap) {
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i3 = 0; i3 < actions.size(); i3++) {
            String str = actions.get(i3);
            C1489i c1489i = this.playbackActions.containsKey(str) ? this.playbackActions.get(str) : this.customActions.get(str);
            if (c1489i != null) {
                arrayList.add(c1489i);
            }
        }
        if (nVar == null || !arrayList.equals(this.builderActions)) {
            nVar = new androidx.core.app.n(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                C1489i c1489i2 = (C1489i) arrayList.get(i9);
                if (c1489i2 != null) {
                    nVar.f16046b.add(c1489i2);
                }
            }
        }
        nVar.e(new MediaStyle(this.mediaSessionToken, getActionIndicesForCompactView(actions, player)));
        PendingIntent pendingIntent = this.dismissPendingIntent;
        Notification notification = nVar.f16067z;
        notification.deleteIntent = pendingIntent;
        nVar.f16065w = this.badgeIconType;
        nVar.c(2, z6);
        nVar.f16062t = this.color;
        nVar.f16058p = this.colorized;
        nVar.f16059q = true;
        notification.icon = this.smallIconResourceId;
        nVar.f16063u = this.visibility;
        nVar.f16052i = this.priority;
        int i10 = this.defaults;
        notification.defaults = i10;
        if ((i10 & 4) != 0) {
            notification.flags |= 1;
        }
        if (this.useChronometer && player.isCommandAvailable(16) && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            notification.when = System.currentTimeMillis() - player.getContentPosition();
            nVar.j = true;
            nVar.f16053k = true;
        } else {
            nVar.j = false;
            nVar.f16053k = false;
        }
        nVar.f16049e = androidx.core.app.n.b(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        nVar.f16050f = androidx.core.app.n.b(this.mediaDescriptionAdapter.getCurrentContentText(player));
        nVar.f16055m = androidx.core.app.n.b(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i11 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i11;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i11));
        }
        setLargeIcon(nVar, bitmap);
        nVar.g = this.mediaDescriptionAdapter.createCurrentContentIntent(player);
        String str2 = this.groupKey;
        if (str2 != null) {
            nVar.f16056n = str2;
        }
        nVar.c(8, true);
        return nVar;
    }

    public int[] getActionIndicesForCompactView(List<String> list, Player player) {
        int iIndexOf;
        int iIndexOf2;
        int i3;
        int iIndexOf3 = list.indexOf(ACTION_PAUSE);
        int iIndexOf4 = list.indexOf(ACTION_PLAY);
        if (this.usePreviousActionInCompactView) {
            iIndexOf = list.indexOf(ACTION_PREVIOUS);
        } else {
            iIndexOf = this.useRewindActionInCompactView ? list.indexOf(ACTION_REWIND) : -1;
        }
        if (this.useNextActionInCompactView) {
            iIndexOf2 = list.indexOf(ACTION_NEXT);
        } else {
            iIndexOf2 = this.useFastForwardActionInCompactView ? list.indexOf(ACTION_FAST_FORWARD) : -1;
        }
        int[] iArr = new int[3];
        int i9 = 0;
        if (iIndexOf != -1) {
            iArr[0] = iIndexOf;
            i9 = 1;
        }
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed);
        if (iIndexOf3 == -1 || zShouldShowPlayButton) {
            if (iIndexOf4 != -1 && zShouldShowPlayButton) {
                i3 = i9 + 1;
                iArr[i9] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i9] = iIndexOf2;
                i9++;
            }
            return Arrays.copyOf(iArr, i9);
        }
        i3 = i9 + 1;
        iArr[i9] = iIndexOf3;
        i9 = i3;
        if (iIndexOf2 != -1) {
            iArr[i9] = iIndexOf2;
            i9++;
        }
        return Arrays.copyOf(iArr, i9);
    }

    public List<String> getActions(Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
                arrayList.add(ACTION_PLAY);
            } else {
                arrayList.add(ACTION_PAUSE);
            }
        }
        if (this.useFastForwardAction && zIsCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && zIsCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    public final void setBadgeIconType(int i3) {
        if (this.badgeIconType == i3) {
            return;
        }
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException();
        }
        this.badgeIconType = i3;
        invalidate();
    }

    public final void setColor(int i3) {
        if (this.color != i3) {
            this.color = i3;
            invalidate();
        }
    }

    public final void setColorized(boolean z6) {
        if (this.colorized != z6) {
            this.colorized = z6;
            invalidate();
        }
    }

    public final void setDefaults(int i3) {
        if (this.defaults != i3) {
            this.defaults = i3;
            invalidate();
        }
    }

    public final void setMediaSessionToken(MediaSession.Token token) {
        if (Objects.equals(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPlayer(Player player) {
        boolean z6 = true;
        AbstractC1864o0.Y(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z6 = false;
        }
        AbstractC1864o0.L(z6);
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.playerListener);
            if (player == null) {
                stopNotification(false);
            }
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.playerListener);
            postStartOrUpdateNotification();
        }
    }

    public final void setPriority(int i3) {
        if (this.priority == i3) {
            return;
        }
        if (i3 != -2 && i3 != -1 && i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException();
        }
        this.priority = i3;
        invalidate();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z6) {
        if (this.showPlayButtonIfSuppressed != z6) {
            this.showPlayButtonIfSuppressed = z6;
            invalidate();
        }
    }

    public final void setSmallIcon(int i3) {
        if (this.smallIconResourceId != i3) {
            this.smallIconResourceId = i3;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z6) {
        if (this.useChronometer != z6) {
            this.useChronometer = z6;
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z6) {
        if (this.useFastForwardAction != z6) {
            this.useFastForwardAction = z6;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z6) {
        if (this.useFastForwardActionInCompactView != z6) {
            this.useFastForwardActionInCompactView = z6;
            if (z6) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseNextAction(boolean z6) {
        if (this.useNextAction != z6) {
            this.useNextAction = z6;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z6) {
        if (this.useNextActionInCompactView != z6) {
            this.useNextActionInCompactView = z6;
            if (z6) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z6) {
        if (this.usePlayPauseActions != z6) {
            this.usePlayPauseActions = z6;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z6) {
        if (this.usePreviousAction != z6) {
            this.usePreviousAction = z6;
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z6) {
        if (this.usePreviousActionInCompactView != z6) {
            this.usePreviousActionInCompactView = z6;
            if (z6) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z6) {
        if (this.useRewindAction != z6) {
            this.useRewindAction = z6;
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z6) {
        if (this.useRewindActionInCompactView != z6) {
            this.useRewindActionInCompactView = z6;
            if (z6) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z6) {
        if (this.useStopAction == z6) {
            return;
        }
        this.useStopAction = z6;
        invalidate();
    }

    public final void setVisibility(int i3) {
        if (this.visibility == i3) {
            return;
        }
        if (i3 != -1 && i3 != 0 && i3 != 1) {
            throw new IllegalStateException();
        }
        this.visibility = i3;
        invalidate();
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final Context context;
        protected CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;
        protected String groupKey;
        protected MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;
        protected NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        @Deprecated
        public Builder(Context context, int i3, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i3, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public PlayerNotificationManager build() {
            int i3 = this.channelNameResourceId;
            if (i3 != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i3, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public Builder setChannelDescriptionResourceId(int i3) {
            this.channelDescriptionResourceId = i3;
            return this;
        }

        public Builder setChannelImportance(int i3) {
            this.channelImportance = i3;
            return this;
        }

        public Builder setChannelNameResourceId(int i3) {
            this.channelNameResourceId = i3;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i3) {
            this.fastForwardActionIconResourceId = i3;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public Builder setNextActionIconResourceId(int i3) {
            this.nextActionIconResourceId = i3;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i3) {
            this.pauseActionIconResourceId = i3;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i3) {
            this.playActionIconResourceId = i3;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i3) {
            this.previousActionIconResourceId = i3;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i3) {
            this.rewindActionIconResourceId = i3;
            return this;
        }

        public Builder setSmallIconResourceId(int i3) {
            this.smallIconResourceId = i3;
            return this;
        }

        public Builder setStopActionIconResourceId(int i3) {
            this.stopActionIconResourceId = i3;
            return this;
        }

        public Builder(Context context, int i3, String str) {
            AbstractC1864o0.L(i3 > 0);
            this.context = context;
            this.notificationId = i3;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = R.drawable.exo_notification_next;
        }
    }
}
