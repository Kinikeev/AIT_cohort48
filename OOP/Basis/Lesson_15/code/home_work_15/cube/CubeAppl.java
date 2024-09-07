package home_work_15.cube;
    /*
      Задача 2. Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
                Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

      Task 2.  Create a CubeAppl application in which to create several instances of the Cube class.
               For each instance, call the methods of the Cube class and calculate p, s and v.
     */
public class CubeAppl {
        public static void main(String[] args) {
            // creating objects
            Cube cube_1 = new Cube(2);
            Cube cube_2 = new Cube(3);
            Cube cube_3 = new Cube(5);

            cube_1.display();
            System.out.println("-----------------------");
            cube_2.display();
            System.out.println("-----------------------");
            cube_3.display();
            System.out.println("=======================");

            int p_1 = cube_1.perimeter();
            int s_1 = cube_1.area();
            int v_1 = cube_1.volume();

            int p_2 = cube_2.perimeter();
            int s_2 = cube_2.area();
            int v_2 = cube_2.volume();

            int p_3 = cube_3.perimeter();
            int s_3 = cube_3.area();
            int v_3 = cube_3.volume();

        } // End of main

} // End of class
