public class Main {
    public static void main(String Args[]){
        ListNode teste = new ListNode(9);
        ListNode teste2 = new ListNode(8,teste);
        ListNode teste3 = new ListNode(7,teste2);
        ListNode teste11 = new ListNode(5);
        ListNode teste12 = new ListNode(4,teste11);
        ListNode teste13 = new ListNode(3,teste12);
        Solution test = new Solution();
        test.addTwoNumbers(teste13,teste3);

    }
}
