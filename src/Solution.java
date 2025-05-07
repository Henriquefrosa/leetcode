import java.util.ArrayList;

class Solution {
    //ListNode
    public void addTwoNumbers(ListNode l1, ListNode l2) {
        String[] numeros = new String[2];
        String teste = "fewfwefwefsd";
        String resultado = new String();
        numeros[0] = "";
        numeros[1] = "";
        int num1;
        int num0;
        ArrayList<ListNode> teste2 = new ArrayList<>();

        while(true){
            numeros[0] += String.valueOf(l1.val);
            if(l1.next == null){
                break;
            }
            l1 = l1.next;
        }
        while( true){
            numeros[1] += String.valueOf(l2.val);

            if(l2.next == null){
                break;
            }
            l2 = l2.next;
        }
        numeros[0] = inverterString(numeros[0]);
        numeros[1] = inverterString(numeros[1]);

        System.out.println(numeros[0] + " " + numeros[1]);
        num1 = Integer.parseInt(numeros[0]);
        num0 = Integer.parseInt(numeros[1]);



    }

    public String inverterString(String teste){
        String aux = "";
        for(int i = (teste.length()-1); i >= 0; i--){
            aux += teste.charAt(i);
        }
        return aux;
    }

    public ListNode criar(String teste){
        for(int i = teste.length() - 1; i >= 0; i--){

        }
        return new ListNode(9);
    }
}