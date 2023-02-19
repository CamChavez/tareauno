
public class  tareauno{

   public static void main(String[] args){
        String banda = "Morat";

        System.out.println("Mi banda favorita es " + banda);

        System.out.println("Mi banda tiene " + banda.length() + " letras"); //.length

        String s1 = "Moratvida";
        boolean b1 = s1.isEmpty(); //.isEmpty
        String s2 = "";
        boolean b2 = s2.isEmpty();
        System.out.println("La primera cadena es vacia? " + s1.isEmpty());
        System.out.println("La segunda cadena es vacía? " + s2.isEmpty());

        for (int i=0; i<banda.length(); i++){
           char c = banda.charAt (i); //.charAt
        System.out.println(c);
           }

        if (banda.equals(s1)); //.equals
        System.out.println("Las cadenas son iguales? " + banda.equals(s1));
        String morat = "Morat es religion";

        int p1 = morat.indexOf('o'); //.indexOf
        int p2 = morat.lastIndexOf('o');  //.lastIndexOf
        System.out.println("La primera \"o\" de la frase está en: " + morat.indexOf('o'));
        System.out.println("La ultima \"o\" de la frase está en: " + morat.lastIndexOf('o'));

        System.out.println("convertimos a mayúsculas así: " + morat.toUpperCase()); //.toUpperCase
        System.out.println("CONVERTIMOS A MINUSCULAS ASÍ: " + morat.toLowerCase());  //.toUpperCase

        String i = "Morat tiene cuatro integrantes";
        System.out.println("Se subdivide así: " + i.substring(0,5));  //.substring
        System.out.println("Y así: " + i.substring(6,11));
        System.out.println("Sigueindo así: " + i.substring(12,18));
        System.out.println("Al terminar así; " + i.substring(19,30));

        // Integer
                //enteros
        String numeros = "36912";
        int enteros = Integer.parseInt(numeros);
        String t1 = Integer.toString(enteros);
        System.out.println("Número enteros representados así " + Integer.parseInt(numeros) + " y así " + Integer.toString(enteros));
                //Flotantes
        String numeros2 = "369.12";
        double decimal = Double.parseDouble(numeros2);
        String t2 = Double.toString(decimal);
        System.out.println("Numero decimal representado así: " + Double.parseDouble(numeros2) + " y así: " + Double.toString(decimal));

        //concatecar (unir)
        String u = morat+i;
        System.out.println("Las cadenas se unen así " + morat+i);

        //Invariza
        String uno = "No se va";
        uno = "Debi suponerlo";
        System.out.println(uno);
        System.out.println(uno+= ", no se va");

                //append
        StringBuilder sb = new StringBuilder();
        sb.append("Besos en guerra y ");
        sb.append(" mi vida entera, son de mis canciones favoritas");
        System.out.println(sb);

                //setCharAt
        StringBuilder sbb = new StringBuilder("Hola");
        sbb.setCharAt(3,'i');
        System.out.println(sbb);


        }
}
