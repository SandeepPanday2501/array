public class Main {
    public static void main(String[] args) {

        String[] games ={"Resident evil", "GTA", "God of war"};
        int[] numbers ={25, 35, 45};


        games[0] = "Gamers";
        numbers[1] = 200;


        for (String element : games){
            System.out.println(element);

        }
        System.out.println(games[0]);
        System.out.println(numbers[1]);
    }
}