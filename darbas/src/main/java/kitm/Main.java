package kitm;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static boolean CheckIfPalindrome(String word)
    {
        LinkedList<Character> newWord = new LinkedList<>();

        for (int i = 0; i < word.length(); i++)
        {
            newWord.push(word.charAt(i));
        }

        for (int i = 0; i < newWord.size(); i++)
        {
            if(!newWord.get(i).equals(word.charAt(i)))
            {
                return false;

            }
        }

        return true;
    }

    public static boolean isBalanced(String expression)
    {
        Deque<Character> ex = new LinkedList<>();

        for (int i = 0; i < expression.length(); i++)
        {
            ex.push(expression.charAt(i));
        }

        System.out.println(ex);

        while(!ex.isEmpty())
        {
            if (ex.getFirst().equals(')') && ex.getLast().equals('('))
            {
                ex.removeFirst();
                ex.removeLast();
            }
            else
            {
                return false;
            }
        }


        return true;
    }

    public static LinkedList<Integer> reverseStack(LinkedList<Integer> list)
    {
        LinkedList<Integer> newList = new LinkedList<>();

        while(!list.isEmpty())
        {
            newList.push(list.pop());
        }

        return newList;
    }

    public static void main(String[] args) {
        //LinkedList<String> students = new LinkedList<>();

//        var students = new LinkedList<>();
//
//        Deque<String> animals = new LinkedList<>();
//
//        LinkedList<String> users = new LinkedList<>();
//
//
//        // add elements
//        students.add("Jonas");
//        students.add("Karolis");
//        students.add("Ieva");

//        // access element
//        System.out.println("studentas: " + students.get(2));
//
//        // Queue methods
//
//        // access first element
//        System.out.println(students.peek());
//
//        // access first and remove first
//        System.out.println(students.poll());
//
//        System.out.println(students);
//
//        // add element at end
//        students.offer("Karolina");
//
//        System.out.println(students);
//
//        // Deque
//
//        animals.add("Dog");
//        animals.addFirst("Cat");
//        animals.addLast("Snake");
//
//        animals.removeFirst();
//        animals.removeLast();
//
//        System.out.println(animals);
//
//        //Stack
//
//        users.add("student");
//        users.push("teacher");
//        users.push("teacher 2");
//        users.push("teacher 3");
//        users.push("teacher 4");
//        users.push("teacher 5");
//
//        users.pop();
//
//        System.out.println(users);

        System.out.println("Is palindrome: " + CheckIfPalindrome("racecar"));
        System.out.println("Is balanced : " + isBalanced("(()"));

        QueueUsingTwoStacks que = new QueueUsingTwoStacks();

        que.enqeue("word 1");
        que.enqeue("word 2");
        que.enqeue("word 3");
        que.enqeue("word 4");
        que.enqeue("word 5");
        que.enqeue("word 6");

        System.out.println(que.dequeue());

        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));



        System.out.println(reverseStack(numbers));



    }
}