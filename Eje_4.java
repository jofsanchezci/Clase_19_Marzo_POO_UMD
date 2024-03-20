public class Eje_4 {

  // crea un metodo que recibe como parametro un enteror
  static void revisa_edad(int age) {

    // Si la edad es menor a 18 escribe Acceso denegado
    if (age < 18) {
      System.out.println("Acceso denegado - No tiene la edad Suficiente");

    // Si es mayor escribe Acceso garantinzado"
    } else {
      System.out.println("Acceso Garantizado - Si tiene la edad Suficiente");
    }

  }

  public static void main(String[] args) {
    revisa_edad(15); // llamar el métodos revisa_edad
  }
}