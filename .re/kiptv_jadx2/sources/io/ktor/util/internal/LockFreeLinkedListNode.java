package io.ktor.util.internal;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.LinkHeader;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001:\u0004NOPQB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\f\b\u0000\u0010\u0011*\u00060\u0000j\u0002`\u00042\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0019\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0004\u0012\u0004\u0012\u00020\u00070\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001b\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0004\u0012\u0004\u0012\u00020\u00070\u00172\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\"\u001a\u00020!2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u00042\u0006\u0010 \u001a\u00020\tH\u0001¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000e¢\u0006\u0004\b&\u0010\u0003J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00040,¢\u0006\u0004\b-\u0010.J\u001a\u0010/\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0011\u0018\u0001H\u0086\b¢\u0006\u0004\b/\u00100J1\u00101\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0001¢\u0006\u0004\b3\u0010\u0003J'\u00107\u001a\u00020\u000e2\n\u00104\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u0004H\u0000¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\u00020\u000e2\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b>\u0010\u0010J\u001b\u0010?\u001a\u00020\u000e2\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b?\u0010\u0010J\u0013\u0010@\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b@\u0010+J\u0013\u0010A\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\bA\u0010+J-\u0010E\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00042\n\u0010B\u001a\u00060\u0000j\u0002`\u00042\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bG\u0010%R\u0011\u0010\u001d\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bH\u00100R\u0015\u0010J\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\bI\u0010+R\u0011\u00104\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bK\u00100R\u0015\u0010M\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\bL\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "Lio/ktor/util/internal/Node;", "node", "Lkotlin/Function0;", "", "condition", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "addOneIfEmpty", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Z", "Lh6/A;", "addLast", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "addLastIf", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lx6/j;)Z", "addLastIfPrevAndIf", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lx6/j;Lkotlin/jvm/functions/Function0;)Z", LinkHeader.Rel.Next, "addNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Z", "condAdd", "", "tryCondAddNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;)I", "remove", "()Z", "helpRemove", "Lio/ktor/util/internal/AtomicDesc;", "describeRemove", "()Lio/ktor/util/internal/AtomicDesc;", "removeFirstOrNull", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "removeFirstIfIsInstanceOf", "()Ljava/lang/Object;", "removeFirstIfIsInstanceOfOrPeekIf", "(Lx6/j;)Ljava/lang/Object;", "helpDelete", "prev", "validateNode$ktor_utils", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "validateNode", "", "toString", "()Ljava/lang/String;", "Lio/ktor/util/internal/Removed;", "removed", "()Lio/ktor/util/internal/Removed;", "finishAdd", "finishRemove", "markPrev", "findHead", "_prev", "Lio/ktor/util/internal/OpDescriptor;", "op", "correctPrev", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "isRemoved", "getNext", "getNextNode", "nextNode", "getPrev", "getPrevNode", "prevNode", "CondAddOp", "AddLastDesc", "RemoveFirstDesc", "AbstractAtomicDesc", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class LockFreeLinkedListNode {
    static final AtomicReferenceFieldUpdater _next$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_next");
    static final AtomicReferenceFieldUpdater _prev$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "_prev");
    private static final AtomicReferenceFieldUpdater removedRef$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeLinkedListNode.class, Object.class, "removedRef");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object removedRef = null;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0016\u001a\u00020\u00152\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00152\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078$X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/AtomicDesc;", "<init>", "()V", "Lio/ktor/util/internal/OpDescriptor;", "op", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", LinkHeader.Rel.Next, "failure", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;", "", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "Lh6/A;", "finishOnSuccess", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/AtomicOp;", "prepare", "(Lio/ktor/util/internal/AtomicOp;)Ljava/lang/Object;", "complete", "(Lio/ktor/util/internal/AtomicOp;Ljava/lang/Object;)V", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "PrepareOp", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class AbstractAtomicDesc extends AtomicDesc {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc$PrepareOp;", "Lio/ktor/util/internal/OpDescriptor;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", LinkHeader.Rel.Next, "Lio/ktor/util/internal/AtomicOp;", "op", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "desc", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/AtomicOp;Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "", "affected", "perform", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class PrepareOp extends OpDescriptor {
            public final AbstractAtomicDesc desc;
            public final LockFreeLinkedListNode next;
            public final AtomicOp<LockFreeLinkedListNode> op;

            public PrepareOp(LockFreeLinkedListNode next, AtomicOp<? super LockFreeLinkedListNode> op, AbstractAtomicDesc desc) {
                m.e(next, "next");
                m.e(op, "op");
                m.e(desc, "desc");
                this.next = next;
                this.op = op;
                this.desc = desc;
            }

            @Override
            public Object perform(Object affected) {
                m.c(affected, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) affected;
                Object objOnPrepare = this.desc.onPrepare(lockFreeLinkedListNode, this.next);
                if (objOnPrepare == null) {
                    Object obj = this.op.isDecided() ? this.next : this.op;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, obj) && atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == this) {
                    }
                    return null;
                }
                if (objOnPrepare == LockFreeLinkedListKt.REMOVE_PREPARED) {
                    Removed removed = this.next.removed();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode._next$FU;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, this, removed)) {
                        if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) != this) {
                            return objOnPrepare;
                        }
                    }
                    lockFreeLinkedListNode.helpDelete();
                    return objOnPrepare;
                }
                this.op.tryDecide(objOnPrepare);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LockFreeLinkedListNode._next$FU;
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.next;
                while (!atomicReferenceFieldUpdater3.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2)) {
                    if (atomicReferenceFieldUpdater3.get(lockFreeLinkedListNode) != this) {
                        return objOnPrepare;
                    }
                }
                return objOnPrepare;
            }
        }

        @Override
        public final void complete(AtomicOp<?> op, Object failure) {
            m.e(op, "op");
            boolean z6 = failure == null;
            LockFreeLinkedListNode this$0 = getThis$0();
            if (this$0 == null) {
                if (z6) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            LockFreeLinkedListNode queue = getQueue();
            if (queue == null) {
                if (z6) {
                    throw new IllegalStateException("Check failed.");
                }
                return;
            }
            Object objUpdatedNext = z6 ? updatedNext(this$0, queue) : queue;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this$0, op, objUpdatedNext)) {
                if (atomicReferenceFieldUpdater.get(this$0) != op) {
                    return;
                }
            }
            if (z6) {
                finishOnSuccess(this$0, queue);
            }
        }

        public Object failure(LockFreeLinkedListNode affected, Object next) {
            m.e(affected, "affected");
            m.e(next, "next");
            return null;
        }

        public abstract void finishOnSuccess(LockFreeLinkedListNode affected, LockFreeLinkedListNode next);

        public abstract LockFreeLinkedListNode getThis$0();

        public abstract LockFreeLinkedListNode getQueue();

        public abstract Object onPrepare(LockFreeLinkedListNode affected, LockFreeLinkedListNode next);

        @Override
        public final Object prepare(AtomicOp<?> op) {
            m.e(op, "op");
            while (true) {
                LockFreeLinkedListNode lockFreeLinkedListNodeTakeAffectedNode = takeAffectedNode(op);
                Object obj = lockFreeLinkedListNodeTakeAffectedNode._next;
                if (obj == op || op.isDecided()) {
                    return null;
                }
                if (obj instanceof OpDescriptor) {
                    ((OpDescriptor) obj).perform(lockFreeLinkedListNodeTakeAffectedNode);
                } else {
                    Object objFailure = failure(lockFreeLinkedListNodeTakeAffectedNode, obj);
                    if (objFailure != null) {
                        return objFailure;
                    }
                    if (retry(lockFreeLinkedListNodeTakeAffectedNode, obj)) {
                        continue;
                    } else {
                        m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        PrepareOp prepareOp = new PrepareOp((LockFreeLinkedListNode) obj, op, this);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNodeTakeAffectedNode, obj, prepareOp)) {
                                Object objPerform = prepareOp.perform(lockFreeLinkedListNodeTakeAffectedNode);
                                if (objPerform == LockFreeLinkedListKt.REMOVE_PREPARED) {
                                    break;
                                }
                                return objPerform;
                            }
                        } while (atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeTakeAffectedNode) == obj);
                    }
                }
            }
        }

        public boolean retry(LockFreeLinkedListNode affected, Object next) {
            m.e(affected, "affected");
            m.e(next, "next");
            return false;
        }

        public LockFreeLinkedListNode takeAffectedNode(OpDescriptor op) {
            m.e(op, "op");
            LockFreeLinkedListNode this$0 = getThis$0();
            m.b(this$0);
            return this$0;
        }

        public abstract Object updatedNext(LockFreeLinkedListNode affected, LockFreeLinkedListNode next);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u0017\u001a\u00020\u00162\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\bR\u0018\u0010\u0005\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0006\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "queue", "node", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", LinkHeader.Rel.Next, "", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "Lh6/A;", "finishOnSuccess", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static class AddLastDesc<T extends LockFreeLinkedListNode> extends AbstractAtomicDesc {
        private static final AtomicReferenceFieldUpdater _affectedNode$FU = AtomicReferenceFieldUpdater.newUpdater(AddLastDesc.class, Object.class, "_affectedNode");
        private volatile Object _affectedNode;
        public final T node;
        public final LockFreeLinkedListNode queue;

        public AddLastDesc(LockFreeLinkedListNode queue, T node) {
            m.e(queue, "queue");
            m.e(node, "node");
            this.queue = queue;
            this.node = node;
            if (node._next != node || node._prev != node) {
                throw new IllegalStateException("Check failed.");
            }
            this._affectedNode = null;
        }

        @Override
        public void finishOnSuccess(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            m.e(affected, "affected");
            m.e(next, "next");
            this.node.finishAdd(this.queue);
        }

        @Override
        public final LockFreeLinkedListNode getThis$0() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override
        public final LockFreeLinkedListNode getQueue() {
            return this.queue;
        }

        @Override
        public Object onPrepare(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            m.e(affected, "affected");
            m.e(next, "next");
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _affectedNode$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, affected) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            return null;
        }

        @Override
        public boolean retry(LockFreeLinkedListNode affected, Object next) {
            m.e(affected, "affected");
            m.e(next, "next");
            return next != this.queue;
        }

        @Override
        public final LockFreeLinkedListNode takeAffectedNode(OpDescriptor op) {
            LockFreeLinkedListNode lockFreeLinkedListNode;
            m.e(op, "op");
            while (true) {
                Object obj = this.queue._prev;
                m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                Object obj2 = lockFreeLinkedListNode._next;
                LockFreeLinkedListNode lockFreeLinkedListNode2 = this.queue;
                if (obj2 == lockFreeLinkedListNode2 || obj2 == op) {
                    break;
                }
                if (obj2 instanceof OpDescriptor) {
                    ((OpDescriptor) obj2).perform(lockFreeLinkedListNode);
                } else {
                    LockFreeLinkedListNode lockFreeLinkedListNodeCorrectPrev = lockFreeLinkedListNode2.correctPrev(lockFreeLinkedListNode, op);
                    if (lockFreeLinkedListNodeCorrectPrev != null) {
                        return lockFreeLinkedListNodeCorrectPrev;
                    }
                }
            }
            return lockFreeLinkedListNode;
        }

        @Override
        public Object updatedNext(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            m.e(affected, "affected");
            m.e(next, "next");
            T t9 = this.node;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(t9, t9, affected) && atomicReferenceFieldUpdater.get(t9) == t9) {
            }
            T t10 = this.node;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode._next$FU;
            LockFreeLinkedListNode lockFreeLinkedListNode = this.queue;
            while (!atomicReferenceFieldUpdater2.compareAndSet(t10, t10, lockFreeLinkedListNode) && atomicReferenceFieldUpdater2.get(t10) == t10) {
            }
            return this.node;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001e\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "newNode", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "affected", "", "failure", "Lh6/A;", "complete", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)V", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "oldNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class CondAddOp extends AtomicOp<LockFreeLinkedListNode> {
        public final LockFreeLinkedListNode newNode;
        public LockFreeLinkedListNode oldNext;

        public CondAddOp(LockFreeLinkedListNode newNode) {
            m.e(newNode, "newNode");
            this.newNode = newNode;
        }

        @Override
        public void complete(LockFreeLinkedListNode affected, Object failure) {
            m.e(affected, "affected");
            boolean z6 = failure == null;
            LockFreeLinkedListNode lockFreeLinkedListNode = z6 ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode._next$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(affected, this, lockFreeLinkedListNode)) {
                    if (atomicReferenceFieldUpdater.get(affected) != this) {
                        return;
                    }
                }
                if (z6) {
                    LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                    LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                    m.b(lockFreeLinkedListNode3);
                    lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
                }
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00122\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001b\u001a\u00020\u001a2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0017\u0010\"\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010'\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006("}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "queue", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", LinkHeader.Rel.Next, "failure", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;", "node", "", "validatePrepared", "(Ljava/lang/Object;)Z", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "Lh6/A;", "finishOnSuccess", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static class RemoveFirstDesc<T> extends AbstractAtomicDesc {
        private static final AtomicReferenceFieldUpdater _affectedNode$FU = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_affectedNode");
        private static final AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(RemoveFirstDesc.class, Object.class, "_originalNext");
        private volatile Object _affectedNode;
        private volatile Object _originalNext;
        public final LockFreeLinkedListNode queue;

        public RemoveFirstDesc(LockFreeLinkedListNode queue) {
            m.e(queue, "queue");
            this.queue = queue;
            this._affectedNode = null;
            this._originalNext = null;
        }

        public static void getResult$annotations() {
        }

        @Override
        public Object failure(LockFreeLinkedListNode affected, Object next) {
            m.e(affected, "affected");
            m.e(next, "next");
            if (affected == this.queue) {
                return LockFreeLinkedListKt.getLIST_EMPTY();
            }
            return null;
        }

        @Override
        public final void finishOnSuccess(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            m.e(affected, "affected");
            m.e(next, "next");
            affected.finishRemove(next);
        }

        @Override
        public final LockFreeLinkedListNode getThis$0() {
            return (LockFreeLinkedListNode) this._affectedNode;
        }

        @Override
        public final LockFreeLinkedListNode getQueue() {
            return (LockFreeLinkedListNode) this._originalNext;
        }

        public final T getResult() {
            T t9 = (T) getThis$0();
            m.b(t9);
            return t9;
        }

        @Override
        public final Object onPrepare(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            m.e(affected, "affected");
            m.e(next, "next");
            if (affected instanceof LockFreeLinkedListHead) {
                throw new IllegalStateException("Check failed.");
            }
            if (!validatePrepared(affected)) {
                return LockFreeLinkedListKt.REMOVE_PREPARED;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _affectedNode$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, affected) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _originalNext$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, next) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
            return null;
        }

        @Override
        public final boolean retry(LockFreeLinkedListNode affected, Object next) {
            m.e(affected, "affected");
            m.e(next, "next");
            if (!(next instanceof Removed)) {
                return false;
            }
            affected.helpDelete();
            return true;
        }

        @Override
        public final LockFreeLinkedListNode takeAffectedNode(OpDescriptor op) {
            m.e(op, "op");
            Object next = this.queue.getNext();
            m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            return (LockFreeLinkedListNode) next;
        }

        @Override
        public final Object updatedNext(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
            m.e(affected, "affected");
            m.e(next, "next");
            return next.removed();
        }

        public boolean validatePrepared(T node) {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"io/ktor/util/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "affected", "", "prepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 176)
    public static final class C24401 extends CondAddOp {
        final Function0 $condition;

        public C24401(LockFreeLinkedListNode lockFreeLinkedListNode, Function0 function0) {
            super(lockFreeLinkedListNode);
            this.$condition = function0;
        }

        @Override
        public Object prepare(LockFreeLinkedListNode affected) {
            m.e(affected, "affected");
            if (((Boolean) this.$condition.invoke()).booleanValue()) {
                return null;
            }
            return LockFreeLinkedListKt.getCONDITION_FALSE();
        }
    }

    public final LockFreeLinkedListNode correctPrev(LockFreeLinkedListNode _prev, OpDescriptor op) {
        Object obj;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode = null;
            while (true) {
                obj = _prev._next;
                if (obj == op) {
                    return _prev;
                }
                if (obj instanceof OpDescriptor) {
                    ((OpDescriptor) obj).perform(_prev);
                } else if (!(obj instanceof Removed)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof Removed) {
                        return null;
                    }
                    if (obj != this) {
                        m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        lockFreeLinkedListNode = _prev;
                        _prev = (LockFreeLinkedListNode) obj;
                    } else {
                        if (obj2 == _prev) {
                            return null;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, _prev)) {
                                if (_prev._prev instanceof Removed) {
                                    break;
                                }
                                return null;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj2);
                    }
                } else {
                    if (lockFreeLinkedListNode != null) {
                        break;
                    }
                    _prev = LockFreeLinkedListKt.unwrap(_prev._prev);
                }
            }
            _prev.markPrev();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _next$FU;
            LockFreeLinkedListNode lockFreeLinkedListNode2 = ((Removed) obj).ref;
            while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, _prev, lockFreeLinkedListNode2) && atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) == _prev) {
            }
            _prev = lockFreeLinkedListNode;
        }
    }

    private final LockFreeLinkedListNode findHead() {
        LockFreeLinkedListNode nextNode = this;
        while (!(nextNode instanceof LockFreeLinkedListHead)) {
            nextNode = nextNode.getNextNode();
            if (nextNode == this) {
                throw new IllegalStateException("Cannot loop to this while looking for list head");
            }
        }
        return nextNode;
    }

    public final void finishAdd(LockFreeLinkedListNode next) {
        while (true) {
            Object obj = next._prev;
            if ((obj instanceof Removed) || getNext() != next) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(next, obj, this)) {
                    if (getNext() instanceof Removed) {
                        m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        next.correctPrev((LockFreeLinkedListNode) obj, null);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(next) == obj);
        }
    }

    public final void finishRemove(LockFreeLinkedListNode next) {
        helpDelete();
        next.correctPrev(LockFreeLinkedListKt.unwrap(this._prev), null);
    }

    private final LockFreeLinkedListNode markPrev() {
        LockFreeLinkedListNode lockFreeLinkedListNodeFindHead;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return ((Removed) obj).ref;
            }
            if (obj == this) {
                lockFreeLinkedListNodeFindHead = findHead();
            } else {
                m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                lockFreeLinkedListNodeFindHead = (LockFreeLinkedListNode) obj;
            }
            Removed removed = lockFreeLinkedListNodeFindHead.removed();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return (LockFreeLinkedListNode) obj;
        }
    }

    public final Removed removed() {
        Removed removed = (Removed) this.removedRef;
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        removedRef$FU.lazySet(this, removed2);
        return removed2;
    }

    public final void addLast(LockFreeLinkedListNode node) {
        Object prev;
        m.e(node, "node");
        do {
            prev = getPrev();
            m.c(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        } while (!((LockFreeLinkedListNode) prev).addNext(node, this));
    }

    public final boolean addLastIf(LockFreeLinkedListNode node, Function0 condition) {
        int iTryCondAddNext;
        m.e(node, "node");
        m.e(condition, "condition");
        C24401 c24401 = new C24401(node, condition);
        do {
            Object prev = getPrev();
            m.c(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            iTryCondAddNext = ((LockFreeLinkedListNode) prev).tryCondAddNext(node, this, c24401);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addLastIfPrev(LockFreeLinkedListNode node, j predicate) {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        m.e(node, "node");
        m.e(predicate, "predicate");
        do {
            Object prev = getPrev();
            m.c(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (LockFreeLinkedListNode) prev;
            if (!((Boolean) predicate.invoke(lockFreeLinkedListNode)).booleanValue()) {
                return false;
            }
        } while (!lockFreeLinkedListNode.addNext(node, this));
        return true;
    }

    public final boolean addLastIfPrevAndIf(LockFreeLinkedListNode node, j predicate, Function0 condition) {
        int iTryCondAddNext;
        m.e(node, "node");
        m.e(predicate, "predicate");
        m.e(condition, "condition");
        C24401 c24401 = new C24401(node, condition);
        do {
            Object prev = getPrev();
            m.c(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) prev;
            if (!((Boolean) predicate.invoke(lockFreeLinkedListNode)).booleanValue()) {
                return false;
            }
            iTryCondAddNext = lockFreeLinkedListNode.tryCondAddNext(node, this, c24401);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addNext(LockFreeLinkedListNode node, LockFreeLinkedListNode next) {
        m.e(node, "node");
        m.e(next, "next");
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, next, node)) {
            if (atomicReferenceFieldUpdater.get(this) != next) {
                return false;
            }
        }
        node.finishAdd(next);
        return true;
    }

    public final boolean addOneIfEmpty(LockFreeLinkedListNode node) {
        m.e(node, "node");
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        while (getNext() == this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, this, node)) {
                    node.finishAdd(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == this);
        }
        return false;
    }

    public final <T extends LockFreeLinkedListNode> AddLastDesc<T> describeAddLast(T node) {
        m.e(node, "node");
        return new AddLastDesc<>(this, node);
    }

    public AtomicDesc describeRemove() {
        if (isRemoved()) {
            return null;
        }
        return new AbstractAtomicDesc() {
            private static final AtomicReferenceFieldUpdater _originalNext$FU = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass1.class, Object.class, "_originalNext");
            private volatile Object _originalNext = null;

            @Override
            public Object failure(LockFreeLinkedListNode affected, Object next) {
                m.e(affected, "affected");
                m.e(next, "next");
                if (next instanceof Removed) {
                    return LockFreeLinkedListKt.getALREADY_REMOVED();
                }
                return null;
            }

            @Override
            public void finishOnSuccess(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
                m.e(affected, "affected");
                m.e(next, "next");
                LockFreeLinkedListNode.this.finishRemove(next);
            }

            @Override
            public LockFreeLinkedListNode getThis$0() {
                return LockFreeLinkedListNode.this;
            }

            @Override
            public LockFreeLinkedListNode getQueue() {
                return (LockFreeLinkedListNode) this._originalNext;
            }

            @Override
            public Object onPrepare(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
                m.e(affected, "affected");
                m.e(next, "next");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _originalNext$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, next) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                return null;
            }

            @Override
            public Removed updatedNext(LockFreeLinkedListNode affected, LockFreeLinkedListNode next) {
                m.e(affected, "affected");
                m.e(next, "next");
                return next.removed();
            }
        };
    }

    public final RemoveFirstDesc<LockFreeLinkedListNode> describeRemoveFirst() {
        return new RemoveFirstDesc<>(this);
    }

    public final Object getNext() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).perform(this);
        }
    }

    public final LockFreeLinkedListNode getNextNode() {
        return LockFreeLinkedListKt.unwrap(getNext());
    }

    public final Object getPrev() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof Removed) {
                return obj;
            }
            m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
            if (lockFreeLinkedListNode.getNext() == this) {
                return obj;
            }
            correctPrev(lockFreeLinkedListNode, null);
        }
    }

    public final LockFreeLinkedListNode getPrevNode() {
        return LockFreeLinkedListKt.unwrap(getPrev());
    }

    public final void helpDelete() {
        Object next;
        LockFreeLinkedListNode lockFreeLinkedListNodeMarkPrev = markPrev();
        Object obj = this._next;
        m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        LockFreeLinkedListNode lockFreeLinkedListNode = ((Removed) obj).ref;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = null;
            while (true) {
                Object next2 = lockFreeLinkedListNode.getNext();
                if (next2 instanceof Removed) {
                    lockFreeLinkedListNode.markPrev();
                    lockFreeLinkedListNode = ((Removed) next2).ref;
                } else {
                    next = lockFreeLinkedListNodeMarkPrev.getNext();
                    if (next instanceof Removed) {
                        if (lockFreeLinkedListNode2 != null) {
                            break;
                        } else {
                            lockFreeLinkedListNodeMarkPrev = LockFreeLinkedListKt.unwrap(lockFreeLinkedListNodeMarkPrev._prev);
                        }
                    } else if (next == this) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
                        while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNodeMarkPrev, this, lockFreeLinkedListNode)) {
                            if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeMarkPrev) != this) {
                            }
                        }
                        return;
                    } else {
                        m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        LockFreeLinkedListNode lockFreeLinkedListNode3 = (LockFreeLinkedListNode) next;
                        if (lockFreeLinkedListNode3 == lockFreeLinkedListNode) {
                            return;
                        }
                        lockFreeLinkedListNode2 = lockFreeLinkedListNodeMarkPrev;
                        lockFreeLinkedListNodeMarkPrev = lockFreeLinkedListNode3;
                    }
                }
            }
            lockFreeLinkedListNodeMarkPrev.markPrev();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _next$FU;
            LockFreeLinkedListNode lockFreeLinkedListNode4 = ((Removed) next).ref;
            while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode2, lockFreeLinkedListNodeMarkPrev, lockFreeLinkedListNode4) && atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode2) == lockFreeLinkedListNodeMarkPrev) {
            }
            lockFreeLinkedListNodeMarkPrev = lockFreeLinkedListNode2;
        }
    }

    public final void helpRemove() {
        Object next = getNext();
        Removed removed = next instanceof Removed ? (Removed) next : null;
        if (removed == null) {
            throw new IllegalStateException("Must be invoked on a removed node");
        }
        finishRemove(removed.ref);
    }

    public final boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    public final CondAddOp makeCondAddOp(LockFreeLinkedListNode node, Function0 condition) {
        m.e(node, "node");
        m.e(condition, "condition");
        return new C24401(node, condition);
    }

    public boolean remove() {
        while (true) {
            Object next = getNext();
            if ((next instanceof Removed) || next == this) {
                return false;
            }
            m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            Removed removed = lockFreeLinkedListNode.removed();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, next, removed)) {
                    finishRemove(lockFreeLinkedListNode);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == next);
        }
    }

    public final <T> T removeFirstIfIsInstanceOf() {
        Object next = getNext();
        m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        if (((LockFreeLinkedListNode) next) == this) {
            return null;
        }
        m.j();
        throw null;
    }

    public final <T> T removeFirstIfIsInstanceOfOrPeekIf(j predicate) {
        m.e(predicate, "predicate");
        Object next = getNext();
        m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        if (((LockFreeLinkedListNode) next) == this) {
            return null;
        }
        m.j();
        throw null;
    }

    public final LockFreeLinkedListNode removeFirstOrNull() {
        while (true) {
            Object next = getNext();
            m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    public String toString() {
        return B.f24540a.b(getClass()).h() + '@' + hashCode();
    }

    public final int tryCondAddNext(LockFreeLinkedListNode node, LockFreeLinkedListNode next, CondAddOp condAdd) {
        m.e(node, "node");
        m.e(next, "next");
        m.e(condAdd, "condAdd");
        _prev$FU.lazySet(node, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, next, condAdd)) {
            if (atomicReferenceFieldUpdater.get(this) != next) {
                return 0;
            }
        }
        return condAdd.perform(this) == null ? 1 : 2;
    }

    public final void validateNode$ktor_utils(LockFreeLinkedListNode prev, LockFreeLinkedListNode next) {
        m.e(prev, "prev");
        m.e(next, "next");
        if (prev != this._prev) {
            throw new IllegalStateException("Check failed.");
        }
        if (next != this._next) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
