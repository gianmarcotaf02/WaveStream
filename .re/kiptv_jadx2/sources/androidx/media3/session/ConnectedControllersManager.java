package androidx.media3.session;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.Util;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicBoolean;
import p076i4.AbstractC2186b0;
import p136q.C2661e;

final class ConnectedControllersManager<T> {
    private final C2661e controllerInfoMap = new C2661e(0);
    private final C2661e controllerRecords = new C2661e(0);
    private final Object lock = new Object();
    private final WeakReference<MediaSessionImpl> sessionImpl;

    public interface AsyncCommand {
        com.google.common.util.concurrent.J run();
    }

    public static final class ConnectedControllerRecord<T> {
        public boolean commandQueueIsFlushing;
        public final T controllerKey;
        public PlaybackException playbackException;
        public Player.Commands playerCommands;
        public Player.Commands playerCommandsBeforePlaybackException;
        public PlayerInfo playerInfoForPlaybackException;
        public final SequencedFutureManager sequencedFutureManager;
        public SessionCommands sessionCommands;
        public final Deque<AsyncCommand> commandQueue = new ArrayDeque();
        public Player.Commands commandQueuePlayerCommands = Player.Commands.EMPTY;

        public ConnectedControllerRecord(T t9, SequencedFutureManager sequencedFutureManager, SessionCommands sessionCommands, Player.Commands commands) {
            this.controllerKey = t9;
            this.sequencedFutureManager = sequencedFutureManager;
            this.sessionCommands = sessionCommands;
            this.playerCommands = commands;
        }
    }

    public ConnectedControllersManager(MediaSessionImpl mediaSessionImpl) {
        this.sessionImpl = new WeakReference<>(mediaSessionImpl);
    }

