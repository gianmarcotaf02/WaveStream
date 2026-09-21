package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public class PlayerNotificationManager {
    private static final java.lang.String ACTION_DISMISS = "androidx.media3.ui.notification.dismiss";
    public static final java.lang.String ACTION_FAST_FORWARD = "androidx.media3.ui.notification.ffwd";
    public static final java.lang.String ACTION_NEXT = "androidx.media3.ui.notification.next";
    public static final java.lang.String ACTION_PAUSE = "androidx.media3.ui.notification.pause";
    public static final java.lang.String ACTION_PLAY = "androidx.media3.ui.notification.play";
    public static final java.lang.String ACTION_PREVIOUS = "androidx.media3.ui.notification.prev";
    public static final java.lang.String ACTION_REWIND = "androidx.media3.ui.notification.rewind";
    public static final java.lang.String ACTION_STOP = "androidx.media3.ui.notification.stop";
    public static final java.lang.String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 1;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 2;
    private static int instanceIdCounter;
    private int badgeIconType;
    private androidx.core.app.n builder;
    private java.util.List<androidx.core.app.C1489i> builderActions;
    private final java.lang.String channelId;
    private int color;
    private boolean colorized;
    private final android.content.Context context;
    private int currentNotificationTag;
    private final androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver;
    private final java.util.Map<java.lang.String, androidx.core.app.C1489i> customActions;
    private int defaults;
    private final android.app.PendingIntent dismissPendingIntent;
    private java.lang.String groupKey;
    private final int instanceId;
    private final android.content.IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final android.os.Handler mainHandler;
    private final androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter;
    private android.media.session.MediaSession.Token mediaSessionToken;
    private final androidx.media3.ui.PlayerNotificationManager.NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private final androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener;
    private final androidx.core.app.J notificationManager;
    private final java.util.Map<java.lang.String, androidx.core.app.C1489i> playbackActions;
    private androidx.media3.common.Player player;
    private final androidx.media3.common.Player.Listener playerListener;
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

        public void onBitmap(android.graphics.Bitmap bitmap) {
            if (bitmap != null) {
                androidx.media3.ui.PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }

        private BitmapCallback(int i3) {
            this.notificationTag = i3;
        }
    }

    public interface CustomActionReceiver {
        java.util.Map<java.lang.String, androidx.core.app.C1489i> createCustomActions(android.content.Context context, int i3);

        java.util.List<java.lang.String> getCustomActions(androidx.media3.common.Player player);

        void onCustomAction(androidx.media3.common.Player player, java.lang.String str, android.content.Intent intent);
    }

    public interface MediaDescriptionAdapter {
        android.app.PendingIntent createCurrentContentIntent(androidx.media3.common.Player player);

        java.lang.CharSequence getCurrentContentText(androidx.media3.common.Player player);

        java.lang.CharSequence getCurrentContentTitle(androidx.media3.common.Player player);

        android.graphics.Bitmap getCurrentLargeIcon(androidx.media3.common.Player player, androidx.media3.ui.PlayerNotificationManager.BitmapCallback bitmapCallback);

        default java.lang.CharSequence getCurrentSubText(androidx.media3.common.Player player) {
            return null;
        }
    }

    public static final class MediaStyle extends androidx.core.app.C {
        private final int[] actionsToShowInCompact;
        private final android.media.session.MediaSession.Token token;

        public MediaStyle(android.media.session.MediaSession.Token token, int[] iArr) {
            this.token = token;
            this.actionsToShowInCompact = iArr;
        }

        @Override // androidx.core.app.C
        public void apply(androidx.core.app.InterfaceC1487g interfaceC1487g) {
            android.app.Notification.MediaStyle mediaStyle = new android.app.Notification.MediaStyle();
            mediaStyle.setShowActionsInCompactView(this.actionsToShowInCompact);
            android.media.session.MediaSession.Token token = this.token;
            if (token != null) {
                mediaStyle.setMediaSession(token);
            }
            ((androidx.core.app.E) interfaceC1487g).f15975b.setStyle(mediaStyle);
        }
    }

    public class NotificationBroadcastReceiver extends android.content.BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            androidx.media3.common.Player player = androidx.media3.ui.PlayerNotificationManager.this.player;
            if (player != null && androidx.media3.ui.PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(androidx.media3.ui.PlayerNotificationManager.EXTRA_INSTANCE_ID, androidx.media3.ui.PlayerNotificationManager.this.instanceId) == androidx.media3.ui.PlayerNotificationManager.this.instanceId) {
                java.lang.String action = intent.getAction();
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    androidx.media3.common.util.Util.handlePlayButtonAction(player);
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    androidx.media3.common.util.Util.handlePauseButtonAction(player);
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (androidx.media3.ui.PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    androidx.media3.ui.PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || androidx.media3.ui.PlayerNotificationManager.this.customActionReceiver == null || !androidx.media3.ui.PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    androidx.media3.ui.PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }

    public interface NotificationListener {
        default void onNotificationCancelled(int i3, boolean z6) {
        }

        default void onNotificationPosted(int i3, android.app.Notification notification, boolean z6) {
        }
    }

    public class PlayerListener implements androidx.media3.common.Player.Listener {
        private PlayerListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                androidx.media3.ui.PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public PlayerNotificationManager(android.content.Context context, java.lang.String str, int i3, androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter, androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener, androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, java.lang.String str2) {
        android.content.Context applicationContext = context.getApplicationContext();
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
        this.mainHandler = androidx.media3.common.util.Util.createHandler(android.os.Looper.getMainLooper(), new android.os.Handler.Callback() { // from class: androidx.media3.ui.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f17166h.handleMessage(message);
            }
        });
        this.notificationManager = new androidx.core.app.J(applicationContext);
        this.playerListener = new androidx.media3.ui.PlayerNotificationManager.PlayerListener();
        this.notificationBroadcastReceiver = new androidx.media3.ui.PlayerNotificationManager.NotificationBroadcastReceiver();
        this.intentFilter = new android.content.IntentFilter();
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
        java.util.Map<java.lang.String, androidx.core.app.C1489i> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i17, i10, i11, i12, i13, i14, i15, i16);
        this.playbackActions = mapCreatePlaybackActions;
        java.util.Iterator<java.lang.String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        java.util.Map<java.lang.String, androidx.core.app.C1489i> mapCreateCustomActions = customActionReceiver != null ? customActionReceiver.createCustomActions(applicationContext, this.instanceId) : java.util.Collections.EMPTY_MAP;
        this.customActions = mapCreateCustomActions;
        java.util.Iterator<java.lang.String> it2 = mapCreateCustomActions.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    private static android.app.PendingIntent createBroadcastIntent(java.lang.String str, android.content.Context context, int i3) {
        android.content.Intent intent = new android.content.Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i3);
        return android.app.PendingIntent.getBroadcast(context, i3, intent, 201326592);
    }

    private static java.util.Map<java.lang.String, androidx.core.app.C1489i> createPlaybackActions(android.content.Context context, int i3, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(ACTION_PLAY, new androidx.core.app.C1489i(i9, createBroadcastIntent(ACTION_PLAY, context, i3), context.getString(androidx.media3.ui.R.string.exo_controls_play_description)));
        map.put(ACTION_PAUSE, new androidx.core.app.C1489i(i10, createBroadcastIntent(ACTION_PAUSE, context, i3), context.getString(androidx.media3.ui.R.string.exo_controls_pause_description)));
        map.put(ACTION_STOP, new androidx.core.app.C1489i(i11, createBroadcastIntent(ACTION_STOP, context, i3), context.getString(androidx.media3.ui.R.string.exo_controls_stop_description)));
        map.put(ACTION_REWIND, new androidx.core.app.C1489i(i12, createBroadcastIntent(ACTION_REWIND, context, i3), context.getString(androidx.media3.ui.R.string.exo_controls_rewind_description)));
        map.put(ACTION_FAST_FORWARD, new androidx.core.app.C1489i(i13, createBroadcastIntent(ACTION_FAST_FORWARD, context, i3), context.getString(androidx.media3.ui.R.string.exo_controls_fastforward_description)));
        map.put(ACTION_PREVIOUS, new androidx.core.app.C1489i(i14, createBroadcastIntent(ACTION_PREVIOUS, context, i3), context.getString(androidx.media3.ui.R.string.exo_controls_previous_description)));
        map.put(ACTION_NEXT, new androidx.core.app.C1489i(i15, createBroadcastIntent(ACTION_NEXT, context, i3), context.getString(androidx.media3.ui.R.string.exo_controls_next_description)));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(android.os.Message message) {
        int i3 = message.what;
        if (i3 == 1) {
            androidx.media3.common.Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i3 != 2) {
                return false;
            }
            androidx.media3.common.Player player2 = this.player;
            if (player2 != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(player2, (android.graphics.Bitmap) message.obj);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(1)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(android.graphics.Bitmap bitmap, int i3) {
        this.mainHandler.obtainMessage(2, i3, -1, bitmap).sendToTarget();
    }

    private static void setLargeIcon(androidx.core.app.n nVar, android.graphics.Bitmap bitmap) {
        nVar.d(bitmap);
    }

    private void startOrUpdateNotification(androidx.media3.common.Player player, android.graphics.Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        androidx.core.app.n nVarCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = nVarCreateNotification;
        if (nVarCreateNotification == null) {
            stopNotification(false);
            return;
        }
        android.app.Notification notificationA = nVarCreateNotification.a();
        this.notificationManager.a(this.notificationId, notificationA);
        if (!this.isNotificationStarted) {
            androidx.media3.common.util.Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            notificationListener.onNotificationPosted(this.notificationId, notificationA, ongoing || !this.isNotificationStarted);
        }
        this.isNotificationStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z6) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(1);
            androidx.core.app.J j = this.notificationManager;
            j.f15997b.cancel(null, this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z6);
            }
        }
    }

    public androidx.core.app.n createNotification(androidx.media3.common.Player player, androidx.core.app.n nVar, boolean z6, android.graphics.Bitmap bitmap) {
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        java.util.List<java.lang.String> actions = getActions(player);
        java.util.ArrayList arrayList = new java.util.ArrayList(actions.size());
        for (int i3 = 0; i3 < actions.size(); i3++) {
            java.lang.String str = actions.get(i3);
            androidx.core.app.C1489i c1489i = this.playbackActions.containsKey(str) ? this.playbackActions.get(str) : this.customActions.get(str);
            if (c1489i != null) {
                arrayList.add(c1489i);
            }
        }
        if (nVar == null || !arrayList.equals(this.builderActions)) {
            nVar = new androidx.core.app.n(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                androidx.core.app.C1489i c1489i2 = (androidx.core.app.C1489i) arrayList.get(i9);
                if (c1489i2 != null) {
                    nVar.f16046b.add(c1489i2);
                }
            }
        }
        nVar.e(new androidx.media3.ui.PlayerNotificationManager.MediaStyle(this.mediaSessionToken, getActionIndicesForCompactView(actions, player)));
        android.app.PendingIntent pendingIntent = this.dismissPendingIntent;
        android.app.Notification notification = nVar.f16067z;
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
            notification.when = java.lang.System.currentTimeMillis() - player.getContentPosition();
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
            androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i11 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i11;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new androidx.media3.ui.PlayerNotificationManager.BitmapCallback(i11));
        }
        setLargeIcon(nVar, bitmap);
        nVar.g = this.mediaDescriptionAdapter.createCurrentContentIntent(player);
        java.lang.String str2 = this.groupKey;
        if (str2 != null) {
            nVar.f16056n = str2;
        }
        nVar.c(8, true);
        return nVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    public int[] getActionIndicesForCompactView(java.util.List<java.lang.String> list, androidx.media3.common.Player player) {
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
        boolean zShouldShowPlayButton = androidx.media3.common.util.Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed);
        if (iIndexOf3 == -1 || zShouldShowPlayButton) {
            if (iIndexOf4 != -1 && zShouldShowPlayButton) {
                i3 = i9 + 1;
                iArr[i9] = iIndexOf4;
            }
            if (iIndexOf2 != -1) {
                iArr[i9] = iIndexOf2;
                i9++;
            }
            return java.util.Arrays.copyOf(iArr, i9);
        }
        i3 = i9 + 1;
        iArr[i9] = iIndexOf3;
        i9 = i3;
        if (iIndexOf2 != -1) {
            iArr[i9] = iIndexOf2;
            i9++;
        }
        return java.util.Arrays.copyOf(iArr, i9);
    }

    public java.util.List<java.lang.String> getActions(androidx.media3.common.Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (androidx.media3.common.util.Util.shouldShowPlayButton(player, this.showPlayButtonIfSuppressed)) {
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
        androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    public boolean getOngoing(androidx.media3.common.Player player) {
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
            throw new java.lang.IllegalArgumentException();
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

    public final void setMediaSessionToken(android.media.session.MediaSession.Token token) {
        if (java.util.Objects.equals(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setPlayer(androidx.media3.common.Player player) {
        boolean z6 = true;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != android.os.Looper.getMainLooper()) {
            z6 = false;
        }
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(z6);
        androidx.media3.common.Player player2 = this.player;
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
            throw new java.lang.IllegalArgumentException();
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
            throw new java.lang.IllegalStateException();
        }
        this.visibility = i3;
        invalidate();
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final java.lang.String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final android.content.Context context;
        protected androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;
        protected java.lang.String groupKey;
        protected androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;
        protected androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        @java.lang.Deprecated
        public Builder(android.content.Context context, int i3, java.lang.String str, androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i3, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public androidx.media3.ui.PlayerNotificationManager build() {
            int i3 = this.channelNameResourceId;
            if (i3 != 0) {
                androidx.media3.common.util.NotificationUtil.createNotificationChannel(this.context, this.channelId, i3, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new androidx.media3.ui.PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setChannelDescriptionResourceId(int i3) {
            this.channelDescriptionResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setChannelImportance(int i3) {
            this.channelImportance = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setChannelNameResourceId(int i3) {
            this.channelNameResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setCustomActionReceiver(androidx.media3.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setFastForwardActionIconResourceId(int i3) {
            this.fastForwardActionIconResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setGroup(java.lang.String str) {
            this.groupKey = str;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setMediaDescriptionAdapter(androidx.media3.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setNextActionIconResourceId(int i3) {
            this.nextActionIconResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setNotificationListener(androidx.media3.ui.PlayerNotificationManager.NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setPauseActionIconResourceId(int i3) {
            this.pauseActionIconResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setPlayActionIconResourceId(int i3) {
            this.playActionIconResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setPreviousActionIconResourceId(int i3) {
            this.previousActionIconResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setRewindActionIconResourceId(int i3) {
            this.rewindActionIconResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setSmallIconResourceId(int i3) {
            this.smallIconResourceId = i3;
            return this;
        }

        public androidx.media3.ui.PlayerNotificationManager.Builder setStopActionIconResourceId(int i3) {
            this.stopActionIconResourceId = i3;
            return this;
        }

        public Builder(android.content.Context context, int i3, java.lang.String str) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 > 0);
            this.context = context;
            this.notificationId = i3;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new androidx.media3.ui.DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = androidx.media3.ui.R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = androidx.media3.ui.R.drawable.exo_notification_next;
        }
    }
}
