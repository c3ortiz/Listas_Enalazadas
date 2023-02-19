package org.asignacion.lista;

public class PruebaLista {
    public static void main(String[] args) {
        ListaSimpleEnlazada sll = new ListaSimpleEnlazada();
        sll.AddBack(1);
        sll.AddBack(2);
        sll.AddBack(3);
        sll.AddBack(4);

        int val = sll.removeBack();
        System.out.println(val);
    }
}

