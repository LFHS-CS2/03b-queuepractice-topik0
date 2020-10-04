import java.util.*;
/**
 * @author Daniel
 */

class Main {
	public static void main(String[] args) {
		TestMain.main(null);
	}

	/**
	 * Reorders a queue of integers
	 */
	public static void reorder(Queue<Integer> q) {
		Stack<Integer> stk = new Stack<Integer>();
		int size = 0;
		for (; !q.isEmpty(); size++)
			stk.push(q.poll());
		while (!stk.isEmpty())
			q.add(stk.pop());
		for (int i = 0; i < size; i++) {
			if (q.peek() > -1)
				stk.push(q.poll());
			else
				q.add(q.poll());
		}
		while (stk.size() > 0)
			q.add(stk.pop());
	}

}
