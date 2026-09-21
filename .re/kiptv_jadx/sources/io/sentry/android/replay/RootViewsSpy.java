package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/sentry/android/replay/RootViewsSpy;", "Ljava/io/Closeable;", "<init>", "()V", "Lh6/A;", "close", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/util/AutoClosableReentrantLock;", "viewListLock", "Lio/sentry/util/AutoClosableReentrantLock;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/sentry/android/replay/OnRootViewsChangedListener;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "delegatingViewList", "Ljava/util/ArrayList;", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RootViewsSpy implements java.io.Closeable, java.lang.AutoCloseable {
    private final java.util.ArrayList<android.view.View> delegatingViewList;
    private final java.util.concurrent.atomic.AtomicBoolean isClosed;
    private final java.util.concurrent.CopyOnWriteArrayList<io.sentry.android.replay.OnRootViewsChangedListener> listeners;
    private final io.sentry.util.AutoClosableReentrantLock viewListLock;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.sentry.android.replay.RootViewsSpy.Companion INSTANCE = new io.sentry.android.replay.RootViewsSpy.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lio/sentry/android/replay/RootViewsSpy$Companion;", "", "()V", "install", "Lio/sentry/android/replay/RootViewsSpy;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void install$lambda$1$lambda$0(io.sentry.android.replay.RootViewsSpy this_apply) {
            kotlin.jvm.internal.m.e(this_apply, "$this_apply");
            if (this_apply.isClosed.get()) {
                return;
            }
            io.sentry.android.replay.WindowManagerSpy.INSTANCE.swapWindowManagerGlobalMViews(new io.sentry.android.replay.RootViewsSpy$Companion$install$1$1$1(this_apply));
        }

        public final io.sentry.android.replay.RootViewsSpy install() {
            io.sentry.android.replay.RootViewsSpy rootViewsSpy = new io.sentry.android.replay.RootViewsSpy(null);
            new android.os.Handler(android.os.Looper.getMainLooper()).postAtFrontOfQueue(new D1.RunnableC0239y(20, rootViewsSpy));
            return rootViewsSpy;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RootViewsSpy(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed.set(true);
        this.listeners.clear();
    }

    public final java.util.concurrent.CopyOnWriteArrayList<io.sentry.android.replay.OnRootViewsChangedListener> getListeners() {
        return this.listeners;
    }

    private RootViewsSpy() {
        this.isClosed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.viewListLock = new io.sentry.util.AutoClosableReentrantLock();
        this.listeners = new java.util.concurrent.CopyOnWriteArrayList<io.sentry.android.replay.OnRootViewsChangedListener>() { // from class: io.sentry.android.replay.RootViewsSpy$listeners$1
            public /* bridge */ boolean contains(io.sentry.android.replay.OnRootViewsChangedListener onRootViewsChangedListener) {
                return super.contains((java.lang.Object) onRootViewsChangedListener);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ int indexOf(io.sentry.android.replay.OnRootViewsChangedListener onRootViewsChangedListener) {
                return super.indexOf((java.lang.Object) onRootViewsChangedListener);
            }

            public /* bridge */ int lastIndexOf(io.sentry.android.replay.OnRootViewsChangedListener onRootViewsChangedListener) {
                return super.lastIndexOf((java.lang.Object) onRootViewsChangedListener);
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
            public final /* bridge */ io.sentry.android.replay.OnRootViewsChangedListener remove(int i3) {
                return removeAt(i3);
            }

            public /* bridge */ io.sentry.android.replay.OnRootViewsChangedListener removeAt(int i3) {
                return remove(i3);
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public boolean add(io.sentry.android.replay.OnRootViewsChangedListener element) {
                io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.this$0.viewListLock.acquire();
                try {
                    for (android.view.View view : this.this$0.delegatingViewList) {
                        if (element != null) {
                            element.onRootViewsChanged(view, true);
                        }
                    }
                    com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                    return super.add(element);
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                        throw th2;
                    }
                }
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public final /* bridge */ boolean contains(java.lang.Object obj) {
                if (obj == null ? true : obj instanceof io.sentry.android.replay.OnRootViewsChangedListener) {
                    return contains((io.sentry.android.replay.OnRootViewsChangedListener) obj);
                }
                return false;
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
            public final /* bridge */ int indexOf(java.lang.Object obj) {
                if (obj == null ? true : obj instanceof io.sentry.android.replay.OnRootViewsChangedListener) {
                    return indexOf((io.sentry.android.replay.OnRootViewsChangedListener) obj);
                }
                return -1;
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
            public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
                if (obj == null ? true : obj instanceof io.sentry.android.replay.OnRootViewsChangedListener) {
                    return lastIndexOf((io.sentry.android.replay.OnRootViewsChangedListener) obj);
                }
                return -1;
            }

            public /* bridge */ boolean remove(io.sentry.android.replay.OnRootViewsChangedListener onRootViewsChangedListener) {
                return super.remove((java.lang.Object) onRootViewsChangedListener);
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            public final /* bridge */ boolean remove(java.lang.Object obj) {
                if (obj == null ? true : obj instanceof io.sentry.android.replay.OnRootViewsChangedListener) {
                    return remove((io.sentry.android.replay.OnRootViewsChangedListener) obj);
                }
                return false;
            }
        };
        this.delegatingViewList = new java.util.ArrayList<android.view.View>() { // from class: io.sentry.android.replay.RootViewsSpy$delegatingViewList$1
            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean addAll(java.util.Collection<? extends android.view.View> elements) {
                kotlin.jvm.internal.m.e(elements, "elements");
                for (io.sentry.android.replay.OnRootViewsChangedListener onRootViewsChangedListener : this.this$0.getListeners()) {
                    java.util.Iterator<T> it = elements.iterator();
                    while (it.hasNext()) {
                        onRootViewsChangedListener.onRootViewsChanged((android.view.View) it.next(), true);
                    }
                }
                return super.addAll(elements);
            }

            public /* bridge */ boolean contains(android.view.View view) {
                return super.contains((java.lang.Object) view);
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ int indexOf(android.view.View view) {
                return super.indexOf((java.lang.Object) view);
            }

            public /* bridge */ int lastIndexOf(android.view.View view) {
                return super.lastIndexOf((java.lang.Object) view);
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ android.view.View remove(int i3) {
                return removeAt(i3);
            }

            public android.view.View removeAt(int index) {
                java.lang.Object objRemove = super.remove(index);
                kotlin.jvm.internal.m.d(objRemove, "super.removeAt(index)");
                android.view.View view = (android.view.View) objRemove;
                java.util.Iterator<T> it = this.this$0.getListeners().iterator();
                while (it.hasNext()) {
                    ((io.sentry.android.replay.OnRootViewsChangedListener) it.next()).onRootViewsChanged(view, false);
                }
                return view;
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean add(android.view.View element) {
                kotlin.jvm.internal.m.e(element, "element");
                java.util.Iterator<T> it = this.this$0.getListeners().iterator();
                while (it.hasNext()) {
                    ((io.sentry.android.replay.OnRootViewsChangedListener) it.next()).onRootViewsChanged(element, true);
                }
                return super.add(element);
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(java.lang.Object obj) {
                if (obj instanceof android.view.View) {
                    return contains((android.view.View) obj);
                }
                return false;
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ int indexOf(java.lang.Object obj) {
                if (obj instanceof android.view.View) {
                    return indexOf((android.view.View) obj);
                }
                return -1;
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
                if (obj instanceof android.view.View) {
                    return lastIndexOf((android.view.View) obj);
                }
                return -1;
            }

            public /* bridge */ boolean remove(android.view.View view) {
                return super.remove((java.lang.Object) view);
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean remove(java.lang.Object obj) {
                if (obj instanceof android.view.View) {
                    return remove((android.view.View) obj);
                }
                return false;
            }
        };
    }
}
