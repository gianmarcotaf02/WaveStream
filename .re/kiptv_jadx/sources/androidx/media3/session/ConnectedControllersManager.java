package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class ConnectedControllersManager<T> {
    private final p136q.C2661e controllerInfoMap = new p136q.C2661e(0);
    private final p136q.C2661e controllerRecords = new p136q.C2661e(0);
    private final java.lang.Object lock = new java.lang.Object();
    private final java.lang.ref.WeakReference<androidx.media3.session.MediaSessionImpl> sessionImpl;

    public interface AsyncCommand {
        com.google.common.util.concurrent.J run();
    }

    public static final class ConnectedControllerRecord<T> {
        public boolean commandQueueIsFlushing;
        public final T controllerKey;
        public androidx.media3.common.PlaybackException playbackException;
        public androidx.media3.common.Player.Commands playerCommands;
        public androidx.media3.common.Player.Commands playerCommandsBeforePlaybackException;
        public androidx.media3.session.PlayerInfo playerInfoForPlaybackException;
        public final androidx.media3.session.SequencedFutureManager sequencedFutureManager;
        public androidx.media3.session.SessionCommands sessionCommands;
        public final java.util.Deque<androidx.media3.session.ConnectedControllersManager.AsyncCommand> commandQueue = new java.util.ArrayDeque();
        public androidx.media3.common.Player.Commands commandQueuePlayerCommands = androidx.media3.common.Player.Commands.EMPTY;

        public ConnectedControllerRecord(T t9, androidx.media3.session.SequencedFutureManager sequencedFutureManager, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
            this.controllerKey = t9;
            this.sequencedFutureManager = sequencedFutureManager;
            this.sessionCommands = sessionCommands;
            this.playerCommands = commands;
        }
    }

    public ConnectedControllersManager(androidx.media3.session.MediaSessionImpl mediaSessionImpl) {
        this.sessionImpl = new java.lang.ref.WeakReference<>(mediaSessionImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.util.concurrent.J lambda$flushCommandQueue$1(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.Player.Commands commands) {
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl != null) {
            mediaSessionImpl.onPlayerInteractionFinishedOnHandler(controllerInfo, commands);
        }
        return com.google.common.util.concurrent.F.f19407i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flushCommandQueue$2(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2) {
        synchronized (this.lock) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    flushCommandQueue(connectedControllerRecord);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flushCommandQueue$3(androidx.media3.session.ConnectedControllersManager.AsyncCommand asyncCommand, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2) {
        asyncCommand.run().addListener(new androidx.media3.session.RunnableC1573d(this, atomicBoolean, connectedControllerRecord, atomicBoolean2), com.google.common.util.concurrent.z.f19464h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeController$0(androidx.media3.session.MediaSessionImpl mediaSessionImpl, androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        if (mediaSessionImpl.isReleased()) {
            return;
        }
        mediaSessionImpl.onDisconnectedOnHandler(controllerInfo);
    }

    public void addController(T t9, androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.MediaSession.ControllerInfo controller = getController(t9);
                if (controller == null) {
                    this.controllerInfoMap.put(t9, controllerInfo);
                    this.controllerRecords.put(controllerInfo, new androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord(t9, new androidx.media3.session.SequencedFutureManager(), sessionCommands, commands));
                } else {
                    androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controller);
                    connectedControllerRecord.getClass();
                    connectedControllerRecord.sessionCommands = sessionCommands;
                    connectedControllerRecord.playerCommands = commands;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void addToCommandQueue(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3, androidx.media3.session.ConnectedControllersManager.AsyncCommand asyncCommand) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.commandQueuePlayerCommands = connectedControllerRecord.commandQueuePlayerCommands.buildUpon().add(i3).build();
                    connectedControllerRecord.commandQueue.add(asyncCommand);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void flushCommandQueue(final androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return;
                }
                final androidx.media3.common.Player.Commands commands = connectedControllerRecord.commandQueuePlayerCommands;
                connectedControllerRecord.commandQueuePlayerCommands = androidx.media3.common.Player.Commands.EMPTY;
                connectedControllerRecord.commandQueue.add(new androidx.media3.session.ConnectedControllersManager.AsyncCommand() { // from class: androidx.media3.session.c
                    @Override // androidx.media3.session.ConnectedControllersManager.AsyncCommand
                    public final com.google.common.util.concurrent.J run() {
                        return this.f16993a.lambda$flushCommandQueue$1(controllerInfo, commands);
                    }
                });
                if (connectedControllerRecord.commandQueueIsFlushing) {
                    return;
                }
                connectedControllerRecord.commandQueueIsFlushing = true;
                flushCommandQueue(connectedControllerRecord);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public androidx.media3.common.Player.Commands getAvailablePlayerCommands(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerCommands;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public androidx.media3.session.SessionCommands getAvailableSessionCommands(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.sessionCommands;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public p076i4.AbstractC2186b0 getConnectedControllers() {
        p076i4.AbstractC2186b0 abstractC2186b0U;
        synchronized (this.lock) {
            abstractC2186b0U = p076i4.AbstractC2186b0.u(this.controllerInfoMap.values());
        }
        return abstractC2186b0U;
    }

    public androidx.media3.session.MediaSession.ControllerInfo getController(T t9) {
        androidx.media3.session.MediaSession.ControllerInfo controllerInfo;
        synchronized (this.lock) {
            controllerInfo = (androidx.media3.session.MediaSession.ControllerInfo) this.controllerInfoMap.get(t9);
        }
        return controllerInfo;
    }

    public androidx.media3.common.PlaybackException getPlaybackException(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playbackException;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public androidx.media3.common.Player.Commands getPlayerCommandsBeforePlaybackException(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerCommandsBeforePlaybackException;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public androidx.media3.session.PlayerInfo getPlayerInfoForPlaybackException(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerInfoForPlaybackException;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public androidx.media3.session.SequencedFutureManager getSequencedFutureManager(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sequencedFutureManager;
        }
        return null;
    }

    public boolean isConnected(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        boolean z6;
        synchronized (this.lock) {
            z6 = this.controllerRecords.get(controllerInfo) != null;
        }
        return z6;
    }

    public boolean isPlayerCommandAvailable(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
        }
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        return connectedControllerRecord != null && connectedControllerRecord.playerCommands.contains(i3) && mediaSessionImpl != null && mediaSessionImpl.getPlayerWrapper().getAvailableCommands().contains(i3);
    }

    public boolean isSessionCommandAvailable(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommand sessionCommand) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sessionCommands.contains(sessionCommand) || androidx.media3.session.CommandButton.isPredefinedCustomCommandButtonCode(sessionCommand.customAction);
        }
        return false;
    }

    public void removeController(T t9) {
        androidx.media3.session.MediaSession.ControllerInfo controller = getController(t9);
        if (controller != null) {
            removeController(controller);
        }
    }

    public void resetPlaybackException(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.playbackException = null;
                    connectedControllerRecord.playerCommandsBeforePlaybackException = null;
                    connectedControllerRecord.playerInfoForPlaybackException = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void setPlaybackException(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.common.PlaybackException playbackException, androidx.media3.common.Player.Commands commands) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.playbackException = playbackException;
                    connectedControllerRecord.playerCommandsBeforePlaybackException = commands;
                    connectedControllerRecord.playerInfoForPlaybackException = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void setPlayerInfoForPlaybackException(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.PlayerInfo playerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.playbackException.getClass();
                    connectedControllerRecord.playerInfoForPlaybackException = playerInfo;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void updateCommandsFromSession(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.sessionCommands = sessionCommands;
                    if (connectedControllerRecord.playerCommandsBeforePlaybackException != null) {
                        connectedControllerRecord.playerCommandsBeforePlaybackException = commands;
                    } else {
                        connectedControllerRecord.playerCommands = commands;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void removeController(androidx.media3.session.MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.remove(controllerInfo);
                if (connectedControllerRecord == null) {
                    return;
                }
                this.controllerInfoMap.remove(connectedControllerRecord.controllerKey);
                connectedControllerRecord.sequencedFutureManager.release();
                androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
                if (mediaSessionImpl == null || mediaSessionImpl.isReleased()) {
                    return;
                }
                androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new androidx.media3.session.RunnableC1575e(mediaSessionImpl, controllerInfo, 0));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public androidx.media3.session.SequencedFutureManager getSequencedFutureManager(T t9) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            try {
                androidx.media3.session.MediaSession.ControllerInfo controller = getController(t9);
                connectedControllerRecord = controller != null ? (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controller) : null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sequencedFutureManager;
        }
        return null;
    }

    public boolean isSessionCommandAvailable(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
        androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = (androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
        }
        return connectedControllerRecord != null && connectedControllerRecord.sessionCommands.contains(i3);
    }

    private void flushCommandQueue(androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord) {
        androidx.media3.session.MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl == null) {
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            androidx.media3.session.ConnectedControllersManager.AsyncCommand asyncCommandPoll = connectedControllerRecord.commandQueue.poll();
            if (asyncCommandPoll == null) {
                connectedControllerRecord.commandQueueIsFlushing = false;
                return;
            }
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(true);
            androidx.media3.session.ConnectedControllersManager.ConnectedControllerRecord<T> connectedControllerRecord2 = connectedControllerRecord;
            androidx.media3.common.util.Util.postOrRun(mediaSessionImpl.getApplicationHandler(), mediaSessionImpl.callWithControllerForCurrentRequestSet(getController(connectedControllerRecord.controllerKey), new androidx.media3.session.RunnableC1569b(this, asyncCommandPoll, atomicBoolean2, connectedControllerRecord2, atomicBoolean)));
            atomicBoolean2.set(false);
            connectedControllerRecord = connectedControllerRecord2;
        }
    }
}
