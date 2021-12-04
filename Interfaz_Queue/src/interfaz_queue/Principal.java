package interfaz_queue;
//importar libreria Iterator y LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
//implementacion de libreria queue, interfaz para coleccion de genericos
import java.util.Queue;

/**
 * Ingenieria en Sistemas Computacionales 
 * implementacion de una cola con Queue
 *
 * @author Arnol Jesus Cruz Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    //Metodo Principal 
    public static void main(String[] args) {
        //implementamos estructura Queue
        // queue<tipo de dato> nombre = new ();
        Queue<String> alumno = new LinkedList<>();
        //agregamos elementos con el metodo .add en la estructura cola
        alumno.add("Arnol_Jesus");
        alumno.add("Jesus_Arnol");
        alumno.add("Cruz_Ortiz_Arnol_Jesus");
        alumno.add("Ortiz_Cruz_Jesus_Arnol");
        alumno.add("Jesus_Cruz");
        //imprimimos la estructura cola con el metodo .size (tamaño).
        System.out.println("tamaño cola: " + alumno.size());
        //imprimimos primer datos Queue(el primero en entrar, primero en salir).
        //con el metodo .peek();
        System.out.println("primer elemento: " + alumno.peek());
        //indicamos primer elemento a quitar de la cola con el metodo .remove();
        //Metodo .remove(); optiene el elemento y lo remueve
        String Arnol_Jesus = alumno.remove();
        //imprimimos el primer elemento 
        System.out.println("primer elemento extraido: " + Arnol_Jesus);
        //imprimir tamaño de la cola (.size();) 
        System.out.println("tamaño cola: " + alumno.size());
        //insertamos un dato iterador 
        //Sintaxis, Iterator<tipo de la estructura> elementos = estructura_Queue.iterator();
        Iterator<String> element = alumno.iterator();
        //le agregamos un titulo \n salto de linea adicional
        System.out.println("\nIteracion de la cola: ");
        //usamos el ciclo while para que imprima los datos por 
        while (element.hasNext()) {
            //imprimimos los elementos por entrada 
            System.out.println("elemnto actual: " + element.next());   
        }
    }

}
