package io.ktor.http.cio.internals;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.http.b;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.protocol.OperatingSystem;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p011b1.y;
import p078i6.w;
import p194x6.j;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0000\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0018\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006JS\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree;", "", "T", "Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "root", "<init>", "(Lio/ktor/http/cio/internals/AsciiCharTree$Node;)V", "", "sequence", "", "fromIdx", TtmlNode.END, "", "lowerCase", "Lkotlin/Function2;", "", "stopPredicate", "", "search", "(Ljava/lang/CharSequence;IIZLx6/m;)Ljava/util/List;", "Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "getRoot", "()Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "Companion", "Node", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AsciiCharTree<T> {

    public static final Companion INSTANCE = new Companion(null);
    private final Node<T> root;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jy\u0010\u0013\u001a\u00020\u0012\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016\"\b\b\u0001\u0010\u0004*\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0004\b\u0013\u0010\u0017JY\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree$Companion;", "", "<init>", "()V", "T", "", "Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "resultList", "", "from", "", "maxLength", "idx", "Lkotlin/Function1;", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "Lkotlin/Function2;", "", "charAt", "Lh6/A;", OperatingSystem.JsonKeys.BUILD, "(Ljava/util/List;Ljava/util/List;IILx6/j;Lx6/m;)V", "", "Lio/ktor/http/cio/internals/AsciiCharTree;", "(Ljava/util/List;)Lio/ktor/http/cio/internals/AsciiCharTree;", "(Ljava/util/List;Lx6/j;Lx6/m;)Lio/ktor/http/cio/internals/AsciiCharTree;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public static final int build$lambda$0(CharSequence it) {
            m.e(it, "it");
            return it.length();
        }

        public static final char build$lambda$1(CharSequence s9, int i3) {
            m.e(s9, "s");
            return s9.charAt(i3);
        }

        public final <T extends CharSequence> AsciiCharTree<T> build(List<? extends T> from) {
            m.e(from, "from");
            return build(from, new b(7), new y(19));
        }

        private Companion() {
        }

        public final <T> AsciiCharTree<T> build(List<? extends T> from, j length, p194x6.m charAt) {
            T t9;
            m.e(from, "from");
            m.e(length, "length");
            m.e(charAt, "charAt");
            Iterator<T> it = from.iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    Comparable comparable = (Comparable) length.invoke(next);
                    do {
                        T next2 = it.next();
                        Comparable comparable2 = (Comparable) length.invoke(next2);
                        if (comparable.compareTo(comparable2) < 0) {
                            next = next2;
                            comparable = comparable2;
                        }
                    } while (it.hasNext());
                }
                t9 = next;
            } else {
                t9 = null;
            }
            if (t9 == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            int iIntValue = ((Number) length.invoke(t9)).intValue();
            if (!from.isEmpty()) {
                Iterator<T> it2 = from.iterator();
                while (it2.hasNext()) {
                    if (((Number) length.invoke(it2.next())).intValue() == 0) {
                        throw new IllegalArgumentException("There should be no empty entries");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            build(arrayList, from, iIntValue, 0, length, charAt);
            arrayList.trimToSize();
            return new AsciiCharTree<>(new Node((char) 0, w.f23205h, arrayList));
        }

        private final <T> void build(List<Node<T>> resultList, List<? extends T> from, int maxLength, int idx, j length, p194x6.m charAt) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t9 : from) {
                Character ch = (Character) charAt.invoke(t9, Integer.valueOf(idx));
                ch.charValue();
                Object arrayList = linkedHashMap.get(ch);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(ch, arrayList);
                }
                ((List) arrayList).add(t9);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char cCharValue = ((Character) entry.getKey()).charValue();
                List list = (List) entry.getValue();
                int i3 = idx + 1;
                ArrayList arrayList2 = new ArrayList();
                Companion companion = AsciiCharTree.INSTANCE;
                ArrayList arrayList3 = new ArrayList();
                for (T t10 : list) {
                    if (((Number) length.invoke(t10)).intValue() > i3) {
                        arrayList3.add(t10);
                    }
                }
                companion.build(arrayList2, arrayList3, maxLength, i3, length, charAt);
                arrayList2.trimToSize();
                ArrayList arrayList4 = new ArrayList();
                for (T t11 : list) {
                    if (((Number) length.invoke(t11)).intValue() == i3) {
                        arrayList4.add(t11);
                    }
                }
                resultList.add(new Node<>(cCharValue, arrayList4, arrayList2));
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000fR%\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "T", "", "", "ch", "", "exact", ViewHierarchyNode.JsonKeys.CHILDREN, "<init>", "(CLjava/util/List;Ljava/util/List;)V", "C", "getCh", "()C", "Ljava/util/List;", "getExact", "()Ljava/util/List;", "getChildren", "", "array", "[Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "getArray", "()[Lio/ktor/http/cio/internals/AsciiCharTree$Node;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Node<T> {
        private final Node<T>[] array;
        private final char ch;
        private final List<Node<T>> children;
        private final List<T> exact;

        public Node(char c9, List<? extends T> exact, List<Node<T>> children) {
            m.e(exact, "exact");
            m.e(children, "children");
            this.ch = c9;
            this.exact = exact;
            this.children = children;
            Node<T>[] nodeArr = new Node[256];
            for (int i3 = 0; i3 < 256; i3++) {
                Iterator<T> it = this.children.iterator();
                Node<T> node = null;
                boolean z6 = false;
                Node<T> node2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (!z6) {
                            break;
                        }
                        node = node2;
                        break;
                    } else {
                        T next = it.next();
                        if (((Node) next).ch == i3) {
                            if (z6) {
                                break;
                            }
                            z6 = true;
                            node2 = next;
                        }
                    }
                }
                nodeArr[i3] = node;
            }
            this.array = nodeArr;
        }

        public final Node<T>[] getArray() {
            return this.array;
        }

        public final char getCh() {
            return this.ch;
        }

        public final List<Node<T>> getChildren() {
            return this.children;
        }

        public final List<T> getExact() {
            return this.exact;
        }
    }

    public AsciiCharTree(Node<T> root) {
        m.e(root, "root");
        this.root = root;
    }

    public static List search$default(AsciiCharTree asciiCharTree, CharSequence charSequence, int i3, int i9, boolean z6, p194x6.m mVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        return asciiCharTree.search(charSequence, i3, i9, z6, mVar);
    }

    public final Node<T> getRoot() {
        return this.root;
    }

    public final List<T> search(CharSequence sequence, int fromIdx, int end, boolean lowerCase, p194x6.m stopPredicate) {
        m.e(sequence, "sequence");
        m.e(stopPredicate, "stopPredicate");
        if (sequence.length() == 0) {
            throw new IllegalArgumentException("Couldn't search in char tree for empty string");
        }
        Node<T> node = this.root;
        while (fromIdx < end) {
            char cCharAt = sequence.charAt(fromIdx);
            if (((Boolean) stopPredicate.invoke(Character.valueOf(cCharAt), Integer.valueOf(cCharAt))).booleanValue()) {
                break;
            }
            Node<T> node2 = node.getArray()[cCharAt];
            if (node2 == null) {
                node = lowerCase ? node.getArray()[Character.toLowerCase(cCharAt)] : null;
                if (node == null) {
                    return w.f23205h;
                }
            } else {
                node = node2;
            }
            fromIdx++;
        }
        return node.getExact();
    }
}