    public com.google.common.util.concurrent.J lambda$flushCommandQueue$1(MediaSession.ControllerInfo controllerInfo, Player.Commands commands) {
        MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl != null) {
            mediaSessionImpl.onPlayerInteractionFinishedOnHandler(controllerInfo, commands);
        }
        return com.google.common.util.concurrent.F.f19407i;
    }

    public void lambda$flushCommandQueue$2(AtomicBoolean atomicBoolean, ConnectedControllerRecord connectedControllerRecord, AtomicBoolean atomicBoolean2) {
        synchronized (this.lock) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    flushCommandQueue(connectedControllerRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$flushCommandQueue$3(AsyncCommand asyncCommand, AtomicBoolean atomicBoolean, ConnectedControllerRecord connectedControllerRecord, AtomicBoolean atomicBoolean2) {
        asyncCommand.run().addListener(new RunnableC1573d(this, atomicBoolean, connectedControllerRecord, atomicBoolean2), com.google.common.util.concurrent.z.f19464h);
    }

    public static void lambda$removeController$0(MediaSessionImpl mediaSessionImpl, MediaSession.ControllerInfo controllerInfo) {
        if (mediaSessionImpl.isReleased()) {
            return;
        }
        mediaSessionImpl.onDisconnectedOnHandler(controllerInfo);
    }

    public void addController(T t9, MediaSession.ControllerInfo controllerInfo, SessionCommands sessionCommands, Player.Commands commands) {
        synchronized (this.lock) {
            try {
                MediaSession.ControllerInfo controller = getController(t9);
                if (controller == null) {
                    this.controllerInfoMap.put(t9, controllerInfo);
                    this.controllerRecords.put(controllerInfo, new ConnectedControllerRecord(t9, new SequencedFutureManager(), sessionCommands, commands));
                } else {
                    ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controller);
                    connectedControllerRecord.getClass();
                    connectedControllerRecord.sessionCommands = sessionCommands;
                    connectedControllerRecord.playerCommands = commands;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addToCommandQueue(MediaSession.ControllerInfo controllerInfo, int i3, AsyncCommand asyncCommand) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.commandQueuePlayerCommands = connectedControllerRecord.commandQueuePlayerCommands.buildUpon().add(i3).build();
                    connectedControllerRecord.commandQueue.add(asyncCommand);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void flushCommandQueue(final MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord<T> connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return;
                }
                final Player.Commands commands = connectedControllerRecord.commandQueuePlayerCommands;
                connectedControllerRecord.commandQueuePlayerCommands = Player.Commands.EMPTY;
                connectedControllerRecord.commandQueue.add(new AsyncCommand() {
                    @Override
                    public final com.google.common.util.concurrent.J run() {
                        return this.f16993a.lambda$flushCommandQueue$1(controllerInfo, commands);
                    }
                });
                if (connectedControllerRecord.commandQueueIsFlushing) {
                    return;
                }
                connectedControllerRecord.commandQueueIsFlushing = true;
                flushCommandQueue(connectedControllerRecord);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Player.Commands getAvailablePlayerCommands(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerCommands;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SessionCommands getAvailableSessionCommands(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.sessionCommands;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractC2186b0 getConnectedControllers() {
        AbstractC2186b0 abstractC2186b0U;
        synchronized (this.lock) {
            abstractC2186b0U = AbstractC2186b0.u(this.controllerInfoMap.values());
        }
        return abstractC2186b0U;
    }

    public MediaSession.ControllerInfo getController(T t9) {
        MediaSession.ControllerInfo controllerInfo;
        synchronized (this.lock) {
            controllerInfo = (MediaSession.ControllerInfo) this.controllerInfoMap.get(t9);
        }
        return controllerInfo;
    }

    public PlaybackException getPlaybackException(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playbackException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Player.Commands getPlayerCommandsBeforePlaybackException(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerCommandsBeforePlaybackException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PlayerInfo getPlayerInfoForPlaybackException(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord == null) {
                    return null;
                }
                return connectedControllerRecord.playerInfoForPlaybackException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SequencedFutureManager getSequencedFutureManager(MediaSession.ControllerInfo controllerInfo) {
        ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sequencedFutureManager;
        }
        return null;
    }

    public boolean isConnected(MediaSession.ControllerInfo controllerInfo) {
        boolean z6;
        synchronized (this.lock) {
            z6 = this.controllerRecords.get(controllerInfo) != null;
        }
        return z6;
    }

    public boolean isPlayerCommandAvailable(MediaSession.ControllerInfo controllerInfo, int i3) {
        ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
        }
        MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        return connectedControllerRecord != null && connectedControllerRecord.playerCommands.contains(i3) && mediaSessionImpl != null && mediaSessionImpl.getPlayerWrapper().getAvailableCommands().contains(i3);
    }

    public boolean isSessionCommandAvailable(MediaSession.ControllerInfo controllerInfo, SessionCommand sessionCommand) {
        ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sessionCommands.contains(sessionCommand) || CommandButton.isPredefinedCustomCommandButtonCode(sessionCommand.customAction);
        }
        return false;
    }

    public void removeController(T t9) {
        MediaSession.ControllerInfo controller = getController(t9);
        if (controller != null) {
            removeController(controller);
        }
    }

    public void resetPlaybackException(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.playbackException = null;
                    connectedControllerRecord.playerCommandsBeforePlaybackException = null;
                    connectedControllerRecord.playerInfoForPlaybackException = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPlaybackException(MediaSession.ControllerInfo controllerInfo, PlaybackException playbackException, Player.Commands commands) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.playbackException = playbackException;
                    connectedControllerRecord.playerCommandsBeforePlaybackException = commands;
                    connectedControllerRecord.playerInfoForPlaybackException = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPlayerInfoForPlaybackException(MediaSession.ControllerInfo controllerInfo, PlayerInfo playerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.playbackException.getClass();
                    connectedControllerRecord.playerInfoForPlaybackException = playerInfo;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateCommandsFromSession(MediaSession.ControllerInfo controllerInfo, SessionCommands sessionCommands, Player.Commands commands) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
                if (connectedControllerRecord != null) {
                    connectedControllerRecord.sessionCommands = sessionCommands;
                    if (connectedControllerRecord.playerCommandsBeforePlaybackException != null) {
                        connectedControllerRecord.playerCommandsBeforePlaybackException = commands;
                    } else {
                        connectedControllerRecord.playerCommands = commands;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeController(MediaSession.ControllerInfo controllerInfo) {
        synchronized (this.lock) {
            try {
                ConnectedControllerRecord connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.remove(controllerInfo);
                if (connectedControllerRecord == null) {
                    return;
                }
                this.controllerInfoMap.remove(connectedControllerRecord.controllerKey);
                connectedControllerRecord.sequencedFutureManager.release();
                MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
                if (mediaSessionImpl == null || mediaSessionImpl.isReleased()) {
                    return;
                }
                Util.postOrRun(mediaSessionImpl.getApplicationHandler(), new RunnableC1575e(mediaSessionImpl, controllerInfo, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SequencedFutureManager getSequencedFutureManager(T t9) {
        ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            try {
                MediaSession.ControllerInfo controller = getController(t9);
                connectedControllerRecord = controller != null ? (ConnectedControllerRecord) this.controllerRecords.get(controller) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (connectedControllerRecord != null) {
            return connectedControllerRecord.sequencedFutureManager;
        }
        return null;
    }

    public boolean isSessionCommandAvailable(MediaSession.ControllerInfo controllerInfo, int i3) {
        ConnectedControllerRecord connectedControllerRecord;
        synchronized (this.lock) {
            connectedControllerRecord = (ConnectedControllerRecord) this.controllerRecords.get(controllerInfo);
        }
        return connectedControllerRecord != null && connectedControllerRecord.sessionCommands.contains(i3);
    }

    private void flushCommandQueue(ConnectedControllerRecord<T> connectedControllerRecord) {
        MediaSessionImpl mediaSessionImpl = this.sessionImpl.get();
        if (mediaSessionImpl == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            AsyncCommand asyncCommandPoll = connectedControllerRecord.commandQueue.poll();
            if (asyncCommandPoll == null) {
                connectedControllerRecord.commandQueueIsFlushing = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            ConnectedControllerRecord<T> connectedControllerRecord2 = connectedControllerRecord;
            Util.postOrRun(mediaSessionImpl.getApplicationHandler(), mediaSessionImpl.callWithControllerForCurrentRequestSet(getController(connectedControllerRecord.controllerKey), new RunnableC1569b(this, asyncCommandPoll, atomicBoolean2, connectedControllerRecord2, atomicBoolean)));
            atomicBoolean2.set(false);
            connectedControllerRecord = connectedControllerRecord2;
        }
    }
}
