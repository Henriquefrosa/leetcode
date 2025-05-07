import java.util.ArrayList;

import static java.lang.Character.getNumericValue;

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
        System.out.println("Soma = " + (num1+num0));
        ListNode resultado1 = criar(String.valueOf(num1+num0));
        for(int i = 0; i < 1000; i ++) {
            System.out.println("Valor do ListNode: " + resultado1.val);
            if(resultado1.next == null){
                break;
            }
            resultado1 = resultado1.next;
        }

    }

    public String inverterString(String teste){
        String aux = "";
        for(int i = (teste.length()-1); i >= 0; i--){
            aux += teste.charAt(i);
        }
        return aux;
    }

    public ListNode criar(String teste){
        ArrayList<ListNode> result = new ArrayList<ListNode>();
        char t = teste.charAt(teste.length()-1);
        result.add(new ListNode(Character.getNumericValue(t)));
        for(int i = teste.length() - 2; i >= 0; i--){
            char a = teste.charAt(i);
            result.add( new ListNode(Character.getNumericValue(a), result.get((teste.length() - (i) - 2))));
        }
        return result.get(teste.length()-1);
    }
}