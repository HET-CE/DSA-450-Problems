import java.util.ListIterator;
import java.util.Stack;

// public class Program_15_Sort_a_Stack_using_recursion {
//     static void sortedInsert(Stack<Integer> s, int x)
//     {
//         if (s.isEmpty() || x > s.peek())
//         {
//             s.push(x);
//             return;
//         }

//         int temp = s.pop();
//         sortedInsert(s, x);

//         s.push(temp);
//     }

//     static void sortStack(Stack<Integer> s)
//     {
//         if (!s.isEmpty())
//         {
//             int x = s.pop();

//             sortStack(s);

//             sortedInsert(s, x);
//         }
//     }

//     static void printStack(Stack<Integer> s)
//     {
//         ListIterator<Integer> lt = s.listIterator();

//         while (lt.hasNext())
//             lt.next();

//         while (lt.hasPrevious())
//             System.out.print(lt.previous() + " ");
//     }

//     public static void main(String[] args)
//     {
//         Stack<Integer> s = new Stack<>();
//         s.push(30);
//         s.push(-5);
//         s.push(18);
//         s.push(14);
//         s.push(-3);

//         System.out.println(
//             "Stack elements before sorting: ");
//         printStack(s);

//         sortStack(s);

//         System.out.println(
//             " \n\nStack elements after sorting:");
//         printStack(s);
//     }
// }

public class Program_15_Sort_a_Stack_using_recursion {

    public static Stack<Integer> sortstack(Stack<Integer> input) {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!input.isEmpty()) {
            int tmp = input.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
                input.push(tmpStack.pop());
            }
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String args[]) {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        Stack<Integer> tmpStack = sortstack(input);
        System.out.println("Sorted numbers are:");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.pop() + " ");
        }
    }
}