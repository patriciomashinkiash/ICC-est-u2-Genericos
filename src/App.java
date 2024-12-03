import models.Persona;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {

        /*Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();
        cajaString.guardar("guardar un string");
        cajaInteger.guardar(10);
        // Crear una instancia de Persona y guardarla
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(30);
        cajaPersona.guardar(persona);

        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener()); // Aquí se imprime el objeto Persona

        //   Par<String, Integer> par = new Par<>();*/
        
        //10 personas

        Persona[] personas = new Persona[10];
        
        personas[0] = new Persona(12, "Juan");
        personas[1] = new Persona(32, "Ana");
        personas[2] = new Persona(18, "Carlos");
        personas[3] = new Persona(92, "Maria");
        personas[4] = new Persona(10, "Pedro");
        personas[5] = new Persona(11, "Lucia");
        personas[6] = new Persona(25, "Luis");
        personas[7] = new Persona(24, "Sofia");
        personas[8] = new Persona(31, "Raul");
        personas[9] = new Persona(26, "Marta");

        for(Persona persona : personas ) {
            System.out.println(persona);
        }

        Par<String, Integer>[] mayoresDeEdad = new Par[10];
        Par<Integer, String>[] menoresDeEdad = new Par[10];

        int indexMayores = 0;
        int indexMenores = 0;

        for(Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                mayoresDeEdad[indexMayores] = new Par<>(persona.getNombre(), persona.getEdad());
                indexMayores++;
            }else {
                menoresDeEdad[indexMenores] = new Par<>(persona.getEdad(), persona.getNombre());
                indexMenores++;
            }
        }

        System.out.println("----------------------");
        System.out.println("MAYORES DE EDAD");

        for(int i = 0; i < indexMayores; i++) {
            System.out.println("Mayores de Edad: " + mayoresDeEdad[i]);
        }

        System.out.println("----------------------");
        System.out.println("MENORES DE EDAD");

        for(int i = 0; i < indexMenores; i++) {
            System.out.println("Menores de Edad: " + menoresDeEdad[i]);
        }
    }
}
