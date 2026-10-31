/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node res = new Node(0);
        Node prev = res;
        Node resLoop;
        Node loop = head;
        Map<Node, Node> map = new HashMap<>();
        while (loop != null) {
            resLoop = new Node(loop.val);
            prev.next = resLoop;
            map.put(loop, resLoop);

            loop = loop.next;
            prev = resLoop;
        }

        loop = head;
        Node loopCopy = res.next;
        while (loop != null) {
            loopCopy.random = map.get(loop.random);
            loop = loop.next;
            loopCopy = loopCopy.next;
        }

        return res.next;
    }
}
