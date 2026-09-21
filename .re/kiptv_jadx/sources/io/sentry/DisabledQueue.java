package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class DisabledQueue<E> extends java.util.AbstractCollection<E> implements java.util.Queue<E>, java.io.Serializable {
    private static final long serialVersionUID = -8423413834657610417L;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e6) {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
    }

    @Override // java.util.Queue
    public E element() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new java.util.Iterator<E>() { // from class: io.sentry.DisabledQueue.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public E next() {
                throw new java.util.NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.IllegalStateException();
            }
        };
    }

    @Override // java.util.Queue
    public boolean offer(E e6) {
        return false;
    }

    @Override // java.util.Queue
    public E peek() {
        return null;
    }

    @Override // java.util.Queue
    public E poll() {
        return null;
    }

    @Override // java.util.Queue
    public E remove() {
        throw new java.util.NoSuchElementException("queue is disabled");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return 0;
    }
}
