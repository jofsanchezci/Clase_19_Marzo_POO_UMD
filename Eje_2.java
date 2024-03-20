public class Eje_2 {
  static void metodo_mp(String fname, int edad) {
    System.out.println(fname + " tiene " + edad + " Años");
  }

    static void suma(int x, int y) {
      int c = x+y; 
    System.out.println("La suma es: " + c);
  }


  public static void main(String[] args) {
    metodo_mp("Luis", 5);
    metodo_mp("Juan", 8);
    metodo_mp("Ana", 31);
    suma(1,2);

  }
}