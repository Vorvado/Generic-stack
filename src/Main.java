public class Main {
    public static void main() {
        GenericStack<String> stringstack = new GenericStack(15);
        GenericStack<Integer> intstack = new GenericStack(2);

        stringstack.push("Peter");
        stringstack.push("Fisch");
        stringstack.push("Dienstleistung");
        System.out.println(stringstack.pop());
        System.out.println(stringstack.peek());
        System.out.println(stringstack.pop());
        System.out.println(stringstack.pop());
        try {
            System.out.println(stringstack.pop()); // throws an error as there are no more entries
        } catch (StackEmptyException e) {
            System.out.println(e);
        }

        intstack.push(15);
        intstack.push(32);
        System.out.println(intstack.pop());
        System.out.println(intstack.pop());
        try {
            System.out.println(intstack.pop()); // error. Same as above
        } catch (StackEmptyException e) {
            System.out.println(e);
        }
        intstack.push(15);
        intstack.push(15);
        try {
            intstack.push(15);  // throws an errer as there is no more space in the array
        } catch (StackFullException e) {
            System.out.println(e);
        }
        System.out.println(intstack.list());
}
}