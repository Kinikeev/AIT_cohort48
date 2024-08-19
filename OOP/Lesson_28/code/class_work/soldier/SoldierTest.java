package class_work.soldier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class SoldierTest {

    Soldier[] soldiers;

    @BeforeEach
    void setUp() {

        soldiers = new Soldier[]{
                new Soldier("John",182,82.3,91),
                new Soldier("Peter",175,77.1,75),
                new Soldier("Robin",162,55.1,91),
                new Soldier("Mary",159,55.1,91),
                new Soldier("Ann",162,55,88),
        };
    }

    @Test
    void testSoldiersNaturalOrder(){
        printArray(soldiers);
        Arrays.sort(soldiers);
        //System.out.println(Arrays.toString(soldiers));
        printArray(soldiers);
    }

    @Test
    void testSortSoldiersByName(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        printArray(soldiers);
    }

    @Test
    void testSortSoldiersByProfile(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> -(s1.getProfile() - s2.getProfile()));
        printArray(soldiers);
    }

    @Test
    void testSortSoldiersByProfileAndHeight(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = -(s1.getProfile() - s2.getProfile()); // sort by profile
            return res != 0 ? res : -(s1.getHeight() - s2.getHeight());
        });
        printArray(soldiers);
    }
    @Test
    void testSortSoldiersByWight(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> Double.compare(s1.getWeight(),s2.getWeight()));
        printArray(soldiers);

        Comparator<Soldier> comparatorByWightAndName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                int res = Double.compare(o1.getWeight(),o2.getWeight());
                return res != 0 ? res : o1.getName().compareTo(o2.getName());
            }
        };
        Arrays.sort(soldiers,comparatorByWightAndName);
        printArray(soldiers);
    }

    @Test
    void testArrayBinarySearch(){

        Arrays.sort(soldiers);
        Comparator<Soldier> comparatorByHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier s1, Soldier s2) {

                return s1.getProfile() - s2.getProfile();
            }
        };
        printArray(soldiers);



        Soldier pattern = new Soldier(null,0,0,70);
        int index = Arrays.binarySearch(soldiers,pattern, (s1,s2) -> s1.getProfile() - s2.getProfile());
        System.out.println(index);
    }

    public void printArray(Soldier[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }


} // End of class