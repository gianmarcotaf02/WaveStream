package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class DefaultSuitableOutputChecker implements androidx.media3.exoplayer.SuitableOutputChecker {
    private final androidx.media3.exoplayer.SuitableOutputChecker impl;

    public static final class ImplApi23 implements androidx.media3.exoplayer.SuitableOutputChecker {
        private android.media.AudioDeviceCallback audioDeviceCallback;
        private android.media.AudioManager audioManager;
        private androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> isSuitableForPlaybackState;

        private ImplApi23() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean hasSupportedAudioOutput() {
            android.media.AudioManager audioManager = this.audioManager;
            audioManager.getClass();
            for (android.media.AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i3 = android.os.Build.VERSION.SDK_INT;
                if (i3 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i3 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i3 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i3 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$disable$2() {
            android.media.AudioManager audioManager = this.audioManager;
            if (audioManager != null) {
                android.media.AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
                audioDeviceCallback.getClass();
                audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$enable$0(androidx.media3.exoplayer.SuitableOutputChecker.Callback callback, java.lang.Boolean bool, java.lang.Boolean bool2) {
            callback.onSelectedOutputSuitabilityChanged(bool2.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$enable$1(android.content.Context context) {
            android.media.AudioManager audioManager;
            this.isSuitableForPlaybackState.getClass();
            if (androidx.media3.common.util.Util.isWear(context) && (audioManager = (android.media.AudioManager) context.getSystemService("audio")) != null) {
                this.audioManager = audioManager;
                android.media.AudioDeviceCallback audioDeviceCallback = new android.media.AudioDeviceCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.1
                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                        androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(java.lang.Boolean.valueOf(androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.this.hasSupportedAudioOutput()));
                    }

                    @Override // android.media.AudioDeviceCallback
                    public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
                        androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.this.isSuitableForPlaybackState.setStateInBackground(java.lang.Boolean.valueOf(androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.this.hasSupportedAudioOutput()));
                    }
                };
                this.audioDeviceCallback = audioDeviceCallback;
                android.os.Looper looperMyLooper = android.os.Looper.myLooper();
                looperMyLooper.getClass();
                audioManager.registerAudioDeviceCallback(audioDeviceCallback, new android.os.Handler(looperMyLooper));
                this.isSuitableForPlaybackState.setStateInBackground(java.lang.Boolean.valueOf(hasSupportedAudioOutput()));
            }
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            backgroundThreadStateHandler.getClass();
            backgroundThreadStateHandler.runInBackground(new androidx.media3.exoplayer.RunnableC1546a(0, this));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void enable(androidx.media3.exoplayer.SuitableOutputChecker.Callback callback, android.content.Context context, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.util.Clock clock) {
            androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> backgroundThreadStateHandler = new androidx.media3.common.util.BackgroundThreadStateHandler<>(java.lang.Boolean.TRUE, looper2, looper, clock, new androidx.media3.exoplayer.C1547b(callback, 0));
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new androidx.media3.exoplayer.RunnableC1548c(this, context, 0));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }
    }

    public static final class ImplApi35 implements androidx.media3.exoplayer.SuitableOutputChecker {
        private static final android.media.RouteDiscoveryPreference EMPTY_DISCOVERY_PREFERENCE;
        private android.media.MediaRouter2$ControllerCallback controllerCallback;
        private androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> isSuitableForPlaybackState;
        private android.media.MediaRouter2$RouteCallback routeCallback;
        private android.media.MediaRouter2 router;

        static {
            D1.A0.o();
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            EMPTY_DISCOVERY_PREFERENCE = D1.A0.i(p076i4.S0.f22832l).build();
        }

        private ImplApi35() {
        }

        private static boolean isRouteSuitableForMediaPlayback(android.media.MediaRoute2Info mediaRoute2Info, int i3, boolean z6) {
            int suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            if (suitabilityStatus == 1) {
                if ((i3 != 1 && i3 != 2) || !z6) {
                    return false;
                }
            } else if (suitabilityStatus != 0) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$disable$2() {
            android.media.MediaRouter2 mediaRouter2 = this.router;
            mediaRouter2.getClass();
            android.media.MediaRouter2 mediaRouter2H = D1.A0.h(mediaRouter2);
            android.media.MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = this.controllerCallback;
            mediaRouter2$ControllerCallback.getClass();
            mediaRouter2H.unregisterControllerCallback(D1.A0.d(mediaRouter2$ControllerCallback));
            this.controllerCallback = null;
            android.media.MediaRouter2 mediaRouter3 = this.router;
            android.media.MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.routeCallback;
            mediaRouter2$RouteCallback.getClass();
            mediaRouter3.unregisterRouteCallback(D1.A0.e(mediaRouter2$RouteCallback));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$enable$0(androidx.media3.exoplayer.SuitableOutputChecker.Callback callback, java.lang.Boolean bool, java.lang.Boolean bool2) {
            callback.onSelectedOutputSuitabilityChanged(bool2.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$enable$1(android.content.Context context) {
            this.isSuitableForPlaybackState.getClass();
            this.router = android.media.MediaRouter2.getInstance(context);
            this.routeCallback = new android.media.MediaRouter2$RouteCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.1
            };
            androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            java.util.Objects.requireNonNull(backgroundThreadStateHandler);
            androidx.media3.exoplayer.ExecutorC1550e executorC1550e = new androidx.media3.exoplayer.ExecutorC1550e(0, backgroundThreadStateHandler);
            this.router.registerRouteCallback(executorC1550e, this.routeCallback, EMPTY_DISCOVERY_PREFERENCE);
            android.media.MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = new android.media.MediaRouter2$ControllerCallback() { // from class: androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.2
                public void onControllerUpdated(android.media.MediaRouter2.RoutingController routingController) {
                    androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.this.isSuitableForPlaybackState.setStateInBackground(java.lang.Boolean.valueOf(androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.isSelectedOutputSuitableForPlayback(androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.this.router)));
                }
            };
            this.controllerCallback = mediaRouter2$ControllerCallback;
            this.router.registerControllerCallback(executorC1550e, mediaRouter2$ControllerCallback);
            this.isSuitableForPlaybackState.setStateInBackground(java.lang.Boolean.valueOf(isSelectedOutputSuitableForPlayback(this.router)));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void disable() {
            androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            backgroundThreadStateHandler.getClass();
            backgroundThreadStateHandler.runInBackground(new androidx.media3.exoplayer.RunnableC1546a(1, this));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public void enable(androidx.media3.exoplayer.SuitableOutputChecker.Callback callback, android.content.Context context, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.util.Clock clock) {
            androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> backgroundThreadStateHandler = new androidx.media3.common.util.BackgroundThreadStateHandler<>(java.lang.Boolean.TRUE, looper2, looper, clock, new androidx.media3.exoplayer.C1547b(callback, 1));
            this.isSuitableForPlaybackState = backgroundThreadStateHandler;
            backgroundThreadStateHandler.runInBackground(new androidx.media3.exoplayer.RunnableC1548c(this, context, 1));
        }

        @Override // androidx.media3.exoplayer.SuitableOutputChecker
        public boolean isSelectedOutputSuitableForPlayback() {
            androidx.media3.common.util.BackgroundThreadStateHandler<java.lang.Boolean> backgroundThreadStateHandler = this.isSuitableForPlaybackState;
            if (backgroundThreadStateHandler == null) {
                return true;
            }
            return backgroundThreadStateHandler.get().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSelectedOutputSuitableForPlayback(android.media.MediaRouter2 mediaRouter2) {
            mediaRouter2.getClass();
            int transferReason = D1.A0.h(mediaRouter2).getSystemController().getRoutingSessionInfo().getTransferReason();
            boolean zWasTransferInitiatedBySelf = mediaRouter2.getSystemController().wasTransferInitiatedBySelf();
            java.util.Iterator it = mediaRouter2.getSystemController().getSelectedRoutes().iterator();
            while (it.hasNext()) {
                if (isRouteSuitableForMediaPlayback(D1.A0.c(it.next()), transferReason, zWasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }
    }

    public DefaultSuitableOutputChecker() {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.impl = new androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35();
        } else {
            this.impl = new androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23();
        }
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void disable() {
        this.impl.disable();
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public void enable(androidx.media3.exoplayer.SuitableOutputChecker.Callback callback, android.content.Context context, android.os.Looper looper, android.os.Looper looper2, androidx.media3.common.util.Clock clock) {
        this.impl.enable(callback, context, looper, looper2, clock);
    }

    @Override // androidx.media3.exoplayer.SuitableOutputChecker
    public boolean isSelectedOutputSuitableForPlayback() {
        return this.impl.isSelectedOutputSuitableForPlayback();
    }
}
